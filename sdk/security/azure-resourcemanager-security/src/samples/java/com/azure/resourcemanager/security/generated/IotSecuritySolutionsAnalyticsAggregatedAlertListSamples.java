// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.Context;

/** Samples for IotSecuritySolutionsAnalyticsAggregatedAlert List. */
public final class IotSecuritySolutionsAnalyticsAggregatedAlertListSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/stable/2019-08-01/examples/IoTSecuritySolutionsAnalytics/GetIoTSecuritySolutionsSecurityAggregatedAlertList.json
     */
    /**
     * Sample code: Get the aggregated alert list of yours IoT Security solution.
     *
     * @param manager Entry point to SecurityManager.
     */
    public static void getTheAggregatedAlertListOfYoursIoTSecuritySolution(
        com.azure.resourcemanager.security.SecurityManager manager) {
        manager.iotSecuritySolutionsAnalyticsAggregatedAlerts().list("MyGroup", "default", null, Context.NONE);
    }
}
