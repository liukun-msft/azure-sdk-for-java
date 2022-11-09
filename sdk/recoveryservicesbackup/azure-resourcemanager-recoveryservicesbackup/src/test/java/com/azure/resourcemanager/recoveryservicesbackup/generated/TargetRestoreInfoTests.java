// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.OverwriteOptions;
import com.azure.resourcemanager.recoveryservicesbackup.models.TargetRestoreInfo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class TargetRestoreInfoTests {
    @Test
    public void testDeserialize() {
        TargetRestoreInfo model =
            BinaryData
                .fromString(
                    "{\"overwriteOption\":\"Invalid\",\"containerId\":\"dxgketwzhhzjhfj\",\"databaseName\":\"vvmu\",\"targetDirectoryForFileRestore\":\"pmuneqsx\"}")
                .toObject(TargetRestoreInfo.class);
        Assertions.assertEquals(OverwriteOptions.INVALID, model.overwriteOption());
        Assertions.assertEquals("dxgketwzhhzjhfj", model.containerId());
        Assertions.assertEquals("vvmu", model.databaseName());
        Assertions.assertEquals("pmuneqsx", model.targetDirectoryForFileRestore());
    }

    @Test
    public void testSerialize() {
        TargetRestoreInfo model =
            new TargetRestoreInfo()
                .withOverwriteOption(OverwriteOptions.INVALID)
                .withContainerId("dxgketwzhhzjhfj")
                .withDatabaseName("vvmu")
                .withTargetDirectoryForFileRestore("pmuneqsx");
        model = BinaryData.fromObject(model).toObject(TargetRestoreInfo.class);
        Assertions.assertEquals(OverwriteOptions.INVALID, model.overwriteOption());
        Assertions.assertEquals("dxgketwzhhzjhfj", model.containerId());
        Assertions.assertEquals("vvmu", model.databaseName());
        Assertions.assertEquals("pmuneqsx", model.targetDirectoryForFileRestore());
    }
}
