// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.implementation.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/** Contains all response data for the commitBlockList operation. */
public final class BlockBlobsCommitBlockListResponse extends ResponseBase<BlockBlobsCommitBlockListHeaders, Void> {
    /**
     * Creates an instance of BlockBlobsCommitBlockListResponse.
     *
     * @param request the request which resulted in this BlockBlobsCommitBlockListResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public BlockBlobsCommitBlockListResponse(
            HttpRequest request,
            int statusCode,
            HttpHeaders rawHeaders,
            Void value,
            BlockBlobsCommitBlockListHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }
}
