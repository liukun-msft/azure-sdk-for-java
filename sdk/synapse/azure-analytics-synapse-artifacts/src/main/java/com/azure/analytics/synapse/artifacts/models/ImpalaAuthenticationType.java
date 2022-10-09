// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The authentication type to use. */
public final class ImpalaAuthenticationType extends ExpandableStringEnum<ImpalaAuthenticationType> {
    /** Static value Anonymous for ImpalaAuthenticationType. */
    public static final ImpalaAuthenticationType ANONYMOUS = fromString("Anonymous");

    /** Static value SASLUsername for ImpalaAuthenticationType. */
    public static final ImpalaAuthenticationType SASL_USERNAME = fromString("SASLUsername");

    /** Static value UsernameAndPassword for ImpalaAuthenticationType. */
    public static final ImpalaAuthenticationType USERNAME_AND_PASSWORD = fromString("UsernameAndPassword");

    /**
     * Creates or finds a ImpalaAuthenticationType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ImpalaAuthenticationType.
     */
    @JsonCreator
    public static ImpalaAuthenticationType fromString(String name) {
        return fromString(name, ImpalaAuthenticationType.class);
    }

    /**
     * Gets known ImpalaAuthenticationType values.
     *
     * @return known ImpalaAuthenticationType values.
     */
    public static Collection<ImpalaAuthenticationType> values() {
        return values(ImpalaAuthenticationType.class);
    }
}
