// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.implementation;

import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.BackupManagementUsageInner;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupManagementUsage;
import com.azure.resourcemanager.recoveryservicesbackup.models.NameInfo;
import com.azure.resourcemanager.recoveryservicesbackup.models.UsagesUnit;
import java.time.OffsetDateTime;

public final class BackupManagementUsageImpl implements BackupManagementUsage {
    private BackupManagementUsageInner innerObject;

    private final com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager serviceManager;

    BackupManagementUsageImpl(
        BackupManagementUsageInner innerObject,
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public UsagesUnit unit() {
        return this.innerModel().unit();
    }

    public String quotaPeriod() {
        return this.innerModel().quotaPeriod();
    }

    public OffsetDateTime nextResetTime() {
        return this.innerModel().nextResetTime();
    }

    public Long currentValue() {
        return this.innerModel().currentValue();
    }

    public Long limit() {
        return this.innerModel().limit();
    }

    public NameInfo name() {
        return this.innerModel().name();
    }

    public BackupManagementUsageInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager() {
        return this.serviceManager;
    }
}
