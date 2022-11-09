// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** IaaS VM workload-specific restore. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "objectType",
    defaultImpl = IaasVMRestoreRequest.class)
@JsonTypeName("IaasVMRestoreRequest")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "IaasVMRestoreWithRehydrationRequest", value = IaasVMRestoreWithRehydrationRequest.class)
})
@Fluent
public class IaasVMRestoreRequest extends RestoreRequest {
    /*
     * ID of the backup copy to be recovered.
     */
    @JsonProperty(value = "recoveryPointId")
    private String recoveryPointId;

    /*
     * Type of this recovery.
     */
    @JsonProperty(value = "recoveryType")
    private RecoveryType recoveryType;

    /*
     * Fully qualified ARM ID of the VM which is being recovered.
     */
    @JsonProperty(value = "sourceResourceId")
    private String sourceResourceId;

    /*
     * This is the complete ARM Id of the VM that will be created.
     * For e.g. /subscriptions/{subId}/resourcegroups/{rg}/provider/Microsoft.Compute/virtualmachines/{vm}
     */
    @JsonProperty(value = "targetVirtualMachineId")
    private String targetVirtualMachineId;

    /*
     * This is the ARM Id of the resource group that you want to create for this Virtual machine and other artifacts.
     * For e.g. /subscriptions/{subId}/resourcegroups/{rg}
     */
    @JsonProperty(value = "targetResourceGroupId")
    private String targetResourceGroupId;

    /*
     * Fully qualified ARM ID of the storage account to which the VM has to be restored.
     */
    @JsonProperty(value = "storageAccountId")
    private String storageAccountId;

    /*
     * This is the virtual network Id of the vnet that will be attached to the virtual machine.
     * User will be validated for join action permissions in the linked access.
     */
    @JsonProperty(value = "virtualNetworkId")
    private String virtualNetworkId;

    /*
     * Subnet ID, is the subnet ID associated with the to be restored VM. For Classic VMs it would be
     * {VnetID}/Subnet/{SubnetName} and, for the Azure Resource Manager VMs it would be ARM resource ID used to
     * represent
     * the subnet.
     */
    @JsonProperty(value = "subnetId")
    private String subnetId;

    /*
     * Fully qualified ARM ID of the domain name to be associated to the VM being restored. This applies only to
     * Classic
     * Virtual Machines.
     */
    @JsonProperty(value = "targetDomainNameId")
    private String targetDomainNameId;

    /*
     * Region in which the virtual machine is restored.
     */
    @JsonProperty(value = "region")
    private String region;

    /*
     * Affinity group associated to VM to be restored. Used only for Classic Compute Virtual Machines.
     */
    @JsonProperty(value = "affinityGroup")
    private String affinityGroup;

    /*
     * Should a new cloud service be created while restoring the VM. If this is false, VM will be restored to the same
     * cloud service as it was at the time of backup.
     */
    @JsonProperty(value = "createNewCloudService")
    private Boolean createNewCloudService;

    /*
     * Original Storage Account Option
     */
    @JsonProperty(value = "originalStorageAccountOption")
    private Boolean originalStorageAccountOption;

    /*
     * Details needed if the VM was encrypted at the time of backup.
     */
    @JsonProperty(value = "encryptionDetails")
    private EncryptionDetails encryptionDetails;

    /*
     * List of Disk LUNs for partial restore
     */
    @JsonProperty(value = "restoreDiskLunList")
    private List<Integer> restoreDiskLunList;

    /*
     * Flag to denote of an Unmanaged disk VM should be restored with Managed disks.
     */
    @JsonProperty(value = "restoreWithManagedDisks")
    private Boolean restoreWithManagedDisks;

    /*
     * DiskEncryptionSet's ID - needed if the VM needs to be encrypted at rest during restore with customer managed
     * key.
     */
    @JsonProperty(value = "diskEncryptionSetId")
    private String diskEncryptionSetId;

    /*
     * Target zone where the VM and its disks should be restored.
     */
    @JsonProperty(value = "zones")
    private List<String> zones;

    /*
     * Managed Identity information required to access customer storage account.
     */
    @JsonProperty(value = "identityInfo")
    private IdentityInfo identityInfo;

    /*
     * IaaS VM workload specific restore details for restores using managed identity.
     */
    @JsonProperty(value = "identityBasedRestoreDetails")
    private IdentityBasedRestoreDetails identityBasedRestoreDetails;

    /** Creates an instance of IaasVMRestoreRequest class. */
    public IaasVMRestoreRequest() {
    }

    /**
     * Get the recoveryPointId property: ID of the backup copy to be recovered.
     *
     * @return the recoveryPointId value.
     */
    public String recoveryPointId() {
        return this.recoveryPointId;
    }

    /**
     * Set the recoveryPointId property: ID of the backup copy to be recovered.
     *
     * @param recoveryPointId the recoveryPointId value to set.
     * @return the IaasVMRestoreRequest object itself.
     */
    public IaasVMRestoreRequest withRecoveryPointId(String recoveryPointId) {
        this.recoveryPointId = recoveryPointId;
        return this;
    }

    /**
     * Get the recoveryType property: Type of this recovery.
     *
     * @return the recoveryType value.
     */
    public RecoveryType recoveryType() {
        return this.recoveryType;
    }

    /**
     * Set the recoveryType property: Type of this recovery.
     *
     * @param recoveryType the recoveryType value to set.
     * @return the IaasVMRestoreRequest object itself.
     */
    public IaasVMRestoreRequest withRecoveryType(RecoveryType recoveryType) {
        this.recoveryType = recoveryType;
        return this;
    }

    /**
     * Get the sourceResourceId property: Fully qualified ARM ID of the VM which is being recovered.
     *
     * @return the sourceResourceId value.
     */
    public String sourceResourceId() {
        return this.sourceResourceId;
    }

    /**
     * Set the sourceResourceId property: Fully qualified ARM ID of the VM which is being recovered.
     *
     * @param sourceResourceId the sourceResourceId value to set.
     * @return the IaasVMRestoreRequest object itself.
     */
    public IaasVMRestoreRequest withSourceResourceId(String sourceResourceId) {
        this.sourceResourceId = sourceResourceId;
        return this;
    }

    /**
     * Get the targetVirtualMachineId property: This is the complete ARM Id of the VM that will be created. For e.g.
     * /subscriptions/{subId}/resourcegroups/{rg}/provider/Microsoft.Compute/virtualmachines/{vm}.
     *
     * @return the targetVirtualMachineId value.
     */
    public String targetVirtualMachineId() {
        return this.targetVirtualMachineId;
    }

    /**
     * Set the targetVirtualMachineId property: This is the complete ARM Id of the VM that will be created. For e.g.
     * /subscriptions/{subId}/resourcegroups/{rg}/provider/Microsoft.Compute/virtualmachines/{vm}.
     *
     * @param targetVirtualMachineId the targetVirtualMachineId value to set.
     * @return the IaasVMRestoreRequest object itself.
     */
    public IaasVMRestoreRequest withTargetVirtualMachineId(String targetVirtualMachineId) {
        this.targetVirtualMachineId = targetVirtualMachineId;
        return this;
    }

    /**
     * Get the targetResourceGroupId property: This is the ARM Id of the resource group that you want to create for this
     * Virtual machine and other artifacts. For e.g. /subscriptions/{subId}/resourcegroups/{rg}.
     *
     * @return the targetResourceGroupId value.
     */
    public String targetResourceGroupId() {
        return this.targetResourceGroupId;
    }

    /**
     * Set the targetResourceGroupId property: This is the ARM Id of the resource group that you want to create for this
     * Virtual machine and other artifacts. For e.g. /subscriptions/{subId}/resourcegroups/{rg}.
     *
     * @param targetResourceGroupId the targetResourceGroupId value to set.
     * @return the IaasVMRestoreRequest object itself.
     */
    public IaasVMRestoreRequest withTargetResourceGroupId(String targetResourceGroupId) {
        this.targetResourceGroupId = targetResourceGroupId;
        return this;
    }

    /**
     * Get the storageAccountId property: Fully qualified ARM ID of the storage account to which the VM has to be
     * restored.
     *
     * @return the storageAccountId value.
     */
    public String storageAccountId() {
        return this.storageAccountId;
    }

    /**
     * Set the storageAccountId property: Fully qualified ARM ID of the storage account to which the VM has to be
     * restored.
     *
     * @param storageAccountId the storageAccountId value to set.
     * @return the IaasVMRestoreRequest object itself.
     */
    public IaasVMRestoreRequest withStorageAccountId(String storageAccountId) {
        this.storageAccountId = storageAccountId;
        return this;
    }

    /**
     * Get the virtualNetworkId property: This is the virtual network Id of the vnet that will be attached to the
     * virtual machine. User will be validated for join action permissions in the linked access.
     *
     * @return the virtualNetworkId value.
     */
    public String virtualNetworkId() {
        return this.virtualNetworkId;
    }

    /**
     * Set the virtualNetworkId property: This is the virtual network Id of the vnet that will be attached to the
     * virtual machine. User will be validated for join action permissions in the linked access.
     *
     * @param virtualNetworkId the virtualNetworkId value to set.
     * @return the IaasVMRestoreRequest object itself.
     */
    public IaasVMRestoreRequest withVirtualNetworkId(String virtualNetworkId) {
        this.virtualNetworkId = virtualNetworkId;
        return this;
    }

    /**
     * Get the subnetId property: Subnet ID, is the subnet ID associated with the to be restored VM. For Classic VMs it
     * would be {VnetID}/Subnet/{SubnetName} and, for the Azure Resource Manager VMs it would be ARM resource ID used to
     * represent the subnet.
     *
     * @return the subnetId value.
     */
    public String subnetId() {
        return this.subnetId;
    }

    /**
     * Set the subnetId property: Subnet ID, is the subnet ID associated with the to be restored VM. For Classic VMs it
     * would be {VnetID}/Subnet/{SubnetName} and, for the Azure Resource Manager VMs it would be ARM resource ID used to
     * represent the subnet.
     *
     * @param subnetId the subnetId value to set.
     * @return the IaasVMRestoreRequest object itself.
     */
    public IaasVMRestoreRequest withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * Get the targetDomainNameId property: Fully qualified ARM ID of the domain name to be associated to the VM being
     * restored. This applies only to Classic Virtual Machines.
     *
     * @return the targetDomainNameId value.
     */
    public String targetDomainNameId() {
        return this.targetDomainNameId;
    }

    /**
     * Set the targetDomainNameId property: Fully qualified ARM ID of the domain name to be associated to the VM being
     * restored. This applies only to Classic Virtual Machines.
     *
     * @param targetDomainNameId the targetDomainNameId value to set.
     * @return the IaasVMRestoreRequest object itself.
     */
    public IaasVMRestoreRequest withTargetDomainNameId(String targetDomainNameId) {
        this.targetDomainNameId = targetDomainNameId;
        return this;
    }

    /**
     * Get the region property: Region in which the virtual machine is restored.
     *
     * @return the region value.
     */
    public String region() {
        return this.region;
    }

    /**
     * Set the region property: Region in which the virtual machine is restored.
     *
     * @param region the region value to set.
     * @return the IaasVMRestoreRequest object itself.
     */
    public IaasVMRestoreRequest withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * Get the affinityGroup property: Affinity group associated to VM to be restored. Used only for Classic Compute
     * Virtual Machines.
     *
     * @return the affinityGroup value.
     */
    public String affinityGroup() {
        return this.affinityGroup;
    }

    /**
     * Set the affinityGroup property: Affinity group associated to VM to be restored. Used only for Classic Compute
     * Virtual Machines.
     *
     * @param affinityGroup the affinityGroup value to set.
     * @return the IaasVMRestoreRequest object itself.
     */
    public IaasVMRestoreRequest withAffinityGroup(String affinityGroup) {
        this.affinityGroup = affinityGroup;
        return this;
    }

    /**
     * Get the createNewCloudService property: Should a new cloud service be created while restoring the VM. If this is
     * false, VM will be restored to the same cloud service as it was at the time of backup.
     *
     * @return the createNewCloudService value.
     */
    public Boolean createNewCloudService() {
        return this.createNewCloudService;
    }

    /**
     * Set the createNewCloudService property: Should a new cloud service be created while restoring the VM. If this is
     * false, VM will be restored to the same cloud service as it was at the time of backup.
     *
     * @param createNewCloudService the createNewCloudService value to set.
     * @return the IaasVMRestoreRequest object itself.
     */
    public IaasVMRestoreRequest withCreateNewCloudService(Boolean createNewCloudService) {
        this.createNewCloudService = createNewCloudService;
        return this;
    }

    /**
     * Get the originalStorageAccountOption property: Original Storage Account Option.
     *
     * @return the originalStorageAccountOption value.
     */
    public Boolean originalStorageAccountOption() {
        return this.originalStorageAccountOption;
    }

    /**
     * Set the originalStorageAccountOption property: Original Storage Account Option.
     *
     * @param originalStorageAccountOption the originalStorageAccountOption value to set.
     * @return the IaasVMRestoreRequest object itself.
     */
    public IaasVMRestoreRequest withOriginalStorageAccountOption(Boolean originalStorageAccountOption) {
        this.originalStorageAccountOption = originalStorageAccountOption;
        return this;
    }

    /**
     * Get the encryptionDetails property: Details needed if the VM was encrypted at the time of backup.
     *
     * @return the encryptionDetails value.
     */
    public EncryptionDetails encryptionDetails() {
        return this.encryptionDetails;
    }

    /**
     * Set the encryptionDetails property: Details needed if the VM was encrypted at the time of backup.
     *
     * @param encryptionDetails the encryptionDetails value to set.
     * @return the IaasVMRestoreRequest object itself.
     */
    public IaasVMRestoreRequest withEncryptionDetails(EncryptionDetails encryptionDetails) {
        this.encryptionDetails = encryptionDetails;
        return this;
    }

    /**
     * Get the restoreDiskLunList property: List of Disk LUNs for partial restore.
     *
     * @return the restoreDiskLunList value.
     */
    public List<Integer> restoreDiskLunList() {
        return this.restoreDiskLunList;
    }

    /**
     * Set the restoreDiskLunList property: List of Disk LUNs for partial restore.
     *
     * @param restoreDiskLunList the restoreDiskLunList value to set.
     * @return the IaasVMRestoreRequest object itself.
     */
    public IaasVMRestoreRequest withRestoreDiskLunList(List<Integer> restoreDiskLunList) {
        this.restoreDiskLunList = restoreDiskLunList;
        return this;
    }

    /**
     * Get the restoreWithManagedDisks property: Flag to denote of an Unmanaged disk VM should be restored with Managed
     * disks.
     *
     * @return the restoreWithManagedDisks value.
     */
    public Boolean restoreWithManagedDisks() {
        return this.restoreWithManagedDisks;
    }

    /**
     * Set the restoreWithManagedDisks property: Flag to denote of an Unmanaged disk VM should be restored with Managed
     * disks.
     *
     * @param restoreWithManagedDisks the restoreWithManagedDisks value to set.
     * @return the IaasVMRestoreRequest object itself.
     */
    public IaasVMRestoreRequest withRestoreWithManagedDisks(Boolean restoreWithManagedDisks) {
        this.restoreWithManagedDisks = restoreWithManagedDisks;
        return this;
    }

    /**
     * Get the diskEncryptionSetId property: DiskEncryptionSet's ID - needed if the VM needs to be encrypted at rest
     * during restore with customer managed key.
     *
     * @return the diskEncryptionSetId value.
     */
    public String diskEncryptionSetId() {
        return this.diskEncryptionSetId;
    }

    /**
     * Set the diskEncryptionSetId property: DiskEncryptionSet's ID - needed if the VM needs to be encrypted at rest
     * during restore with customer managed key.
     *
     * @param diskEncryptionSetId the diskEncryptionSetId value to set.
     * @return the IaasVMRestoreRequest object itself.
     */
    public IaasVMRestoreRequest withDiskEncryptionSetId(String diskEncryptionSetId) {
        this.diskEncryptionSetId = diskEncryptionSetId;
        return this;
    }

    /**
     * Get the zones property: Target zone where the VM and its disks should be restored.
     *
     * @return the zones value.
     */
    public List<String> zones() {
        return this.zones;
    }

    /**
     * Set the zones property: Target zone where the VM and its disks should be restored.
     *
     * @param zones the zones value to set.
     * @return the IaasVMRestoreRequest object itself.
     */
    public IaasVMRestoreRequest withZones(List<String> zones) {
        this.zones = zones;
        return this;
    }

    /**
     * Get the identityInfo property: Managed Identity information required to access customer storage account.
     *
     * @return the identityInfo value.
     */
    public IdentityInfo identityInfo() {
        return this.identityInfo;
    }

    /**
     * Set the identityInfo property: Managed Identity information required to access customer storage account.
     *
     * @param identityInfo the identityInfo value to set.
     * @return the IaasVMRestoreRequest object itself.
     */
    public IaasVMRestoreRequest withIdentityInfo(IdentityInfo identityInfo) {
        this.identityInfo = identityInfo;
        return this;
    }

    /**
     * Get the identityBasedRestoreDetails property: IaaS VM workload specific restore details for restores using
     * managed identity.
     *
     * @return the identityBasedRestoreDetails value.
     */
    public IdentityBasedRestoreDetails identityBasedRestoreDetails() {
        return this.identityBasedRestoreDetails;
    }

    /**
     * Set the identityBasedRestoreDetails property: IaaS VM workload specific restore details for restores using
     * managed identity.
     *
     * @param identityBasedRestoreDetails the identityBasedRestoreDetails value to set.
     * @return the IaasVMRestoreRequest object itself.
     */
    public IaasVMRestoreRequest withIdentityBasedRestoreDetails(
        IdentityBasedRestoreDetails identityBasedRestoreDetails) {
        this.identityBasedRestoreDetails = identityBasedRestoreDetails;
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
        if (encryptionDetails() != null) {
            encryptionDetails().validate();
        }
        if (identityInfo() != null) {
            identityInfo().validate();
        }
        if (identityBasedRestoreDetails() != null) {
            identityBasedRestoreDetails().validate();
        }
    }
}
