// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of static member. */
@Fluent
public final class StaticMemberProperties {
    /*
     * Resource Id.
     */
    @JsonProperty(value = "resourceId")
    private String resourceId;

    /*
     * Resource region.
     */
    @JsonProperty(value = "region", access = JsonProperty.Access.WRITE_ONLY)
    private String region;

    /*
     * The provisioning state of the scope assignment resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /** Creates an instance of StaticMemberProperties class. */
    public StaticMemberProperties() {
    }

    /**
     * Get the resourceId property: Resource Id.
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: Resource Id.
     *
     * @param resourceId the resourceId value to set.
     * @return the StaticMemberProperties object itself.
     */
    public StaticMemberProperties withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the region property: Resource region.
     *
     * @return the region value.
     */
    public String region() {
        return this.region;
    }

    /**
     * Get the provisioningState property: The provisioning state of the scope assignment resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
