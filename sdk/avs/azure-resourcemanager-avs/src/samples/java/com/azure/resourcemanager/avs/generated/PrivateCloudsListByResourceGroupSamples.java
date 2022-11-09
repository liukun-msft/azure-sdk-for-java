// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

import com.azure.core.util.Context;

/** Samples for PrivateClouds ListByResourceGroup. */
public final class PrivateCloudsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/vmware/resource-manager/Microsoft.AVS/stable/2022-05-01/examples/PrivateClouds_List.json
     */
    /**
     * Sample code: PrivateClouds_List.
     *
     * @param manager Entry point to AvsManager.
     */
    public static void privateCloudsList(com.azure.resourcemanager.avs.AvsManager manager) {
        manager.privateClouds().listByResourceGroup("group1", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/vmware/resource-manager/Microsoft.AVS/stable/2022-05-01/examples/PrivateClouds_List_Stretched.json
     */
    /**
     * Sample code: PrivateClouds_List_Stretched.
     *
     * @param manager Entry point to AvsManager.
     */
    public static void privateCloudsListStretched(com.azure.resourcemanager.avs.AvsManager manager) {
        manager.privateClouds().listByResourceGroup("group1", Context.NONE);
    }
}
