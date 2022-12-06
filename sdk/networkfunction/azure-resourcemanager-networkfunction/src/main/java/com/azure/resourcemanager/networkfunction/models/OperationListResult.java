// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkfunction.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.networkfunction.fluent.models.OperationInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Result of the request to list Azure Traffic Collector operations. It contains a list of operations and a URL link to
 * get the next set of results.
 */
@Fluent
public final class OperationListResult {
    /*
     * List of operations supported by the Azure Traffic Collector resource provider.
     */
    @JsonProperty(value = "value")
    private List<OperationInner> value;

    /*
     * URL to get the next set of operation list results if there are any.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of OperationListResult class. */
    public OperationListResult() {
    }

    /**
     * Get the value property: List of operations supported by the Azure Traffic Collector resource provider.
     *
     * @return the value value.
     */
    public List<OperationInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of operations supported by the Azure Traffic Collector resource provider.
     *
     * @param value the value value to set.
     * @return the OperationListResult object itself.
     */
    public OperationListResult withValue(List<OperationInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: URL to get the next set of operation list results if there are any.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: URL to get the next set of operation list results if there are any.
     *
     * @param nextLink the nextLink value to set.
     * @return the OperationListResult object itself.
     */
    public OperationListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
