// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.weather.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Wind details being returned including speed and direction. */
@Fluent
public final class WindDetails {
    /*
     * Wind direction
     */
    @JsonProperty(value = "direction")
    private WindDirection direction;

    /*
     * Speed of the wind in specified unit.
     */
    @JsonProperty(value = "speed")
    private WeatherUnitDetails speed;

    /** Set default WindDetails constructor to private */
    private WindDetails() {}

    /**
     * Get the direction property: Wind direction.
     *
     * @return the direction value.
     */
    public WindDirection getDirection() {
        return this.direction;
    }

    /**
     * Get the speed property: Speed of the wind in specified unit.
     *
     * @return the speed value.
     */
    public WeatherUnitDetails getSpeed() {
        return this.speed;
    }
}
