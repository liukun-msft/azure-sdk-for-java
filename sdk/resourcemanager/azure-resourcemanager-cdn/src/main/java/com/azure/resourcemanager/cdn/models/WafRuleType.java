// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for WafRuleType. */
public final class WafRuleType extends ExpandableStringEnum<WafRuleType> {
    /** Static value managed for WafRuleType. */
    public static final WafRuleType MANAGED = fromString("managed");

    /** Static value custom for WafRuleType. */
    public static final WafRuleType CUSTOM = fromString("custom");

    /** Static value bot for WafRuleType. */
    public static final WafRuleType BOT = fromString("bot");

    /**
     * Creates or finds a WafRuleType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding WafRuleType.
     */
    @JsonCreator
    public static WafRuleType fromString(String name) {
        return fromString(name, WafRuleType.class);
    }

    /**
     * Gets known WafRuleType values.
     *
     * @return known WafRuleType values.
     */
    public static Collection<WafRuleType> values() {
        return values(WafRuleType.class);
    }
}
