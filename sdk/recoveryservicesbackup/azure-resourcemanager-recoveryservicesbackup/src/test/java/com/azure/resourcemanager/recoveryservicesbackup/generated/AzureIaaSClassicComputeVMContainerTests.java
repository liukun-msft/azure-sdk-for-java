// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureIaaSClassicComputeVMContainer;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupManagementType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AzureIaaSClassicComputeVMContainerTests {
    @Test
    public void testDeserialize() {
        AzureIaaSClassicComputeVMContainer model =
            BinaryData
                .fromString(
                    "{\"containerType\":\"Microsoft.ClassicCompute/virtualMachines\",\"virtualMachineId\":\"uuuybnchrsziz\",\"virtualMachineVersion\":\"uelyetndn\",\"resourceGroup\":\"qyggagfl\",\"friendlyName\":\"gm\",\"backupManagementType\":\"AzureSql\",\"registrationStatus\":\"hzjmucftbyrp\",\"healthStatus\":\"ohkpigqfu\",\"protectableObjectType\":\"ckzmkwklsnox\"}")
                .toObject(AzureIaaSClassicComputeVMContainer.class);
        Assertions.assertEquals("gm", model.friendlyName());
        Assertions.assertEquals(BackupManagementType.AZURE_SQL, model.backupManagementType());
        Assertions.assertEquals("hzjmucftbyrp", model.registrationStatus());
        Assertions.assertEquals("ohkpigqfu", model.healthStatus());
        Assertions.assertEquals("ckzmkwklsnox", model.protectableObjectType());
        Assertions.assertEquals("uuuybnchrsziz", model.virtualMachineId());
        Assertions.assertEquals("uelyetndn", model.virtualMachineVersion());
        Assertions.assertEquals("qyggagfl", model.resourceGroup());
    }

    @Test
    public void testSerialize() {
        AzureIaaSClassicComputeVMContainer model =
            new AzureIaaSClassicComputeVMContainer()
                .withFriendlyName("gm")
                .withBackupManagementType(BackupManagementType.AZURE_SQL)
                .withRegistrationStatus("hzjmucftbyrp")
                .withHealthStatus("ohkpigqfu")
                .withProtectableObjectType("ckzmkwklsnox")
                .withVirtualMachineId("uuuybnchrsziz")
                .withVirtualMachineVersion("uelyetndn")
                .withResourceGroup("qyggagfl");
        model = BinaryData.fromObject(model).toObject(AzureIaaSClassicComputeVMContainer.class);
        Assertions.assertEquals("gm", model.friendlyName());
        Assertions.assertEquals(BackupManagementType.AZURE_SQL, model.backupManagementType());
        Assertions.assertEquals("hzjmucftbyrp", model.registrationStatus());
        Assertions.assertEquals("ohkpigqfu", model.healthStatus());
        Assertions.assertEquals("ckzmkwklsnox", model.protectableObjectType());
        Assertions.assertEquals("uuuybnchrsziz", model.virtualMachineId());
        Assertions.assertEquals("uelyetndn", model.virtualMachineVersion());
        Assertions.assertEquals("qyggagfl", model.resourceGroup());
    }
}
