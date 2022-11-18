// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.Context;

/** Samples for NetworkConnections RunHealthChecks. */
public final class NetworkConnectionsRunHealthChecksSamples {
    /*
     * x-ms-original-file: specification/devcenter/resource-manager/Microsoft.DevCenter/preview/2022-10-12-preview/examples/NetworkConnections_RunHealthChecks.json
     */
    /**
     * Sample code: NetworkConnections_RunHealthChecks.
     *
     * @param manager Entry point to DevCenterManager.
     */
    public static void networkConnectionsRunHealthChecks(com.azure.resourcemanager.devcenter.DevCenterManager manager) {
        manager.networkConnections().runHealthChecksWithResponse("rg1", "uswest3network", Context.NONE);
    }
}
