// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.desktopvirtualization.models.ScalingPlan;

/** Samples for ScalingPlans Update. */
public final class ScalingPlansUpdateSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2021-09-03-preview/examples/ScalingPlan_Update.json
     */
    /**
     * Sample code: ScalingPlans_Update.
     *
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void scalingPlansUpdate(
        com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        ScalingPlan resource =
            manager
                .scalingPlans()
                .getByResourceGroupWithResponse("resourceGroup1", "scalingPlan1", Context.NONE)
                .getValue();
        resource.update().apply();
    }
}
