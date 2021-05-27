// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callingserver.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for EventSubscriptionTypeModel. */
public final class EventSubscriptionTypeModel extends ExpandableStringEnum<EventSubscriptionTypeModel> {
    /** Static value participantsUpdated for EventSubscriptionTypeModel. */
    public static final EventSubscriptionTypeModel PARTICIPANTS_UPDATED = fromString("participantsUpdated");

    /** Static value dtmfReceived for EventSubscriptionTypeModel. */
    public static final EventSubscriptionTypeModel DTMF_RECEIVED = fromString("dtmfReceived");

    /**
     * Creates or finds a EventSubscriptionTypeModel from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding EventSubscriptionTypeModel.
     */
    @JsonCreator
    public static EventSubscriptionTypeModel fromString(String name) {
        return fromString(name, EventSubscriptionTypeModel.class);
    }

    /** @return known EventSubscriptionTypeModel values. */
    public static Collection<EventSubscriptionTypeModel> values() {
        return values(EventSubscriptionTypeModel.class);
    }
}
