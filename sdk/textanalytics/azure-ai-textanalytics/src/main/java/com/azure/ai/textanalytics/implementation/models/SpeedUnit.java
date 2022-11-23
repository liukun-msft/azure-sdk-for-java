// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SpeedUnit. */
public final class SpeedUnit extends ExpandableStringEnum<SpeedUnit> {
    /** Static value Unspecified for SpeedUnit. */
    public static final SpeedUnit UNSPECIFIED = fromString("Unspecified");

    /** Static value MeterPerSecond for SpeedUnit. */
    public static final SpeedUnit METER_PER_SECOND = fromString("MeterPerSecond");

    /** Static value KilometerPerHour for SpeedUnit. */
    public static final SpeedUnit KILOMETER_PER_HOUR = fromString("KilometerPerHour");

    /** Static value KilometerPerMinute for SpeedUnit. */
    public static final SpeedUnit KILOMETER_PER_MINUTE = fromString("KilometerPerMinute");

    /** Static value KilometerPerSecond for SpeedUnit. */
    public static final SpeedUnit KILOMETER_PER_SECOND = fromString("KilometerPerSecond");

    /** Static value MilePerHour for SpeedUnit. */
    public static final SpeedUnit MILE_PER_HOUR = fromString("MilePerHour");

    /** Static value Knot for SpeedUnit. */
    public static final SpeedUnit KNOT = fromString("Knot");

    /** Static value FootPerSecond for SpeedUnit. */
    public static final SpeedUnit FOOT_PER_SECOND = fromString("FootPerSecond");

    /** Static value FootPerMinute for SpeedUnit. */
    public static final SpeedUnit FOOT_PER_MINUTE = fromString("FootPerMinute");

    /** Static value YardPerMinute for SpeedUnit. */
    public static final SpeedUnit YARD_PER_MINUTE = fromString("YardPerMinute");

    /** Static value YardPerSecond for SpeedUnit. */
    public static final SpeedUnit YARD_PER_SECOND = fromString("YardPerSecond");

    /** Static value MeterPerMillisecond for SpeedUnit. */
    public static final SpeedUnit METER_PER_MILLISECOND = fromString("MeterPerMillisecond");

    /** Static value CentimeterPerMillisecond for SpeedUnit. */
    public static final SpeedUnit CENTIMETER_PER_MILLISECOND = fromString("CentimeterPerMillisecond");

    /** Static value KilometerPerMillisecond for SpeedUnit. */
    public static final SpeedUnit KILOMETER_PER_MILLISECOND = fromString("KilometerPerMillisecond");

    /**
     * Creates or finds a SpeedUnit from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SpeedUnit.
     */
    @JsonCreator
    public static SpeedUnit fromString(String name) {
        return fromString(name, SpeedUnit.class);
    }

    /**
     * Gets known SpeedUnit values.
     *
     * @return known SpeedUnit values.
     */
    public static Collection<SpeedUnit> values() {
        return values(SpeedUnit.class);
    }
}
