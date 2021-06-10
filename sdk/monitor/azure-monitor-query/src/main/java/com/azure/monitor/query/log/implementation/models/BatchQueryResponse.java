// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.monitor.query.log.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The BatchQueryResponse model. */
@Fluent
public final class BatchQueryResponse {
    /*
     * The id property.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * The status property.
     */
    @JsonProperty(value = "status")
    private Integer status;

    /*
     * Contains the tables, columns & rows resulting from a query.
     */
    @JsonProperty(value = "body")
    private QueryResults body;

    /*
     * Dictionary of <string>
     */
    @JsonProperty(value = "headers")
    private Map<String, String> headers;

    /**
     * Get the id property: The id property.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: The id property.
     *
     * @param id the id value to set.
     * @return the BatchQueryResponse object itself.
     */
    public BatchQueryResponse setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the status property: The status property.
     *
     * @return the status value.
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * Set the status property: The status property.
     *
     * @param status the status value to set.
     * @return the BatchQueryResponse object itself.
     */
    public BatchQueryResponse setStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * Get the body property: Contains the tables, columns &amp; rows resulting from a query.
     *
     * @return the body value.
     */
    public QueryResults getBody() {
        return this.body;
    }

    /**
     * Set the body property: Contains the tables, columns &amp; rows resulting from a query.
     *
     * @param body the body value to set.
     * @return the BatchQueryResponse object itself.
     */
    public BatchQueryResponse setBody(QueryResults body) {
        this.body = body;
        return this;
    }

    /**
     * Get the headers property: Dictionary of &lt;string&gt;.
     *
     * @return the headers value.
     */
    public Map<String, String> getHeaders() {
        return this.headers;
    }

    /**
     * Set the headers property: Dictionary of &lt;string&gt;.
     *
     * @param headers the headers value to set.
     * @return the BatchQueryResponse object itself.
     */
    public BatchQueryResponse setHeaders(Map<String, String> headers) {
        this.headers = headers;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getBody() != null) {
            getBody().validate();
        }
    }
}
