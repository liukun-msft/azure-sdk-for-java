// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** conversation. */
@Fluent
public final class MicrosoftGraphConversation extends MicrosoftGraphEntity {
    /*
     * Indicates whether any of the posts within this Conversation has at least one attachment.
     */
    @JsonProperty(value = "hasAttachments")
    private Boolean hasAttachments;

    /*
     * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For
     * example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
     */
    @JsonProperty(value = "lastDeliveredDateTime")
    private OffsetDateTime lastDeliveredDateTime;

    /*
     * A short summary from the body of the latest post in this converstaion.
     */
    @JsonProperty(value = "preview")
    private String preview;

    /*
     * The topic of the conversation. This property can be set when the conversation is created, but it cannot be
     * updated.
     */
    @JsonProperty(value = "topic")
    private String topic;

    /*
     * All the users that sent a message to this Conversation.
     */
    @JsonProperty(value = "uniqueSenders")
    private List<String> uniqueSenders;

    /*
     * A collection of all the conversation threads in the conversation. A navigation property. Read-only. Nullable.
     */
    @JsonProperty(value = "threads")
    private List<MicrosoftGraphConversationThread> threads;

    /*
     * conversation
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /** Creates an instance of MicrosoftGraphConversation class. */
    public MicrosoftGraphConversation() {
    }

    /**
     * Get the hasAttachments property: Indicates whether any of the posts within this Conversation has at least one
     * attachment.
     *
     * @return the hasAttachments value.
     */
    public Boolean hasAttachments() {
        return this.hasAttachments;
    }

    /**
     * Set the hasAttachments property: Indicates whether any of the posts within this Conversation has at least one
     * attachment.
     *
     * @param hasAttachments the hasAttachments value to set.
     * @return the MicrosoftGraphConversation object itself.
     */
    public MicrosoftGraphConversation withHasAttachments(Boolean hasAttachments) {
        this.hasAttachments = hasAttachments;
        return this;
    }

    /**
     * Get the lastDeliveredDateTime property: The Timestamp type represents date and time information using ISO 8601
     * format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this:
     * '2014-01-01T00:00:00Z'.
     *
     * @return the lastDeliveredDateTime value.
     */
    public OffsetDateTime lastDeliveredDateTime() {
        return this.lastDeliveredDateTime;
    }

    /**
     * Set the lastDeliveredDateTime property: The Timestamp type represents date and time information using ISO 8601
     * format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this:
     * '2014-01-01T00:00:00Z'.
     *
     * @param lastDeliveredDateTime the lastDeliveredDateTime value to set.
     * @return the MicrosoftGraphConversation object itself.
     */
    public MicrosoftGraphConversation withLastDeliveredDateTime(OffsetDateTime lastDeliveredDateTime) {
        this.lastDeliveredDateTime = lastDeliveredDateTime;
        return this;
    }

    /**
     * Get the preview property: A short summary from the body of the latest post in this converstaion.
     *
     * @return the preview value.
     */
    public String preview() {
        return this.preview;
    }

    /**
     * Set the preview property: A short summary from the body of the latest post in this converstaion.
     *
     * @param preview the preview value to set.
     * @return the MicrosoftGraphConversation object itself.
     */
    public MicrosoftGraphConversation withPreview(String preview) {
        this.preview = preview;
        return this;
    }

    /**
     * Get the topic property: The topic of the conversation. This property can be set when the conversation is created,
     * but it cannot be updated.
     *
     * @return the topic value.
     */
    public String topic() {
        return this.topic;
    }

    /**
     * Set the topic property: The topic of the conversation. This property can be set when the conversation is created,
     * but it cannot be updated.
     *
     * @param topic the topic value to set.
     * @return the MicrosoftGraphConversation object itself.
     */
    public MicrosoftGraphConversation withTopic(String topic) {
        this.topic = topic;
        return this;
    }

    /**
     * Get the uniqueSenders property: All the users that sent a message to this Conversation.
     *
     * @return the uniqueSenders value.
     */
    public List<String> uniqueSenders() {
        return this.uniqueSenders;
    }

    /**
     * Set the uniqueSenders property: All the users that sent a message to this Conversation.
     *
     * @param uniqueSenders the uniqueSenders value to set.
     * @return the MicrosoftGraphConversation object itself.
     */
    public MicrosoftGraphConversation withUniqueSenders(List<String> uniqueSenders) {
        this.uniqueSenders = uniqueSenders;
        return this;
    }

    /**
     * Get the threads property: A collection of all the conversation threads in the conversation. A navigation
     * property. Read-only. Nullable.
     *
     * @return the threads value.
     */
    public List<MicrosoftGraphConversationThread> threads() {
        return this.threads;
    }

    /**
     * Set the threads property: A collection of all the conversation threads in the conversation. A navigation
     * property. Read-only. Nullable.
     *
     * @param threads the threads value to set.
     * @return the MicrosoftGraphConversation object itself.
     */
    public MicrosoftGraphConversation withThreads(List<MicrosoftGraphConversationThread> threads) {
        this.threads = threads;
        return this;
    }

    /**
     * Get the additionalProperties property: conversation.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: conversation.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphConversation object itself.
     */
    public MicrosoftGraphConversation withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphConversation withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (threads() != null) {
            threads().forEach(e -> e.validate());
        }
    }
}
