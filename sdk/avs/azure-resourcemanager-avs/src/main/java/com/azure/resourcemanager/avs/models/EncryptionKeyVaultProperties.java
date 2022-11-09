// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** An Encryption Key. */
@Fluent
public final class EncryptionKeyVaultProperties {
    /*
     * The name of the key.
     */
    @JsonProperty(value = "keyName")
    private String keyName;

    /*
     * The version of the key.
     */
    @JsonProperty(value = "keyVersion")
    private String keyVersion;

    /*
     * The auto-detected version of the key if versionType is auto-detected.
     */
    @JsonProperty(value = "autoDetectedKeyVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String autoDetectedKeyVersion;

    /*
     * The URL of the vault.
     */
    @JsonProperty(value = "keyVaultUrl")
    private String keyVaultUrl;

    /*
     * The state of key provided
     */
    @JsonProperty(value = "keyState", access = JsonProperty.Access.WRITE_ONLY)
    private EncryptionKeyStatus keyState;

    /*
     * Property of the key if user provided or auto detected
     */
    @JsonProperty(value = "versionType", access = JsonProperty.Access.WRITE_ONLY)
    private EncryptionVersionType versionType;

    /** Creates an instance of EncryptionKeyVaultProperties class. */
    public EncryptionKeyVaultProperties() {
    }

    /**
     * Get the keyName property: The name of the key.
     *
     * @return the keyName value.
     */
    public String keyName() {
        return this.keyName;
    }

    /**
     * Set the keyName property: The name of the key.
     *
     * @param keyName the keyName value to set.
     * @return the EncryptionKeyVaultProperties object itself.
     */
    public EncryptionKeyVaultProperties withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * Get the keyVersion property: The version of the key.
     *
     * @return the keyVersion value.
     */
    public String keyVersion() {
        return this.keyVersion;
    }

    /**
     * Set the keyVersion property: The version of the key.
     *
     * @param keyVersion the keyVersion value to set.
     * @return the EncryptionKeyVaultProperties object itself.
     */
    public EncryptionKeyVaultProperties withKeyVersion(String keyVersion) {
        this.keyVersion = keyVersion;
        return this;
    }

    /**
     * Get the autoDetectedKeyVersion property: The auto-detected version of the key if versionType is auto-detected.
     *
     * @return the autoDetectedKeyVersion value.
     */
    public String autoDetectedKeyVersion() {
        return this.autoDetectedKeyVersion;
    }

    /**
     * Get the keyVaultUrl property: The URL of the vault.
     *
     * @return the keyVaultUrl value.
     */
    public String keyVaultUrl() {
        return this.keyVaultUrl;
    }

    /**
     * Set the keyVaultUrl property: The URL of the vault.
     *
     * @param keyVaultUrl the keyVaultUrl value to set.
     * @return the EncryptionKeyVaultProperties object itself.
     */
    public EncryptionKeyVaultProperties withKeyVaultUrl(String keyVaultUrl) {
        this.keyVaultUrl = keyVaultUrl;
        return this;
    }

    /**
     * Get the keyState property: The state of key provided.
     *
     * @return the keyState value.
     */
    public EncryptionKeyStatus keyState() {
        return this.keyState;
    }

    /**
     * Get the versionType property: Property of the key if user provided or auto detected.
     *
     * @return the versionType value.
     */
    public EncryptionVersionType versionType() {
        return this.versionType;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
