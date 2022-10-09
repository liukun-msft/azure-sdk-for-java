// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.generated;

import com.azure.core.util.Context;

/** Samples for DscConfiguration ListByAutomationAccount. */
public final class DscConfigurationListByAutomationAccountSamples {
    /*
     * x-ms-original-file: specification/automation/resource-manager/Microsoft.Automation/stable/2019-06-01/examples/getAllDscConfigurations.json
     */
    /**
     * Sample code: Get DSC Configuration.
     *
     * @param manager Entry point to AutomationManager.
     */
    public static void getDSCConfiguration(com.azure.resourcemanager.automation.AutomationManager manager) {
        manager
            .dscConfigurations()
            .listByAutomationAccount("rg", "myAutomationAccount33", null, null, null, null, Context.NONE);
    }

    /*
     * x-ms-original-file: specification/automation/resource-manager/Microsoft.Automation/stable/2019-06-01/examples/getPagedlDscConfigurationsWithNameFilter.json
     */
    /**
     * Sample code: List Paged DSC Configurations with name filter.
     *
     * @param manager Entry point to AutomationManager.
     */
    public static void listPagedDSCConfigurationsWithNameFilter(
        com.azure.resourcemanager.automation.AutomationManager manager) {
        manager
            .dscConfigurations()
            .listByAutomationAccount(
                "rg", "myAutomationAccount33", "contains(name,'server')", 0, 2, "allpages", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/automation/resource-manager/Microsoft.Automation/stable/2019-06-01/examples/getPagedDscConfigurationsWithNoFilter.json
     */
    /**
     * Sample code: List Paged DSC Configurations with no filter.
     *
     * @param manager Entry point to AutomationManager.
     */
    public static void listPagedDSCConfigurationsWithNoFilter(
        com.azure.resourcemanager.automation.AutomationManager manager) {
        manager
            .dscConfigurations()
            .listByAutomationAccount("rg", "myAutomationAccount33", null, 0, 3, "allpages", Context.NONE);
    }
}
