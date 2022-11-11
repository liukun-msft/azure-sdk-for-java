// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.TargetRollingWindowSize;
import org.junit.jupiter.api.Test;

public final class TargetRollingWindowSizeTests {
    @Test
    public void testDeserialize() {
        TargetRollingWindowSize model =
            BinaryData.fromString("{\"mode\":\"TargetRollingWindowSize\"}").toObject(TargetRollingWindowSize.class);
    }

    @Test
    public void testSerialize() {
        TargetRollingWindowSize model = new TargetRollingWindowSize();
        model = BinaryData.fromObject(model).toObject(TargetRollingWindowSize.class);
    }
}
