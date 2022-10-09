// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.network.fluent.models.VirtualHubRouteTableV2Inner;
import com.azure.resourcemanager.network.models.VirtualHubRouteV2;
import java.util.Arrays;

/** Samples for VirtualHubRouteTableV2S CreateOrUpdate. */
public final class VirtualHubRouteTableV2SCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-01-01/examples/VirtualHubRouteTableV2Put.json
     */
    /**
     * Sample code: VirtualHubRouteTableV2Put.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void virtualHubRouteTableV2Put(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getVirtualHubRouteTableV2S()
            .createOrUpdate(
                "rg1",
                "virtualHub1",
                "virtualHubRouteTable1a",
                new VirtualHubRouteTableV2Inner()
                    .withRoutes(
                        Arrays
                            .asList(
                                new VirtualHubRouteV2()
                                    .withDestinationType("CIDR")
                                    .withDestinations(Arrays.asList("20.10.0.0/16", "20.20.0.0/16"))
                                    .withNextHopType("IPAddress")
                                    .withNextHops(Arrays.asList("10.0.0.68")),
                                new VirtualHubRouteV2()
                                    .withDestinationType("CIDR")
                                    .withDestinations(Arrays.asList("0.0.0.0/0"))
                                    .withNextHopType("IPAddress")
                                    .withNextHops(Arrays.asList("10.0.0.68"))))
                    .withAttachedConnections(Arrays.asList("All_Vnets")),
                Context.NONE);
    }
}
