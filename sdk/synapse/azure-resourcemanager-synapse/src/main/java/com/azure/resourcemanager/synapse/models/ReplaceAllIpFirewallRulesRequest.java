// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.synapse.fluent.models.IpFirewallRuleProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Replace all IP firewall rules request. */
@Fluent
public final class ReplaceAllIpFirewallRulesRequest {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ReplaceAllIpFirewallRulesRequest.class);

    /*
     * IP firewall rule properties
     */
    @JsonProperty(value = "ipFirewallRules")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, IpFirewallRuleProperties> ipFirewallRules;

    /**
     * Get the ipFirewallRules property: IP firewall rule properties.
     *
     * @return the ipFirewallRules value.
     */
    public Map<String, IpFirewallRuleProperties> ipFirewallRules() {
        return this.ipFirewallRules;
    }

    /**
     * Set the ipFirewallRules property: IP firewall rule properties.
     *
     * @param ipFirewallRules the ipFirewallRules value to set.
     * @return the ReplaceAllIpFirewallRulesRequest object itself.
     */
    public ReplaceAllIpFirewallRulesRequest withIpFirewallRules(Map<String, IpFirewallRuleProperties> ipFirewallRules) {
        this.ipFirewallRules = ipFirewallRules;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (ipFirewallRules() != null) {
            ipFirewallRules()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
    }
}
