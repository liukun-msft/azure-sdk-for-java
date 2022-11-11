// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Compute OS Type. */
public final class OsType extends ExpandableStringEnum<OsType> {
    /** Static value Linux for OsType. */
    public static final OsType LINUX = fromString("Linux");

    /** Static value Windows for OsType. */
    public static final OsType WINDOWS = fromString("Windows");

    /**
     * Creates or finds a OsType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding OsType.
     */
    @JsonCreator
    public static OsType fromString(String name) {
        return fromString(name, OsType.class);
    }

    /**
     * Gets known OsType values.
     *
     * @return known OsType values.
     */
    public static Collection<OsType> values() {
        return values(OsType.class);
    }
}
