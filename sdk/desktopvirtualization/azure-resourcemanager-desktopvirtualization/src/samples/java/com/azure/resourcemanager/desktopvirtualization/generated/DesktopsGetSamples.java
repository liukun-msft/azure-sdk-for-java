// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.generated;

import com.azure.core.util.Context;

/** Samples for Desktops Get. */
public final class DesktopsGetSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2021-09-03-preview/examples/Desktop_Get.json
     */
    /**
     * Sample code: Desktop_Get.
     *
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void desktopGet(
        com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.desktops().getWithResponse("resourceGroup1", "applicationGroup1", "SessionDesktop", Context.NONE);
    }
}
