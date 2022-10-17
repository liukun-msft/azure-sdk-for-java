// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.fluent.models.TroubleshootingProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Parameters that define the resource to troubleshoot. */
@Fluent
public final class TroubleshootingParameters {
    /*
     * The target resource to troubleshoot.
     */
    @JsonProperty(value = "targetResourceId", required = true)
    private String targetResourceId;

    /*
     * Properties of the troubleshooting resource.
     */
    @JsonProperty(value = "properties", required = true)
    private TroubleshootingProperties innerProperties = new TroubleshootingProperties();

    /** Creates an instance of TroubleshootingParameters class. */
    public TroubleshootingParameters() {
    }

    /**
     * Get the targetResourceId property: The target resource to troubleshoot.
     *
     * @return the targetResourceId value.
     */
    public String targetResourceId() {
        return this.targetResourceId;
    }

    /**
     * Set the targetResourceId property: The target resource to troubleshoot.
     *
     * @param targetResourceId the targetResourceId value to set.
     * @return the TroubleshootingParameters object itself.
     */
    public TroubleshootingParameters withTargetResourceId(String targetResourceId) {
        this.targetResourceId = targetResourceId;
        return this;
    }

    /**
     * Get the innerProperties property: Properties of the troubleshooting resource.
     *
     * @return the innerProperties value.
     */
    private TroubleshootingProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the storageId property: The ID for the storage account to save the troubleshoot result.
     *
     * @return the storageId value.
     */
    public String storageId() {
        return this.innerProperties() == null ? null : this.innerProperties().storageId();
    }

    /**
     * Set the storageId property: The ID for the storage account to save the troubleshoot result.
     *
     * @param storageId the storageId value to set.
     * @return the TroubleshootingParameters object itself.
     */
    public TroubleshootingParameters withStorageId(String storageId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TroubleshootingProperties();
        }
        this.innerProperties().withStorageId(storageId);
        return this;
    }

    /**
     * Get the storagePath property: The path to the blob to save the troubleshoot result in.
     *
     * @return the storagePath value.
     */
    public String storagePath() {
        return this.innerProperties() == null ? null : this.innerProperties().storagePath();
    }

    /**
     * Set the storagePath property: The path to the blob to save the troubleshoot result in.
     *
     * @param storagePath the storagePath value to set.
     * @return the TroubleshootingParameters object itself.
     */
    public TroubleshootingParameters withStoragePath(String storagePath) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TroubleshootingProperties();
        }
        this.innerProperties().withStoragePath(storagePath);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (targetResourceId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property targetResourceId in model TroubleshootingParameters"));
        }
        if (innerProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerProperties in model TroubleshootingParameters"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(TroubleshootingParameters.class);
}
