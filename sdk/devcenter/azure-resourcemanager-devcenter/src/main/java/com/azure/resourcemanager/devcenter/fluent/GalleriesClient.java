// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.devcenter.fluent.models.GalleryInner;

/** An instance of this class provides access to all the operations defined in GalleriesClient. */
public interface GalleriesClient {
    /**
     * Lists galleries for a devcenter.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param devCenterName The name of the devcenter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return results of the gallery list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<GalleryInner> listByDevCenter(String resourceGroupName, String devCenterName);

    /**
     * Lists galleries for a devcenter.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param devCenterName The name of the devcenter.
     * @param top The maximum number of resources to return from the operation. Example: '$top=10'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return results of the gallery list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<GalleryInner> listByDevCenter(
        String resourceGroupName, String devCenterName, Integer top, Context context);

    /**
     * Gets a gallery.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param devCenterName The name of the devcenter.
     * @param galleryName The name of the gallery.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a gallery along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<GalleryInner> getWithResponse(
        String resourceGroupName, String devCenterName, String galleryName, Context context);

    /**
     * Gets a gallery.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param devCenterName The name of the devcenter.
     * @param galleryName The name of the gallery.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a gallery.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    GalleryInner get(String resourceGroupName, String devCenterName, String galleryName);

    /**
     * Creates or updates a gallery.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param devCenterName The name of the devcenter.
     * @param galleryName The name of the gallery.
     * @param body Represents a gallery.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of represents a gallery.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<GalleryInner>, GalleryInner> beginCreateOrUpdate(
        String resourceGroupName, String devCenterName, String galleryName, GalleryInner body);

    /**
     * Creates or updates a gallery.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param devCenterName The name of the devcenter.
     * @param galleryName The name of the gallery.
     * @param body Represents a gallery.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of represents a gallery.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<GalleryInner>, GalleryInner> beginCreateOrUpdate(
        String resourceGroupName, String devCenterName, String galleryName, GalleryInner body, Context context);

    /**
     * Creates or updates a gallery.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param devCenterName The name of the devcenter.
     * @param galleryName The name of the gallery.
     * @param body Represents a gallery.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a gallery.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    GalleryInner createOrUpdate(String resourceGroupName, String devCenterName, String galleryName, GalleryInner body);

    /**
     * Creates or updates a gallery.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param devCenterName The name of the devcenter.
     * @param galleryName The name of the gallery.
     * @param body Represents a gallery.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a gallery.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    GalleryInner createOrUpdate(
        String resourceGroupName, String devCenterName, String galleryName, GalleryInner body, Context context);

    /**
     * Deletes a gallery resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param devCenterName The name of the devcenter.
     * @param galleryName The name of the gallery.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String devCenterName, String galleryName);

    /**
     * Deletes a gallery resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param devCenterName The name of the devcenter.
     * @param galleryName The name of the gallery.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String devCenterName, String galleryName, Context context);

    /**
     * Deletes a gallery resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param devCenterName The name of the devcenter.
     * @param galleryName The name of the gallery.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String devCenterName, String galleryName);

    /**
     * Deletes a gallery resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param devCenterName The name of the devcenter.
     * @param galleryName The name of the gallery.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String devCenterName, String galleryName, Context context);
}
