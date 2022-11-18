// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** configuration for Vulnerability Assessment autoprovisioning. */
@Fluent
public final class DefenderForServersGcpOfferingVaAutoProvisioningConfiguration {
    /*
     * The Vulnerability Assessment solution to be provisioned. Can be either 'TVM' or 'Qualys'
     */
    @JsonProperty(value = "type")
    private Type type;

    /** Creates an instance of DefenderForServersGcpOfferingVaAutoProvisioningConfiguration class. */
    public DefenderForServersGcpOfferingVaAutoProvisioningConfiguration() {
    }

    /**
     * Get the type property: The Vulnerability Assessment solution to be provisioned. Can be either 'TVM' or 'Qualys'.
     *
     * @return the type value.
     */
    public Type type() {
        return this.type;
    }

    /**
     * Set the type property: The Vulnerability Assessment solution to be provisioned. Can be either 'TVM' or 'Qualys'.
     *
     * @param type the type value to set.
     * @return the DefenderForServersGcpOfferingVaAutoProvisioningConfiguration object itself.
     */
    public DefenderForServersGcpOfferingVaAutoProvisioningConfiguration withType(Type type) {
        this.type = type;
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
