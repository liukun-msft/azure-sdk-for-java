// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elastic.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.elastic.models.ResourceSku;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ResourceSkuTests {
    @Test
    public void testDeserialize() {
        ResourceSku model = BinaryData.fromString("{\"name\":\"jqul\"}").toObject(ResourceSku.class);
        Assertions.assertEquals("jqul", model.name());
    }

    @Test
    public void testSerialize() {
        ResourceSku model = new ResourceSku().withName("jqul");
        model = BinaryData.fromObject(model).toObject(ResourceSku.class);
        Assertions.assertEquals("jqul", model.name());
    }
}
