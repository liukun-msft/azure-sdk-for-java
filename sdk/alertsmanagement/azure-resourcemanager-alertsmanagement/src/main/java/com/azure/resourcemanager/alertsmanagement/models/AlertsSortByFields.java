// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.alertsmanagement.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for AlertsSortByFields. */
public final class AlertsSortByFields extends ExpandableStringEnum<AlertsSortByFields> {
    /** Static value name for AlertsSortByFields. */
    public static final AlertsSortByFields NAME = fromString("name");

    /** Static value severity for AlertsSortByFields. */
    public static final AlertsSortByFields SEVERITY = fromString("severity");

    /** Static value alertState for AlertsSortByFields. */
    public static final AlertsSortByFields ALERT_STATE = fromString("alertState");

    /** Static value monitorCondition for AlertsSortByFields. */
    public static final AlertsSortByFields MONITOR_CONDITION = fromString("monitorCondition");

    /** Static value targetResource for AlertsSortByFields. */
    public static final AlertsSortByFields TARGET_RESOURCE = fromString("targetResource");

    /** Static value targetResourceName for AlertsSortByFields. */
    public static final AlertsSortByFields TARGET_RESOURCE_NAME = fromString("targetResourceName");

    /** Static value targetResourceGroup for AlertsSortByFields. */
    public static final AlertsSortByFields TARGET_RESOURCE_GROUP = fromString("targetResourceGroup");

    /** Static value targetResourceType for AlertsSortByFields. */
    public static final AlertsSortByFields TARGET_RESOURCE_TYPE = fromString("targetResourceType");

    /** Static value startDateTime for AlertsSortByFields. */
    public static final AlertsSortByFields START_DATE_TIME = fromString("startDateTime");

    /** Static value lastModifiedDateTime for AlertsSortByFields. */
    public static final AlertsSortByFields LAST_MODIFIED_DATE_TIME = fromString("lastModifiedDateTime");

    /**
     * Creates or finds a AlertsSortByFields from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AlertsSortByFields.
     */
    @JsonCreator
    public static AlertsSortByFields fromString(String name) {
        return fromString(name, AlertsSortByFields.class);
    }

    /**
     * Gets known AlertsSortByFields values.
     *
     * @return known AlertsSortByFields values.
     */
    public static Collection<AlertsSortByFields> values() {
        return values(AlertsSortByFields.class);
    }
}
