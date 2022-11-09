// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureWorkloadAutoProtectionIntent;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupManagementType;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectionStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AzureWorkloadAutoProtectionIntentTests {
    @Test
    public void testDeserialize() {
        AzureWorkloadAutoProtectionIntent model =
            BinaryData
                .fromString(
                    "{\"protectionIntentItemType\":\"AzureWorkloadAutoProtectionIntent\",\"backupManagementType\":\"DefaultBackup\",\"sourceResourceId\":\"kgmnsghpxyc\",\"itemId\":\"drwjjkhvyom\",\"policyId\":\"luzvxnq\",\"protectionState\":\"ProtectionFailed\"}")
                .toObject(AzureWorkloadAutoProtectionIntent.class);
        Assertions.assertEquals(BackupManagementType.DEFAULT_BACKUP, model.backupManagementType());
        Assertions.assertEquals("kgmnsghpxyc", model.sourceResourceId());
        Assertions.assertEquals("drwjjkhvyom", model.itemId());
        Assertions.assertEquals("luzvxnq", model.policyId());
        Assertions.assertEquals(ProtectionStatus.PROTECTION_FAILED, model.protectionState());
    }

    @Test
    public void testSerialize() {
        AzureWorkloadAutoProtectionIntent model =
            new AzureWorkloadAutoProtectionIntent()
                .withBackupManagementType(BackupManagementType.DEFAULT_BACKUP)
                .withSourceResourceId("kgmnsghpxyc")
                .withItemId("drwjjkhvyom")
                .withPolicyId("luzvxnq")
                .withProtectionState(ProtectionStatus.PROTECTION_FAILED);
        model = BinaryData.fromObject(model).toObject(AzureWorkloadAutoProtectionIntent.class);
        Assertions.assertEquals(BackupManagementType.DEFAULT_BACKUP, model.backupManagementType());
        Assertions.assertEquals("kgmnsghpxyc", model.sourceResourceId());
        Assertions.assertEquals("drwjjkhvyom", model.itemId());
        Assertions.assertEquals("luzvxnq", model.policyId());
        Assertions.assertEquals(ProtectionStatus.PROTECTION_FAILED, model.protectionState());
    }
}
