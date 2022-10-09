// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.route.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The GeoJsonMultiPolygonData model. */
@Fluent
public class GeoJsonMultiPolygonData {
    /*
     * Contains a list of valid `GeoJSON Polygon` objects. **Note** that
     * coordinates in GeoJSON are in x, y order (longitude, latitude).
     */
    @JsonProperty(value = "coordinates", required = true)
    private List<List<List<List<Double>>>> coordinates;

    /**
     * Get the coordinates property: Contains a list of valid `GeoJSON Polygon` objects. **Note** that coordinates in
     * GeoJSON are in x, y order (longitude, latitude).
     *
     * @return the coordinates value.
     */
    public List<List<List<List<Double>>>> getCoordinates() {
        return this.coordinates;
    }

    /**
     * Set the coordinates property: Contains a list of valid `GeoJSON Polygon` objects. **Note** that coordinates in
     * GeoJSON are in x, y order (longitude, latitude).
     *
     * @param coordinates the coordinates value to set.
     * @return the GeoJsonMultiPolygonData object itself.
     */
    public GeoJsonMultiPolygonData setCoordinates(List<List<List<List<Double>>>> coordinates) {
        this.coordinates = coordinates;
        return this;
    }
}
