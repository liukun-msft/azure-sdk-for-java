// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.core.util.Context;

/** Samples for ManagedInstanceKeys Delete. */
public final class ManagedInstanceKeysDeleteSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2017-10-01-preview/examples/ManagedInstanceKeyDelete.json
     */
    /**
     * Sample code: Delete the managed instance key.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void deleteTheManagedInstanceKey(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getManagedInstanceKeys()
            .delete(
                "sqlcrudtest-7398",
                "sqlcrudtest-4645",
                "someVault_someKey_01234567890123456789012345678901",
                Context.NONE);
    }
}
