// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeCustomerVirtualNetwork;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class IntegrationRuntimeCustomerVirtualNetworkTests {
    @Test
    public void testDeserialize() {
        IntegrationRuntimeCustomerVirtualNetwork model =
            BinaryData.fromString("{\"subnetId\":\"gyipem\"}").toObject(IntegrationRuntimeCustomerVirtualNetwork.class);
        Assertions.assertEquals("gyipem", model.subnetId());
    }

    @Test
    public void testSerialize() {
        IntegrationRuntimeCustomerVirtualNetwork model =
            new IntegrationRuntimeCustomerVirtualNetwork().withSubnetId("gyipem");
        model = BinaryData.fromObject(model).toObject(IntegrationRuntimeCustomerVirtualNetwork.class);
        Assertions.assertEquals("gyipem", model.subnetId());
    }
}
