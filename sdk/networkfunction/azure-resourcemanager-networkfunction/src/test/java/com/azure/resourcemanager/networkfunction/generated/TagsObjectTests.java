// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkfunction.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.networkfunction.models.TagsObject;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class TagsObjectTests {
    @Test
    public void testDeserialize() {
        TagsObject model =
            BinaryData
                .fromString(
                    "{\"tags\":{\"fxxypininmayhuy\":\"ofpdvh\",\"mihe\":\"bkpodepooginuv\",\"usivye\":\"gnarxzxtheo\",\"nfygxgispemvtz\":\"cciqihnhungbwjz\"}}")
                .toObject(TagsObject.class);
        Assertions.assertEquals("ofpdvh", model.tags().get("fxxypininmayhuy"));
    }

    @Test
    public void testSerialize() {
        TagsObject model =
            new TagsObject()
                .withTags(
                    mapOf(
                        "fxxypininmayhuy",
                        "ofpdvh",
                        "mihe",
                        "bkpodepooginuv",
                        "usivye",
                        "gnarxzxtheo",
                        "nfygxgispemvtz",
                        "cciqihnhungbwjz"));
        model = BinaryData.fromObject(model).toObject(TagsObject.class);
        Assertions.assertEquals("ofpdvh", model.tags().get("fxxypininmayhuy"));
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
