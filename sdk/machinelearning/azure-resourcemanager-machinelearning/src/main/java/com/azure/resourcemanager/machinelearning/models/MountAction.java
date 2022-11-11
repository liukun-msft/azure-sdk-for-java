// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Mount Action. */
public final class MountAction extends ExpandableStringEnum<MountAction> {
    /** Static value Mount for MountAction. */
    public static final MountAction MOUNT = fromString("Mount");

    /** Static value Unmount for MountAction. */
    public static final MountAction UNMOUNT = fromString("Unmount");

    /**
     * Creates or finds a MountAction from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MountAction.
     */
    @JsonCreator
    public static MountAction fromString(String name) {
        return fromString(name, MountAction.class);
    }

    /**
     * Gets known MountAction values.
     *
     * @return known MountAction values.
     */
    public static Collection<MountAction> values() {
        return values(MountAction.class);
    }
}
