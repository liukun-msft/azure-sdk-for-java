// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.security.fluent.models.GovernanceRuleInner;
import com.azure.resourcemanager.security.models.ExecuteGovernanceRuleParams;
import com.azure.resourcemanager.security.models.GovernanceRule;
import com.azure.resourcemanager.security.models.GovernanceRuleEmailNotification;
import com.azure.resourcemanager.security.models.GovernanceRuleOwnerSource;
import com.azure.resourcemanager.security.models.GovernanceRuleSourceResourceType;
import com.azure.resourcemanager.security.models.GovernanceRuleType;
import java.util.Collections;
import java.util.List;

public final class GovernanceRuleImpl implements GovernanceRule, GovernanceRule.Definition, GovernanceRule.Update {
    private GovernanceRuleInner innerObject;

    private final com.azure.resourcemanager.security.SecurityManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String displayName() {
        return this.innerModel().displayName();
    }

    public String description() {
        return this.innerModel().description();
    }

    public String remediationTimeframe() {
        return this.innerModel().remediationTimeframe();
    }

    public Boolean isGracePeriod() {
        return this.innerModel().isGracePeriod();
    }

    public int rulePriority() {
        return this.innerModel().rulePriority();
    }

    public Boolean isDisabled() {
        return this.innerModel().isDisabled();
    }

    public GovernanceRuleType ruleType() {
        return this.innerModel().ruleType();
    }

    public GovernanceRuleSourceResourceType sourceResourceType() {
        return this.innerModel().sourceResourceType();
    }

    public List<Object> conditionSets() {
        List<Object> inner = this.innerModel().conditionSets();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public GovernanceRuleOwnerSource ownerSource() {
        return this.innerModel().ownerSource();
    }

    public GovernanceRuleEmailNotification governanceEmailNotification() {
        return this.innerModel().governanceEmailNotification();
    }

    public GovernanceRuleInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.security.SecurityManager manager() {
        return this.serviceManager;
    }

    private String ruleId;

    public GovernanceRule create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getGovernanceRulesOperations()
                .createOrUpdateWithResponse(ruleId, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public GovernanceRule create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getGovernanceRulesOperations()
                .createOrUpdateWithResponse(ruleId, this.innerModel(), context)
                .getValue();
        return this;
    }

    GovernanceRuleImpl(String name, com.azure.resourcemanager.security.SecurityManager serviceManager) {
        this.innerObject = new GovernanceRuleInner();
        this.serviceManager = serviceManager;
        this.ruleId = name;
    }

    public GovernanceRuleImpl update() {
        return this;
    }

    public GovernanceRule apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getGovernanceRulesOperations()
                .createOrUpdateWithResponse(ruleId, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public GovernanceRule apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getGovernanceRulesOperations()
                .createOrUpdateWithResponse(ruleId, this.innerModel(), context)
                .getValue();
        return this;
    }

    GovernanceRuleImpl(
        GovernanceRuleInner innerObject, com.azure.resourcemanager.security.SecurityManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.ruleId = Utils.getValueFromIdByName(innerObject.id(), "governanceRules");
    }

    public GovernanceRule refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getGovernanceRulesOperations()
                .getWithResponse(ruleId, Context.NONE)
                .getValue();
        return this;
    }

    public GovernanceRule refresh(Context context) {
        this.innerObject =
            serviceManager.serviceClient().getGovernanceRulesOperations().getWithResponse(ruleId, context).getValue();
        return this;
    }

    public void ruleIdExecuteSingleSubscription() {
        serviceManager.governanceRulesOperations().ruleIdExecuteSingleSubscription(ruleId);
    }

    public void ruleIdExecuteSingleSubscription(
        ExecuteGovernanceRuleParams executeGovernanceRuleParams, Context context) {
        serviceManager
            .governanceRulesOperations()
            .ruleIdExecuteSingleSubscription(ruleId, executeGovernanceRuleParams, context);
    }

    public GovernanceRuleImpl withDisplayName(String displayName) {
        this.innerModel().withDisplayName(displayName);
        return this;
    }

    public GovernanceRuleImpl withDescription(String description) {
        this.innerModel().withDescription(description);
        return this;
    }

    public GovernanceRuleImpl withRemediationTimeframe(String remediationTimeframe) {
        this.innerModel().withRemediationTimeframe(remediationTimeframe);
        return this;
    }

    public GovernanceRuleImpl withIsGracePeriod(Boolean isGracePeriod) {
        this.innerModel().withIsGracePeriod(isGracePeriod);
        return this;
    }

    public GovernanceRuleImpl withRulePriority(int rulePriority) {
        this.innerModel().withRulePriority(rulePriority);
        return this;
    }

    public GovernanceRuleImpl withIsDisabled(Boolean isDisabled) {
        this.innerModel().withIsDisabled(isDisabled);
        return this;
    }

    public GovernanceRuleImpl withRuleType(GovernanceRuleType ruleType) {
        this.innerModel().withRuleType(ruleType);
        return this;
    }

    public GovernanceRuleImpl withSourceResourceType(GovernanceRuleSourceResourceType sourceResourceType) {
        this.innerModel().withSourceResourceType(sourceResourceType);
        return this;
    }

    public GovernanceRuleImpl withConditionSets(List<Object> conditionSets) {
        this.innerModel().withConditionSets(conditionSets);
        return this;
    }

    public GovernanceRuleImpl withOwnerSource(GovernanceRuleOwnerSource ownerSource) {
        this.innerModel().withOwnerSource(ownerSource);
        return this;
    }

    public GovernanceRuleImpl withGovernanceEmailNotification(
        GovernanceRuleEmailNotification governanceEmailNotification) {
        this.innerModel().withGovernanceEmailNotification(governanceEmailNotification);
        return this;
    }
}
