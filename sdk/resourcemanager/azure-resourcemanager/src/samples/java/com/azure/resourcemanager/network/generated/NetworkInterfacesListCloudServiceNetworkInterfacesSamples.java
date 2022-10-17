// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.util.Context;

/** Samples for NetworkInterfaces ListCloudServiceNetworkInterfaces. */
public final class NetworkInterfacesListCloudServiceNetworkInterfacesSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-05-01/examples/CloudServiceNetworkInterfaceList.json
     */
    /**
     * Sample code: List cloud service network interfaces.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listCloudServiceNetworkInterfaces(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getNetworkInterfaces()
            .listCloudServiceNetworkInterfaces("rg1", "cs1", Context.NONE);
    }
}
