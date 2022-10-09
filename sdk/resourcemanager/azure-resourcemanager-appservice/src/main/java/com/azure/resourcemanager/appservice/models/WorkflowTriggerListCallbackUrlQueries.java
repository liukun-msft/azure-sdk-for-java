// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Gets the workflow trigger callback URL query parameters. */
@Fluent
public final class WorkflowTriggerListCallbackUrlQueries {
    /*
     * The api version.
     */
    @JsonProperty(value = "api-version")
    private String apiVersion;

    /*
     * The SAS permissions.
     */
    @JsonProperty(value = "sp")
    private String sp;

    /*
     * The SAS version.
     */
    @JsonProperty(value = "sv")
    private String sv;

    /*
     * The SAS signature.
     */
    @JsonProperty(value = "sig")
    private String sig;

    /*
     * The SAS timestamp.
     */
    @JsonProperty(value = "se")
    private String se;

    /**
     * Get the apiVersion property: The api version.
     *
     * @return the apiVersion value.
     */
    public String apiVersion() {
        return this.apiVersion;
    }

    /**
     * Set the apiVersion property: The api version.
     *
     * @param apiVersion the apiVersion value to set.
     * @return the WorkflowTriggerListCallbackUrlQueries object itself.
     */
    public WorkflowTriggerListCallbackUrlQueries withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * Get the sp property: The SAS permissions.
     *
     * @return the sp value.
     */
    public String sp() {
        return this.sp;
    }

    /**
     * Set the sp property: The SAS permissions.
     *
     * @param sp the sp value to set.
     * @return the WorkflowTriggerListCallbackUrlQueries object itself.
     */
    public WorkflowTriggerListCallbackUrlQueries withSp(String sp) {
        this.sp = sp;
        return this;
    }

    /**
     * Get the sv property: The SAS version.
     *
     * @return the sv value.
     */
    public String sv() {
        return this.sv;
    }

    /**
     * Set the sv property: The SAS version.
     *
     * @param sv the sv value to set.
     * @return the WorkflowTriggerListCallbackUrlQueries object itself.
     */
    public WorkflowTriggerListCallbackUrlQueries withSv(String sv) {
        this.sv = sv;
        return this;
    }

    /**
     * Get the sig property: The SAS signature.
     *
     * @return the sig value.
     */
    public String sig() {
        return this.sig;
    }

    /**
     * Set the sig property: The SAS signature.
     *
     * @param sig the sig value to set.
     * @return the WorkflowTriggerListCallbackUrlQueries object itself.
     */
    public WorkflowTriggerListCallbackUrlQueries withSig(String sig) {
        this.sig = sig;
        return this;
    }

    /**
     * Get the se property: The SAS timestamp.
     *
     * @return the se value.
     */
    public String se() {
        return this.se;
    }

    /**
     * Set the se property: The SAS timestamp.
     *
     * @param se the se value to set.
     * @return the WorkflowTriggerListCallbackUrlQueries object itself.
     */
    public WorkflowTriggerListCallbackUrlQueries withSe(String se) {
        this.se = se;
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
