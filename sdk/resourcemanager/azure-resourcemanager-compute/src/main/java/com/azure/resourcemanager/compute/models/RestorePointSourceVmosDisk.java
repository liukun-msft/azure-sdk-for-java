// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes an Operating System disk. */
@Fluent
public final class RestorePointSourceVmosDisk {
    /*
     * Gets the Operating System type.
     */
    @JsonProperty(value = "osType")
    private OperatingSystemType osType;

    /*
     * Gets the disk encryption settings.
     */
    @JsonProperty(value = "encryptionSettings")
    private DiskEncryptionSettings encryptionSettings;

    /*
     * Gets the disk name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Gets the caching type.
     */
    @JsonProperty(value = "caching")
    private CachingTypes caching;

    /*
     * Gets the disk size in GB.
     */
    @JsonProperty(value = "diskSizeGB")
    private Integer diskSizeGB;

    /*
     * Gets the managed disk details
     */
    @JsonProperty(value = "managedDisk")
    private ManagedDiskParameters managedDisk;

    /*
     * Gets the disk restore point Id.
     */
    @JsonProperty(value = "diskRestorePoint")
    private ApiEntityReference diskRestorePoint;

    /** Creates an instance of RestorePointSourceVmosDisk class. */
    public RestorePointSourceVmosDisk() {
    }

    /**
     * Get the osType property: Gets the Operating System type.
     *
     * @return the osType value.
     */
    public OperatingSystemType osType() {
        return this.osType;
    }

    /**
     * Set the osType property: Gets the Operating System type.
     *
     * @param osType the osType value to set.
     * @return the RestorePointSourceVmosDisk object itself.
     */
    public RestorePointSourceVmosDisk withOsType(OperatingSystemType osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get the encryptionSettings property: Gets the disk encryption settings.
     *
     * @return the encryptionSettings value.
     */
    public DiskEncryptionSettings encryptionSettings() {
        return this.encryptionSettings;
    }

    /**
     * Set the encryptionSettings property: Gets the disk encryption settings.
     *
     * @param encryptionSettings the encryptionSettings value to set.
     * @return the RestorePointSourceVmosDisk object itself.
     */
    public RestorePointSourceVmosDisk withEncryptionSettings(DiskEncryptionSettings encryptionSettings) {
        this.encryptionSettings = encryptionSettings;
        return this;
    }

    /**
     * Get the name property: Gets the disk name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Gets the disk name.
     *
     * @param name the name value to set.
     * @return the RestorePointSourceVmosDisk object itself.
     */
    public RestorePointSourceVmosDisk withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the caching property: Gets the caching type.
     *
     * @return the caching value.
     */
    public CachingTypes caching() {
        return this.caching;
    }

    /**
     * Set the caching property: Gets the caching type.
     *
     * @param caching the caching value to set.
     * @return the RestorePointSourceVmosDisk object itself.
     */
    public RestorePointSourceVmosDisk withCaching(CachingTypes caching) {
        this.caching = caching;
        return this;
    }

    /**
     * Get the diskSizeGB property: Gets the disk size in GB.
     *
     * @return the diskSizeGB value.
     */
    public Integer diskSizeGB() {
        return this.diskSizeGB;
    }

    /**
     * Set the diskSizeGB property: Gets the disk size in GB.
     *
     * @param diskSizeGB the diskSizeGB value to set.
     * @return the RestorePointSourceVmosDisk object itself.
     */
    public RestorePointSourceVmosDisk withDiskSizeGB(Integer diskSizeGB) {
        this.diskSizeGB = diskSizeGB;
        return this;
    }

    /**
     * Get the managedDisk property: Gets the managed disk details.
     *
     * @return the managedDisk value.
     */
    public ManagedDiskParameters managedDisk() {
        return this.managedDisk;
    }

    /**
     * Set the managedDisk property: Gets the managed disk details.
     *
     * @param managedDisk the managedDisk value to set.
     * @return the RestorePointSourceVmosDisk object itself.
     */
    public RestorePointSourceVmosDisk withManagedDisk(ManagedDiskParameters managedDisk) {
        this.managedDisk = managedDisk;
        return this;
    }

    /**
     * Get the diskRestorePoint property: Gets the disk restore point Id.
     *
     * @return the diskRestorePoint value.
     */
    public ApiEntityReference diskRestorePoint() {
        return this.diskRestorePoint;
    }

    /**
     * Set the diskRestorePoint property: Gets the disk restore point Id.
     *
     * @param diskRestorePoint the diskRestorePoint value to set.
     * @return the RestorePointSourceVmosDisk object itself.
     */
    public RestorePointSourceVmosDisk withDiskRestorePoint(ApiEntityReference diskRestorePoint) {
        this.diskRestorePoint = diskRestorePoint;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (encryptionSettings() != null) {
            encryptionSettings().validate();
        }
        if (managedDisk() != null) {
            managedDisk().validate();
        }
        if (diskRestorePoint() != null) {
            diskRestorePoint().validate();
        }
    }
}
