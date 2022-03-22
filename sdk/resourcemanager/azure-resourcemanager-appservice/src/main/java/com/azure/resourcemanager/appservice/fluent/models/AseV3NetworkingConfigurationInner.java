// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.models.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Full view of networking configuration for an ASE. */
@Fluent
public final class AseV3NetworkingConfigurationInner extends ProxyOnlyResource {
    /*
     * AseV3NetworkingConfiguration resource specific properties
     */
    @JsonProperty(value = "properties")
    private AseV3NetworkingConfigurationProperties innerProperties;

    /**
     * Get the innerProperties property: AseV3NetworkingConfiguration resource specific properties.
     *
     * @return the innerProperties value.
     */
    private AseV3NetworkingConfigurationProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public AseV3NetworkingConfigurationInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the windowsOutboundIpAddresses property: The windowsOutboundIpAddresses property.
     *
     * @return the windowsOutboundIpAddresses value.
     */
    public List<String> windowsOutboundIpAddresses() {
        return this.innerProperties() == null ? null : this.innerProperties().windowsOutboundIpAddresses();
    }

    /**
     * Get the linuxOutboundIpAddresses property: The linuxOutboundIpAddresses property.
     *
     * @return the linuxOutboundIpAddresses value.
     */
    public List<String> linuxOutboundIpAddresses() {
        return this.innerProperties() == null ? null : this.innerProperties().linuxOutboundIpAddresses();
    }

    /**
     * Get the externalInboundIpAddresses property: The externalInboundIpAddresses property.
     *
     * @return the externalInboundIpAddresses value.
     */
    public List<String> externalInboundIpAddresses() {
        return this.innerProperties() == null ? null : this.innerProperties().externalInboundIpAddresses();
    }

    /**
     * Get the internalInboundIpAddresses property: The internalInboundIpAddresses property.
     *
     * @return the internalInboundIpAddresses value.
     */
    public List<String> internalInboundIpAddresses() {
        return this.innerProperties() == null ? null : this.innerProperties().internalInboundIpAddresses();
    }

    /**
     * Get the allowNewPrivateEndpointConnections property: Property to enable and disable new private endpoint
     * connection creation on ASE.
     *
     * @return the allowNewPrivateEndpointConnections value.
     */
    public Boolean allowNewPrivateEndpointConnections() {
        return this.innerProperties() == null ? null : this.innerProperties().allowNewPrivateEndpointConnections();
    }

    /**
     * Set the allowNewPrivateEndpointConnections property: Property to enable and disable new private endpoint
     * connection creation on ASE.
     *
     * @param allowNewPrivateEndpointConnections the allowNewPrivateEndpointConnections value to set.
     * @return the AseV3NetworkingConfigurationInner object itself.
     */
    public AseV3NetworkingConfigurationInner withAllowNewPrivateEndpointConnections(
        Boolean allowNewPrivateEndpointConnections) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AseV3NetworkingConfigurationProperties();
        }
        this.innerProperties().withAllowNewPrivateEndpointConnections(allowNewPrivateEndpointConnections);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
