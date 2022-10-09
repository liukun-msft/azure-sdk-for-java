// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes the allowed inbound and outbound traffic of an Azure resource. */
@Immutable
public final class ConnectableResource {
    /*
     * The Azure resource id
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * The list of Azure resources that the resource has inbound allowed connection from
     */
    @JsonProperty(value = "inboundConnectedResources", access = JsonProperty.Access.WRITE_ONLY)
    private List<ConnectedResource> inboundConnectedResources;

    /*
     * The list of Azure resources that the resource has outbound allowed connection to
     */
    @JsonProperty(value = "outboundConnectedResources", access = JsonProperty.Access.WRITE_ONLY)
    private List<ConnectedResource> outboundConnectedResources;

    /**
     * Get the id property: The Azure resource id.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the inboundConnectedResources property: The list of Azure resources that the resource has inbound allowed
     * connection from.
     *
     * @return the inboundConnectedResources value.
     */
    public List<ConnectedResource> inboundConnectedResources() {
        return this.inboundConnectedResources;
    }

    /**
     * Get the outboundConnectedResources property: The list of Azure resources that the resource has outbound allowed
     * connection to.
     *
     * @return the outboundConnectedResources value.
     */
    public List<ConnectedResource> outboundConnectedResources() {
        return this.outboundConnectedResources;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (inboundConnectedResources() != null) {
            inboundConnectedResources().forEach(e -> e.validate());
        }
        if (outboundConnectedResources() != null) {
            outboundConnectedResources().forEach(e -> e.validate());
        }
    }
}
