// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.CouchbaseLinkedServiceTypeProperties;
import com.azure.resourcemanager.datafactory.models.AzureKeyVaultSecretReference;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class CouchbaseLinkedServiceTypePropertiesTests {
    @Test
    public void testDeserialize() {
        CouchbaseLinkedServiceTypeProperties model =
            BinaryData
                .fromString(
                    "{\"credString\":{\"type\":\"AzureKeyVaultSecret\",\"store\":{\"referenceName\":\"pjpbibnzpp\",\"parameters\":{}}}}")
                .toObject(CouchbaseLinkedServiceTypeProperties.class);
        Assertions.assertEquals("pjpbibnzpp", model.credString().store().referenceName());
    }

    @Test
    public void testSerialize() {
        CouchbaseLinkedServiceTypeProperties model =
            new CouchbaseLinkedServiceTypeProperties()
                .withCredString(
                    new AzureKeyVaultSecretReference()
                        .withStore(
                            new LinkedServiceReference().withReferenceName("pjpbibnzpp").withParameters(mapOf())));
        model = BinaryData.fromObject(model).toObject(CouchbaseLinkedServiceTypeProperties.class);
        Assertions.assertEquals("pjpbibnzpp", model.credString().store().referenceName());
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
