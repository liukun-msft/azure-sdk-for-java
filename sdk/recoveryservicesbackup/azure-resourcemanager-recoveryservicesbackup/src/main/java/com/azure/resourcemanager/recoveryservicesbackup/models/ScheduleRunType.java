// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Frequency of the schedule operation of this policy. */
public final class ScheduleRunType extends ExpandableStringEnum<ScheduleRunType> {
    /** Static value Invalid for ScheduleRunType. */
    public static final ScheduleRunType INVALID = fromString("Invalid");

    /** Static value Daily for ScheduleRunType. */
    public static final ScheduleRunType DAILY = fromString("Daily");

    /** Static value Weekly for ScheduleRunType. */
    public static final ScheduleRunType WEEKLY = fromString("Weekly");

    /** Static value Hourly for ScheduleRunType. */
    public static final ScheduleRunType HOURLY = fromString("Hourly");

    /**
     * Creates or finds a ScheduleRunType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ScheduleRunType.
     */
    @JsonCreator
    public static ScheduleRunType fromString(String name) {
        return fromString(name, ScheduleRunType.class);
    }

    /**
     * Gets known ScheduleRunType values.
     *
     * @return known ScheduleRunType values.
     */
    public static Collection<ScheduleRunType> values() {
        return values(ScheduleRunType.class);
    }
}
