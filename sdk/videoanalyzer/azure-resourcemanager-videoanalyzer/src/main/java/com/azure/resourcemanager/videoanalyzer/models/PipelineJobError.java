// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Details about the error for a failed pipeline job. */
@Fluent
public final class PipelineJobError {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PipelineJobError.class);

    /*
     * The error code.
     */
    @JsonProperty(value = "code")
    private String code;

    /*
     * The error message.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Get the code property: The error code.
     *
     * @return the code value.
     */
    public String code() {
        return this.code;
    }

    /**
     * Set the code property: The error code.
     *
     * @param code the code value to set.
     * @return the PipelineJobError object itself.
     */
    public PipelineJobError withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the message property: The error message.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: The error message.
     *
     * @param message the message value to set.
     * @return the PipelineJobError object itself.
     */
    public PipelineJobError withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
