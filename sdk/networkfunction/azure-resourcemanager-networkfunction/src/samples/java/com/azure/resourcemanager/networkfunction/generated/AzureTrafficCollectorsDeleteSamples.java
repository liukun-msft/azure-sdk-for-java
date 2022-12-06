// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkfunction.generated;

import com.azure.core.util.Context;

/** Samples for AzureTrafficCollectors Delete. */
public final class AzureTrafficCollectorsDeleteSamples {
    /*
     * x-ms-original-file: specification/networkfunction/resource-manager/Microsoft.NetworkFunction/stable/2022-11-01/examples/AzureTrafficCollectorDelete.json
     */
    /**
     * Sample code: Delete Traffic Collector.
     *
     * @param manager Entry point to AzureTrafficCollectorManager.
     */
    public static void deleteTrafficCollector(
        com.azure.resourcemanager.networkfunction.AzureTrafficCollectorManager manager) {
        manager.azureTrafficCollectors().delete("rg1", "atc", Context.NONE);
    }
}
