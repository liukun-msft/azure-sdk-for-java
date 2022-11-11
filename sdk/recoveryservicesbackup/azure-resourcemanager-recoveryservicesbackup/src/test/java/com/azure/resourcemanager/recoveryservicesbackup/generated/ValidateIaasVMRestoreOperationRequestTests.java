// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.RestoreRequest;
import com.azure.resourcemanager.recoveryservicesbackup.models.ValidateIaasVMRestoreOperationRequest;
import org.junit.jupiter.api.Test;

public final class ValidateIaasVMRestoreOperationRequestTests {
    @Test
    public void testDeserialize() {
        ValidateIaasVMRestoreOperationRequest model =
            BinaryData
                .fromString(
                    "{\"objectType\":\"ValidateIaasVMRestoreOperationRequest\",\"restoreRequest\":{\"objectType\":\"RestoreRequest\"}}")
                .toObject(ValidateIaasVMRestoreOperationRequest.class);
    }

    @Test
    public void testSerialize() {
        ValidateIaasVMRestoreOperationRequest model =
            new ValidateIaasVMRestoreOperationRequest().withRestoreRequest(new RestoreRequest());
        model = BinaryData.fromObject(model).toObject(ValidateIaasVMRestoreOperationRequest.class);
    }
}
