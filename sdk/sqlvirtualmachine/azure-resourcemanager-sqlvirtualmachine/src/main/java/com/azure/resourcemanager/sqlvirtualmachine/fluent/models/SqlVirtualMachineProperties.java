// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.sqlvirtualmachine.models.AssessmentSettings;
import com.azure.resourcemanager.sqlvirtualmachine.models.AutoBackupSettings;
import com.azure.resourcemanager.sqlvirtualmachine.models.AutoPatchingSettings;
import com.azure.resourcemanager.sqlvirtualmachine.models.KeyVaultCredentialSettings;
import com.azure.resourcemanager.sqlvirtualmachine.models.LeastPrivilegeMode;
import com.azure.resourcemanager.sqlvirtualmachine.models.ServerConfigurationsManagementSettings;
import com.azure.resourcemanager.sqlvirtualmachine.models.SqlImageSku;
import com.azure.resourcemanager.sqlvirtualmachine.models.SqlManagementMode;
import com.azure.resourcemanager.sqlvirtualmachine.models.SqlServerLicenseType;
import com.azure.resourcemanager.sqlvirtualmachine.models.StorageConfigurationSettings;
import com.azure.resourcemanager.sqlvirtualmachine.models.WsfcDomainCredentials;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The SQL virtual machine properties. */
@Fluent
public final class SqlVirtualMachineProperties {
    /*
     * ARM Resource id of underlying virtual machine created from SQL marketplace image.
     */
    @JsonProperty(value = "virtualMachineResourceId")
    private String virtualMachineResourceId;

    /*
     * Provisioning state to track the async operation status.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * SQL image offer. Examples include SQL2016-WS2016, SQL2017-WS2016.
     */
    @JsonProperty(value = "sqlImageOffer")
    private String sqlImageOffer;

    /*
     * SQL Server license type.
     */
    @JsonProperty(value = "sqlServerLicenseType")
    private SqlServerLicenseType sqlServerLicenseType;

    /*
     * SQL Server Management type.
     */
    @JsonProperty(value = "sqlManagement")
    private SqlManagementMode sqlManagement;

    /*
     * SQL IaaS Agent least privilege mode.
     */
    @JsonProperty(value = "leastPrivilegeMode")
    private LeastPrivilegeMode leastPrivilegeMode;

    /*
     * SQL Server edition type.
     */
    @JsonProperty(value = "sqlImageSku")
    private SqlImageSku sqlImageSku;

    /*
     * ARM resource id of the SQL virtual machine group this SQL virtual machine is or will be part of.
     */
    @JsonProperty(value = "sqlVirtualMachineGroupResourceId")
    private String sqlVirtualMachineGroupResourceId;

    /*
     * Domain credentials for setting up Windows Server Failover Cluster for SQL availability group.
     */
    @JsonProperty(value = "wsfcDomainCredentials")
    private WsfcDomainCredentials wsfcDomainCredentials;

    /*
     * Domain credentials for setting up Windows Server Failover Cluster for SQL availability group.
     */
    @JsonProperty(value = "wsfcStaticIp")
    private String wsfcStaticIp;

    /*
     * Auto patching settings for applying critical security updates to SQL virtual machine.
     */
    @JsonProperty(value = "autoPatchingSettings")
    private AutoPatchingSettings autoPatchingSettings;

    /*
     * Auto backup settings for SQL Server.
     */
    @JsonProperty(value = "autoBackupSettings")
    private AutoBackupSettings autoBackupSettings;

    /*
     * Key vault credential settings.
     */
    @JsonProperty(value = "keyVaultCredentialSettings")
    private KeyVaultCredentialSettings keyVaultCredentialSettings;

    /*
     * SQL Server configuration management settings.
     */
    @JsonProperty(value = "serverConfigurationsManagementSettings")
    private ServerConfigurationsManagementSettings serverConfigurationsManagementSettings;

    /*
     * Storage Configuration Settings.
     */
    @JsonProperty(value = "storageConfigurationSettings")
    private StorageConfigurationSettings storageConfigurationSettings;

    /*
     * Assessment Settings.
     */
    @JsonProperty(value = "assessmentSettings")
    private AssessmentSettings assessmentSettings;

    /*
     * Enable automatic upgrade of Sql IaaS extension Agent.
     */
    @JsonProperty(value = "enableAutomaticUpgrade")
    private Boolean enableAutomaticUpgrade;

    /**
     * Get the virtualMachineResourceId property: ARM Resource id of underlying virtual machine created from SQL
     * marketplace image.
     *
     * @return the virtualMachineResourceId value.
     */
    public String virtualMachineResourceId() {
        return this.virtualMachineResourceId;
    }

    /**
     * Set the virtualMachineResourceId property: ARM Resource id of underlying virtual machine created from SQL
     * marketplace image.
     *
     * @param virtualMachineResourceId the virtualMachineResourceId value to set.
     * @return the SqlVirtualMachineProperties object itself.
     */
    public SqlVirtualMachineProperties withVirtualMachineResourceId(String virtualMachineResourceId) {
        this.virtualMachineResourceId = virtualMachineResourceId;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state to track the async operation status.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the sqlImageOffer property: SQL image offer. Examples include SQL2016-WS2016, SQL2017-WS2016.
     *
     * @return the sqlImageOffer value.
     */
    public String sqlImageOffer() {
        return this.sqlImageOffer;
    }

    /**
     * Set the sqlImageOffer property: SQL image offer. Examples include SQL2016-WS2016, SQL2017-WS2016.
     *
     * @param sqlImageOffer the sqlImageOffer value to set.
     * @return the SqlVirtualMachineProperties object itself.
     */
    public SqlVirtualMachineProperties withSqlImageOffer(String sqlImageOffer) {
        this.sqlImageOffer = sqlImageOffer;
        return this;
    }

    /**
     * Get the sqlServerLicenseType property: SQL Server license type.
     *
     * @return the sqlServerLicenseType value.
     */
    public SqlServerLicenseType sqlServerLicenseType() {
        return this.sqlServerLicenseType;
    }

    /**
     * Set the sqlServerLicenseType property: SQL Server license type.
     *
     * @param sqlServerLicenseType the sqlServerLicenseType value to set.
     * @return the SqlVirtualMachineProperties object itself.
     */
    public SqlVirtualMachineProperties withSqlServerLicenseType(SqlServerLicenseType sqlServerLicenseType) {
        this.sqlServerLicenseType = sqlServerLicenseType;
        return this;
    }

    /**
     * Get the sqlManagement property: SQL Server Management type.
     *
     * @return the sqlManagement value.
     */
    public SqlManagementMode sqlManagement() {
        return this.sqlManagement;
    }

    /**
     * Set the sqlManagement property: SQL Server Management type.
     *
     * @param sqlManagement the sqlManagement value to set.
     * @return the SqlVirtualMachineProperties object itself.
     */
    public SqlVirtualMachineProperties withSqlManagement(SqlManagementMode sqlManagement) {
        this.sqlManagement = sqlManagement;
        return this;
    }

    /**
     * Get the leastPrivilegeMode property: SQL IaaS Agent least privilege mode.
     *
     * @return the leastPrivilegeMode value.
     */
    public LeastPrivilegeMode leastPrivilegeMode() {
        return this.leastPrivilegeMode;
    }

    /**
     * Set the leastPrivilegeMode property: SQL IaaS Agent least privilege mode.
     *
     * @param leastPrivilegeMode the leastPrivilegeMode value to set.
     * @return the SqlVirtualMachineProperties object itself.
     */
    public SqlVirtualMachineProperties withLeastPrivilegeMode(LeastPrivilegeMode leastPrivilegeMode) {
        this.leastPrivilegeMode = leastPrivilegeMode;
        return this;
    }

    /**
     * Get the sqlImageSku property: SQL Server edition type.
     *
     * @return the sqlImageSku value.
     */
    public SqlImageSku sqlImageSku() {
        return this.sqlImageSku;
    }

    /**
     * Set the sqlImageSku property: SQL Server edition type.
     *
     * @param sqlImageSku the sqlImageSku value to set.
     * @return the SqlVirtualMachineProperties object itself.
     */
    public SqlVirtualMachineProperties withSqlImageSku(SqlImageSku sqlImageSku) {
        this.sqlImageSku = sqlImageSku;
        return this;
    }

    /**
     * Get the sqlVirtualMachineGroupResourceId property: ARM resource id of the SQL virtual machine group this SQL
     * virtual machine is or will be part of.
     *
     * @return the sqlVirtualMachineGroupResourceId value.
     */
    public String sqlVirtualMachineGroupResourceId() {
        return this.sqlVirtualMachineGroupResourceId;
    }

    /**
     * Set the sqlVirtualMachineGroupResourceId property: ARM resource id of the SQL virtual machine group this SQL
     * virtual machine is or will be part of.
     *
     * @param sqlVirtualMachineGroupResourceId the sqlVirtualMachineGroupResourceId value to set.
     * @return the SqlVirtualMachineProperties object itself.
     */
    public SqlVirtualMachineProperties withSqlVirtualMachineGroupResourceId(String sqlVirtualMachineGroupResourceId) {
        this.sqlVirtualMachineGroupResourceId = sqlVirtualMachineGroupResourceId;
        return this;
    }

    /**
     * Get the wsfcDomainCredentials property: Domain credentials for setting up Windows Server Failover Cluster for SQL
     * availability group.
     *
     * @return the wsfcDomainCredentials value.
     */
    public WsfcDomainCredentials wsfcDomainCredentials() {
        return this.wsfcDomainCredentials;
    }

    /**
     * Set the wsfcDomainCredentials property: Domain credentials for setting up Windows Server Failover Cluster for SQL
     * availability group.
     *
     * @param wsfcDomainCredentials the wsfcDomainCredentials value to set.
     * @return the SqlVirtualMachineProperties object itself.
     */
    public SqlVirtualMachineProperties withWsfcDomainCredentials(WsfcDomainCredentials wsfcDomainCredentials) {
        this.wsfcDomainCredentials = wsfcDomainCredentials;
        return this;
    }

    /**
     * Get the wsfcStaticIp property: Domain credentials for setting up Windows Server Failover Cluster for SQL
     * availability group.
     *
     * @return the wsfcStaticIp value.
     */
    public String wsfcStaticIp() {
        return this.wsfcStaticIp;
    }

    /**
     * Set the wsfcStaticIp property: Domain credentials for setting up Windows Server Failover Cluster for SQL
     * availability group.
     *
     * @param wsfcStaticIp the wsfcStaticIp value to set.
     * @return the SqlVirtualMachineProperties object itself.
     */
    public SqlVirtualMachineProperties withWsfcStaticIp(String wsfcStaticIp) {
        this.wsfcStaticIp = wsfcStaticIp;
        return this;
    }

    /**
     * Get the autoPatchingSettings property: Auto patching settings for applying critical security updates to SQL
     * virtual machine.
     *
     * @return the autoPatchingSettings value.
     */
    public AutoPatchingSettings autoPatchingSettings() {
        return this.autoPatchingSettings;
    }

    /**
     * Set the autoPatchingSettings property: Auto patching settings for applying critical security updates to SQL
     * virtual machine.
     *
     * @param autoPatchingSettings the autoPatchingSettings value to set.
     * @return the SqlVirtualMachineProperties object itself.
     */
    public SqlVirtualMachineProperties withAutoPatchingSettings(AutoPatchingSettings autoPatchingSettings) {
        this.autoPatchingSettings = autoPatchingSettings;
        return this;
    }

    /**
     * Get the autoBackupSettings property: Auto backup settings for SQL Server.
     *
     * @return the autoBackupSettings value.
     */
    public AutoBackupSettings autoBackupSettings() {
        return this.autoBackupSettings;
    }

    /**
     * Set the autoBackupSettings property: Auto backup settings for SQL Server.
     *
     * @param autoBackupSettings the autoBackupSettings value to set.
     * @return the SqlVirtualMachineProperties object itself.
     */
    public SqlVirtualMachineProperties withAutoBackupSettings(AutoBackupSettings autoBackupSettings) {
        this.autoBackupSettings = autoBackupSettings;
        return this;
    }

    /**
     * Get the keyVaultCredentialSettings property: Key vault credential settings.
     *
     * @return the keyVaultCredentialSettings value.
     */
    public KeyVaultCredentialSettings keyVaultCredentialSettings() {
        return this.keyVaultCredentialSettings;
    }

    /**
     * Set the keyVaultCredentialSettings property: Key vault credential settings.
     *
     * @param keyVaultCredentialSettings the keyVaultCredentialSettings value to set.
     * @return the SqlVirtualMachineProperties object itself.
     */
    public SqlVirtualMachineProperties withKeyVaultCredentialSettings(
        KeyVaultCredentialSettings keyVaultCredentialSettings) {
        this.keyVaultCredentialSettings = keyVaultCredentialSettings;
        return this;
    }

    /**
     * Get the serverConfigurationsManagementSettings property: SQL Server configuration management settings.
     *
     * @return the serverConfigurationsManagementSettings value.
     */
    public ServerConfigurationsManagementSettings serverConfigurationsManagementSettings() {
        return this.serverConfigurationsManagementSettings;
    }

    /**
     * Set the serverConfigurationsManagementSettings property: SQL Server configuration management settings.
     *
     * @param serverConfigurationsManagementSettings the serverConfigurationsManagementSettings value to set.
     * @return the SqlVirtualMachineProperties object itself.
     */
    public SqlVirtualMachineProperties withServerConfigurationsManagementSettings(
        ServerConfigurationsManagementSettings serverConfigurationsManagementSettings) {
        this.serverConfigurationsManagementSettings = serverConfigurationsManagementSettings;
        return this;
    }

    /**
     * Get the storageConfigurationSettings property: Storage Configuration Settings.
     *
     * @return the storageConfigurationSettings value.
     */
    public StorageConfigurationSettings storageConfigurationSettings() {
        return this.storageConfigurationSettings;
    }

    /**
     * Set the storageConfigurationSettings property: Storage Configuration Settings.
     *
     * @param storageConfigurationSettings the storageConfigurationSettings value to set.
     * @return the SqlVirtualMachineProperties object itself.
     */
    public SqlVirtualMachineProperties withStorageConfigurationSettings(
        StorageConfigurationSettings storageConfigurationSettings) {
        this.storageConfigurationSettings = storageConfigurationSettings;
        return this;
    }

    /**
     * Get the assessmentSettings property: Assessment Settings.
     *
     * @return the assessmentSettings value.
     */
    public AssessmentSettings assessmentSettings() {
        return this.assessmentSettings;
    }

    /**
     * Set the assessmentSettings property: Assessment Settings.
     *
     * @param assessmentSettings the assessmentSettings value to set.
     * @return the SqlVirtualMachineProperties object itself.
     */
    public SqlVirtualMachineProperties withAssessmentSettings(AssessmentSettings assessmentSettings) {
        this.assessmentSettings = assessmentSettings;
        return this;
    }

    /**
     * Get the enableAutomaticUpgrade property: Enable automatic upgrade of Sql IaaS extension Agent.
     *
     * @return the enableAutomaticUpgrade value.
     */
    public Boolean enableAutomaticUpgrade() {
        return this.enableAutomaticUpgrade;
    }

    /**
     * Set the enableAutomaticUpgrade property: Enable automatic upgrade of Sql IaaS extension Agent.
     *
     * @param enableAutomaticUpgrade the enableAutomaticUpgrade value to set.
     * @return the SqlVirtualMachineProperties object itself.
     */
    public SqlVirtualMachineProperties withEnableAutomaticUpgrade(Boolean enableAutomaticUpgrade) {
        this.enableAutomaticUpgrade = enableAutomaticUpgrade;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (wsfcDomainCredentials() != null) {
            wsfcDomainCredentials().validate();
        }
        if (autoPatchingSettings() != null) {
            autoPatchingSettings().validate();
        }
        if (autoBackupSettings() != null) {
            autoBackupSettings().validate();
        }
        if (keyVaultCredentialSettings() != null) {
            keyVaultCredentialSettings().validate();
        }
        if (serverConfigurationsManagementSettings() != null) {
            serverConfigurationsManagementSettings().validate();
        }
        if (storageConfigurationSettings() != null) {
            storageConfigurationSettings().validate();
        }
        if (assessmentSettings() != null) {
            assessmentSettings().validate();
        }
    }
}
