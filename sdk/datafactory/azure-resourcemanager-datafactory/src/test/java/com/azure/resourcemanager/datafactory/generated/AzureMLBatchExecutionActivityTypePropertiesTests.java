// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.AzureMLBatchExecutionActivityTypeProperties;
import com.azure.resourcemanager.datafactory.models.AzureMLWebServiceFile;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AzureMLBatchExecutionActivityTypePropertiesTests {
    @Test
    public void testDeserialize() {
        AzureMLBatchExecutionActivityTypeProperties model =
            BinaryData
                .fromString(
                    "{\"globalParameters\":{},\"webServiceOutputs\":{\"lblaxpegj\":{\"linkedServiceName\":{\"referenceName\":\"wgvydjufb\",\"parameters\":{}}}},\"webServiceInputs\":{\"xa\":{\"linkedServiceName\":{\"referenceName\":\"bal\",\"parameters\":{}}},\"tlbtlqho\":{\"linkedServiceName\":{\"referenceName\":\"lz\",\"parameters\":{}}},\"likyypzkgxfxfmyr\":{\"linkedServiceName\":{\"referenceName\":\"xouvmrs\",\"parameters\":{}}}}}")
                .toObject(AzureMLBatchExecutionActivityTypeProperties.class);
        Assertions
            .assertEquals("wgvydjufb", model.webServiceOutputs().get("lblaxpegj").linkedServiceName().referenceName());
        Assertions.assertEquals("bal", model.webServiceInputs().get("xa").linkedServiceName().referenceName());
    }

    @Test
    public void testSerialize() {
        AzureMLBatchExecutionActivityTypeProperties model =
            new AzureMLBatchExecutionActivityTypeProperties()
                .withGlobalParameters(mapOf())
                .withWebServiceOutputs(
                    mapOf(
                        "lblaxpegj",
                        new AzureMLWebServiceFile()
                            .withLinkedServiceName(
                                new LinkedServiceReference().withReferenceName("wgvydjufb").withParameters(mapOf()))))
                .withWebServiceInputs(
                    mapOf(
                        "xa",
                        new AzureMLWebServiceFile()
                            .withLinkedServiceName(
                                new LinkedServiceReference().withReferenceName("bal").withParameters(mapOf())),
                        "tlbtlqho",
                        new AzureMLWebServiceFile()
                            .withLinkedServiceName(
                                new LinkedServiceReference().withReferenceName("lz").withParameters(mapOf())),
                        "likyypzkgxfxfmyr",
                        new AzureMLWebServiceFile()
                            .withLinkedServiceName(
                                new LinkedServiceReference().withReferenceName("xouvmrs").withParameters(mapOf()))));
        model = BinaryData.fromObject(model).toObject(AzureMLBatchExecutionActivityTypeProperties.class);
        Assertions
            .assertEquals("wgvydjufb", model.webServiceOutputs().get("lblaxpegj").linkedServiceName().referenceName());
        Assertions.assertEquals("bal", model.webServiceInputs().get("xa").linkedServiceName().referenceName());
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
