/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicefabric;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes a node type in the cluster, each node type represents sub set of
 * nodes in the cluster.
 */
public class NodeTypeDescription {
    /**
     * Name of the node type.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * The placement tags applied to nodes in the node type, which can be used
     * to indicate where certain services (workload) should run.
     */
    @JsonProperty(value = "placementProperties")
    private Map<String, String> placementProperties;

    /**
     * The capacity tags applied to the nodes in the node type, the cluster
     * resource manager uses these tags to understand how much of a resource a
     * node has.
     */
    @JsonProperty(value = "capacities")
    private Map<String, String> capacities;

    /**
     * The TCP cluster management endpoint port.
     */
    @JsonProperty(value = "clientConnectionEndpointPort", required = true)
    private int clientConnectionEndpointPort;

    /**
     * The HTTP cluster management endpoint port.
     */
    @JsonProperty(value = "httpGatewayEndpointPort", required = true)
    private int httpGatewayEndpointPort;

    /**
     * Nodetype durability Level. Possible values include: 'Bronze', 'Silver',
     * 'Gold'.
     */
    @JsonProperty(value = "durabilityLevel")
    private String durabilityLevel;

    /**
     * Ports used by applications.
     */
    @JsonProperty(value = "applicationPorts")
    private EndpointRangeDescription applicationPorts;

    /**
     * System assgined application ports.
     */
    @JsonProperty(value = "ephemeralPorts")
    private EndpointRangeDescription ephemeralPorts;

    /**
     * Mark this as the primary node type.
     */
    @JsonProperty(value = "isPrimary", required = true)
    private boolean isPrimary;

    /**
     * The number of node instances in the node type.
     */
    @JsonProperty(value = "vmInstanceCount", required = true)
    private int vmInstanceCount;

    /**
     * Endpoint used by reverse proxy.
     */
    @JsonProperty(value = "reverseProxyEndpointPort")
    private Integer reverseProxyEndpointPort;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the NodeTypeDescription object itself.
     */
    public NodeTypeDescription withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the placementProperties value.
     *
     * @return the placementProperties value
     */
    public Map<String, String> placementProperties() {
        return this.placementProperties;
    }

    /**
     * Set the placementProperties value.
     *
     * @param placementProperties the placementProperties value to set
     * @return the NodeTypeDescription object itself.
     */
    public NodeTypeDescription withPlacementProperties(Map<String, String> placementProperties) {
        this.placementProperties = placementProperties;
        return this;
    }

    /**
     * Get the capacities value.
     *
     * @return the capacities value
     */
    public Map<String, String> capacities() {
        return this.capacities;
    }

    /**
     * Set the capacities value.
     *
     * @param capacities the capacities value to set
     * @return the NodeTypeDescription object itself.
     */
    public NodeTypeDescription withCapacities(Map<String, String> capacities) {
        this.capacities = capacities;
        return this;
    }

    /**
     * Get the clientConnectionEndpointPort value.
     *
     * @return the clientConnectionEndpointPort value
     */
    public int clientConnectionEndpointPort() {
        return this.clientConnectionEndpointPort;
    }

    /**
     * Set the clientConnectionEndpointPort value.
     *
     * @param clientConnectionEndpointPort the clientConnectionEndpointPort value to set
     * @return the NodeTypeDescription object itself.
     */
    public NodeTypeDescription withClientConnectionEndpointPort(int clientConnectionEndpointPort) {
        this.clientConnectionEndpointPort = clientConnectionEndpointPort;
        return this;
    }

    /**
     * Get the httpGatewayEndpointPort value.
     *
     * @return the httpGatewayEndpointPort value
     */
    public int httpGatewayEndpointPort() {
        return this.httpGatewayEndpointPort;
    }

    /**
     * Set the httpGatewayEndpointPort value.
     *
     * @param httpGatewayEndpointPort the httpGatewayEndpointPort value to set
     * @return the NodeTypeDescription object itself.
     */
    public NodeTypeDescription withHttpGatewayEndpointPort(int httpGatewayEndpointPort) {
        this.httpGatewayEndpointPort = httpGatewayEndpointPort;
        return this;
    }

    /**
     * Get the durabilityLevel value.
     *
     * @return the durabilityLevel value
     */
    public String durabilityLevel() {
        return this.durabilityLevel;
    }

    /**
     * Set the durabilityLevel value.
     *
     * @param durabilityLevel the durabilityLevel value to set
     * @return the NodeTypeDescription object itself.
     */
    public NodeTypeDescription withDurabilityLevel(String durabilityLevel) {
        this.durabilityLevel = durabilityLevel;
        return this;
    }

    /**
     * Get the applicationPorts value.
     *
     * @return the applicationPorts value
     */
    public EndpointRangeDescription applicationPorts() {
        return this.applicationPorts;
    }

    /**
     * Set the applicationPorts value.
     *
     * @param applicationPorts the applicationPorts value to set
     * @return the NodeTypeDescription object itself.
     */
    public NodeTypeDescription withApplicationPorts(EndpointRangeDescription applicationPorts) {
        this.applicationPorts = applicationPorts;
        return this;
    }

    /**
     * Get the ephemeralPorts value.
     *
     * @return the ephemeralPorts value
     */
    public EndpointRangeDescription ephemeralPorts() {
        return this.ephemeralPorts;
    }

    /**
     * Set the ephemeralPorts value.
     *
     * @param ephemeralPorts the ephemeralPorts value to set
     * @return the NodeTypeDescription object itself.
     */
    public NodeTypeDescription withEphemeralPorts(EndpointRangeDescription ephemeralPorts) {
        this.ephemeralPorts = ephemeralPorts;
        return this;
    }

    /**
     * Get the isPrimary value.
     *
     * @return the isPrimary value
     */
    public boolean isPrimary() {
        return this.isPrimary;
    }

    /**
     * Set the isPrimary value.
     *
     * @param isPrimary the isPrimary value to set
     * @return the NodeTypeDescription object itself.
     */
    public NodeTypeDescription withIsPrimary(boolean isPrimary) {
        this.isPrimary = isPrimary;
        return this;
    }

    /**
     * Get the vmInstanceCount value.
     *
     * @return the vmInstanceCount value
     */
    public int vmInstanceCount() {
        return this.vmInstanceCount;
    }

    /**
     * Set the vmInstanceCount value.
     *
     * @param vmInstanceCount the vmInstanceCount value to set
     * @return the NodeTypeDescription object itself.
     */
    public NodeTypeDescription withVmInstanceCount(int vmInstanceCount) {
        this.vmInstanceCount = vmInstanceCount;
        return this;
    }

    /**
     * Get the reverseProxyEndpointPort value.
     *
     * @return the reverseProxyEndpointPort value
     */
    public Integer reverseProxyEndpointPort() {
        return this.reverseProxyEndpointPort;
    }

    /**
     * Set the reverseProxyEndpointPort value.
     *
     * @param reverseProxyEndpointPort the reverseProxyEndpointPort value to set
     * @return the NodeTypeDescription object itself.
     */
    public NodeTypeDescription withReverseProxyEndpointPort(Integer reverseProxyEndpointPort) {
        this.reverseProxyEndpointPort = reverseProxyEndpointPort;
        return this;
    }

}
