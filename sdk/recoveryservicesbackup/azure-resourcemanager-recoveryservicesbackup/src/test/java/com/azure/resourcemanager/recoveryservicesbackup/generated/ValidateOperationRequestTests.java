// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.ValidateOperationRequest;
import org.junit.jupiter.api.Test;

public final class ValidateOperationRequestTests {
    @Test
    public void testDeserialize() {
        ValidateOperationRequest model =
            BinaryData
                .fromString("{\"objectType\":\"ValidateOperationRequest\"}")
                .toObject(ValidateOperationRequest.class);
    }

    @Test
    public void testSerialize() {
        ValidateOperationRequest model = new ValidateOperationRequest();
        model = BinaryData.fromObject(model).toObject(ValidateOperationRequest.class);
    }
}
