// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.machinelearning.fluent.models.WorkspaceInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of Workspace. */
public interface Workspace {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the identity property: The identity of the resource.
     *
     * @return the identity value.
     */
    ManagedServiceIdentity identity();

    /**
     * Gets the location property: Specifies the location of the resource.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Contains resource tags defined as key/value pairs.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the sku property: The sku of the workspace.
     *
     * @return the sku value.
     */
    Sku sku();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the workspaceId property: The immutable id associated with this workspace.
     *
     * @return the workspaceId value.
     */
    String workspaceId();

    /**
     * Gets the description property: The description of this workspace.
     *
     * @return the description value.
     */
    String description();

    /**
     * Gets the friendlyName property: The friendly name for this workspace. This name in mutable.
     *
     * @return the friendlyName value.
     */
    String friendlyName();

    /**
     * Gets the keyVault property: ARM id of the key vault associated with this workspace. This cannot be changed once
     * the workspace has been created.
     *
     * @return the keyVault value.
     */
    String keyVault();

    /**
     * Gets the applicationInsights property: ARM id of the application insights associated with this workspace.
     *
     * @return the applicationInsights value.
     */
    String applicationInsights();

    /**
     * Gets the containerRegistry property: ARM id of the container registry associated with this workspace.
     *
     * @return the containerRegistry value.
     */
    String containerRegistry();

    /**
     * Gets the storageAccount property: ARM id of the storage account associated with this workspace. This cannot be
     * changed once the workspace has been created.
     *
     * @return the storageAccount value.
     */
    String storageAccount();

    /**
     * Gets the discoveryUrl property: Url for the discovery service to identify regional endpoints for machine learning
     * experimentation services.
     *
     * @return the discoveryUrl value.
     */
    String discoveryUrl();

    /**
     * Gets the provisioningState property: The current deployment state of workspace resource. The provisioningState is
     * to indicate states for resource provisioning.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the encryption property: The encryption settings of Azure ML workspace.
     *
     * @return the encryption value.
     */
    EncryptionProperty encryption();

    /**
     * Gets the hbiWorkspace property: The flag to signal HBI data in the workspace and reduce diagnostic data collected
     * by the service.
     *
     * @return the hbiWorkspace value.
     */
    Boolean hbiWorkspace();

    /**
     * Gets the serviceProvisionedResourceGroup property: The name of the managed resource group created by workspace RP
     * in customer subscription if the workspace is CMK workspace.
     *
     * @return the serviceProvisionedResourceGroup value.
     */
    String serviceProvisionedResourceGroup();

    /**
     * Gets the privateLinkCount property: Count of private connections in the workspace.
     *
     * @return the privateLinkCount value.
     */
    Integer privateLinkCount();

    /**
     * Gets the imageBuildCompute property: The compute name for image build.
     *
     * @return the imageBuildCompute value.
     */
    String imageBuildCompute();

    /**
     * Gets the allowPublicAccessWhenBehindVnet property: The flag to indicate whether to allow public access when
     * behind VNet.
     *
     * @return the allowPublicAccessWhenBehindVnet value.
     */
    Boolean allowPublicAccessWhenBehindVnet();

    /**
     * Gets the publicNetworkAccess property: Whether requests from Public Network are allowed.
     *
     * @return the publicNetworkAccess value.
     */
    PublicNetworkAccess publicNetworkAccess();

    /**
     * Gets the privateEndpointConnections property: The list of private endpoint connections in the workspace.
     *
     * @return the privateEndpointConnections value.
     */
    List<PrivateEndpointConnection> privateEndpointConnections();

    /**
     * Gets the sharedPrivateLinkResources property: The list of shared private link resources in this workspace.
     *
     * @return the sharedPrivateLinkResources value.
     */
    List<SharedPrivateLinkResource> sharedPrivateLinkResources();

    /**
     * Gets the notebookInfo property: The notebook info of Azure ML workspace.
     *
     * @return the notebookInfo value.
     */
    NotebookResourceInfo notebookInfo();

    /**
     * Gets the serviceManagedResourcesSettings property: The service managed resource settings.
     *
     * @return the serviceManagedResourcesSettings value.
     */
    ServiceManagedResourcesSettings serviceManagedResourcesSettings();

    /**
     * Gets the primaryUserAssignedIdentity property: The user assigned identity resource id that represents the
     * workspace identity.
     *
     * @return the primaryUserAssignedIdentity value.
     */
    String primaryUserAssignedIdentity();

    /**
     * Gets the tenantId property: The tenant id associated with this workspace.
     *
     * @return the tenantId value.
     */
    String tenantId();

    /**
     * Gets the storageHnsEnabled property: If the storage associated with the workspace has hierarchical namespace(HNS)
     * enabled.
     *
     * @return the storageHnsEnabled value.
     */
    Boolean storageHnsEnabled();

    /**
     * Gets the mlFlowTrackingUri property: The URI associated with this workspace that machine learning flow must point
     * at to set up tracking.
     *
     * @return the mlFlowTrackingUri value.
     */
    String mlFlowTrackingUri();

    /**
     * Gets the v1LegacyMode property: Enabling v1_legacy_mode may prevent you from using features provided by the v2
     * API.
     *
     * @return the v1LegacyMode value.
     */
    Boolean v1LegacyMode();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.machinelearning.fluent.models.WorkspaceInner object.
     *
     * @return the inner object.
     */
    WorkspaceInner innerModel();

    /** The entirety of the Workspace definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithResourceGroup, DefinitionStages.WithCreate {
    }
    /** The Workspace definition stages. */
    interface DefinitionStages {
        /** The first stage of the Workspace definition. */
        interface Blank extends WithResourceGroup {
        }
        /** The stage of the Workspace definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }
        /**
         * The stage of the Workspace definition which contains all the minimum required properties for the resource to
         * be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithLocation,
                DefinitionStages.WithTags,
                DefinitionStages.WithIdentity,
                DefinitionStages.WithSku,
                DefinitionStages.WithDescription,
                DefinitionStages.WithFriendlyName,
                DefinitionStages.WithKeyVault,
                DefinitionStages.WithApplicationInsights,
                DefinitionStages.WithContainerRegistry,
                DefinitionStages.WithStorageAccount,
                DefinitionStages.WithDiscoveryUrl,
                DefinitionStages.WithEncryption,
                DefinitionStages.WithHbiWorkspace,
                DefinitionStages.WithImageBuildCompute,
                DefinitionStages.WithAllowPublicAccessWhenBehindVnet,
                DefinitionStages.WithPublicNetworkAccess,
                DefinitionStages.WithSharedPrivateLinkResources,
                DefinitionStages.WithServiceManagedResourcesSettings,
                DefinitionStages.WithPrimaryUserAssignedIdentity,
                DefinitionStages.WithV1LegacyMode {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Workspace create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Workspace create(Context context);
        }
        /** The stage of the Workspace definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location Specifies the location of the resource.
             * @return the next definition stage.
             */
            WithCreate withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location Specifies the location of the resource.
             * @return the next definition stage.
             */
            WithCreate withRegion(String location);
        }
        /** The stage of the Workspace definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Contains resource tags defined as key/value pairs..
             *
             * @param tags Contains resource tags defined as key/value pairs.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the Workspace definition allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: The identity of the resource..
             *
             * @param identity The identity of the resource.
             * @return the next definition stage.
             */
            WithCreate withIdentity(ManagedServiceIdentity identity);
        }
        /** The stage of the Workspace definition allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: The sku of the workspace..
             *
             * @param sku The sku of the workspace.
             * @return the next definition stage.
             */
            WithCreate withSku(Sku sku);
        }
        /** The stage of the Workspace definition allowing to specify description. */
        interface WithDescription {
            /**
             * Specifies the description property: The description of this workspace..
             *
             * @param description The description of this workspace.
             * @return the next definition stage.
             */
            WithCreate withDescription(String description);
        }
        /** The stage of the Workspace definition allowing to specify friendlyName. */
        interface WithFriendlyName {
            /**
             * Specifies the friendlyName property: The friendly name for this workspace. This name in mutable.
             *
             * @param friendlyName The friendly name for this workspace. This name in mutable.
             * @return the next definition stage.
             */
            WithCreate withFriendlyName(String friendlyName);
        }
        /** The stage of the Workspace definition allowing to specify keyVault. */
        interface WithKeyVault {
            /**
             * Specifies the keyVault property: ARM id of the key vault associated with this workspace. This cannot be
             * changed once the workspace has been created.
             *
             * @param keyVault ARM id of the key vault associated with this workspace. This cannot be changed once the
             *     workspace has been created.
             * @return the next definition stage.
             */
            WithCreate withKeyVault(String keyVault);
        }
        /** The stage of the Workspace definition allowing to specify applicationInsights. */
        interface WithApplicationInsights {
            /**
             * Specifies the applicationInsights property: ARM id of the application insights associated with this
             * workspace..
             *
             * @param applicationInsights ARM id of the application insights associated with this workspace.
             * @return the next definition stage.
             */
            WithCreate withApplicationInsights(String applicationInsights);
        }
        /** The stage of the Workspace definition allowing to specify containerRegistry. */
        interface WithContainerRegistry {
            /**
             * Specifies the containerRegistry property: ARM id of the container registry associated with this
             * workspace..
             *
             * @param containerRegistry ARM id of the container registry associated with this workspace.
             * @return the next definition stage.
             */
            WithCreate withContainerRegistry(String containerRegistry);
        }
        /** The stage of the Workspace definition allowing to specify storageAccount. */
        interface WithStorageAccount {
            /**
             * Specifies the storageAccount property: ARM id of the storage account associated with this workspace. This
             * cannot be changed once the workspace has been created.
             *
             * @param storageAccount ARM id of the storage account associated with this workspace. This cannot be
             *     changed once the workspace has been created.
             * @return the next definition stage.
             */
            WithCreate withStorageAccount(String storageAccount);
        }
        /** The stage of the Workspace definition allowing to specify discoveryUrl. */
        interface WithDiscoveryUrl {
            /**
             * Specifies the discoveryUrl property: Url for the discovery service to identify regional endpoints for
             * machine learning experimentation services.
             *
             * @param discoveryUrl Url for the discovery service to identify regional endpoints for machine learning
             *     experimentation services.
             * @return the next definition stage.
             */
            WithCreate withDiscoveryUrl(String discoveryUrl);
        }
        /** The stage of the Workspace definition allowing to specify encryption. */
        interface WithEncryption {
            /**
             * Specifies the encryption property: The encryption settings of Azure ML workspace..
             *
             * @param encryption The encryption settings of Azure ML workspace.
             * @return the next definition stage.
             */
            WithCreate withEncryption(EncryptionProperty encryption);
        }
        /** The stage of the Workspace definition allowing to specify hbiWorkspace. */
        interface WithHbiWorkspace {
            /**
             * Specifies the hbiWorkspace property: The flag to signal HBI data in the workspace and reduce diagnostic
             * data collected by the service.
             *
             * @param hbiWorkspace The flag to signal HBI data in the workspace and reduce diagnostic data collected by
             *     the service.
             * @return the next definition stage.
             */
            WithCreate withHbiWorkspace(Boolean hbiWorkspace);
        }
        /** The stage of the Workspace definition allowing to specify imageBuildCompute. */
        interface WithImageBuildCompute {
            /**
             * Specifies the imageBuildCompute property: The compute name for image build.
             *
             * @param imageBuildCompute The compute name for image build.
             * @return the next definition stage.
             */
            WithCreate withImageBuildCompute(String imageBuildCompute);
        }
        /** The stage of the Workspace definition allowing to specify allowPublicAccessWhenBehindVnet. */
        interface WithAllowPublicAccessWhenBehindVnet {
            /**
             * Specifies the allowPublicAccessWhenBehindVnet property: The flag to indicate whether to allow public
             * access when behind VNet..
             *
             * @param allowPublicAccessWhenBehindVnet The flag to indicate whether to allow public access when behind
             *     VNet.
             * @return the next definition stage.
             */
            WithCreate withAllowPublicAccessWhenBehindVnet(Boolean allowPublicAccessWhenBehindVnet);
        }
        /** The stage of the Workspace definition allowing to specify publicNetworkAccess. */
        interface WithPublicNetworkAccess {
            /**
             * Specifies the publicNetworkAccess property: Whether requests from Public Network are allowed..
             *
             * @param publicNetworkAccess Whether requests from Public Network are allowed.
             * @return the next definition stage.
             */
            WithCreate withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess);
        }
        /** The stage of the Workspace definition allowing to specify sharedPrivateLinkResources. */
        interface WithSharedPrivateLinkResources {
            /**
             * Specifies the sharedPrivateLinkResources property: The list of shared private link resources in this
             * workspace..
             *
             * @param sharedPrivateLinkResources The list of shared private link resources in this workspace.
             * @return the next definition stage.
             */
            WithCreate withSharedPrivateLinkResources(List<SharedPrivateLinkResource> sharedPrivateLinkResources);
        }
        /** The stage of the Workspace definition allowing to specify serviceManagedResourcesSettings. */
        interface WithServiceManagedResourcesSettings {
            /**
             * Specifies the serviceManagedResourcesSettings property: The service managed resource settings..
             *
             * @param serviceManagedResourcesSettings The service managed resource settings.
             * @return the next definition stage.
             */
            WithCreate withServiceManagedResourcesSettings(
                ServiceManagedResourcesSettings serviceManagedResourcesSettings);
        }
        /** The stage of the Workspace definition allowing to specify primaryUserAssignedIdentity. */
        interface WithPrimaryUserAssignedIdentity {
            /**
             * Specifies the primaryUserAssignedIdentity property: The user assigned identity resource id that
             * represents the workspace identity..
             *
             * @param primaryUserAssignedIdentity The user assigned identity resource id that represents the workspace
             *     identity.
             * @return the next definition stage.
             */
            WithCreate withPrimaryUserAssignedIdentity(String primaryUserAssignedIdentity);
        }
        /** The stage of the Workspace definition allowing to specify v1LegacyMode. */
        interface WithV1LegacyMode {
            /**
             * Specifies the v1LegacyMode property: Enabling v1_legacy_mode may prevent you from using features provided
             * by the v2 API..
             *
             * @param v1LegacyMode Enabling v1_legacy_mode may prevent you from using features provided by the v2 API.
             * @return the next definition stage.
             */
            WithCreate withV1LegacyMode(Boolean v1LegacyMode);
        }
    }
    /**
     * Begins update for the Workspace resource.
     *
     * @return the stage of resource update.
     */
    Workspace.Update update();

    /** The template for Workspace update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithSku,
            UpdateStages.WithIdentity,
            UpdateStages.WithDescription,
            UpdateStages.WithFriendlyName,
            UpdateStages.WithImageBuildCompute,
            UpdateStages.WithServiceManagedResourcesSettings,
            UpdateStages.WithPrimaryUserAssignedIdentity,
            UpdateStages.WithPublicNetworkAccess,
            UpdateStages.WithApplicationInsights,
            UpdateStages.WithContainerRegistry {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        Workspace apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Workspace apply(Context context);
    }
    /** The Workspace update stages. */
    interface UpdateStages {
        /** The stage of the Workspace update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: The resource tags for the machine learning workspace..
             *
             * @param tags The resource tags for the machine learning workspace.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the Workspace update allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: The sku of the workspace..
             *
             * @param sku The sku of the workspace.
             * @return the next definition stage.
             */
            Update withSku(Sku sku);
        }
        /** The stage of the Workspace update allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: The identity of the resource..
             *
             * @param identity The identity of the resource.
             * @return the next definition stage.
             */
            Update withIdentity(ManagedServiceIdentity identity);
        }
        /** The stage of the Workspace update allowing to specify description. */
        interface WithDescription {
            /**
             * Specifies the description property: The description of this workspace..
             *
             * @param description The description of this workspace.
             * @return the next definition stage.
             */
            Update withDescription(String description);
        }
        /** The stage of the Workspace update allowing to specify friendlyName. */
        interface WithFriendlyName {
            /**
             * Specifies the friendlyName property: The friendly name for this workspace..
             *
             * @param friendlyName The friendly name for this workspace.
             * @return the next definition stage.
             */
            Update withFriendlyName(String friendlyName);
        }
        /** The stage of the Workspace update allowing to specify imageBuildCompute. */
        interface WithImageBuildCompute {
            /**
             * Specifies the imageBuildCompute property: The compute name for image build.
             *
             * @param imageBuildCompute The compute name for image build.
             * @return the next definition stage.
             */
            Update withImageBuildCompute(String imageBuildCompute);
        }
        /** The stage of the Workspace update allowing to specify serviceManagedResourcesSettings. */
        interface WithServiceManagedResourcesSettings {
            /**
             * Specifies the serviceManagedResourcesSettings property: The service managed resource settings..
             *
             * @param serviceManagedResourcesSettings The service managed resource settings.
             * @return the next definition stage.
             */
            Update withServiceManagedResourcesSettings(ServiceManagedResourcesSettings serviceManagedResourcesSettings);
        }
        /** The stage of the Workspace update allowing to specify primaryUserAssignedIdentity. */
        interface WithPrimaryUserAssignedIdentity {
            /**
             * Specifies the primaryUserAssignedIdentity property: The user assigned identity resource id that
             * represents the workspace identity..
             *
             * @param primaryUserAssignedIdentity The user assigned identity resource id that represents the workspace
             *     identity.
             * @return the next definition stage.
             */
            Update withPrimaryUserAssignedIdentity(String primaryUserAssignedIdentity);
        }
        /** The stage of the Workspace update allowing to specify publicNetworkAccess. */
        interface WithPublicNetworkAccess {
            /**
             * Specifies the publicNetworkAccess property: Whether requests from Public Network are allowed..
             *
             * @param publicNetworkAccess Whether requests from Public Network are allowed.
             * @return the next definition stage.
             */
            Update withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess);
        }
        /** The stage of the Workspace update allowing to specify applicationInsights. */
        interface WithApplicationInsights {
            /**
             * Specifies the applicationInsights property: ARM id of the application insights associated with this
             * workspace..
             *
             * @param applicationInsights ARM id of the application insights associated with this workspace.
             * @return the next definition stage.
             */
            Update withApplicationInsights(String applicationInsights);
        }
        /** The stage of the Workspace update allowing to specify containerRegistry. */
        interface WithContainerRegistry {
            /**
             * Specifies the containerRegistry property: ARM id of the container registry associated with this
             * workspace..
             *
             * @param containerRegistry ARM id of the container registry associated with this workspace.
             * @return the next definition stage.
             */
            Update withContainerRegistry(String containerRegistry);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    Workspace refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Workspace refresh(Context context);

    /**
     * Diagnose workspace setup issue.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    DiagnoseResponseResult diagnose();

    /**
     * Diagnose workspace setup issue.
     *
     * @param parameters The parameter of diagnosing workspace health.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    DiagnoseResponseResult diagnose(DiagnoseWorkspaceParameters parameters, Context context);

    /**
     * Lists all the keys associated with this workspace. This includes keys for the storage account, app insights and
     * password for container registry.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response}.
     */
    Response<ListWorkspaceKeysResult> listKeysWithResponse(Context context);

    /**
     * Lists all the keys associated with this workspace. This includes keys for the storage account, app insights and
     * password for container registry.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    ListWorkspaceKeysResult listKeys();

    /**
     * Resync all the keys associated with this workspace. This includes keys for the storage account, app insights and
     * password for container registry.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void resyncKeys();

    /**
     * Resync all the keys associated with this workspace. This includes keys for the storage account, app insights and
     * password for container registry.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void resyncKeys(Context context);

    /**
     * return notebook access token and refresh token.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response}.
     */
    Response<NotebookAccessTokenResult> listNotebookAccessTokenWithResponse(Context context);

    /**
     * return notebook access token and refresh token.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    NotebookAccessTokenResult listNotebookAccessToken();

    /**
     * Prepare a notebook.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    NotebookResourceInfo prepareNotebook();

    /**
     * Prepare a notebook.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    NotebookResourceInfo prepareNotebook(Context context);

    /**
     * List storage account keys of a workspace.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response}.
     */
    Response<ListStorageAccountKeysResult> listStorageAccountKeysWithResponse(Context context);

    /**
     * List storage account keys of a workspace.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    ListStorageAccountKeysResult listStorageAccountKeys();

    /**
     * List keys of a notebook.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response}.
     */
    Response<ListNotebookKeysResult> listNotebookKeysWithResponse(Context context);

    /**
     * List keys of a notebook.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    ListNotebookKeysResult listNotebookKeys();
}
