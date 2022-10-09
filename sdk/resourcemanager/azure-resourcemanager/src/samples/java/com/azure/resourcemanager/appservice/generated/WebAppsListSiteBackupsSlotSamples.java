// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

import com.azure.core.util.Context;

/** Samples for WebApps ListSiteBackupsSlot. */
public final class WebAppsListSiteBackupsSlotSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2022-03-01/examples/ListSlotBackups.json
     */
    /**
     * Sample code: List backups.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listBackups(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .webApps()
            .manager()
            .serviceClient()
            .getWebApps()
            .listSiteBackupsSlot("testrg123", "tests346", "staging", Context.NONE);
    }
}
