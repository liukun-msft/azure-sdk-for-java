// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.exception.ManagementError;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Common error representation. */
@Immutable
public final class Error extends ManagementError {
    /*
     * Inner error message.
     */
    @JsonProperty(value = "innerError", access = JsonProperty.Access.WRITE_ONLY)
    private String innerError;

    /** Creates an instance of Error class. */
    public Error() {
    }

    /**
     * Get the innerError property: Inner error message.
     *
     * @return the innerError value.
     */
    public String getInnerError() {
        return this.innerError;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
