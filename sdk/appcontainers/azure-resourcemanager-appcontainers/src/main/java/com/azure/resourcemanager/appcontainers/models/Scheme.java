// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Scheme to use for connecting to the host. Defaults to HTTP. */
public final class Scheme extends ExpandableStringEnum<Scheme> {
    /** Static value HTTP for Scheme. */
    public static final Scheme HTTP = fromString("HTTP");

    /** Static value HTTPS for Scheme. */
    public static final Scheme HTTPS = fromString("HTTPS");

    /**
     * Creates or finds a Scheme from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Scheme.
     */
    @JsonCreator
    public static Scheme fromString(String name) {
        return fromString(name, Scheme.class);
    }

    /**
     * Gets known Scheme values.
     *
     * @return known Scheme values.
     */
    public static Collection<Scheme> values() {
        return values(Scheme.class);
    }
}
