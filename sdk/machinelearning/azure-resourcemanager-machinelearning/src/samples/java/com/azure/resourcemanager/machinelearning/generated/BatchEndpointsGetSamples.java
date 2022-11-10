// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.Context;

/** Samples for BatchEndpoints Get. */
public final class BatchEndpointsGetSamples {
    /*
     * x-ms-original-file: specification/machinelearningservices/resource-manager/Microsoft.MachineLearningServices/stable/2022-10-01/examples/BatchEndpoint/get.json
     */
    /**
     * Sample code: Get Batch Endpoint.
     *
     * @param manager Entry point to MachineLearningManager.
     */
    public static void getBatchEndpoint(com.azure.resourcemanager.machinelearning.MachineLearningManager manager) {
        manager.batchEndpoints().getWithResponse("test-rg", "my-aml-workspace", "testEndpointName", Context.NONE);
    }
}
