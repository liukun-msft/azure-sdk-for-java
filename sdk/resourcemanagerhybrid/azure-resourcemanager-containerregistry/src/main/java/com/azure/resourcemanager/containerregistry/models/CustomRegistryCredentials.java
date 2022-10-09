// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes the credentials that will be used to access a custom registry during a run. */
@Fluent
public final class CustomRegistryCredentials {
    /*
     * The username for logging into the custom registry.
     */
    @JsonProperty(value = "userName")
    private SecretObject username;

    /*
     * The password for logging into the custom registry. The password is a
     * secret
     * object that allows multiple ways of providing the value for it.
     */
    @JsonProperty(value = "password")
    private SecretObject password;

    /*
     * Indicates the managed identity assigned to the custom credential. If a
     * user-assigned identity
     * this value is the Client ID. If a system-assigned identity, the value
     * will be `system`. In
     * the case of a system-assigned identity, the Client ID will be determined
     * by the runner. This
     * identity may be used to authenticate to key vault to retrieve
     * credentials or it may be the only
     * source of authentication used for accessing the registry.
     */
    @JsonProperty(value = "identity")
    private String identity;

    /**
     * Get the username property: The username for logging into the custom registry.
     *
     * @return the username value.
     */
    public SecretObject username() {
        return this.username;
    }

    /**
     * Set the username property: The username for logging into the custom registry.
     *
     * @param username the username value to set.
     * @return the CustomRegistryCredentials object itself.
     */
    public CustomRegistryCredentials withUsername(SecretObject username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: The password for logging into the custom registry. The password is a secret object
     * that allows multiple ways of providing the value for it.
     *
     * @return the password value.
     */
    public SecretObject password() {
        return this.password;
    }

    /**
     * Set the password property: The password for logging into the custom registry. The password is a secret object
     * that allows multiple ways of providing the value for it.
     *
     * @param password the password value to set.
     * @return the CustomRegistryCredentials object itself.
     */
    public CustomRegistryCredentials withPassword(SecretObject password) {
        this.password = password;
        return this;
    }

    /**
     * Get the identity property: Indicates the managed identity assigned to the custom credential. If a user-assigned
     * identity this value is the Client ID. If a system-assigned identity, the value will be `system`. In the case of a
     * system-assigned identity, the Client ID will be determined by the runner. This identity may be used to
     * authenticate to key vault to retrieve credentials or it may be the only source of authentication used for
     * accessing the registry.
     *
     * @return the identity value.
     */
    public String identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Indicates the managed identity assigned to the custom credential. If a user-assigned
     * identity this value is the Client ID. If a system-assigned identity, the value will be `system`. In the case of a
     * system-assigned identity, the Client ID will be determined by the runner. This identity may be used to
     * authenticate to key vault to retrieve credentials or it may be the only source of authentication used for
     * accessing the registry.
     *
     * @param identity the identity value to set.
     * @return the CustomRegistryCredentials object itself.
     */
    public CustomRegistryCredentials withIdentity(String identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (username() != null) {
            username().validate();
        }
        if (password() != null) {
            password().validate();
        }
    }
}
