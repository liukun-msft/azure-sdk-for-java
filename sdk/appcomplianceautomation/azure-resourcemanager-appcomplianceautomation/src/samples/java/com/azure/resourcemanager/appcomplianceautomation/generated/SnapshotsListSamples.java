// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcomplianceautomation.generated;

import com.azure.core.util.Context;

/** Samples for Snapshots List. */
public final class SnapshotsListSamples {
    /*
     * x-ms-original-file: specification/appcomplianceautomation/resource-manager/Microsoft.AppComplianceAutomation/preview/2022-11-16-preview/examples/Snapshots_List.json
     */
    /**
     * Sample code: Snapshots_List.
     *
     * @param manager Entry point to AppComplianceAutomationManager.
     */
    public static void snapshotsList(
        com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager manager) {
        manager
            .snapshots()
            .list(
                "testReportName",
                "1",
                100,
                null,
                "00000000-0000-0000-0000-000000000000",
                "00000000-0000-0000-0000-000000000000",
                Context.NONE);
    }
}
