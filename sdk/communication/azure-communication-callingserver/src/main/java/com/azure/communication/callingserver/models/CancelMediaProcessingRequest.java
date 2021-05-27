// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callingserver.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The request payload for cancel media processing. */
@Fluent
public final class CancelMediaProcessingRequest {
    /*
     * The context for this operation.
     */
    @JsonProperty(value = "operationContext")
    private String operationContext;

    /**
     * Get the operationContext property: The context for this operation.
     *
     * @return the operationContext value.
     */
    public String getOperationContext() {
        return this.operationContext;
    }

    /**
     * Set the operationContext property: The context for this operation.
     *
     * @param operationContext the operationContext value to set.
     * @return the CancelMediaProcessingRequestInternal object itself.
     */
    public CancelMediaProcessingRequest setOperationContext(String operationContext) {
        this.operationContext = operationContext;
        return this;
    }
}
