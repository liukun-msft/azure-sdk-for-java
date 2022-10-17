// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ActivityDependency;
import com.azure.resourcemanager.datafactory.models.ActivityPolicy;
import com.azure.resourcemanager.datafactory.models.BigDataPoolParametrizationReference;
import com.azure.resourcemanager.datafactory.models.BigDataPoolReferenceType;
import com.azure.resourcemanager.datafactory.models.DependencyCondition;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.NotebookParameter;
import com.azure.resourcemanager.datafactory.models.NotebookParameterType;
import com.azure.resourcemanager.datafactory.models.NotebookReferenceType;
import com.azure.resourcemanager.datafactory.models.SynapseNotebookActivity;
import com.azure.resourcemanager.datafactory.models.SynapseNotebookReference;
import com.azure.resourcemanager.datafactory.models.UserProperty;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class SynapseNotebookActivityTests {
    @Test
    public void testDeserialize() {
        SynapseNotebookActivity model =
            BinaryData
                .fromString(
                    "{\"type\":\"SynapseNotebook\",\"typeProperties\":{\"notebook\":{\"type\":\"NotebookReference\"},\"sparkPool\":{\"type\":\"BigDataPoolReference\"},\"parameters\":{\"pwal\":{\"type\":\"string\"},\"gexojfccylhtrht\":{\"type\":\"bool\"},\"jpwexcdrz\":{\"type\":\"bool\"}},\"numExecutors\":1743776214},\"linkedServiceName\":{\"referenceName\":\"ezmnrkjgpjeuxsph\",\"parameters\":{}},\"policy\":{\"retryIntervalInSeconds\":1807346053,\"secureInput\":true,\"secureOutput\":true,\"\":{}},\"name\":\"bhwbdqufvcgnrgla\",\"description\":\"wyambhba\",\"dependsOn\":[{\"activity\":\"zxfkjqutib\",\"dependencyConditions\":[\"Completed\"],\"\":{}}],\"userProperties\":[{\"name\":\"vrkpsa\"}],\"\":{}}")
                .toObject(SynapseNotebookActivity.class);
        Assertions.assertEquals("bhwbdqufvcgnrgla", model.name());
        Assertions.assertEquals("wyambhba", model.description());
        Assertions.assertEquals("zxfkjqutib", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.COMPLETED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("vrkpsa", model.userProperties().get(0).name());
        Assertions.assertEquals("ezmnrkjgpjeuxsph", model.linkedServiceName().referenceName());
        Assertions.assertEquals(1807346053, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(true, model.policy().secureInput());
        Assertions.assertEquals(true, model.policy().secureOutput());
        Assertions.assertEquals(NotebookReferenceType.NOTEBOOK_REFERENCE, model.notebook().type());
        Assertions.assertEquals(BigDataPoolReferenceType.BIG_DATA_POOL_REFERENCE, model.sparkPool().type());
        Assertions.assertEquals(NotebookParameterType.STRING, model.parameters().get("pwal").type());
        Assertions.assertEquals(1743776214, model.numExecutors());
    }

    @Test
    public void testSerialize() {
        SynapseNotebookActivity model =
            new SynapseNotebookActivity()
                .withName("bhwbdqufvcgnrgla")
                .withDescription("wyambhba")
                .withDependsOn(
                    Arrays
                        .asList(
                            new ActivityDependency()
                                .withActivity("zxfkjqutib")
                                .withDependencyConditions(Arrays.asList(DependencyCondition.COMPLETED))
                                .withAdditionalProperties(mapOf())))
                .withUserProperties(Arrays.asList(new UserProperty().withName("vrkpsa")))
                .withLinkedServiceName(
                    new LinkedServiceReference().withReferenceName("ezmnrkjgpjeuxsph").withParameters(mapOf()))
                .withPolicy(
                    new ActivityPolicy()
                        .withRetryIntervalInSeconds(1807346053)
                        .withSecureInput(true)
                        .withSecureOutput(true)
                        .withAdditionalProperties(mapOf()))
                .withNotebook(new SynapseNotebookReference().withType(NotebookReferenceType.NOTEBOOK_REFERENCE))
                .withSparkPool(
                    new BigDataPoolParametrizationReference()
                        .withType(BigDataPoolReferenceType.BIG_DATA_POOL_REFERENCE))
                .withParameters(
                    mapOf(
                        "pwal",
                        new NotebookParameter().withType(NotebookParameterType.STRING),
                        "gexojfccylhtrht",
                        new NotebookParameter().withType(NotebookParameterType.BOOL),
                        "jpwexcdrz",
                        new NotebookParameter().withType(NotebookParameterType.BOOL)))
                .withNumExecutors(1743776214);
        model = BinaryData.fromObject(model).toObject(SynapseNotebookActivity.class);
        Assertions.assertEquals("bhwbdqufvcgnrgla", model.name());
        Assertions.assertEquals("wyambhba", model.description());
        Assertions.assertEquals("zxfkjqutib", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.COMPLETED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("vrkpsa", model.userProperties().get(0).name());
        Assertions.assertEquals("ezmnrkjgpjeuxsph", model.linkedServiceName().referenceName());
        Assertions.assertEquals(1807346053, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(true, model.policy().secureInput());
        Assertions.assertEquals(true, model.policy().secureOutput());
        Assertions.assertEquals(NotebookReferenceType.NOTEBOOK_REFERENCE, model.notebook().type());
        Assertions.assertEquals(BigDataPoolReferenceType.BIG_DATA_POOL_REFERENCE, model.sparkPool().type());
        Assertions.assertEquals(NotebookParameterType.STRING, model.parameters().get("pwal").type());
        Assertions.assertEquals(1743776214, model.numExecutors());
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
