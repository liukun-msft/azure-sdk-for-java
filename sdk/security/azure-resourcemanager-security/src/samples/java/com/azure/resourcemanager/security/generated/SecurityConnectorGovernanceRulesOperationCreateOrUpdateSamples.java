// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.management.serializer.SerializerFactory;
import com.azure.core.util.Context;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.security.fluent.models.GovernanceRuleInner;
import com.azure.resourcemanager.security.models.GovernanceRuleEmailNotification;
import com.azure.resourcemanager.security.models.GovernanceRuleOwnerSource;
import com.azure.resourcemanager.security.models.GovernanceRuleOwnerSourceType;
import com.azure.resourcemanager.security.models.GovernanceRuleSourceResourceType;
import com.azure.resourcemanager.security.models.GovernanceRuleType;
import java.io.IOException;
import java.util.Arrays;

/** Samples for SecurityConnectorGovernanceRulesOperation CreateOrUpdate. */
public final class SecurityConnectorGovernanceRulesOperationCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2022-01-01-preview/examples/GovernanceRules/PutSecurityConnectorGovernanceRule_example.json
     */
    /**
     * Sample code: Create Governance rule.
     *
     * @param manager Entry point to SecurityManager.
     */
    public static void createGovernanceRule(com.azure.resourcemanager.security.SecurityManager manager)
        throws IOException {
        manager
            .securityConnectorGovernanceRulesOperations()
            .createOrUpdateWithResponse(
                "gcpResourceGroup",
                "gcpconnector",
                "ad9a8e26-29d9-4829-bb30-e597a58cdbb8",
                new GovernanceRuleInner()
                    .withDisplayName("GCP Admin's rule")
                    .withDescription("A rule on critical GCP recommendations")
                    .withRemediationTimeframe("7.00:00:00")
                    .withIsGracePeriod(true)
                    .withRulePriority(200)
                    .withIsDisabled(false)
                    .withRuleType(GovernanceRuleType.INTEGRATED)
                    .withSourceResourceType(GovernanceRuleSourceResourceType.ASSESSMENTS)
                    .withConditionSets(
                        Arrays
                            .asList(
                                SerializerFactory
                                    .createDefaultManagementSerializerAdapter()
                                    .deserialize(
                                        "{\"conditions\":[{\"operator\":\"In\",\"property\":\"$.AssessmentKey\",\"value\":\"[\\\"b1cd27e0-4ecc-4246-939f-49c426d9d72f\\\","
                                            + " \\\"fe83f80b-073d-4ccf-93d9-6797eb870201\\\"]\"}]}",
                                        Object.class,
                                        SerializerEncoding.JSON)))
                    .withOwnerSource(
                        new GovernanceRuleOwnerSource()
                            .withType(GovernanceRuleOwnerSourceType.MANUALLY)
                            .withValue("user@contoso.com"))
                    .withGovernanceEmailNotification(
                        new GovernanceRuleEmailNotification()
                            .withDisableManagerEmailNotification(true)
                            .withDisableOwnerEmailNotification(false)),
                Context.NONE);
    }
}
