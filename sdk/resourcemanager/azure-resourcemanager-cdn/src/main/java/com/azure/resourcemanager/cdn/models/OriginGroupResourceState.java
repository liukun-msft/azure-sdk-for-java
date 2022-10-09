// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Resource status of the origin group. */
public final class OriginGroupResourceState extends ExpandableStringEnum<OriginGroupResourceState> {
    /** Static value Creating for OriginGroupResourceState. */
    public static final OriginGroupResourceState CREATING = fromString("Creating");

    /** Static value Active for OriginGroupResourceState. */
    public static final OriginGroupResourceState ACTIVE = fromString("Active");

    /** Static value Deleting for OriginGroupResourceState. */
    public static final OriginGroupResourceState DELETING = fromString("Deleting");

    /**
     * Creates or finds a OriginGroupResourceState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding OriginGroupResourceState.
     */
    @JsonCreator
    public static OriginGroupResourceState fromString(String name) {
        return fromString(name, OriginGroupResourceState.class);
    }

    /**
     * Gets known OriginGroupResourceState values.
     *
     * @return known OriginGroupResourceState values.
     */
    public static Collection<OriginGroupResourceState> values() {
        return values(OriginGroupResourceState.class);
    }
}
