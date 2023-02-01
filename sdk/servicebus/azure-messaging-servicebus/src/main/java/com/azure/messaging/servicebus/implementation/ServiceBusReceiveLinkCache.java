package com.azure.messaging.servicebus.implementation;

import com.azure.core.util.logging.ClientLogger;
import reactor.core.Disposable;

import java.util.Map;
import java.util.Objects;

public class ServiceBusReceiveLinkCache implements Disposable {

    private final Object lock = new Object();
    private final ClientLogger logger;
    private volatile boolean terminated;
    private volatile ServiceBusReceiveLink currentLink;

    public ServiceBusReceiveLinkCache(Map<String, Object> loggingContext) {
        this.logger = new ClientLogger(getClass(), Objects.requireNonNull(loggingContext, "'loggingContext' cannot be null."));
    }

    @Override
    public void dispose() {
        final ServiceBusReceiveLink link;
        synchronized (lock) {
            if (terminated) {
                return;
            }
            terminated = true;
            link = this.currentLink;
        }
        if (link != null && !link.isDisposed()) {
            link.closeAsync().subscribe();
        } else {
            logger.info("Terminating the connection recovery support.");
        }
    }

    @Override
    public boolean isDisposed() {
        return terminated;
    }

}
