// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.monitor.query.log.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The Analytics query. Learn more about the [Analytics query
 * syntax](https://azure.microsoft.com/documentation/articles/app-insights-analytics-reference/).
 */
@Fluent
public final class QueryBody {
    /*
     * The query to execute.
     */
    @JsonProperty(value = "query", required = true)
    private String query;

    /*
     * Optional. The timespan over which to query data. This is an ISO8601 time
     * period value.  This timespan is applied in addition to any that are
     * specified in the query expression.
     */
    @JsonProperty(value = "timespan")
    private String timespan;

    /*
     * A list of workspaces that are included in the query.
     */
    @JsonProperty(value = "workspaces")
    private List<String> workspaces;

    /**
     * Creates an instance of QueryBody class.
     *
     * @param query the query value to set.
     */
    @JsonCreator
    public QueryBody(@JsonProperty(value = "query", required = true) String query) {
        this.query = query;
    }

    /**
     * Get the query property: The query to execute.
     *
     * @return the query value.
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * Get the timespan property: Optional. The timespan over which to query data. This is an ISO8601 time period value.
     * This timespan is applied in addition to any that are specified in the query expression.
     *
     * @return the timespan value.
     */
    public String getTimespan() {
        return this.timespan;
    }

    /**
     * Set the timespan property: Optional. The timespan over which to query data. This is an ISO8601 time period value.
     * This timespan is applied in addition to any that are specified in the query expression.
     *
     * @param timespan the timespan value to set.
     * @return the QueryBody object itself.
     */
    public QueryBody setTimespan(String timespan) {
        this.timespan = timespan;
        return this;
    }

    /**
     * Get the workspaces property: A list of workspaces that are included in the query.
     *
     * @return the workspaces value.
     */
    public List<String> getWorkspaces() {
        return this.workspaces;
    }

    /**
     * Set the workspaces property: A list of workspaces that are included in the query.
     *
     * @param workspaces the workspaces value to set.
     * @return the QueryBody object itself.
     */
    public QueryBody setWorkspaces(List<String> workspaces) {
        this.workspaces = workspaces;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getQuery() == null) {
            throw new IllegalArgumentException("Missing required property query in model QueryBody");
        }
    }
}
