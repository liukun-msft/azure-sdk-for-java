// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

import com.azure.core.util.Context;

/** Samples for Addons Delete. */
public final class AddonsDeleteSamples {
    /*
     * x-ms-original-file: specification/vmware/resource-manager/Microsoft.AVS/stable/2021-12-01/examples/Addons_Delete.json
     */
    /**
     * Sample code: Addons_Delete.
     *
     * @param manager Entry point to AvsManager.
     */
    public static void addonsDelete(com.azure.resourcemanager.avs.AvsManager manager) {
        manager.addons().delete("group1", "cloud1", "srm", Context.NONE);
    }
}
