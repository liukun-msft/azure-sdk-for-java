// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

import com.azure.core.util.Context;

/** Samples for ScriptPackages List. */
public final class ScriptPackagesListSamples {
    /*
     * x-ms-original-file: specification/vmware/resource-manager/Microsoft.AVS/stable/2022-05-01/examples/ScriptPackages_List.json
     */
    /**
     * Sample code: ScriptPackages_List.
     *
     * @param manager Entry point to AvsManager.
     */
    public static void scriptPackagesList(com.azure.resourcemanager.avs.AvsManager manager) {
        manager.scriptPackages().list("group1", "{privateCloudName}", Context.NONE);
    }
}
