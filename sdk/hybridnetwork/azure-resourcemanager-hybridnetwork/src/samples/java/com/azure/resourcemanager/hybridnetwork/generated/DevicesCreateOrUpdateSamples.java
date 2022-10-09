// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.generated;

import com.azure.core.management.SubResource;
import com.azure.resourcemanager.hybridnetwork.models.AzureStackEdgeFormat;

/** Samples for Devices CreateOrUpdate. */
public final class DevicesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/hybridnetwork/resource-manager/Microsoft.HybridNetwork/stable/2021-05-01/examples/DeviceCreate.json
     */
    /**
     * Sample code: Create or update device.
     *
     * @param manager Entry point to HybridNetworkManager.
     */
    public static void createOrUpdateDevice(com.azure.resourcemanager.hybridnetwork.HybridNetworkManager manager) {
        manager
            .devices()
            .define("TestDevice")
            .withRegion("eastus")
            .withExistingResourceGroup("rg1")
            .withProperties(
                new AzureStackEdgeFormat()
                    .withAzureStackEdge(
                        new SubResource()
                            .withId(
                                "/subscriptions/subid1/resourcegroups/rg2/providers/Microsoft.DataboxEdge/DataboxEdgeDevices/TestDataboxEdgeDeviceName")))
            .create();
    }
}
