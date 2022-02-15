// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.netapp.models.EncryptionType;
import com.azure.resourcemanager.netapp.models.QosType;
import com.azure.resourcemanager.netapp.models.ServiceLevel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Capacity pool resource. */
@Fluent
public final class CapacityPoolInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CapacityPoolInner.class);

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Capacity pool properties
     */
    @JsonProperty(value = "properties", required = true)
    private PoolProperties innerProperties = new PoolProperties();

    /*
     * The system meta data relating to this resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the innerProperties property: Capacity pool properties.
     *
     * @return the innerProperties value.
     */
    private PoolProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: The system meta data relating to this resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /** {@inheritDoc} */
    @Override
    public CapacityPoolInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CapacityPoolInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the poolId property: poolId UUID v4 used to identify the Pool.
     *
     * @return the poolId value.
     */
    public String poolId() {
        return this.innerProperties() == null ? null : this.innerProperties().poolId();
    }

    /**
     * Get the size property: size Provisioned size of the pool (in bytes). Allowed values are in 1TiB chunks (value
     * must be multiply of 4398046511104).
     *
     * @return the size value.
     */
    public long size() {
        return this.innerProperties() == null ? 0L : this.innerProperties().size();
    }

    /**
     * Set the size property: size Provisioned size of the pool (in bytes). Allowed values are in 1TiB chunks (value
     * must be multiply of 4398046511104).
     *
     * @param size the size value to set.
     * @return the CapacityPoolInner object itself.
     */
    public CapacityPoolInner withSize(long size) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PoolProperties();
        }
        this.innerProperties().withSize(size);
        return this;
    }

    /**
     * Get the serviceLevel property: serviceLevel The service level of the file system.
     *
     * @return the serviceLevel value.
     */
    public ServiceLevel serviceLevel() {
        return this.innerProperties() == null ? null : this.innerProperties().serviceLevel();
    }

    /**
     * Set the serviceLevel property: serviceLevel The service level of the file system.
     *
     * @param serviceLevel the serviceLevel value to set.
     * @return the CapacityPoolInner object itself.
     */
    public CapacityPoolInner withServiceLevel(ServiceLevel serviceLevel) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PoolProperties();
        }
        this.innerProperties().withServiceLevel(serviceLevel);
        return this;
    }

    /**
     * Get the provisioningState property: Azure lifecycle management.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the totalThroughputMibps property: Total throughput of pool in Mibps.
     *
     * @return the totalThroughputMibps value.
     */
    public Float totalThroughputMibps() {
        return this.innerProperties() == null ? null : this.innerProperties().totalThroughputMibps();
    }

    /**
     * Get the utilizedThroughputMibps property: Utilized throughput of pool in Mibps.
     *
     * @return the utilizedThroughputMibps value.
     */
    public Float utilizedThroughputMibps() {
        return this.innerProperties() == null ? null : this.innerProperties().utilizedThroughputMibps();
    }

    /**
     * Get the qosType property: The qos type of the pool.
     *
     * @return the qosType value.
     */
    public QosType qosType() {
        return this.innerProperties() == null ? null : this.innerProperties().qosType();
    }

    /**
     * Set the qosType property: The qos type of the pool.
     *
     * @param qosType the qosType value to set.
     * @return the CapacityPoolInner object itself.
     */
    public CapacityPoolInner withQosType(QosType qosType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PoolProperties();
        }
        this.innerProperties().withQosType(qosType);
        return this;
    }

    /**
     * Get the coolAccess property: If enabled (true) the pool can contain cool Access enabled volumes.
     *
     * @return the coolAccess value.
     */
    public Boolean coolAccess() {
        return this.innerProperties() == null ? null : this.innerProperties().coolAccess();
    }

    /**
     * Set the coolAccess property: If enabled (true) the pool can contain cool Access enabled volumes.
     *
     * @param coolAccess the coolAccess value to set.
     * @return the CapacityPoolInner object itself.
     */
    public CapacityPoolInner withCoolAccess(Boolean coolAccess) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PoolProperties();
        }
        this.innerProperties().withCoolAccess(coolAccess);
        return this;
    }

    /**
     * Get the encryptionType property: encryptionType Encryption type of the capacity pool, set encryption type for
     * data at rest for this pool and all volumes in it. This value can only be set when creating new pool.
     *
     * @return the encryptionType value.
     */
    public EncryptionType encryptionType() {
        return this.innerProperties() == null ? null : this.innerProperties().encryptionType();
    }

    /**
     * Set the encryptionType property: encryptionType Encryption type of the capacity pool, set encryption type for
     * data at rest for this pool and all volumes in it. This value can only be set when creating new pool.
     *
     * @param encryptionType the encryptionType value to set.
     * @return the CapacityPoolInner object itself.
     */
    public CapacityPoolInner withEncryptionType(EncryptionType encryptionType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PoolProperties();
        }
        this.innerProperties().withEncryptionType(encryptionType);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerProperties in model CapacityPoolInner"));
        } else {
            innerProperties().validate();
        }
    }
}
