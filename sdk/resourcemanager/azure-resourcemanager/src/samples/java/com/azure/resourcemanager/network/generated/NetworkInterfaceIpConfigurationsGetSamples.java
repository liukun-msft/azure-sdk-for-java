// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.util.Context;

/** Samples for NetworkInterfaceIpConfigurations Get. */
public final class NetworkInterfaceIpConfigurationsGetSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-05-01/examples/NetworkInterfaceIPConfigurationGet.json
     */
    /**
     * Sample code: NetworkInterfaceIPConfigurationGet.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void networkInterfaceIPConfigurationGet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getNetworkInterfaceIpConfigurations()
            .getWithResponse("testrg", "mynic", "ipconfig1", Context.NONE);
    }
}
