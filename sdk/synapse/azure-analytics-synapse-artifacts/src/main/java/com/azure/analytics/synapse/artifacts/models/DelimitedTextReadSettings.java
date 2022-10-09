// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Delimited text read settings. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("DelimitedTextReadSettings")
@Fluent
public final class DelimitedTextReadSettings extends FormatReadSettings {
    /*
     * Indicates the number of non-empty rows to skip when reading data from input files. Type: integer (or Expression
     * with resultType integer).
     */
    @JsonProperty(value = "skipLineCount")
    private Object skipLineCount;

    /*
     * Compression settings.
     */
    @JsonProperty(value = "compressionProperties")
    private CompressionReadSettings compressionProperties;

    /**
     * Get the skipLineCount property: Indicates the number of non-empty rows to skip when reading data from input
     * files. Type: integer (or Expression with resultType integer).
     *
     * @return the skipLineCount value.
     */
    public Object getSkipLineCount() {
        return this.skipLineCount;
    }

    /**
     * Set the skipLineCount property: Indicates the number of non-empty rows to skip when reading data from input
     * files. Type: integer (or Expression with resultType integer).
     *
     * @param skipLineCount the skipLineCount value to set.
     * @return the DelimitedTextReadSettings object itself.
     */
    public DelimitedTextReadSettings setSkipLineCount(Object skipLineCount) {
        this.skipLineCount = skipLineCount;
        return this;
    }

    /**
     * Get the compressionProperties property: Compression settings.
     *
     * @return the compressionProperties value.
     */
    public CompressionReadSettings getCompressionProperties() {
        return this.compressionProperties;
    }

    /**
     * Set the compressionProperties property: Compression settings.
     *
     * @param compressionProperties the compressionProperties value to set.
     * @return the DelimitedTextReadSettings object itself.
     */
    public DelimitedTextReadSettings setCompressionProperties(CompressionReadSettings compressionProperties) {
        this.compressionProperties = compressionProperties;
        return this;
    }
}
