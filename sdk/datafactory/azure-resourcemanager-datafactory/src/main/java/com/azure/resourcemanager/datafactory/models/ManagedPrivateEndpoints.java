// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of ManagedPrivateEndpoints. */
public interface ManagedPrivateEndpoints {
    /**
     * Lists managed private endpoints.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param managedVirtualNetworkName Managed virtual network name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of managed private endpoint resources as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ManagedPrivateEndpointResource> listByFactory(
        String resourceGroupName, String factoryName, String managedVirtualNetworkName);

    /**
     * Lists managed private endpoints.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param managedVirtualNetworkName Managed virtual network name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of managed private endpoint resources as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ManagedPrivateEndpointResource> listByFactory(
        String resourceGroupName, String factoryName, String managedVirtualNetworkName, Context context);

    /**
     * Gets a managed private endpoint.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param managedVirtualNetworkName Managed virtual network name.
     * @param managedPrivateEndpointName Managed private endpoint name.
     * @param ifNoneMatch ETag of the managed private endpoint entity. Should only be specified for get. If the ETag
     *     matches the existing entity tag, or if * was provided, then no content will be returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a managed private endpoint along with {@link Response}.
     */
    Response<ManagedPrivateEndpointResource> getWithResponse(
        String resourceGroupName,
        String factoryName,
        String managedVirtualNetworkName,
        String managedPrivateEndpointName,
        String ifNoneMatch,
        Context context);

    /**
     * Gets a managed private endpoint.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param managedVirtualNetworkName Managed virtual network name.
     * @param managedPrivateEndpointName Managed private endpoint name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a managed private endpoint.
     */
    ManagedPrivateEndpointResource get(
        String resourceGroupName,
        String factoryName,
        String managedVirtualNetworkName,
        String managedPrivateEndpointName);

    /**
     * Deletes a managed private endpoint.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param managedVirtualNetworkName Managed virtual network name.
     * @param managedPrivateEndpointName Managed private endpoint name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteWithResponse(
        String resourceGroupName,
        String factoryName,
        String managedVirtualNetworkName,
        String managedPrivateEndpointName,
        Context context);

    /**
     * Deletes a managed private endpoint.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param managedVirtualNetworkName Managed virtual network name.
     * @param managedPrivateEndpointName Managed private endpoint name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(
        String resourceGroupName,
        String factoryName,
        String managedVirtualNetworkName,
        String managedPrivateEndpointName);

    /**
     * Gets a managed private endpoint.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a managed private endpoint along with {@link Response}.
     */
    ManagedPrivateEndpointResource getById(String id);

    /**
     * Gets a managed private endpoint.
     *
     * @param id the resource ID.
     * @param ifNoneMatch ETag of the managed private endpoint entity. Should only be specified for get. If the ETag
     *     matches the existing entity tag, or if * was provided, then no content will be returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a managed private endpoint along with {@link Response}.
     */
    Response<ManagedPrivateEndpointResource> getByIdWithResponse(String id, String ifNoneMatch, Context context);

    /**
     * Deletes a managed private endpoint.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a managed private endpoint.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new ManagedPrivateEndpointResource resource.
     *
     * @param name resource name.
     * @return the first stage of the new ManagedPrivateEndpointResource definition.
     */
    ManagedPrivateEndpointResource.DefinitionStages.Blank define(String name);
}
