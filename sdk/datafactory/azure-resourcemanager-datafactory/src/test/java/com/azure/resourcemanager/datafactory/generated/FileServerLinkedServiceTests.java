// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.FileServerLinkedService;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class FileServerLinkedServiceTests {
    @Test
    public void testDeserialize() {
        FileServerLinkedService model =
            BinaryData
                .fromString(
                    "{\"type\":\"FileServer\",\"typeProperties\":{\"password\":{\"type\":\"SecretBase\"}},\"connectVia\":{\"referenceName\":\"yibngqladywrxwh\",\"parameters\":{}},\"description\":\"uvvadswzsnu\",\"parameters\":{\"wuowhlxlnwy\":{\"type\":\"Object\"},\"uvblg\":{\"type\":\"Float\"},\"zkltrfowtdvrfmv\":{\"type\":\"Int\"}},\"annotations\":[],\"\":{}}")
                .toObject(FileServerLinkedService.class);
        Assertions.assertEquals("yibngqladywrxwh", model.connectVia().referenceName());
        Assertions.assertEquals("uvvadswzsnu", model.description());
        Assertions.assertEquals(ParameterType.OBJECT, model.parameters().get("wuowhlxlnwy").type());
    }

    @Test
    public void testSerialize() {
        FileServerLinkedService model =
            new FileServerLinkedService()
                .withConnectVia(
                    new IntegrationRuntimeReference().withReferenceName("yibngqladywrxwh").withParameters(mapOf()))
                .withDescription("uvvadswzsnu")
                .withParameters(
                    mapOf(
                        "wuowhlxlnwy",
                        new ParameterSpecification().withType(ParameterType.OBJECT),
                        "uvblg",
                        new ParameterSpecification().withType(ParameterType.FLOAT),
                        "zkltrfowtdvrfmv",
                        new ParameterSpecification().withType(ParameterType.INT)))
                .withAnnotations(Arrays.asList())
                .withPassword(new SecretBase());
        model = BinaryData.fromObject(model).toObject(FileServerLinkedService.class);
        Assertions.assertEquals("yibngqladywrxwh", model.connectVia().referenceName());
        Assertions.assertEquals("uvvadswzsnu", model.description());
        Assertions.assertEquals(ParameterType.OBJECT, model.parameters().get("wuowhlxlnwy").type());
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
