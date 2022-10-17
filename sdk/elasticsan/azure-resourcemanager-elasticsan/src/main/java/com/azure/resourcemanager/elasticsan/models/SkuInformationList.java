// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.elasticsan.fluent.models.SkuInformationInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of SKU Information objects. */
@Immutable
public final class SkuInformationList {
    /*
     * List of ResourceType Sku
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<SkuInformationInner> value;

    /** Creates an instance of SkuInformationList class. */
    public SkuInformationList() {
    }

    /**
     * Get the value property: List of ResourceType Sku.
     *
     * @return the value value.
     */
    public List<SkuInformationInner> value() {
        return this.value;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
