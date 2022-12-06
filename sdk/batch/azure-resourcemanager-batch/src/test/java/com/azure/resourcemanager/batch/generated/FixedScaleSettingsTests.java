// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.batch.models.ComputeNodeDeallocationOption;
import com.azure.resourcemanager.batch.models.FixedScaleSettings;
import java.time.Duration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class FixedScaleSettingsTests {
    @Test
    public void testDeserialize() {
        FixedScaleSettings model =
            BinaryData
                .fromString(
                    "{\"resizeTimeout\":\"PT105H19S\",\"targetDedicatedNodes\":1458027183,\"targetLowPriorityNodes\":1149443455,\"nodeDeallocationOption\":\"TaskCompletion\"}")
                .toObject(FixedScaleSettings.class);
        Assertions.assertEquals(Duration.parse("PT105H19S"), model.resizeTimeout());
        Assertions.assertEquals(1458027183, model.targetDedicatedNodes());
        Assertions.assertEquals(1149443455, model.targetLowPriorityNodes());
        Assertions.assertEquals(ComputeNodeDeallocationOption.TASK_COMPLETION, model.nodeDeallocationOption());
    }

    @Test
    public void testSerialize() {
        FixedScaleSettings model =
            new FixedScaleSettings()
                .withResizeTimeout(Duration.parse("PT105H19S"))
                .withTargetDedicatedNodes(1458027183)
                .withTargetLowPriorityNodes(1149443455)
                .withNodeDeallocationOption(ComputeNodeDeallocationOption.TASK_COMPLETION);
        model = BinaryData.fromObject(model).toObject(FixedScaleSettings.class);
        Assertions.assertEquals(Duration.parse("PT105H19S"), model.resizeTimeout());
        Assertions.assertEquals(1458027183, model.targetDedicatedNodes());
        Assertions.assertEquals(1149443455, model.targetLowPriorityNodes());
        Assertions.assertEquals(ComputeNodeDeallocationOption.TASK_COMPLETION, model.nodeDeallocationOption());
    }
}
