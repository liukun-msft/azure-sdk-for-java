// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes a reference to Key Vault Secret. */
@Fluent
public final class KeyVaultSecretReference {
    /*
     * The URL referencing a secret in a Key Vault.
     */
    @JsonProperty(value = "secretUrl", required = true)
    private String secretUrl;

    /*
     * The relative URL of the Key Vault containing the secret.
     */
    @JsonProperty(value = "sourceVault", required = true)
    private SubResource sourceVault;

    /** Creates an instance of KeyVaultSecretReference class. */
    public KeyVaultSecretReference() {
    }

    /**
     * Get the secretUrl property: The URL referencing a secret in a Key Vault.
     *
     * @return the secretUrl value.
     */
    public String secretUrl() {
        return this.secretUrl;
    }

    /**
     * Set the secretUrl property: The URL referencing a secret in a Key Vault.
     *
     * @param secretUrl the secretUrl value to set.
     * @return the KeyVaultSecretReference object itself.
     */
    public KeyVaultSecretReference withSecretUrl(String secretUrl) {
        this.secretUrl = secretUrl;
        return this;
    }

    /**
     * Get the sourceVault property: The relative URL of the Key Vault containing the secret.
     *
     * @return the sourceVault value.
     */
    public SubResource sourceVault() {
        return this.sourceVault;
    }

    /**
     * Set the sourceVault property: The relative URL of the Key Vault containing the secret.
     *
     * @param sourceVault the sourceVault value to set.
     * @return the KeyVaultSecretReference object itself.
     */
    public KeyVaultSecretReference withSourceVault(SubResource sourceVault) {
        this.sourceVault = sourceVault;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (secretUrl() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property secretUrl in model KeyVaultSecretReference"));
        }
        if (sourceVault() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property sourceVault in model KeyVaultSecretReference"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(KeyVaultSecretReference.class);
}
