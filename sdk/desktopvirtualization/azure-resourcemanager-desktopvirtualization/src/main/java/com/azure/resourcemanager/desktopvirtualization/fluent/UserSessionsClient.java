// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.desktopvirtualization.fluent.models.UserSessionInner;
import com.azure.resourcemanager.desktopvirtualization.models.SendMessage;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in UserSessionsClient. */
public interface UserSessionsClient {
    /**
     * List userSessions.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param filter OData filter expression. Valid properties for filtering are userprincipalname and sessionstate.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return userSessionList as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<UserSessionInner> listByHostPoolAsync(String resourceGroupName, String hostPoolName, String filter);

    /**
     * List userSessions.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return userSessionList as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<UserSessionInner> listByHostPoolAsync(String resourceGroupName, String hostPoolName);

    /**
     * List userSessions.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return userSessionList as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<UserSessionInner> listByHostPool(String resourceGroupName, String hostPoolName);

    /**
     * List userSessions.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param filter OData filter expression. Valid properties for filtering are userprincipalname and sessionstate.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return userSessionList as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<UserSessionInner> listByHostPool(
        String resourceGroupName, String hostPoolName, String filter, Context context);

    /**
     * Get a userSession.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param sessionHostname The name of the session host within the specified host pool.
     * @param userSessionId The name of the user session within the specified session host.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a userSession along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<UserSessionInner>> getWithResponseAsync(
        String resourceGroupName, String hostPoolName, String sessionHostname, String userSessionId);

    /**
     * Get a userSession.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param sessionHostname The name of the session host within the specified host pool.
     * @param userSessionId The name of the user session within the specified session host.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a userSession on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<UserSessionInner> getAsync(
        String resourceGroupName, String hostPoolName, String sessionHostname, String userSessionId);

    /**
     * Get a userSession.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param sessionHostname The name of the session host within the specified host pool.
     * @param userSessionId The name of the user session within the specified session host.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a userSession.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    UserSessionInner get(String resourceGroupName, String hostPoolName, String sessionHostname, String userSessionId);

    /**
     * Get a userSession.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param sessionHostname The name of the session host within the specified host pool.
     * @param userSessionId The name of the user session within the specified session host.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a userSession along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<UserSessionInner> getWithResponse(
        String resourceGroupName, String hostPoolName, String sessionHostname, String userSessionId, Context context);

    /**
     * Remove a userSession.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param sessionHostname The name of the session host within the specified host pool.
     * @param userSessionId The name of the user session within the specified session host.
     * @param force Force flag to login off userSession.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Void>> deleteWithResponseAsync(
        String resourceGroupName, String hostPoolName, String sessionHostname, String userSessionId, Boolean force);

    /**
     * Remove a userSession.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param sessionHostname The name of the session host within the specified host pool.
     * @param userSessionId The name of the user session within the specified session host.
     * @param force Force flag to login off userSession.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(
        String resourceGroupName, String hostPoolName, String sessionHostname, String userSessionId, Boolean force);

    /**
     * Remove a userSession.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param sessionHostname The name of the session host within the specified host pool.
     * @param userSessionId The name of the user session within the specified session host.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String hostPoolName, String sessionHostname, String userSessionId);

    /**
     * Remove a userSession.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param sessionHostname The name of the session host within the specified host pool.
     * @param userSessionId The name of the user session within the specified session host.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String hostPoolName, String sessionHostname, String userSessionId);

    /**
     * Remove a userSession.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param sessionHostname The name of the session host within the specified host pool.
     * @param userSessionId The name of the user session within the specified session host.
     * @param force Force flag to login off userSession.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroupName,
        String hostPoolName,
        String sessionHostname,
        String userSessionId,
        Boolean force,
        Context context);

    /**
     * List userSessions.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param sessionHostname The name of the session host within the specified host pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return userSessionList as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<UserSessionInner> listAsync(String resourceGroupName, String hostPoolName, String sessionHostname);

    /**
     * List userSessions.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param sessionHostname The name of the session host within the specified host pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return userSessionList as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<UserSessionInner> list(String resourceGroupName, String hostPoolName, String sessionHostname);

    /**
     * List userSessions.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param sessionHostname The name of the session host within the specified host pool.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return userSessionList as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<UserSessionInner> list(
        String resourceGroupName, String hostPoolName, String sessionHostname, Context context);

    /**
     * Disconnect a userSession.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param sessionHostname The name of the session host within the specified host pool.
     * @param userSessionId The name of the user session within the specified session host.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Void>> disconnectWithResponseAsync(
        String resourceGroupName, String hostPoolName, String sessionHostname, String userSessionId);

    /**
     * Disconnect a userSession.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param sessionHostname The name of the session host within the specified host pool.
     * @param userSessionId The name of the user session within the specified session host.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> disconnectAsync(
        String resourceGroupName, String hostPoolName, String sessionHostname, String userSessionId);

    /**
     * Disconnect a userSession.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param sessionHostname The name of the session host within the specified host pool.
     * @param userSessionId The name of the user session within the specified session host.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void disconnect(String resourceGroupName, String hostPoolName, String sessionHostname, String userSessionId);

    /**
     * Disconnect a userSession.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param sessionHostname The name of the session host within the specified host pool.
     * @param userSessionId The name of the user session within the specified session host.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> disconnectWithResponse(
        String resourceGroupName, String hostPoolName, String sessionHostname, String userSessionId, Context context);

    /**
     * Send a message to a user.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param sessionHostname The name of the session host within the specified host pool.
     * @param userSessionId The name of the user session within the specified session host.
     * @param sendMessage Object containing message includes title and message body.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Void>> sendMessageWithResponseAsync(
        String resourceGroupName,
        String hostPoolName,
        String sessionHostname,
        String userSessionId,
        SendMessage sendMessage);

    /**
     * Send a message to a user.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param sessionHostname The name of the session host within the specified host pool.
     * @param userSessionId The name of the user session within the specified session host.
     * @param sendMessage Object containing message includes title and message body.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> sendMessageAsync(
        String resourceGroupName,
        String hostPoolName,
        String sessionHostname,
        String userSessionId,
        SendMessage sendMessage);

    /**
     * Send a message to a user.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param sessionHostname The name of the session host within the specified host pool.
     * @param userSessionId The name of the user session within the specified session host.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> sendMessageAsync(
        String resourceGroupName, String hostPoolName, String sessionHostname, String userSessionId);

    /**
     * Send a message to a user.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param sessionHostname The name of the session host within the specified host pool.
     * @param userSessionId The name of the user session within the specified session host.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void sendMessage(String resourceGroupName, String hostPoolName, String sessionHostname, String userSessionId);

    /**
     * Send a message to a user.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param sessionHostname The name of the session host within the specified host pool.
     * @param userSessionId The name of the user session within the specified session host.
     * @param sendMessage Object containing message includes title and message body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> sendMessageWithResponse(
        String resourceGroupName,
        String hostPoolName,
        String sessionHostname,
        String userSessionId,
        SendMessage sendMessage,
        Context context);
}
