// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The properties of a certificate used for authenticating a token. */
@Fluent
public final class TokenCertificate {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TokenCertificate.class);

    /*
     * The name property.
     */
    @JsonProperty(value = "name")
    private TokenCertificateName name;

    /*
     * The expiry datetime of the certificate.
     */
    @JsonProperty(value = "expiry")
    private OffsetDateTime expiry;

    /*
     * The thumbprint of the certificate.
     */
    @JsonProperty(value = "thumbprint")
    private String thumbprint;

    /*
     * Base 64 encoded string of the public certificate1 in PEM format that
     * will be used for authenticating the token.
     */
    @JsonProperty(value = "encodedPemCertificate")
    private String encodedPemCertificate;

    /**
     * Get the name property: The name property.
     *
     * @return the name value.
     */
    public TokenCertificateName name() {
        return this.name;
    }

    /**
     * Set the name property: The name property.
     *
     * @param name the name value to set.
     * @return the TokenCertificate object itself.
     */
    public TokenCertificate withName(TokenCertificateName name) {
        this.name = name;
        return this;
    }

    /**
     * Get the expiry property: The expiry datetime of the certificate.
     *
     * @return the expiry value.
     */
    public OffsetDateTime expiry() {
        return this.expiry;
    }

    /**
     * Set the expiry property: The expiry datetime of the certificate.
     *
     * @param expiry the expiry value to set.
     * @return the TokenCertificate object itself.
     */
    public TokenCertificate withExpiry(OffsetDateTime expiry) {
        this.expiry = expiry;
        return this;
    }

    /**
     * Get the thumbprint property: The thumbprint of the certificate.
     *
     * @return the thumbprint value.
     */
    public String thumbprint() {
        return this.thumbprint;
    }

    /**
     * Set the thumbprint property: The thumbprint of the certificate.
     *
     * @param thumbprint the thumbprint value to set.
     * @return the TokenCertificate object itself.
     */
    public TokenCertificate withThumbprint(String thumbprint) {
        this.thumbprint = thumbprint;
        return this;
    }

    /**
     * Get the encodedPemCertificate property: Base 64 encoded string of the public certificate1 in PEM format that will
     * be used for authenticating the token.
     *
     * @return the encodedPemCertificate value.
     */
    public String encodedPemCertificate() {
        return this.encodedPemCertificate;
    }

    /**
     * Set the encodedPemCertificate property: Base 64 encoded string of the public certificate1 in PEM format that will
     * be used for authenticating the token.
     *
     * @param encodedPemCertificate the encodedPemCertificate value to set.
     * @return the TokenCertificate object itself.
     */
    public TokenCertificate withEncodedPemCertificate(String encodedPemCertificate) {
        this.encodedPemCertificate = encodedPemCertificate;
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
