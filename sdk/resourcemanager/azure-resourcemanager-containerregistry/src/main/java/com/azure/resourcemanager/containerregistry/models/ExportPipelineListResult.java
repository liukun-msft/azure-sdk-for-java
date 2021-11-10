// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.containerregistry.fluent.models.ExportPipelineInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The result of a request to list export pipelines for a container registry. */
@Fluent
public final class ExportPipelineListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ExportPipelineListResult.class);

    /*
     * The list of export pipelines. Since this list may be incomplete, the
     * nextLink field should be used to request the next list of export
     * pipelines.
     */
    @JsonProperty(value = "value")
    private List<ExportPipelineInner> value;

    /*
     * The URI that can be used to request the next list of pipeline runs.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: The list of export pipelines. Since this list may be incomplete, the nextLink field
     * should be used to request the next list of export pipelines.
     *
     * @return the value value.
     */
    public List<ExportPipelineInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of export pipelines. Since this list may be incomplete, the nextLink field
     * should be used to request the next list of export pipelines.
     *
     * @param value the value value to set.
     * @return the ExportPipelineListResult object itself.
     */
    public ExportPipelineListResult withValue(List<ExportPipelineInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URI that can be used to request the next list of pipeline runs.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URI that can be used to request the next list of pipeline runs.
     *
     * @param nextLink the nextLink value to set.
     * @return the ExportPipelineListResult object itself.
     */
    public ExportPipelineListResult withNextLink(String nextLink) {
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
