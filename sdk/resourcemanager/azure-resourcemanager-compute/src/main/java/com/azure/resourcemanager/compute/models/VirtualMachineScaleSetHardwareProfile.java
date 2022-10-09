// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Specifies the hardware settings for the virtual machine scale set. */
@Fluent
public final class VirtualMachineScaleSetHardwareProfile {
    /*
     * Specifies the properties for customizing the size of the virtual machine. Minimum api-version: 2021-11-01.
     * <br><br> Please follow the instructions in [VM Customization](https://aka.ms/vmcustomization) for more details.
     */
    @JsonProperty(value = "vmSizeProperties")
    private VMSizeProperties vmSizeProperties;

    /**
     * Get the vmSizeProperties property: Specifies the properties for customizing the size of the virtual machine.
     * Minimum api-version: 2021-11-01. &lt;br&gt;&lt;br&gt; Please follow the instructions in [VM
     * Customization](https://aka.ms/vmcustomization) for more details.
     *
     * @return the vmSizeProperties value.
     */
    public VMSizeProperties vmSizeProperties() {
        return this.vmSizeProperties;
    }

    /**
     * Set the vmSizeProperties property: Specifies the properties for customizing the size of the virtual machine.
     * Minimum api-version: 2021-11-01. &lt;br&gt;&lt;br&gt; Please follow the instructions in [VM
     * Customization](https://aka.ms/vmcustomization) for more details.
     *
     * @param vmSizeProperties the vmSizeProperties value to set.
     * @return the VirtualMachineScaleSetHardwareProfile object itself.
     */
    public VirtualMachineScaleSetHardwareProfile withVmSizeProperties(VMSizeProperties vmSizeProperties) {
        this.vmSizeProperties = vmSizeProperties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (vmSizeProperties() != null) {
            vmSizeProperties().validate();
        }
    }
}
