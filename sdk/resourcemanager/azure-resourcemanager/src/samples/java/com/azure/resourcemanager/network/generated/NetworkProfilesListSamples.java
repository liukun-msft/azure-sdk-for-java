// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.util.Context;

/** Samples for NetworkProfiles List. */
public final class NetworkProfilesListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-05-01/examples/NetworkProfileListAll.json
     */
    /**
     * Sample code: List all network profiles.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listAllNetworkProfiles(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks().manager().serviceClient().getNetworkProfiles().list(Context.NONE);
    }
}
