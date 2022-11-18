// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Rule results input. */
@Fluent
public final class RuleResultsInput {
    /*
     * Take results from latest scan.
     */
    @JsonProperty(value = "latestScan")
    private Boolean latestScan;

    /*
     * Expected results to be inserted into the baseline.
     * Leave this field empty it LatestScan == true.
     */
    @JsonProperty(value = "results")
    private List<List<String>> results;

    /** Creates an instance of RuleResultsInput class. */
    public RuleResultsInput() {
    }

    /**
     * Get the latestScan property: Take results from latest scan.
     *
     * @return the latestScan value.
     */
    public Boolean latestScan() {
        return this.latestScan;
    }

    /**
     * Set the latestScan property: Take results from latest scan.
     *
     * @param latestScan the latestScan value to set.
     * @return the RuleResultsInput object itself.
     */
    public RuleResultsInput withLatestScan(Boolean latestScan) {
        this.latestScan = latestScan;
        return this;
    }

    /**
     * Get the results property: Expected results to be inserted into the baseline. Leave this field empty it LatestScan
     * == true.
     *
     * @return the results value.
     */
    public List<List<String>> results() {
        return this.results;
    }

    /**
     * Set the results property: Expected results to be inserted into the baseline. Leave this field empty it LatestScan
     * == true.
     *
     * @param results the results value to set.
     * @return the RuleResultsInput object itself.
     */
    public RuleResultsInput withResults(List<List<String>> results) {
        this.results = results;
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
