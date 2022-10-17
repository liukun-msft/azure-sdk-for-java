// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.CosmosDbMongoDbApiSource;
import com.azure.resourcemanager.datafactory.models.MongoDbCursorMethodsProperties;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

public final class CosmosDbMongoDbApiSourceTests {
    @Test
    public void testDeserialize() {
        CosmosDbMongoDbApiSource model =
            BinaryData
                .fromString("{\"type\":\"CosmosDbMongoDbApiSource\",\"cursorMethods\":{\"\":{}},\"\":{}}")
                .toObject(CosmosDbMongoDbApiSource.class);
    }

    @Test
    public void testSerialize() {
        CosmosDbMongoDbApiSource model =
            new CosmosDbMongoDbApiSource()
                .withCursorMethods(new MongoDbCursorMethodsProperties().withAdditionalProperties(mapOf()));
        model = BinaryData.fromObject(model).toObject(CosmosDbMongoDbApiSource.class);
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
