// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.DateTimeRfc1123;
import com.azure.resourcemanager.iothub.models.JobStatus;
import com.azure.resourcemanager.iothub.models.JobType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The properties of the Job Response object. */
@Immutable
public final class JobResponseInner {
    /*
     * The job identifier.
     */
    @JsonProperty(value = "jobId", access = JsonProperty.Access.WRITE_ONLY)
    private String jobId;

    /*
     * The start time of the job.
     */
    @JsonProperty(value = "startTimeUtc", access = JsonProperty.Access.WRITE_ONLY)
    private DateTimeRfc1123 startTimeUtc;

    /*
     * The time the job stopped processing.
     */
    @JsonProperty(value = "endTimeUtc", access = JsonProperty.Access.WRITE_ONLY)
    private DateTimeRfc1123 endTimeUtc;

    /*
     * The type of the job.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private JobType type;

    /*
     * The status of the job.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private JobStatus status;

    /*
     * If status == failed, this string containing the reason for the failure.
     */
    @JsonProperty(value = "failureReason", access = JsonProperty.Access.WRITE_ONLY)
    private String failureReason;

    /*
     * The status message for the job.
     */
    @JsonProperty(value = "statusMessage", access = JsonProperty.Access.WRITE_ONLY)
    private String statusMessage;

    /*
     * The job identifier of the parent job, if any.
     */
    @JsonProperty(value = "parentJobId", access = JsonProperty.Access.WRITE_ONLY)
    private String parentJobId;

    /**
     * Get the jobId property: The job identifier.
     *
     * @return the jobId value.
     */
    public String jobId() {
        return this.jobId;
    }

    /**
     * Get the startTimeUtc property: The start time of the job.
     *
     * @return the startTimeUtc value.
     */
    public OffsetDateTime startTimeUtc() {
        if (this.startTimeUtc == null) {
            return null;
        }
        return this.startTimeUtc.getDateTime();
    }

    /**
     * Get the endTimeUtc property: The time the job stopped processing.
     *
     * @return the endTimeUtc value.
     */
    public OffsetDateTime endTimeUtc() {
        if (this.endTimeUtc == null) {
            return null;
        }
        return this.endTimeUtc.getDateTime();
    }

    /**
     * Get the type property: The type of the job.
     *
     * @return the type value.
     */
    public JobType type() {
        return this.type;
    }

    /**
     * Get the status property: The status of the job.
     *
     * @return the status value.
     */
    public JobStatus status() {
        return this.status;
    }

    /**
     * Get the failureReason property: If status == failed, this string containing the reason for the failure.
     *
     * @return the failureReason value.
     */
    public String failureReason() {
        return this.failureReason;
    }

    /**
     * Get the statusMessage property: The status message for the job.
     *
     * @return the statusMessage value.
     */
    public String statusMessage() {
        return this.statusMessage;
    }

    /**
     * Get the parentJobId property: The job identifier of the parent job, if any.
     *
     * @return the parentJobId value.
     */
    public String parentJobId() {
        return this.parentJobId;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
