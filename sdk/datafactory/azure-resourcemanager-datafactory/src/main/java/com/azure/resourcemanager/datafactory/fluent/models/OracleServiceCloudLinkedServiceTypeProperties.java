// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Oracle Service Cloud linked service properties. */
@Fluent
public final class OracleServiceCloudLinkedServiceTypeProperties {
    /*
     * The URL of the Oracle Service Cloud instance.
     */
    @JsonProperty(value = "host", required = true)
    private Object host;

    /*
     * The user name that you use to access Oracle Service Cloud server.
     */
    @JsonProperty(value = "username", required = true)
    private Object username;

    /*
     * The password corresponding to the user name that you provided in the username key.
     */
    @JsonProperty(value = "password", required = true)
    private SecretBase password;

    /*
     * Specifies whether the data source endpoints are encrypted using HTTPS. The default value is true. Type: boolean
     * (or Expression with resultType boolean).
     */
    @JsonProperty(value = "useEncryptedEndpoints")
    private Object useEncryptedEndpoints;

    /*
     * Specifies whether to require the host name in the server's certificate to match the host name of the server when
     * connecting over SSL. The default value is true. Type: boolean (or Expression with resultType boolean).
     */
    @JsonProperty(value = "useHostVerification")
    private Object useHostVerification;

    /*
     * Specifies whether to verify the identity of the server when connecting over SSL. The default value is true.
     * Type: boolean (or Expression with resultType boolean).
     */
    @JsonProperty(value = "usePeerVerification")
    private Object usePeerVerification;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "encryptedCredential")
    private Object encryptedCredential;

    /** Creates an instance of OracleServiceCloudLinkedServiceTypeProperties class. */
    public OracleServiceCloudLinkedServiceTypeProperties() {
    }

    /**
     * Get the host property: The URL of the Oracle Service Cloud instance.
     *
     * @return the host value.
     */
    public Object host() {
        return this.host;
    }

    /**
     * Set the host property: The URL of the Oracle Service Cloud instance.
     *
     * @param host the host value to set.
     * @return the OracleServiceCloudLinkedServiceTypeProperties object itself.
     */
    public OracleServiceCloudLinkedServiceTypeProperties withHost(Object host) {
        this.host = host;
        return this;
    }

    /**
     * Get the username property: The user name that you use to access Oracle Service Cloud server.
     *
     * @return the username value.
     */
    public Object username() {
        return this.username;
    }

    /**
     * Set the username property: The user name that you use to access Oracle Service Cloud server.
     *
     * @param username the username value to set.
     * @return the OracleServiceCloudLinkedServiceTypeProperties object itself.
     */
    public OracleServiceCloudLinkedServiceTypeProperties withUsername(Object username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: The password corresponding to the user name that you provided in the username key.
     *
     * @return the password value.
     */
    public SecretBase password() {
        return this.password;
    }

    /**
     * Set the password property: The password corresponding to the user name that you provided in the username key.
     *
     * @param password the password value to set.
     * @return the OracleServiceCloudLinkedServiceTypeProperties object itself.
     */
    public OracleServiceCloudLinkedServiceTypeProperties withPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get the useEncryptedEndpoints property: Specifies whether the data source endpoints are encrypted using HTTPS.
     * The default value is true. Type: boolean (or Expression with resultType boolean).
     *
     * @return the useEncryptedEndpoints value.
     */
    public Object useEncryptedEndpoints() {
        return this.useEncryptedEndpoints;
    }

    /**
     * Set the useEncryptedEndpoints property: Specifies whether the data source endpoints are encrypted using HTTPS.
     * The default value is true. Type: boolean (or Expression with resultType boolean).
     *
     * @param useEncryptedEndpoints the useEncryptedEndpoints value to set.
     * @return the OracleServiceCloudLinkedServiceTypeProperties object itself.
     */
    public OracleServiceCloudLinkedServiceTypeProperties withUseEncryptedEndpoints(Object useEncryptedEndpoints) {
        this.useEncryptedEndpoints = useEncryptedEndpoints;
        return this;
    }

    /**
     * Get the useHostVerification property: Specifies whether to require the host name in the server's certificate to
     * match the host name of the server when connecting over SSL. The default value is true. Type: boolean (or
     * Expression with resultType boolean).
     *
     * @return the useHostVerification value.
     */
    public Object useHostVerification() {
        return this.useHostVerification;
    }

    /**
     * Set the useHostVerification property: Specifies whether to require the host name in the server's certificate to
     * match the host name of the server when connecting over SSL. The default value is true. Type: boolean (or
     * Expression with resultType boolean).
     *
     * @param useHostVerification the useHostVerification value to set.
     * @return the OracleServiceCloudLinkedServiceTypeProperties object itself.
     */
    public OracleServiceCloudLinkedServiceTypeProperties withUseHostVerification(Object useHostVerification) {
        this.useHostVerification = useHostVerification;
        return this;
    }

    /**
     * Get the usePeerVerification property: Specifies whether to verify the identity of the server when connecting over
     * SSL. The default value is true. Type: boolean (or Expression with resultType boolean).
     *
     * @return the usePeerVerification value.
     */
    public Object usePeerVerification() {
        return this.usePeerVerification;
    }

    /**
     * Set the usePeerVerification property: Specifies whether to verify the identity of the server when connecting over
     * SSL. The default value is true. Type: boolean (or Expression with resultType boolean).
     *
     * @param usePeerVerification the usePeerVerification value to set.
     * @return the OracleServiceCloudLinkedServiceTypeProperties object itself.
     */
    public OracleServiceCloudLinkedServiceTypeProperties withUsePeerVerification(Object usePeerVerification) {
        this.usePeerVerification = usePeerVerification;
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
     * @return the OracleServiceCloudLinkedServiceTypeProperties object itself.
     */
    public OracleServiceCloudLinkedServiceTypeProperties withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (host() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property host in model OracleServiceCloudLinkedServiceTypeProperties"));
        }
        if (username() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property username in model OracleServiceCloudLinkedServiceTypeProperties"));
        }
        if (password() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property password in model OracleServiceCloudLinkedServiceTypeProperties"));
        } else {
            password().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(OracleServiceCloudLinkedServiceTypeProperties.class);
}
