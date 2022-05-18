// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

/** The JobState model. */
@Fluent
public class JobState {
    /*
     * The displayName property.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * The createdDateTime property.
     */
    @JsonProperty(value = "createdDateTime", required = true)
    private OffsetDateTime createdDateTime;

    /*
     * The expirationDateTime property.
     */
    @JsonProperty(value = "expirationDateTime")
    private OffsetDateTime expirationDateTime;

    /*
     * The jobId property.
     */
    @JsonProperty(value = "jobId", required = true)
    private UUID jobId;

    /*
     * The lastUpdateDateTime property.
     */
    @JsonProperty(value = "lastUpdateDateTime", required = true)
    private OffsetDateTime lastUpdateDateTime;

    /*
     * The status property.
     */
    @JsonProperty(value = "status", required = true)
    private State status;

    /*
     * The errors property.
     */
    @JsonProperty(value = "errors")
    private List<Error> errors;

    /*
     * The nextLink property.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the displayName property: The displayName property.
     *
     * @return the displayName value.
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The displayName property.
     *
     * @param displayName the displayName value to set.
     * @return the JobState object itself.
     */
    public JobState setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the createdDateTime property: The createdDateTime property.
     *
     * @return the createdDateTime value.
     */
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }

    /**
     * Set the createdDateTime property: The createdDateTime property.
     *
     * @param createdDateTime the createdDateTime value to set.
     * @return the JobState object itself.
     */
    public JobState setCreatedDateTime(OffsetDateTime createdDateTime) {
        this.createdDateTime = createdDateTime;
        return this;
    }

    /**
     * Get the expirationDateTime property: The expirationDateTime property.
     *
     * @return the expirationDateTime value.
     */
    public OffsetDateTime getExpirationDateTime() {
        return this.expirationDateTime;
    }

    /**
     * Set the expirationDateTime property: The expirationDateTime property.
     *
     * @param expirationDateTime the expirationDateTime value to set.
     * @return the JobState object itself.
     */
    public JobState setExpirationDateTime(OffsetDateTime expirationDateTime) {
        this.expirationDateTime = expirationDateTime;
        return this;
    }

    /**
     * Get the jobId property: The jobId property.
     *
     * @return the jobId value.
     */
    public UUID getJobId() {
        return this.jobId;
    }

    /**
     * Set the jobId property: The jobId property.
     *
     * @param jobId the jobId value to set.
     * @return the JobState object itself.
     */
    public JobState setJobId(UUID jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * Get the lastUpdateDateTime property: The lastUpdateDateTime property.
     *
     * @return the lastUpdateDateTime value.
     */
    public OffsetDateTime getLastUpdateDateTime() {
        return this.lastUpdateDateTime;
    }

    /**
     * Set the lastUpdateDateTime property: The lastUpdateDateTime property.
     *
     * @param lastUpdateDateTime the lastUpdateDateTime value to set.
     * @return the JobState object itself.
     */
    public JobState setLastUpdateDateTime(OffsetDateTime lastUpdateDateTime) {
        this.lastUpdateDateTime = lastUpdateDateTime;
        return this;
    }

    /**
     * Get the status property: The status property.
     *
     * @return the status value.
     */
    public State getStatus() {
        return this.status;
    }

    /**
     * Set the status property: The status property.
     *
     * @param status the status value to set.
     * @return the JobState object itself.
     */
    public JobState setStatus(State status) {
        this.status = status;
        return this;
    }

    /**
     * Get the errors property: The errors property.
     *
     * @return the errors value.
     */
    public List<Error> getErrors() {
        return this.errors;
    }

    /**
     * Set the errors property: The errors property.
     *
     * @param errors the errors value to set.
     * @return the JobState object itself.
     */
    public JobState setErrors(List<Error> errors) {
        this.errors = errors;
        return this;
    }

    /**
     * Get the nextLink property: The nextLink property.
     *
     * @return the nextLink value.
     */
    public String getNextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The nextLink property.
     *
     * @param nextLink the nextLink value to set.
     * @return the JobState object itself.
     */
    public JobState setNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }
}
