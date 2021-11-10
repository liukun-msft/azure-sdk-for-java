// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Transformation for data flow sink. */
@Fluent
public class DataFlowSink extends Transformation {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DataFlowSink.class);

    /*
     * Schema linked service reference.
     */
    @JsonProperty(value = "schemaLinkedService")
    private LinkedServiceReference schemaLinkedService;

    /**
     * Get the schemaLinkedService property: Schema linked service reference.
     *
     * @return the schemaLinkedService value.
     */
    public LinkedServiceReference schemaLinkedService() {
        return this.schemaLinkedService;
    }

    /**
     * Set the schemaLinkedService property: Schema linked service reference.
     *
     * @param schemaLinkedService the schemaLinkedService value to set.
     * @return the DataFlowSink object itself.
     */
    public DataFlowSink withSchemaLinkedService(LinkedServiceReference schemaLinkedService) {
        this.schemaLinkedService = schemaLinkedService;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DataFlowSink withName(String name) {
        super.withName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DataFlowSink withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DataFlowSink withDataset(DatasetReference dataset) {
        super.withDataset(dataset);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DataFlowSink withLinkedService(LinkedServiceReference linkedService) {
        super.withLinkedService(linkedService);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DataFlowSink withFlowlet(DataFlowReference flowlet) {
        super.withFlowlet(flowlet);
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
        if (schemaLinkedService() != null) {
            schemaLinkedService().validate();
        }
    }
}
