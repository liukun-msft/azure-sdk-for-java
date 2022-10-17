// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The configuration settings of the nonce used in the login flow. */
@Fluent
public final class Nonce {
    /*
     * <code>false</code> if the nonce should not be validated while completing the login flow; otherwise,
     * <code>true</code>.
     */
    @JsonProperty(value = "validateNonce")
    private Boolean validateNonce;

    /*
     * The time after the request is made when the nonce should expire.
     */
    @JsonProperty(value = "nonceExpirationInterval")
    private String nonceExpirationInterval;

    /** Creates an instance of Nonce class. */
    public Nonce() {
    }

    /**
     * Get the validateNonce property: &lt;code&gt;false&lt;/code&gt; if the nonce should not be validated while
     * completing the login flow; otherwise, &lt;code&gt;true&lt;/code&gt;.
     *
     * @return the validateNonce value.
     */
    public Boolean validateNonce() {
        return this.validateNonce;
    }

    /**
     * Set the validateNonce property: &lt;code&gt;false&lt;/code&gt; if the nonce should not be validated while
     * completing the login flow; otherwise, &lt;code&gt;true&lt;/code&gt;.
     *
     * @param validateNonce the validateNonce value to set.
     * @return the Nonce object itself.
     */
    public Nonce withValidateNonce(Boolean validateNonce) {
        this.validateNonce = validateNonce;
        return this;
    }

    /**
     * Get the nonceExpirationInterval property: The time after the request is made when the nonce should expire.
     *
     * @return the nonceExpirationInterval value.
     */
    public String nonceExpirationInterval() {
        return this.nonceExpirationInterval;
    }

    /**
     * Set the nonceExpirationInterval property: The time after the request is made when the nonce should expire.
     *
     * @param nonceExpirationInterval the nonceExpirationInterval value to set.
     * @return the Nonce object itself.
     */
    public Nonce withNonceExpirationInterval(String nonceExpirationInterval) {
        this.nonceExpirationInterval = nonceExpirationInterval;
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
