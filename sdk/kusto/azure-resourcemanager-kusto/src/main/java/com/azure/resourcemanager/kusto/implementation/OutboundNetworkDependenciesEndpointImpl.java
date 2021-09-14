// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.implementation;

import com.azure.resourcemanager.kusto.fluent.models.OutboundNetworkDependenciesEndpointInner;
import com.azure.resourcemanager.kusto.models.EndpointDependency;
import com.azure.resourcemanager.kusto.models.OutboundNetworkDependenciesEndpoint;
import com.azure.resourcemanager.kusto.models.ProvisioningState;
import java.util.Collections;
import java.util.List;

public final class OutboundNetworkDependenciesEndpointImpl implements OutboundNetworkDependenciesEndpoint {
    private OutboundNetworkDependenciesEndpointInner innerObject;

    private final com.azure.resourcemanager.kusto.KustoManager serviceManager;

    OutboundNetworkDependenciesEndpointImpl(
        OutboundNetworkDependenciesEndpointInner innerObject,
        com.azure.resourcemanager.kusto.KustoManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public String category() {
        return this.innerModel().category();
    }

    public List<EndpointDependency> endpoints() {
        List<EndpointDependency> inner = this.innerModel().endpoints();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public OutboundNetworkDependenciesEndpointInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.kusto.KustoManager manager() {
        return this.serviceManager;
    }
}
