// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Authentication type of the connection target. */
public final class ConnectionAuthType extends ExpandableStringEnum<ConnectionAuthType> {
    /** Static value PAT for ConnectionAuthType. */
    public static final ConnectionAuthType PAT = fromString("PAT");

    /** Static value ManagedIdentity for ConnectionAuthType. */
    public static final ConnectionAuthType MANAGED_IDENTITY = fromString("ManagedIdentity");

    /** Static value UsernamePassword for ConnectionAuthType. */
    public static final ConnectionAuthType USERNAME_PASSWORD = fromString("UsernamePassword");

    /** Static value None for ConnectionAuthType. */
    public static final ConnectionAuthType NONE = fromString("None");

    /** Static value SAS for ConnectionAuthType. */
    public static final ConnectionAuthType SAS = fromString("SAS");

    /**
     * Creates or finds a ConnectionAuthType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ConnectionAuthType.
     */
    @JsonCreator
    public static ConnectionAuthType fromString(String name) {
        return fromString(name, ConnectionAuthType.class);
    }

    /**
     * Gets known ConnectionAuthType values.
     *
     * @return known ConnectionAuthType values.
     */
    public static Collection<ConnectionAuthType> values() {
        return values(ConnectionAuthType.class);
    }
}
