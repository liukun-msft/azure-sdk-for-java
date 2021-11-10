// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.compute.fluent.models.RestorePointInner;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in RestorePointsClient. */
public interface RestorePointsClient {
    /**
     * The operation to create the restore point. Updating properties of an existing restore point is not allowed.
     *
     * @param resourceGroupName The name of the resource group.
     * @param restorePointCollectionName The name of the restore point collection.
     * @param restorePointName The name of the restore point.
     * @param parameters Parameters supplied to the Create restore point operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return restore Point details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> createWithResponseAsync(
        String resourceGroupName,
        String restorePointCollectionName,
        String restorePointName,
        RestorePointInner parameters);

    /**
     * The operation to create the restore point. Updating properties of an existing restore point is not allowed.
     *
     * @param resourceGroupName The name of the resource group.
     * @param restorePointCollectionName The name of the restore point collection.
     * @param restorePointName The name of the restore point.
     * @param parameters Parameters supplied to the Create restore point operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return restore Point details.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<RestorePointInner>, RestorePointInner> beginCreateAsync(
        String resourceGroupName,
        String restorePointCollectionName,
        String restorePointName,
        RestorePointInner parameters);

    /**
     * The operation to create the restore point. Updating properties of an existing restore point is not allowed.
     *
     * @param resourceGroupName The name of the resource group.
     * @param restorePointCollectionName The name of the restore point collection.
     * @param restorePointName The name of the restore point.
     * @param parameters Parameters supplied to the Create restore point operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return restore Point details.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<RestorePointInner>, RestorePointInner> beginCreate(
        String resourceGroupName,
        String restorePointCollectionName,
        String restorePointName,
        RestorePointInner parameters);

    /**
     * The operation to create the restore point. Updating properties of an existing restore point is not allowed.
     *
     * @param resourceGroupName The name of the resource group.
     * @param restorePointCollectionName The name of the restore point collection.
     * @param restorePointName The name of the restore point.
     * @param parameters Parameters supplied to the Create restore point operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return restore Point details.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<RestorePointInner>, RestorePointInner> beginCreate(
        String resourceGroupName,
        String restorePointCollectionName,
        String restorePointName,
        RestorePointInner parameters,
        Context context);

    /**
     * The operation to create the restore point. Updating properties of an existing restore point is not allowed.
     *
     * @param resourceGroupName The name of the resource group.
     * @param restorePointCollectionName The name of the restore point collection.
     * @param restorePointName The name of the restore point.
     * @param parameters Parameters supplied to the Create restore point operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return restore Point details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<RestorePointInner> createAsync(
        String resourceGroupName,
        String restorePointCollectionName,
        String restorePointName,
        RestorePointInner parameters);

    /**
     * The operation to create the restore point. Updating properties of an existing restore point is not allowed.
     *
     * @param resourceGroupName The name of the resource group.
     * @param restorePointCollectionName The name of the restore point collection.
     * @param restorePointName The name of the restore point.
     * @param parameters Parameters supplied to the Create restore point operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return restore Point details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RestorePointInner create(
        String resourceGroupName,
        String restorePointCollectionName,
        String restorePointName,
        RestorePointInner parameters);

    /**
     * The operation to create the restore point. Updating properties of an existing restore point is not allowed.
     *
     * @param resourceGroupName The name of the resource group.
     * @param restorePointCollectionName The name of the restore point collection.
     * @param restorePointName The name of the restore point.
     * @param parameters Parameters supplied to the Create restore point operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return restore Point details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RestorePointInner create(
        String resourceGroupName,
        String restorePointCollectionName,
        String restorePointName,
        RestorePointInner parameters,
        Context context);

    /**
     * The operation to delete the restore point.
     *
     * @param resourceGroupName The name of the resource group.
     * @param restorePointCollectionName The name of the Restore Point Collection.
     * @param restorePointName The name of the restore point.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> deleteWithResponseAsync(
        String resourceGroupName, String restorePointCollectionName, String restorePointName);

    /**
     * The operation to delete the restore point.
     *
     * @param resourceGroupName The name of the resource group.
     * @param restorePointCollectionName The name of the Restore Point Collection.
     * @param restorePointName The name of the restore point.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<Void>, Void> beginDeleteAsync(
        String resourceGroupName, String restorePointCollectionName, String restorePointName);

    /**
     * The operation to delete the restore point.
     *
     * @param resourceGroupName The name of the resource group.
     * @param restorePointCollectionName The name of the Restore Point Collection.
     * @param restorePointName The name of the restore point.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String restorePointCollectionName, String restorePointName);

    /**
     * The operation to delete the restore point.
     *
     * @param resourceGroupName The name of the resource group.
     * @param restorePointCollectionName The name of the Restore Point Collection.
     * @param restorePointName The name of the restore point.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String restorePointCollectionName, String restorePointName, Context context);

    /**
     * The operation to delete the restore point.
     *
     * @param resourceGroupName The name of the resource group.
     * @param restorePointCollectionName The name of the Restore Point Collection.
     * @param restorePointName The name of the restore point.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String restorePointCollectionName, String restorePointName);

    /**
     * The operation to delete the restore point.
     *
     * @param resourceGroupName The name of the resource group.
     * @param restorePointCollectionName The name of the Restore Point Collection.
     * @param restorePointName The name of the restore point.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String restorePointCollectionName, String restorePointName);

    /**
     * The operation to delete the restore point.
     *
     * @param resourceGroupName The name of the resource group.
     * @param restorePointCollectionName The name of the Restore Point Collection.
     * @param restorePointName The name of the restore point.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String restorePointCollectionName, String restorePointName, Context context);

    /**
     * The operation to get the restore point.
     *
     * @param resourceGroupName The name of the resource group.
     * @param restorePointCollectionName The name of the restore point collection.
     * @param restorePointName The name of the restore point.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return restore Point details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<RestorePointInner>> getWithResponseAsync(
        String resourceGroupName, String restorePointCollectionName, String restorePointName);

    /**
     * The operation to get the restore point.
     *
     * @param resourceGroupName The name of the resource group.
     * @param restorePointCollectionName The name of the restore point collection.
     * @param restorePointName The name of the restore point.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return restore Point details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<RestorePointInner> getAsync(
        String resourceGroupName, String restorePointCollectionName, String restorePointName);

    /**
     * The operation to get the restore point.
     *
     * @param resourceGroupName The name of the resource group.
     * @param restorePointCollectionName The name of the restore point collection.
     * @param restorePointName The name of the restore point.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return restore Point details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RestorePointInner get(String resourceGroupName, String restorePointCollectionName, String restorePointName);

    /**
     * The operation to get the restore point.
     *
     * @param resourceGroupName The name of the resource group.
     * @param restorePointCollectionName The name of the restore point collection.
     * @param restorePointName The name of the restore point.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return restore Point details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RestorePointInner> getWithResponse(
        String resourceGroupName, String restorePointCollectionName, String restorePointName, Context context);
}
