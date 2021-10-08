// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for LengthUnit. */
public final class LengthUnit extends ExpandableStringEnum<LengthUnit> {
    /** Static value pixel for LengthUnit. */
    public static final LengthUnit PIXEL = fromString("pixel");

    /** Static value inch for LengthUnit. */
    public static final LengthUnit INCH = fromString("inch");

    /**
     * Creates or finds a LengthUnit from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding LengthUnit.
     */
    @JsonCreator
    public static LengthUnit fromString(String name) {
        return fromString(name, LengthUnit.class);
    }

    /** @return known LengthUnit values. */
    public static Collection<LengthUnit> values() {
        return values(LengthUnit.class);
    }
}
