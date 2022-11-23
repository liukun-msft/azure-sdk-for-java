// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated;

import com.azure.core.util.Context;

/** Samples for ProviderOperationsMetadata List. */
public final class ProviderOperationsMetadataListSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/stable/2022-04-01/examples/GetAllProviderOperations.json
     */
    /**
     * Sample code: List provider operations metadata for all resource providers.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listProviderOperationsMetadataForAllResourceProviders(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .accessManagement()
            .roleAssignments()
            .manager()
            .roleServiceClient()
            .getProviderOperationsMetadatas()
            .list(null, Context.NONE);
    }
}
