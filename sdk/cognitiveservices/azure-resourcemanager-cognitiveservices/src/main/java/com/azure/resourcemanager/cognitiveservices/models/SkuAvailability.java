// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** SKU availability. */
@Fluent
public final class SkuAvailability {
    /*
     * The Kind of the resource.
     */
    @JsonProperty(value = "kind")
    private String kind;

    /*
     * The Type of the resource.
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * The SKU of Cognitive Services account.
     */
    @JsonProperty(value = "skuName")
    private String skuName;

    /*
     * Indicates the given SKU is available or not.
     */
    @JsonProperty(value = "skuAvailable")
    private Boolean skuAvailable;

    /*
     * Reason why the SKU is not available.
     */
    @JsonProperty(value = "reason")
    private String reason;

    /*
     * Additional error message.
     */
    @JsonProperty(value = "message")
    private String message;

    /** Creates an instance of SkuAvailability class. */
    public SkuAvailability() {
    }

    /**
     * Get the kind property: The Kind of the resource.
     *
     * @return the kind value.
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Set the kind property: The Kind of the resource.
     *
     * @param kind the kind value to set.
     * @return the SkuAvailability object itself.
     */
    public SkuAvailability withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the type property: The Type of the resource.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: The Type of the resource.
     *
     * @param type the type value to set.
     * @return the SkuAvailability object itself.
     */
    public SkuAvailability withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the skuName property: The SKU of Cognitive Services account.
     *
     * @return the skuName value.
     */
    public String skuName() {
        return this.skuName;
    }

    /**
     * Set the skuName property: The SKU of Cognitive Services account.
     *
     * @param skuName the skuName value to set.
     * @return the SkuAvailability object itself.
     */
    public SkuAvailability withSkuName(String skuName) {
        this.skuName = skuName;
        return this;
    }

    /**
     * Get the skuAvailable property: Indicates the given SKU is available or not.
     *
     * @return the skuAvailable value.
     */
    public Boolean skuAvailable() {
        return this.skuAvailable;
    }

    /**
     * Set the skuAvailable property: Indicates the given SKU is available or not.
     *
     * @param skuAvailable the skuAvailable value to set.
     * @return the SkuAvailability object itself.
     */
    public SkuAvailability withSkuAvailable(Boolean skuAvailable) {
        this.skuAvailable = skuAvailable;
        return this;
    }

    /**
     * Get the reason property: Reason why the SKU is not available.
     *
     * @return the reason value.
     */
    public String reason() {
        return this.reason;
    }

    /**
     * Set the reason property: Reason why the SKU is not available.
     *
     * @param reason the reason value to set.
     * @return the SkuAvailability object itself.
     */
    public SkuAvailability withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Get the message property: Additional error message.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: Additional error message.
     *
     * @param message the message value to set.
     * @return the SkuAvailability object itself.
     */
    public SkuAvailability withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
