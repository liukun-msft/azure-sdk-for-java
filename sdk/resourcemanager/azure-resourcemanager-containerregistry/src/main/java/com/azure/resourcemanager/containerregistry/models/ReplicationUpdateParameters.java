// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.containerregistry.fluent.models.ReplicationUpdateParametersProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The parameters for updating a replication. */
@Fluent
public final class ReplicationUpdateParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ReplicationUpdateParameters.class);

    /*
     * The tags for the replication.
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /*
     * The parameters for updating a replication's properties
     */
    @JsonProperty(value = "properties")
    private ReplicationUpdateParametersProperties innerProperties;

    /**
     * Get the tags property: The tags for the replication.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: The tags for the replication.
     *
     * @param tags the tags value to set.
     * @return the ReplicationUpdateParameters object itself.
     */
    public ReplicationUpdateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the innerProperties property: The parameters for updating a replication's properties.
     *
     * @return the innerProperties value.
     */
    private ReplicationUpdateParametersProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the regionEndpointEnabled property: Specifies whether the replication's regional endpoint is enabled.
     * Requests will not be routed to a replication whose regional endpoint is disabled, however its data will continue
     * to be synced with other replications.
     *
     * @return the regionEndpointEnabled value.
     */
    public Boolean regionEndpointEnabled() {
        return this.innerProperties() == null ? null : this.innerProperties().regionEndpointEnabled();
    }

    /**
     * Set the regionEndpointEnabled property: Specifies whether the replication's regional endpoint is enabled.
     * Requests will not be routed to a replication whose regional endpoint is disabled, however its data will continue
     * to be synced with other replications.
     *
     * @param regionEndpointEnabled the regionEndpointEnabled value to set.
     * @return the ReplicationUpdateParameters object itself.
     */
    public ReplicationUpdateParameters withRegionEndpointEnabled(Boolean regionEndpointEnabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ReplicationUpdateParametersProperties();
        }
        this.innerProperties().withRegionEndpointEnabled(regionEndpointEnabled);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
