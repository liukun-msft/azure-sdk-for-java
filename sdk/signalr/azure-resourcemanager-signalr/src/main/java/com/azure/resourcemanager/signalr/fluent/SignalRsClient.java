// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.signalr.fluent.models.NameAvailabilityInner;
import com.azure.resourcemanager.signalr.fluent.models.SignalRKeysInner;
import com.azure.resourcemanager.signalr.fluent.models.SignalRResourceInner;
import com.azure.resourcemanager.signalr.fluent.models.SkuListInner;
import com.azure.resourcemanager.signalr.models.NameAvailabilityParameters;
import com.azure.resourcemanager.signalr.models.RegenerateKeyParameters;

/** An instance of this class provides access to all the operations defined in SignalRsClient. */
public interface SignalRsClient {
    /**
     * Checks that the resource name is valid and is not already in use.
     *
     * @param location the region.
     * @param parameters Parameters supplied to the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to check name availability along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<NameAvailabilityInner> checkNameAvailabilityWithResponse(
        String location, NameAvailabilityParameters parameters, Context context);

    /**
     * Checks that the resource name is valid and is not already in use.
     *
     * @param location the region.
     * @param parameters Parameters supplied to the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to check name availability.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NameAvailabilityInner checkNameAvailability(String location, NameAvailabilityParameters parameters);

    /**
     * Handles requests to list all resources in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that includes an array of resources and a possible link for next set as paginated response with
     *     {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SignalRResourceInner> list();

    /**
     * Handles requests to list all resources in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that includes an array of resources and a possible link for next set as paginated response with
     *     {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SignalRResourceInner> list(Context context);

    /**
     * Handles requests to list all resources in a resource group.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that includes an array of resources and a possible link for next set as paginated response with
     *     {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SignalRResourceInner> listByResourceGroup(String resourceGroupName);

    /**
     * Handles requests to list all resources in a resource group.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that includes an array of resources and a possible link for next set as paginated response with
     *     {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SignalRResourceInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Get the resource and its properties.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param resourceName The name of the resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the resource and its properties along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SignalRResourceInner> getByResourceGroupWithResponse(
        String resourceGroupName, String resourceName, Context context);

    /**
     * Get the resource and its properties.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param resourceName The name of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the resource and its properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SignalRResourceInner getByResourceGroup(String resourceGroupName, String resourceName);

    /**
     * Create or update a resource.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param resourceName The name of the resource.
     * @param parameters Parameters for the create or update operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a class represent a resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<SignalRResourceInner>, SignalRResourceInner> beginCreateOrUpdate(
        String resourceGroupName, String resourceName, SignalRResourceInner parameters);

    /**
     * Create or update a resource.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param resourceName The name of the resource.
     * @param parameters Parameters for the create or update operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a class represent a resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<SignalRResourceInner>, SignalRResourceInner> beginCreateOrUpdate(
        String resourceGroupName, String resourceName, SignalRResourceInner parameters, Context context);

    /**
     * Create or update a resource.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param resourceName The name of the resource.
     * @param parameters Parameters for the create or update operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a class represent a resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SignalRResourceInner createOrUpdate(String resourceGroupName, String resourceName, SignalRResourceInner parameters);

    /**
     * Create or update a resource.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param resourceName The name of the resource.
     * @param parameters Parameters for the create or update operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a class represent a resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SignalRResourceInner createOrUpdate(
        String resourceGroupName, String resourceName, SignalRResourceInner parameters, Context context);

    /**
     * Operation to delete a resource.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param resourceName The name of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String resourceName);

    /**
     * Operation to delete a resource.
     *
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
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String resourceName, Context context);

    /**
     * Operation to delete a resource.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param resourceName The name of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String resourceName);

    /**
     * Operation to delete a resource.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param resourceName The name of the resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String resourceName, Context context);

    /**
     * Operation to update an exiting resource.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param resourceName The name of the resource.
     * @param parameters Parameters for the update operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a class represent a resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<SignalRResourceInner>, SignalRResourceInner> beginUpdate(
        String resourceGroupName, String resourceName, SignalRResourceInner parameters);

    /**
     * Operation to update an exiting resource.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param resourceName The name of the resource.
     * @param parameters Parameters for the update operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a class represent a resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<SignalRResourceInner>, SignalRResourceInner> beginUpdate(
        String resourceGroupName, String resourceName, SignalRResourceInner parameters, Context context);

    /**
     * Operation to update an exiting resource.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param resourceName The name of the resource.
     * @param parameters Parameters for the update operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a class represent a resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SignalRResourceInner update(String resourceGroupName, String resourceName, SignalRResourceInner parameters);

    /**
     * Operation to update an exiting resource.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param resourceName The name of the resource.
     * @param parameters Parameters for the update operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a class represent a resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SignalRResourceInner update(
        String resourceGroupName, String resourceName, SignalRResourceInner parameters, Context context);

    /**
     * Get the access keys of the resource.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param resourceName The name of the resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the access keys of the resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SignalRKeysInner> listKeysWithResponse(String resourceGroupName, String resourceName, Context context);

    /**
     * Get the access keys of the resource.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param resourceName The name of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the access keys of the resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SignalRKeysInner listKeys(String resourceGroupName, String resourceName);

    /**
     * Regenerate the access key for the resource. PrimaryKey and SecondaryKey cannot be regenerated at the same time.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param resourceName The name of the resource.
     * @param parameters Parameter that describes the Regenerate Key Operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a class represents the access keys of the resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<SignalRKeysInner>, SignalRKeysInner> beginRegenerateKey(
        String resourceGroupName, String resourceName, RegenerateKeyParameters parameters);

    /**
     * Regenerate the access key for the resource. PrimaryKey and SecondaryKey cannot be regenerated at the same time.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param resourceName The name of the resource.
     * @param parameters Parameter that describes the Regenerate Key Operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a class represents the access keys of the resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<SignalRKeysInner>, SignalRKeysInner> beginRegenerateKey(
        String resourceGroupName, String resourceName, RegenerateKeyParameters parameters, Context context);

    /**
     * Regenerate the access key for the resource. PrimaryKey and SecondaryKey cannot be regenerated at the same time.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param resourceName The name of the resource.
     * @param parameters Parameter that describes the Regenerate Key Operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a class represents the access keys of the resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SignalRKeysInner regenerateKey(String resourceGroupName, String resourceName, RegenerateKeyParameters parameters);

    /**
     * Regenerate the access key for the resource. PrimaryKey and SecondaryKey cannot be regenerated at the same time.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param resourceName The name of the resource.
     * @param parameters Parameter that describes the Regenerate Key Operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a class represents the access keys of the resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SignalRKeysInner regenerateKey(
        String resourceGroupName, String resourceName, RegenerateKeyParameters parameters, Context context);

    /**
     * Operation to restart a resource.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param resourceName The name of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginRestart(String resourceGroupName, String resourceName);

    /**
     * Operation to restart a resource.
     *
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
    SyncPoller<PollResult<Void>, Void> beginRestart(String resourceGroupName, String resourceName, Context context);

    /**
     * Operation to restart a resource.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param resourceName The name of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void restart(String resourceGroupName, String resourceName);

    /**
     * Operation to restart a resource.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param resourceName The name of the resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void restart(String resourceGroupName, String resourceName, Context context);

    /**
     * List all available skus of the resource.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param resourceName The name of the resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list skus operation response along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SkuListInner> listSkusWithResponse(String resourceGroupName, String resourceName, Context context);

    /**
     * List all available skus of the resource.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param resourceName The name of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list skus operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SkuListInner listSkus(String resourceGroupName, String resourceName);
}
