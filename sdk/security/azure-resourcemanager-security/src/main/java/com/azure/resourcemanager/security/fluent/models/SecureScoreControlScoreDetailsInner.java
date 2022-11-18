// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Calculation result data in control level. */
@Fluent
public final class SecureScoreControlScoreDetailsInner {
    /*
     * User friendly display name of the control
     */
    @JsonProperty(value = "displayName", access = JsonProperty.Access.WRITE_ONLY)
    private String displayName;

    /*
     * Actual score object for the control
     */
    @JsonProperty(value = "score", access = JsonProperty.Access.WRITE_ONLY)
    private ScoreDetails innerScore;

    /*
     * Number of healthy resources in the control
     */
    @JsonProperty(value = "healthyResourceCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer healthyResourceCount;

    /*
     * Number of unhealthy resources in the control
     */
    @JsonProperty(value = "unhealthyResourceCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer unhealthyResourceCount;

    /*
     * Number of not applicable resources in the control
     */
    @JsonProperty(value = "notApplicableResourceCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer notApplicableResourceCount;

    /*
     * The relative weight for this specific control in each of your subscriptions. Used when calculating an aggregated
     * score for this control across all of your subscriptions.
     */
    @JsonProperty(value = "weight", access = JsonProperty.Access.WRITE_ONLY)
    private Long weight;

    /*
     * Information about the security control.
     */
    @JsonProperty(value = "definition")
    private SecureScoreControlDefinitionItemInner definition;

    /** Creates an instance of SecureScoreControlScoreDetailsInner class. */
    public SecureScoreControlScoreDetailsInner() {
    }

    /**
     * Get the displayName property: User friendly display name of the control.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Get the innerScore property: Actual score object for the control.
     *
     * @return the innerScore value.
     */
    private ScoreDetails innerScore() {
        return this.innerScore;
    }

    /**
     * Get the healthyResourceCount property: Number of healthy resources in the control.
     *
     * @return the healthyResourceCount value.
     */
    public Integer healthyResourceCount() {
        return this.healthyResourceCount;
    }

    /**
     * Get the unhealthyResourceCount property: Number of unhealthy resources in the control.
     *
     * @return the unhealthyResourceCount value.
     */
    public Integer unhealthyResourceCount() {
        return this.unhealthyResourceCount;
    }

    /**
     * Get the notApplicableResourceCount property: Number of not applicable resources in the control.
     *
     * @return the notApplicableResourceCount value.
     */
    public Integer notApplicableResourceCount() {
        return this.notApplicableResourceCount;
    }

    /**
     * Get the weight property: The relative weight for this specific control in each of your subscriptions. Used when
     * calculating an aggregated score for this control across all of your subscriptions.
     *
     * @return the weight value.
     */
    public Long weight() {
        return this.weight;
    }

    /**
     * Get the definition property: Information about the security control.
     *
     * @return the definition value.
     */
    public SecureScoreControlDefinitionItemInner definition() {
        return this.definition;
    }

    /**
     * Set the definition property: Information about the security control.
     *
     * @param definition the definition value to set.
     * @return the SecureScoreControlScoreDetailsInner object itself.
     */
    public SecureScoreControlScoreDetailsInner withDefinition(SecureScoreControlDefinitionItemInner definition) {
        this.definition = definition;
        return this;
    }

    /**
     * Get the max property: Maximum score available.
     *
     * @return the max value.
     */
    public Integer max() {
        return this.innerScore() == null ? null : this.innerScore().max();
    }

    /**
     * Get the current property: Current score.
     *
     * @return the current value.
     */
    public Double current() {
        return this.innerScore() == null ? null : this.innerScore().current();
    }

    /**
     * Get the percentage property: Ratio of the current score divided by the maximum. Rounded to 4 digits after the
     * decimal point.
     *
     * @return the percentage value.
     */
    public Double percentage() {
        return this.innerScore() == null ? null : this.innerScore().percentage();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerScore() != null) {
            innerScore().validate();
        }
        if (definition() != null) {
            definition().validate();
        }
    }
}
