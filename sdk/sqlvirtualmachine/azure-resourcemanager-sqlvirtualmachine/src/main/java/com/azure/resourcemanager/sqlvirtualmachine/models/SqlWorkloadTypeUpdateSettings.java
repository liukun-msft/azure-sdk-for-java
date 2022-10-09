// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Set workload type to optimize storage for SQL Server. */
@Fluent
public final class SqlWorkloadTypeUpdateSettings {
    /*
     * SQL Server workload type.
     */
    @JsonProperty(value = "sqlWorkloadType")
    private SqlWorkloadType sqlWorkloadType;

    /**
     * Get the sqlWorkloadType property: SQL Server workload type.
     *
     * @return the sqlWorkloadType value.
     */
    public SqlWorkloadType sqlWorkloadType() {
        return this.sqlWorkloadType;
    }

    /**
     * Set the sqlWorkloadType property: SQL Server workload type.
     *
     * @param sqlWorkloadType the sqlWorkloadType value to set.
     * @return the SqlWorkloadTypeUpdateSettings object itself.
     */
    public SqlWorkloadTypeUpdateSettings withSqlWorkloadType(SqlWorkloadType sqlWorkloadType) {
        this.sqlWorkloadType = sqlWorkloadType;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
