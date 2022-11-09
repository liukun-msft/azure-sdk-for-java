// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Type of backup items associated with this container. */
public final class BackupItemType extends ExpandableStringEnum<BackupItemType> {
    /** Static value Invalid for BackupItemType. */
    public static final BackupItemType INVALID = fromString("Invalid");

    /** Static value VM for BackupItemType. */
    public static final BackupItemType VM = fromString("VM");

    /** Static value FileFolder for BackupItemType. */
    public static final BackupItemType FILE_FOLDER = fromString("FileFolder");

    /** Static value AzureSqlDb for BackupItemType. */
    public static final BackupItemType AZURE_SQL_DB = fromString("AzureSqlDb");

    /** Static value SQLDB for BackupItemType. */
    public static final BackupItemType SQLDB = fromString("SQLDB");

    /** Static value Exchange for BackupItemType. */
    public static final BackupItemType EXCHANGE = fromString("Exchange");

    /** Static value Sharepoint for BackupItemType. */
    public static final BackupItemType SHAREPOINT = fromString("Sharepoint");

    /** Static value VMwareVM for BackupItemType. */
    public static final BackupItemType VMWARE_VM = fromString("VMwareVM");

    /** Static value SystemState for BackupItemType. */
    public static final BackupItemType SYSTEM_STATE = fromString("SystemState");

    /** Static value Client for BackupItemType. */
    public static final BackupItemType CLIENT = fromString("Client");

    /** Static value GenericDataSource for BackupItemType. */
    public static final BackupItemType GENERIC_DATA_SOURCE = fromString("GenericDataSource");

    /** Static value SQLDataBase for BackupItemType. */
    public static final BackupItemType SQLDATA_BASE = fromString("SQLDataBase");

    /** Static value AzureFileShare for BackupItemType. */
    public static final BackupItemType AZURE_FILE_SHARE = fromString("AzureFileShare");

    /** Static value SAPHanaDatabase for BackupItemType. */
    public static final BackupItemType SAPHANA_DATABASE = fromString("SAPHanaDatabase");

    /** Static value SAPAseDatabase for BackupItemType. */
    public static final BackupItemType SAPASE_DATABASE = fromString("SAPAseDatabase");

    /** Static value SAPHanaDBInstance for BackupItemType. */
    public static final BackupItemType SAPHANA_DBINSTANCE = fromString("SAPHanaDBInstance");

    /**
     * Creates or finds a BackupItemType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding BackupItemType.
     */
    @JsonCreator
    public static BackupItemType fromString(String name) {
        return fromString(name, BackupItemType.class);
    }

    /**
     * Gets known BackupItemType values.
     *
     * @return known BackupItemType values.
     */
    public static Collection<BackupItemType> values() {
        return values(BackupItemType.class);
    }
}
