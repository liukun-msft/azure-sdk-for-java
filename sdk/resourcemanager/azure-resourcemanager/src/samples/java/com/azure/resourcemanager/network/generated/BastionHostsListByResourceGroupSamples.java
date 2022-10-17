// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.util.Context;

/** Samples for BastionHosts ListByResourceGroup. */
public final class BastionHostsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-05-01/examples/BastionHostListByResourceGroup.json
     */
    /**
     * Sample code: List all Bastion Hosts for a given resource group.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listAllBastionHostsForAGivenResourceGroup(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks().manager().serviceClient().getBastionHosts().listByResourceGroup("rg1", Context.NONE);
    }
}
