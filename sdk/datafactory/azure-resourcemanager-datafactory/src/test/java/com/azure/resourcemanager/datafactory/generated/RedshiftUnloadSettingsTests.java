// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.RedshiftUnloadSettings;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class RedshiftUnloadSettingsTests {
    @Test
    public void testDeserialize() {
        RedshiftUnloadSettings model =
            BinaryData
                .fromString("{\"s3LinkedServiceName\":{\"referenceName\":\"kxxkan\",\"parameters\":{}}}")
                .toObject(RedshiftUnloadSettings.class);
        Assertions.assertEquals("kxxkan", model.s3LinkedServiceName().referenceName());
    }

    @Test
    public void testSerialize() {
        RedshiftUnloadSettings model =
            new RedshiftUnloadSettings()
                .withS3LinkedServiceName(
                    new LinkedServiceReference().withReferenceName("kxxkan").withParameters(mapOf()));
        model = BinaryData.fromObject(model).toObject(RedshiftUnloadSettings.class);
        Assertions.assertEquals("kxxkan", model.s3LinkedServiceName().referenceName());
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
