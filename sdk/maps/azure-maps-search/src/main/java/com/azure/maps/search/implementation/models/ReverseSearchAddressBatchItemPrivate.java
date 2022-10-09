// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.search.implementation.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** An item returned from Search Address Reverse Batch service call. */
@Immutable
public final class ReverseSearchAddressBatchItemPrivate extends BatchResultItem {
    /*
     * The result of the query. SearchAddressReverseResponse if the query
     * completed successfully, ErrorResponse otherwise.
     */
    @JsonProperty(value = "response", access = JsonProperty.Access.WRITE_ONLY)
    private ReverseSearchAddressBatchItemPrivateResponse response;

    /**
     * Get the response property: The result of the query. SearchAddressReverseResponse if the query completed
     * successfully, ErrorResponse otherwise.
     *
     * @return the response value.
     */
    public ReverseSearchAddressBatchItemPrivateResponse getResponse() {
        return this.response;
    }
}
