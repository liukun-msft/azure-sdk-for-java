// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.generated;

import com.azure.core.util.Context;
import java.util.UUID;

/** Samples for JobSchedule Get. */
public final class JobScheduleGetSamples {
    /*
     * x-ms-original-file: specification/automation/resource-manager/Microsoft.Automation/preview/2020-01-13-preview/examples/getJobSchedule.json
     */
    /**
     * Sample code: Get a job schedule.
     *
     * @param manager Entry point to AutomationManager.
     */
    public static void getAJobSchedule(com.azure.resourcemanager.automation.AutomationManager manager) {
        manager
            .jobSchedules()
            .getWithResponse(
                "rg",
                "ContoseAutomationAccount",
                UUID.fromString("0fa462ba-3aa2-4138-83ca-9ebc3bc55cdc"),
                Context.NONE);
    }
}
