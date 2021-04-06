// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes scaling information of a SKU. */
@Immutable
public final class ApiManagementSkuCapacity {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ApiManagementSkuCapacity.class);

    /*
     * The minimum capacity.
     */
    @JsonProperty(value = "minimum", access = JsonProperty.Access.WRITE_ONLY)
    private Integer minimum;

    /*
     * The maximum capacity that can be set.
     */
    @JsonProperty(value = "maximum", access = JsonProperty.Access.WRITE_ONLY)
    private Integer maximum;

    /*
     * The default capacity.
     */
    @JsonProperty(value = "default", access = JsonProperty.Access.WRITE_ONLY)
    private Integer defaultProperty;

    /*
     * The scale type applicable to the sku.
     */
    @JsonProperty(value = "scaleType", access = JsonProperty.Access.WRITE_ONLY)
    private ApiManagementSkuCapacityScaleType scaleType;

    /**
     * Get the minimum property: The minimum capacity.
     *
     * @return the minimum value.
     */
    public Integer minimum() {
        return this.minimum;
    }

    /**
     * Get the maximum property: The maximum capacity that can be set.
     *
     * @return the maximum value.
     */
    public Integer maximum() {
        return this.maximum;
    }

    /**
     * Get the defaultProperty property: The default capacity.
     *
     * @return the defaultProperty value.
     */
    public Integer defaultProperty() {
        return this.defaultProperty;
    }

    /**
     * Get the scaleType property: The scale type applicable to the sku.
     *
     * @return the scaleType value.
     */
    public ApiManagementSkuCapacityScaleType scaleType() {
        return this.scaleType;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
