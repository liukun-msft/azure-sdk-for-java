// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.kusto.fluent.models.ManagedPrivateEndpointInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The list managed private endpoints operation response. */
@Fluent
public final class ManagedPrivateEndpointListResult {
    /*
     * The list of managed private endpoints.
     */
    @JsonProperty(value = "value")
    private List<ManagedPrivateEndpointInner> value;

    /**
     * Get the value property: The list of managed private endpoints.
     *
     * @return the value value.
     */
    public List<ManagedPrivateEndpointInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of managed private endpoints.
     *
     * @param value the value value to set.
     * @return the ManagedPrivateEndpointListResult object itself.
     */
    public ManagedPrivateEndpointListResult withValue(List<ManagedPrivateEndpointInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
