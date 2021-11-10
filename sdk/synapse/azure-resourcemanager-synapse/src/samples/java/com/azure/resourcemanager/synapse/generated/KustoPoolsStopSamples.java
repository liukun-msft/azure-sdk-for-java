// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.Context;

/** Samples for KustoPools Stop. */
public final class KustoPoolsStopSamples {
    /*
     * x-ms-original-file: specification/synapse/resource-manager/Microsoft.Synapse/preview/2021-06-01-preview/examples/KustoPoolsStop.json
     */
    /**
     * Sample code: kustoPoolsStop.
     *
     * @param manager Entry point to SynapseManager.
     */
    public static void kustoPoolsStop(com.azure.resourcemanager.synapse.SynapseManager manager) {
        manager.kustoPools().stop("kustorptest", "kustoclusterrptest4", "kustorptest", Context.NONE);
    }
}
