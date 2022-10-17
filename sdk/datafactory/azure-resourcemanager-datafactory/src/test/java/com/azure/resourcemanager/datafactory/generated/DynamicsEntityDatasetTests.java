// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.DynamicsEntityDataset;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DynamicsEntityDatasetTests {
    @Test
    public void testDeserialize() {
        DynamicsEntityDataset model =
            BinaryData
                .fromString(
                    "{\"type\":\"DynamicsEntity\",\"typeProperties\":{},\"description\":\"nmpqoxwdofdb\",\"linkedServiceName\":{\"referenceName\":\"xeiiq\",\"parameters\":{}},\"parameters\":{\"winhehfqpo\":{\"type\":\"Float\"},\"bcblemb\":{\"type\":\"Array\"}},\"annotations\":[],\"folder\":{\"name\":\"qvxkd\"},\"\":{}}")
                .toObject(DynamicsEntityDataset.class);
        Assertions.assertEquals("nmpqoxwdofdb", model.description());
        Assertions.assertEquals("xeiiq", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.FLOAT, model.parameters().get("winhehfqpo").type());
        Assertions.assertEquals("qvxkd", model.folder().name());
    }

    @Test
    public void testSerialize() {
        DynamicsEntityDataset model =
            new DynamicsEntityDataset()
                .withDescription("nmpqoxwdofdb")
                .withLinkedServiceName(new LinkedServiceReference().withReferenceName("xeiiq").withParameters(mapOf()))
                .withParameters(
                    mapOf(
                        "winhehfqpo",
                        new ParameterSpecification().withType(ParameterType.FLOAT),
                        "bcblemb",
                        new ParameterSpecification().withType(ParameterType.ARRAY)))
                .withAnnotations(Arrays.asList())
                .withFolder(new DatasetFolder().withName("qvxkd"));
        model = BinaryData.fromObject(model).toObject(DynamicsEntityDataset.class);
        Assertions.assertEquals("nmpqoxwdofdb", model.description());
        Assertions.assertEquals("xeiiq", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.FLOAT, model.parameters().get("winhehfqpo").type());
        Assertions.assertEquals("qvxkd", model.folder().name());
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
