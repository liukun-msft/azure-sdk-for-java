// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ActivityDependency;
import com.azure.resourcemanager.datafactory.models.ActivityPolicy;
import com.azure.resourcemanager.datafactory.models.DependencyCondition;
import com.azure.resourcemanager.datafactory.models.HDInsightActivityDebugInfoOption;
import com.azure.resourcemanager.datafactory.models.HDInsightSparkActivity;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.UserProperty;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class HDInsightSparkActivityTests {
    @Test
    public void testDeserialize() {
        HDInsightSparkActivity model =
            BinaryData
                .fromString(
                    "{\"type\":\"HDInsightSpark\",\"typeProperties\":{\"arguments\":[],\"getDebugInfo\":\"None\",\"sparkJobLinkedService\":{\"referenceName\":\"knkob\",\"parameters\":{}},\"className\":\"b\",\"sparkConfig\":{}},\"linkedServiceName\":{\"referenceName\":\"zamicb\",\"parameters\":{}},\"policy\":{\"retryIntervalInSeconds\":646138115,\"secureInput\":true,\"secureOutput\":false,\"\":{}},\"name\":\"euairaabmdlqjb\",\"description\":\"pfixlhupmo\",\"dependsOn\":[{\"activity\":\"z\",\"dependencyConditions\":[\"Succeeded\",\"Succeeded\",\"Failed\"],\"\":{}},{\"activity\":\"cdpreyxelyicg\",\"dependencyConditions\":[\"Skipped\"],\"\":{}},{\"activity\":\"fss\",\"dependencyConditions\":[\"Completed\",\"Failed\"],\"\":{}}],\"userProperties\":[{\"name\":\"kb\"},{\"name\":\"ammgmqfmefgv\"},{\"name\":\"cpdwjgquxwey\"}],\"\":{}}")
                .toObject(HDInsightSparkActivity.class);
        Assertions.assertEquals("euairaabmdlqjb", model.name());
        Assertions.assertEquals("pfixlhupmo", model.description());
        Assertions.assertEquals("z", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.SUCCEEDED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("kb", model.userProperties().get(0).name());
        Assertions.assertEquals("zamicb", model.linkedServiceName().referenceName());
        Assertions.assertEquals(646138115, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(true, model.policy().secureInput());
        Assertions.assertEquals(false, model.policy().secureOutput());
        Assertions.assertEquals(HDInsightActivityDebugInfoOption.NONE, model.getDebugInfo());
        Assertions.assertEquals("knkob", model.sparkJobLinkedService().referenceName());
        Assertions.assertEquals("b", model.className());
    }

    @Test
    public void testSerialize() {
        HDInsightSparkActivity model =
            new HDInsightSparkActivity()
                .withName("euairaabmdlqjb")
                .withDescription("pfixlhupmo")
                .withDependsOn(
                    Arrays
                        .asList(
                            new ActivityDependency()
                                .withActivity("z")
                                .withDependencyConditions(
                                    Arrays
                                        .asList(
                                            DependencyCondition.SUCCEEDED,
                                            DependencyCondition.SUCCEEDED,
                                            DependencyCondition.FAILED))
                                .withAdditionalProperties(mapOf()),
                            new ActivityDependency()
                                .withActivity("cdpreyxelyicg")
                                .withDependencyConditions(Arrays.asList(DependencyCondition.SKIPPED))
                                .withAdditionalProperties(mapOf()),
                            new ActivityDependency()
                                .withActivity("fss")
                                .withDependencyConditions(
                                    Arrays.asList(DependencyCondition.COMPLETED, DependencyCondition.FAILED))
                                .withAdditionalProperties(mapOf())))
                .withUserProperties(
                    Arrays
                        .asList(
                            new UserProperty().withName("kb"),
                            new UserProperty().withName("ammgmqfmefgv"),
                            new UserProperty().withName("cpdwjgquxwey")))
                .withLinkedServiceName(new LinkedServiceReference().withReferenceName("zamicb").withParameters(mapOf()))
                .withPolicy(
                    new ActivityPolicy()
                        .withRetryIntervalInSeconds(646138115)
                        .withSecureInput(true)
                        .withSecureOutput(false)
                        .withAdditionalProperties(mapOf()))
                .withArguments(Arrays.asList())
                .withGetDebugInfo(HDInsightActivityDebugInfoOption.NONE)
                .withSparkJobLinkedService(
                    new LinkedServiceReference().withReferenceName("knkob").withParameters(mapOf()))
                .withClassName("b")
                .withSparkConfig(mapOf());
        model = BinaryData.fromObject(model).toObject(HDInsightSparkActivity.class);
        Assertions.assertEquals("euairaabmdlqjb", model.name());
        Assertions.assertEquals("pfixlhupmo", model.description());
        Assertions.assertEquals("z", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.SUCCEEDED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("kb", model.userProperties().get(0).name());
        Assertions.assertEquals("zamicb", model.linkedServiceName().referenceName());
        Assertions.assertEquals(646138115, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(true, model.policy().secureInput());
        Assertions.assertEquals(false, model.policy().secureOutput());
        Assertions.assertEquals(HDInsightActivityDebugInfoOption.NONE, model.getDebugInfo());
        Assertions.assertEquals("knkob", model.sparkJobLinkedService().referenceName());
        Assertions.assertEquals("b", model.className());
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
