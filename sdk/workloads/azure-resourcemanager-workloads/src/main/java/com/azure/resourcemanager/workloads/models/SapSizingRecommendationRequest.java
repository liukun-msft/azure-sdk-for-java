// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The SAP Sizing Recommendation request. */
@Fluent
public final class SapSizingRecommendationRequest {
    /*
     * The geo-location where the resource is to be created.
     */
    @JsonProperty(value = "appLocation", required = true)
    private String appLocation;

    /*
     * Defines the environment type - Production/Non Production.
     */
    @JsonProperty(value = "environment", required = true)
    private SapEnvironmentType environment;

    /*
     * Defines the SAP Product type.
     */
    @JsonProperty(value = "sapProduct", required = true)
    private SapProductType sapProduct;

    /*
     * The deployment type. Eg: SingleServer/ThreeTier
     */
    @JsonProperty(value = "deploymentType", required = true)
    private SapDeploymentType deploymentType;

    /*
     * The SAP Application Performance Standard measurement.
     */
    @JsonProperty(value = "saps", required = true)
    private long saps;

    /*
     * The database memory configuration.
     */
    @JsonProperty(value = "dbMemory", required = true)
    private long dbMemory;

    /*
     * The database type.
     */
    @JsonProperty(value = "databaseType", required = true)
    private SapDatabaseType databaseType;

    /*
     * The DB scale method.
     */
    @JsonProperty(value = "dbScaleMethod")
    private SapDatabaseScaleMethod dbScaleMethod;

    /*
     * The high availability type.
     */
    @JsonProperty(value = "highAvailabilityType")
    private SapHighAvailabilityType highAvailabilityType;

    /**
     * Get the appLocation property: The geo-location where the resource is to be created.
     *
     * @return the appLocation value.
     */
    public String appLocation() {
        return this.appLocation;
    }

    /**
     * Set the appLocation property: The geo-location where the resource is to be created.
     *
     * @param appLocation the appLocation value to set.
     * @return the SapSizingRecommendationRequest object itself.
     */
    public SapSizingRecommendationRequest withAppLocation(String appLocation) {
        this.appLocation = appLocation;
        return this;
    }

    /**
     * Get the environment property: Defines the environment type - Production/Non Production.
     *
     * @return the environment value.
     */
    public SapEnvironmentType environment() {
        return this.environment;
    }

    /**
     * Set the environment property: Defines the environment type - Production/Non Production.
     *
     * @param environment the environment value to set.
     * @return the SapSizingRecommendationRequest object itself.
     */
    public SapSizingRecommendationRequest withEnvironment(SapEnvironmentType environment) {
        this.environment = environment;
        return this;
    }

    /**
     * Get the sapProduct property: Defines the SAP Product type.
     *
     * @return the sapProduct value.
     */
    public SapProductType sapProduct() {
        return this.sapProduct;
    }

    /**
     * Set the sapProduct property: Defines the SAP Product type.
     *
     * @param sapProduct the sapProduct value to set.
     * @return the SapSizingRecommendationRequest object itself.
     */
    public SapSizingRecommendationRequest withSapProduct(SapProductType sapProduct) {
        this.sapProduct = sapProduct;
        return this;
    }

    /**
     * Get the deploymentType property: The deployment type. Eg: SingleServer/ThreeTier.
     *
     * @return the deploymentType value.
     */
    public SapDeploymentType deploymentType() {
        return this.deploymentType;
    }

    /**
     * Set the deploymentType property: The deployment type. Eg: SingleServer/ThreeTier.
     *
     * @param deploymentType the deploymentType value to set.
     * @return the SapSizingRecommendationRequest object itself.
     */
    public SapSizingRecommendationRequest withDeploymentType(SapDeploymentType deploymentType) {
        this.deploymentType = deploymentType;
        return this;
    }

    /**
     * Get the saps property: The SAP Application Performance Standard measurement.
     *
     * @return the saps value.
     */
    public long saps() {
        return this.saps;
    }

    /**
     * Set the saps property: The SAP Application Performance Standard measurement.
     *
     * @param saps the saps value to set.
     * @return the SapSizingRecommendationRequest object itself.
     */
    public SapSizingRecommendationRequest withSaps(long saps) {
        this.saps = saps;
        return this;
    }

    /**
     * Get the dbMemory property: The database memory configuration.
     *
     * @return the dbMemory value.
     */
    public long dbMemory() {
        return this.dbMemory;
    }

    /**
     * Set the dbMemory property: The database memory configuration.
     *
     * @param dbMemory the dbMemory value to set.
     * @return the SapSizingRecommendationRequest object itself.
     */
    public SapSizingRecommendationRequest withDbMemory(long dbMemory) {
        this.dbMemory = dbMemory;
        return this;
    }

    /**
     * Get the databaseType property: The database type.
     *
     * @return the databaseType value.
     */
    public SapDatabaseType databaseType() {
        return this.databaseType;
    }

    /**
     * Set the databaseType property: The database type.
     *
     * @param databaseType the databaseType value to set.
     * @return the SapSizingRecommendationRequest object itself.
     */
    public SapSizingRecommendationRequest withDatabaseType(SapDatabaseType databaseType) {
        this.databaseType = databaseType;
        return this;
    }

    /**
     * Get the dbScaleMethod property: The DB scale method.
     *
     * @return the dbScaleMethod value.
     */
    public SapDatabaseScaleMethod dbScaleMethod() {
        return this.dbScaleMethod;
    }

    /**
     * Set the dbScaleMethod property: The DB scale method.
     *
     * @param dbScaleMethod the dbScaleMethod value to set.
     * @return the SapSizingRecommendationRequest object itself.
     */
    public SapSizingRecommendationRequest withDbScaleMethod(SapDatabaseScaleMethod dbScaleMethod) {
        this.dbScaleMethod = dbScaleMethod;
        return this;
    }

    /**
     * Get the highAvailabilityType property: The high availability type.
     *
     * @return the highAvailabilityType value.
     */
    public SapHighAvailabilityType highAvailabilityType() {
        return this.highAvailabilityType;
    }

    /**
     * Set the highAvailabilityType property: The high availability type.
     *
     * @param highAvailabilityType the highAvailabilityType value to set.
     * @return the SapSizingRecommendationRequest object itself.
     */
    public SapSizingRecommendationRequest withHighAvailabilityType(SapHighAvailabilityType highAvailabilityType) {
        this.highAvailabilityType = highAvailabilityType;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (appLocation() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property appLocation in model SapSizingRecommendationRequest"));
        }
        if (environment() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property environment in model SapSizingRecommendationRequest"));
        }
        if (sapProduct() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property sapProduct in model SapSizingRecommendationRequest"));
        }
        if (deploymentType() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property deploymentType in model SapSizingRecommendationRequest"));
        }
        if (databaseType() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property databaseType in model SapSizingRecommendationRequest"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SapSizingRecommendationRequest.class);
}
