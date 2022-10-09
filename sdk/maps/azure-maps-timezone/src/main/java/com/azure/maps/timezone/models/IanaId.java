// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.timezone.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The IanaId model. */
@Immutable
public final class IanaId {
    /*
     * Id property
     */
    @JsonProperty(value = "Id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * IsAlias property
     */
    @JsonProperty(value = "IsAlias", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isAlias;

    /*
     * AliasOf property
     */
    @JsonProperty(value = "AliasOf", access = JsonProperty.Access.WRITE_ONLY)
    private String aliasOf;

    /*
     * This attribute returns `True` if the IanaId has any country/zone
     * associated with it.
     */
    @JsonProperty(value = "HasZone1970Location", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean hasZone1970Location;

    /** Set default IanaId constructor to private */
    private IanaId() {}

    /**
     * Get the id property: Id property.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Get the isAlias property: IsAlias property.
     *
     * @return the isAlias value.
     */
    public Boolean isAlias() {
        return this.isAlias;
    }

    /**
     * Get the aliasOf property: AliasOf property.
     *
     * @return the aliasOf value.
     */
    public String getAlias() {
        return this.aliasOf;
    }

    /**
     * Get the hasZone1970Location property: This attribute returns `True` if the IanaId has any country/zone associated
     * with it.
     *
     * @return the hasZone1970Location value.
     */
    public Boolean getHasZone1970Location() {
        return this.hasZone1970Location;
    }
}
