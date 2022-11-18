// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for EventListenerEndpointDiscriminator. */
public final class EventListenerEndpointDiscriminator extends ExpandableStringEnum<EventListenerEndpointDiscriminator> {
    /** Static value EventHub for EventListenerEndpointDiscriminator. */
    public static final EventListenerEndpointDiscriminator EVENT_HUB = fromString("EventHub");

    /**
     * Creates or finds a EventListenerEndpointDiscriminator from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding EventListenerEndpointDiscriminator.
     */
    @JsonCreator
    public static EventListenerEndpointDiscriminator fromString(String name) {
        return fromString(name, EventListenerEndpointDiscriminator.class);
    }

    /**
     * Gets known EventListenerEndpointDiscriminator values.
     *
     * @return known EventListenerEndpointDiscriminator values.
     */
    public static Collection<EventListenerEndpointDiscriminator> values() {
        return values(EventListenerEndpointDiscriminator.class);
    }
}
