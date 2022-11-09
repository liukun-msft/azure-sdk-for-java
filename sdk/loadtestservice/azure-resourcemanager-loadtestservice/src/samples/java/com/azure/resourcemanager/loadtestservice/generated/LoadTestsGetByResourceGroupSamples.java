// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loadtestservice.generated;

import com.azure.core.util.Context;

/** Samples for LoadTests GetByResourceGroup. */
public final class LoadTestsGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/loadtestservice/resource-manager/Microsoft.LoadTestService/stable/2022-12-01/examples/LoadTests_Get.json
     */
    /**
     * Sample code: LoadTests_Get.
     *
     * @param manager Entry point to LoadTestManager.
     */
    public static void loadTestsGet(com.azure.resourcemanager.loadtestservice.LoadTestManager manager) {
        manager.loadTests().getByResourceGroupWithResponse("dummyrg", "myLoadTest", Context.NONE);
    }
}
