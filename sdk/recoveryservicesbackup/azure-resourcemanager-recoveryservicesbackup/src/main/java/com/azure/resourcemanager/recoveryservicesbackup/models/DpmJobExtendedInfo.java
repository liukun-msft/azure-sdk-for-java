// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Additional information on the DPM workload-specific job. */
@Fluent
public final class DpmJobExtendedInfo {
    /*
     * List of tasks associated with this job.
     */
    @JsonProperty(value = "tasksList")
    private List<DpmJobTaskDetails> tasksList;

    /*
     * The job properties.
     */
    @JsonProperty(value = "propertyBag")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> propertyBag;

    /*
     * Non localized error message on job execution.
     */
    @JsonProperty(value = "dynamicErrorMessage")
    private String dynamicErrorMessage;

    /** Creates an instance of DpmJobExtendedInfo class. */
    public DpmJobExtendedInfo() {
    }

    /**
     * Get the tasksList property: List of tasks associated with this job.
     *
     * @return the tasksList value.
     */
    public List<DpmJobTaskDetails> tasksList() {
        return this.tasksList;
    }

    /**
     * Set the tasksList property: List of tasks associated with this job.
     *
     * @param tasksList the tasksList value to set.
     * @return the DpmJobExtendedInfo object itself.
     */
    public DpmJobExtendedInfo withTasksList(List<DpmJobTaskDetails> tasksList) {
        this.tasksList = tasksList;
        return this;
    }

    /**
     * Get the propertyBag property: The job properties.
     *
     * @return the propertyBag value.
     */
    public Map<String, String> propertyBag() {
        return this.propertyBag;
    }

    /**
     * Set the propertyBag property: The job properties.
     *
     * @param propertyBag the propertyBag value to set.
     * @return the DpmJobExtendedInfo object itself.
     */
    public DpmJobExtendedInfo withPropertyBag(Map<String, String> propertyBag) {
        this.propertyBag = propertyBag;
        return this;
    }

    /**
     * Get the dynamicErrorMessage property: Non localized error message on job execution.
     *
     * @return the dynamicErrorMessage value.
     */
    public String dynamicErrorMessage() {
        return this.dynamicErrorMessage;
    }

    /**
     * Set the dynamicErrorMessage property: Non localized error message on job execution.
     *
     * @param dynamicErrorMessage the dynamicErrorMessage value to set.
     * @return the DpmJobExtendedInfo object itself.
     */
    public DpmJobExtendedInfo withDynamicErrorMessage(String dynamicErrorMessage) {
        this.dynamicErrorMessage = dynamicErrorMessage;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (tasksList() != null) {
            tasksList().forEach(e -> e.validate());
        }
    }
}
