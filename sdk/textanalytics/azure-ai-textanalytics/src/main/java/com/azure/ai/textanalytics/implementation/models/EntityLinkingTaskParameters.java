// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The EntityLinkingTaskParameters model. */
@Fluent
public final class EntityLinkingTaskParameters {
    /*
     * The model-version property.
     */
    @JsonProperty(value = "model-version")
    private String modelVersion;

    /*
     * The loggingOptOut property.
     */
    @JsonProperty(value = "loggingOptOut")
    private Boolean loggingOptOut;

    /*
     * The stringIndexType property.
     */
    @JsonProperty(value = "stringIndexType")
    private StringIndexType stringIndexType;

    /**
     * Get the modelVersion property: The model-version property.
     *
     * @return the modelVersion value.
     */
    public String getModelVersion() {
        return this.modelVersion;
    }

    /**
     * Set the modelVersion property: The model-version property.
     *
     * @param modelVersion the modelVersion value to set.
     * @return the EntityLinkingTaskParameters object itself.
     */
    public EntityLinkingTaskParameters setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
        return this;
    }

    /**
     * Get the loggingOptOut property: The loggingOptOut property.
     *
     * @return the loggingOptOut value.
     */
    public Boolean isLoggingOptOut() {
        return this.loggingOptOut;
    }

    /**
     * Set the loggingOptOut property: The loggingOptOut property.
     *
     * @param loggingOptOut the loggingOptOut value to set.
     * @return the EntityLinkingTaskParameters object itself.
     */
    public EntityLinkingTaskParameters setLoggingOptOut(Boolean loggingOptOut) {
        this.loggingOptOut = loggingOptOut;
        return this;
    }

    /**
     * Get the stringIndexType property: The stringIndexType property.
     *
     * @return the stringIndexType value.
     */
    public StringIndexType getStringIndexType() {
        return this.stringIndexType;
    }

    /**
     * Set the stringIndexType property: The stringIndexType property.
     *
     * @param stringIndexType the stringIndexType value to set.
     * @return the EntityLinkingTaskParameters object itself.
     */
    public EntityLinkingTaskParameters setStringIndexType(StringIndexType stringIndexType) {
        this.stringIndexType = stringIndexType;
        return this;
    }
}
