// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.machinelearning.fluent.models.DeploymentLogsInner;
import com.azure.resourcemanager.machinelearning.fluent.models.OnlineDeploymentInner;
import com.azure.resourcemanager.machinelearning.fluent.models.SkuResourceInner;
import com.azure.resourcemanager.machinelearning.models.DeploymentLogsRequest;
import com.azure.resourcemanager.machinelearning.models.PartialMinimalTrackedResourceWithSku;

/** An instance of this class provides access to all the operations defined in OnlineDeploymentsClient. */
public interface OnlineDeploymentsClient {
    /**
     * List Inference Endpoint Deployments.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Inference endpoint name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a paginated list of OnlineDeployment entities as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<OnlineDeploymentInner> list(String resourceGroupName, String workspaceName, String endpointName);

    /**
     * List Inference Endpoint Deployments.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Inference endpoint name.
     * @param orderBy Ordering of list.
     * @param top Top of list.
     * @param skip Continuation token for pagination.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a paginated list of OnlineDeployment entities as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<OnlineDeploymentInner> list(
        String resourceGroupName,
        String workspaceName,
        String endpointName,
        String orderBy,
        Integer top,
        String skip,
        Context context);

    /**
     * Delete Inference Endpoint Deployment (asynchronous).
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Inference endpoint name.
     * @param deploymentName Inference Endpoint Deployment name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String workspaceName, String endpointName, String deploymentName);

    /**
     * Delete Inference Endpoint Deployment (asynchronous).
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Inference endpoint name.
     * @param deploymentName Inference Endpoint Deployment name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String workspaceName, String endpointName, String deploymentName, Context context);

    /**
     * Delete Inference Endpoint Deployment (asynchronous).
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Inference endpoint name.
     * @param deploymentName Inference Endpoint Deployment name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String workspaceName, String endpointName, String deploymentName);

    /**
     * Delete Inference Endpoint Deployment (asynchronous).
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Inference endpoint name.
     * @param deploymentName Inference Endpoint Deployment name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(
        String resourceGroupName, String workspaceName, String endpointName, String deploymentName, Context context);

    /**
     * Get Inference Deployment Deployment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Inference endpoint name.
     * @param deploymentName Inference Endpoint Deployment name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return inference Deployment Deployment along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<OnlineDeploymentInner> getWithResponse(
        String resourceGroupName, String workspaceName, String endpointName, String deploymentName, Context context);

    /**
     * Get Inference Deployment Deployment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Inference endpoint name.
     * @param deploymentName Inference Endpoint Deployment name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return inference Deployment Deployment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OnlineDeploymentInner get(
        String resourceGroupName, String workspaceName, String endpointName, String deploymentName);

    /**
     * Update Online Deployment (asynchronous).
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Online Endpoint name.
     * @param deploymentName Inference Endpoint Deployment name.
     * @param body Online Endpoint entity to apply during operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<OnlineDeploymentInner>, OnlineDeploymentInner> beginUpdate(
        String resourceGroupName,
        String workspaceName,
        String endpointName,
        String deploymentName,
        PartialMinimalTrackedResourceWithSku body);

    /**
     * Update Online Deployment (asynchronous).
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Online Endpoint name.
     * @param deploymentName Inference Endpoint Deployment name.
     * @param body Online Endpoint entity to apply during operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<OnlineDeploymentInner>, OnlineDeploymentInner> beginUpdate(
        String resourceGroupName,
        String workspaceName,
        String endpointName,
        String deploymentName,
        PartialMinimalTrackedResourceWithSku body,
        Context context);

    /**
     * Update Online Deployment (asynchronous).
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Online Endpoint name.
     * @param deploymentName Inference Endpoint Deployment name.
     * @param body Online Endpoint entity to apply during operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OnlineDeploymentInner update(
        String resourceGroupName,
        String workspaceName,
        String endpointName,
        String deploymentName,
        PartialMinimalTrackedResourceWithSku body);

    /**
     * Update Online Deployment (asynchronous).
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Online Endpoint name.
     * @param deploymentName Inference Endpoint Deployment name.
     * @param body Online Endpoint entity to apply during operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OnlineDeploymentInner update(
        String resourceGroupName,
        String workspaceName,
        String endpointName,
        String deploymentName,
        PartialMinimalTrackedResourceWithSku body,
        Context context);

    /**
     * Create or update Inference Endpoint Deployment (asynchronous).
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Inference endpoint name.
     * @param deploymentName Inference Endpoint Deployment name.
     * @param body Inference Endpoint entity to apply during operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<OnlineDeploymentInner>, OnlineDeploymentInner> beginCreateOrUpdate(
        String resourceGroupName,
        String workspaceName,
        String endpointName,
        String deploymentName,
        OnlineDeploymentInner body);

    /**
     * Create or update Inference Endpoint Deployment (asynchronous).
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Inference endpoint name.
     * @param deploymentName Inference Endpoint Deployment name.
     * @param body Inference Endpoint entity to apply during operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<OnlineDeploymentInner>, OnlineDeploymentInner> beginCreateOrUpdate(
        String resourceGroupName,
        String workspaceName,
        String endpointName,
        String deploymentName,
        OnlineDeploymentInner body,
        Context context);

    /**
     * Create or update Inference Endpoint Deployment (asynchronous).
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Inference endpoint name.
     * @param deploymentName Inference Endpoint Deployment name.
     * @param body Inference Endpoint entity to apply during operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OnlineDeploymentInner createOrUpdate(
        String resourceGroupName,
        String workspaceName,
        String endpointName,
        String deploymentName,
        OnlineDeploymentInner body);

    /**
     * Create or update Inference Endpoint Deployment (asynchronous).
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Inference endpoint name.
     * @param deploymentName Inference Endpoint Deployment name.
     * @param body Inference Endpoint entity to apply during operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OnlineDeploymentInner createOrUpdate(
        String resourceGroupName,
        String workspaceName,
        String endpointName,
        String deploymentName,
        OnlineDeploymentInner body,
        Context context);

    /**
     * Polls an Endpoint operation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Inference endpoint name.
     * @param deploymentName The name and identifier for the endpoint.
     * @param body The request containing parameters for retrieving logs.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DeploymentLogsInner> getLogsWithResponse(
        String resourceGroupName,
        String workspaceName,
        String endpointName,
        String deploymentName,
        DeploymentLogsRequest body,
        Context context);

    /**
     * Polls an Endpoint operation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Inference endpoint name.
     * @param deploymentName The name and identifier for the endpoint.
     * @param body The request containing parameters for retrieving logs.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DeploymentLogsInner getLogs(
        String resourceGroupName,
        String workspaceName,
        String endpointName,
        String deploymentName,
        DeploymentLogsRequest body);

    /**
     * List Inference Endpoint Deployment Skus.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Inference endpoint name.
     * @param deploymentName Inference Endpoint Deployment name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a paginated list of SkuResource entities as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SkuResourceInner> listSkus(
        String resourceGroupName, String workspaceName, String endpointName, String deploymentName);

    /**
     * List Inference Endpoint Deployment Skus.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Inference endpoint name.
     * @param deploymentName Inference Endpoint Deployment name.
     * @param count Number of Skus to be retrieved in a page of results.
     * @param skip Continuation token for pagination.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a paginated list of SkuResource entities as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SkuResourceInner> listSkus(
        String resourceGroupName,
        String workspaceName,
        String endpointName,
        String deploymentName,
        Integer count,
        String skip,
        Context context);
}
