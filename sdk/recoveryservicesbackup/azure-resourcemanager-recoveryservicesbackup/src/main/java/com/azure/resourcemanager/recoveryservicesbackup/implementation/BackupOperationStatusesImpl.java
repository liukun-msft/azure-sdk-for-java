// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.BackupOperationStatusesClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.OperationStatusInner;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupOperationStatuses;
import com.azure.resourcemanager.recoveryservicesbackup.models.OperationStatus;

public final class BackupOperationStatusesImpl implements BackupOperationStatuses {
    private static final ClientLogger LOGGER = new ClientLogger(BackupOperationStatusesImpl.class);

    private final BackupOperationStatusesClient innerClient;

    private final com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager serviceManager;

    public BackupOperationStatusesImpl(
        BackupOperationStatusesClient innerClient,
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<OperationStatus> getWithResponse(
        String vaultName, String resourceGroupName, String operationId, Context context) {
        Response<OperationStatusInner> inner =
            this.serviceClient().getWithResponse(vaultName, resourceGroupName, operationId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new OperationStatusImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public OperationStatus get(String vaultName, String resourceGroupName, String operationId) {
        OperationStatusInner inner = this.serviceClient().get(vaultName, resourceGroupName, operationId);
        if (inner != null) {
            return new OperationStatusImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private BackupOperationStatusesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager() {
        return this.serviceManager;
    }
}
