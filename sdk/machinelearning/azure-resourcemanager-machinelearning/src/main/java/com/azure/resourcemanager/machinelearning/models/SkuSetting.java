// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** SkuSetting fulfills the need for stripped down SKU info in ARM contract. */
@Fluent
public final class SkuSetting {
    /*
     * [Required] The name of the SKU. Ex - P3. It is typically a letter+number code.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * This field is required to be implemented by the Resource Provider if the service has more than one tier, but is
     * not required on a PUT.
     */
    @JsonProperty(value = "tier")
    private SkuTier tier;

    /** Creates an instance of SkuSetting class. */
    public SkuSetting() {
    }

    /**
     * Get the name property: [Required] The name of the SKU. Ex - P3. It is typically a letter+number code.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: [Required] The name of the SKU. Ex - P3. It is typically a letter+number code.
     *
     * @param name the name value to set.
     * @return the SkuSetting object itself.
     */
    public SkuSetting withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the tier property: This field is required to be implemented by the Resource Provider if the service has more
     * than one tier, but is not required on a PUT.
     *
     * @return the tier value.
     */
    public SkuTier tier() {
        return this.tier;
    }

    /**
     * Set the tier property: This field is required to be implemented by the Resource Provider if the service has more
     * than one tier, but is not required on a PUT.
     *
     * @param tier the tier value to set.
     * @return the SkuSetting object itself.
     */
    public SkuSetting withTier(SkuTier tier) {
        this.tier = tier;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property name in model SkuSetting"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SkuSetting.class);
}
