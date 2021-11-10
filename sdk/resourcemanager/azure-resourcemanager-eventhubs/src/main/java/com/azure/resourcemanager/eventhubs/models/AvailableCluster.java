// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Pre-provisioned and readily available Event Hubs Cluster count per region. */
@Fluent
public final class AvailableCluster {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AvailableCluster.class);

    /*
     * Location fo the Available Cluster
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * Get the location property: Location fo the Available Cluster.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Location fo the Available Cluster.
     *
     * @param location the location value to set.
     * @return the AvailableCluster object itself.
     */
    public AvailableCluster withLocation(String location) {
        this.location = location;
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
