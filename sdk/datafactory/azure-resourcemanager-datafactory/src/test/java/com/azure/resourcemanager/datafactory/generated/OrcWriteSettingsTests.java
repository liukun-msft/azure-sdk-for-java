// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.OrcWriteSettings;
import org.junit.jupiter.api.Test;

public final class OrcWriteSettingsTests {
    @Test
    public void testDeserialize() {
        OrcWriteSettings model =
            BinaryData.fromString("{\"type\":\"OrcWriteSettings\",\"\":{}}").toObject(OrcWriteSettings.class);
    }

    @Test
    public void testSerialize() {
        OrcWriteSettings model = new OrcWriteSettings();
        model = BinaryData.fromObject(model).toObject(OrcWriteSettings.class);
    }
}
