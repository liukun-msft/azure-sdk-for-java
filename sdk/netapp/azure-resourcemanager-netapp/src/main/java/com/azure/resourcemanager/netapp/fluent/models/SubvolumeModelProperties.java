// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Properties which represents actual subvolume model which is stored as a file in the system. */
@Fluent
public final class SubvolumeModelProperties {
    /*
     * path
     *
     * Path to the subvolume
     */
    @JsonProperty(value = "path")
    private String path;

    /*
     * parentpath
     *
     * Path to the parent subvolume
     */
    @JsonProperty(value = "parentPath")
    private String parentPath;

    /*
     * size
     *
     * Size of subvolume
     */
    @JsonProperty(value = "size")
    private Long size;

    /*
     * bytesUsed
     *
     * Bytes used
     */
    @JsonProperty(value = "bytesUsed")
    private Long bytesUsed;

    /*
     * permissions
     *
     * Permissions of the subvolume
     */
    @JsonProperty(value = "permissions")
    private String permissions;

    /*
     * creationTimeStamp
     *
     * Creation time and date
     */
    @JsonProperty(value = "creationTimeStamp")
    private OffsetDateTime creationTimestamp;

    /*
     * accessedTimeStamp
     *
     * Most recent access time and date
     */
    @JsonProperty(value = "accessedTimeStamp")
    private OffsetDateTime accessedTimestamp;

    /*
     * modifiedTimeStamp
     *
     * Most recent modification time and date
     */
    @JsonProperty(value = "modifiedTimeStamp")
    private OffsetDateTime modifiedTimestamp;

    /*
     * changedTimeStamp
     *
     * Most recent change time and date
     */
    @JsonProperty(value = "changedTimeStamp")
    private OffsetDateTime changedTimestamp;

    /*
     * Azure lifecycle management
     */
    @JsonProperty(value = "provisioningState")
    private String provisioningState;

    /**
     * Get the path property: path
     *
     * <p>Path to the subvolume.
     *
     * @return the path value.
     */
    public String path() {
        return this.path;
    }

    /**
     * Set the path property: path
     *
     * <p>Path to the subvolume.
     *
     * @param path the path value to set.
     * @return the SubvolumeModelProperties object itself.
     */
    public SubvolumeModelProperties withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get the parentPath property: parentpath
     *
     * <p>Path to the parent subvolume.
     *
     * @return the parentPath value.
     */
    public String parentPath() {
        return this.parentPath;
    }

    /**
     * Set the parentPath property: parentpath
     *
     * <p>Path to the parent subvolume.
     *
     * @param parentPath the parentPath value to set.
     * @return the SubvolumeModelProperties object itself.
     */
    public SubvolumeModelProperties withParentPath(String parentPath) {
        this.parentPath = parentPath;
        return this;
    }

    /**
     * Get the size property: size
     *
     * <p>Size of subvolume.
     *
     * @return the size value.
     */
    public Long size() {
        return this.size;
    }

    /**
     * Set the size property: size
     *
     * <p>Size of subvolume.
     *
     * @param size the size value to set.
     * @return the SubvolumeModelProperties object itself.
     */
    public SubvolumeModelProperties withSize(Long size) {
        this.size = size;
        return this;
    }

    /**
     * Get the bytesUsed property: bytesUsed
     *
     * <p>Bytes used.
     *
     * @return the bytesUsed value.
     */
    public Long bytesUsed() {
        return this.bytesUsed;
    }

    /**
     * Set the bytesUsed property: bytesUsed
     *
     * <p>Bytes used.
     *
     * @param bytesUsed the bytesUsed value to set.
     * @return the SubvolumeModelProperties object itself.
     */
    public SubvolumeModelProperties withBytesUsed(Long bytesUsed) {
        this.bytesUsed = bytesUsed;
        return this;
    }

    /**
     * Get the permissions property: permissions
     *
     * <p>Permissions of the subvolume.
     *
     * @return the permissions value.
     */
    public String permissions() {
        return this.permissions;
    }

    /**
     * Set the permissions property: permissions
     *
     * <p>Permissions of the subvolume.
     *
     * @param permissions the permissions value to set.
     * @return the SubvolumeModelProperties object itself.
     */
    public SubvolumeModelProperties withPermissions(String permissions) {
        this.permissions = permissions;
        return this;
    }

    /**
     * Get the creationTimestamp property: creationTimeStamp
     *
     * <p>Creation time and date.
     *
     * @return the creationTimestamp value.
     */
    public OffsetDateTime creationTimestamp() {
        return this.creationTimestamp;
    }

    /**
     * Set the creationTimestamp property: creationTimeStamp
     *
     * <p>Creation time and date.
     *
     * @param creationTimestamp the creationTimestamp value to set.
     * @return the SubvolumeModelProperties object itself.
     */
    public SubvolumeModelProperties withCreationTimestamp(OffsetDateTime creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
        return this;
    }

    /**
     * Get the accessedTimestamp property: accessedTimeStamp
     *
     * <p>Most recent access time and date.
     *
     * @return the accessedTimestamp value.
     */
    public OffsetDateTime accessedTimestamp() {
        return this.accessedTimestamp;
    }

    /**
     * Set the accessedTimestamp property: accessedTimeStamp
     *
     * <p>Most recent access time and date.
     *
     * @param accessedTimestamp the accessedTimestamp value to set.
     * @return the SubvolumeModelProperties object itself.
     */
    public SubvolumeModelProperties withAccessedTimestamp(OffsetDateTime accessedTimestamp) {
        this.accessedTimestamp = accessedTimestamp;
        return this;
    }

    /**
     * Get the modifiedTimestamp property: modifiedTimeStamp
     *
     * <p>Most recent modification time and date.
     *
     * @return the modifiedTimestamp value.
     */
    public OffsetDateTime modifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    /**
     * Set the modifiedTimestamp property: modifiedTimeStamp
     *
     * <p>Most recent modification time and date.
     *
     * @param modifiedTimestamp the modifiedTimestamp value to set.
     * @return the SubvolumeModelProperties object itself.
     */
    public SubvolumeModelProperties withModifiedTimestamp(OffsetDateTime modifiedTimestamp) {
        this.modifiedTimestamp = modifiedTimestamp;
        return this;
    }

    /**
     * Get the changedTimestamp property: changedTimeStamp
     *
     * <p>Most recent change time and date.
     *
     * @return the changedTimestamp value.
     */
    public OffsetDateTime changedTimestamp() {
        return this.changedTimestamp;
    }

    /**
     * Set the changedTimestamp property: changedTimeStamp
     *
     * <p>Most recent change time and date.
     *
     * @param changedTimestamp the changedTimestamp value to set.
     * @return the SubvolumeModelProperties object itself.
     */
    public SubvolumeModelProperties withChangedTimestamp(OffsetDateTime changedTimestamp) {
        this.changedTimestamp = changedTimestamp;
        return this;
    }

    /**
     * Get the provisioningState property: Azure lifecycle management.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: Azure lifecycle management.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the SubvolumeModelProperties object itself.
     */
    public SubvolumeModelProperties withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
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
