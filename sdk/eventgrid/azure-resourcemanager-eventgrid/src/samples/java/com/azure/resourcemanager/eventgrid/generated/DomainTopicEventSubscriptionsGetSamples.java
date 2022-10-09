// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.Context;

/** Samples for DomainTopicEventSubscriptions Get. */
public final class DomainTopicEventSubscriptionsGetSamples {
    /*
     * x-ms-original-file: specification/eventgrid/resource-manager/Microsoft.EventGrid/stable/2022-06-15/examples/DomainTopicEventSubscriptions_Get.json
     */
    /**
     * Sample code: DomainTopicEventSubscriptions_Get.
     *
     * @param manager Entry point to EventGridManager.
     */
    public static void domainTopicEventSubscriptionsGet(com.azure.resourcemanager.eventgrid.EventGridManager manager) {
        manager
            .domainTopicEventSubscriptions()
            .getWithResponse(
                "examplerg", "exampleDomain1", "exampleDomainTopic1", "examplesubscription1", Context.NONE);
    }
}
