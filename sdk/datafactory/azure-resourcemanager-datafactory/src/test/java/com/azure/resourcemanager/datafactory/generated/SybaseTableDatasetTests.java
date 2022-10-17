// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import com.azure.resourcemanager.datafactory.models.SybaseTableDataset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class SybaseTableDatasetTests {
    @Test
    public void testDeserialize() {
        SybaseTableDataset model =
            BinaryData
                .fromString(
                    "{\"type\":\"SybaseTable\",\"typeProperties\":{},\"description\":\"khenlus\",\"linkedServiceName\":{\"referenceName\":\"dtjxtxrdcqt\",\"parameters\":{}},\"parameters\":{\"epu\":{\"type\":\"Float\"},\"yjtcvuwk\":{\"type\":\"SecureString\"},\"zies\":{\"type\":\"Object\"},\"ghtuqfecjxey\":{\"type\":\"SecureString\"}},\"annotations\":[],\"folder\":{\"name\":\"uicbuewmrsw\"},\"\":{}}")
                .toObject(SybaseTableDataset.class);
        Assertions.assertEquals("khenlus", model.description());
        Assertions.assertEquals("dtjxtxrdcqt", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.FLOAT, model.parameters().get("epu").type());
        Assertions.assertEquals("uicbuewmrsw", model.folder().name());
    }

    @Test
    public void testSerialize() {
        SybaseTableDataset model =
            new SybaseTableDataset()
                .withDescription("khenlus")
                .withLinkedServiceName(
                    new LinkedServiceReference().withReferenceName("dtjxtxrdcqt").withParameters(mapOf()))
                .withParameters(
                    mapOf(
                        "epu",
                        new ParameterSpecification().withType(ParameterType.FLOAT),
                        "yjtcvuwk",
                        new ParameterSpecification().withType(ParameterType.SECURE_STRING),
                        "zies",
                        new ParameterSpecification().withType(ParameterType.OBJECT),
                        "ghtuqfecjxey",
                        new ParameterSpecification().withType(ParameterType.SECURE_STRING)))
                .withAnnotations(Arrays.asList())
                .withFolder(new DatasetFolder().withName("uicbuewmrsw"));
        model = BinaryData.fromObject(model).toObject(SybaseTableDataset.class);
        Assertions.assertEquals("khenlus", model.description());
        Assertions.assertEquals("dtjxtxrdcqt", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.FLOAT, model.parameters().get("epu").type());
        Assertions.assertEquals("uicbuewmrsw", model.folder().name());
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
