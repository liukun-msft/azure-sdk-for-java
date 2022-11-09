// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The common properties of a cluster. */
@Fluent
public class CommonClusterProperties {
    /*
     * The cluster size
     */
    @JsonProperty(value = "clusterSize")
    private Integer clusterSize;

    /*
     * The state of the cluster provisioning
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ClusterProvisioningState provisioningState;

    /*
     * The identity
     */
    @JsonProperty(value = "clusterId", access = JsonProperty.Access.WRITE_ONLY)
    private Integer clusterId;

    /*
     * The hosts
     */
    @JsonProperty(value = "hosts")
    private List<String> hosts;

    /** Creates an instance of CommonClusterProperties class. */
    public CommonClusterProperties() {
    }

    /**
     * Get the clusterSize property: The cluster size.
     *
     * @return the clusterSize value.
     */
    public Integer clusterSize() {
        return this.clusterSize;
    }

    /**
     * Set the clusterSize property: The cluster size.
     *
     * @param clusterSize the clusterSize value to set.
     * @return the CommonClusterProperties object itself.
     */
    public CommonClusterProperties withClusterSize(Integer clusterSize) {
        this.clusterSize = clusterSize;
        return this;
    }

    /**
     * Get the provisioningState property: The state of the cluster provisioning.
     *
     * @return the provisioningState value.
     */
    public ClusterProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the clusterId property: The identity.
     *
     * @return the clusterId value.
     */
    public Integer clusterId() {
        return this.clusterId;
    }

    /**
     * Get the hosts property: The hosts.
     *
     * @return the hosts value.
     */
    public List<String> hosts() {
        return this.hosts;
    }

    /**
     * Set the hosts property: The hosts.
     *
     * @param hosts the hosts value to set.
     * @return the CommonClusterProperties object itself.
     */
    public CommonClusterProperties withHosts(List<String> hosts) {
        this.hosts = hosts;
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
