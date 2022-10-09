// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.sql.models.TransparentDataEncryptionStatus;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Represents a database transparent data encryption configuration. */
@Fluent
public final class TransparentDataEncryptionInner extends ProxyResource {
    /*
     * Resource location.
     */
    @JsonProperty(value = "location", access = JsonProperty.Access.WRITE_ONLY)
    private String location;

    /*
     * Represents the properties of the resource.
     */
    @JsonProperty(value = "properties")
    private TransparentDataEncryptionProperties innerProperties;

    /**
     * Get the location property: Resource location.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Get the innerProperties property: Represents the properties of the resource.
     *
     * @return the innerProperties value.
     */
    private TransparentDataEncryptionProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the status property: The status of the database transparent data encryption.
     *
     * @return the status value.
     */
    public TransparentDataEncryptionStatus status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
    }

    /**
     * Set the status property: The status of the database transparent data encryption.
     *
     * @param status the status value to set.
     * @return the TransparentDataEncryptionInner object itself.
     */
    public TransparentDataEncryptionInner withStatus(TransparentDataEncryptionStatus status) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TransparentDataEncryptionProperties();
        }
        this.innerProperties().withStatus(status);
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
