// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.desktopvirtualization.models.ScalingHostPoolReference;
import com.azure.resourcemanager.desktopvirtualization.models.ScalingSchedule;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Scaling plan properties. */
@Fluent
public final class ScalingPlanPatchProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ScalingPlanPatchProperties.class);

    /*
     * Description of scaling plan.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * User friendly name of scaling plan.
     */
    @JsonProperty(value = "friendlyName")
    private String friendlyName;

    /*
     * Timezone of the scaling plan.
     */
    @JsonProperty(value = "timeZone")
    private String timeZone;

    /*
     * Exclusion tag for scaling plan.
     */
    @JsonProperty(value = "exclusionTag")
    private String exclusionTag;

    /*
     * List of ScalingSchedule definitions.
     */
    @JsonProperty(value = "schedules")
    private List<ScalingSchedule> schedules;

    /*
     * List of ScalingHostPoolReference definitions.
     */
    @JsonProperty(value = "hostPoolReferences")
    private List<ScalingHostPoolReference> hostPoolReferences;

    /**
     * Get the description property: Description of scaling plan.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Description of scaling plan.
     *
     * @param description the description value to set.
     * @return the ScalingPlanPatchProperties object itself.
     */
    public ScalingPlanPatchProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the friendlyName property: User friendly name of scaling plan.
     *
     * @return the friendlyName value.
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set the friendlyName property: User friendly name of scaling plan.
     *
     * @param friendlyName the friendlyName value to set.
     * @return the ScalingPlanPatchProperties object itself.
     */
    public ScalingPlanPatchProperties withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Get the timeZone property: Timezone of the scaling plan.
     *
     * @return the timeZone value.
     */
    public String timeZone() {
        return this.timeZone;
    }

    /**
     * Set the timeZone property: Timezone of the scaling plan.
     *
     * @param timeZone the timeZone value to set.
     * @return the ScalingPlanPatchProperties object itself.
     */
    public ScalingPlanPatchProperties withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /**
     * Get the exclusionTag property: Exclusion tag for scaling plan.
     *
     * @return the exclusionTag value.
     */
    public String exclusionTag() {
        return this.exclusionTag;
    }

    /**
     * Set the exclusionTag property: Exclusion tag for scaling plan.
     *
     * @param exclusionTag the exclusionTag value to set.
     * @return the ScalingPlanPatchProperties object itself.
     */
    public ScalingPlanPatchProperties withExclusionTag(String exclusionTag) {
        this.exclusionTag = exclusionTag;
        return this;
    }

    /**
     * Get the schedules property: List of ScalingSchedule definitions.
     *
     * @return the schedules value.
     */
    public List<ScalingSchedule> schedules() {
        return this.schedules;
    }

    /**
     * Set the schedules property: List of ScalingSchedule definitions.
     *
     * @param schedules the schedules value to set.
     * @return the ScalingPlanPatchProperties object itself.
     */
    public ScalingPlanPatchProperties withSchedules(List<ScalingSchedule> schedules) {
        this.schedules = schedules;
        return this;
    }

    /**
     * Get the hostPoolReferences property: List of ScalingHostPoolReference definitions.
     *
     * @return the hostPoolReferences value.
     */
    public List<ScalingHostPoolReference> hostPoolReferences() {
        return this.hostPoolReferences;
    }

    /**
     * Set the hostPoolReferences property: List of ScalingHostPoolReference definitions.
     *
     * @param hostPoolReferences the hostPoolReferences value to set.
     * @return the ScalingPlanPatchProperties object itself.
     */
    public ScalingPlanPatchProperties withHostPoolReferences(List<ScalingHostPoolReference> hostPoolReferences) {
        this.hostPoolReferences = hostPoolReferences;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (schedules() != null) {
            schedules().forEach(e -> e.validate());
        }
        if (hostPoolReferences() != null) {
            hostPoolReferences().forEach(e -> e.validate());
        }
    }
}
