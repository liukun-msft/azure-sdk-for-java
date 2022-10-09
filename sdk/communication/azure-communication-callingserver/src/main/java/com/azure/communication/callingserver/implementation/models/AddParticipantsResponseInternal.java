// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callingserver.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The AddParticipantsResponseInternal model. */
@Fluent
public final class AddParticipantsResponseInternal {
    /*
     * The participants property.
     */
    @JsonProperty(value = "participants")
    private List<AcsCallParticipantInternal> participants;

    /*
     * The operation context provided by client.
     */
    @JsonProperty(value = "operationContext")
    private String operationContext;

    /**
     * Get the participants property: The participants property.
     *
     * @return the participants value.
     */
    public List<AcsCallParticipantInternal> getParticipants() {
        return this.participants;
    }

    /**
     * Set the participants property: The participants property.
     *
     * @param participants the participants value to set.
     * @return the AddParticipantsResponseInternal object itself.
     */
    public AddParticipantsResponseInternal setParticipants(List<AcsCallParticipantInternal> participants) {
        this.participants = participants;
        return this;
    }

    /**
     * Get the operationContext property: The operation context provided by client.
     *
     * @return the operationContext value.
     */
    public String getOperationContext() {
        return this.operationContext;
    }

    /**
     * Set the operationContext property: The operation context provided by client.
     *
     * @param operationContext the operationContext value to set.
     * @return the AddParticipantsResponseInternal object itself.
     */
    public AddParticipantsResponseInternal setOperationContext(String operationContext) {
        this.operationContext = operationContext;
        return this;
    }
}
