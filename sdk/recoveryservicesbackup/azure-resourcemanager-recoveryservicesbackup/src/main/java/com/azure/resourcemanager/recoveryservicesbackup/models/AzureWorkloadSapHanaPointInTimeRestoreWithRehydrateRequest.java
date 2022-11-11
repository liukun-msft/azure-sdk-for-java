// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import java.util.Map;

/** AzureWorkload SAP Hana-specific restore with integrated rehydration of recovery point. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "objectType")
@JsonTypeName("AzureWorkloadSAPHanaPointInTimeRestoreWithRehydrateRequest")
@Fluent
public final class AzureWorkloadSapHanaPointInTimeRestoreWithRehydrateRequest
    extends AzureWorkloadSapHanaPointInTimeRestoreRequest {
    /*
     * RP Rehydration Info
     */
    @JsonProperty(value = "recoveryPointRehydrationInfo")
    private RecoveryPointRehydrationInfo recoveryPointRehydrationInfo;

    /** Creates an instance of AzureWorkloadSapHanaPointInTimeRestoreWithRehydrateRequest class. */
    public AzureWorkloadSapHanaPointInTimeRestoreWithRehydrateRequest() {
    }

    /**
     * Get the recoveryPointRehydrationInfo property: RP Rehydration Info.
     *
     * @return the recoveryPointRehydrationInfo value.
     */
    public RecoveryPointRehydrationInfo recoveryPointRehydrationInfo() {
        return this.recoveryPointRehydrationInfo;
    }

    /**
     * Set the recoveryPointRehydrationInfo property: RP Rehydration Info.
     *
     * @param recoveryPointRehydrationInfo the recoveryPointRehydrationInfo value to set.
     * @return the AzureWorkloadSapHanaPointInTimeRestoreWithRehydrateRequest object itself.
     */
    public AzureWorkloadSapHanaPointInTimeRestoreWithRehydrateRequest withRecoveryPointRehydrationInfo(
        RecoveryPointRehydrationInfo recoveryPointRehydrationInfo) {
        this.recoveryPointRehydrationInfo = recoveryPointRehydrationInfo;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureWorkloadSapHanaPointInTimeRestoreWithRehydrateRequest withPointInTime(OffsetDateTime pointInTime) {
        super.withPointInTime(pointInTime);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureWorkloadSapHanaPointInTimeRestoreWithRehydrateRequest withRecoveryType(RecoveryType recoveryType) {
        super.withRecoveryType(recoveryType);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureWorkloadSapHanaPointInTimeRestoreWithRehydrateRequest withSourceResourceId(String sourceResourceId) {
        super.withSourceResourceId(sourceResourceId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureWorkloadSapHanaPointInTimeRestoreWithRehydrateRequest withPropertyBag(Map<String, String> propertyBag) {
        super.withPropertyBag(propertyBag);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureWorkloadSapHanaPointInTimeRestoreWithRehydrateRequest withTargetInfo(TargetRestoreInfo targetInfo) {
        super.withTargetInfo(targetInfo);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureWorkloadSapHanaPointInTimeRestoreWithRehydrateRequest withRecoveryMode(RecoveryMode recoveryMode) {
        super.withRecoveryMode(recoveryMode);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureWorkloadSapHanaPointInTimeRestoreWithRehydrateRequest withTargetVirtualMachineId(
        String targetVirtualMachineId) {
        super.withTargetVirtualMachineId(targetVirtualMachineId);
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
        if (recoveryPointRehydrationInfo() != null) {
            recoveryPointRehydrationInfo().validate();
        }
    }
}
