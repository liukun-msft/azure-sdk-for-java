// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A network security group rule to apply to an inbound endpoint. */
@Fluent
public final class NetworkSecurityGroupRule {
    /*
     * The priority for this rule. Priorities within a pool must be unique and
     * are evaluated in order of priority. The lower the number the higher the
     * priority. For example, rules could be specified with order numbers of
     * 150, 250, and 350. The rule with the order number of 150 takes
     * precedence over the rule that has an order of 250. Allowed priorities
     * are 150 to 4096. If any reserved or duplicate values are provided the
     * request fails with HTTP status code 400.
     */
    @JsonProperty(value = "priority", required = true)
    private int priority;

    /*
     * The action that should be taken for a specified IP address, subnet range
     * or tag.
     */
    @JsonProperty(value = "access", required = true)
    private NetworkSecurityGroupRuleAccess access;

    /*
     * The source address prefix or tag to match for the rule. Valid values are
     * a single IP address (i.e. 10.10.10.10), IP subnet (i.e. 192.168.1.0/24),
     * default tag, or * (for all addresses).  If any other values are provided
     * the request fails with HTTP status code 400.
     */
    @JsonProperty(value = "sourceAddressPrefix", required = true)
    private String sourceAddressPrefix;

    /*
     * The source port ranges to match for the rule. Valid values are '*' (for
     * all ports 0 - 65535) or arrays of ports or port ranges (i.e. 100-200).
     * The ports should in the range of 0 to 65535 and the port ranges or ports
     * can't overlap. If any other values are provided the request fails with
     * HTTP status code 400. Default value will be *.
     */
    @JsonProperty(value = "sourcePortRanges")
    private List<String> sourcePortRanges;

    /**
     * Get the priority property: The priority for this rule. Priorities within a pool must be unique and are evaluated
     * in order of priority. The lower the number the higher the priority. For example, rules could be specified with
     * order numbers of 150, 250, and 350. The rule with the order number of 150 takes precedence over the rule that has
     * an order of 250. Allowed priorities are 150 to 4096. If any reserved or duplicate values are provided the request
     * fails with HTTP status code 400.
     *
     * @return the priority value.
     */
    public int priority() {
        return this.priority;
    }

    /**
     * Set the priority property: The priority for this rule. Priorities within a pool must be unique and are evaluated
     * in order of priority. The lower the number the higher the priority. For example, rules could be specified with
     * order numbers of 150, 250, and 350. The rule with the order number of 150 takes precedence over the rule that has
     * an order of 250. Allowed priorities are 150 to 4096. If any reserved or duplicate values are provided the request
     * fails with HTTP status code 400.
     *
     * @param priority the priority value to set.
     * @return the NetworkSecurityGroupRule object itself.
     */
    public NetworkSecurityGroupRule withPriority(int priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get the access property: The action that should be taken for a specified IP address, subnet range or tag.
     *
     * @return the access value.
     */
    public NetworkSecurityGroupRuleAccess access() {
        return this.access;
    }

    /**
     * Set the access property: The action that should be taken for a specified IP address, subnet range or tag.
     *
     * @param access the access value to set.
     * @return the NetworkSecurityGroupRule object itself.
     */
    public NetworkSecurityGroupRule withAccess(NetworkSecurityGroupRuleAccess access) {
        this.access = access;
        return this;
    }

    /**
     * Get the sourceAddressPrefix property: The source address prefix or tag to match for the rule. Valid values are a
     * single IP address (i.e. 10.10.10.10), IP subnet (i.e. 192.168.1.0/24), default tag, or * (for all addresses). If
     * any other values are provided the request fails with HTTP status code 400.
     *
     * @return the sourceAddressPrefix value.
     */
    public String sourceAddressPrefix() {
        return this.sourceAddressPrefix;
    }

    /**
     * Set the sourceAddressPrefix property: The source address prefix or tag to match for the rule. Valid values are a
     * single IP address (i.e. 10.10.10.10), IP subnet (i.e. 192.168.1.0/24), default tag, or * (for all addresses). If
     * any other values are provided the request fails with HTTP status code 400.
     *
     * @param sourceAddressPrefix the sourceAddressPrefix value to set.
     * @return the NetworkSecurityGroupRule object itself.
     */
    public NetworkSecurityGroupRule withSourceAddressPrefix(String sourceAddressPrefix) {
        this.sourceAddressPrefix = sourceAddressPrefix;
        return this;
    }

    /**
     * Get the sourcePortRanges property: The source port ranges to match for the rule. Valid values are '*' (for all
     * ports 0 - 65535) or arrays of ports or port ranges (i.e. 100-200). The ports should in the range of 0 to 65535
     * and the port ranges or ports can't overlap. If any other values are provided the request fails with HTTP status
     * code 400. Default value will be *.
     *
     * @return the sourcePortRanges value.
     */
    public List<String> sourcePortRanges() {
        return this.sourcePortRanges;
    }

    /**
     * Set the sourcePortRanges property: The source port ranges to match for the rule. Valid values are '*' (for all
     * ports 0 - 65535) or arrays of ports or port ranges (i.e. 100-200). The ports should in the range of 0 to 65535
     * and the port ranges or ports can't overlap. If any other values are provided the request fails with HTTP status
     * code 400. Default value will be *.
     *
     * @param sourcePortRanges the sourcePortRanges value to set.
     * @return the NetworkSecurityGroupRule object itself.
     */
    public NetworkSecurityGroupRule withSourcePortRanges(List<String> sourcePortRanges) {
        this.sourcePortRanges = sourcePortRanges;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (access() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property access in model NetworkSecurityGroupRule"));
        }
        if (sourceAddressPrefix() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property sourceAddressPrefix in model NetworkSecurityGroupRule"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(NetworkSecurityGroupRule.class);
}
