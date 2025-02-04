// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.OutputDeliveryMode;
import com.azure.resourcemanager.machinelearning.models.TritonModelJobOutput;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class TritonModelJobOutputTests {
    @Test
    public void testDeserialize() {
        TritonModelJobOutput model =
            BinaryData
                .fromString(
                    "{\"jobOutputType\":\"triton_model\",\"mode\":\"ReadWriteMount\",\"uri\":\"vkolrupjovmo\",\"description\":\"ayeb\"}")
                .toObject(TritonModelJobOutput.class);
        Assertions.assertEquals("ayeb", model.description());
        Assertions.assertEquals(OutputDeliveryMode.READ_WRITE_MOUNT, model.mode());
        Assertions.assertEquals("vkolrupjovmo", model.uri());
    }

    @Test
    public void testSerialize() {
        TritonModelJobOutput model =
            new TritonModelJobOutput()
                .withDescription("ayeb")
                .withMode(OutputDeliveryMode.READ_WRITE_MOUNT)
                .withUri("vkolrupjovmo");
        model = BinaryData.fromObject(model).toObject(TritonModelJobOutput.class);
        Assertions.assertEquals("ayeb", model.description());
        Assertions.assertEquals(OutputDeliveryMode.READ_WRITE_MOUNT, model.mode());
        Assertions.assertEquals("vkolrupjovmo", model.uri());
    }
}
