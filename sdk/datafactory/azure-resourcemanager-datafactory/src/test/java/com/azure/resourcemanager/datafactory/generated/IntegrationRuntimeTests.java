// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntime;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class IntegrationRuntimeTests {
    @Test
    public void testDeserialize() {
        IntegrationRuntime model =
            BinaryData
                .fromString("{\"type\":\"IntegrationRuntime\",\"description\":\"svexcsonpclhoco\",\"\":{}}")
                .toObject(IntegrationRuntime.class);
        Assertions.assertEquals("svexcsonpclhoco", model.description());
    }

    @Test
    public void testSerialize() {
        IntegrationRuntime model =
            new IntegrationRuntime()
                .withDescription("svexcsonpclhoco")
                .withAdditionalProperties(mapOf("type", "IntegrationRuntime"));
        model = BinaryData.fromObject(model).toObject(IntegrationRuntime.class);
        Assertions.assertEquals("svexcsonpclhoco", model.description());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
