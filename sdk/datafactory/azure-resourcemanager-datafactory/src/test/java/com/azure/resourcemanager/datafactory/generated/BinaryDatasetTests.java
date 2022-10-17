// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.BinaryDataset;
import com.azure.resourcemanager.datafactory.models.DatasetCompression;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.DatasetLocation;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class BinaryDatasetTests {
    @Test
    public void testDeserialize() {
        BinaryDataset model =
            BinaryData
                .fromString(
                    "{\"type\":\"Binary\",\"typeProperties\":{\"location\":{\"type\":\"DatasetLocation\",\"\":{}},\"compression\":{\"\":{}}},\"description\":\"twypundmbxh\",\"linkedServiceName\":{\"referenceName\":\"mjkavlgorbmft\",\"parameters\":{}},\"parameters\":{\"ltfvnz\":{\"type\":\"Bool\"},\"t\":{\"type\":\"Object\"},\"vopvp\":{\"type\":\"Array\"},\"zq\":{\"type\":\"Bool\"}},\"annotations\":[],\"folder\":{\"name\":\"edsvqwthmk\"},\"\":{}}")
                .toObject(BinaryDataset.class);
        Assertions.assertEquals("twypundmbxh", model.description());
        Assertions.assertEquals("mjkavlgorbmft", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.BOOL, model.parameters().get("ltfvnz").type());
        Assertions.assertEquals("edsvqwthmk", model.folder().name());
    }

    @Test
    public void testSerialize() {
        BinaryDataset model =
            new BinaryDataset()
                .withDescription("twypundmbxh")
                .withLinkedServiceName(
                    new LinkedServiceReference().withReferenceName("mjkavlgorbmft").withParameters(mapOf()))
                .withParameters(
                    mapOf(
                        "ltfvnz",
                        new ParameterSpecification().withType(ParameterType.BOOL),
                        "t",
                        new ParameterSpecification().withType(ParameterType.OBJECT),
                        "vopvp",
                        new ParameterSpecification().withType(ParameterType.ARRAY),
                        "zq",
                        new ParameterSpecification().withType(ParameterType.BOOL)))
                .withAnnotations(Arrays.asList())
                .withFolder(new DatasetFolder().withName("edsvqwthmk"))
                .withLocation(new DatasetLocation().withAdditionalProperties(mapOf("type", "DatasetLocation")))
                .withCompression(new DatasetCompression().withAdditionalProperties(mapOf()));
        model = BinaryData.fromObject(model).toObject(BinaryDataset.class);
        Assertions.assertEquals("twypundmbxh", model.description());
        Assertions.assertEquals("mjkavlgorbmft", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.BOOL, model.parameters().get("ltfvnz").type());
        Assertions.assertEquals("edsvqwthmk", model.folder().name());
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
