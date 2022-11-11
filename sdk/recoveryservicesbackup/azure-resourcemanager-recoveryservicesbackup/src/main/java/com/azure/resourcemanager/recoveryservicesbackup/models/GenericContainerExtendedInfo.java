// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Container extended information. */
@Fluent
public final class GenericContainerExtendedInfo {
    /*
     * Public key of container cert
     */
    @JsonProperty(value = "rawCertData")
    private String rawCertData;

    /*
     * Container identity information
     */
    @JsonProperty(value = "containerIdentityInfo")
    private ContainerIdentityInfo containerIdentityInfo;

    /*
     * Azure Backup Service Endpoints for the container
     */
    @JsonProperty(value = "serviceEndpoints")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> serviceEndpoints;

    /** Creates an instance of GenericContainerExtendedInfo class. */
    public GenericContainerExtendedInfo() {
    }

    /**
     * Get the rawCertData property: Public key of container cert.
     *
     * @return the rawCertData value.
     */
    public String rawCertData() {
        return this.rawCertData;
    }

    /**
     * Set the rawCertData property: Public key of container cert.
     *
     * @param rawCertData the rawCertData value to set.
     * @return the GenericContainerExtendedInfo object itself.
     */
    public GenericContainerExtendedInfo withRawCertData(String rawCertData) {
        this.rawCertData = rawCertData;
        return this;
    }

    /**
     * Get the containerIdentityInfo property: Container identity information.
     *
     * @return the containerIdentityInfo value.
     */
    public ContainerIdentityInfo containerIdentityInfo() {
        return this.containerIdentityInfo;
    }

    /**
     * Set the containerIdentityInfo property: Container identity information.
     *
     * @param containerIdentityInfo the containerIdentityInfo value to set.
     * @return the GenericContainerExtendedInfo object itself.
     */
    public GenericContainerExtendedInfo withContainerIdentityInfo(ContainerIdentityInfo containerIdentityInfo) {
        this.containerIdentityInfo = containerIdentityInfo;
        return this;
    }

    /**
     * Get the serviceEndpoints property: Azure Backup Service Endpoints for the container.
     *
     * @return the serviceEndpoints value.
     */
    public Map<String, String> serviceEndpoints() {
        return this.serviceEndpoints;
    }

    /**
     * Set the serviceEndpoints property: Azure Backup Service Endpoints for the container.
     *
     * @param serviceEndpoints the serviceEndpoints value to set.
     * @return the GenericContainerExtendedInfo object itself.
     */
    public GenericContainerExtendedInfo withServiceEndpoints(Map<String, String> serviceEndpoints) {
        this.serviceEndpoints = serviceEndpoints;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (containerIdentityInfo() != null) {
            containerIdentityInfo().validate();
        }
    }
}
