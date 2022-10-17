// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of Vpn-Sites. */
@Fluent
public final class GetVpnSitesConfigurationRequest {
    /*
     * List of resource-ids of the vpn-sites for which config is to be downloaded.
     */
    @JsonProperty(value = "vpnSites")
    private List<String> vpnSites;

    /*
     * The sas-url to download the configurations for vpn-sites.
     */
    @JsonProperty(value = "outputBlobSasUrl", required = true)
    private String outputBlobSasUrl;

    /** Creates an instance of GetVpnSitesConfigurationRequest class. */
    public GetVpnSitesConfigurationRequest() {
    }

    /**
     * Get the vpnSites property: List of resource-ids of the vpn-sites for which config is to be downloaded.
     *
     * @return the vpnSites value.
     */
    public List<String> vpnSites() {
        return this.vpnSites;
    }

    /**
     * Set the vpnSites property: List of resource-ids of the vpn-sites for which config is to be downloaded.
     *
     * @param vpnSites the vpnSites value to set.
     * @return the GetVpnSitesConfigurationRequest object itself.
     */
    public GetVpnSitesConfigurationRequest withVpnSites(List<String> vpnSites) {
        this.vpnSites = vpnSites;
        return this;
    }

    /**
     * Get the outputBlobSasUrl property: The sas-url to download the configurations for vpn-sites.
     *
     * @return the outputBlobSasUrl value.
     */
    public String outputBlobSasUrl() {
        return this.outputBlobSasUrl;
    }

    /**
     * Set the outputBlobSasUrl property: The sas-url to download the configurations for vpn-sites.
     *
     * @param outputBlobSasUrl the outputBlobSasUrl value to set.
     * @return the GetVpnSitesConfigurationRequest object itself.
     */
    public GetVpnSitesConfigurationRequest withOutputBlobSasUrl(String outputBlobSasUrl) {
        this.outputBlobSasUrl = outputBlobSasUrl;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (outputBlobSasUrl() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property outputBlobSasUrl in model GetVpnSitesConfigurationRequest"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(GetVpnSitesConfigurationRequest.class);
}
