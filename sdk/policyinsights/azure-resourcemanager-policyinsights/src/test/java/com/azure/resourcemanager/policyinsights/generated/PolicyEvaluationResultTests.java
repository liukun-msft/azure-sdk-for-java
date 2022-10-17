// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.policyinsights.models.PolicyEvaluationResult;
import org.junit.jupiter.api.Test;

public final class PolicyEvaluationResultTests {
    @Test
    public void testDeserialize() {
        PolicyEvaluationResult model =
            BinaryData
                .fromString(
                    "{\"policyInfo\":{\"policyDefinitionId\":\"nqvsaznqnto\",\"policySetDefinitionId\":\"dsg\",\"policyDefinitionReferenceId\":\"hmk\",\"policyAssignmentId\":\"grauwjuetaebur\"},\"evaluationResult\":\"dmovsm\",\"evaluationDetails\":{\"evaluatedExpressions\":[{\"result\":\"b\",\"expression\":\"oefki\",\"expressionKind\":\"vtpuqujmqlgk\",\"path\":\"tndoaongbjc\",\"operator\":\"i\"}],\"ifNotExistsDetails\":{\"resourceId\":\"ed\",\"totalResources\":659482239}}}")
                .toObject(PolicyEvaluationResult.class);
    }

    @Test
    public void testSerialize() {
        PolicyEvaluationResult model = new PolicyEvaluationResult();
        model = BinaryData.fromObject(model).toObject(PolicyEvaluationResult.class);
    }
}
