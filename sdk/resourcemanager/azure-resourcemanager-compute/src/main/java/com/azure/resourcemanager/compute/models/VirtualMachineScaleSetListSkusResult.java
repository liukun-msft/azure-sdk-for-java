// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.fluent.models.VirtualMachineScaleSetSkuInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The Virtual Machine Scale Set List Skus operation response. */
@Fluent
public final class VirtualMachineScaleSetListSkusResult {
    /*
     * The list of skus available for the virtual machine scale set.
     */
    @JsonProperty(value = "value", required = true)
    private List<VirtualMachineScaleSetSkuInner> value;

    /*
     * The uri to fetch the next page of Virtual Machine Scale Set Skus. Call ListNext() with this to fetch the next
     * page of VMSS Skus.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of VirtualMachineScaleSetListSkusResult class. */
    public VirtualMachineScaleSetListSkusResult() {
    }

    /**
     * Get the value property: The list of skus available for the virtual machine scale set.
     *
     * @return the value value.
     */
    public List<VirtualMachineScaleSetSkuInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of skus available for the virtual machine scale set.
     *
     * @param value the value value to set.
     * @return the VirtualMachineScaleSetListSkusResult object itself.
     */
    public VirtualMachineScaleSetListSkusResult withValue(List<VirtualMachineScaleSetSkuInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The uri to fetch the next page of Virtual Machine Scale Set Skus. Call ListNext() with
     * this to fetch the next page of VMSS Skus.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The uri to fetch the next page of Virtual Machine Scale Set Skus. Call ListNext() with
     * this to fetch the next page of VMSS Skus.
     *
     * @param nextLink the nextLink value to set.
     * @return the VirtualMachineScaleSetListSkusResult object itself.
     */
    public VirtualMachineScaleSetListSkusResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property value in model VirtualMachineScaleSetListSkusResult"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(VirtualMachineScaleSetListSkusResult.class);
}
