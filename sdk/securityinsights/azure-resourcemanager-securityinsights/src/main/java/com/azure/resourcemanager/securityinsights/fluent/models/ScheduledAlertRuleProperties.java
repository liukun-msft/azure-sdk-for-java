// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.securityinsights.models.AlertDetailsOverride;
import com.azure.resourcemanager.securityinsights.models.AlertSeverity;
import com.azure.resourcemanager.securityinsights.models.AttackTactic;
import com.azure.resourcemanager.securityinsights.models.EntityMapping;
import com.azure.resourcemanager.securityinsights.models.EventGroupingSettings;
import com.azure.resourcemanager.securityinsights.models.IncidentConfiguration;
import com.azure.resourcemanager.securityinsights.models.ScheduledAlertRuleCommonProperties;
import com.azure.resourcemanager.securityinsights.models.TriggerOperator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** Scheduled alert rule base property bag. */
@Fluent
public final class ScheduledAlertRuleProperties extends ScheduledAlertRuleCommonProperties {
    /*
     * The Name of the alert rule template used to create this rule.
     */
    @JsonProperty(value = "alertRuleTemplateName")
    private String alertRuleTemplateName;

    /*
     * The version of the alert rule template used to create this rule - in format <a.b.c>, where all are numbers, for
     * example 0 <1.0.2>
     */
    @JsonProperty(value = "templateVersion")
    private String templateVersion;

    /*
     * The description of the alert rule.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The display name for alerts created by this alert rule.
     */
    @JsonProperty(value = "displayName", required = true)
    private String displayName;

    /*
     * Determines whether this alert rule is enabled or disabled.
     */
    @JsonProperty(value = "enabled", required = true)
    private boolean enabled;

    /*
     * The last time that this alert rule has been modified.
     */
    @JsonProperty(value = "lastModifiedUtc", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastModifiedUtc;

    /*
     * The suppression (in ISO 8601 duration format) to wait since last time this alert rule been triggered.
     */
    @JsonProperty(value = "suppressionDuration", required = true)
    private Duration suppressionDuration;

    /*
     * Determines whether the suppression for this alert rule is enabled or disabled.
     */
    @JsonProperty(value = "suppressionEnabled", required = true)
    private boolean suppressionEnabled;

    /*
     * The tactics of the alert rule
     */
    @JsonProperty(value = "tactics")
    private List<AttackTactic> tactics;

    /*
     * The techniques of the alert rule
     */
    @JsonProperty(value = "techniques")
    private List<String> techniques;

    /*
     * The settings of the incidents that created from alerts triggered by this analytics rule
     */
    @JsonProperty(value = "incidentConfiguration")
    private IncidentConfiguration incidentConfiguration;

    /**
     * Get the alertRuleTemplateName property: The Name of the alert rule template used to create this rule.
     *
     * @return the alertRuleTemplateName value.
     */
    public String alertRuleTemplateName() {
        return this.alertRuleTemplateName;
    }

    /**
     * Set the alertRuleTemplateName property: The Name of the alert rule template used to create this rule.
     *
     * @param alertRuleTemplateName the alertRuleTemplateName value to set.
     * @return the ScheduledAlertRuleProperties object itself.
     */
    public ScheduledAlertRuleProperties withAlertRuleTemplateName(String alertRuleTemplateName) {
        this.alertRuleTemplateName = alertRuleTemplateName;
        return this;
    }

    /**
     * Get the templateVersion property: The version of the alert rule template used to create this rule - in format
     * &lt;a.b.c&gt;, where all are numbers, for example 0 &lt;1.0.2&gt;.
     *
     * @return the templateVersion value.
     */
    public String templateVersion() {
        return this.templateVersion;
    }

    /**
     * Set the templateVersion property: The version of the alert rule template used to create this rule - in format
     * &lt;a.b.c&gt;, where all are numbers, for example 0 &lt;1.0.2&gt;.
     *
     * @param templateVersion the templateVersion value to set.
     * @return the ScheduledAlertRuleProperties object itself.
     */
    public ScheduledAlertRuleProperties withTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }

    /**
     * Get the description property: The description of the alert rule.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The description of the alert rule.
     *
     * @param description the description value to set.
     * @return the ScheduledAlertRuleProperties object itself.
     */
    public ScheduledAlertRuleProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the displayName property: The display name for alerts created by this alert rule.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The display name for alerts created by this alert rule.
     *
     * @param displayName the displayName value to set.
     * @return the ScheduledAlertRuleProperties object itself.
     */
    public ScheduledAlertRuleProperties withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the enabled property: Determines whether this alert rule is enabled or disabled.
     *
     * @return the enabled value.
     */
    public boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Determines whether this alert rule is enabled or disabled.
     *
     * @param enabled the enabled value to set.
     * @return the ScheduledAlertRuleProperties object itself.
     */
    public ScheduledAlertRuleProperties withEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the lastModifiedUtc property: The last time that this alert rule has been modified.
     *
     * @return the lastModifiedUtc value.
     */
    public OffsetDateTime lastModifiedUtc() {
        return this.lastModifiedUtc;
    }

    /**
     * Get the suppressionDuration property: The suppression (in ISO 8601 duration format) to wait since last time this
     * alert rule been triggered.
     *
     * @return the suppressionDuration value.
     */
    public Duration suppressionDuration() {
        return this.suppressionDuration;
    }

    /**
     * Set the suppressionDuration property: The suppression (in ISO 8601 duration format) to wait since last time this
     * alert rule been triggered.
     *
     * @param suppressionDuration the suppressionDuration value to set.
     * @return the ScheduledAlertRuleProperties object itself.
     */
    public ScheduledAlertRuleProperties withSuppressionDuration(Duration suppressionDuration) {
        this.suppressionDuration = suppressionDuration;
        return this;
    }

    /**
     * Get the suppressionEnabled property: Determines whether the suppression for this alert rule is enabled or
     * disabled.
     *
     * @return the suppressionEnabled value.
     */
    public boolean suppressionEnabled() {
        return this.suppressionEnabled;
    }

    /**
     * Set the suppressionEnabled property: Determines whether the suppression for this alert rule is enabled or
     * disabled.
     *
     * @param suppressionEnabled the suppressionEnabled value to set.
     * @return the ScheduledAlertRuleProperties object itself.
     */
    public ScheduledAlertRuleProperties withSuppressionEnabled(boolean suppressionEnabled) {
        this.suppressionEnabled = suppressionEnabled;
        return this;
    }

    /**
     * Get the tactics property: The tactics of the alert rule.
     *
     * @return the tactics value.
     */
    public List<AttackTactic> tactics() {
        return this.tactics;
    }

    /**
     * Set the tactics property: The tactics of the alert rule.
     *
     * @param tactics the tactics value to set.
     * @return the ScheduledAlertRuleProperties object itself.
     */
    public ScheduledAlertRuleProperties withTactics(List<AttackTactic> tactics) {
        this.tactics = tactics;
        return this;
    }

    /**
     * Get the techniques property: The techniques of the alert rule.
     *
     * @return the techniques value.
     */
    public List<String> techniques() {
        return this.techniques;
    }

    /**
     * Set the techniques property: The techniques of the alert rule.
     *
     * @param techniques the techniques value to set.
     * @return the ScheduledAlertRuleProperties object itself.
     */
    public ScheduledAlertRuleProperties withTechniques(List<String> techniques) {
        this.techniques = techniques;
        return this;
    }

    /**
     * Get the incidentConfiguration property: The settings of the incidents that created from alerts triggered by this
     * analytics rule.
     *
     * @return the incidentConfiguration value.
     */
    public IncidentConfiguration incidentConfiguration() {
        return this.incidentConfiguration;
    }

    /**
     * Set the incidentConfiguration property: The settings of the incidents that created from alerts triggered by this
     * analytics rule.
     *
     * @param incidentConfiguration the incidentConfiguration value to set.
     * @return the ScheduledAlertRuleProperties object itself.
     */
    public ScheduledAlertRuleProperties withIncidentConfiguration(IncidentConfiguration incidentConfiguration) {
        this.incidentConfiguration = incidentConfiguration;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ScheduledAlertRuleProperties withQuery(String query) {
        super.withQuery(query);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ScheduledAlertRuleProperties withQueryFrequency(Duration queryFrequency) {
        super.withQueryFrequency(queryFrequency);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ScheduledAlertRuleProperties withQueryPeriod(Duration queryPeriod) {
        super.withQueryPeriod(queryPeriod);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ScheduledAlertRuleProperties withSeverity(AlertSeverity severity) {
        super.withSeverity(severity);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ScheduledAlertRuleProperties withTriggerOperator(TriggerOperator triggerOperator) {
        super.withTriggerOperator(triggerOperator);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ScheduledAlertRuleProperties withTriggerThreshold(Integer triggerThreshold) {
        super.withTriggerThreshold(triggerThreshold);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ScheduledAlertRuleProperties withEventGroupingSettings(EventGroupingSettings eventGroupingSettings) {
        super.withEventGroupingSettings(eventGroupingSettings);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ScheduledAlertRuleProperties withCustomDetails(Map<String, String> customDetails) {
        super.withCustomDetails(customDetails);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ScheduledAlertRuleProperties withEntityMappings(List<EntityMapping> entityMappings) {
        super.withEntityMappings(entityMappings);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ScheduledAlertRuleProperties withAlertDetailsOverride(AlertDetailsOverride alertDetailsOverride) {
        super.withAlertDetailsOverride(alertDetailsOverride);
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
        if (displayName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property displayName in model ScheduledAlertRuleProperties"));
        }
        if (suppressionDuration() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property suppressionDuration in model ScheduledAlertRuleProperties"));
        }
        if (incidentConfiguration() != null) {
            incidentConfiguration().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ScheduledAlertRuleProperties.class);
}
