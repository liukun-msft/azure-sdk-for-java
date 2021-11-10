// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.eventgrid.models.InboundIpRule;
import com.azure.resourcemanager.eventgrid.models.IpActionType;
import com.azure.resourcemanager.eventgrid.models.PublicNetworkAccess;
import com.azure.resourcemanager.eventgrid.models.Topic;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for Topics Update. */
public final class TopicsUpdateSamples {
    /*
     * x-ms-original-file: specification/eventgrid/resource-manager/Microsoft.EventGrid/stable/2021-12-01/examples/Topics_Update.json
     */
    /**
     * Sample code: Topics_Update.
     *
     * @param manager Entry point to EventGridManager.
     */
    public static void topicsUpdate(com.azure.resourcemanager.eventgrid.EventGridManager manager) {
        Topic resource =
            manager.topics().getByResourceGroupWithResponse("examplerg", "exampletopic1", Context.NONE).getValue();
        resource
            .update()
            .withTags(mapOf("tag1", "value1", "tag2", "value2"))
            .withPublicNetworkAccess(PublicNetworkAccess.ENABLED)
            .withInboundIpRules(
                Arrays
                    .asList(
                        new InboundIpRule().withIpMask("12.18.30.15").withAction(IpActionType.ALLOW),
                        new InboundIpRule().withIpMask("12.18.176.1").withAction(IpActionType.ALLOW)))
            .apply();
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
