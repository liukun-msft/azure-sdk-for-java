// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes the uri of a disk. */
@Fluent
public final class VirtualHardDisk {
    /*
     * Specifies the virtual hard disk's uri.
     */
    @JsonProperty(value = "uri")
    private String uri;

    /** Creates an instance of VirtualHardDisk class. */
    public VirtualHardDisk() {
    }

    /**
     * Get the uri property: Specifies the virtual hard disk's uri.
     *
     * @return the uri value.
     */
    public String uri() {
        return this.uri;
    }

    /**
     * Set the uri property: Specifies the virtual hard disk's uri.
     *
     * @param uri the uri value to set.
     * @return the VirtualHardDisk object itself.
     */
    public VirtualHardDisk withUri(String uri) {
        this.uri = uri;
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
