// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.CustomActivityTypeProperties;
import com.azure.resourcemanager.datafactory.models.CustomActivityReferenceObject;
import com.azure.resourcemanager.datafactory.models.DatasetReference;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class CustomActivityTypePropertiesTests {
    @Test
    public void testDeserialize() {
        CustomActivityTypeProperties model =
            BinaryData
                .fromString(
                    "{\"resourceLinkedService\":{\"referenceName\":\"prlkdne\",\"parameters\":{}},\"referenceObjects\":{\"linkedServices\":[{\"referenceName\":\"ivcbkutpumltwj\",\"parameters\":{}},{\"referenceName\":\"uxynb\",\"parameters\":{}},{\"referenceName\":\"zlqywauyqn\",\"parameters\":{}},{\"referenceName\":\"khmocgjs\",\"parameters\":{}}],\"datasets\":[{\"referenceName\":\"a\",\"parameters\":{}}]},\"extendedProperties\":{}}")
                .toObject(CustomActivityTypeProperties.class);
        Assertions.assertEquals("prlkdne", model.resourceLinkedService().referenceName());
        Assertions.assertEquals("ivcbkutpumltwj", model.referenceObjects().linkedServices().get(0).referenceName());
        Assertions.assertEquals("a", model.referenceObjects().datasets().get(0).referenceName());
    }

    @Test
    public void testSerialize() {
        CustomActivityTypeProperties model =
            new CustomActivityTypeProperties()
                .withResourceLinkedService(
                    new LinkedServiceReference().withReferenceName("prlkdne").withParameters(mapOf()))
                .withReferenceObjects(
                    new CustomActivityReferenceObject()
                        .withLinkedServices(
                            Arrays
                                .asList(
                                    new LinkedServiceReference()
                                        .withReferenceName("ivcbkutpumltwj")
                                        .withParameters(mapOf()),
                                    new LinkedServiceReference().withReferenceName("uxynb").withParameters(mapOf()),
                                    new LinkedServiceReference()
                                        .withReferenceName("zlqywauyqn")
                                        .withParameters(mapOf()),
                                    new LinkedServiceReference().withReferenceName("khmocgjs").withParameters(mapOf())))
                        .withDatasets(
                            Arrays.asList(new DatasetReference().withReferenceName("a").withParameters(mapOf()))))
                .withExtendedProperties(mapOf());
        model = BinaryData.fromObject(model).toObject(CustomActivityTypeProperties.class);
        Assertions.assertEquals("prlkdne", model.resourceLinkedService().referenceName());
        Assertions.assertEquals("ivcbkutpumltwj", model.referenceObjects().linkedServices().get(0).referenceName());
        Assertions.assertEquals("a", model.referenceObjects().datasets().get(0).referenceName());
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
