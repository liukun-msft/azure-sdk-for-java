// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Scope of Network Manager. */
@Fluent
public final class NetworkManagerPropertiesNetworkManagerScopes {
    /*
     * List of management groups.
     */
    @JsonProperty(value = "managementGroups")
    private List<String> managementGroups;

    /*
     * List of subscriptions.
     */
    @JsonProperty(value = "subscriptions")
    private List<String> subscriptions;

    /*
     * List of cross tenant scopes.
     */
    @JsonProperty(value = "crossTenantScopes", access = JsonProperty.Access.WRITE_ONLY)
    private List<CrossTenantScopes> crossTenantScopes;

    /** Creates an instance of NetworkManagerPropertiesNetworkManagerScopes class. */
    public NetworkManagerPropertiesNetworkManagerScopes() {
    }

    /**
     * Get the managementGroups property: List of management groups.
     *
     * @return the managementGroups value.
     */
    public List<String> managementGroups() {
        return this.managementGroups;
    }

    /**
     * Set the managementGroups property: List of management groups.
     *
     * @param managementGroups the managementGroups value to set.
     * @return the NetworkManagerPropertiesNetworkManagerScopes object itself.
     */
    public NetworkManagerPropertiesNetworkManagerScopes withManagementGroups(List<String> managementGroups) {
        this.managementGroups = managementGroups;
        return this;
    }

    /**
     * Get the subscriptions property: List of subscriptions.
     *
     * @return the subscriptions value.
     */
    public List<String> subscriptions() {
        return this.subscriptions;
    }

    /**
     * Set the subscriptions property: List of subscriptions.
     *
     * @param subscriptions the subscriptions value to set.
     * @return the NetworkManagerPropertiesNetworkManagerScopes object itself.
     */
    public NetworkManagerPropertiesNetworkManagerScopes withSubscriptions(List<String> subscriptions) {
        this.subscriptions = subscriptions;
        return this;
    }

    /**
     * Get the crossTenantScopes property: List of cross tenant scopes.
     *
     * @return the crossTenantScopes value.
     */
    public List<CrossTenantScopes> crossTenantScopes() {
        return this.crossTenantScopes;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (crossTenantScopes() != null) {
            crossTenantScopes().forEach(e -> e.validate());
        }
    }
}
