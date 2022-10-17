// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.DataLakeAnalyticsUsqlActivityTypeProperties;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DataLakeAnalyticsUsqlActivityTypePropertiesTests {
    @Test
    public void testDeserialize() {
        DataLakeAnalyticsUsqlActivityTypeProperties model =
            BinaryData
                .fromString(
                    "{\"scriptLinkedService\":{\"referenceName\":\"kahmjedbiucvkhhw\",\"parameters\":{}},\"parameters\":{}}")
                .toObject(DataLakeAnalyticsUsqlActivityTypeProperties.class);
        Assertions.assertEquals("kahmjedbiucvkhhw", model.scriptLinkedService().referenceName());
    }

    @Test
    public void testSerialize() {
        DataLakeAnalyticsUsqlActivityTypeProperties model =
            new DataLakeAnalyticsUsqlActivityTypeProperties()
                .withScriptLinkedService(
                    new LinkedServiceReference().withReferenceName("kahmjedbiucvkhhw").withParameters(mapOf()))
                .withParameters(mapOf());
        model = BinaryData.fromObject(model).toObject(DataLakeAnalyticsUsqlActivityTypeProperties.class);
        Assertions.assertEquals("kahmjedbiucvkhhw", model.scriptLinkedService().referenceName());
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
