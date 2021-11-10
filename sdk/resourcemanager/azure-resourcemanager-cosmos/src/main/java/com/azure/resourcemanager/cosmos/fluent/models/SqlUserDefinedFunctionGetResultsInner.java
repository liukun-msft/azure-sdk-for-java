// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cosmos.models.ArmResourceProperties;
import com.azure.resourcemanager.cosmos.models.SqlUserDefinedFunctionGetPropertiesResource;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** An Azure Cosmos DB userDefinedFunction. */
@Fluent
public final class SqlUserDefinedFunctionGetResultsInner extends ArmResourceProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SqlUserDefinedFunctionGetResultsInner.class);

    /*
     * The properties of an Azure Cosmos DB userDefinedFunction
     */
    @JsonProperty(value = "properties")
    private SqlUserDefinedFunctionGetProperties innerProperties;

    /**
     * Get the innerProperties property: The properties of an Azure Cosmos DB userDefinedFunction.
     *
     * @return the innerProperties value.
     */
    private SqlUserDefinedFunctionGetProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public SqlUserDefinedFunctionGetResultsInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SqlUserDefinedFunctionGetResultsInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the resource property: The resource property.
     *
     * @return the resource value.
     */
    public SqlUserDefinedFunctionGetPropertiesResource resource() {
        return this.innerProperties() == null ? null : this.innerProperties().resource();
    }

    /**
     * Set the resource property: The resource property.
     *
     * @param resource the resource value to set.
     * @return the SqlUserDefinedFunctionGetResultsInner object itself.
     */
    public SqlUserDefinedFunctionGetResultsInner withResource(SqlUserDefinedFunctionGetPropertiesResource resource) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SqlUserDefinedFunctionGetProperties();
        }
        this.innerProperties().withResource(resource);
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
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
