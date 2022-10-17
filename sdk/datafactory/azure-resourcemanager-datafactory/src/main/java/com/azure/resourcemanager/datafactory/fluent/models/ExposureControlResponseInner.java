// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The exposure control response. */
@Immutable
public final class ExposureControlResponseInner {
    /*
     * The feature name.
     */
    @JsonProperty(value = "featureName", access = JsonProperty.Access.WRITE_ONLY)
    private String featureName;

    /*
     * The feature value.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private String value;

    /** Creates an instance of ExposureControlResponseInner class. */
    public ExposureControlResponseInner() {
    }

    /**
     * Get the featureName property: The feature name.
     *
     * @return the featureName value.
     */
    public String featureName() {
        return this.featureName;
    }

    /**
     * Get the value property: The feature value.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
