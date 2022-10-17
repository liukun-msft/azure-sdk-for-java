// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.RestSource;
import org.junit.jupiter.api.Test;

public final class RestSourceTests {
    @Test
    public void testDeserialize() {
        RestSource model = BinaryData.fromString("{\"type\":\"RestSource\",\"\":{}}").toObject(RestSource.class);
    }

    @Test
    public void testSerialize() {
        RestSource model = new RestSource();
        model = BinaryData.fromObject(model).toObject(RestSource.class);
    }
}
