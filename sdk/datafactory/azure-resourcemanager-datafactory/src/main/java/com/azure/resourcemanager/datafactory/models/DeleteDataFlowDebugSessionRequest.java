// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Request body structure for deleting data flow debug session. */
@Fluent
public final class DeleteDataFlowDebugSessionRequest {
    /*
     * The ID of data flow debug session.
     */
    @JsonProperty(value = "sessionId")
    private String sessionId;

    /** Creates an instance of DeleteDataFlowDebugSessionRequest class. */
    public DeleteDataFlowDebugSessionRequest() {
    }

    /**
     * Get the sessionId property: The ID of data flow debug session.
     *
     * @return the sessionId value.
     */
    public String sessionId() {
        return this.sessionId;
    }

    /**
     * Set the sessionId property: The ID of data flow debug session.
     *
     * @param sessionId the sessionId value to set.
     * @return the DeleteDataFlowDebugSessionRequest object itself.
     */
    public DeleteDataFlowDebugSessionRequest withSessionId(String sessionId) {
        this.sessionId = sessionId;
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
