// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import com.azure.resourcemanager.datafactory.models.SalesforceServiceCloudObjectDataset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class SalesforceServiceCloudObjectDatasetTests {
    @Test
    public void testDeserialize() {
        SalesforceServiceCloudObjectDataset model =
            BinaryData
                .fromString(
                    "{\"type\":\"SalesforceServiceCloudObject\",\"typeProperties\":{},\"description\":\"gfugsnnfhyet\",\"linkedServiceName\":{\"referenceName\":\"pococtfjgt\",\"parameters\":{}},\"parameters\":{\"yturmlmuo\":{\"type\":\"String\"},\"bauiropi\":{\"type\":\"Float\"},\"zonwpngajinnixj\":{\"type\":\"SecureString\"}},\"annotations\":[],\"folder\":{\"name\":\"jfjmyccxlzh\"},\"\":{}}")
                .toObject(SalesforceServiceCloudObjectDataset.class);
        Assertions.assertEquals("gfugsnnfhyet", model.description());
        Assertions.assertEquals("pococtfjgt", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.STRING, model.parameters().get("yturmlmuo").type());
        Assertions.assertEquals("jfjmyccxlzh", model.folder().name());
    }

    @Test
    public void testSerialize() {
        SalesforceServiceCloudObjectDataset model =
            new SalesforceServiceCloudObjectDataset()
                .withDescription("gfugsnnfhyet")
                .withLinkedServiceName(
                    new LinkedServiceReference().withReferenceName("pococtfjgt").withParameters(mapOf()))
                .withParameters(
                    mapOf(
                        "yturmlmuo",
                        new ParameterSpecification().withType(ParameterType.STRING),
                        "bauiropi",
                        new ParameterSpecification().withType(ParameterType.FLOAT),
                        "zonwpngajinnixj",
                        new ParameterSpecification().withType(ParameterType.SECURE_STRING)))
                .withAnnotations(Arrays.asList())
                .withFolder(new DatasetFolder().withName("jfjmyccxlzh"));
        model = BinaryData.fromObject(model).toObject(SalesforceServiceCloudObjectDataset.class);
        Assertions.assertEquals("gfugsnnfhyet", model.description());
        Assertions.assertEquals("pococtfjgt", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.STRING, model.parameters().get("yturmlmuo").type());
        Assertions.assertEquals("jfjmyccxlzh", model.folder().name());
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
