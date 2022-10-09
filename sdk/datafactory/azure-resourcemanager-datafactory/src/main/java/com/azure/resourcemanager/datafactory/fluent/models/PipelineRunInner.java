// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.datafactory.models.PipelineRunInvokedBy;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;

/** Information about a pipeline run. */
@Fluent
public final class PipelineRunInner {
    /*
     * Identifier of a run.
     */
    @JsonProperty(value = "runId", access = JsonProperty.Access.WRITE_ONLY)
    private String runId;

    /*
     * Identifier that correlates all the recovery runs of a pipeline run.
     */
    @JsonProperty(value = "runGroupId", access = JsonProperty.Access.WRITE_ONLY)
    private String runGroupId;

    /*
     * Indicates if the recovered pipeline run is the latest in its group.
     */
    @JsonProperty(value = "isLatest", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isLatest;

    /*
     * The pipeline name.
     */
    @JsonProperty(value = "pipelineName", access = JsonProperty.Access.WRITE_ONLY)
    private String pipelineName;

    /*
     * The full or partial list of parameter name, value pair used in the pipeline run.
     */
    @JsonProperty(value = "parameters", access = JsonProperty.Access.WRITE_ONLY)
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> parameters;

    /*
     * Run dimensions emitted by Pipeline run.
     */
    @JsonProperty(value = "runDimensions", access = JsonProperty.Access.WRITE_ONLY)
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> runDimensions;

    /*
     * Entity that started the pipeline run.
     */
    @JsonProperty(value = "invokedBy", access = JsonProperty.Access.WRITE_ONLY)
    private PipelineRunInvokedBy invokedBy;

    /*
     * The last updated timestamp for the pipeline run event in ISO8601 format.
     */
    @JsonProperty(value = "lastUpdated", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastUpdated;

    /*
     * The start time of a pipeline run in ISO8601 format.
     */
    @JsonProperty(value = "runStart", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime runStart;

    /*
     * The end time of a pipeline run in ISO8601 format.
     */
    @JsonProperty(value = "runEnd", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime runEnd;

    /*
     * The duration of a pipeline run.
     */
    @JsonProperty(value = "durationInMs", access = JsonProperty.Access.WRITE_ONLY)
    private Integer durationInMs;

    /*
     * The status of a pipeline run. Possible values: Queued, InProgress, Succeeded, Failed, Canceling, Cancelled
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private String status;

    /*
     * The message from a pipeline run.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /*
     * Information about a pipeline run.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the runId property: Identifier of a run.
     *
     * @return the runId value.
     */
    public String runId() {
        return this.runId;
    }

    /**
     * Get the runGroupId property: Identifier that correlates all the recovery runs of a pipeline run.
     *
     * @return the runGroupId value.
     */
    public String runGroupId() {
        return this.runGroupId;
    }

    /**
     * Get the isLatest property: Indicates if the recovered pipeline run is the latest in its group.
     *
     * @return the isLatest value.
     */
    public Boolean isLatest() {
        return this.isLatest;
    }

    /**
     * Get the pipelineName property: The pipeline name.
     *
     * @return the pipelineName value.
     */
    public String pipelineName() {
        return this.pipelineName;
    }

    /**
     * Get the parameters property: The full or partial list of parameter name, value pair used in the pipeline run.
     *
     * @return the parameters value.
     */
    public Map<String, String> parameters() {
        return this.parameters;
    }

    /**
     * Get the runDimensions property: Run dimensions emitted by Pipeline run.
     *
     * @return the runDimensions value.
     */
    public Map<String, String> runDimensions() {
        return this.runDimensions;
    }

    /**
     * Get the invokedBy property: Entity that started the pipeline run.
     *
     * @return the invokedBy value.
     */
    public PipelineRunInvokedBy invokedBy() {
        return this.invokedBy;
    }

    /**
     * Get the lastUpdated property: The last updated timestamp for the pipeline run event in ISO8601 format.
     *
     * @return the lastUpdated value.
     */
    public OffsetDateTime lastUpdated() {
        return this.lastUpdated;
    }

    /**
     * Get the runStart property: The start time of a pipeline run in ISO8601 format.
     *
     * @return the runStart value.
     */
    public OffsetDateTime runStart() {
        return this.runStart;
    }

    /**
     * Get the runEnd property: The end time of a pipeline run in ISO8601 format.
     *
     * @return the runEnd value.
     */
    public OffsetDateTime runEnd() {
        return this.runEnd;
    }

    /**
     * Get the durationInMs property: The duration of a pipeline run.
     *
     * @return the durationInMs value.
     */
    public Integer durationInMs() {
        return this.durationInMs;
    }

    /**
     * Get the status property: The status of a pipeline run. Possible values: Queued, InProgress, Succeeded, Failed,
     * Canceling, Cancelled.
     *
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Get the message property: The message from a pipeline run.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Get the additionalProperties property: Information about a pipeline run.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Information about a pipeline run.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the PipelineRunInner object itself.
     */
    public PipelineRunInner withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (invokedBy() != null) {
            invokedBy().validate();
        }
    }
}
