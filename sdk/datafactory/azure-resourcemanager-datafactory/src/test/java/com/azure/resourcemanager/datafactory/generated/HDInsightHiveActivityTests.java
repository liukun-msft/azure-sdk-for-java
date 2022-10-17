// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ActivityDependency;
import com.azure.resourcemanager.datafactory.models.ActivityPolicy;
import com.azure.resourcemanager.datafactory.models.DependencyCondition;
import com.azure.resourcemanager.datafactory.models.HDInsightActivityDebugInfoOption;
import com.azure.resourcemanager.datafactory.models.HDInsightHiveActivity;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.UserProperty;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class HDInsightHiveActivityTests {
    @Test
    public void testDeserialize() {
        HDInsightHiveActivity model =
            BinaryData
                .fromString(
                    "{\"type\":\"HDInsightHive\",\"typeProperties\":{\"storageLinkedServices\":[{\"referenceName\":\"owwzkyfwnwpi\",\"parameters\":{}}],\"arguments\":[],\"getDebugInfo\":\"Failure\",\"scriptLinkedService\":{\"referenceName\":\"p\",\"parameters\":{}},\"defines\":{},\"variables\":[],\"queryTimeout\":1978269094},\"linkedServiceName\":{\"referenceName\":\"jvskwsdgkjg\",\"parameters\":{}},\"policy\":{\"retryIntervalInSeconds\":673033412,\"secureInput\":true,\"secureOutput\":true,\"\":{}},\"name\":\"o\",\"description\":\"woqartwy\",\"dependsOn\":[{\"activity\":\"cladvatdavuqmcb\",\"dependencyConditions\":[\"Failed\",\"Completed\",\"Succeeded\"],\"\":{}}],\"userProperties\":[{\"name\":\"uvjezcjumvps\"},{\"name\":\"mioyo\"}],\"\":{}}")
                .toObject(HDInsightHiveActivity.class);
        Assertions.assertEquals("o", model.name());
        Assertions.assertEquals("woqartwy", model.description());
        Assertions.assertEquals("cladvatdavuqmcb", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.FAILED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("uvjezcjumvps", model.userProperties().get(0).name());
        Assertions.assertEquals("jvskwsdgkjg", model.linkedServiceName().referenceName());
        Assertions.assertEquals(673033412, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(true, model.policy().secureInput());
        Assertions.assertEquals(true, model.policy().secureOutput());
        Assertions.assertEquals("owwzkyfwnwpi", model.storageLinkedServices().get(0).referenceName());
        Assertions.assertEquals(HDInsightActivityDebugInfoOption.FAILURE, model.getDebugInfo());
        Assertions.assertEquals("p", model.scriptLinkedService().referenceName());
        Assertions.assertEquals(1978269094, model.queryTimeout());
    }

    @Test
    public void testSerialize() {
        HDInsightHiveActivity model =
            new HDInsightHiveActivity()
                .withName("o")
                .withDescription("woqartwy")
                .withDependsOn(
                    Arrays
                        .asList(
                            new ActivityDependency()
                                .withActivity("cladvatdavuqmcb")
                                .withDependencyConditions(
                                    Arrays
                                        .asList(
                                            DependencyCondition.FAILED,
                                            DependencyCondition.COMPLETED,
                                            DependencyCondition.SUCCEEDED))
                                .withAdditionalProperties(mapOf())))
                .withUserProperties(
                    Arrays.asList(new UserProperty().withName("uvjezcjumvps"), new UserProperty().withName("mioyo")))
                .withLinkedServiceName(
                    new LinkedServiceReference().withReferenceName("jvskwsdgkjg").withParameters(mapOf()))
                .withPolicy(
                    new ActivityPolicy()
                        .withRetryIntervalInSeconds(673033412)
                        .withSecureInput(true)
                        .withSecureOutput(true)
                        .withAdditionalProperties(mapOf()))
                .withStorageLinkedServices(
                    Arrays
                        .asList(new LinkedServiceReference().withReferenceName("owwzkyfwnwpi").withParameters(mapOf())))
                .withArguments(Arrays.asList())
                .withGetDebugInfo(HDInsightActivityDebugInfoOption.FAILURE)
                .withScriptLinkedService(new LinkedServiceReference().withReferenceName("p").withParameters(mapOf()))
                .withDefines(mapOf())
                .withVariables(Arrays.asList())
                .withQueryTimeout(1978269094);
        model = BinaryData.fromObject(model).toObject(HDInsightHiveActivity.class);
        Assertions.assertEquals("o", model.name());
        Assertions.assertEquals("woqartwy", model.description());
        Assertions.assertEquals("cladvatdavuqmcb", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.FAILED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("uvjezcjumvps", model.userProperties().get(0).name());
        Assertions.assertEquals("jvskwsdgkjg", model.linkedServiceName().referenceName());
        Assertions.assertEquals(673033412, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(true, model.policy().secureInput());
        Assertions.assertEquals(true, model.policy().secureOutput());
        Assertions.assertEquals("owwzkyfwnwpi", model.storageLinkedServices().get(0).referenceName());
        Assertions.assertEquals(HDInsightActivityDebugInfoOption.FAILURE, model.getDebugInfo());
        Assertions.assertEquals("p", model.scriptLinkedService().referenceName());
        Assertions.assertEquals(1978269094, model.queryTimeout());
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
