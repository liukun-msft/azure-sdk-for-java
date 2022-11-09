// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** VM-VM placement policy properties. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("VmVm")
@Fluent
public final class VmPlacementPolicyProperties extends PlacementPolicyProperties {
    /*
     * Virtual machine members list
     */
    @JsonProperty(value = "vmMembers", required = true)
    private List<String> vmMembers;

    /*
     * placement policy affinity type
     */
    @JsonProperty(value = "affinityType", required = true)
    private AffinityType affinityType;

    /** Creates an instance of VmPlacementPolicyProperties class. */
    public VmPlacementPolicyProperties() {
    }

    /**
     * Get the vmMembers property: Virtual machine members list.
     *
     * @return the vmMembers value.
     */
    public List<String> vmMembers() {
        return this.vmMembers;
    }

    /**
     * Set the vmMembers property: Virtual machine members list.
     *
     * @param vmMembers the vmMembers value to set.
     * @return the VmPlacementPolicyProperties object itself.
     */
    public VmPlacementPolicyProperties withVmMembers(List<String> vmMembers) {
        this.vmMembers = vmMembers;
        return this;
    }

    /**
     * Get the affinityType property: placement policy affinity type.
     *
     * @return the affinityType value.
     */
    public AffinityType affinityType() {
        return this.affinityType;
    }

    /**
     * Set the affinityType property: placement policy affinity type.
     *
     * @param affinityType the affinityType value to set.
     * @return the VmPlacementPolicyProperties object itself.
     */
    public VmPlacementPolicyProperties withAffinityType(AffinityType affinityType) {
        this.affinityType = affinityType;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VmPlacementPolicyProperties withState(PlacementPolicyState state) {
        super.withState(state);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VmPlacementPolicyProperties withDisplayName(String displayName) {
        super.withDisplayName(displayName);
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
        if (vmMembers() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property vmMembers in model VmPlacementPolicyProperties"));
        }
        if (affinityType() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property affinityType in model VmPlacementPolicyProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(VmPlacementPolicyProperties.class);
}
