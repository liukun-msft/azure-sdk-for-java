// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.OutputPathAssetReference;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class OutputPathAssetReferenceTests {
    @Test
    public void testDeserialize() {
        OutputPathAssetReference model =
            BinaryData
                .fromString("{\"referenceType\":\"OutputPath\",\"jobId\":\"h\",\"path\":\"mexznlwkb\"}")
                .toObject(OutputPathAssetReference.class);
        Assertions.assertEquals("h", model.jobId());
        Assertions.assertEquals("mexznlwkb", model.path());
    }

    @Test
    public void testSerialize() {
        OutputPathAssetReference model = new OutputPathAssetReference().withJobId("h").withPath("mexznlwkb");
        model = BinaryData.fromObject(model).toObject(OutputPathAssetReference.class);
        Assertions.assertEquals("h", model.jobId());
        Assertions.assertEquals("mexznlwkb", model.path());
    }
}
