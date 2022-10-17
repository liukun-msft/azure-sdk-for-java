// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** MongoDB linked service properties. */
@Fluent
public final class MongoDbV2LinkedServiceTypeProperties {
    /*
     * The MongoDB connection string. Type: string, SecureString or AzureKeyVaultSecretReference. Type: string,
     * SecureString or AzureKeyVaultSecretReference.
     */
    @JsonProperty(value = "connectionString", required = true)
    private Object connectionString;

    /*
     * The name of the MongoDB database that you want to access. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "database", required = true)
    private Object database;

    /** Creates an instance of MongoDbV2LinkedServiceTypeProperties class. */
    public MongoDbV2LinkedServiceTypeProperties() {
    }

    /**
     * Get the connectionString property: The MongoDB connection string. Type: string, SecureString or
     * AzureKeyVaultSecretReference. Type: string, SecureString or AzureKeyVaultSecretReference.
     *
     * @return the connectionString value.
     */
    public Object connectionString() {
        return this.connectionString;
    }

    /**
     * Set the connectionString property: The MongoDB connection string. Type: string, SecureString or
     * AzureKeyVaultSecretReference. Type: string, SecureString or AzureKeyVaultSecretReference.
     *
     * @param connectionString the connectionString value to set.
     * @return the MongoDbV2LinkedServiceTypeProperties object itself.
     */
    public MongoDbV2LinkedServiceTypeProperties withConnectionString(Object connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * Get the database property: The name of the MongoDB database that you want to access. Type: string (or Expression
     * with resultType string).
     *
     * @return the database value.
     */
    public Object database() {
        return this.database;
    }

    /**
     * Set the database property: The name of the MongoDB database that you want to access. Type: string (or Expression
     * with resultType string).
     *
     * @param database the database value to set.
     * @return the MongoDbV2LinkedServiceTypeProperties object itself.
     */
    public MongoDbV2LinkedServiceTypeProperties withDatabase(Object database) {
        this.database = database;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (connectionString() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property connectionString in model MongoDbV2LinkedServiceTypeProperties"));
        }
        if (database() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property database in model MongoDbV2LinkedServiceTypeProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(MongoDbV2LinkedServiceTypeProperties.class);
}
