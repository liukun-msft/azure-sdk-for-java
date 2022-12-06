// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devcenter.models.UserAssignedIdentity;
import org.junit.jupiter.api.Test;

public final class UserAssignedIdentityTests {
    @Test
    public void testDeserialize() {
        UserAssignedIdentity model =
            BinaryData
                .fromString(
                    "{\"principalId\":\"72e8c163-8215-4d64-aaf2-3cba6eb40d42\",\"clientId\":\"ed63d920-710b-4f6e-aae6-481cd2b2a64c\"}")
                .toObject(UserAssignedIdentity.class);
    }

    @Test
    public void testSerialize() {
        UserAssignedIdentity model = new UserAssignedIdentity();
        model = BinaryData.fromObject(model).toObject(UserAssignedIdentity.class);
    }
}
