// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

import com.azure.core.util.Context;

/** Samples for WorkloadNetworks GetDnsZone. */
public final class WorkloadNetworksGetDnsZoneSamples {
    /*
     * x-ms-original-file: specification/vmware/resource-manager/Microsoft.AVS/stable/2021-12-01/examples/WorkloadNetworks_GetDnsZones.json
     */
    /**
     * Sample code: WorkloadNetworks_GetDnsZone.
     *
     * @param manager Entry point to AvsManager.
     */
    public static void workloadNetworksGetDnsZone(com.azure.resourcemanager.avs.AvsManager manager) {
        manager.workloadNetworks().getDnsZoneWithResponse("group1", "cloud1", "dnsZone1", Context.NONE);
    }
}
