// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.Context;

/** Samples for ProtectionContainers Unregister. */
public final class ProtectionContainersUnregisterSamples {
    /*
     * x-ms-original-file: specification/recoveryservicesbackup/resource-manager/Microsoft.RecoveryServices/preview/2022-09-01-preview/examples/AzureWorkload/ProtectionContainers_Unregister.json
     */
    /**
     * Sample code: Unregister Protection Container.
     *
     * @param manager Entry point to RecoveryServicesBackupManager.
     */
    public static void unregisterProtectionContainer(
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager) {
        manager
            .protectionContainers()
            .unregisterWithResponse(
                "testVault", "testRg", "Azure", "storagecontainer;Storage;test-rg;teststorage", Context.NONE);
    }
}
