// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Strictly used in update requests. */
@Fluent
public final class PartialBatchDeploymentPartialMinimalTrackedResourceWithProperties {
    /*
     * Additional attributes of the entity.
     */
    @JsonProperty(value = "properties")
    private PartialBatchDeployment properties;

    /*
     * Resource tags.
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /** Creates an instance of PartialBatchDeploymentPartialMinimalTrackedResourceWithProperties class. */
    public PartialBatchDeploymentPartialMinimalTrackedResourceWithProperties() {
    }

    /**
     * Get the properties property: Additional attributes of the entity.
     *
     * @return the properties value.
     */
    public PartialBatchDeployment properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Additional attributes of the entity.
     *
     * @param properties the properties value to set.
     * @return the PartialBatchDeploymentPartialMinimalTrackedResourceWithProperties object itself.
     */
    public PartialBatchDeploymentPartialMinimalTrackedResourceWithProperties withProperties(
        PartialBatchDeployment properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the tags property: Resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Resource tags.
     *
     * @param tags the tags value to set.
     * @return the PartialBatchDeploymentPartialMinimalTrackedResourceWithProperties object itself.
     */
    public PartialBatchDeploymentPartialMinimalTrackedResourceWithProperties withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
