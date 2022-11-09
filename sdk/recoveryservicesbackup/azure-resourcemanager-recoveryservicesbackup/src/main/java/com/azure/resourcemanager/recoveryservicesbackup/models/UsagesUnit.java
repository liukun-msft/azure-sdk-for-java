// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Unit of the usage. */
public final class UsagesUnit extends ExpandableStringEnum<UsagesUnit> {
    /** Static value Count for UsagesUnit. */
    public static final UsagesUnit COUNT = fromString("Count");

    /** Static value Bytes for UsagesUnit. */
    public static final UsagesUnit BYTES = fromString("Bytes");

    /** Static value Seconds for UsagesUnit. */
    public static final UsagesUnit SECONDS = fromString("Seconds");

    /** Static value Percent for UsagesUnit. */
    public static final UsagesUnit PERCENT = fromString("Percent");

    /** Static value CountPerSecond for UsagesUnit. */
    public static final UsagesUnit COUNT_PER_SECOND = fromString("CountPerSecond");

    /** Static value BytesPerSecond for UsagesUnit. */
    public static final UsagesUnit BYTES_PER_SECOND = fromString("BytesPerSecond");

    /**
     * Creates or finds a UsagesUnit from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding UsagesUnit.
     */
    @JsonCreator
    public static UsagesUnit fromString(String name) {
        return fromString(name, UsagesUnit.class);
    }

    /**
     * Gets known UsagesUnit values.
     *
     * @return known UsagesUnit values.
     */
    public static Collection<UsagesUnit> values() {
        return values(UsagesUnit.class);
    }
}
