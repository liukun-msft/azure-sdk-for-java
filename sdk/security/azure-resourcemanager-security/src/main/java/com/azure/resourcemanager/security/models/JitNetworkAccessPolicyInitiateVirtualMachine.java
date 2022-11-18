// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The JitNetworkAccessPolicyInitiateVirtualMachine model. */
@Fluent
public final class JitNetworkAccessPolicyInitiateVirtualMachine {
    /*
     * Resource ID of the virtual machine that is linked to this policy
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /*
     * The ports to open for the resource with the `id`
     */
    @JsonProperty(value = "ports", required = true)
    private List<JitNetworkAccessPolicyInitiatePort> ports;

    /** Creates an instance of JitNetworkAccessPolicyInitiateVirtualMachine class. */
    public JitNetworkAccessPolicyInitiateVirtualMachine() {
    }

    /**
     * Get the id property: Resource ID of the virtual machine that is linked to this policy.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID of the virtual machine that is linked to this policy.
     *
     * @param id the id value to set.
     * @return the JitNetworkAccessPolicyInitiateVirtualMachine object itself.
     */
    public JitNetworkAccessPolicyInitiateVirtualMachine withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the ports property: The ports to open for the resource with the `id`.
     *
     * @return the ports value.
     */
    public List<JitNetworkAccessPolicyInitiatePort> ports() {
        return this.ports;
    }

    /**
     * Set the ports property: The ports to open for the resource with the `id`.
     *
     * @param ports the ports value to set.
     * @return the JitNetworkAccessPolicyInitiateVirtualMachine object itself.
     */
    public JitNetworkAccessPolicyInitiateVirtualMachine withPorts(List<JitNetworkAccessPolicyInitiatePort> ports) {
        this.ports = ports;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (id() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property id in model JitNetworkAccessPolicyInitiateVirtualMachine"));
        }
        if (ports() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property ports in model JitNetworkAccessPolicyInitiateVirtualMachine"));
        } else {
            ports().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(JitNetworkAccessPolicyInitiateVirtualMachine.class);
}
