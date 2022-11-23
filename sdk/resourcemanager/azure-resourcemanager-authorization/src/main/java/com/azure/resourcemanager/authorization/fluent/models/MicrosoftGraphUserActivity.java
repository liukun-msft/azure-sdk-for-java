// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** userActivity. */
@Fluent
public final class MicrosoftGraphUserActivity extends MicrosoftGraphEntity {
    /*
     * Required. URL used to launch the activity in the best native experience represented by the appId. Might launch a
     * web-based app if no native app exists.
     */
    @JsonProperty(value = "activationUrl")
    private String activationUrl;

    /*
     * The activitySourceHost property.
     */
    @JsonProperty(value = "activitySourceHost")
    private String activitySourceHost;

    /*
     * Required. The unique activity ID in the context of the app - supplied by caller and immutable thereafter.
     */
    @JsonProperty(value = "appActivityId")
    private String appActivityId;

    /*
     * Optional. Short text description of the app used to generate the activity for use in cases when the app is not
     * installed on the user’s local device.
     */
    @JsonProperty(value = "appDisplayName")
    private String appDisplayName;

    /*
     * Json
     */
    @JsonProperty(value = "contentInfo")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, Object> contentInfo;

    /*
     * Optional. Used in the event the content can be rendered outside of a native or web-based app experience (for
     * example, a pointer to an item in an RSS feed).
     */
    @JsonProperty(value = "contentUrl")
    private String contentUrl;

    /*
     * Set by the server. DateTime in UTC when the object was created on the server.
     */
    @JsonProperty(value = "createdDateTime")
    private OffsetDateTime createdDateTime;

    /*
     * Set by the server. DateTime in UTC when the object expired on the server.
     */
    @JsonProperty(value = "expirationDateTime")
    private OffsetDateTime expirationDateTime;

    /*
     * Optional. URL used to launch the activity in a web-based app, if available.
     */
    @JsonProperty(value = "fallbackUrl")
    private String fallbackUrl;

    /*
     * Set by the server. DateTime in UTC when the object was modified on the server.
     */
    @JsonProperty(value = "lastModifiedDateTime")
    private OffsetDateTime lastModifiedDateTime;

    /*
     * status
     */
    @JsonProperty(value = "status")
    private MicrosoftGraphStatus status;

    /*
     * Optional. The timezone in which the user's device used to generate the activity was located at activity creation
     * time; values supplied as Olson IDs in order to support cross-platform representation.
     */
    @JsonProperty(value = "userTimezone")
    private String userTimezone;

    /*
     * visualInfo
     */
    @JsonProperty(value = "visualElements")
    private MicrosoftGraphVisualInfo visualElements;

    /*
     * Optional. NavigationProperty/Containment; navigation property to the activity's historyItems.
     */
    @JsonProperty(value = "historyItems")
    private List<MicrosoftGraphActivityHistoryItem> historyItems;

    /*
     * userActivity
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /** Creates an instance of MicrosoftGraphUserActivity class. */
    public MicrosoftGraphUserActivity() {
    }

    /**
     * Get the activationUrl property: Required. URL used to launch the activity in the best native experience
     * represented by the appId. Might launch a web-based app if no native app exists.
     *
     * @return the activationUrl value.
     */
    public String activationUrl() {
        return this.activationUrl;
    }

    /**
     * Set the activationUrl property: Required. URL used to launch the activity in the best native experience
     * represented by the appId. Might launch a web-based app if no native app exists.
     *
     * @param activationUrl the activationUrl value to set.
     * @return the MicrosoftGraphUserActivity object itself.
     */
    public MicrosoftGraphUserActivity withActivationUrl(String activationUrl) {
        this.activationUrl = activationUrl;
        return this;
    }

    /**
     * Get the activitySourceHost property: The activitySourceHost property.
     *
     * @return the activitySourceHost value.
     */
    public String activitySourceHost() {
        return this.activitySourceHost;
    }

    /**
     * Set the activitySourceHost property: The activitySourceHost property.
     *
     * @param activitySourceHost the activitySourceHost value to set.
     * @return the MicrosoftGraphUserActivity object itself.
     */
    public MicrosoftGraphUserActivity withActivitySourceHost(String activitySourceHost) {
        this.activitySourceHost = activitySourceHost;
        return this;
    }

    /**
     * Get the appActivityId property: Required. The unique activity ID in the context of the app - supplied by caller
     * and immutable thereafter.
     *
     * @return the appActivityId value.
     */
    public String appActivityId() {
        return this.appActivityId;
    }

    /**
     * Set the appActivityId property: Required. The unique activity ID in the context of the app - supplied by caller
     * and immutable thereafter.
     *
     * @param appActivityId the appActivityId value to set.
     * @return the MicrosoftGraphUserActivity object itself.
     */
    public MicrosoftGraphUserActivity withAppActivityId(String appActivityId) {
        this.appActivityId = appActivityId;
        return this;
    }

    /**
     * Get the appDisplayName property: Optional. Short text description of the app used to generate the activity for
     * use in cases when the app is not installed on the user’s local device.
     *
     * @return the appDisplayName value.
     */
    public String appDisplayName() {
        return this.appDisplayName;
    }

    /**
     * Set the appDisplayName property: Optional. Short text description of the app used to generate the activity for
     * use in cases when the app is not installed on the user’s local device.
     *
     * @param appDisplayName the appDisplayName value to set.
     * @return the MicrosoftGraphUserActivity object itself.
     */
    public MicrosoftGraphUserActivity withAppDisplayName(String appDisplayName) {
        this.appDisplayName = appDisplayName;
        return this;
    }

    /**
     * Get the contentInfo property: Json.
     *
     * @return the contentInfo value.
     */
    public Map<String, Object> contentInfo() {
        return this.contentInfo;
    }

    /**
     * Set the contentInfo property: Json.
     *
     * @param contentInfo the contentInfo value to set.
     * @return the MicrosoftGraphUserActivity object itself.
     */
    public MicrosoftGraphUserActivity withContentInfo(Map<String, Object> contentInfo) {
        this.contentInfo = contentInfo;
        return this;
    }

    /**
     * Get the contentUrl property: Optional. Used in the event the content can be rendered outside of a native or
     * web-based app experience (for example, a pointer to an item in an RSS feed).
     *
     * @return the contentUrl value.
     */
    public String contentUrl() {
        return this.contentUrl;
    }

    /**
     * Set the contentUrl property: Optional. Used in the event the content can be rendered outside of a native or
     * web-based app experience (for example, a pointer to an item in an RSS feed).
     *
     * @param contentUrl the contentUrl value to set.
     * @return the MicrosoftGraphUserActivity object itself.
     */
    public MicrosoftGraphUserActivity withContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
        return this;
    }

    /**
     * Get the createdDateTime property: Set by the server. DateTime in UTC when the object was created on the server.
     *
     * @return the createdDateTime value.
     */
    public OffsetDateTime createdDateTime() {
        return this.createdDateTime;
    }

    /**
     * Set the createdDateTime property: Set by the server. DateTime in UTC when the object was created on the server.
     *
     * @param createdDateTime the createdDateTime value to set.
     * @return the MicrosoftGraphUserActivity object itself.
     */
    public MicrosoftGraphUserActivity withCreatedDateTime(OffsetDateTime createdDateTime) {
        this.createdDateTime = createdDateTime;
        return this;
    }

    /**
     * Get the expirationDateTime property: Set by the server. DateTime in UTC when the object expired on the server.
     *
     * @return the expirationDateTime value.
     */
    public OffsetDateTime expirationDateTime() {
        return this.expirationDateTime;
    }

    /**
     * Set the expirationDateTime property: Set by the server. DateTime in UTC when the object expired on the server.
     *
     * @param expirationDateTime the expirationDateTime value to set.
     * @return the MicrosoftGraphUserActivity object itself.
     */
    public MicrosoftGraphUserActivity withExpirationDateTime(OffsetDateTime expirationDateTime) {
        this.expirationDateTime = expirationDateTime;
        return this;
    }

    /**
     * Get the fallbackUrl property: Optional. URL used to launch the activity in a web-based app, if available.
     *
     * @return the fallbackUrl value.
     */
    public String fallbackUrl() {
        return this.fallbackUrl;
    }

    /**
     * Set the fallbackUrl property: Optional. URL used to launch the activity in a web-based app, if available.
     *
     * @param fallbackUrl the fallbackUrl value to set.
     * @return the MicrosoftGraphUserActivity object itself.
     */
    public MicrosoftGraphUserActivity withFallbackUrl(String fallbackUrl) {
        this.fallbackUrl = fallbackUrl;
        return this;
    }

    /**
     * Get the lastModifiedDateTime property: Set by the server. DateTime in UTC when the object was modified on the
     * server.
     *
     * @return the lastModifiedDateTime value.
     */
    public OffsetDateTime lastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }

    /**
     * Set the lastModifiedDateTime property: Set by the server. DateTime in UTC when the object was modified on the
     * server.
     *
     * @param lastModifiedDateTime the lastModifiedDateTime value to set.
     * @return the MicrosoftGraphUserActivity object itself.
     */
    public MicrosoftGraphUserActivity withLastModifiedDateTime(OffsetDateTime lastModifiedDateTime) {
        this.lastModifiedDateTime = lastModifiedDateTime;
        return this;
    }

    /**
     * Get the status property: status.
     *
     * @return the status value.
     */
    public MicrosoftGraphStatus status() {
        return this.status;
    }

    /**
     * Set the status property: status.
     *
     * @param status the status value to set.
     * @return the MicrosoftGraphUserActivity object itself.
     */
    public MicrosoftGraphUserActivity withStatus(MicrosoftGraphStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the userTimezone property: Optional. The timezone in which the user's device used to generate the activity
     * was located at activity creation time; values supplied as Olson IDs in order to support cross-platform
     * representation.
     *
     * @return the userTimezone value.
     */
    public String userTimezone() {
        return this.userTimezone;
    }

    /**
     * Set the userTimezone property: Optional. The timezone in which the user's device used to generate the activity
     * was located at activity creation time; values supplied as Olson IDs in order to support cross-platform
     * representation.
     *
     * @param userTimezone the userTimezone value to set.
     * @return the MicrosoftGraphUserActivity object itself.
     */
    public MicrosoftGraphUserActivity withUserTimezone(String userTimezone) {
        this.userTimezone = userTimezone;
        return this;
    }

    /**
     * Get the visualElements property: visualInfo.
     *
     * @return the visualElements value.
     */
    public MicrosoftGraphVisualInfo visualElements() {
        return this.visualElements;
    }

    /**
     * Set the visualElements property: visualInfo.
     *
     * @param visualElements the visualElements value to set.
     * @return the MicrosoftGraphUserActivity object itself.
     */
    public MicrosoftGraphUserActivity withVisualElements(MicrosoftGraphVisualInfo visualElements) {
        this.visualElements = visualElements;
        return this;
    }

    /**
     * Get the historyItems property: Optional. NavigationProperty/Containment; navigation property to the activity's
     * historyItems.
     *
     * @return the historyItems value.
     */
    public List<MicrosoftGraphActivityHistoryItem> historyItems() {
        return this.historyItems;
    }

    /**
     * Set the historyItems property: Optional. NavigationProperty/Containment; navigation property to the activity's
     * historyItems.
     *
     * @param historyItems the historyItems value to set.
     * @return the MicrosoftGraphUserActivity object itself.
     */
    public MicrosoftGraphUserActivity withHistoryItems(List<MicrosoftGraphActivityHistoryItem> historyItems) {
        this.historyItems = historyItems;
        return this;
    }

    /**
     * Get the additionalProperties property: userActivity.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: userActivity.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphUserActivity object itself.
     */
    public MicrosoftGraphUserActivity withAdditionalProperties(Map<String, Object> additionalProperties) {
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
    public MicrosoftGraphUserActivity withId(String id) {
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
        if (visualElements() != null) {
            visualElements().validate();
        }
        if (historyItems() != null) {
            historyItems().forEach(e -> e.validate());
        }
    }
}
