// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.BlockedTransformers;
import com.azure.resourcemanager.machinelearning.models.ColumnTransformer;
import com.azure.resourcemanager.machinelearning.models.FeaturizationMode;
import com.azure.resourcemanager.machinelearning.models.TableVerticalFeaturizationSettings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class TableVerticalFeaturizationSettingsTests {
    @Test
    public void testDeserialize() {
        TableVerticalFeaturizationSettings model =
            BinaryData
                .fromString(
                    "{\"blockedTransformers\":[\"TextTargetEncoder\"],\"columnNameAndTypes\":{\"qyv\":\"blhtjq\",\"a\":\"eh\"},\"enableDnnFeaturization\":false,\"mode\":\"Auto\",\"transformerParams\":{\"tjvv\":[{\"fields\":[\"usxivzrrryvei\",\"ipsk\"],\"parameters\":\"datazatvfuzka\"}]},\"datasetLanguage\":\"xwigsye\"}")
                .toObject(TableVerticalFeaturizationSettings.class);
        Assertions.assertEquals("xwigsye", model.datasetLanguage());
        Assertions.assertEquals(BlockedTransformers.TEXT_TARGET_ENCODER, model.blockedTransformers().get(0));
        Assertions.assertEquals("blhtjq", model.columnNameAndTypes().get("qyv"));
        Assertions.assertEquals(false, model.enableDnnFeaturization());
        Assertions.assertEquals(FeaturizationMode.AUTO, model.mode());
        Assertions.assertEquals("usxivzrrryvei", model.transformerParams().get("tjvv").get(0).fields().get(0));
    }

    @Test
    public void testSerialize() {
        TableVerticalFeaturizationSettings model =
            new TableVerticalFeaturizationSettings()
                .withDatasetLanguage("xwigsye")
                .withBlockedTransformers(Arrays.asList(BlockedTransformers.TEXT_TARGET_ENCODER))
                .withColumnNameAndTypes(mapOf("qyv", "blhtjq", "a", "eh"))
                .withEnableDnnFeaturization(false)
                .withMode(FeaturizationMode.AUTO)
                .withTransformerParams(
                    mapOf(
                        "tjvv",
                        Arrays
                            .asList(
                                new ColumnTransformer()
                                    .withFields(Arrays.asList("usxivzrrryvei", "ipsk"))
                                    .withParameters("datazatvfuzka"))));
        model = BinaryData.fromObject(model).toObject(TableVerticalFeaturizationSettings.class);
        Assertions.assertEquals("xwigsye", model.datasetLanguage());
        Assertions.assertEquals(BlockedTransformers.TEXT_TARGET_ENCODER, model.blockedTransformers().get(0));
        Assertions.assertEquals("blhtjq", model.columnNameAndTypes().get("qyv"));
        Assertions.assertEquals(false, model.enableDnnFeaturization());
        Assertions.assertEquals(FeaturizationMode.AUTO, model.mode());
        Assertions.assertEquals("usxivzrrryvei", model.transformerParams().get("tjvv").get(0).fields().get(0));
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
