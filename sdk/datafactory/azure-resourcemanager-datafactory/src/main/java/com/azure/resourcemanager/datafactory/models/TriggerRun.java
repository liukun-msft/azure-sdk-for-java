// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;

/** Trigger runs. */
@Fluent
public final class TriggerRun {
    /*
     * Trigger run id.
     */
    @JsonProperty(value = "triggerRunId", access = JsonProperty.Access.WRITE_ONLY)
    private String triggerRunId;

    /*
     * Trigger name.
     */
    @JsonProperty(value = "triggerName", access = JsonProperty.Access.WRITE_ONLY)
    private String triggerName;

    /*
     * Trigger type.
     */
    @JsonProperty(value = "triggerType", access = JsonProperty.Access.WRITE_ONLY)
    private String triggerType;

    /*
     * Trigger run start time.
     */
    @JsonProperty(value = "triggerRunTimestamp", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime triggerRunTimestamp;

    /*
     * Trigger run status.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private TriggerRunStatus status;

    /*
     * Trigger error message.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /*
     * List of property name and value related to trigger run. Name, value pair depends on type of trigger.
     */
    @JsonProperty(value = "properties", access = JsonProperty.Access.WRITE_ONLY)
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> properties;

    /*
     * List of pipeline name and run Id triggered by the trigger run.
     */
    @JsonProperty(value = "triggeredPipelines", access = JsonProperty.Access.WRITE_ONLY)
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> triggeredPipelines;

    /*
     * Run dimension for which trigger was fired.
     */
    @JsonProperty(value = "runDimension", access = JsonProperty.Access.WRITE_ONLY)
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> runDimension;

    /*
     * Status of the upstream pipelines.
     */
    @JsonProperty(value = "dependencyStatus", access = JsonProperty.Access.WRITE_ONLY)
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, Object> dependencyStatus;

    /*
     * Trigger runs.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /** Creates an instance of TriggerRun class. */
    public TriggerRun() {
    }

    /**
     * Get the triggerRunId property: Trigger run id.
     *
     * @return the triggerRunId value.
     */
    public String triggerRunId() {
        return this.triggerRunId;
    }

    /**
     * Get the triggerName property: Trigger name.
     *
     * @return the triggerName value.
     */
    public String triggerName() {
        return this.triggerName;
    }

    /**
     * Get the triggerType property: Trigger type.
     *
     * @return the triggerType value.
     */
    public String triggerType() {
        return this.triggerType;
    }

    /**
     * Get the triggerRunTimestamp property: Trigger run start time.
     *
     * @return the triggerRunTimestamp value.
     */
    public OffsetDateTime triggerRunTimestamp() {
        return this.triggerRunTimestamp;
    }

    /**
     * Get the status property: Trigger run status.
     *
     * @return the status value.
     */
    public TriggerRunStatus status() {
        return this.status;
    }

    /**
     * Get the message property: Trigger error message.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Get the properties property: List of property name and value related to trigger run. Name, value pair depends on
     * type of trigger.
     *
     * @return the properties value.
     */
    public Map<String, String> properties() {
        return this.properties;
    }

    /**
     * Get the triggeredPipelines property: List of pipeline name and run Id triggered by the trigger run.
     *
     * @return the triggeredPipelines value.
     */
    public Map<String, String> triggeredPipelines() {
        return this.triggeredPipelines;
    }

    /**
     * Get the runDimension property: Run dimension for which trigger was fired.
     *
     * @return the runDimension value.
     */
    public Map<String, String> runDimension() {
        return this.runDimension;
    }

    /**
     * Get the dependencyStatus property: Status of the upstream pipelines.
     *
     * @return the dependencyStatus value.
     */
    public Map<String, Object> dependencyStatus() {
        return this.dependencyStatus;
    }

    /**
     * Get the additionalProperties property: Trigger runs.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Trigger runs.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the TriggerRun object itself.
     */
    public TriggerRun withAdditionalProperties(Map<String, Object> additionalProperties) {
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
    }
}
