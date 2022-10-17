// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.models.CredentialReference;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Azure Databricks linked service properties. */
@Fluent
public final class AzureDatabricksLinkedServiceTypeProperties {
    /*
     * <REGION>.azuredatabricks.net, domain name of your Databricks deployment. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "domain", required = true)
    private Object domain;

    /*
     * Access token for databricks REST API. Refer to https://docs.azuredatabricks.net/api/latest/authentication.html.
     * Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "accessToken")
    private SecretBase accessToken;

    /*
     * Required to specify MSI, if using Workspace resource id for databricks REST API. Type: string (or Expression
     * with resultType string).
     */
    @JsonProperty(value = "authentication")
    private Object authentication;

    /*
     * Workspace resource id for databricks REST API. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "workspaceResourceId")
    private Object workspaceResourceId;

    /*
     * The id of an existing interactive cluster that will be used for all runs of this activity. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "existingClusterId")
    private Object existingClusterId;

    /*
     * The id of an existing instance pool that will be used for all runs of this activity. Type: string (or Expression
     * with resultType string).
     */
    @JsonProperty(value = "instancePoolId")
    private Object instancePoolId;

    /*
     * If not using an existing interactive cluster, this specifies the Spark version of a new job cluster or instance
     * pool nodes created for each run of this activity. Required if instancePoolId is specified. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "newClusterVersion")
    private Object newClusterVersion;

    /*
     * If not using an existing interactive cluster, this specifies the number of worker nodes to use for the new job
     * cluster or instance pool. For new job clusters, this a string-formatted Int32, like '1' means numOfWorker is 1
     * or '1:10' means auto-scale from 1 (min) to 10 (max). For instance pools, this is a string-formatted Int32, and
     * can only specify a fixed number of worker nodes, such as '2'. Required if newClusterVersion is specified. Type:
     * string (or Expression with resultType string).
     */
    @JsonProperty(value = "newClusterNumOfWorker")
    private Object newClusterNumOfWorker;

    /*
     * The node type of the new job cluster. This property is required if newClusterVersion is specified and
     * instancePoolId is not specified. If instancePoolId is specified, this property is ignored. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "newClusterNodeType")
    private Object newClusterNodeType;

    /*
     * A set of optional, user-specified Spark configuration key-value pairs.
     */
    @JsonProperty(value = "newClusterSparkConf")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, Object> newClusterSparkConf;

    /*
     * A set of optional, user-specified Spark environment variables key-value pairs.
     */
    @JsonProperty(value = "newClusterSparkEnvVars")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, Object> newClusterSparkEnvVars;

    /*
     * Additional tags for cluster resources. This property is ignored in instance pool configurations.
     */
    @JsonProperty(value = "newClusterCustomTags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, Object> newClusterCustomTags;

    /*
     * Specify a location to deliver Spark driver, worker, and event logs. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "newClusterLogDestination")
    private Object newClusterLogDestination;

    /*
     * The driver node type for the new job cluster. This property is ignored in instance pool configurations. Type:
     * string (or Expression with resultType string).
     */
    @JsonProperty(value = "newClusterDriverNodeType")
    private Object newClusterDriverNodeType;

    /*
     * User-defined initialization scripts for the new cluster. Type: array of strings (or Expression with resultType
     * array of strings).
     */
    @JsonProperty(value = "newClusterInitScripts")
    private Object newClusterInitScripts;

    /*
     * Enable the elastic disk on the new cluster. This property is now ignored, and takes the default elastic disk
     * behavior in Databricks (elastic disks are always enabled). Type: boolean (or Expression with resultType
     * boolean).
     */
    @JsonProperty(value = "newClusterEnableElasticDisk")
    private Object newClusterEnableElasticDisk;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "encryptedCredential")
    private Object encryptedCredential;

    /*
     * The policy id for limiting the ability to configure clusters based on a user defined set of rules. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "policyId")
    private Object policyId;

    /*
     * The credential reference containing authentication information.
     */
    @JsonProperty(value = "credential")
    private CredentialReference credential;

    /** Creates an instance of AzureDatabricksLinkedServiceTypeProperties class. */
    public AzureDatabricksLinkedServiceTypeProperties() {
    }

    /**
     * Get the domain property: &lt;REGION&gt;.azuredatabricks.net, domain name of your Databricks deployment. Type:
     * string (or Expression with resultType string).
     *
     * @return the domain value.
     */
    public Object domain() {
        return this.domain;
    }

    /**
     * Set the domain property: &lt;REGION&gt;.azuredatabricks.net, domain name of your Databricks deployment. Type:
     * string (or Expression with resultType string).
     *
     * @param domain the domain value to set.
     * @return the AzureDatabricksLinkedServiceTypeProperties object itself.
     */
    public AzureDatabricksLinkedServiceTypeProperties withDomain(Object domain) {
        this.domain = domain;
        return this;
    }

    /**
     * Get the accessToken property: Access token for databricks REST API. Refer to
     * https://docs.azuredatabricks.net/api/latest/authentication.html. Type: string (or Expression with resultType
     * string).
     *
     * @return the accessToken value.
     */
    public SecretBase accessToken() {
        return this.accessToken;
    }

    /**
     * Set the accessToken property: Access token for databricks REST API. Refer to
     * https://docs.azuredatabricks.net/api/latest/authentication.html. Type: string (or Expression with resultType
     * string).
     *
     * @param accessToken the accessToken value to set.
     * @return the AzureDatabricksLinkedServiceTypeProperties object itself.
     */
    public AzureDatabricksLinkedServiceTypeProperties withAccessToken(SecretBase accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    /**
     * Get the authentication property: Required to specify MSI, if using Workspace resource id for databricks REST API.
     * Type: string (or Expression with resultType string).
     *
     * @return the authentication value.
     */
    public Object authentication() {
        return this.authentication;
    }

    /**
     * Set the authentication property: Required to specify MSI, if using Workspace resource id for databricks REST API.
     * Type: string (or Expression with resultType string).
     *
     * @param authentication the authentication value to set.
     * @return the AzureDatabricksLinkedServiceTypeProperties object itself.
     */
    public AzureDatabricksLinkedServiceTypeProperties withAuthentication(Object authentication) {
        this.authentication = authentication;
        return this;
    }

    /**
     * Get the workspaceResourceId property: Workspace resource id for databricks REST API. Type: string (or Expression
     * with resultType string).
     *
     * @return the workspaceResourceId value.
     */
    public Object workspaceResourceId() {
        return this.workspaceResourceId;
    }

    /**
     * Set the workspaceResourceId property: Workspace resource id for databricks REST API. Type: string (or Expression
     * with resultType string).
     *
     * @param workspaceResourceId the workspaceResourceId value to set.
     * @return the AzureDatabricksLinkedServiceTypeProperties object itself.
     */
    public AzureDatabricksLinkedServiceTypeProperties withWorkspaceResourceId(Object workspaceResourceId) {
        this.workspaceResourceId = workspaceResourceId;
        return this;
    }

    /**
     * Get the existingClusterId property: The id of an existing interactive cluster that will be used for all runs of
     * this activity. Type: string (or Expression with resultType string).
     *
     * @return the existingClusterId value.
     */
    public Object existingClusterId() {
        return this.existingClusterId;
    }

    /**
     * Set the existingClusterId property: The id of an existing interactive cluster that will be used for all runs of
     * this activity. Type: string (or Expression with resultType string).
     *
     * @param existingClusterId the existingClusterId value to set.
     * @return the AzureDatabricksLinkedServiceTypeProperties object itself.
     */
    public AzureDatabricksLinkedServiceTypeProperties withExistingClusterId(Object existingClusterId) {
        this.existingClusterId = existingClusterId;
        return this;
    }

    /**
     * Get the instancePoolId property: The id of an existing instance pool that will be used for all runs of this
     * activity. Type: string (or Expression with resultType string).
     *
     * @return the instancePoolId value.
     */
    public Object instancePoolId() {
        return this.instancePoolId;
    }

    /**
     * Set the instancePoolId property: The id of an existing instance pool that will be used for all runs of this
     * activity. Type: string (or Expression with resultType string).
     *
     * @param instancePoolId the instancePoolId value to set.
     * @return the AzureDatabricksLinkedServiceTypeProperties object itself.
     */
    public AzureDatabricksLinkedServiceTypeProperties withInstancePoolId(Object instancePoolId) {
        this.instancePoolId = instancePoolId;
        return this;
    }

    /**
     * Get the newClusterVersion property: If not using an existing interactive cluster, this specifies the Spark
     * version of a new job cluster or instance pool nodes created for each run of this activity. Required if
     * instancePoolId is specified. Type: string (or Expression with resultType string).
     *
     * @return the newClusterVersion value.
     */
    public Object newClusterVersion() {
        return this.newClusterVersion;
    }

    /**
     * Set the newClusterVersion property: If not using an existing interactive cluster, this specifies the Spark
     * version of a new job cluster or instance pool nodes created for each run of this activity. Required if
     * instancePoolId is specified. Type: string (or Expression with resultType string).
     *
     * @param newClusterVersion the newClusterVersion value to set.
     * @return the AzureDatabricksLinkedServiceTypeProperties object itself.
     */
    public AzureDatabricksLinkedServiceTypeProperties withNewClusterVersion(Object newClusterVersion) {
        this.newClusterVersion = newClusterVersion;
        return this;
    }

    /**
     * Get the newClusterNumOfWorker property: If not using an existing interactive cluster, this specifies the number
     * of worker nodes to use for the new job cluster or instance pool. For new job clusters, this a string-formatted
     * Int32, like '1' means numOfWorker is 1 or '1:10' means auto-scale from 1 (min) to 10 (max). For instance pools,
     * this is a string-formatted Int32, and can only specify a fixed number of worker nodes, such as '2'. Required if
     * newClusterVersion is specified. Type: string (or Expression with resultType string).
     *
     * @return the newClusterNumOfWorker value.
     */
    public Object newClusterNumOfWorker() {
        return this.newClusterNumOfWorker;
    }

    /**
     * Set the newClusterNumOfWorker property: If not using an existing interactive cluster, this specifies the number
     * of worker nodes to use for the new job cluster or instance pool. For new job clusters, this a string-formatted
     * Int32, like '1' means numOfWorker is 1 or '1:10' means auto-scale from 1 (min) to 10 (max). For instance pools,
     * this is a string-formatted Int32, and can only specify a fixed number of worker nodes, such as '2'. Required if
     * newClusterVersion is specified. Type: string (or Expression with resultType string).
     *
     * @param newClusterNumOfWorker the newClusterNumOfWorker value to set.
     * @return the AzureDatabricksLinkedServiceTypeProperties object itself.
     */
    public AzureDatabricksLinkedServiceTypeProperties withNewClusterNumOfWorker(Object newClusterNumOfWorker) {
        this.newClusterNumOfWorker = newClusterNumOfWorker;
        return this;
    }

    /**
     * Get the newClusterNodeType property: The node type of the new job cluster. This property is required if
     * newClusterVersion is specified and instancePoolId is not specified. If instancePoolId is specified, this property
     * is ignored. Type: string (or Expression with resultType string).
     *
     * @return the newClusterNodeType value.
     */
    public Object newClusterNodeType() {
        return this.newClusterNodeType;
    }

    /**
     * Set the newClusterNodeType property: The node type of the new job cluster. This property is required if
     * newClusterVersion is specified and instancePoolId is not specified. If instancePoolId is specified, this property
     * is ignored. Type: string (or Expression with resultType string).
     *
     * @param newClusterNodeType the newClusterNodeType value to set.
     * @return the AzureDatabricksLinkedServiceTypeProperties object itself.
     */
    public AzureDatabricksLinkedServiceTypeProperties withNewClusterNodeType(Object newClusterNodeType) {
        this.newClusterNodeType = newClusterNodeType;
        return this;
    }

    /**
     * Get the newClusterSparkConf property: A set of optional, user-specified Spark configuration key-value pairs.
     *
     * @return the newClusterSparkConf value.
     */
    public Map<String, Object> newClusterSparkConf() {
        return this.newClusterSparkConf;
    }

    /**
     * Set the newClusterSparkConf property: A set of optional, user-specified Spark configuration key-value pairs.
     *
     * @param newClusterSparkConf the newClusterSparkConf value to set.
     * @return the AzureDatabricksLinkedServiceTypeProperties object itself.
     */
    public AzureDatabricksLinkedServiceTypeProperties withNewClusterSparkConf(Map<String, Object> newClusterSparkConf) {
        this.newClusterSparkConf = newClusterSparkConf;
        return this;
    }

    /**
     * Get the newClusterSparkEnvVars property: A set of optional, user-specified Spark environment variables key-value
     * pairs.
     *
     * @return the newClusterSparkEnvVars value.
     */
    public Map<String, Object> newClusterSparkEnvVars() {
        return this.newClusterSparkEnvVars;
    }

    /**
     * Set the newClusterSparkEnvVars property: A set of optional, user-specified Spark environment variables key-value
     * pairs.
     *
     * @param newClusterSparkEnvVars the newClusterSparkEnvVars value to set.
     * @return the AzureDatabricksLinkedServiceTypeProperties object itself.
     */
    public AzureDatabricksLinkedServiceTypeProperties withNewClusterSparkEnvVars(
        Map<String, Object> newClusterSparkEnvVars) {
        this.newClusterSparkEnvVars = newClusterSparkEnvVars;
        return this;
    }

    /**
     * Get the newClusterCustomTags property: Additional tags for cluster resources. This property is ignored in
     * instance pool configurations.
     *
     * @return the newClusterCustomTags value.
     */
    public Map<String, Object> newClusterCustomTags() {
        return this.newClusterCustomTags;
    }

    /**
     * Set the newClusterCustomTags property: Additional tags for cluster resources. This property is ignored in
     * instance pool configurations.
     *
     * @param newClusterCustomTags the newClusterCustomTags value to set.
     * @return the AzureDatabricksLinkedServiceTypeProperties object itself.
     */
    public AzureDatabricksLinkedServiceTypeProperties withNewClusterCustomTags(
        Map<String, Object> newClusterCustomTags) {
        this.newClusterCustomTags = newClusterCustomTags;
        return this;
    }

    /**
     * Get the newClusterLogDestination property: Specify a location to deliver Spark driver, worker, and event logs.
     * Type: string (or Expression with resultType string).
     *
     * @return the newClusterLogDestination value.
     */
    public Object newClusterLogDestination() {
        return this.newClusterLogDestination;
    }

    /**
     * Set the newClusterLogDestination property: Specify a location to deliver Spark driver, worker, and event logs.
     * Type: string (or Expression with resultType string).
     *
     * @param newClusterLogDestination the newClusterLogDestination value to set.
     * @return the AzureDatabricksLinkedServiceTypeProperties object itself.
     */
    public AzureDatabricksLinkedServiceTypeProperties withNewClusterLogDestination(Object newClusterLogDestination) {
        this.newClusterLogDestination = newClusterLogDestination;
        return this;
    }

    /**
     * Get the newClusterDriverNodeType property: The driver node type for the new job cluster. This property is ignored
     * in instance pool configurations. Type: string (or Expression with resultType string).
     *
     * @return the newClusterDriverNodeType value.
     */
    public Object newClusterDriverNodeType() {
        return this.newClusterDriverNodeType;
    }

    /**
     * Set the newClusterDriverNodeType property: The driver node type for the new job cluster. This property is ignored
     * in instance pool configurations. Type: string (or Expression with resultType string).
     *
     * @param newClusterDriverNodeType the newClusterDriverNodeType value to set.
     * @return the AzureDatabricksLinkedServiceTypeProperties object itself.
     */
    public AzureDatabricksLinkedServiceTypeProperties withNewClusterDriverNodeType(Object newClusterDriverNodeType) {
        this.newClusterDriverNodeType = newClusterDriverNodeType;
        return this;
    }

    /**
     * Get the newClusterInitScripts property: User-defined initialization scripts for the new cluster. Type: array of
     * strings (or Expression with resultType array of strings).
     *
     * @return the newClusterInitScripts value.
     */
    public Object newClusterInitScripts() {
        return this.newClusterInitScripts;
    }

    /**
     * Set the newClusterInitScripts property: User-defined initialization scripts for the new cluster. Type: array of
     * strings (or Expression with resultType array of strings).
     *
     * @param newClusterInitScripts the newClusterInitScripts value to set.
     * @return the AzureDatabricksLinkedServiceTypeProperties object itself.
     */
    public AzureDatabricksLinkedServiceTypeProperties withNewClusterInitScripts(Object newClusterInitScripts) {
        this.newClusterInitScripts = newClusterInitScripts;
        return this;
    }

    /**
     * Get the newClusterEnableElasticDisk property: Enable the elastic disk on the new cluster. This property is now
     * ignored, and takes the default elastic disk behavior in Databricks (elastic disks are always enabled). Type:
     * boolean (or Expression with resultType boolean).
     *
     * @return the newClusterEnableElasticDisk value.
     */
    public Object newClusterEnableElasticDisk() {
        return this.newClusterEnableElasticDisk;
    }

    /**
     * Set the newClusterEnableElasticDisk property: Enable the elastic disk on the new cluster. This property is now
     * ignored, and takes the default elastic disk behavior in Databricks (elastic disks are always enabled). Type:
     * boolean (or Expression with resultType boolean).
     *
     * @param newClusterEnableElasticDisk the newClusterEnableElasticDisk value to set.
     * @return the AzureDatabricksLinkedServiceTypeProperties object itself.
     */
    public AzureDatabricksLinkedServiceTypeProperties withNewClusterEnableElasticDisk(
        Object newClusterEnableElasticDisk) {
        this.newClusterEnableElasticDisk = newClusterEnableElasticDisk;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value.
     */
    public Object encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the AzureDatabricksLinkedServiceTypeProperties object itself.
     */
    public AzureDatabricksLinkedServiceTypeProperties withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Get the policyId property: The policy id for limiting the ability to configure clusters based on a user defined
     * set of rules. Type: string (or Expression with resultType string).
     *
     * @return the policyId value.
     */
    public Object policyId() {
        return this.policyId;
    }

    /**
     * Set the policyId property: The policy id for limiting the ability to configure clusters based on a user defined
     * set of rules. Type: string (or Expression with resultType string).
     *
     * @param policyId the policyId value to set.
     * @return the AzureDatabricksLinkedServiceTypeProperties object itself.
     */
    public AzureDatabricksLinkedServiceTypeProperties withPolicyId(Object policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * Get the credential property: The credential reference containing authentication information.
     *
     * @return the credential value.
     */
    public CredentialReference credential() {
        return this.credential;
    }

    /**
     * Set the credential property: The credential reference containing authentication information.
     *
     * @param credential the credential value to set.
     * @return the AzureDatabricksLinkedServiceTypeProperties object itself.
     */
    public AzureDatabricksLinkedServiceTypeProperties withCredential(CredentialReference credential) {
        this.credential = credential;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (domain() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property domain in model AzureDatabricksLinkedServiceTypeProperties"));
        }
        if (accessToken() != null) {
            accessToken().validate();
        }
        if (credential() != null) {
            credential().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AzureDatabricksLinkedServiceTypeProperties.class);
}
