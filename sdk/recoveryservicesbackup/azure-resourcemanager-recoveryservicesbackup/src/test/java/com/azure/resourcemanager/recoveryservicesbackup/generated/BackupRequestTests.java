// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupRequest;
import org.junit.jupiter.api.Test;

public final class BackupRequestTests {
    @Test
    public void testDeserialize() {
        BackupRequest model = BinaryData.fromString("{\"objectType\":\"BackupRequest\"}").toObject(BackupRequest.class);
    }

    @Test
    public void testSerialize() {
        BackupRequest model = new BackupRequest();
        model = BinaryData.fromObject(model).toObject(BackupRequest.class);
    }
}
