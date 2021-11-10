// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

import com.azure.core.util.Context;

/** Samples for WorkloadNetworks GetVMGroup. */
public final class WorkloadNetworksGetVMGroupSamples {
    /*
     * x-ms-original-file: specification/vmware/resource-manager/Microsoft.AVS/stable/2021-12-01/examples/WorkloadNetworks_GetVMGroups.json
     */
    /**
     * Sample code: WorkloadNetworks_GetVMGroup.
     *
     * @param manager Entry point to AvsManager.
     */
    public static void workloadNetworksGetVMGroup(com.azure.resourcemanager.avs.AvsManager manager) {
        manager.workloadNetworks().getVMGroupWithResponse("group1", "cloud1", "vmGroup1", Context.NONE);
    }
}
