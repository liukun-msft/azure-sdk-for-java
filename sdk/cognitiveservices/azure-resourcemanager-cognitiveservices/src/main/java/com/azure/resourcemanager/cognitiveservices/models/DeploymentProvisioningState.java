// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Gets the status of the resource at the time the operation was called. */
public final class DeploymentProvisioningState extends ExpandableStringEnum<DeploymentProvisioningState> {
    /** Static value Accepted for DeploymentProvisioningState. */
    public static final DeploymentProvisioningState ACCEPTED = fromString("Accepted");

    /** Static value Creating for DeploymentProvisioningState. */
    public static final DeploymentProvisioningState CREATING = fromString("Creating");

    /** Static value Deleting for DeploymentProvisioningState. */
    public static final DeploymentProvisioningState DELETING = fromString("Deleting");

    /** Static value Moving for DeploymentProvisioningState. */
    public static final DeploymentProvisioningState MOVING = fromString("Moving");

    /** Static value Failed for DeploymentProvisioningState. */
    public static final DeploymentProvisioningState FAILED = fromString("Failed");

    /** Static value Succeeded for DeploymentProvisioningState. */
    public static final DeploymentProvisioningState SUCCEEDED = fromString("Succeeded");

    /**
     * Creates or finds a DeploymentProvisioningState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DeploymentProvisioningState.
     */
    @JsonCreator
    public static DeploymentProvisioningState fromString(String name) {
        return fromString(name, DeploymentProvisioningState.class);
    }

    /**
     * Gets known DeploymentProvisioningState values.
     *
     * @return known DeploymentProvisioningState values.
     */
    public static Collection<DeploymentProvisioningState> values() {
        return values(DeploymentProvisioningState.class);
    }
}
