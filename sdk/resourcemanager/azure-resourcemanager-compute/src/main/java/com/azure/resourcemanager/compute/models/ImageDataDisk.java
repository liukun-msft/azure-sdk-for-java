// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes a data disk. */
@Fluent
public final class ImageDataDisk extends ImageDisk {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ImageDataDisk.class);

    /*
     * Specifies the logical unit number of the data disk. This value is used
     * to identify data disks within the VM and therefore must be unique for
     * each data disk attached to a VM.
     */
    @JsonProperty(value = "lun", required = true)
    private int lun;

    /**
     * Get the lun property: Specifies the logical unit number of the data disk. This value is used to identify data
     * disks within the VM and therefore must be unique for each data disk attached to a VM.
     *
     * @return the lun value.
     */
    public int lun() {
        return this.lun;
    }

    /**
     * Set the lun property: Specifies the logical unit number of the data disk. This value is used to identify data
     * disks within the VM and therefore must be unique for each data disk attached to a VM.
     *
     * @param lun the lun value to set.
     * @return the ImageDataDisk object itself.
     */
    public ImageDataDisk withLun(int lun) {
        this.lun = lun;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ImageDataDisk withSnapshot(SubResource snapshot) {
        super.withSnapshot(snapshot);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ImageDataDisk withManagedDisk(SubResource managedDisk) {
        super.withManagedDisk(managedDisk);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ImageDataDisk withBlobUri(String blobUri) {
        super.withBlobUri(blobUri);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ImageDataDisk withCaching(CachingTypes caching) {
        super.withCaching(caching);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ImageDataDisk withDiskSizeGB(Integer diskSizeGB) {
        super.withDiskSizeGB(diskSizeGB);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ImageDataDisk withStorageAccountType(StorageAccountTypes storageAccountType) {
        super.withStorageAccountType(storageAccountType);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ImageDataDisk withDiskEncryptionSet(DiskEncryptionSetParameters diskEncryptionSet) {
        super.withDiskEncryptionSet(diskEncryptionSet);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
