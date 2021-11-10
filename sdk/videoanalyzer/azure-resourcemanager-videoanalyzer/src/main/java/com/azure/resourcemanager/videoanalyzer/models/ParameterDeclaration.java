// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Single topology parameter declaration. Declared parameters can and must be referenced throughout the topology and can
 * optionally have default values to be used when they are not defined in the pipelines.
 */
@Fluent
public final class ParameterDeclaration {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ParameterDeclaration.class);

    /*
     * Name of the parameter.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Type of the parameter.
     */
    @JsonProperty(value = "type", required = true)
    private ParameterType type;

    /*
     * Description of the parameter.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The default value for the parameter to be used if the pipeline does not
     * specify a value.
     */
    @JsonProperty(value = "default")
    private String defaultProperty;

    /**
     * Get the name property: Name of the parameter.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the parameter.
     *
     * @param name the name value to set.
     * @return the ParameterDeclaration object itself.
     */
    public ParameterDeclaration withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: Type of the parameter.
     *
     * @return the type value.
     */
    public ParameterType type() {
        return this.type;
    }

    /**
     * Set the type property: Type of the parameter.
     *
     * @param type the type value to set.
     * @return the ParameterDeclaration object itself.
     */
    public ParameterDeclaration withType(ParameterType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the description property: Description of the parameter.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Description of the parameter.
     *
     * @param description the description value to set.
     * @return the ParameterDeclaration object itself.
     */
    public ParameterDeclaration withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the defaultProperty property: The default value for the parameter to be used if the pipeline does not specify
     * a value.
     *
     * @return the defaultProperty value.
     */
    public String defaultProperty() {
        return this.defaultProperty;
    }

    /**
     * Set the defaultProperty property: The default value for the parameter to be used if the pipeline does not specify
     * a value.
     *
     * @param defaultProperty the defaultProperty value to set.
     * @return the ParameterDeclaration object itself.
     */
    public ParameterDeclaration withDefaultProperty(String defaultProperty) {
        this.defaultProperty = defaultProperty;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property name in model ParameterDeclaration"));
        }
        if (type() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property type in model ParameterDeclaration"));
        }
    }
}
