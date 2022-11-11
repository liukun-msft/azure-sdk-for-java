// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Storage type. */
public final class StorageType extends ExpandableStringEnum<StorageType> {
    /** Static value Invalid for StorageType. */
    public static final StorageType INVALID = fromString("Invalid");

    /** Static value GeoRedundant for StorageType. */
    public static final StorageType GEO_REDUNDANT = fromString("GeoRedundant");

    /** Static value LocallyRedundant for StorageType. */
    public static final StorageType LOCALLY_REDUNDANT = fromString("LocallyRedundant");

    /** Static value ZoneRedundant for StorageType. */
    public static final StorageType ZONE_REDUNDANT = fromString("ZoneRedundant");

    /** Static value ReadAccessGeoZoneRedundant for StorageType. */
    public static final StorageType READ_ACCESS_GEO_ZONE_REDUNDANT = fromString("ReadAccessGeoZoneRedundant");

    /**
     * Creates or finds a StorageType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding StorageType.
     */
    @JsonCreator
    public static StorageType fromString(String name) {
        return fromString(name, StorageType.class);
    }

    /**
     * Gets known StorageType values.
     *
     * @return known StorageType values.
     */
    public static Collection<StorageType> values() {
        return values(StorageType.class);
    }
}
