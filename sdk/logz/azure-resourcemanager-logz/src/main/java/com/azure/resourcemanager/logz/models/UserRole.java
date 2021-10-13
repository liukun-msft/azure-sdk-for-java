// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logz.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for UserRole. */
public final class UserRole extends ExpandableStringEnum<UserRole> {
    /** Static value None for UserRole. */
    public static final UserRole NONE = fromString("None");

    /** Static value User for UserRole. */
    public static final UserRole USER = fromString("User");

    /** Static value Admin for UserRole. */
    public static final UserRole ADMIN = fromString("Admin");

    /**
     * Creates or finds a UserRole from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding UserRole.
     */
    @JsonCreator
    public static UserRole fromString(String name) {
        return fromString(name, UserRole.class);
    }

    /** @return known UserRole values. */
    public static Collection<UserRole> values() {
        return values(UserRole.class);
    }
}
