// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.OperationResultInfoBase;
import org.junit.jupiter.api.Test;

public final class OperationResultInfoBaseTests {
    @Test
    public void testDeserialize() {
        OperationResultInfoBase model =
            BinaryData
                .fromString("{\"objectType\":\"OperationResultInfoBase\"}")
                .toObject(OperationResultInfoBase.class);
    }

    @Test
    public void testSerialize() {
        OperationResultInfoBase model = new OperationResultInfoBase();
        model = BinaryData.fromObject(model).toObject(OperationResultInfoBase.class);
    }
}
