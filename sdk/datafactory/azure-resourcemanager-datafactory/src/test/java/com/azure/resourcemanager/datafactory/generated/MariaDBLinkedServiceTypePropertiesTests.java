// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.MariaDBLinkedServiceTypeProperties;
import com.azure.resourcemanager.datafactory.models.AzureKeyVaultSecretReference;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class MariaDBLinkedServiceTypePropertiesTests {
    @Test
    public void testDeserialize() {
        MariaDBLinkedServiceTypeProperties model =
            BinaryData
                .fromString(
                    "{\"pwd\":{\"type\":\"AzureKeyVaultSecret\",\"store\":{\"referenceName\":\"agjfwyyrlhgenuze\",\"parameters\":{}}}}")
                .toObject(MariaDBLinkedServiceTypeProperties.class);
        Assertions.assertEquals("agjfwyyrlhgenuze", model.pwd().store().referenceName());
    }

    @Test
    public void testSerialize() {
        MariaDBLinkedServiceTypeProperties model =
            new MariaDBLinkedServiceTypeProperties()
                .withPwd(
                    new AzureKeyVaultSecretReference()
                        .withStore(
                            new LinkedServiceReference()
                                .withReferenceName("agjfwyyrlhgenuze")
                                .withParameters(mapOf())));
        model = BinaryData.fromObject(model).toObject(MariaDBLinkedServiceTypeProperties.class);
        Assertions.assertEquals("agjfwyyrlhgenuze", model.pwd().store().referenceName());
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
