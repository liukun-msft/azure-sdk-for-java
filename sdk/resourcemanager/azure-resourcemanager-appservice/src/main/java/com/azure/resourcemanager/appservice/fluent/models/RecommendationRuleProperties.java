// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.models.Channels;
import com.azure.resourcemanager.appservice.models.NotificationLevel;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.UUID;

/** RecommendationRule resource specific properties. */
@Fluent
public final class RecommendationRuleProperties {
    /*
     * Unique name of the rule.
     */
    @JsonProperty(value = "recommendationName")
    private String recommendationName;

    /*
     * UI friendly name of the rule.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * Localized name of the rule (Good for UI).
     */
    @JsonProperty(value = "message")
    private String message;

    /*
     * Recommendation ID of an associated recommendation object tied to the
     * rule, if exists.
     * If such an object doesn't exist, it is set to null.
     */
    @JsonProperty(value = "recommendationId")
    private UUID recommendationId;

    /*
     * Localized detailed description of the rule.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Name of action that is recommended by this rule in string.
     */
    @JsonProperty(value = "actionName")
    private String actionName;

    /*
     * Level of impact indicating how critical this rule is.
     */
    @JsonProperty(value = "level")
    private NotificationLevel level;

    /*
     * List of available channels that this rule applies.
     */
    @JsonProperty(value = "channels")
    private Channels channels;

    /*
     * The list of category tags that this recommendation rule belongs to.
     */
    @JsonProperty(value = "categoryTags", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> categoryTags;

    /*
     * True if this is associated with a dynamically added rule
     */
    @JsonProperty(value = "isDynamic")
    private Boolean isDynamic;

    /*
     * Extension name of the portal if exists. Applicable to dynamic rule only.
     */
    @JsonProperty(value = "extensionName")
    private String extensionName;

    /*
     * Deep link to a blade on the portal. Applicable to dynamic rule only.
     */
    @JsonProperty(value = "bladeName")
    private String bladeName;

    /*
     * Forward link to an external document associated with the rule.
     * Applicable to dynamic rule only.
     */
    @JsonProperty(value = "forwardLink")
    private String forwardLink;

    /**
     * Get the recommendationName property: Unique name of the rule.
     *
     * @return the recommendationName value.
     */
    public String recommendationName() {
        return this.recommendationName;
    }

    /**
     * Set the recommendationName property: Unique name of the rule.
     *
     * @param recommendationName the recommendationName value to set.
     * @return the RecommendationRuleProperties object itself.
     */
    public RecommendationRuleProperties withRecommendationName(String recommendationName) {
        this.recommendationName = recommendationName;
        return this;
    }

    /**
     * Get the displayName property: UI friendly name of the rule.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: UI friendly name of the rule.
     *
     * @param displayName the displayName value to set.
     * @return the RecommendationRuleProperties object itself.
     */
    public RecommendationRuleProperties withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the message property: Localized name of the rule (Good for UI).
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: Localized name of the rule (Good for UI).
     *
     * @param message the message value to set.
     * @return the RecommendationRuleProperties object itself.
     */
    public RecommendationRuleProperties withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the recommendationId property: Recommendation ID of an associated recommendation object tied to the rule, if
     * exists. If such an object doesn't exist, it is set to null.
     *
     * @return the recommendationId value.
     */
    public UUID recommendationId() {
        return this.recommendationId;
    }

    /**
     * Set the recommendationId property: Recommendation ID of an associated recommendation object tied to the rule, if
     * exists. If such an object doesn't exist, it is set to null.
     *
     * @param recommendationId the recommendationId value to set.
     * @return the RecommendationRuleProperties object itself.
     */
    public RecommendationRuleProperties withRecommendationId(UUID recommendationId) {
        this.recommendationId = recommendationId;
        return this;
    }

    /**
     * Get the description property: Localized detailed description of the rule.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Localized detailed description of the rule.
     *
     * @param description the description value to set.
     * @return the RecommendationRuleProperties object itself.
     */
    public RecommendationRuleProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the actionName property: Name of action that is recommended by this rule in string.
     *
     * @return the actionName value.
     */
    public String actionName() {
        return this.actionName;
    }

    /**
     * Set the actionName property: Name of action that is recommended by this rule in string.
     *
     * @param actionName the actionName value to set.
     * @return the RecommendationRuleProperties object itself.
     */
    public RecommendationRuleProperties withActionName(String actionName) {
        this.actionName = actionName;
        return this;
    }

    /**
     * Get the level property: Level of impact indicating how critical this rule is.
     *
     * @return the level value.
     */
    public NotificationLevel level() {
        return this.level;
    }

    /**
     * Set the level property: Level of impact indicating how critical this rule is.
     *
     * @param level the level value to set.
     * @return the RecommendationRuleProperties object itself.
     */
    public RecommendationRuleProperties withLevel(NotificationLevel level) {
        this.level = level;
        return this;
    }

    /**
     * Get the channels property: List of available channels that this rule applies.
     *
     * @return the channels value.
     */
    public Channels channels() {
        return this.channels;
    }

    /**
     * Set the channels property: List of available channels that this rule applies.
     *
     * @param channels the channels value to set.
     * @return the RecommendationRuleProperties object itself.
     */
    public RecommendationRuleProperties withChannels(Channels channels) {
        this.channels = channels;
        return this;
    }

    /**
     * Get the categoryTags property: The list of category tags that this recommendation rule belongs to.
     *
     * @return the categoryTags value.
     */
    public List<String> categoryTags() {
        return this.categoryTags;
    }

    /**
     * Get the isDynamic property: True if this is associated with a dynamically added rule.
     *
     * @return the isDynamic value.
     */
    public Boolean isDynamic() {
        return this.isDynamic;
    }

    /**
     * Set the isDynamic property: True if this is associated with a dynamically added rule.
     *
     * @param isDynamic the isDynamic value to set.
     * @return the RecommendationRuleProperties object itself.
     */
    public RecommendationRuleProperties withIsDynamic(Boolean isDynamic) {
        this.isDynamic = isDynamic;
        return this;
    }

    /**
     * Get the extensionName property: Extension name of the portal if exists. Applicable to dynamic rule only.
     *
     * @return the extensionName value.
     */
    public String extensionName() {
        return this.extensionName;
    }

    /**
     * Set the extensionName property: Extension name of the portal if exists. Applicable to dynamic rule only.
     *
     * @param extensionName the extensionName value to set.
     * @return the RecommendationRuleProperties object itself.
     */
    public RecommendationRuleProperties withExtensionName(String extensionName) {
        this.extensionName = extensionName;
        return this;
    }

    /**
     * Get the bladeName property: Deep link to a blade on the portal. Applicable to dynamic rule only.
     *
     * @return the bladeName value.
     */
    public String bladeName() {
        return this.bladeName;
    }

    /**
     * Set the bladeName property: Deep link to a blade on the portal. Applicable to dynamic rule only.
     *
     * @param bladeName the bladeName value to set.
     * @return the RecommendationRuleProperties object itself.
     */
    public RecommendationRuleProperties withBladeName(String bladeName) {
        this.bladeName = bladeName;
        return this;
    }

    /**
     * Get the forwardLink property: Forward link to an external document associated with the rule. Applicable to
     * dynamic rule only.
     *
     * @return the forwardLink value.
     */
    public String forwardLink() {
        return this.forwardLink;
    }

    /**
     * Set the forwardLink property: Forward link to an external document associated with the rule. Applicable to
     * dynamic rule only.
     *
     * @param forwardLink the forwardLink value to set.
     * @return the RecommendationRuleProperties object itself.
     */
    public RecommendationRuleProperties withForwardLink(String forwardLink) {
        this.forwardLink = forwardLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
