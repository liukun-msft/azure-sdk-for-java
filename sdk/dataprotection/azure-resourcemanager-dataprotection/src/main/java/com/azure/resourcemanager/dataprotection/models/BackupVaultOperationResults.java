// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of BackupVaultOperationResults. */
public interface BackupVaultOperationResults {
    /**
     * @param vaultName The name of the backup vault.
     * @param resourceGroupName The name of the resource group where the backup vault is present.
     * @param operationId The operationId parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return backupVault Resource.
     */
    BackupVaultResource get(String vaultName, String resourceGroupName, String operationId);

    /**
     * @param vaultName The name of the backup vault.
     * @param resourceGroupName The name of the resource group where the backup vault is present.
     * @param operationId The operationId parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return backupVault Resource.
     */
    Response<BackupVaultResource> getWithResponse(
        String vaultName, String resourceGroupName, String operationId, Context context);
}
