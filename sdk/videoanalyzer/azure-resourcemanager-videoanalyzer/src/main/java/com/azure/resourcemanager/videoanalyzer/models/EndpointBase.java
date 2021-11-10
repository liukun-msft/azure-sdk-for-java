// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Base class for endpoints. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "@type",
    defaultImpl = EndpointBase.class)
@JsonTypeName("EndpointBase")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "#Microsoft.VideoAnalyzer.UnsecuredEndpoint", value = UnsecuredEndpoint.class),
    @JsonSubTypes.Type(name = "#Microsoft.VideoAnalyzer.TlsEndpoint", value = TlsEndpoint.class)
})
@Fluent
public class EndpointBase {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EndpointBase.class);

    /*
     * Credentials to be presented to the endpoint.
     */
    @JsonProperty(value = "credentials", required = true)
    private CredentialsBase credentials;

    /*
     * The endpoint URL for Video Analyzer to connect to.
     */
    @JsonProperty(value = "url", required = true)
    private String url;

    /*
     * Describes the tunnel through which Video Analyzer can connect to the
     * endpoint URL. This is an optional property, typically used when the
     * endpoint is behind a firewall.
     */
    @JsonProperty(value = "tunnel")
    private TunnelBase tunnel;

    /**
     * Get the credentials property: Credentials to be presented to the endpoint.
     *
     * @return the credentials value.
     */
    public CredentialsBase credentials() {
        return this.credentials;
    }

    /**
     * Set the credentials property: Credentials to be presented to the endpoint.
     *
     * @param credentials the credentials value to set.
     * @return the EndpointBase object itself.
     */
    public EndpointBase withCredentials(CredentialsBase credentials) {
        this.credentials = credentials;
        return this;
    }

    /**
     * Get the url property: The endpoint URL for Video Analyzer to connect to.
     *
     * @return the url value.
     */
    public String url() {
        return this.url;
    }

    /**
     * Set the url property: The endpoint URL for Video Analyzer to connect to.
     *
     * @param url the url value to set.
     * @return the EndpointBase object itself.
     */
    public EndpointBase withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get the tunnel property: Describes the tunnel through which Video Analyzer can connect to the endpoint URL. This
     * is an optional property, typically used when the endpoint is behind a firewall.
     *
     * @return the tunnel value.
     */
    public TunnelBase tunnel() {
        return this.tunnel;
    }

    /**
     * Set the tunnel property: Describes the tunnel through which Video Analyzer can connect to the endpoint URL. This
     * is an optional property, typically used when the endpoint is behind a firewall.
     *
     * @param tunnel the tunnel value to set.
     * @return the EndpointBase object itself.
     */
    public EndpointBase withTunnel(TunnelBase tunnel) {
        this.tunnel = tunnel;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (credentials() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property credentials in model EndpointBase"));
        } else {
            credentials().validate();
        }
        if (url() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property url in model EndpointBase"));
        }
        if (tunnel() != null) {
            tunnel().validate();
        }
    }
}
