// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ActivityRun;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

public final class ActivityRunTests {
    @Test
    public void testDeserialize() {
        ActivityRun model =
            BinaryData
                .fromString(
                    "{\"pipelineName\":\"cvokotllxdyhg\",\"pipelineRunId\":\"ocogj\",\"activityName\":\"dtbnnha\",\"activityType\":\"ocrkvcikh\",\"activityRunId\":\"p\",\"linkedServiceName\":\"qgxqquezikyw\",\"status\":\"xkalla\",\"activityRunStart\":\"2021-05-13T13:09:28Z\",\"activityRunEnd\":\"2021-10-17T13:51:53Z\",\"durationInMs\":1138450132,\"\":{}}")
                .toObject(ActivityRun.class);
    }

    @Test
    public void testSerialize() {
        ActivityRun model =
            new ActivityRun()
                .withAdditionalProperties(
                    mapOf(
                        "pipelineName",
                        "cvokotllxdyhg",
                        "activityRunId",
                        "p",
                        "durationInMs",
                        1138450132,
                        "linkedServiceName",
                        "qgxqquezikyw",
                        "pipelineRunId",
                        "ocogj",
                        "activityRunStart",
                        "2021-05-13T13:09:28Z",
                        "activityRunEnd",
                        "2021-10-17T13:51:53Z",
                        "activityName",
                        "dtbnnha",
                        "activityType",
                        "ocrkvcikh",
                        "status",
                        "xkalla"));
        model = BinaryData.fromObject(model).toObject(ActivityRun.class);
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
