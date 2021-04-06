// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;
import com.azure.resourcemanager.apimanagement.fluent.models.ContentItemContractInner;

/** Contains all response data for the get operation. */
public final class ContentItemsGetResponse extends ResponseBase<ContentItemsGetHeaders, ContentItemContractInner> {
    /**
     * Creates an instance of ContentItemsGetResponse.
     *
     * @param request the request which resulted in this ContentItemsGetResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public ContentItemsGetResponse(
        HttpRequest request,
        int statusCode,
        HttpHeaders rawHeaders,
        ContentItemContractInner value,
        ContentItemsGetHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /** @return the deserialized response body. */
    @Override
    public ContentItemContractInner getValue() {
        return super.getValue();
    }
}
