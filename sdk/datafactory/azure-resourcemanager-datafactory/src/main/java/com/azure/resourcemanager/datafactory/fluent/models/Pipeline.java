// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.datafactory.models.Activity;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.PipelineFolder;
import com.azure.resourcemanager.datafactory.models.PipelinePolicy;
import com.azure.resourcemanager.datafactory.models.VariableSpecification;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** A data factory pipeline. */
@Fluent
public final class Pipeline {
    /*
     * The description of the pipeline.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * List of activities in pipeline.
     */
    @JsonProperty(value = "activities")
    private List<Activity> activities;

    /*
     * List of parameters for pipeline.
     */
    @JsonProperty(value = "parameters")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, ParameterSpecification> parameters;

    /*
     * List of variables for pipeline.
     */
    @JsonProperty(value = "variables")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, VariableSpecification> variables;

    /*
     * The max number of concurrent runs for the pipeline.
     */
    @JsonProperty(value = "concurrency")
    private Integer concurrency;

    /*
     * List of tags that can be used for describing the Pipeline.
     */
    @JsonProperty(value = "annotations")
    private List<Object> annotations;

    /*
     * Dimensions emitted by Pipeline.
     */
    @JsonProperty(value = "runDimensions")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, Object> runDimensions;

    /*
     * The folder that this Pipeline is in. If not specified, Pipeline will appear at the root level.
     */
    @JsonProperty(value = "folder")
    private PipelineFolder folder;

    /*
     * Pipeline Policy.
     */
    @JsonProperty(value = "policy")
    private PipelinePolicy policy;

    /** Creates an instance of Pipeline class. */
    public Pipeline() {
    }

    /**
     * Get the description property: The description of the pipeline.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The description of the pipeline.
     *
     * @param description the description value to set.
     * @return the Pipeline object itself.
     */
    public Pipeline withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the activities property: List of activities in pipeline.
     *
     * @return the activities value.
     */
    public List<Activity> activities() {
        return this.activities;
    }

    /**
     * Set the activities property: List of activities in pipeline.
     *
     * @param activities the activities value to set.
     * @return the Pipeline object itself.
     */
    public Pipeline withActivities(List<Activity> activities) {
        this.activities = activities;
        return this;
    }

    /**
     * Get the parameters property: List of parameters for pipeline.
     *
     * @return the parameters value.
     */
    public Map<String, ParameterSpecification> parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: List of parameters for pipeline.
     *
     * @param parameters the parameters value to set.
     * @return the Pipeline object itself.
     */
    public Pipeline withParameters(Map<String, ParameterSpecification> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get the variables property: List of variables for pipeline.
     *
     * @return the variables value.
     */
    public Map<String, VariableSpecification> variables() {
        return this.variables;
    }

    /**
     * Set the variables property: List of variables for pipeline.
     *
     * @param variables the variables value to set.
     * @return the Pipeline object itself.
     */
    public Pipeline withVariables(Map<String, VariableSpecification> variables) {
        this.variables = variables;
        return this;
    }

    /**
     * Get the concurrency property: The max number of concurrent runs for the pipeline.
     *
     * @return the concurrency value.
     */
    public Integer concurrency() {
        return this.concurrency;
    }

    /**
     * Set the concurrency property: The max number of concurrent runs for the pipeline.
     *
     * @param concurrency the concurrency value to set.
     * @return the Pipeline object itself.
     */
    public Pipeline withConcurrency(Integer concurrency) {
        this.concurrency = concurrency;
        return this;
    }

    /**
     * Get the annotations property: List of tags that can be used for describing the Pipeline.
     *
     * @return the annotations value.
     */
    public List<Object> annotations() {
        return this.annotations;
    }

    /**
     * Set the annotations property: List of tags that can be used for describing the Pipeline.
     *
     * @param annotations the annotations value to set.
     * @return the Pipeline object itself.
     */
    public Pipeline withAnnotations(List<Object> annotations) {
        this.annotations = annotations;
        return this;
    }

    /**
     * Get the runDimensions property: Dimensions emitted by Pipeline.
     *
     * @return the runDimensions value.
     */
    public Map<String, Object> runDimensions() {
        return this.runDimensions;
    }

    /**
     * Set the runDimensions property: Dimensions emitted by Pipeline.
     *
     * @param runDimensions the runDimensions value to set.
     * @return the Pipeline object itself.
     */
    public Pipeline withRunDimensions(Map<String, Object> runDimensions) {
        this.runDimensions = runDimensions;
        return this;
    }

    /**
     * Get the folder property: The folder that this Pipeline is in. If not specified, Pipeline will appear at the root
     * level.
     *
     * @return the folder value.
     */
    public PipelineFolder folder() {
        return this.folder;
    }

    /**
     * Set the folder property: The folder that this Pipeline is in. If not specified, Pipeline will appear at the root
     * level.
     *
     * @param folder the folder value to set.
     * @return the Pipeline object itself.
     */
    public Pipeline withFolder(PipelineFolder folder) {
        this.folder = folder;
        return this;
    }

    /**
     * Get the policy property: Pipeline Policy.
     *
     * @return the policy value.
     */
    public PipelinePolicy policy() {
        return this.policy;
    }

    /**
     * Set the policy property: Pipeline Policy.
     *
     * @param policy the policy value to set.
     * @return the Pipeline object itself.
     */
    public Pipeline withPolicy(PipelinePolicy policy) {
        this.policy = policy;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (activities() != null) {
            activities().forEach(e -> e.validate());
        }
        if (parameters() != null) {
            parameters()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
        if (variables() != null) {
            variables()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
        if (folder() != null) {
            folder().validate();
        }
        if (policy() != null) {
            policy().validate();
        }
    }
}
