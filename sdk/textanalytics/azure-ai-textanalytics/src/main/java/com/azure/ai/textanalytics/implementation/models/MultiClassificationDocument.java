// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The MultiClassificationDocument model. */
@Fluent
public final class MultiClassificationDocument {
    /*
     * Unique, non-empty document identifier.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /*
     * Recognized classification results in the document.
     */
    @JsonProperty(value = "classifications", required = true)
    private List<ClassificationResult> classifications;

    /*
     * Warnings encountered while processing document.
     */
    @JsonProperty(value = "warnings", required = true)
    private List<TextAnalyticsWarning> warnings;

    /*
     * if showStats=true was specified in the request this field will contain
     * information about the document payload.
     */
    @JsonProperty(value = "statistics")
    private DocumentStatistics statistics;

    /**
     * Get the id property: Unique, non-empty document identifier.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: Unique, non-empty document identifier.
     *
     * @param id the id value to set.
     * @return the MultiClassificationDocument object itself.
     */
    public MultiClassificationDocument setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the classifications property: Recognized classification results in the document.
     *
     * @return the classifications value.
     */
    public List<ClassificationResult> getClassifications() {
        return this.classifications;
    }

    /**
     * Set the classifications property: Recognized classification results in the document.
     *
     * @param classifications the classifications value to set.
     * @return the MultiClassificationDocument object itself.
     */
    public MultiClassificationDocument setClassifications(List<ClassificationResult> classifications) {
        this.classifications = classifications;
        return this;
    }

    /**
     * Get the warnings property: Warnings encountered while processing document.
     *
     * @return the warnings value.
     */
    public List<TextAnalyticsWarning> getWarnings() {
        return this.warnings;
    }

    /**
     * Set the warnings property: Warnings encountered while processing document.
     *
     * @param warnings the warnings value to set.
     * @return the MultiClassificationDocument object itself.
     */
    public MultiClassificationDocument setWarnings(List<TextAnalyticsWarning> warnings) {
        this.warnings = warnings;
        return this;
    }

    /**
     * Get the statistics property: if showStats=true was specified in the request this field will contain information
     * about the document payload.
     *
     * @return the statistics value.
     */
    public DocumentStatistics getStatistics() {
        return this.statistics;
    }

    /**
     * Set the statistics property: if showStats=true was specified in the request this field will contain information
     * about the document payload.
     *
     * @param statistics the statistics value to set.
     * @return the MultiClassificationDocument object itself.
     */
    public MultiClassificationDocument setStatistics(DocumentStatistics statistics) {
        this.statistics = statistics;
        return this;
    }
}
