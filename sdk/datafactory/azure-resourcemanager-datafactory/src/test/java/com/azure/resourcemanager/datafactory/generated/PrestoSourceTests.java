// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.PrestoSource;
import org.junit.jupiter.api.Test;

public final class PrestoSourceTests {
    @Test
    public void testDeserialize() {
        PrestoSource model = BinaryData.fromString("{\"type\":\"PrestoSource\",\"\":{}}").toObject(PrestoSource.class);
    }

    @Test
    public void testSerialize() {
        PrestoSource model = new PrestoSource();
        model = BinaryData.fromObject(model).toObject(PrestoSource.class);
    }
}
