// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** MongoDB database dataset properties. */
@Fluent
public final class MongoDbCollectionDatasetTypeProperties {
    /*
     * The table name of the MongoDB database. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "collectionName", required = true)
    private Object collectionName;

    /** Creates an instance of MongoDbCollectionDatasetTypeProperties class. */
    public MongoDbCollectionDatasetTypeProperties() {
    }

    /**
     * Get the collectionName property: The table name of the MongoDB database. Type: string (or Expression with
     * resultType string).
     *
     * @return the collectionName value.
     */
    public Object collectionName() {
        return this.collectionName;
    }

    /**
     * Set the collectionName property: The table name of the MongoDB database. Type: string (or Expression with
     * resultType string).
     *
     * @param collectionName the collectionName value to set.
     * @return the MongoDbCollectionDatasetTypeProperties object itself.
     */
    public MongoDbCollectionDatasetTypeProperties withCollectionName(Object collectionName) {
        this.collectionName = collectionName;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (collectionName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property collectionName in model MongoDbCollectionDatasetTypeProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(MongoDbCollectionDatasetTypeProperties.class);
}
