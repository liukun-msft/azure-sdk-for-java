// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** HybridAKSNetworkSpec defines the desired state of HybridAKSNetwork. */
@Fluent
public final class VirtualNetworksProperties {
    /*
     * The infraVnetProfile property.
     */
    @JsonProperty(value = "infraVnetProfile")
    private VirtualNetworksPropertiesInfraVnetProfile infraVnetProfile;

    /*
     * Virtual IP Pool for Kubernetes
     */
    @JsonProperty(value = "vipPool")
    private List<VirtualNetworksPropertiesVipPoolItem> vipPool;

    /*
     * IP Pool for Virtual Machines
     */
    @JsonProperty(value = "vmipPool")
    private List<VirtualNetworksPropertiesVmipPoolItem> vmipPool;

    /*
     * Address of the DHCP servers associated with the network
     */
    @JsonProperty(value = "dhcpServers", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> dhcpServers;

    /*
     * Address of the DNS servers associated with the network
     */
    @JsonProperty(value = "dnsServers", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> dnsServers;

    /*
     * Address of the Gateway associated with the network
     */
    @JsonProperty(value = "gateway", access = JsonProperty.Access.WRITE_ONLY)
    private String gateway;

    /*
     * IP Address Prefix of the network
     */
    @JsonProperty(value = "ipAddressPrefix", access = JsonProperty.Access.WRITE_ONLY)
    private String ipAddressPrefix;

    /*
     * VLAN Id used by the network
     */
    @JsonProperty(value = "vlanID", access = JsonProperty.Access.WRITE_ONLY)
    private String vlanId;

    /*
     * The provisioningState property.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * HybridAKSNetworkStatus defines the observed state of HybridAKSNetwork
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private VirtualNetworksPropertiesStatus status;

    /** Creates an instance of VirtualNetworksProperties class. */
    public VirtualNetworksProperties() {
    }

    /**
     * Get the infraVnetProfile property: The infraVnetProfile property.
     *
     * @return the infraVnetProfile value.
     */
    public VirtualNetworksPropertiesInfraVnetProfile infraVnetProfile() {
        return this.infraVnetProfile;
    }

    /**
     * Set the infraVnetProfile property: The infraVnetProfile property.
     *
     * @param infraVnetProfile the infraVnetProfile value to set.
     * @return the VirtualNetworksProperties object itself.
     */
    public VirtualNetworksProperties withInfraVnetProfile(VirtualNetworksPropertiesInfraVnetProfile infraVnetProfile) {
        this.infraVnetProfile = infraVnetProfile;
        return this;
    }

    /**
     * Get the vipPool property: Virtual IP Pool for Kubernetes.
     *
     * @return the vipPool value.
     */
    public List<VirtualNetworksPropertiesVipPoolItem> vipPool() {
        return this.vipPool;
    }

    /**
     * Set the vipPool property: Virtual IP Pool for Kubernetes.
     *
     * @param vipPool the vipPool value to set.
     * @return the VirtualNetworksProperties object itself.
     */
    public VirtualNetworksProperties withVipPool(List<VirtualNetworksPropertiesVipPoolItem> vipPool) {
        this.vipPool = vipPool;
        return this;
    }

    /**
     * Get the vmipPool property: IP Pool for Virtual Machines.
     *
     * @return the vmipPool value.
     */
    public List<VirtualNetworksPropertiesVmipPoolItem> vmipPool() {
        return this.vmipPool;
    }

    /**
     * Set the vmipPool property: IP Pool for Virtual Machines.
     *
     * @param vmipPool the vmipPool value to set.
     * @return the VirtualNetworksProperties object itself.
     */
    public VirtualNetworksProperties withVmipPool(List<VirtualNetworksPropertiesVmipPoolItem> vmipPool) {
        this.vmipPool = vmipPool;
        return this;
    }

    /**
     * Get the dhcpServers property: Address of the DHCP servers associated with the network.
     *
     * @return the dhcpServers value.
     */
    public List<String> dhcpServers() {
        return this.dhcpServers;
    }

    /**
     * Get the dnsServers property: Address of the DNS servers associated with the network.
     *
     * @return the dnsServers value.
     */
    public List<String> dnsServers() {
        return this.dnsServers;
    }

    /**
     * Get the gateway property: Address of the Gateway associated with the network.
     *
     * @return the gateway value.
     */
    public String gateway() {
        return this.gateway;
    }

    /**
     * Get the ipAddressPrefix property: IP Address Prefix of the network.
     *
     * @return the ipAddressPrefix value.
     */
    public String ipAddressPrefix() {
        return this.ipAddressPrefix;
    }

    /**
     * Get the vlanId property: VLAN Id used by the network.
     *
     * @return the vlanId value.
     */
    public String vlanId() {
        return this.vlanId;
    }

    /**
     * Get the provisioningState property: The provisioningState property.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the status property: HybridAKSNetworkStatus defines the observed state of HybridAKSNetwork.
     *
     * @return the status value.
     */
    public VirtualNetworksPropertiesStatus status() {
        return this.status;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (infraVnetProfile() != null) {
            infraVnetProfile().validate();
        }
        if (vipPool() != null) {
            vipPool().forEach(e -> e.validate());
        }
        if (vmipPool() != null) {
            vmipPool().forEach(e -> e.validate());
        }
        if (status() != null) {
            status().validate();
        }
    }
}
