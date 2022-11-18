// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.Context;

/** Samples for NetworkConnections ListHealthDetails. */
public final class NetworkConnectionsListHealthDetailsSamples {
    /*
     * x-ms-original-file: specification/devcenter/resource-manager/Microsoft.DevCenter/preview/2022-10-12-preview/examples/NetworkConnections_ListHealthDetails.json
     */
    /**
     * Sample code: NetworkConnections_ListHealthDetails.
     *
     * @param manager Entry point to DevCenterManager.
     */
    public static void networkConnectionsListHealthDetails(
        com.azure.resourcemanager.devcenter.DevCenterManager manager) {
        manager.networkConnections().listHealthDetails("rg1", "uswest3network", null, Context.NONE);
    }
}
