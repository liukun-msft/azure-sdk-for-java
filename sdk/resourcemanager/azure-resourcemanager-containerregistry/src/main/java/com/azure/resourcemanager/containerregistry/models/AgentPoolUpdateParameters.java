// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.containerregistry.fluent.models.AgentPoolPropertiesUpdateParameters;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The parameters for updating an agent pool. */
@Fluent
public final class AgentPoolUpdateParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AgentPoolUpdateParameters.class);

    /*
     * The properties associated with the agent pool
     */
    @JsonProperty(value = "properties")
    private AgentPoolPropertiesUpdateParameters innerProperties;

    /*
     * The ARM resource tags.
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /**
     * Get the innerProperties property: The properties associated with the agent pool.
     *
     * @return the innerProperties value.
     */
    private AgentPoolPropertiesUpdateParameters innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the tags property: The ARM resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: The ARM resource tags.
     *
     * @param tags the tags value to set.
     * @return the AgentPoolUpdateParameters object itself.
     */
    public AgentPoolUpdateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the count property: The count of agent machine.
     *
     * @return the count value.
     */
    public Integer count() {
        return this.innerProperties() == null ? null : this.innerProperties().count();
    }

    /**
     * Set the count property: The count of agent machine.
     *
     * @param count the count value to set.
     * @return the AgentPoolUpdateParameters object itself.
     */
    public AgentPoolUpdateParameters withCount(Integer count) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AgentPoolPropertiesUpdateParameters();
        }
        this.innerProperties().withCount(count);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
