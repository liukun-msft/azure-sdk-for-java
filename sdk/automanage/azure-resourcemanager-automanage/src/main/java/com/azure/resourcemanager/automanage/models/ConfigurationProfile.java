// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automanage.models;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.automanage.fluent.models.ConfigurationProfileInner;
import com.azure.resourcemanager.automanage.fluent.models.ConfigurationProfileProperties;
import java.util.Map;

/** An immutable client-side representation of ConfigurationProfile. */
public interface ConfigurationProfile {
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
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the properties property: Properties of the configuration profile.
     *
     * @return the properties value.
     */
    ConfigurationProfileProperties properties();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    SystemData systemData();

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
     * Gets the inner com.azure.resourcemanager.automanage.fluent.models.ConfigurationProfileInner object.
     *
     * @return the inner object.
     */
    ConfigurationProfileInner innerModel();

    /** The entirety of the ConfigurationProfile definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The ConfigurationProfile definition stages. */
    interface DefinitionStages {
        /** The first stage of the ConfigurationProfile definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the ConfigurationProfile definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }
        /** The stage of the ConfigurationProfile definition allowing to specify parent resource. */
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
         * The stage of the ConfigurationProfile definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags, DefinitionStages.WithProperties {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            ConfigurationProfile create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ConfigurationProfile create(Context context);
        }
        /** The stage of the ConfigurationProfile definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the ConfigurationProfile definition allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: Properties of the configuration profile..
             *
             * @param properties Properties of the configuration profile.
             * @return the next definition stage.
             */
            WithCreate withProperties(ConfigurationProfileProperties properties);
        }
    }
    /**
     * Begins update for the ConfigurationProfile resource.
     *
     * @return the stage of resource update.
     */
    ConfigurationProfile.Update update();

    /** The template for ConfigurationProfile update. */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithProperties {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        ConfigurationProfile apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ConfigurationProfile apply(Context context);
    }
    /** The ConfigurationProfile update stages. */
    interface UpdateStages {
        /** The stage of the ConfigurationProfile update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: The tags of the resource..
             *
             * @param tags The tags of the resource.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the ConfigurationProfile update allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: Properties of the configuration profile..
             *
             * @param properties Properties of the configuration profile.
             * @return the next definition stage.
             */
            Update withProperties(ConfigurationProfileProperties properties);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    ConfigurationProfile refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ConfigurationProfile refresh(Context context);
}
