// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The request payload start for call recording operation with call locator. */
@Fluent
public final class StartCallRecordingRequestInternal {
    /*
     * The call locator.
     */
    @JsonProperty(value = "callLocator", required = true)
    private CallLocatorInternal callLocator;

    /*
     * The uri to send notifications to.
     */
    @JsonProperty(value = "recordingStateCallbackUri")
    private String recordingStateCallbackUri;

    /*
     * The content type of call recording.
     */
    @JsonProperty(value = "recordingContentType")
    private RecordingContentInternal recordingContentType;

    /*
     * The channel type of call recording.
     */
    @JsonProperty(value = "recordingChannelType")
    private RecordingChannelInternal recordingChannelType;

    /*
     * The format type of call recording.
     */
    @JsonProperty(value = "recordingFormatType")
    private RecordingFormatInternal recordingFormatType;

    /*
     * The channel affinity of call recording.
     */
    @JsonProperty(value = "channelAffinity")
    private List<ChannelAffinityInternal> channelAffinity;

    /**
     * Get the callLocator property: The call locator.
     *
     * @return the callLocator value.
     */
    public CallLocatorInternal getCallLocator() {
        return this.callLocator;
    }

    /**
     * Set the callLocator property: The call locator.
     *
     * @param callLocator the callLocator value to set.
     * @return the StartCallRecordingRequestInternal object itself.
     */
    public StartCallRecordingRequestInternal setCallLocator(CallLocatorInternal callLocator) {
        this.callLocator = callLocator;
        return this;
    }

    /**
     * Get the recordingStateCallbackUri property: The uri to send notifications to.
     *
     * @return the recordingStateCallbackUri value.
     */
    public String getRecordingStateCallbackUri() {
        return this.recordingStateCallbackUri;
    }

    /**
     * Set the recordingStateCallbackUri property: The uri to send notifications to.
     *
     * @param recordingStateCallbackUri the recordingStateCallbackUri value to set.
     * @return the StartCallRecordingRequestInternal object itself.
     */
    public StartCallRecordingRequestInternal setRecordingStateCallbackUri(String recordingStateCallbackUri) {
        this.recordingStateCallbackUri = recordingStateCallbackUri;
        return this;
    }

    /**
     * Get the recordingContentType property: The content type of call recording.
     *
     * @return the recordingContentType value.
     */
    public RecordingContentInternal getRecordingContentType() {
        return this.recordingContentType;
    }

    /**
     * Set the recordingContentType property: The content type of call recording.
     *
     * @param recordingContentType the recordingContentType value to set.
     * @return the StartCallRecordingRequestInternal object itself.
     */
    public StartCallRecordingRequestInternal setRecordingContentType(RecordingContentInternal recordingContentType) {
        this.recordingContentType = recordingContentType;
        return this;
    }

    /**
     * Get the recordingChannelType property: The channel type of call recording.
     *
     * @return the recordingChannelType value.
     */
    public RecordingChannelInternal getRecordingChannelType() {
        return this.recordingChannelType;
    }

    /**
     * Set the recordingChannelType property: The channel type of call recording.
     *
     * @param recordingChannelType the recordingChannelType value to set.
     * @return the StartCallRecordingRequestInternal object itself.
     */
    public StartCallRecordingRequestInternal setRecordingChannelType(RecordingChannelInternal recordingChannelType) {
        this.recordingChannelType = recordingChannelType;
        return this;
    }

    /**
     * Get the recordingFormatType property: The format type of call recording.
     *
     * @return the recordingFormatType value.
     */
    public RecordingFormatInternal getRecordingFormatType() {
        return this.recordingFormatType;
    }

    /**
     * Set the recordingFormatType property: The format type of call recording.
     *
     * @param recordingFormatType the recordingFormatType value to set.
     * @return the StartCallRecordingRequestInternal object itself.
     */
    public StartCallRecordingRequestInternal setRecordingFormatType(RecordingFormatInternal recordingFormatType) {
        this.recordingFormatType = recordingFormatType;
        return this;
    }

    /**
     * Get the channelAffinity property: The channel affinity of call recording.
     *
     * @return the channelAffinity value.
     */
    public List<ChannelAffinityInternal> getChannelAffinity() {
        return this.channelAffinity;
    }

    /**
     * Set the channelAffinity property: The channel affinity of call recording.
     *
     * @param channelAffinity the channelAffinity value to set.
     * @return the StartCallRecordingRequestInternal object itself.
     */
    public StartCallRecordingRequestInternal setChannelAffinity(List<ChannelAffinityInternal> channelAffinity) {
        this.channelAffinity = channelAffinity;
        return this;
    }
}
