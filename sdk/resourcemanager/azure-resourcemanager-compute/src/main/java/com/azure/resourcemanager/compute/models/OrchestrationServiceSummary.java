// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Summary for an orchestration service of a virtual machine scale set. */
@Immutable
public final class OrchestrationServiceSummary {
    /*
     * The name of the service.
     */
    @JsonProperty(value = "serviceName", access = JsonProperty.Access.WRITE_ONLY)
    private OrchestrationServiceNames serviceName;

    /*
     * The current state of the service.
     */
    @JsonProperty(value = "serviceState", access = JsonProperty.Access.WRITE_ONLY)
    private OrchestrationServiceState serviceState;

    /** Creates an instance of OrchestrationServiceSummary class. */
    public OrchestrationServiceSummary() {
    }

    /**
     * Get the serviceName property: The name of the service.
     *
     * @return the serviceName value.
     */
    public OrchestrationServiceNames serviceName() {
        return this.serviceName;
    }

    /**
     * Get the serviceState property: The current state of the service.
     *
     * @return the serviceState value.
     */
    public OrchestrationServiceState serviceState() {
        return this.serviceState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
