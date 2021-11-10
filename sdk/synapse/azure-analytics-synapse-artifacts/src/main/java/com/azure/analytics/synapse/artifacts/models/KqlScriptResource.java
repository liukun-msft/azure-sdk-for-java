// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The KqlScriptResource model. */
@Fluent
public final class KqlScriptResource {
    /*
     * The id property.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * The name property.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The type property.
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * Properties of sql script.
     */
    @JsonProperty(value = "properties")
    private KqlScript properties;

    /**
     * Get the id property: The id property.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: The id property.
     *
     * @param id the id value to set.
     * @return the KqlScriptResource object itself.
     */
    public KqlScriptResource setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: The name property.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name property.
     *
     * @param name the name value to set.
     * @return the KqlScriptResource object itself.
     */
    public KqlScriptResource setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: The type property.
     *
     * @return the type value.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Set the type property: The type property.
     *
     * @param type the type value to set.
     * @return the KqlScriptResource object itself.
     */
    public KqlScriptResource setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the properties property: Properties of sql script.
     *
     * @return the properties value.
     */
    public KqlScript getProperties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties of sql script.
     *
     * @param properties the properties value to set.
     * @return the KqlScriptResource object itself.
     */
    public KqlScriptResource setProperties(KqlScript properties) {
        this.properties = properties;
        return this;
    }
}
