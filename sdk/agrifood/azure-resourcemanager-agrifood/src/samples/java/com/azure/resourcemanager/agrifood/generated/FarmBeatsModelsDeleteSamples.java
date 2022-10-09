// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.agrifood.generated;

import com.azure.core.util.Context;

/** Samples for FarmBeatsModels Delete. */
public final class FarmBeatsModelsDeleteSamples {
    /*
     * x-ms-original-file: specification/agrifood/resource-manager/Microsoft.AgFoodPlatform/preview/2021-09-01-preview/examples/FarmBeatsModels_Delete.json
     */
    /**
     * Sample code: FarmBeatsModels_Delete.
     *
     * @param manager Entry point to AgriFoodManager.
     */
    public static void farmBeatsModelsDelete(com.azure.resourcemanager.agrifood.AgriFoodManager manager) {
        manager.farmBeatsModels().deleteWithResponse("examples-rg", "examples-farmBeatsResourceName", Context.NONE);
    }
}
