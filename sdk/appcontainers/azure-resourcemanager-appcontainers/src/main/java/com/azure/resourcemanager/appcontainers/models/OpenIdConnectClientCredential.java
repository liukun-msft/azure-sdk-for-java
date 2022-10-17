// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The authentication client credentials of the custom Open ID Connect provider. */
@Fluent
public final class OpenIdConnectClientCredential {
    /*
     * The method that should be used to authenticate the user.
     */
    @JsonProperty(value = "method")
    private ClientCredentialMethod method;

    /*
     * The app setting that contains the client secret for the custom Open ID Connect provider.
     */
    @JsonProperty(value = "clientSecretSettingName")
    private String clientSecretSettingName;

    /** Creates an instance of OpenIdConnectClientCredential class. */
    public OpenIdConnectClientCredential() {
    }

    /**
     * Get the method property: The method that should be used to authenticate the user.
     *
     * @return the method value.
     */
    public ClientCredentialMethod method() {
        return this.method;
    }

    /**
     * Set the method property: The method that should be used to authenticate the user.
     *
     * @param method the method value to set.
     * @return the OpenIdConnectClientCredential object itself.
     */
    public OpenIdConnectClientCredential withMethod(ClientCredentialMethod method) {
        this.method = method;
        return this;
    }

    /**
     * Get the clientSecretSettingName property: The app setting that contains the client secret for the custom Open ID
     * Connect provider.
     *
     * @return the clientSecretSettingName value.
     */
    public String clientSecretSettingName() {
        return this.clientSecretSettingName;
    }

    /**
     * Set the clientSecretSettingName property: The app setting that contains the client secret for the custom Open ID
     * Connect provider.
     *
     * @param clientSecretSettingName the clientSecretSettingName value to set.
     * @return the OpenIdConnectClientCredential object itself.
     */
    public OpenIdConnectClientCredential withClientSecretSettingName(String clientSecretSettingName) {
        this.clientSecretSettingName = clientSecretSettingName;
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
