// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.batch.models.CertificateFormat;
import com.azure.resourcemanager.batch.models.CertificateProvisioningState;
import com.azure.resourcemanager.batch.models.DeleteCertificateError;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Contains information about a certificate. */
@Fluent
public final class CertificateInner extends ProxyResource {
    /*
     * The properties associated with the certificate.
     */
    @JsonProperty(value = "properties")
    private CertificateProperties innerProperties;

    /*
     * The ETag of the resource, used for concurrency statements.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /** Creates an instance of CertificateInner class. */
    public CertificateInner() {
    }

    /**
     * Get the innerProperties property: The properties associated with the certificate.
     *
     * @return the innerProperties value.
     */
    private CertificateProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the etag property: The ETag of the resource, used for concurrency statements.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the provisioningState property: The provisioningState property.
     *
     * @return the provisioningState value.
     */
    public CertificateProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the provisioningStateTransitionTime property: The time at which the certificate entered its current state.
     *
     * @return the provisioningStateTransitionTime value.
     */
    public OffsetDateTime provisioningStateTransitionTime() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningStateTransitionTime();
    }

    /**
     * Get the previousProvisioningState property: The previous provisioned state of the resource.
     *
     * @return the previousProvisioningState value.
     */
    public CertificateProvisioningState previousProvisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().previousProvisioningState();
    }

    /**
     * Get the previousProvisioningStateTransitionTime property: The time at which the certificate entered its previous
     * state.
     *
     * @return the previousProvisioningStateTransitionTime value.
     */
    public OffsetDateTime previousProvisioningStateTransitionTime() {
        return this.innerProperties() == null ? null : this.innerProperties().previousProvisioningStateTransitionTime();
    }

    /**
     * Get the publicData property: The public key of the certificate.
     *
     * @return the publicData value.
     */
    public String publicData() {
        return this.innerProperties() == null ? null : this.innerProperties().publicData();
    }

    /**
     * Get the deleteCertificateError property: This is only returned when the certificate provisioningState is
     * 'Failed'.
     *
     * @return the deleteCertificateError value.
     */
    public DeleteCertificateError deleteCertificateError() {
        return this.innerProperties() == null ? null : this.innerProperties().deleteCertificateError();
    }

    /**
     * Get the thumbprintAlgorithm property: The algorithm of the certificate thumbprint.
     *
     * <p>This must match the first portion of the certificate name. Currently required to be 'SHA1'.
     *
     * @return the thumbprintAlgorithm value.
     */
    public String thumbprintAlgorithm() {
        return this.innerProperties() == null ? null : this.innerProperties().thumbprintAlgorithm();
    }

    /**
     * Set the thumbprintAlgorithm property: The algorithm of the certificate thumbprint.
     *
     * <p>This must match the first portion of the certificate name. Currently required to be 'SHA1'.
     *
     * @param thumbprintAlgorithm the thumbprintAlgorithm value to set.
     * @return the CertificateInner object itself.
     */
    public CertificateInner withThumbprintAlgorithm(String thumbprintAlgorithm) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CertificateProperties();
        }
        this.innerProperties().withThumbprintAlgorithm(thumbprintAlgorithm);
        return this;
    }

    /**
     * Get the thumbprint property: The thumbprint of the certificate.
     *
     * <p>This must match the thumbprint from the name.
     *
     * @return the thumbprint value.
     */
    public String thumbprint() {
        return this.innerProperties() == null ? null : this.innerProperties().thumbprint();
    }

    /**
     * Set the thumbprint property: The thumbprint of the certificate.
     *
     * <p>This must match the thumbprint from the name.
     *
     * @param thumbprint the thumbprint value to set.
     * @return the CertificateInner object itself.
     */
    public CertificateInner withThumbprint(String thumbprint) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CertificateProperties();
        }
        this.innerProperties().withThumbprint(thumbprint);
        return this;
    }

    /**
     * Get the format property: The format of the certificate - either Pfx or Cer. If omitted, the default is Pfx.
     *
     * @return the format value.
     */
    public CertificateFormat format() {
        return this.innerProperties() == null ? null : this.innerProperties().format();
    }

    /**
     * Set the format property: The format of the certificate - either Pfx or Cer. If omitted, the default is Pfx.
     *
     * @param format the format value to set.
     * @return the CertificateInner object itself.
     */
    public CertificateInner withFormat(CertificateFormat format) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CertificateProperties();
        }
        this.innerProperties().withFormat(format);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
