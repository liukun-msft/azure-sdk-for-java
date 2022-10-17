// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.models.CredentialReference;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Azure Batch linked service properties. */
@Fluent
public final class AzureBatchLinkedServiceTypeProperties {
    /*
     * The Azure Batch account name. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "accountName", required = true)
    private Object accountName;

    /*
     * The Azure Batch account access key.
     */
    @JsonProperty(value = "accessKey")
    private SecretBase accessKey;

    /*
     * The Azure Batch URI. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "batchUri", required = true)
    private Object batchUri;

    /*
     * The Azure Batch pool name. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "poolName", required = true)
    private Object poolName;

    /*
     * The Azure Storage linked service reference.
     */
    @JsonProperty(value = "linkedServiceName", required = true)
    private LinkedServiceReference linkedServiceName;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "encryptedCredential")
    private Object encryptedCredential;

    /*
     * The credential reference containing authentication information.
     */
    @JsonProperty(value = "credential")
    private CredentialReference credential;

    /** Creates an instance of AzureBatchLinkedServiceTypeProperties class. */
    public AzureBatchLinkedServiceTypeProperties() {
    }

    /**
     * Get the accountName property: The Azure Batch account name. Type: string (or Expression with resultType string).
     *
     * @return the accountName value.
     */
    public Object accountName() {
        return this.accountName;
    }

    /**
     * Set the accountName property: The Azure Batch account name. Type: string (or Expression with resultType string).
     *
     * @param accountName the accountName value to set.
     * @return the AzureBatchLinkedServiceTypeProperties object itself.
     */
    public AzureBatchLinkedServiceTypeProperties withAccountName(Object accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * Get the accessKey property: The Azure Batch account access key.
     *
     * @return the accessKey value.
     */
    public SecretBase accessKey() {
        return this.accessKey;
    }

    /**
     * Set the accessKey property: The Azure Batch account access key.
     *
     * @param accessKey the accessKey value to set.
     * @return the AzureBatchLinkedServiceTypeProperties object itself.
     */
    public AzureBatchLinkedServiceTypeProperties withAccessKey(SecretBase accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    /**
     * Get the batchUri property: The Azure Batch URI. Type: string (or Expression with resultType string).
     *
     * @return the batchUri value.
     */
    public Object batchUri() {
        return this.batchUri;
    }

    /**
     * Set the batchUri property: The Azure Batch URI. Type: string (or Expression with resultType string).
     *
     * @param batchUri the batchUri value to set.
     * @return the AzureBatchLinkedServiceTypeProperties object itself.
     */
    public AzureBatchLinkedServiceTypeProperties withBatchUri(Object batchUri) {
        this.batchUri = batchUri;
        return this;
    }

    /**
     * Get the poolName property: The Azure Batch pool name. Type: string (or Expression with resultType string).
     *
     * @return the poolName value.
     */
    public Object poolName() {
        return this.poolName;
    }

    /**
     * Set the poolName property: The Azure Batch pool name. Type: string (or Expression with resultType string).
     *
     * @param poolName the poolName value to set.
     * @return the AzureBatchLinkedServiceTypeProperties object itself.
     */
    public AzureBatchLinkedServiceTypeProperties withPoolName(Object poolName) {
        this.poolName = poolName;
        return this;
    }

    /**
     * Get the linkedServiceName property: The Azure Storage linked service reference.
     *
     * @return the linkedServiceName value.
     */
    public LinkedServiceReference linkedServiceName() {
        return this.linkedServiceName;
    }

    /**
     * Set the linkedServiceName property: The Azure Storage linked service reference.
     *
     * @param linkedServiceName the linkedServiceName value to set.
     * @return the AzureBatchLinkedServiceTypeProperties object itself.
     */
    public AzureBatchLinkedServiceTypeProperties withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        this.linkedServiceName = linkedServiceName;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value.
     */
    public Object encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the AzureBatchLinkedServiceTypeProperties object itself.
     */
    public AzureBatchLinkedServiceTypeProperties withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Get the credential property: The credential reference containing authentication information.
     *
     * @return the credential value.
     */
    public CredentialReference credential() {
        return this.credential;
    }

    /**
     * Set the credential property: The credential reference containing authentication information.
     *
     * @param credential the credential value to set.
     * @return the AzureBatchLinkedServiceTypeProperties object itself.
     */
    public AzureBatchLinkedServiceTypeProperties withCredential(CredentialReference credential) {
        this.credential = credential;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (accountName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property accountName in model AzureBatchLinkedServiceTypeProperties"));
        }
        if (accessKey() != null) {
            accessKey().validate();
        }
        if (batchUri() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property batchUri in model AzureBatchLinkedServiceTypeProperties"));
        }
        if (poolName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property poolName in model AzureBatchLinkedServiceTypeProperties"));
        }
        if (linkedServiceName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property linkedServiceName in model AzureBatchLinkedServiceTypeProperties"));
        } else {
            linkedServiceName().validate();
        }
        if (credential() != null) {
            credential().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AzureBatchLinkedServiceTypeProperties.class);
}
