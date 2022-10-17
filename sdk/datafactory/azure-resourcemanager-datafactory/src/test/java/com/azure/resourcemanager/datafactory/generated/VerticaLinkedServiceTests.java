// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AzureKeyVaultSecretReference;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import com.azure.resourcemanager.datafactory.models.VerticaLinkedService;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class VerticaLinkedServiceTests {
    @Test
    public void testDeserialize() {
        VerticaLinkedService model =
            BinaryData
                .fromString(
                    "{\"type\":\"Vertica\",\"typeProperties\":{\"pwd\":{\"type\":\"AzureKeyVaultSecret\"}},\"connectVia\":{\"referenceName\":\"tzlnglxpn\",\"parameters\":{}},\"description\":\"anfbc\",\"parameters\":{\"ywv\":{\"type\":\"SecureString\"},\"gvjrktpgaeuky\":{\"type\":\"Float\"},\"hpmwhqnucsk\":{\"type\":\"Object\"}},\"annotations\":[],\"\":{}}")
                .toObject(VerticaLinkedService.class);
        Assertions.assertEquals("tzlnglxpn", model.connectVia().referenceName());
        Assertions.assertEquals("anfbc", model.description());
        Assertions.assertEquals(ParameterType.SECURE_STRING, model.parameters().get("ywv").type());
    }

    @Test
    public void testSerialize() {
        VerticaLinkedService model =
            new VerticaLinkedService()
                .withConnectVia(
                    new IntegrationRuntimeReference().withReferenceName("tzlnglxpn").withParameters(mapOf()))
                .withDescription("anfbc")
                .withParameters(
                    mapOf(
                        "ywv",
                        new ParameterSpecification().withType(ParameterType.SECURE_STRING),
                        "gvjrktpgaeuky",
                        new ParameterSpecification().withType(ParameterType.FLOAT),
                        "hpmwhqnucsk",
                        new ParameterSpecification().withType(ParameterType.OBJECT)))
                .withAnnotations(Arrays.asList())
                .withPwd(new AzureKeyVaultSecretReference());
        model = BinaryData.fromObject(model).toObject(VerticaLinkedService.class);
        Assertions.assertEquals("tzlnglxpn", model.connectVia().referenceName());
        Assertions.assertEquals("anfbc", model.description());
        Assertions.assertEquals(ParameterType.SECURE_STRING, model.parameters().get("ywv").type());
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
