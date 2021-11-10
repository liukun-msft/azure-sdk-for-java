// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A principal assignment check name availability request. */
@Fluent
public final class DatabasePrincipalAssignmentCheckNameRequest {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DatabasePrincipalAssignmentCheckNameRequest.class);

    /*
     * Principal Assignment resource name.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The type of resource,
     * Microsoft.Synapse/workspaces/kustoPools/databases/principalAssignments.
     */
    @JsonProperty(value = "type", required = true)
    private String type = "Microsoft.Synapse/workspaces/kustoPools/databases/principalAssignments";

    /** Creates an instance of DatabasePrincipalAssignmentCheckNameRequest class. */
    public DatabasePrincipalAssignmentCheckNameRequest() {
        type = "Microsoft.Synapse/workspaces/kustoPools/databases/principalAssignments";
    }

    /**
     * Get the name property: Principal Assignment resource name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Principal Assignment resource name.
     *
     * @param name the name value to set.
     * @return the DatabasePrincipalAssignmentCheckNameRequest object itself.
     */
    public DatabasePrincipalAssignmentCheckNameRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: The type of resource,
     * Microsoft.Synapse/workspaces/kustoPools/databases/principalAssignments.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: The type of resource,
     * Microsoft.Synapse/workspaces/kustoPools/databases/principalAssignments.
     *
     * @param type the type value to set.
     * @return the DatabasePrincipalAssignmentCheckNameRequest object itself.
     */
    public DatabasePrincipalAssignmentCheckNameRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property name in model DatabasePrincipalAssignmentCheckNameRequest"));
        }
    }
}
