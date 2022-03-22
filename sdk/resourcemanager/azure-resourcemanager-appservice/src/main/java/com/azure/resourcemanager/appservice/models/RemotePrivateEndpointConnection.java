// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.fluent.models.RemotePrivateEndpointConnectionProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A remote private endpoint connection. */
@Fluent
public final class RemotePrivateEndpointConnection extends ProxyOnlyResource {
    /*
     * RemotePrivateEndpointConnection resource specific properties
     */
    @JsonProperty(value = "properties")
    private RemotePrivateEndpointConnectionProperties innerProperties;

    /**
     * Get the innerProperties property: RemotePrivateEndpointConnection resource specific properties.
     *
     * @return the innerProperties value.
     */
    private RemotePrivateEndpointConnectionProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public RemotePrivateEndpointConnection withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioningState property.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the privateEndpoint property: PrivateEndpoint of a remote private endpoint connection.
     *
     * @return the privateEndpoint value.
     */
    public ArmIdWrapper privateEndpoint() {
        return this.innerProperties() == null ? null : this.innerProperties().privateEndpoint();
    }

    /**
     * Set the privateEndpoint property: PrivateEndpoint of a remote private endpoint connection.
     *
     * @param privateEndpoint the privateEndpoint value to set.
     * @return the RemotePrivateEndpointConnection object itself.
     */
    public RemotePrivateEndpointConnection withPrivateEndpoint(ArmIdWrapper privateEndpoint) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RemotePrivateEndpointConnectionProperties();
        }
        this.innerProperties().withPrivateEndpoint(privateEndpoint);
        return this;
    }

    /**
     * Get the privateLinkServiceConnectionState property: The state of a private link connection.
     *
     * @return the privateLinkServiceConnectionState value.
     */
    public PrivateLinkConnectionState privateLinkServiceConnectionState() {
        return this.innerProperties() == null ? null : this.innerProperties().privateLinkServiceConnectionState();
    }

    /**
     * Set the privateLinkServiceConnectionState property: The state of a private link connection.
     *
     * @param privateLinkServiceConnectionState the privateLinkServiceConnectionState value to set.
     * @return the RemotePrivateEndpointConnection object itself.
     */
    public RemotePrivateEndpointConnection withPrivateLinkServiceConnectionState(
        PrivateLinkConnectionState privateLinkServiceConnectionState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RemotePrivateEndpointConnectionProperties();
        }
        this.innerProperties().withPrivateLinkServiceConnectionState(privateLinkServiceConnectionState);
        return this;
    }

    /**
     * Get the ipAddresses property: Private IPAddresses mapped to the remote private endpoint.
     *
     * @return the ipAddresses value.
     */
    public List<String> ipAddresses() {
        return this.innerProperties() == null ? null : this.innerProperties().ipAddresses();
    }

    /**
     * Set the ipAddresses property: Private IPAddresses mapped to the remote private endpoint.
     *
     * @param ipAddresses the ipAddresses value to set.
     * @return the RemotePrivateEndpointConnection object itself.
     */
    public RemotePrivateEndpointConnection withIpAddresses(List<String> ipAddresses) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RemotePrivateEndpointConnectionProperties();
        }
        this.innerProperties().withIpAddresses(ipAddresses);
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
