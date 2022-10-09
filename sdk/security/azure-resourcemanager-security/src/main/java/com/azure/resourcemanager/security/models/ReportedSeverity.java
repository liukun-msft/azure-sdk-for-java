// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Assessed alert severity. */
public final class ReportedSeverity extends ExpandableStringEnum<ReportedSeverity> {
    /** Static value Informational for ReportedSeverity. */
    public static final ReportedSeverity INFORMATIONAL = fromString("Informational");

    /** Static value Low for ReportedSeverity. */
    public static final ReportedSeverity LOW = fromString("Low");

    /** Static value Medium for ReportedSeverity. */
    public static final ReportedSeverity MEDIUM = fromString("Medium");

    /** Static value High for ReportedSeverity. */
    public static final ReportedSeverity HIGH = fromString("High");

    /**
     * Creates or finds a ReportedSeverity from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ReportedSeverity.
     */
    @JsonCreator
    public static ReportedSeverity fromString(String name) {
        return fromString(name, ReportedSeverity.class);
    }

    /**
     * Gets known ReportedSeverity values.
     *
     * @return known ReportedSeverity values.
     */
    public static Collection<ReportedSeverity> values() {
        return values(ReportedSeverity.class);
    }
}
