// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.iot.deviceupdate;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.core.util.polling.PollerFlux;
import com.azure.iot.deviceupdate.implementation.DeviceUpdatesImpl;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous DeviceUpdateClient type. */
@ServiceClient(builder = DeviceUpdateClientBuilder.class, isAsync = true)
public final class DeviceUpdateAsyncClient {
    @Generated private final DeviceUpdatesImpl serviceClient;

    /**
     * Initializes an instance of DeviceUpdates client.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    DeviceUpdateAsyncClient(DeviceUpdatesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Import new update version.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>action</td><td>String</td><td>Yes</td><td>Import update action.</td></tr>
     *     <tr><td>api-version</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * [
     *     {
     *         importManifest: {
     *             url: String
     *             sizeInBytes: long
     *             hashes: {
     *                 String: String
     *             }
     *         }
     *         friendlyName: String
     *         files: [
     *             {
     *                 filename: String
     *                 url: String
     *             }
     *         ]
     *     }
     * ]
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     updateId: {
     *         provider: String
     *         name: String
     *         version: String
     *     }
     *     description: String
     *     friendlyName: String
     *     isDeployable: Boolean
     *     updateType: String
     *     installedCriteria: String
     *     compatibility: [
     *         {
     *             String: String
     *         }
     *     ]
     *     instructions: {
     *         steps: [
     *             {
     *                 type: String(Inline/Reference)
     *                 description: String
     *                 handler: String
     *                 handlerProperties: Object
     *                 files: [
     *                     String
     *                 ]
     *                 updateId: (recursive schema, see updateId above)
     *             }
     *         ]
     *     }
     *     referencedBy: [
     *         (recursive schema, see above)
     *     ]
     *     scanResult: String
     *     manifestVersion: String
     *     importedDateTime: String
     *     createdDateTime: String
     *     etag: String
     * }
     * }</pre>
     *
     * @param updateToImport The update to be imported.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return update metadata along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> importUpdateWithResponse(
            BinaryData updateToImport, RequestOptions requestOptions) {
        return this.serviceClient.importUpdateWithResponseAsync(updateToImport, requestOptions);
    }

    /**
     * Import new update version.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>action</td><td>String</td><td>Yes</td><td>Import update action.</td></tr>
     *     <tr><td>api-version</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * [
     *     {
     *         importManifest: {
     *             url: String
     *             sizeInBytes: long
     *             hashes: {
     *                 String: String
     *             }
     *         }
     *         friendlyName: String
     *         files: [
     *             {
     *                 filename: String
     *                 url: String
     *             }
     *         ]
     *     }
     * ]
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     updateId: {
     *         provider: String
     *         name: String
     *         version: String
     *     }
     *     description: String
     *     friendlyName: String
     *     isDeployable: Boolean
     *     updateType: String
     *     installedCriteria: String
     *     compatibility: [
     *         {
     *             String: String
     *         }
     *     ]
     *     instructions: {
     *         steps: [
     *             {
     *                 type: String(Inline/Reference)
     *                 description: String
     *                 handler: String
     *                 handlerProperties: Object
     *                 files: [
     *                     String
     *                 ]
     *                 updateId: (recursive schema, see updateId above)
     *             }
     *         ]
     *     }
     *     referencedBy: [
     *         (recursive schema, see above)
     *     ]
     *     scanResult: String
     *     manifestVersion: String
     *     importedDateTime: String
     *     createdDateTime: String
     *     etag: String
     * }
     * }</pre>
     *
     * @param updateToImport The update to be imported.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link PollerFlux} for polling of update metadata.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<BinaryData, BinaryData> beginImportUpdate(
            BinaryData updateToImport, RequestOptions requestOptions) {
        return this.serviceClient.beginImportUpdateAsync(updateToImport, requestOptions);
    }

    /**
     * Get a list of all updates that have been imported to Device Update for IoT Hub.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>api-version</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     *     <tr><td>$search</td><td>String</td><td>No</td><td>Request updates matching a free-text search expression.</td></tr>
     *     <tr><td>$filter</td><td>String</td><td>No</td><td>Filter updates by its properties.</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     value: [
     *         {
     *             updateId: {
     *                 provider: String
     *                 name: String
     *                 version: String
     *             }
     *             description: String
     *             friendlyName: String
     *             isDeployable: Boolean
     *             updateType: String
     *             installedCriteria: String
     *             compatibility: [
     *                 {
     *                     String: String
     *                 }
     *             ]
     *             instructions: {
     *                 steps: [
     *                     {
     *                         type: String(Inline/Reference)
     *                         description: String
     *                         handler: String
     *                         handlerProperties: Object
     *                         files: [
     *                             String
     *                         ]
     *                         updateId: (recursive schema, see updateId above)
     *                     }
     *                 ]
     *             }
     *             referencedBy: [
     *                 (recursive schema, see above)
     *             ]
     *             scanResult: String
     *             manifestVersion: String
     *             importedDateTime: String
     *             createdDateTime: String
     *             etag: String
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return a list of all updates that have been imported to Device Update for IoT Hub as paginated response with
     *     {@link PagedFlux}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> listUpdates(RequestOptions requestOptions) {
        return this.serviceClient.listUpdatesAsync(requestOptions);
    }

    /**
     * Get a specific update version.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>api-version</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>If-None-Match</td><td>String</td><td>No</td><td>Defines the If-None-Match condition. The operation will be performed only if the ETag on the server does not match this value.</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     updateId: {
     *         provider: String
     *         name: String
     *         version: String
     *     }
     *     description: String
     *     friendlyName: String
     *     isDeployable: Boolean
     *     updateType: String
     *     installedCriteria: String
     *     compatibility: [
     *         {
     *             String: String
     *         }
     *     ]
     *     instructions: {
     *         steps: [
     *             {
     *                 type: String(Inline/Reference)
     *                 description: String
     *                 handler: String
     *                 handlerProperties: Object
     *                 files: [
     *                     String
     *                 ]
     *                 updateId: (recursive schema, see updateId above)
     *             }
     *         ]
     *     }
     *     referencedBy: [
     *         (recursive schema, see above)
     *     ]
     *     scanResult: String
     *     manifestVersion: String
     *     importedDateTime: String
     *     createdDateTime: String
     *     etag: String
     * }
     * }</pre>
     *
     * @param provider Update provider.
     * @param name Update name.
     * @param version Update version.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return a specific update version along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getUpdateWithResponse(
            String provider, String name, String version, RequestOptions requestOptions) {
        return this.serviceClient.getUpdateWithResponseAsync(provider, name, version, requestOptions);
    }

    /**
     * Delete a specific update version.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>api-version</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * @param provider Update provider.
     * @param name Update name.
     * @param version Update version.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteUpdateWithResponse(
            String provider, String name, String version, RequestOptions requestOptions) {
        return this.serviceClient.deleteUpdateWithResponseAsync(provider, name, version, requestOptions);
    }

    /**
     * Delete a specific update version.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>api-version</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * @param provider Update provider.
     * @param name Update name.
     * @param version Update version.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<BinaryData, BinaryData> beginDeleteUpdate(
            String provider, String name, String version, RequestOptions requestOptions) {
        return this.serviceClient.beginDeleteUpdateAsync(provider, name, version, requestOptions);
    }

    /**
     * Get a list of all update providers that have been imported to Device Update for IoT Hub.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>api-version</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     value: [
     *         String
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return a list of all update providers that have been imported to Device Update for IoT Hub as paginated response
     *     with {@link PagedFlux}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> listProviders(RequestOptions requestOptions) {
        return this.serviceClient.listProvidersAsync(requestOptions);
    }

    /**
     * Get a list of all update names that match the specified provider.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>api-version</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     value: [
     *         String
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param provider Update provider.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return a list of all update names that match the specified provider as paginated response with {@link
     *     PagedFlux}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> listNames(String provider, RequestOptions requestOptions) {
        return this.serviceClient.listNamesAsync(provider, requestOptions);
    }

    /**
     * Get a list of all update versions that match the specified provider and name.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>api-version</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     *     <tr><td>$filter</td><td>String</td><td>No</td><td>Filter updates by its properties.</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     value: [
     *         String
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param provider Update provider.
     * @param name Update name.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return a list of all update versions that match the specified provider and name as paginated response with
     *     {@link PagedFlux}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> listVersions(String provider, String name, RequestOptions requestOptions) {
        return this.serviceClient.listVersionsAsync(provider, name, requestOptions);
    }

    /**
     * Get a list of all update file identifiers for the specified version.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>api-version</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     value: [
     *         String
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param provider Update provider.
     * @param name Update name.
     * @param version Update version.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return a list of all update file identifiers for the specified version as paginated response with {@link
     *     PagedFlux}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> listFiles(
            String provider, String name, String version, RequestOptions requestOptions) {
        return this.serviceClient.listFilesAsync(provider, name, version, requestOptions);
    }

    /**
     * Get a specific update file from the version.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>api-version</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>If-None-Match</td><td>String</td><td>No</td><td>Defines the If-None-Match condition. The operation will be performed only if the ETag on the server does not match this value.</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     fileId: String
     *     fileName: String
     *     sizeInBytes: long
     *     hashes: {
     *         String: String
     *     }
     *     mimeType: String
     *     scanResult: String
     *     scanDetails: String
     *     etag: String
     * }
     * }</pre>
     *
     * @param provider Update provider.
     * @param name Update name.
     * @param version Update version.
     * @param fileId File identifier.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return a specific update file from the version along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getFileWithResponse(
            String provider, String name, String version, String fileId, RequestOptions requestOptions) {
        return this.serviceClient.getFileWithResponseAsync(provider, name, version, fileId, requestOptions);
    }

    /**
     * Get a list of all import update operations. Completed operations are kept for 7 days before auto-deleted. Delete
     * operations are not returned by this API version.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>$filter</td><td>String</td><td>No</td><td>Restricts the set of operations returned. Only one specific filter is supported: "status eq 'NotStarted' or status eq 'Running'"</td></tr>
     *     <tr><td>$top</td><td>String</td><td>No</td><td>Specifies a non-negative integer n that limits the number of items returned from a collection. The service returns the number of available items up to but not greater than the specified value n.</td></tr>
     *     <tr><td>api-version</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     value: [
     *         {
     *             operationId: String
     *             status: String(Undefined/NotStarted/Running/Succeeded/Failed)
     *             updateId: {
     *                 provider: String
     *                 name: String
     *                 version: String
     *             }
     *             resourceLocation: String
     *             error: {
     *                 code: String
     *                 message: String
     *                 target: String
     *                 details: [
     *                     (recursive schema, see above)
     *                 ]
     *                 innererror: {
     *                     code: String
     *                     message: String
     *                     errorDetail: String
     *                     innerError: (recursive schema, see innerError above)
     *                 }
     *                 occurredDateTime: String
     *             }
     *             traceId: String
     *             lastActionDateTime: String
     *             createdDateTime: String
     *             etag: String
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return a list of all import update operations as paginated response with {@link PagedFlux}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> listOperations(RequestOptions requestOptions) {
        return this.serviceClient.listOperationsAsync(requestOptions);
    }

    /**
     * Retrieve operation status.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>api-version</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>If-None-Match</td><td>String</td><td>No</td><td>Defines the If-None-Match condition. The operation will be performed only if the ETag on the server does not match this value.</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     operationId: String
     *     status: String(Undefined/NotStarted/Running/Succeeded/Failed)
     *     updateId: {
     *         provider: String
     *         name: String
     *         version: String
     *     }
     *     resourceLocation: String
     *     error: {
     *         code: String
     *         message: String
     *         target: String
     *         details: [
     *             (recursive schema, see above)
     *         ]
     *         innererror: {
     *             code: String
     *             message: String
     *             errorDetail: String
     *             innerError: (recursive schema, see innerError above)
     *         }
     *         occurredDateTime: String
     *     }
     *     traceId: String
     *     lastActionDateTime: String
     *     createdDateTime: String
     *     etag: String
     * }
     * }</pre>
     *
     * @param operationId Operation identifier.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return operation metadata along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getOperationWithResponse(String operationId, RequestOptions requestOptions) {
        return this.serviceClient.getOperationWithResponseAsync(operationId, requestOptions);
    }
}
