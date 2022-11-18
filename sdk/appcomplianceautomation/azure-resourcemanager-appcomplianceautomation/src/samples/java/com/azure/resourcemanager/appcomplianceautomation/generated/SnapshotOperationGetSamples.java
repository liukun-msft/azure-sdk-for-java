// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcomplianceautomation.generated;

import com.azure.core.util.Context;

/** Samples for SnapshotOperation Get. */
public final class SnapshotOperationGetSamples {
    /*
     * x-ms-original-file: specification/appcomplianceautomation/resource-manager/Microsoft.AppComplianceAutomation/preview/2022-11-16-preview/examples/Snapshot_Get.json
     */
    /**
     * Sample code: Snapshot_Get.
     *
     * @param manager Entry point to AppComplianceAutomationManager.
     */
    public static void snapshotGet(
        com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager manager) {
        manager.snapshotOperations().getWithResponse("testReportName", "testSnapshot", Context.NONE);
    }
}
