// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.email.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The EmailsSendHeaders model. */
@Fluent
public final class EmailsSendHeaders {
    /*
     * The Retry-After property.
     */
    @JsonProperty(value = "Retry-After")
    private Integer retryAfter;

    /*
     * The Repeatability-Result property.
     */
    @JsonProperty(value = "Repeatability-Result")
    private String repeatabilityResult;

    /*
     * The Operation-Location property.
     */
    @JsonProperty(value = "Operation-Location")
    private String operationLocation;

    /*
     * The x-ms-request-id property.
     */
    @JsonProperty(value = "x-ms-request-id")
    private String xMsRequestId;

    /**
     * Get the retryAfter property: The Retry-After property.
     *
     * @return the retryAfter value.
     */
    public Integer getRetryAfter() {
        return this.retryAfter;
    }

    /**
     * Set the retryAfter property: The Retry-After property.
     *
     * @param retryAfter the retryAfter value to set.
     * @return the EmailsSendHeaders object itself.
     */
    public EmailsSendHeaders setRetryAfter(Integer retryAfter) {
        this.retryAfter = retryAfter;
        return this;
    }

    /**
     * Get the repeatabilityResult property: The Repeatability-Result property.
     *
     * @return the repeatabilityResult value.
     */
    public String getRepeatabilityResult() {
        return this.repeatabilityResult;
    }

    /**
     * Set the repeatabilityResult property: The Repeatability-Result property.
     *
     * @param repeatabilityResult the repeatabilityResult value to set.
     * @return the EmailsSendHeaders object itself.
     */
    public EmailsSendHeaders setRepeatabilityResult(String repeatabilityResult) {
        this.repeatabilityResult = repeatabilityResult;
        return this;
    }

    /**
     * Get the operationLocation property: The Operation-Location property.
     *
     * @return the operationLocation value.
     */
    public String getOperationLocation() {
        return this.operationLocation;
    }

    /**
     * Set the operationLocation property: The Operation-Location property.
     *
     * @param operationLocation the operationLocation value to set.
     * @return the EmailsSendHeaders object itself.
     */
    public EmailsSendHeaders setOperationLocation(String operationLocation) {
        this.operationLocation = operationLocation;
        return this;
    }

    /**
     * Get the xMsRequestId property: The x-ms-request-id property.
     *
     * @return the xMsRequestId value.
     */
    public String getXMsRequestId() {
        return this.xMsRequestId;
    }

    /**
     * Set the xMsRequestId property: The x-ms-request-id property.
     *
     * @param xMsRequestId the xMsRequestId value to set.
     * @return the EmailsSendHeaders object itself.
     */
    public EmailsSendHeaders setXMsRequestId(String xMsRequestId) {
        this.xMsRequestId = xMsRequestId;
        return this;
    }
}
