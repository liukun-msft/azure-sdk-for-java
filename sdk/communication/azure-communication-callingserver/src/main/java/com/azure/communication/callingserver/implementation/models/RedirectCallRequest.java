// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callingserver.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The request payload for redirecting the call. */
@Fluent
public final class RedirectCallRequest {
    /*
     * The context associated with the call.
     */
    @JsonProperty(value = "incomingCallContext", required = true)
    private String incomingCallContext;

    /*
     * The target identity to redirect the call to.
     */
    @JsonProperty(value = "targets", required = true)
    private List<CommunicationIdentifierModel> targets;

    /*
     * The callback uri.
     */
    @JsonProperty(value = "callbackUri")
    private String callbackUri;

    /*
     * The timeout for the redirect in seconds.
     */
    @JsonProperty(value = "timeoutInSeconds")
    private Integer timeoutInSeconds;

    /**
     * Get the incomingCallContext property: The context associated with the call.
     *
     * @return the incomingCallContext value.
     */
    public String getIncomingCallContext() {
        return this.incomingCallContext;
    }

    /**
     * Set the incomingCallContext property: The context associated with the call.
     *
     * @param incomingCallContext the incomingCallContext value to set.
     * @return the RedirectCallRequest object itself.
     */
    public RedirectCallRequest setIncomingCallContext(String incomingCallContext) {
        this.incomingCallContext = incomingCallContext;
        return this;
    }

    /**
     * Get the targets property: The target identity to redirect the call to.
     *
     * @return the targets value.
     */
    public List<CommunicationIdentifierModel> getTargets() {
        return this.targets;
    }

    /**
     * Set the targets property: The target identity to redirect the call to.
     *
     * @param targets the targets value to set.
     * @return the RedirectCallRequest object itself.
     */
    public RedirectCallRequest setTargets(List<CommunicationIdentifierModel> targets) {
        this.targets = targets;
        return this;
    }

    /**
     * Get the callbackUri property: The callback uri.
     *
     * @return the callbackUri value.
     */
    public String getCallbackUri() {
        return this.callbackUri;
    }

    /**
     * Set the callbackUri property: The callback uri.
     *
     * @param callbackUri the callbackUri value to set.
     * @return the RedirectCallRequest object itself.
     */
    public RedirectCallRequest setCallbackUri(String callbackUri) {
        this.callbackUri = callbackUri;
        return this;
    }

    /**
     * Get the timeoutInSeconds property: The timeout for the redirect in seconds.
     *
     * @return the timeoutInSeconds value.
     */
    public Integer getTimeoutInSeconds() {
        return this.timeoutInSeconds;
    }

    /**
     * Set the timeoutInSeconds property: The timeout for the redirect in seconds.
     *
     * @param timeoutInSeconds the timeoutInSeconds value to set.
     * @return the RedirectCallRequest object itself.
     */
    public RedirectCallRequest setTimeoutInSeconds(Integer timeoutInSeconds) {
        this.timeoutInSeconds = timeoutInSeconds;
        return this;
    }
}
