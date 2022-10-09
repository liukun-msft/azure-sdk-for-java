// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Set a patching window during which Windows and SQL patches will be applied. */
@Fluent
public final class AutoPatchingSettings {
    /*
     * Enable or disable autopatching on SQL virtual machine.
     */
    @JsonProperty(value = "enable")
    private Boolean enable;

    /*
     * Day of week to apply the patch on.
     */
    @JsonProperty(value = "dayOfWeek")
    private DayOfWeek dayOfWeek;

    /*
     * Hour of the day when patching is initiated. Local VM time.
     */
    @JsonProperty(value = "maintenanceWindowStartingHour")
    private Integer maintenanceWindowStartingHour;

    /*
     * Duration of patching.
     */
    @JsonProperty(value = "maintenanceWindowDuration")
    private Integer maintenanceWindowDuration;

    /**
     * Get the enable property: Enable or disable autopatching on SQL virtual machine.
     *
     * @return the enable value.
     */
    public Boolean enable() {
        return this.enable;
    }

    /**
     * Set the enable property: Enable or disable autopatching on SQL virtual machine.
     *
     * @param enable the enable value to set.
     * @return the AutoPatchingSettings object itself.
     */
    public AutoPatchingSettings withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * Get the dayOfWeek property: Day of week to apply the patch on.
     *
     * @return the dayOfWeek value.
     */
    public DayOfWeek dayOfWeek() {
        return this.dayOfWeek;
    }

    /**
     * Set the dayOfWeek property: Day of week to apply the patch on.
     *
     * @param dayOfWeek the dayOfWeek value to set.
     * @return the AutoPatchingSettings object itself.
     */
    public AutoPatchingSettings withDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
        return this;
    }

    /**
     * Get the maintenanceWindowStartingHour property: Hour of the day when patching is initiated. Local VM time.
     *
     * @return the maintenanceWindowStartingHour value.
     */
    public Integer maintenanceWindowStartingHour() {
        return this.maintenanceWindowStartingHour;
    }

    /**
     * Set the maintenanceWindowStartingHour property: Hour of the day when patching is initiated. Local VM time.
     *
     * @param maintenanceWindowStartingHour the maintenanceWindowStartingHour value to set.
     * @return the AutoPatchingSettings object itself.
     */
    public AutoPatchingSettings withMaintenanceWindowStartingHour(Integer maintenanceWindowStartingHour) {
        this.maintenanceWindowStartingHour = maintenanceWindowStartingHour;
        return this;
    }

    /**
     * Get the maintenanceWindowDuration property: Duration of patching.
     *
     * @return the maintenanceWindowDuration value.
     */
    public Integer maintenanceWindowDuration() {
        return this.maintenanceWindowDuration;
    }

    /**
     * Set the maintenanceWindowDuration property: Duration of patching.
     *
     * @param maintenanceWindowDuration the maintenanceWindowDuration value to set.
     * @return the AutoPatchingSettings object itself.
     */
    public AutoPatchingSettings withMaintenanceWindowDuration(Integer maintenanceWindowDuration) {
        this.maintenanceWindowDuration = maintenanceWindowDuration;
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
