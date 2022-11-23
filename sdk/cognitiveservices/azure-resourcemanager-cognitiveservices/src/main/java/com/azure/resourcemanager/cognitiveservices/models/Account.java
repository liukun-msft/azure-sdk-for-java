// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.models;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.cognitiveservices.fluent.models.AccountInner;
import java.util.Map;

/** An immutable client-side representation of Account. */
public interface Account {
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
     * Gets the etag property: Resource Etag.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the kind property: The Kind of the resource.
     *
     * @return the kind value.
     */
    String kind();

    /**
     * Gets the sku property: The resource model definition representing SKU.
     *
     * @return the sku value.
     */
    Sku sku();

    /**
     * Gets the identity property: Identity for the resource.
     *
     * @return the identity value.
     */
    Identity identity();

    /**
     * Gets the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the properties property: Properties of Cognitive Services account.
     *
     * @return the properties value.
     */
    AccountProperties properties();

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
     * Gets the inner com.azure.resourcemanager.cognitiveservices.fluent.models.AccountInner object.
     *
     * @return the inner object.
     */
    AccountInner innerModel();

    /** The entirety of the Account definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithResourceGroup, DefinitionStages.WithCreate {
    }
    /** The Account definition stages. */
    interface DefinitionStages {
        /** The first stage of the Account definition. */
        interface Blank extends WithResourceGroup {
        }
        /** The stage of the Account definition allowing to specify parent resource. */
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
         * The stage of the Account definition which contains all the minimum required properties for the resource to be
         * created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithLocation,
                DefinitionStages.WithTags,
                DefinitionStages.WithKind,
                DefinitionStages.WithSku,
                DefinitionStages.WithIdentity,
                DefinitionStages.WithProperties {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Account create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Account create(Context context);
        }
        /** The stage of the Account definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithCreate withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithCreate withRegion(String location);
        }
        /** The stage of the Account definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the Account definition allowing to specify kind. */
        interface WithKind {
            /**
             * Specifies the kind property: The Kind of the resource..
             *
             * @param kind The Kind of the resource.
             * @return the next definition stage.
             */
            WithCreate withKind(String kind);
        }
        /** The stage of the Account definition allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: The resource model definition representing SKU.
             *
             * @param sku The resource model definition representing SKU.
             * @return the next definition stage.
             */
            WithCreate withSku(Sku sku);
        }
        /** The stage of the Account definition allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: Identity for the resource..
             *
             * @param identity Identity for the resource.
             * @return the next definition stage.
             */
            WithCreate withIdentity(Identity identity);
        }
        /** The stage of the Account definition allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: Properties of Cognitive Services account..
             *
             * @param properties Properties of Cognitive Services account.
             * @return the next definition stage.
             */
            WithCreate withProperties(AccountProperties properties);
        }
    }
    /**
     * Begins update for the Account resource.
     *
     * @return the stage of resource update.
     */
    Account.Update update();

    /** The template for Account update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithKind,
            UpdateStages.WithSku,
            UpdateStages.WithIdentity,
            UpdateStages.WithProperties {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        Account apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Account apply(Context context);
    }
    /** The Account update stages. */
    interface UpdateStages {
        /** The stage of the Account update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the Account update allowing to specify kind. */
        interface WithKind {
            /**
             * Specifies the kind property: The Kind of the resource..
             *
             * @param kind The Kind of the resource.
             * @return the next definition stage.
             */
            Update withKind(String kind);
        }
        /** The stage of the Account update allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: The resource model definition representing SKU.
             *
             * @param sku The resource model definition representing SKU.
             * @return the next definition stage.
             */
            Update withSku(Sku sku);
        }
        /** The stage of the Account update allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: Identity for the resource..
             *
             * @param identity Identity for the resource.
             * @return the next definition stage.
             */
            Update withIdentity(Identity identity);
        }
        /** The stage of the Account update allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: Properties of Cognitive Services account..
             *
             * @param properties Properties of Cognitive Services account.
             * @return the next definition stage.
             */
            Update withProperties(AccountProperties properties);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    Account refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Account refresh(Context context);

    /**
     * Lists the account keys for the specified Cognitive Services account.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the access keys for the cognitive services account along with {@link Response}.
     */
    Response<ApiKeys> listKeysWithResponse(Context context);

    /**
     * Lists the account keys for the specified Cognitive Services account.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the access keys for the cognitive services account.
     */
    ApiKeys listKeys();

    /**
     * Regenerates the specified account key for the specified Cognitive Services account.
     *
     * @param parameters regenerate key parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the access keys for the cognitive services account along with {@link Response}.
     */
    Response<ApiKeys> regenerateKeyWithResponse(RegenerateKeyParameters parameters, Context context);

    /**
     * Regenerates the specified account key for the specified Cognitive Services account.
     *
     * @param parameters regenerate key parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the access keys for the cognitive services account.
     */
    ApiKeys regenerateKey(RegenerateKeyParameters parameters);
}
