// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** workbookFilterCriteria. */
@Fluent
public final class MicrosoftGraphWorkbookFilterCriteria {
    /*
     * The color property.
     */
    @JsonProperty(value = "color")
    private String color;

    /*
     * The criterion1 property.
     */
    @JsonProperty(value = "criterion1")
    private String criterion1;

    /*
     * The criterion2 property.
     */
    @JsonProperty(value = "criterion2")
    private String criterion2;

    /*
     * The dynamicCriteria property.
     */
    @JsonProperty(value = "dynamicCriteria")
    private String dynamicCriteria;

    /*
     * The filterOn property.
     */
    @JsonProperty(value = "filterOn")
    private String filterOn;

    /*
     * workbookIcon
     */
    @JsonProperty(value = "icon")
    private MicrosoftGraphWorkbookIcon icon;

    /*
     * The operator property.
     */
    @JsonProperty(value = "operator")
    private String operator;

    /*
     * Json
     */
    @JsonProperty(value = "values")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, Object> values;

    /*
     * workbookFilterCriteria
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /** Creates an instance of MicrosoftGraphWorkbookFilterCriteria class. */
    public MicrosoftGraphWorkbookFilterCriteria() {
    }

    /**
     * Get the color property: The color property.
     *
     * @return the color value.
     */
    public String color() {
        return this.color;
    }

    /**
     * Set the color property: The color property.
     *
     * @param color the color value to set.
     * @return the MicrosoftGraphWorkbookFilterCriteria object itself.
     */
    public MicrosoftGraphWorkbookFilterCriteria withColor(String color) {
        this.color = color;
        return this;
    }

    /**
     * Get the criterion1 property: The criterion1 property.
     *
     * @return the criterion1 value.
     */
    public String criterion1() {
        return this.criterion1;
    }

    /**
     * Set the criterion1 property: The criterion1 property.
     *
     * @param criterion1 the criterion1 value to set.
     * @return the MicrosoftGraphWorkbookFilterCriteria object itself.
     */
    public MicrosoftGraphWorkbookFilterCriteria withCriterion1(String criterion1) {
        this.criterion1 = criterion1;
        return this;
    }

    /**
     * Get the criterion2 property: The criterion2 property.
     *
     * @return the criterion2 value.
     */
    public String criterion2() {
        return this.criterion2;
    }

    /**
     * Set the criterion2 property: The criterion2 property.
     *
     * @param criterion2 the criterion2 value to set.
     * @return the MicrosoftGraphWorkbookFilterCriteria object itself.
     */
    public MicrosoftGraphWorkbookFilterCriteria withCriterion2(String criterion2) {
        this.criterion2 = criterion2;
        return this;
    }

    /**
     * Get the dynamicCriteria property: The dynamicCriteria property.
     *
     * @return the dynamicCriteria value.
     */
    public String dynamicCriteria() {
        return this.dynamicCriteria;
    }

    /**
     * Set the dynamicCriteria property: The dynamicCriteria property.
     *
     * @param dynamicCriteria the dynamicCriteria value to set.
     * @return the MicrosoftGraphWorkbookFilterCriteria object itself.
     */
    public MicrosoftGraphWorkbookFilterCriteria withDynamicCriteria(String dynamicCriteria) {
        this.dynamicCriteria = dynamicCriteria;
        return this;
    }

    /**
     * Get the filterOn property: The filterOn property.
     *
     * @return the filterOn value.
     */
    public String filterOn() {
        return this.filterOn;
    }

    /**
     * Set the filterOn property: The filterOn property.
     *
     * @param filterOn the filterOn value to set.
     * @return the MicrosoftGraphWorkbookFilterCriteria object itself.
     */
    public MicrosoftGraphWorkbookFilterCriteria withFilterOn(String filterOn) {
        this.filterOn = filterOn;
        return this;
    }

    /**
     * Get the icon property: workbookIcon.
     *
     * @return the icon value.
     */
    public MicrosoftGraphWorkbookIcon icon() {
        return this.icon;
    }

    /**
     * Set the icon property: workbookIcon.
     *
     * @param icon the icon value to set.
     * @return the MicrosoftGraphWorkbookFilterCriteria object itself.
     */
    public MicrosoftGraphWorkbookFilterCriteria withIcon(MicrosoftGraphWorkbookIcon icon) {
        this.icon = icon;
        return this;
    }

    /**
     * Get the operator property: The operator property.
     *
     * @return the operator value.
     */
    public String operator() {
        return this.operator;
    }

    /**
     * Set the operator property: The operator property.
     *
     * @param operator the operator value to set.
     * @return the MicrosoftGraphWorkbookFilterCriteria object itself.
     */
    public MicrosoftGraphWorkbookFilterCriteria withOperator(String operator) {
        this.operator = operator;
        return this;
    }

    /**
     * Get the values property: Json.
     *
     * @return the values value.
     */
    public Map<String, Object> values() {
        return this.values;
    }

    /**
     * Set the values property: Json.
     *
     * @param values the values value to set.
     * @return the MicrosoftGraphWorkbookFilterCriteria object itself.
     */
    public MicrosoftGraphWorkbookFilterCriteria withValues(Map<String, Object> values) {
        this.values = values;
        return this;
    }

    /**
     * Get the additionalProperties property: workbookFilterCriteria.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: workbookFilterCriteria.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphWorkbookFilterCriteria object itself.
     */
    public MicrosoftGraphWorkbookFilterCriteria withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (icon() != null) {
            icon().validate();
        }
    }
}
