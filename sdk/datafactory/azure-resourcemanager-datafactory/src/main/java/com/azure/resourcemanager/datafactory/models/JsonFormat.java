// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The data stored in JSON format. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("JsonFormat")
@Fluent
public final class JsonFormat extends DatasetStorageFormat {
    /*
     * File pattern of JSON. To be more specific, the way of separating a collection of JSON objects. The default value
     * is 'setOfObjects'. It is case-sensitive.
     */
    @JsonProperty(value = "filePattern")
    private Object filePattern;

    /*
     * The character used to separate nesting levels. Default value is '.' (dot). Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "nestingSeparator")
    private Object nestingSeparator;

    /*
     * The code page name of the preferred encoding. If not provided, the default value is 'utf-8', unless the byte
     * order mark (BOM) denotes another Unicode encoding. The full list of supported values can be found in the 'Name'
     * column of the table of encodings in the following reference: https://go.microsoft.com/fwlink/?linkid=861078.
     * Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "encodingName")
    private Object encodingName;

    /*
     * The JSONPath of the JSON array element to be flattened. Example: "$.ArrayPath". Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "jsonNodeReference")
    private Object jsonNodeReference;

    /*
     * The JSONPath definition for each column mapping with a customized column name to extract data from JSON file.
     * For fields under root object, start with "$"; for fields inside the array chosen by jsonNodeReference property,
     * start from the array element. Example: {"Column1": "$.Column1Path", "Column2": "Column2PathInArray"}. Type:
     * object (or Expression with resultType object).
     */
    @JsonProperty(value = "jsonPathDefinition")
    private Object jsonPathDefinition;

    /**
     * Get the filePattern property: File pattern of JSON. To be more specific, the way of separating a collection of
     * JSON objects. The default value is 'setOfObjects'. It is case-sensitive.
     *
     * @return the filePattern value.
     */
    public Object filePattern() {
        return this.filePattern;
    }

    /**
     * Set the filePattern property: File pattern of JSON. To be more specific, the way of separating a collection of
     * JSON objects. The default value is 'setOfObjects'. It is case-sensitive.
     *
     * @param filePattern the filePattern value to set.
     * @return the JsonFormat object itself.
     */
    public JsonFormat withFilePattern(Object filePattern) {
        this.filePattern = filePattern;
        return this;
    }

    /**
     * Get the nestingSeparator property: The character used to separate nesting levels. Default value is '.' (dot).
     * Type: string (or Expression with resultType string).
     *
     * @return the nestingSeparator value.
     */
    public Object nestingSeparator() {
        return this.nestingSeparator;
    }

    /**
     * Set the nestingSeparator property: The character used to separate nesting levels. Default value is '.' (dot).
     * Type: string (or Expression with resultType string).
     *
     * @param nestingSeparator the nestingSeparator value to set.
     * @return the JsonFormat object itself.
     */
    public JsonFormat withNestingSeparator(Object nestingSeparator) {
        this.nestingSeparator = nestingSeparator;
        return this;
    }

    /**
     * Get the encodingName property: The code page name of the preferred encoding. If not provided, the default value
     * is 'utf-8', unless the byte order mark (BOM) denotes another Unicode encoding. The full list of supported values
     * can be found in the 'Name' column of the table of encodings in the following reference:
     * https://go.microsoft.com/fwlink/?linkid=861078. Type: string (or Expression with resultType string).
     *
     * @return the encodingName value.
     */
    public Object encodingName() {
        return this.encodingName;
    }

    /**
     * Set the encodingName property: The code page name of the preferred encoding. If not provided, the default value
     * is 'utf-8', unless the byte order mark (BOM) denotes another Unicode encoding. The full list of supported values
     * can be found in the 'Name' column of the table of encodings in the following reference:
     * https://go.microsoft.com/fwlink/?linkid=861078. Type: string (or Expression with resultType string).
     *
     * @param encodingName the encodingName value to set.
     * @return the JsonFormat object itself.
     */
    public JsonFormat withEncodingName(Object encodingName) {
        this.encodingName = encodingName;
        return this;
    }

    /**
     * Get the jsonNodeReference property: The JSONPath of the JSON array element to be flattened. Example:
     * "$.ArrayPath". Type: string (or Expression with resultType string).
     *
     * @return the jsonNodeReference value.
     */
    public Object jsonNodeReference() {
        return this.jsonNodeReference;
    }

    /**
     * Set the jsonNodeReference property: The JSONPath of the JSON array element to be flattened. Example:
     * "$.ArrayPath". Type: string (or Expression with resultType string).
     *
     * @param jsonNodeReference the jsonNodeReference value to set.
     * @return the JsonFormat object itself.
     */
    public JsonFormat withJsonNodeReference(Object jsonNodeReference) {
        this.jsonNodeReference = jsonNodeReference;
        return this;
    }

    /**
     * Get the jsonPathDefinition property: The JSONPath definition for each column mapping with a customized column
     * name to extract data from JSON file. For fields under root object, start with "$"; for fields inside the array
     * chosen by jsonNodeReference property, start from the array element. Example: {"Column1": "$.Column1Path",
     * "Column2": "Column2PathInArray"}. Type: object (or Expression with resultType object).
     *
     * @return the jsonPathDefinition value.
     */
    public Object jsonPathDefinition() {
        return this.jsonPathDefinition;
    }

    /**
     * Set the jsonPathDefinition property: The JSONPath definition for each column mapping with a customized column
     * name to extract data from JSON file. For fields under root object, start with "$"; for fields inside the array
     * chosen by jsonNodeReference property, start from the array element. Example: {"Column1": "$.Column1Path",
     * "Column2": "Column2PathInArray"}. Type: object (or Expression with resultType object).
     *
     * @param jsonPathDefinition the jsonPathDefinition value to set.
     * @return the JsonFormat object itself.
     */
    public JsonFormat withJsonPathDefinition(Object jsonPathDefinition) {
        this.jsonPathDefinition = jsonPathDefinition;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public JsonFormat withSerializer(Object serializer) {
        super.withSerializer(serializer);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public JsonFormat withDeserializer(Object deserializer) {
        super.withDeserializer(deserializer);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
