// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureFileShareProtectableItem;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureFileShareType;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectionStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AzureFileShareProtectableItemTests {
    @Test
    public void testDeserialize() {
        AzureFileShareProtectableItem model =
            BinaryData
                .fromString(
                    "{\"protectableItemType\":\"AzureFileShare\",\"parentContainerFabricId\":\"uygb\",\"parentContainerFriendlyName\":\"qqekewvnqvcdlgu\",\"azureFileShareType\":\"XSMB\",\"backupManagementType\":\"f\",\"workloadType\":\"wnlaxpu\",\"friendlyName\":\"qikczvvita\",\"protectionState\":\"Protecting\"}")
                .toObject(AzureFileShareProtectableItem.class);
        Assertions.assertEquals("f", model.backupManagementType());
        Assertions.assertEquals("wnlaxpu", model.workloadType());
        Assertions.assertEquals("qikczvvita", model.friendlyName());
        Assertions.assertEquals(ProtectionStatus.PROTECTING, model.protectionState());
        Assertions.assertEquals("uygb", model.parentContainerFabricId());
        Assertions.assertEquals("qqekewvnqvcdlgu", model.parentContainerFriendlyName());
        Assertions.assertEquals(AzureFileShareType.XSMB, model.azureFileShareType());
    }

    @Test
    public void testSerialize() {
        AzureFileShareProtectableItem model =
            new AzureFileShareProtectableItem()
                .withBackupManagementType("f")
                .withWorkloadType("wnlaxpu")
                .withFriendlyName("qikczvvita")
                .withProtectionState(ProtectionStatus.PROTECTING)
                .withParentContainerFabricId("uygb")
                .withParentContainerFriendlyName("qqekewvnqvcdlgu")
                .withAzureFileShareType(AzureFileShareType.XSMB);
        model = BinaryData.fromObject(model).toObject(AzureFileShareProtectableItem.class);
        Assertions.assertEquals("f", model.backupManagementType());
        Assertions.assertEquals("wnlaxpu", model.workloadType());
        Assertions.assertEquals("qikczvvita", model.friendlyName());
        Assertions.assertEquals(ProtectionStatus.PROTECTING, model.protectionState());
        Assertions.assertEquals("uygb", model.parentContainerFabricId());
        Assertions.assertEquals("qqekewvnqvcdlgu", model.parentContainerFriendlyName());
        Assertions.assertEquals(AzureFileShareType.XSMB, model.azureFileShareType());
    }
}
