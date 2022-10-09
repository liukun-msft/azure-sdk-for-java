// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.alertsmanagement.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Action to be applied. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "actionType",
    defaultImpl = Action.class)
@JsonTypeName("Action")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "AddActionGroups", value = AddActionGroups.class),
    @JsonSubTypes.Type(name = "RemoveAllActionGroups", value = RemoveAllActionGroups.class)
})
@Immutable
public class Action {
    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
