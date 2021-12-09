// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The remediation failure threshold settings. */
@Fluent
public final class RemediationPropertiesFailureThreshold {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RemediationPropertiesFailureThreshold.class);

    /*
     * A number between 0.0 to 1.0 representing the percentage failure
     * threshold. The remediation will fail if the percentage of failed
     * remediation operations (i.e. failed deployments) exceeds this threshold.
     */
    @JsonProperty(value = "percentage")
    private Float percentage;

    /**
     * Get the percentage property: A number between 0.0 to 1.0 representing the percentage failure threshold. The
     * remediation will fail if the percentage of failed remediation operations (i.e. failed deployments) exceeds this
     * threshold.
     *
     * @return the percentage value.
     */
    public Float percentage() {
        return this.percentage;
    }

    /**
     * Set the percentage property: A number between 0.0 to 1.0 representing the percentage failure threshold. The
     * remediation will fail if the percentage of failed remediation operations (i.e. failed deployments) exceeds this
     * threshold.
     *
     * @param percentage the percentage value to set.
     * @return the RemediationPropertiesFailureThreshold object itself.
     */
    public RemediationPropertiesFailureThreshold withPercentage(Float percentage) {
        this.percentage = percentage;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
