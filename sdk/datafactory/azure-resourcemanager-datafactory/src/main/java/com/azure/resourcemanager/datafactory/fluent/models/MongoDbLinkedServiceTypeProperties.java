// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.models.MongoDbAuthenticationType;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import com.fasterxml.jackson.annotation.JsonProperty;

/** MongoDB linked service properties. */
@Fluent
public final class MongoDbLinkedServiceTypeProperties {
    /*
     * The IP address or server name of the MongoDB server. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "server", required = true)
    private Object server;

    /*
     * The authentication type to be used to connect to the MongoDB database.
     */
    @JsonProperty(value = "authenticationType")
    private MongoDbAuthenticationType authenticationType;

    /*
     * The name of the MongoDB database that you want to access. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "databaseName", required = true)
    private Object databaseName;

    /*
     * Username for authentication. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "username")
    private Object username;

    /*
     * Password for authentication.
     */
    @JsonProperty(value = "password")
    private SecretBase password;

    /*
     * Database to verify the username and password. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "authSource")
    private Object authSource;

    /*
     * The TCP port number that the MongoDB server uses to listen for client connections. The default value is 27017.
     * Type: integer (or Expression with resultType integer), minimum: 0.
     */
    @JsonProperty(value = "port")
    private Object port;

    /*
     * Specifies whether the connections to the server are encrypted using SSL. The default value is false. Type:
     * boolean (or Expression with resultType boolean).
     */
    @JsonProperty(value = "enableSsl")
    private Object enableSsl;

    /*
     * Specifies whether to allow self-signed certificates from the server. The default value is false. Type: boolean
     * (or Expression with resultType boolean).
     */
    @JsonProperty(value = "allowSelfSignedServerCert")
    private Object allowSelfSignedServerCert;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get the server property: The IP address or server name of the MongoDB server. Type: string (or Expression with
     * resultType string).
     *
     * @return the server value.
     */
    public Object server() {
        return this.server;
    }

    /**
     * Set the server property: The IP address or server name of the MongoDB server. Type: string (or Expression with
     * resultType string).
     *
     * @param server the server value to set.
     * @return the MongoDbLinkedServiceTypeProperties object itself.
     */
    public MongoDbLinkedServiceTypeProperties withServer(Object server) {
        this.server = server;
        return this;
    }

    /**
     * Get the authenticationType property: The authentication type to be used to connect to the MongoDB database.
     *
     * @return the authenticationType value.
     */
    public MongoDbAuthenticationType authenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authenticationType property: The authentication type to be used to connect to the MongoDB database.
     *
     * @param authenticationType the authenticationType value to set.
     * @return the MongoDbLinkedServiceTypeProperties object itself.
     */
    public MongoDbLinkedServiceTypeProperties withAuthenticationType(MongoDbAuthenticationType authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the databaseName property: The name of the MongoDB database that you want to access. Type: string (or
     * Expression with resultType string).
     *
     * @return the databaseName value.
     */
    public Object databaseName() {
        return this.databaseName;
    }

    /**
     * Set the databaseName property: The name of the MongoDB database that you want to access. Type: string (or
     * Expression with resultType string).
     *
     * @param databaseName the databaseName value to set.
     * @return the MongoDbLinkedServiceTypeProperties object itself.
     */
    public MongoDbLinkedServiceTypeProperties withDatabaseName(Object databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * Get the username property: Username for authentication. Type: string (or Expression with resultType string).
     *
     * @return the username value.
     */
    public Object username() {
        return this.username;
    }

    /**
     * Set the username property: Username for authentication. Type: string (or Expression with resultType string).
     *
     * @param username the username value to set.
     * @return the MongoDbLinkedServiceTypeProperties object itself.
     */
    public MongoDbLinkedServiceTypeProperties withUsername(Object username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: Password for authentication.
     *
     * @return the password value.
     */
    public SecretBase password() {
        return this.password;
    }

    /**
     * Set the password property: Password for authentication.
     *
     * @param password the password value to set.
     * @return the MongoDbLinkedServiceTypeProperties object itself.
     */
    public MongoDbLinkedServiceTypeProperties withPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get the authSource property: Database to verify the username and password. Type: string (or Expression with
     * resultType string).
     *
     * @return the authSource value.
     */
    public Object authSource() {
        return this.authSource;
    }

    /**
     * Set the authSource property: Database to verify the username and password. Type: string (or Expression with
     * resultType string).
     *
     * @param authSource the authSource value to set.
     * @return the MongoDbLinkedServiceTypeProperties object itself.
     */
    public MongoDbLinkedServiceTypeProperties withAuthSource(Object authSource) {
        this.authSource = authSource;
        return this;
    }

    /**
     * Get the port property: The TCP port number that the MongoDB server uses to listen for client connections. The
     * default value is 27017. Type: integer (or Expression with resultType integer), minimum: 0.
     *
     * @return the port value.
     */
    public Object port() {
        return this.port;
    }

    /**
     * Set the port property: The TCP port number that the MongoDB server uses to listen for client connections. The
     * default value is 27017. Type: integer (or Expression with resultType integer), minimum: 0.
     *
     * @param port the port value to set.
     * @return the MongoDbLinkedServiceTypeProperties object itself.
     */
    public MongoDbLinkedServiceTypeProperties withPort(Object port) {
        this.port = port;
        return this;
    }

    /**
     * Get the enableSsl property: Specifies whether the connections to the server are encrypted using SSL. The default
     * value is false. Type: boolean (or Expression with resultType boolean).
     *
     * @return the enableSsl value.
     */
    public Object enableSsl() {
        return this.enableSsl;
    }

    /**
     * Set the enableSsl property: Specifies whether the connections to the server are encrypted using SSL. The default
     * value is false. Type: boolean (or Expression with resultType boolean).
     *
     * @param enableSsl the enableSsl value to set.
     * @return the MongoDbLinkedServiceTypeProperties object itself.
     */
    public MongoDbLinkedServiceTypeProperties withEnableSsl(Object enableSsl) {
        this.enableSsl = enableSsl;
        return this;
    }

    /**
     * Get the allowSelfSignedServerCert property: Specifies whether to allow self-signed certificates from the server.
     * The default value is false. Type: boolean (or Expression with resultType boolean).
     *
     * @return the allowSelfSignedServerCert value.
     */
    public Object allowSelfSignedServerCert() {
        return this.allowSelfSignedServerCert;
    }

    /**
     * Set the allowSelfSignedServerCert property: Specifies whether to allow self-signed certificates from the server.
     * The default value is false. Type: boolean (or Expression with resultType boolean).
     *
     * @param allowSelfSignedServerCert the allowSelfSignedServerCert value to set.
     * @return the MongoDbLinkedServiceTypeProperties object itself.
     */
    public MongoDbLinkedServiceTypeProperties withAllowSelfSignedServerCert(Object allowSelfSignedServerCert) {
        this.allowSelfSignedServerCert = allowSelfSignedServerCert;
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
     * @return the MongoDbLinkedServiceTypeProperties object itself.
     */
    public MongoDbLinkedServiceTypeProperties withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (server() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property server in model MongoDbLinkedServiceTypeProperties"));
        }
        if (databaseName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property databaseName in model MongoDbLinkedServiceTypeProperties"));
        }
        if (password() != null) {
            password().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(MongoDbLinkedServiceTypeProperties.class);
}
