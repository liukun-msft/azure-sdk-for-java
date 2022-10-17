// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.ExtendedLocation;
import com.azure.resourcemanager.appcontainers.models.ExtendedLocationTypes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ExtendedLocationTests {
    @Test
    public void testDeserialize() {
        ExtendedLocation model =
            BinaryData
                .fromString("{\"name\":\"wrmjmwvvjektc\",\"type\":\"CustomLocation\"}")
                .toObject(ExtendedLocation.class);
        Assertions.assertEquals("wrmjmwvvjektc", model.name());
        Assertions.assertEquals(ExtendedLocationTypes.CUSTOM_LOCATION, model.type());
    }

    @Test
    public void testSerialize() {
        ExtendedLocation model =
            new ExtendedLocation().withName("wrmjmwvvjektc").withType(ExtendedLocationTypes.CUSTOM_LOCATION);
        model = BinaryData.fromObject(model).toObject(ExtendedLocation.class);
        Assertions.assertEquals("wrmjmwvvjektc", model.name());
        Assertions.assertEquals(ExtendedLocationTypes.CUSTOM_LOCATION, model.type());
    }
}
