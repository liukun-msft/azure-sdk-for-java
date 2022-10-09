// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dynatrace.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Liftr resource category. */
public final class LiftrResourceCategories extends ExpandableStringEnum<LiftrResourceCategories> {
    /** Static value Unknown for LiftrResourceCategories. */
    public static final LiftrResourceCategories UNKNOWN = fromString("Unknown");

    /** Static value MonitorLogs for LiftrResourceCategories. */
    public static final LiftrResourceCategories MONITOR_LOGS = fromString("MonitorLogs");

    /**
     * Creates or finds a LiftrResourceCategories from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding LiftrResourceCategories.
     */
    @JsonCreator
    public static LiftrResourceCategories fromString(String name) {
        return fromString(name, LiftrResourceCategories.class);
    }

    /**
     * Gets known LiftrResourceCategories values.
     *
     * @return known LiftrResourceCategories values.
     */
    public static Collection<LiftrResourceCategories> values() {
        return values(LiftrResourceCategories.class);
    }
}
