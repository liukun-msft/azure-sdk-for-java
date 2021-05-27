// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callingserver.implementation;

import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;

/** Initializes a new instance of the AzureCommunicationCallingServerService type. */
public final class AzureCommunicationCallingServerServiceImpl {
    /** The endpoint of the Azure Communication resource. */
    private final String endpoint;

    /**
     * Gets The endpoint of the Azure Communication resource.
     *
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /** Api Version. */
    private final String apiVersion;

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /** The HTTP pipeline to send requests through. */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /** The serializer to serialize an object into a string. */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     *
     * @return the serializerAdapter value.
     */
    public SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /** The CallsImpl object to access its operations. */
    private final CallsImpl calls;

    /**
     * Gets the CallsImpl object to access its operations.
     *
     * @return the CallsImpl object.
     */
    public CallsImpl getCalls() {
        return this.calls;
    }

    /** The ConversationsImpl object to access its operations. */
    private final ConversationsImpl conversations;

    /**
     * Gets the ConversationsImpl object to access its operations.
     *
     * @return the ConversationsImpl object.
     */
    public ConversationsImpl getConversations() {
        return this.conversations;
    }

    /**
     * Initializes an instance of AzureCommunicationCallingServerService client.
     *
     * @param endpoint The endpoint of the Azure Communication resource.
     * @param apiVersion Api Version.
     */
    AzureCommunicationCallingServerServiceImpl(String endpoint, String apiVersion) {
        this(
                new HttpPipelineBuilder()
                        .policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy())
                        .build(),
                JacksonAdapter.createDefaultSerializerAdapter(),
                endpoint,
                apiVersion);
    }

    /**
     * Initializes an instance of AzureCommunicationCallingServerService client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param endpoint The endpoint of the Azure Communication resource.
     * @param apiVersion Api Version.
     */
    AzureCommunicationCallingServerServiceImpl(HttpPipeline httpPipeline, String endpoint, String apiVersion) {
        this(httpPipeline, JacksonAdapter.createDefaultSerializerAdapter(), endpoint, apiVersion);
    }

    /**
     * Initializes an instance of AzureCommunicationCallingServerService client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param endpoint The endpoint of the Azure Communication resource.
     * @param apiVersion Api Version.
     */
    AzureCommunicationCallingServerServiceImpl(
            HttpPipeline httpPipeline, SerializerAdapter serializerAdapter, String endpoint, String apiVersion) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.endpoint = endpoint;
        this.apiVersion = apiVersion;
        this.calls = new CallsImpl(this);
        this.conversations = new ConversationsImpl(this);
    }
}
