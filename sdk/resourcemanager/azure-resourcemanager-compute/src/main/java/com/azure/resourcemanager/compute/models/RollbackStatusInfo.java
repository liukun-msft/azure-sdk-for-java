// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Information about rollback on failed VM instances after a OS Upgrade operation. */
@Immutable
public final class RollbackStatusInfo {
    /*
     * The number of instances which have been successfully rolled back.
     */
    @JsonProperty(value = "successfullyRolledbackInstanceCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer successfullyRolledbackInstanceCount;

    /*
     * The number of instances which failed to rollback.
     */
    @JsonProperty(value = "failedRolledbackInstanceCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer failedRolledbackInstanceCount;

    /*
     * Error details if OS rollback failed.
     */
    @JsonProperty(value = "rollbackError", access = JsonProperty.Access.WRITE_ONLY)
    private ApiError rollbackError;

    /** Creates an instance of RollbackStatusInfo class. */
    public RollbackStatusInfo() {
    }

    /**
     * Get the successfullyRolledbackInstanceCount property: The number of instances which have been successfully rolled
     * back.
     *
     * @return the successfullyRolledbackInstanceCount value.
     */
    public Integer successfullyRolledbackInstanceCount() {
        return this.successfullyRolledbackInstanceCount;
    }

    /**
     * Get the failedRolledbackInstanceCount property: The number of instances which failed to rollback.
     *
     * @return the failedRolledbackInstanceCount value.
     */
    public Integer failedRolledbackInstanceCount() {
        return this.failedRolledbackInstanceCount;
    }

    /**
     * Get the rollbackError property: Error details if OS rollback failed.
     *
     * @return the rollbackError value.
     */
    public ApiError rollbackError() {
        return this.rollbackError;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (rollbackError() != null) {
            rollbackError().validate();
        }
    }
}
