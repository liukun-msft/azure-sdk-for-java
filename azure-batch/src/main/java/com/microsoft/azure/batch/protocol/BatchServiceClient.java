/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.batch.protocol;

import com.microsoft.azure.AzureClient;
import com.microsoft.rest.AutoRestBaseUrl;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.serializer.JacksonMapperAdapter;
import java.util.List;
import okhttp3.Interceptor;
import okhttp3.logging.HttpLoggingInterceptor.Level;

/**
 * The interface for BatchServiceClient class.
 */
public interface BatchServiceClient {
    /**
     * Gets the URL used as the base for all cloud service requests.
     *
     * @return the BaseUrl object.
     */
    AutoRestBaseUrl getBaseUrl();

    /**
     * Gets the list of interceptors the OkHttp client will execute.
     * @return the list of interceptors.
     */
    List<Interceptor> getClientInterceptors();

    /**
     * Sets the logging level for OkHttp client.
     *
     * @param logLevel the logging level enum.
     */
    void setLogLevel(Level logLevel);

    /**
     * Gets the adapter for {@link com.fasterxml.jackson.databind.ObjectMapper} for serialization
     * and deserialization operations..
     *
     * @return the adapter.
     */
    JacksonMapperAdapter getMapperAdapter();

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    AzureClient getAzureClient();

    /**
     * Gets Gets Azure subscription credentials..
     *
     * @return the credentials value.
     */
    ServiceClientCredentials getCredentials();

    /**
     * Gets Client API Version..
     *
     * @return the apiVersion value.
     */
    String getApiVersion();

    /**
     * Gets Gets or sets the preferred language for the response..
     *
     * @return the acceptLanguage value.
     */
    String getAcceptLanguage();

    /**
     * Sets Gets or sets the preferred language for the response..
     *
     * @param acceptLanguage the acceptLanguage value.
     */
    void setAcceptLanguage(String acceptLanguage);

    /**
     * Gets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30..
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    int getLongRunningOperationRetryTimeout();

    /**
     * Sets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30..
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     */
    void setLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout);

    /**
     * Gets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true..
     *
     * @return the generateClientRequestId value.
     */
    boolean getGenerateClientRequestId();

    /**
     * Sets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true..
     *
     * @param generateClientRequestId the generateClientRequestId value.
     */
    void setGenerateClientRequestId(boolean generateClientRequestId);

    /**
     * Gets the ApplicationOperations object to access its operations.
     * @return the ApplicationOperations object.
     */
    ApplicationOperations getApplicationOperations();

    /**
     * Gets the PoolOperations object to access its operations.
     * @return the PoolOperations object.
     */
    PoolOperations getPoolOperations();

    /**
     * Gets the AccountOperations object to access its operations.
     * @return the AccountOperations object.
     */
    AccountOperations getAccountOperations();

    /**
     * Gets the JobOperations object to access its operations.
     * @return the JobOperations object.
     */
    JobOperations getJobOperations();

    /**
     * Gets the CertificateOperations object to access its operations.
     * @return the CertificateOperations object.
     */
    CertificateOperations getCertificateOperations();

    /**
     * Gets the FileOperations object to access its operations.
     * @return the FileOperations object.
     */
    FileOperations getFileOperations();

    /**
     * Gets the JobScheduleOperations object to access its operations.
     * @return the JobScheduleOperations object.
     */
    JobScheduleOperations getJobScheduleOperations();

    /**
     * Gets the TaskOperations object to access its operations.
     * @return the TaskOperations object.
     */
    TaskOperations getTaskOperations();

    /**
     * Gets the ComputeNodeOperations object to access its operations.
     * @return the ComputeNodeOperations object.
     */
    ComputeNodeOperations getComputeNodeOperations();

}
