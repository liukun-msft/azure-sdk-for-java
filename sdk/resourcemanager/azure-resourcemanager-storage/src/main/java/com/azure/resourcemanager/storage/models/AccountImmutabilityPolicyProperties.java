// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** This defines account-level immutability policy properties. */
@Fluent
public final class AccountImmutabilityPolicyProperties {
    /*
     * The immutability period for the blobs in the container since the policy creation, in days.
     */
    @JsonProperty(value = "immutabilityPeriodSinceCreationInDays")
    private Integer immutabilityPeriodSinceCreationInDays;

    /*
     * The ImmutabilityPolicy state defines the mode of the policy. Disabled state disables the policy, Unlocked state
     * allows increase and decrease of immutability retention time and also allows toggling allowProtectedAppendWrites
     * property, Locked state only allows the increase of the immutability retention time. A policy can only be created
     * in a Disabled or Unlocked state and can be toggled between the two states. Only a policy in an Unlocked state
     * can transition to a Locked state which cannot be reverted.
     */
    @JsonProperty(value = "state")
    private AccountImmutabilityPolicyState state;

    /*
     * This property can only be changed for disabled and unlocked time-based retention policies. When enabled, new
     * blocks can be written to an append blob while maintaining immutability protection and compliance. Only new
     * blocks can be added and any existing blocks cannot be modified or deleted.
     */
    @JsonProperty(value = "allowProtectedAppendWrites")
    private Boolean allowProtectedAppendWrites;

    /**
     * Get the immutabilityPeriodSinceCreationInDays property: The immutability period for the blobs in the container
     * since the policy creation, in days.
     *
     * @return the immutabilityPeriodSinceCreationInDays value.
     */
    public Integer immutabilityPeriodSinceCreationInDays() {
        return this.immutabilityPeriodSinceCreationInDays;
    }

    /**
     * Set the immutabilityPeriodSinceCreationInDays property: The immutability period for the blobs in the container
     * since the policy creation, in days.
     *
     * @param immutabilityPeriodSinceCreationInDays the immutabilityPeriodSinceCreationInDays value to set.
     * @return the AccountImmutabilityPolicyProperties object itself.
     */
    public AccountImmutabilityPolicyProperties withImmutabilityPeriodSinceCreationInDays(
        Integer immutabilityPeriodSinceCreationInDays) {
        this.immutabilityPeriodSinceCreationInDays = immutabilityPeriodSinceCreationInDays;
        return this;
    }

    /**
     * Get the state property: The ImmutabilityPolicy state defines the mode of the policy. Disabled state disables the
     * policy, Unlocked state allows increase and decrease of immutability retention time and also allows toggling
     * allowProtectedAppendWrites property, Locked state only allows the increase of the immutability retention time. A
     * policy can only be created in a Disabled or Unlocked state and can be toggled between the two states. Only a
     * policy in an Unlocked state can transition to a Locked state which cannot be reverted.
     *
     * @return the state value.
     */
    public AccountImmutabilityPolicyState state() {
        return this.state;
    }

    /**
     * Set the state property: The ImmutabilityPolicy state defines the mode of the policy. Disabled state disables the
     * policy, Unlocked state allows increase and decrease of immutability retention time and also allows toggling
     * allowProtectedAppendWrites property, Locked state only allows the increase of the immutability retention time. A
     * policy can only be created in a Disabled or Unlocked state and can be toggled between the two states. Only a
     * policy in an Unlocked state can transition to a Locked state which cannot be reverted.
     *
     * @param state the state value to set.
     * @return the AccountImmutabilityPolicyProperties object itself.
     */
    public AccountImmutabilityPolicyProperties withState(AccountImmutabilityPolicyState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the allowProtectedAppendWrites property: This property can only be changed for disabled and unlocked
     * time-based retention policies. When enabled, new blocks can be written to an append blob while maintaining
     * immutability protection and compliance. Only new blocks can be added and any existing blocks cannot be modified
     * or deleted.
     *
     * @return the allowProtectedAppendWrites value.
     */
    public Boolean allowProtectedAppendWrites() {
        return this.allowProtectedAppendWrites;
    }

    /**
     * Set the allowProtectedAppendWrites property: This property can only be changed for disabled and unlocked
     * time-based retention policies. When enabled, new blocks can be written to an append blob while maintaining
     * immutability protection and compliance. Only new blocks can be added and any existing blocks cannot be modified
     * or deleted.
     *
     * @param allowProtectedAppendWrites the allowProtectedAppendWrites value to set.
     * @return the AccountImmutabilityPolicyProperties object itself.
     */
    public AccountImmutabilityPolicyProperties withAllowProtectedAppendWrites(Boolean allowProtectedAppendWrites) {
        this.allowProtectedAppendWrites = allowProtectedAppendWrites;
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
