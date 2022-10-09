// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

import com.azure.core.util.Context;

/** Samples for ContainerApps GetByResourceGroup. */
public final class ContainerAppsGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2022-03-01/examples/GetContainerApp.json
     */
    /**
     * Sample code: Get Container App.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getContainerApp(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .webApps()
            .manager()
            .serviceClient()
            .getContainerApps()
            .getByResourceGroupWithResponse("rg", "testcontainerApp0", Context.NONE);
    }
}
