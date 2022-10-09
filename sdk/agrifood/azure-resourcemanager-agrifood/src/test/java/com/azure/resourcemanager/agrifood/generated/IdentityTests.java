// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.agrifood.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.agrifood.models.Identity;
import com.azure.resourcemanager.agrifood.models.ResourceIdentityType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class IdentityTests {
    @Test
    public void testDeserialize() {
        Identity model =
            BinaryData
                .fromString("{\"principalId\":\"sszdnru\",\"tenantId\":\"guhmuouqfpr\",\"type\":\"SystemAssigned\"}")
                .toObject(Identity.class);
        Assertions.assertEquals(ResourceIdentityType.SYSTEM_ASSIGNED, model.type());
    }

    @Test
    public void testSerialize() {
        Identity model = new Identity().withType(ResourceIdentityType.SYSTEM_ASSIGNED);
        model = BinaryData.fromObject(model).toObject(Identity.class);
        Assertions.assertEquals(ResourceIdentityType.SYSTEM_ASSIGNED, model.type());
    }
}
