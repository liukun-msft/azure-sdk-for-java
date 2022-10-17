// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.network.models.ChildResource;
import com.azure.resourcemanager.network.models.NetworkIntentPolicyBasedService;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Defines the security admin configuration. */
@Fluent
public final class SecurityAdminConfigurationInner extends ChildResource {
    /*
     * Indicates the properties for the network manager security admin configuration.
     */
    @JsonProperty(value = "properties")
    private SecurityAdminConfigurationPropertiesFormat innerProperties;

    /*
     * The system metadata related to this resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of SecurityAdminConfigurationInner class. */
    public SecurityAdminConfigurationInner() {
    }

    /**
     * Get the innerProperties property: Indicates the properties for the network manager security admin configuration.
     *
     * @return the innerProperties value.
     */
    private SecurityAdminConfigurationPropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: The system metadata related to this resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the description property: A description of the security configuration.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: A description of the security configuration.
     *
     * @param description the description value to set.
     * @return the SecurityAdminConfigurationInner object itself.
     */
    public SecurityAdminConfigurationInner withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SecurityAdminConfigurationPropertiesFormat();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the applyOnNetworkIntentPolicyBasedServices property: Enum list of network intent policy based services.
     *
     * @return the applyOnNetworkIntentPolicyBasedServices value.
     */
    public List<NetworkIntentPolicyBasedService> applyOnNetworkIntentPolicyBasedServices() {
        return this.innerProperties() == null ? null : this.innerProperties().applyOnNetworkIntentPolicyBasedServices();
    }

    /**
     * Set the applyOnNetworkIntentPolicyBasedServices property: Enum list of network intent policy based services.
     *
     * @param applyOnNetworkIntentPolicyBasedServices the applyOnNetworkIntentPolicyBasedServices value to set.
     * @return the SecurityAdminConfigurationInner object itself.
     */
    public SecurityAdminConfigurationInner withApplyOnNetworkIntentPolicyBasedServices(
        List<NetworkIntentPolicyBasedService> applyOnNetworkIntentPolicyBasedServices) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SecurityAdminConfigurationPropertiesFormat();
        }
        this.innerProperties().withApplyOnNetworkIntentPolicyBasedServices(applyOnNetworkIntentPolicyBasedServices);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
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
