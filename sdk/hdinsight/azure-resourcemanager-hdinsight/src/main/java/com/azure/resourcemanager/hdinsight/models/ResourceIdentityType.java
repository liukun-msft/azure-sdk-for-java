// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The type of identity used for the cluster. The type 'SystemAssigned, UserAssigned' includes both an implicitly
 * created identity and a set of user assigned identities.
 */
public final class ResourceIdentityType extends ExpandableStringEnum<ResourceIdentityType> {
    /** Static value SystemAssigned for ResourceIdentityType. */
    public static final ResourceIdentityType SYSTEM_ASSIGNED = fromString("SystemAssigned");

    /** Static value UserAssigned for ResourceIdentityType. */
    public static final ResourceIdentityType USER_ASSIGNED = fromString("UserAssigned");

    /** Static value SystemAssigned, UserAssigned for ResourceIdentityType. */
    public static final ResourceIdentityType SYSTEM_ASSIGNED_USER_ASSIGNED = fromString("SystemAssigned, UserAssigned");

    /** Static value None for ResourceIdentityType. */
    public static final ResourceIdentityType NONE = fromString("None");

    /**
     * Creates or finds a ResourceIdentityType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ResourceIdentityType.
     */
    @JsonCreator
    public static ResourceIdentityType fromString(String name) {
        return fromString(name, ResourceIdentityType.class);
    }

    /**
     * Gets known ResourceIdentityType values.
     *
     * @return known ResourceIdentityType values.
     */
    public static Collection<ResourceIdentityType> values() {
        return values(ResourceIdentityType.class);
    }
}
