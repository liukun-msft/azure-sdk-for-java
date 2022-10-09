// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Tracks. */
public interface Tracks {
    /**
     * List Tracks in the Asset
     *
     * <p>Lists the Tracks in the asset.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of AssetTrack items as paginated response with {@link PagedIterable}.
     */
    PagedIterable<AssetTrack> list(String resourceGroupName, String accountName, String assetName);

    /**
     * List Tracks in the Asset
     *
     * <p>Lists the Tracks in the asset.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of AssetTrack items as paginated response with {@link PagedIterable}.
     */
    PagedIterable<AssetTrack> list(String resourceGroupName, String accountName, String assetName, Context context);

    /**
     * Get a Track
     *
     * <p>Get the details of a Track in the Asset.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @param trackName The Asset Track name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of a Track in the Asset.
     */
    AssetTrack get(String resourceGroupName, String accountName, String assetName, String trackName);

    /**
     * Get a Track
     *
     * <p>Get the details of a Track in the Asset.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @param trackName The Asset Track name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of a Track in the Asset along with {@link Response}.
     */
    Response<AssetTrack> getWithResponse(
        String resourceGroupName, String accountName, String assetName, String trackName, Context context);

    /**
     * Delete a Track
     *
     * <p>Deletes a Track in the asset.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @param trackName The Asset Track name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String accountName, String assetName, String trackName);

    /**
     * Delete a Track
     *
     * <p>Deletes a Track in the asset.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @param trackName The Asset Track name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String accountName, String assetName, String trackName, Context context);

    /**
     * Update the track data
     *
     * <p>Update the track data. Call this API after any changes are made to the track data stored in the asset
     * container. For example, you have modified the WebVTT captions file in the Azure blob storage container for the
     * asset, viewers will not see the new version of the captions unless this API is called. Note, the changes may not
     * be reflected immediately. CDN cache may also need to be purged if applicable.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @param trackName The Asset Track name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void updateTrackData(String resourceGroupName, String accountName, String assetName, String trackName);

    /**
     * Update the track data
     *
     * <p>Update the track data. Call this API after any changes are made to the track data stored in the asset
     * container. For example, you have modified the WebVTT captions file in the Azure blob storage container for the
     * asset, viewers will not see the new version of the captions unless this API is called. Note, the changes may not
     * be reflected immediately. CDN cache may also need to be purged if applicable.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @param trackName The Asset Track name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void updateTrackData(
        String resourceGroupName, String accountName, String assetName, String trackName, Context context);

    /**
     * Get a Track
     *
     * <p>Get the details of a Track in the Asset.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of a Track in the Asset along with {@link Response}.
     */
    AssetTrack getById(String id);

    /**
     * Get a Track
     *
     * <p>Get the details of a Track in the Asset.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of a Track in the Asset along with {@link Response}.
     */
    Response<AssetTrack> getByIdWithResponse(String id, Context context);

    /**
     * Delete a Track
     *
     * <p>Deletes a Track in the asset.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete a Track
     *
     * <p>Deletes a Track in the asset.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new AssetTrack resource.
     *
     * @param name resource name.
     * @return the first stage of the new AssetTrack definition.
     */
    AssetTrack.DefinitionStages.Blank define(String name);
}
