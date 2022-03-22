// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.batch.models.PackageState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** An application package which represents a particular version of an application. */
@Fluent
public final class ApplicationPackageInner extends ProxyResource {
    /*
     * The properties associated with the Application Package.
     */
    @JsonProperty(value = "properties")
    private ApplicationPackageProperties innerProperties;

    /*
     * The ETag of the resource, used for concurrency statements.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Get the innerProperties property: The properties associated with the Application Package.
     *
     * @return the innerProperties value.
     */
    private ApplicationPackageProperties innerProperties() {
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
     * Get the state property: The current state of the application package.
     *
     * @return the state value.
     */
    public PackageState state() {
        return this.innerProperties() == null ? null : this.innerProperties().state();
    }

    /**
     * Get the format property: The format of the application package, if the package is active.
     *
     * @return the format value.
     */
    public String format() {
        return this.innerProperties() == null ? null : this.innerProperties().format();
    }

    /**
     * Get the storageUrl property: The URL for the application package in Azure Storage.
     *
     * @return the storageUrl value.
     */
    public String storageUrl() {
        return this.innerProperties() == null ? null : this.innerProperties().storageUrl();
    }

    /**
     * Get the storageUrlExpiry property: The UTC time at which the Azure Storage URL will expire.
     *
     * @return the storageUrlExpiry value.
     */
    public OffsetDateTime storageUrlExpiry() {
        return this.innerProperties() == null ? null : this.innerProperties().storageUrlExpiry();
    }

    /**
     * Get the lastActivationTime property: The time at which the package was last activated, if the package is active.
     *
     * @return the lastActivationTime value.
     */
    public OffsetDateTime lastActivationTime() {
        return this.innerProperties() == null ? null : this.innerProperties().lastActivationTime();
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
