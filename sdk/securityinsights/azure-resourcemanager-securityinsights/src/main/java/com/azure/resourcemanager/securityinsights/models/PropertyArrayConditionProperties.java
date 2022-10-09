// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Describes an automation rule condition that evaluates an array property's value. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "conditionType")
@JsonTypeName("PropertyArray")
@Fluent
public final class PropertyArrayConditionProperties extends AutomationRuleCondition {
    /*
     * The conditionProperties property.
     */
    @JsonProperty(value = "conditionProperties")
    private AutomationRulePropertyArrayValuesCondition conditionProperties;

    /**
     * Get the conditionProperties property: The conditionProperties property.
     *
     * @return the conditionProperties value.
     */
    public AutomationRulePropertyArrayValuesCondition conditionProperties() {
        return this.conditionProperties;
    }

    /**
     * Set the conditionProperties property: The conditionProperties property.
     *
     * @param conditionProperties the conditionProperties value to set.
     * @return the PropertyArrayConditionProperties object itself.
     */
    public PropertyArrayConditionProperties withConditionProperties(
        AutomationRulePropertyArrayValuesCondition conditionProperties) {
        this.conditionProperties = conditionProperties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (conditionProperties() != null) {
            conditionProperties().validate();
        }
    }
}
