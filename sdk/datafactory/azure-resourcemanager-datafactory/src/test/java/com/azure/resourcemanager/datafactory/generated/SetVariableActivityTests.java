// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ActivityDependency;
import com.azure.resourcemanager.datafactory.models.DependencyCondition;
import com.azure.resourcemanager.datafactory.models.SetVariableActivity;
import com.azure.resourcemanager.datafactory.models.UserProperty;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class SetVariableActivityTests {
    @Test
    public void testDeserialize() {
        SetVariableActivity model =
            BinaryData
                .fromString(
                    "{\"type\":\"SetVariable\",\"typeProperties\":{\"variableName\":\"gbvm\"},\"name\":\"wrqbebjnfv\",\"description\":\"labt\",\"dependsOn\":[{\"activity\":\"iwznht\",\"dependencyConditions\":[\"Skipped\",\"Skipped\"],\"\":{}},{\"activity\":\"dyhi\",\"dependencyConditions\":[\"Failed\",\"Failed\"],\"\":{}},{\"activity\":\"uhbcak\",\"dependencyConditions\":[\"Completed\",\"Succeeded\"],\"\":{}},{\"activity\":\"oitwhrjsdmmazdnc\",\"dependencyConditions\":[\"Succeeded\"],\"\":{}}],\"userProperties\":[{\"name\":\"lhzqpxzbawkikcdg\"},{\"name\":\"hbssdpjeyo\"}],\"\":{}}")
                .toObject(SetVariableActivity.class);
        Assertions.assertEquals("wrqbebjnfv", model.name());
        Assertions.assertEquals("labt", model.description());
        Assertions.assertEquals("iwznht", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.SKIPPED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("lhzqpxzbawkikcdg", model.userProperties().get(0).name());
        Assertions.assertEquals("gbvm", model.variableName());
    }

    @Test
    public void testSerialize() {
        SetVariableActivity model =
            new SetVariableActivity()
                .withName("wrqbebjnfv")
                .withDescription("labt")
                .withDependsOn(
                    Arrays
                        .asList(
                            new ActivityDependency()
                                .withActivity("iwznht")
                                .withDependencyConditions(
                                    Arrays.asList(DependencyCondition.SKIPPED, DependencyCondition.SKIPPED))
                                .withAdditionalProperties(mapOf()),
                            new ActivityDependency()
                                .withActivity("dyhi")
                                .withDependencyConditions(
                                    Arrays.asList(DependencyCondition.FAILED, DependencyCondition.FAILED))
                                .withAdditionalProperties(mapOf()),
                            new ActivityDependency()
                                .withActivity("uhbcak")
                                .withDependencyConditions(
                                    Arrays.asList(DependencyCondition.COMPLETED, DependencyCondition.SUCCEEDED))
                                .withAdditionalProperties(mapOf()),
                            new ActivityDependency()
                                .withActivity("oitwhrjsdmmazdnc")
                                .withDependencyConditions(Arrays.asList(DependencyCondition.SUCCEEDED))
                                .withAdditionalProperties(mapOf())))
                .withUserProperties(
                    Arrays
                        .asList(
                            new UserProperty().withName("lhzqpxzbawkikcdg"), new UserProperty().withName("hbssdpjeyo")))
                .withVariableName("gbvm");
        model = BinaryData.fromObject(model).toObject(SetVariableActivity.class);
        Assertions.assertEquals("wrqbebjnfv", model.name());
        Assertions.assertEquals("labt", model.description());
        Assertions.assertEquals("iwznht", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.SKIPPED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("lhzqpxzbawkikcdg", model.userProperties().get(0).name());
        Assertions.assertEquals("gbvm", model.variableName());
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
