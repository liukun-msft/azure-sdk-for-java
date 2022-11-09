// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** Operation status extended info for list of jobs. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "objectType")
@JsonTypeName("OperationStatusJobsExtendedInfo")
@Fluent
public final class OperationStatusJobsExtendedInfo extends OperationStatusExtendedInfo {
    /*
     * IDs of the jobs created for the protected item.
     */
    @JsonProperty(value = "jobIds")
    private List<String> jobIds;

    /*
     * Stores all the failed jobs along with the corresponding error codes.
     */
    @JsonProperty(value = "failedJobsError")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> failedJobsError;

    /** Creates an instance of OperationStatusJobsExtendedInfo class. */
    public OperationStatusJobsExtendedInfo() {
    }

    /**
     * Get the jobIds property: IDs of the jobs created for the protected item.
     *
     * @return the jobIds value.
     */
    public List<String> jobIds() {
        return this.jobIds;
    }

    /**
     * Set the jobIds property: IDs of the jobs created for the protected item.
     *
     * @param jobIds the jobIds value to set.
     * @return the OperationStatusJobsExtendedInfo object itself.
     */
    public OperationStatusJobsExtendedInfo withJobIds(List<String> jobIds) {
        this.jobIds = jobIds;
        return this;
    }

    /**
     * Get the failedJobsError property: Stores all the failed jobs along with the corresponding error codes.
     *
     * @return the failedJobsError value.
     */
    public Map<String, String> failedJobsError() {
        return this.failedJobsError;
    }

    /**
     * Set the failedJobsError property: Stores all the failed jobs along with the corresponding error codes.
     *
     * @param failedJobsError the failedJobsError value to set.
     * @return the OperationStatusJobsExtendedInfo object itself.
     */
    public OperationStatusJobsExtendedInfo withFailedJobsError(Map<String, String> failedJobsError) {
        this.failedJobsError = failedJobsError;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
