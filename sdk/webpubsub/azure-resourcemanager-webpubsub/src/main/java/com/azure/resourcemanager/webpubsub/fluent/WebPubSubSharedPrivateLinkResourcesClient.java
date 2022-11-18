// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.webpubsub.fluent.models.SharedPrivateLinkResourceInner;

/**
 * An instance of this class provides access to all the operations defined in WebPubSubSharedPrivateLinkResourcesClient.
 */
public interface WebPubSubSharedPrivateLinkResourcesClient {
    /**
     * List shared private link resources.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param resourceName The name of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of shared private link resources as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SharedPrivateLinkResourceInner> list(String resourceGroupName, String resourceName);

    /**
     * List shared private link resources.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param resourceName The name of the resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of shared private link resources as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SharedPrivateLinkResourceInner> list(String resourceGroupName, String resourceName, Context context);

    /**
     * Get the specified shared private link resource.
     *
     * @param sharedPrivateLinkResourceName The name of the shared private link resource.
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param resourceName The name of the resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified shared private link resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SharedPrivateLinkResourceInner> getWithResponse(
        String sharedPrivateLinkResourceName, String resourceGroupName, String resourceName, Context context);

    /**
     * Get the specified shared private link resource.
     *
     * @param sharedPrivateLinkResourceName The name of the shared private link resource.
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param resourceName The name of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified shared private link resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SharedPrivateLinkResourceInner get(
        String sharedPrivateLinkResourceName, String resourceGroupName, String resourceName);

    /**
     * Create or update a shared private link resource.
     *
     * @param sharedPrivateLinkResourceName The name of the shared private link resource.
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param resourceName The name of the resource.
     * @param parameters The shared private link resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of describes a Shared Private Link Resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<SharedPrivateLinkResourceInner>, SharedPrivateLinkResourceInner> beginCreateOrUpdate(
        String sharedPrivateLinkResourceName,
        String resourceGroupName,
        String resourceName,
        SharedPrivateLinkResourceInner parameters);

    /**
     * Create or update a shared private link resource.
     *
     * @param sharedPrivateLinkResourceName The name of the shared private link resource.
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param resourceName The name of the resource.
     * @param parameters The shared private link resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of describes a Shared Private Link Resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<SharedPrivateLinkResourceInner>, SharedPrivateLinkResourceInner> beginCreateOrUpdate(
        String sharedPrivateLinkResourceName,
        String resourceGroupName,
        String resourceName,
        SharedPrivateLinkResourceInner parameters,
        Context context);

    /**
     * Create or update a shared private link resource.
     *
     * @param sharedPrivateLinkResourceName The name of the shared private link resource.
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param resourceName The name of the resource.
     * @param parameters The shared private link resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a Shared Private Link Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SharedPrivateLinkResourceInner createOrUpdate(
        String sharedPrivateLinkResourceName,
        String resourceGroupName,
        String resourceName,
        SharedPrivateLinkResourceInner parameters);

    /**
     * Create or update a shared private link resource.
     *
     * @param sharedPrivateLinkResourceName The name of the shared private link resource.
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param resourceName The name of the resource.
     * @param parameters The shared private link resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a Shared Private Link Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SharedPrivateLinkResourceInner createOrUpdate(
        String sharedPrivateLinkResourceName,
        String resourceGroupName,
        String resourceName,
        SharedPrivateLinkResourceInner parameters,
        Context context);

    /**
     * Delete the specified shared private link resource.
     *
     * @param sharedPrivateLinkResourceName The name of the shared private link resource.
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param resourceName The name of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String sharedPrivateLinkResourceName, String resourceGroupName, String resourceName);

    /**
     * Delete the specified shared private link resource.
     *
     * @param sharedPrivateLinkResourceName The name of the shared private link resource.
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param resourceName The name of the resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String sharedPrivateLinkResourceName, String resourceGroupName, String resourceName, Context context);

    /**
     * Delete the specified shared private link resource.
     *
     * @param sharedPrivateLinkResourceName The name of the shared private link resource.
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param resourceName The name of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String sharedPrivateLinkResourceName, String resourceGroupName, String resourceName);

    /**
     * Delete the specified shared private link resource.
     *
     * @param sharedPrivateLinkResourceName The name of the shared private link resource.
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param resourceName The name of the resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String sharedPrivateLinkResourceName, String resourceGroupName, String resourceName, Context context);
}
