// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** The compression method used on a dataset. */
@Fluent
public final class DatasetCompression {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DatasetCompression.class);

    /*
     * Type of dataset compression. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "type", required = true)
    private Object type;

    /*
     * The dataset compression level. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "level")
    private Object level;

    /*
     * The compression method used on a dataset.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the type property: Type of dataset compression. Type: string (or Expression with resultType string).
     *
     * @return the type value.
     */
    public Object type() {
        return this.type;
    }

    /**
     * Set the type property: Type of dataset compression. Type: string (or Expression with resultType string).
     *
     * @param type the type value to set.
     * @return the DatasetCompression object itself.
     */
    public DatasetCompression withType(Object type) {
        this.type = type;
        return this;
    }

    /**
     * Get the level property: The dataset compression level. Type: string (or Expression with resultType string).
     *
     * @return the level value.
     */
    public Object level() {
        return this.level;
    }

    /**
     * Set the level property: The dataset compression level. Type: string (or Expression with resultType string).
     *
     * @param level the level value to set.
     * @return the DatasetCompression object itself.
     */
    public DatasetCompression withLevel(Object level) {
        this.level = level;
        return this;
    }

    /**
     * Get the additionalProperties property: The compression method used on a dataset.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: The compression method used on a dataset.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the DatasetCompression object itself.
     */
    public DatasetCompression withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (type() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property type in model DatasetCompression"));
        }
    }
}
