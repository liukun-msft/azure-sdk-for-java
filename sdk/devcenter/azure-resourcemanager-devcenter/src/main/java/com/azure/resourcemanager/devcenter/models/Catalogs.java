// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Catalogs. */
public interface Catalogs {
    /**
     * Lists catalogs for a devcenter.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription.
     * @param devCenterName The name of the devcenter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return results of the catalog list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Catalog> listByDevCenter(String resourceGroupName, String devCenterName);

    /**
     * Lists catalogs for a devcenter.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription.
     * @param devCenterName The name of the devcenter.
     * @param top The maximum number of resources to return from the operation. Example: '$top=10'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return results of the catalog list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Catalog> listByDevCenter(
        String resourceGroupName, String devCenterName, Integer top, Context context);

    /**
     * Gets a catalog.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription.
     * @param devCenterName The name of the devcenter.
     * @param catalogName The name of the Catalog.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a catalog along with {@link Response}.
     */
    Response<Catalog> getWithResponse(
        String resourceGroupName, String devCenterName, String catalogName, Context context);

    /**
     * Gets a catalog.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription.
     * @param devCenterName The name of the devcenter.
     * @param catalogName The name of the Catalog.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a catalog.
     */
    Catalog get(String resourceGroupName, String devCenterName, String catalogName);

    /**
     * Deletes a catalog resource.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription.
     * @param devCenterName The name of the devcenter.
     * @param catalogName The name of the Catalog.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String devCenterName, String catalogName);

    /**
     * Deletes a catalog resource.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription.
     * @param devCenterName The name of the devcenter.
     * @param catalogName The name of the Catalog.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String devCenterName, String catalogName, Context context);

    /**
     * Syncs templates for a template source.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription.
     * @param devCenterName The name of the devcenter.
     * @param catalogName The name of the Catalog.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void sync(String resourceGroupName, String devCenterName, String catalogName);

    /**
     * Syncs templates for a template source.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription.
     * @param devCenterName The name of the devcenter.
     * @param catalogName The name of the Catalog.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void sync(String resourceGroupName, String devCenterName, String catalogName, Context context);

    /**
     * Gets a catalog.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a catalog along with {@link Response}.
     */
    Catalog getById(String id);

    /**
     * Gets a catalog.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a catalog along with {@link Response}.
     */
    Response<Catalog> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a catalog resource.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a catalog resource.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new Catalog resource.
     *
     * @param name resource name.
     * @return the first stage of the new Catalog definition.
     */
    Catalog.DefinitionStages.Blank define(String name);
}
