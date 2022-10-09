// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.implementation;

import com.azure.analytics.synapse.artifacts.models.ErrorContractException;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in NotebookOperationResults. */
public final class NotebookOperationResultsImpl {
    /** The proxy service used to perform REST calls. */
    private final NotebookOperationResultsService service;

    /** The service client containing this operation class. */
    private final ArtifactsClientImpl client;

    /**
     * Initializes an instance of NotebookOperationResultsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    NotebookOperationResultsImpl(ArtifactsClientImpl client) {
        this.service =
                RestProxy.create(
                        NotebookOperationResultsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ArtifactsClientNotebookOperationResults to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{endpoint}")
    @ServiceInterface(name = "ArtifactsClientNoteb")
    public interface NotebookOperationResultsService {
        @Get("/notebookOperationResults/{operationId}")
        @ExpectedResponses({200, 201, 202, 204})
        @UnexpectedResponseExceptionType(ErrorContractException.class)
        Mono<Response<Void>> get(
                @HostParam("endpoint") String endpoint,
                @QueryParam("api-version") String apiVersion,
                @PathParam("operationId") String operationId,
                @HeaderParam("Accept") String accept,
                Context context);
    }

    /**
     * Get notebook operation result.
     *
     * @param operationId Operation ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return notebook operation result along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> getWithResponseAsync(String operationId) {
        final String apiVersion = "2020-12-01";
        final String accept = "application/json";
        return FluxUtil.withContext(
                context -> service.get(this.client.getEndpoint(), apiVersion, operationId, accept, context));
    }

    /**
     * Get notebook operation result.
     *
     * @param operationId Operation ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return notebook operation result along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> getWithResponseAsync(String operationId, Context context) {
        final String apiVersion = "2020-12-01";
        final String accept = "application/json";
        return service.get(this.client.getEndpoint(), apiVersion, operationId, accept, context);
    }

    /**
     * Get notebook operation result.
     *
     * @param operationId Operation ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return notebook operation result on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> getAsync(String operationId) {
        return getWithResponseAsync(operationId).flatMap(ignored -> Mono.empty());
    }

    /**
     * Get notebook operation result.
     *
     * @param operationId Operation ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return notebook operation result on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> getAsync(String operationId, Context context) {
        return getWithResponseAsync(operationId, context).flatMap(ignored -> Mono.empty());
    }

    /**
     * Get notebook operation result.
     *
     * @param operationId Operation ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void get(String operationId) {
        getAsync(operationId).block();
    }

    /**
     * Get notebook operation result.
     *
     * @param operationId Operation ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return notebook operation result along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> getWithResponse(String operationId, Context context) {
        return getWithResponseAsync(operationId, context).block();
    }
}
