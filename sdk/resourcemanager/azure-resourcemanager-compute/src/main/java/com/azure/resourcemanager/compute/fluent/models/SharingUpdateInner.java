// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.models.SharingProfileGroup;
import com.azure.resourcemanager.compute.models.SharingUpdateOperationTypes;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Specifies information about the gallery sharing profile update. */
@Fluent
public final class SharingUpdateInner {
    /*
     * This property allows you to specify the operation type of gallery sharing update. <br><br> Possible values are:
     * <br><br> **Add** <br><br> **Remove** <br><br> **Reset**
     */
    @JsonProperty(value = "operationType", required = true)
    private SharingUpdateOperationTypes operationType;

    /*
     * A list of sharing profile groups.
     */
    @JsonProperty(value = "groups")
    private List<SharingProfileGroup> groups;

    /**
     * Get the operationType property: This property allows you to specify the operation type of gallery sharing update.
     * &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **Add** &lt;br&gt;&lt;br&gt; **Remove**
     * &lt;br&gt;&lt;br&gt; **Reset**.
     *
     * @return the operationType value.
     */
    public SharingUpdateOperationTypes operationType() {
        return this.operationType;
    }

    /**
     * Set the operationType property: This property allows you to specify the operation type of gallery sharing update.
     * &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **Add** &lt;br&gt;&lt;br&gt; **Remove**
     * &lt;br&gt;&lt;br&gt; **Reset**.
     *
     * @param operationType the operationType value to set.
     * @return the SharingUpdateInner object itself.
     */
    public SharingUpdateInner withOperationType(SharingUpdateOperationTypes operationType) {
        this.operationType = operationType;
        return this;
    }

    /**
     * Get the groups property: A list of sharing profile groups.
     *
     * @return the groups value.
     */
    public List<SharingProfileGroup> groups() {
        return this.groups;
    }

    /**
     * Set the groups property: A list of sharing profile groups.
     *
     * @param groups the groups value to set.
     * @return the SharingUpdateInner object itself.
     */
    public SharingUpdateInner withGroups(List<SharingProfileGroup> groups) {
        this.groups = groups;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (operationType() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property operationType in model SharingUpdateInner"));
        }
        if (groups() != null) {
            groups().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SharingUpdateInner.class);
}
