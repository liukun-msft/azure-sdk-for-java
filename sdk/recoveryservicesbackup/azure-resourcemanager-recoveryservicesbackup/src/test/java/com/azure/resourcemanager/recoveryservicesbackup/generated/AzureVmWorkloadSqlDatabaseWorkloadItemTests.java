// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureVmWorkloadSqlDatabaseWorkloadItem;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectionStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AzureVmWorkloadSqlDatabaseWorkloadItemTests {
    @Test
    public void testDeserialize() {
        AzureVmWorkloadSqlDatabaseWorkloadItem model =
            BinaryData
                .fromString(
                    "{\"workloadItemType\":\"SQLDataBase\",\"parentName\":\"s\",\"serverName\":\"lmiiiovg\",\"isAutoProtectable\":true,\"subinquireditemcount\":1179154127,\"subWorkloadItemCount\":1406785708,\"backupManagementType\":\"kctotiowlxteq\",\"workloadType\":\"tjgwdtguk\",\"friendlyName\":\"nblwphqlkcc\",\"protectionState\":\"NotProtected\"}")
                .toObject(AzureVmWorkloadSqlDatabaseWorkloadItem.class);
        Assertions.assertEquals("kctotiowlxteq", model.backupManagementType());
        Assertions.assertEquals("tjgwdtguk", model.workloadType());
        Assertions.assertEquals("nblwphqlkcc", model.friendlyName());
        Assertions.assertEquals(ProtectionStatus.NOT_PROTECTED, model.protectionState());
        Assertions.assertEquals("s", model.parentName());
        Assertions.assertEquals("lmiiiovg", model.serverName());
        Assertions.assertEquals(true, model.isAutoProtectable());
        Assertions.assertEquals(1179154127, model.subinquireditemcount());
        Assertions.assertEquals(1406785708, model.subWorkloadItemCount());
    }

    @Test
    public void testSerialize() {
        AzureVmWorkloadSqlDatabaseWorkloadItem model =
            new AzureVmWorkloadSqlDatabaseWorkloadItem()
                .withBackupManagementType("kctotiowlxteq")
                .withWorkloadType("tjgwdtguk")
                .withFriendlyName("nblwphqlkcc")
                .withProtectionState(ProtectionStatus.NOT_PROTECTED)
                .withParentName("s")
                .withServerName("lmiiiovg")
                .withIsAutoProtectable(true)
                .withSubinquireditemcount(1179154127)
                .withSubWorkloadItemCount(1406785708);
        model = BinaryData.fromObject(model).toObject(AzureVmWorkloadSqlDatabaseWorkloadItem.class);
        Assertions.assertEquals("kctotiowlxteq", model.backupManagementType());
        Assertions.assertEquals("tjgwdtguk", model.workloadType());
        Assertions.assertEquals("nblwphqlkcc", model.friendlyName());
        Assertions.assertEquals(ProtectionStatus.NOT_PROTECTED, model.protectionState());
        Assertions.assertEquals("s", model.parentName());
        Assertions.assertEquals("lmiiiovg", model.serverName());
        Assertions.assertEquals(true, model.isAutoProtectable());
        Assertions.assertEquals(1179154127, model.subinquireditemcount());
        Assertions.assertEquals(1406785708, model.subWorkloadItemCount());
    }
}
