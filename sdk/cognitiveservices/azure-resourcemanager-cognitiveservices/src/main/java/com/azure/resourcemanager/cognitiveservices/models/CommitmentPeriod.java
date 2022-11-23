// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Cognitive Services account commitment period. */
@Fluent
public final class CommitmentPeriod {
    /*
     * Commitment period commitment tier.
     */
    @JsonProperty(value = "tier")
    private String tier;

    /*
     * Commitment period commitment count.
     */
    @JsonProperty(value = "count")
    private Integer count;

    /*
     * Cognitive Services account commitment quota.
     */
    @JsonProperty(value = "quota", access = JsonProperty.Access.WRITE_ONLY)
    private CommitmentQuota quota;

    /*
     * Commitment period start date.
     */
    @JsonProperty(value = "startDate", access = JsonProperty.Access.WRITE_ONLY)
    private String startDate;

    /*
     * Commitment period end date.
     */
    @JsonProperty(value = "endDate", access = JsonProperty.Access.WRITE_ONLY)
    private String endDate;

    /** Creates an instance of CommitmentPeriod class. */
    public CommitmentPeriod() {
    }

    /**
     * Get the tier property: Commitment period commitment tier.
     *
     * @return the tier value.
     */
    public String tier() {
        return this.tier;
    }

    /**
     * Set the tier property: Commitment period commitment tier.
     *
     * @param tier the tier value to set.
     * @return the CommitmentPeriod object itself.
     */
    public CommitmentPeriod withTier(String tier) {
        this.tier = tier;
        return this;
    }

    /**
     * Get the count property: Commitment period commitment count.
     *
     * @return the count value.
     */
    public Integer count() {
        return this.count;
    }

    /**
     * Set the count property: Commitment period commitment count.
     *
     * @param count the count value to set.
     * @return the CommitmentPeriod object itself.
     */
    public CommitmentPeriod withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * Get the quota property: Cognitive Services account commitment quota.
     *
     * @return the quota value.
     */
    public CommitmentQuota quota() {
        return this.quota;
    }

    /**
     * Get the startDate property: Commitment period start date.
     *
     * @return the startDate value.
     */
    public String startDate() {
        return this.startDate;
    }

    /**
     * Get the endDate property: Commitment period end date.
     *
     * @return the endDate value.
     */
    public String endDate() {
        return this.endDate;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (quota() != null) {
            quota().validate();
        }
    }
}
