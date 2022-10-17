// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.CopyTranslator;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

public final class CopyTranslatorTests {
    @Test
    public void testDeserialize() {
        CopyTranslator model =
            BinaryData.fromString("{\"type\":\"CopyTranslator\",\"\":{}}").toObject(CopyTranslator.class);
    }

    @Test
    public void testSerialize() {
        CopyTranslator model = new CopyTranslator().withAdditionalProperties(mapOf("type", "CopyTranslator"));
        model = BinaryData.fromObject(model).toObject(CopyTranslator.class);
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
