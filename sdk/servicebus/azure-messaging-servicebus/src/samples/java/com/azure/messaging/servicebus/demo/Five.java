// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.servicebus.demo;

import com.azure.messaging.servicebus.ServiceBusClientBuilder;
import com.azure.messaging.servicebus.ServiceBusErrorContext;
import com.azure.messaging.servicebus.ServiceBusProcessorClient;
import com.azure.messaging.servicebus.ServiceBusReceivedMessageContext;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

public class Five {
    private static final String CON_STR = System.getenv("CON_STR");
    private static final String Q_NAME = "queue1";

    // In Four.java we observed that there is a buffer overflow in ReceiveLinkHandler,
    // the reason is, today the credit calculation is not considering the Deliveries
    // buffered in the ReceiveLinkHandler.
    //
    //   For the prototyping purpose, the Five.java consider this buffer when an
    //   environment variable is set, when running Five.java make sure you have
    //   the following setup.
    //
    //  Run-Setup
    //  =========
    //  |--------------------|----------------------------------------------------|
    //  |   Processor Setup: |  .prefetchCount(80)                                |
    //  |                    |  .maxConcurrentCalls(1)                            |
    //  |------------------- |----------------------------------------------------|
    //  |  JVM Option        |  -Dreactor.schedulers.defaultBoundedElasticSize=2  |
    //  |--------------------|----------------------------------------------------|
    //  |   SDK Code tweak   |  One Thread-Hoping must be disabled, ack           |
    //  |                    |  streaming should be enabled, should enable        |
    //  |                    |  credit calculation to use Handler's buffer size   |
    //  |                    |                                                    |
    //  |                    |  PUB_ON_IN_SB_LINK_PROCESSOR_OFF=1                 |
    //  |                    |  STREAM_DISPOSITION_ACKS=1                         |
    //  |                    |  HANDLER_Q_SIZE_FOR_CREDIT=1                       |
    //  |--------------------|----------------------------------------------------|
    //
    //
    //   ReceiveLinkHandler (buffering1a@Sinks.Many for Delivery-Message,buffering1b@Sinks.Many for Delivery-Disposition-Ack ✓)
    //    |     \                           \
    //    |      \ Delivery-Message(s)       \----- Delivery-Disposition-Ack(s)
    //    |       \
    //    |-- ServiceBusReactorReceiver (buffering2@PublishOn ✓)
    //         |    \
    //         |     \ Delivery-Message(s)
    //         |      \
    //         |-- ServiceBusReceiveLinkProcessor (buffering3@PublishOn x)  [Credit calculation includes size of buffering1a]
    //              |  \
    //              |   \ Delivery-Message(s)
    //              |    \
    //              |-- Consumer
    //
    //  Learnings:
    //  ==========
    //      1. The credit calculation should consider buffer size in ReceiveLinkHandler.
    //
    public static void main(String[] args) throws InterruptedException {

        Consumer<ServiceBusReceivedMessageContext> processMessage = messageContext -> {
            try {
                // Sleep 1 second to mock process progress
                TimeUnit.SECONDS.sleep(1);
                System.out.println(Thread.currentThread().getName() + " [begin]: " + messageContext.getMessage().getLockToken());
                messageContext.complete();
                System.out.println(Thread.currentThread().getName() + " [end]: " + messageContext.getMessage().getLockToken());
            } catch (Exception ex) {
                System.out.println("\n\n COMPLETION FAILED:" + ex.getMessage() + " \n\n");
            }
        };

        Consumer<ServiceBusErrorContext> processError = error -> {
            System.out.println("Error: " + error.getException().getMessage());
        };

        ServiceBusProcessorClient processorClient = new ServiceBusClientBuilder()
            .connectionString(CON_STR)
            .processor()
            .queueName(Q_NAME)
            .processMessage(processMessage)
            .processError(processError)
            .prefetchCount(80)
            .maxConcurrentCalls(1) // <---- it doesn't use .parallel+.runOn operators
            .maxAutoLockRenewDuration(Duration.ofSeconds(0))
            .disableAutoComplete()
            .buildProcessorClient();


        processorClient.start();

        TimeUnit.MINUTES.sleep(3 * 60);
        System.out.println("Stopping....");
        processorClient.stop();
    }
}
