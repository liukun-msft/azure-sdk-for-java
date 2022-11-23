// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** complianceState. */
public final class MicrosoftGraphComplianceState extends ExpandableStringEnum<MicrosoftGraphComplianceState> {
    /** Static value unknown for MicrosoftGraphComplianceState. */
    public static final MicrosoftGraphComplianceState UNKNOWN = fromString("unknown");

    /** Static value compliant for MicrosoftGraphComplianceState. */
    public static final MicrosoftGraphComplianceState COMPLIANT = fromString("compliant");

    /** Static value noncompliant for MicrosoftGraphComplianceState. */
    public static final MicrosoftGraphComplianceState NONCOMPLIANT = fromString("noncompliant");

    /** Static value conflict for MicrosoftGraphComplianceState. */
    public static final MicrosoftGraphComplianceState CONFLICT = fromString("conflict");

    /** Static value error for MicrosoftGraphComplianceState. */
    public static final MicrosoftGraphComplianceState ERROR = fromString("error");

    /** Static value inGracePeriod for MicrosoftGraphComplianceState. */
    public static final MicrosoftGraphComplianceState IN_GRACE_PERIOD = fromString("inGracePeriod");

    /** Static value configManager for MicrosoftGraphComplianceState. */
    public static final MicrosoftGraphComplianceState CONFIG_MANAGER = fromString("configManager");

    /**
     * Creates or finds a MicrosoftGraphComplianceState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MicrosoftGraphComplianceState.
     */
    @JsonCreator
    public static MicrosoftGraphComplianceState fromString(String name) {
        return fromString(name, MicrosoftGraphComplianceState.class);
    }

    /**
     * Gets known MicrosoftGraphComplianceState values.
     *
     * @return known MicrosoftGraphComplianceState values.
     */
    public static Collection<MicrosoftGraphComplianceState> values() {
        return values(MicrosoftGraphComplianceState.class);
    }
}
