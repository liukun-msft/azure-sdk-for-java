// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.Context;

/** Samples for DevCenters Delete. */
public final class DevCentersDeleteSamples {
    /*
     * x-ms-original-file: specification/devcenter/resource-manager/Microsoft.DevCenter/preview/2022-10-12-preview/examples/DevCenters_Delete.json
     */
    /**
     * Sample code: DevCenters_Delete.
     *
     * @param manager Entry point to DevCenterManager.
     */
    public static void devCentersDelete(com.azure.resourcemanager.devcenter.DevCenterManager manager) {
        manager.devCenters().delete("rg1", "Contoso", Context.NONE);
    }
}
