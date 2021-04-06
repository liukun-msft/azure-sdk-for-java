// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.datalake.implementation.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/** Contains all response data for the lease operation. */
public final class PathsLeaseResponse extends ResponseBase<PathsLeaseHeaders, Void> {
    /**
     * Creates an instance of PathsLeaseResponse.
     *
     * @param request the request which resulted in this PathsLeaseResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public PathsLeaseResponse(
            HttpRequest request, int statusCode, HttpHeaders rawHeaders, Void value, PathsLeaseHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }
}
