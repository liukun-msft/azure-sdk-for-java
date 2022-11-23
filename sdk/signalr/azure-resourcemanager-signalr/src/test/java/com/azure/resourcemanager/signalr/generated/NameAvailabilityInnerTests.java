// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.signalr.fluent.models.NameAvailabilityInner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class NameAvailabilityInnerTests {
    @Test
    public void testDeserialize() {
        NameAvailabilityInner model =
            BinaryData
                .fromString("{\"nameAvailable\":true,\"reason\":\"zdzevndh\",\"message\":\"wpdappdsbdkv\"}")
                .toObject(NameAvailabilityInner.class);
        Assertions.assertEquals(true, model.nameAvailable());
        Assertions.assertEquals("zdzevndh", model.reason());
        Assertions.assertEquals("wpdappdsbdkv", model.message());
    }

    @Test
    public void testSerialize() {
        NameAvailabilityInner model =
            new NameAvailabilityInner().withNameAvailable(true).withReason("zdzevndh").withMessage("wpdappdsbdkv");
        model = BinaryData.fromObject(model).toObject(NameAvailabilityInner.class);
        Assertions.assertEquals(true, model.nameAvailable());
        Assertions.assertEquals("zdzevndh", model.reason());
        Assertions.assertEquals("wpdappdsbdkv", model.message());
    }
}
