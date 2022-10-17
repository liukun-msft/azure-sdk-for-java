// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Package store for the SSIS integration runtime. */
@Fluent
public final class PackageStore {
    /*
     * The name of the package store
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The package store linked service reference.
     */
    @JsonProperty(value = "packageStoreLinkedService", required = true)
    private EntityReference packageStoreLinkedService;

    /** Creates an instance of PackageStore class. */
    public PackageStore() {
    }

    /**
     * Get the name property: The name of the package store.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the package store.
     *
     * @param name the name value to set.
     * @return the PackageStore object itself.
     */
    public PackageStore withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the packageStoreLinkedService property: The package store linked service reference.
     *
     * @return the packageStoreLinkedService value.
     */
    public EntityReference packageStoreLinkedService() {
        return this.packageStoreLinkedService;
    }

    /**
     * Set the packageStoreLinkedService property: The package store linked service reference.
     *
     * @param packageStoreLinkedService the packageStoreLinkedService value to set.
     * @return the PackageStore object itself.
     */
    public PackageStore withPackageStoreLinkedService(EntityReference packageStoreLinkedService) {
        this.packageStoreLinkedService = packageStoreLinkedService;
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
                    new IllegalArgumentException("Missing required property name in model PackageStore"));
        }
        if (packageStoreLinkedService() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property packageStoreLinkedService in model PackageStore"));
        } else {
            packageStoreLinkedService().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(PackageStore.class);
}
