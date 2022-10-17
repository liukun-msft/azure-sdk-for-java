// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.Context;

/** Samples for NetworkConnections GetHealthDetails. */
public final class NetworkConnectionsGetHealthDetailsSamples {
    /*
     * x-ms-original-file: specification/devcenter/resource-manager/Microsoft.DevCenter/preview/2022-09-01-preview/examples/NetworkConnections_GetHealthDetails.json
     */
    /**
     * Sample code: NetworkConnections_GetHealthDetails.
     *
     * @param manager Entry point to DevCenterManager.
     */
    public static void networkConnectionsGetHealthDetails(
        com.azure.resourcemanager.devcenter.DevCenterManager manager) {
        manager.networkConnections().getHealthDetailsWithResponse("rg1", "{networkConnectionName}", Context.NONE);
    }
}
