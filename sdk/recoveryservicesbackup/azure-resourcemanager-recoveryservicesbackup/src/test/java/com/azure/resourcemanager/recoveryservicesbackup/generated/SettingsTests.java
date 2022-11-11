// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.Settings;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class SettingsTests {
    @Test
    public void testDeserialize() {
        Settings model =
            BinaryData
                .fromString("{\"timeZone\":\"vdxec\",\"issqlcompression\":false,\"isCompression\":true}")
                .toObject(Settings.class);
        Assertions.assertEquals("vdxec", model.timeZone());
        Assertions.assertEquals(false, model.issqlcompression());
        Assertions.assertEquals(true, model.isCompression());
    }

    @Test
    public void testSerialize() {
        Settings model = new Settings().withTimeZone("vdxec").withIssqlcompression(false).withIsCompression(true);
        model = BinaryData.fromObject(model).toObject(Settings.class);
        Assertions.assertEquals("vdxec", model.timeZone());
        Assertions.assertEquals(false, model.issqlcompression());
        Assertions.assertEquals(true, model.isCompression());
    }
}
