// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureWorkloadSapHanaPointInTimeRestoreRequest;
import com.azure.resourcemanager.recoveryservicesbackup.models.OverwriteOptions;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryMode;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryType;
import com.azure.resourcemanager.recoveryservicesbackup.models.TargetRestoreInfo;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AzureWorkloadSapHanaPointInTimeRestoreRequestTests {
    @Test
    public void testDeserialize() {
        AzureWorkloadSapHanaPointInTimeRestoreRequest model =
            BinaryData
                .fromString(
                    "{\"objectType\":\"AzureWorkloadSAPHanaPointInTimeRestoreRequest\",\"pointInTime\":\"2021-07-20T06:35:08Z\",\"recoveryType\":\"RestoreDisks\",\"sourceResourceId\":\"sicddyvv\",\"propertyBag\":{\"wa\":\"gfmo\",\"tjeaahhvjhh\":\"pqg\",\"bbjjidjksyxk\":\"akz\"},\"targetInfo\":{\"overwriteOption\":\"Overwrite\",\"containerId\":\"vblbjednljlageua\",\"databaseName\":\"xuns\",\"targetDirectoryForFileRestore\":\"bn\"},\"recoveryMode\":\"Invalid\",\"targetVirtualMachineId\":\"ynenlsvxeizz\"}")
                .toObject(AzureWorkloadSapHanaPointInTimeRestoreRequest.class);
        Assertions.assertEquals(RecoveryType.RESTORE_DISKS, model.recoveryType());
        Assertions.assertEquals("sicddyvv", model.sourceResourceId());
        Assertions.assertEquals("gfmo", model.propertyBag().get("wa"));
        Assertions.assertEquals(OverwriteOptions.OVERWRITE, model.targetInfo().overwriteOption());
        Assertions.assertEquals("vblbjednljlageua", model.targetInfo().containerId());
        Assertions.assertEquals("xuns", model.targetInfo().databaseName());
        Assertions.assertEquals("bn", model.targetInfo().targetDirectoryForFileRestore());
        Assertions.assertEquals(RecoveryMode.INVALID, model.recoveryMode());
        Assertions.assertEquals("ynenlsvxeizz", model.targetVirtualMachineId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-20T06:35:08Z"), model.pointInTime());
    }

    @Test
    public void testSerialize() {
        AzureWorkloadSapHanaPointInTimeRestoreRequest model =
            new AzureWorkloadSapHanaPointInTimeRestoreRequest()
                .withRecoveryType(RecoveryType.RESTORE_DISKS)
                .withSourceResourceId("sicddyvv")
                .withPropertyBag(mapOf("wa", "gfmo", "tjeaahhvjhh", "pqg", "bbjjidjksyxk", "akz"))
                .withTargetInfo(
                    new TargetRestoreInfo()
                        .withOverwriteOption(OverwriteOptions.OVERWRITE)
                        .withContainerId("vblbjednljlageua")
                        .withDatabaseName("xuns")
                        .withTargetDirectoryForFileRestore("bn"))
                .withRecoveryMode(RecoveryMode.INVALID)
                .withTargetVirtualMachineId("ynenlsvxeizz")
                .withPointInTime(OffsetDateTime.parse("2021-07-20T06:35:08Z"));
        model = BinaryData.fromObject(model).toObject(AzureWorkloadSapHanaPointInTimeRestoreRequest.class);
        Assertions.assertEquals(RecoveryType.RESTORE_DISKS, model.recoveryType());
        Assertions.assertEquals("sicddyvv", model.sourceResourceId());
        Assertions.assertEquals("gfmo", model.propertyBag().get("wa"));
        Assertions.assertEquals(OverwriteOptions.OVERWRITE, model.targetInfo().overwriteOption());
        Assertions.assertEquals("vblbjednljlageua", model.targetInfo().containerId());
        Assertions.assertEquals("xuns", model.targetInfo().databaseName());
        Assertions.assertEquals("bn", model.targetInfo().targetDirectoryForFileRestore());
        Assertions.assertEquals(RecoveryMode.INVALID, model.recoveryMode());
        Assertions.assertEquals("ynenlsvxeizz", model.targetVirtualMachineId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-20T06:35:08Z"), model.pointInTime());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
