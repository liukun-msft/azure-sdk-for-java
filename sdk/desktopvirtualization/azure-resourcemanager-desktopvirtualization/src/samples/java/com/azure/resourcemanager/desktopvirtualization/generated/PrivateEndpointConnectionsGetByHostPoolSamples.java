// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.generated;

import com.azure.core.util.Context;

/** Samples for PrivateEndpointConnections GetByHostPool. */
public final class PrivateEndpointConnectionsGetByHostPoolSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2021-09-03-preview/examples/PrivateEndpointConnection_GetByHostPool.json
     */
    /**
     * Sample code: PrivateEndpointConnection_GetByHostPool.
     *
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void privateEndpointConnectionGetByHostPool(
        com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager
            .privateEndpointConnections()
            .getByHostPoolWithResponse(
                "resourceGroup1", "hostPool1", "hostPool1.377103f1-5179-4bdf-8556-4cdd3207cc5b", Context.NONE);
    }
}
