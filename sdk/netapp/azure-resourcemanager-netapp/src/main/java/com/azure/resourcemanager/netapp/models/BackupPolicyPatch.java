// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.netapp.fluent.models.BackupPolicyProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Backup policy Details for create and update. */
@Fluent
public final class BackupPolicyPatch extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BackupPolicyPatch.class);

    /*
     * Backup policy Properties
     */
    @JsonProperty(value = "properties")
    private BackupPolicyProperties innerProperties;

    /**
     * Get the innerProperties property: Backup policy Properties.
     *
     * @return the innerProperties value.
     */
    private BackupPolicyProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public BackupPolicyPatch withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public BackupPolicyPatch withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the backupPolicyId property: Backup Policy Resource ID.
     *
     * @return the backupPolicyId value.
     */
    public String backupPolicyId() {
        return this.innerProperties() == null ? null : this.innerProperties().backupPolicyId();
    }

    /**
     * Get the provisioningState property: Azure lifecycle management.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the dailyBackupsToKeep property: Daily backups count to keep.
     *
     * @return the dailyBackupsToKeep value.
     */
    public Integer dailyBackupsToKeep() {
        return this.innerProperties() == null ? null : this.innerProperties().dailyBackupsToKeep();
    }

    /**
     * Set the dailyBackupsToKeep property: Daily backups count to keep.
     *
     * @param dailyBackupsToKeep the dailyBackupsToKeep value to set.
     * @return the BackupPolicyPatch object itself.
     */
    public BackupPolicyPatch withDailyBackupsToKeep(Integer dailyBackupsToKeep) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BackupPolicyProperties();
        }
        this.innerProperties().withDailyBackupsToKeep(dailyBackupsToKeep);
        return this;
    }

    /**
     * Get the weeklyBackupsToKeep property: Weekly backups count to keep.
     *
     * @return the weeklyBackupsToKeep value.
     */
    public Integer weeklyBackupsToKeep() {
        return this.innerProperties() == null ? null : this.innerProperties().weeklyBackupsToKeep();
    }

    /**
     * Set the weeklyBackupsToKeep property: Weekly backups count to keep.
     *
     * @param weeklyBackupsToKeep the weeklyBackupsToKeep value to set.
     * @return the BackupPolicyPatch object itself.
     */
    public BackupPolicyPatch withWeeklyBackupsToKeep(Integer weeklyBackupsToKeep) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BackupPolicyProperties();
        }
        this.innerProperties().withWeeklyBackupsToKeep(weeklyBackupsToKeep);
        return this;
    }

    /**
     * Get the monthlyBackupsToKeep property: Monthly backups count to keep.
     *
     * @return the monthlyBackupsToKeep value.
     */
    public Integer monthlyBackupsToKeep() {
        return this.innerProperties() == null ? null : this.innerProperties().monthlyBackupsToKeep();
    }

    /**
     * Set the monthlyBackupsToKeep property: Monthly backups count to keep.
     *
     * @param monthlyBackupsToKeep the monthlyBackupsToKeep value to set.
     * @return the BackupPolicyPatch object itself.
     */
    public BackupPolicyPatch withMonthlyBackupsToKeep(Integer monthlyBackupsToKeep) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BackupPolicyProperties();
        }
        this.innerProperties().withMonthlyBackupsToKeep(monthlyBackupsToKeep);
        return this;
    }

    /**
     * Get the volumesAssigned property: Volumes using current backup policy.
     *
     * @return the volumesAssigned value.
     */
    public Integer volumesAssigned() {
        return this.innerProperties() == null ? null : this.innerProperties().volumesAssigned();
    }

    /**
     * Get the enabled property: The property to decide policy is enabled or not.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.innerProperties() == null ? null : this.innerProperties().enabled();
    }

    /**
     * Set the enabled property: The property to decide policy is enabled or not.
     *
     * @param enabled the enabled value to set.
     * @return the BackupPolicyPatch object itself.
     */
    public BackupPolicyPatch withEnabled(Boolean enabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BackupPolicyProperties();
        }
        this.innerProperties().withEnabled(enabled);
        return this;
    }

    /**
     * Get the volumeBackups property: A list of volumes assigned to this policy.
     *
     * @return the volumeBackups value.
     */
    public List<VolumeBackups> volumeBackups() {
        return this.innerProperties() == null ? null : this.innerProperties().volumeBackups();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
