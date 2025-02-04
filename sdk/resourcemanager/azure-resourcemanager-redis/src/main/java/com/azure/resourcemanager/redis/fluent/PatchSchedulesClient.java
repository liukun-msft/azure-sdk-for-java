// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redis.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.redis.fluent.models.RedisPatchScheduleInner;
import com.azure.resourcemanager.redis.models.DefaultName;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in PatchSchedulesClient. */
public interface PatchSchedulesClient {
    /**
     * Gets all patch schedules in the specified redis cache (there is only one).
     *
     * @param resourceGroupName The name of the resource group.
     * @param cacheName The name of the Redis cache.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all patch schedules in the specified redis cache (there is only one) as paginated response with {@link
     *     PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<RedisPatchScheduleInner> listByRedisResourceAsync(String resourceGroupName, String cacheName);

    /**
     * Gets all patch schedules in the specified redis cache (there is only one).
     *
     * @param resourceGroupName The name of the resource group.
     * @param cacheName The name of the Redis cache.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all patch schedules in the specified redis cache (there is only one) as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RedisPatchScheduleInner> listByRedisResource(String resourceGroupName, String cacheName);

    /**
     * Gets all patch schedules in the specified redis cache (there is only one).
     *
     * @param resourceGroupName The name of the resource group.
     * @param cacheName The name of the Redis cache.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all patch schedules in the specified redis cache (there is only one) as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RedisPatchScheduleInner> listByRedisResource(
        String resourceGroupName, String cacheName, Context context);

    /**
     * Create or replace the patching schedule for Redis cache.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the Redis cache.
     * @param defaultParameter Default string modeled as parameter for auto generation to work correctly.
     * @param parameters Parameters to set the patching schedule for Redis cache.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response to put/get patch schedules for Redis cache along with {@link Response} on successful completion
     *     of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<RedisPatchScheduleInner>> createOrUpdateWithResponseAsync(
        String resourceGroupName, String name, DefaultName defaultParameter, RedisPatchScheduleInner parameters);

    /**
     * Create or replace the patching schedule for Redis cache.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the Redis cache.
     * @param defaultParameter Default string modeled as parameter for auto generation to work correctly.
     * @param parameters Parameters to set the patching schedule for Redis cache.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response to put/get patch schedules for Redis cache on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<RedisPatchScheduleInner> createOrUpdateAsync(
        String resourceGroupName, String name, DefaultName defaultParameter, RedisPatchScheduleInner parameters);

    /**
     * Create or replace the patching schedule for Redis cache.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the Redis cache.
     * @param defaultParameter Default string modeled as parameter for auto generation to work correctly.
     * @param parameters Parameters to set the patching schedule for Redis cache.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response to put/get patch schedules for Redis cache.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RedisPatchScheduleInner createOrUpdate(
        String resourceGroupName, String name, DefaultName defaultParameter, RedisPatchScheduleInner parameters);

    /**
     * Create or replace the patching schedule for Redis cache.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the Redis cache.
     * @param defaultParameter Default string modeled as parameter for auto generation to work correctly.
     * @param parameters Parameters to set the patching schedule for Redis cache.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response to put/get patch schedules for Redis cache along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RedisPatchScheduleInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String name,
        DefaultName defaultParameter,
        RedisPatchScheduleInner parameters,
        Context context);

    /**
     * Deletes the patching schedule of a redis cache.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the redis cache.
     * @param defaultParameter Default string modeled as parameter for auto generation to work correctly.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Void>> deleteWithResponseAsync(String resourceGroupName, String name, DefaultName defaultParameter);

    /**
     * Deletes the patching schedule of a redis cache.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the redis cache.
     * @param defaultParameter Default string modeled as parameter for auto generation to work correctly.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String name, DefaultName defaultParameter);

    /**
     * Deletes the patching schedule of a redis cache.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the redis cache.
     * @param defaultParameter Default string modeled as parameter for auto generation to work correctly.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String name, DefaultName defaultParameter);

    /**
     * Deletes the patching schedule of a redis cache.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the redis cache.
     * @param defaultParameter Default string modeled as parameter for auto generation to work correctly.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroupName, String name, DefaultName defaultParameter, Context context);

    /**
     * Gets the patching schedule of a redis cache.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the redis cache.
     * @param defaultParameter Default string modeled as parameter for auto generation to work correctly.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the patching schedule of a redis cache along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<RedisPatchScheduleInner>> getWithResponseAsync(
        String resourceGroupName, String name, DefaultName defaultParameter);

    /**
     * Gets the patching schedule of a redis cache.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the redis cache.
     * @param defaultParameter Default string modeled as parameter for auto generation to work correctly.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the patching schedule of a redis cache on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<RedisPatchScheduleInner> getAsync(String resourceGroupName, String name, DefaultName defaultParameter);

    /**
     * Gets the patching schedule of a redis cache.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the redis cache.
     * @param defaultParameter Default string modeled as parameter for auto generation to work correctly.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the patching schedule of a redis cache.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RedisPatchScheduleInner get(String resourceGroupName, String name, DefaultName defaultParameter);

    /**
     * Gets the patching schedule of a redis cache.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the redis cache.
     * @param defaultParameter Default string modeled as parameter for auto generation to work correctly.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the patching schedule of a redis cache along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RedisPatchScheduleInner> getWithResponse(
        String resourceGroupName, String name, DefaultName defaultParameter, Context context);
}
