// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.Context;

/** Samples for KustoPools ListFollowerDatabases. */
public final class KustoPoolsListFollowerDatabasesSamples {
    /*
     * x-ms-original-file: specification/synapse/resource-manager/Microsoft.Synapse/preview/2021-06-01-preview/examples/KustoPoolFollowerDatabasesList.json
     */
    /**
     * Sample code: KustoPoolListFollowerDatabases.
     *
     * @param manager Entry point to SynapseManager.
     */
    public static void kustoPoolListFollowerDatabases(com.azure.resourcemanager.synapse.SynapseManager manager) {
        manager.kustoPools().listFollowerDatabases("kustorptest", "kustoclusterrptest4", "kustorptest", Context.NONE);
    }
}
