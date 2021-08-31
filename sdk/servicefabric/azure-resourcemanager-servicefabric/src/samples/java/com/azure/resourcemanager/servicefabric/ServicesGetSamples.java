// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric;

import com.azure.core.util.Context;

/** Samples for Services Get. */
public final class ServicesGetSamples {
    /*
     * operationId: Services_Get
     * api-version: 2021-06-01
     * x-ms-examples: Get a service
     */
    /**
     * Sample code: Get a service.
     *
     * @param manager Entry point to ServiceFabricManager.
     */
    public static void getAService(com.azure.resourcemanager.servicefabric.ServiceFabricManager manager) {
        manager.services().getWithResponse("resRg", "myCluster", "myApp", "myService", Context.NONE);
    }
}
