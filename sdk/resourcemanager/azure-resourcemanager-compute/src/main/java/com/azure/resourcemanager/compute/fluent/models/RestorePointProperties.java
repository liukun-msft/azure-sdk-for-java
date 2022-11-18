// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.compute.models.ApiEntityReference;
import com.azure.resourcemanager.compute.models.ConsistencyModeTypes;
import com.azure.resourcemanager.compute.models.RestorePointInstanceView;
import com.azure.resourcemanager.compute.models.RestorePointSourceMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** The restore point properties. */
@Fluent
public final class RestorePointProperties {
    /*
     * List of disk resource ids that the customer wishes to exclude from the restore point. If no disks are specified,
     * all disks will be included.
     */
    @JsonProperty(value = "excludeDisks")
    private List<ApiEntityReference> excludeDisks;

    /*
     * Gets the details of the VM captured at the time of the restore point creation.
     */
    @JsonProperty(value = "sourceMetadata", access = JsonProperty.Access.WRITE_ONLY)
    private RestorePointSourceMetadata sourceMetadata;

    /*
     * Gets the provisioning state of the restore point.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * ConsistencyMode of the RestorePoint. Can be specified in the input while creating a restore point. For now, only
     * CrashConsistent is accepted as a valid input. Please refer to https://aka.ms/RestorePoints for more details.
     */
    @JsonProperty(value = "consistencyMode")
    private ConsistencyModeTypes consistencyMode;

    /*
     * Gets the creation time of the restore point.
     */
    @JsonProperty(value = "timeCreated")
    private OffsetDateTime timeCreated;

    /*
     * Resource Id of the source restore point from which a copy needs to be created.
     */
    @JsonProperty(value = "sourceRestorePoint")
    private ApiEntityReference sourceRestorePoint;

    /*
     * The restore point instance view.
     */
    @JsonProperty(value = "instanceView", access = JsonProperty.Access.WRITE_ONLY)
    private RestorePointInstanceView instanceView;

    /** Creates an instance of RestorePointProperties class. */
    public RestorePointProperties() {
    }

    /**
     * Get the excludeDisks property: List of disk resource ids that the customer wishes to exclude from the restore
     * point. If no disks are specified, all disks will be included.
     *
     * @return the excludeDisks value.
     */
    public List<ApiEntityReference> excludeDisks() {
        return this.excludeDisks;
    }

    /**
     * Set the excludeDisks property: List of disk resource ids that the customer wishes to exclude from the restore
     * point. If no disks are specified, all disks will be included.
     *
     * @param excludeDisks the excludeDisks value to set.
     * @return the RestorePointProperties object itself.
     */
    public RestorePointProperties withExcludeDisks(List<ApiEntityReference> excludeDisks) {
        this.excludeDisks = excludeDisks;
        return this;
    }

    /**
     * Get the sourceMetadata property: Gets the details of the VM captured at the time of the restore point creation.
     *
     * @return the sourceMetadata value.
     */
    public RestorePointSourceMetadata sourceMetadata() {
        return this.sourceMetadata;
    }

    /**
     * Get the provisioningState property: Gets the provisioning state of the restore point.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the consistencyMode property: ConsistencyMode of the RestorePoint. Can be specified in the input while
     * creating a restore point. For now, only CrashConsistent is accepted as a valid input. Please refer to
     * https://aka.ms/RestorePoints for more details.
     *
     * @return the consistencyMode value.
     */
    public ConsistencyModeTypes consistencyMode() {
        return this.consistencyMode;
    }

    /**
     * Set the consistencyMode property: ConsistencyMode of the RestorePoint. Can be specified in the input while
     * creating a restore point. For now, only CrashConsistent is accepted as a valid input. Please refer to
     * https://aka.ms/RestorePoints for more details.
     *
     * @param consistencyMode the consistencyMode value to set.
     * @return the RestorePointProperties object itself.
     */
    public RestorePointProperties withConsistencyMode(ConsistencyModeTypes consistencyMode) {
        this.consistencyMode = consistencyMode;
        return this;
    }

    /**
     * Get the timeCreated property: Gets the creation time of the restore point.
     *
     * @return the timeCreated value.
     */
    public OffsetDateTime timeCreated() {
        return this.timeCreated;
    }

    /**
     * Set the timeCreated property: Gets the creation time of the restore point.
     *
     * @param timeCreated the timeCreated value to set.
     * @return the RestorePointProperties object itself.
     */
    public RestorePointProperties withTimeCreated(OffsetDateTime timeCreated) {
        this.timeCreated = timeCreated;
        return this;
    }

    /**
     * Get the sourceRestorePoint property: Resource Id of the source restore point from which a copy needs to be
     * created.
     *
     * @return the sourceRestorePoint value.
     */
    public ApiEntityReference sourceRestorePoint() {
        return this.sourceRestorePoint;
    }

    /**
     * Set the sourceRestorePoint property: Resource Id of the source restore point from which a copy needs to be
     * created.
     *
     * @param sourceRestorePoint the sourceRestorePoint value to set.
     * @return the RestorePointProperties object itself.
     */
    public RestorePointProperties withSourceRestorePoint(ApiEntityReference sourceRestorePoint) {
        this.sourceRestorePoint = sourceRestorePoint;
        return this;
    }

    /**
     * Get the instanceView property: The restore point instance view.
     *
     * @return the instanceView value.
     */
    public RestorePointInstanceView instanceView() {
        return this.instanceView;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (excludeDisks() != null) {
            excludeDisks().forEach(e -> e.validate());
        }
        if (sourceMetadata() != null) {
            sourceMetadata().validate();
        }
        if (sourceRestorePoint() != null) {
            sourceRestorePoint().validate();
        }
        if (instanceView() != null) {
            instanceView().validate();
        }
    }
}
