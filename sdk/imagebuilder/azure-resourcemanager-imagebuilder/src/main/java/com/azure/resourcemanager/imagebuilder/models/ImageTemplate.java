// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.imagebuilder.models;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.imagebuilder.fluent.models.ImageTemplateInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of ImageTemplate. */
public interface ImageTemplate {
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
     * Gets the identity property: The identity of the image template, if configured.
     *
     * @return the identity value.
     */
    ImageTemplateIdentity identity();

    /**
     * Gets the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the source property: Specifies the properties used to describe the source image.
     *
     * @return the source value.
     */
    ImageTemplateSource source();

    /**
     * Gets the customize property: Specifies the properties used to describe the customization steps of the image, like
     * Image source etc.
     *
     * @return the customize value.
     */
    List<ImageTemplateCustomizer> customize();

    /**
     * Gets the distribute property: The distribution targets where the image output needs to go to.
     *
     * @return the distribute value.
     */
    List<ImageTemplateDistributor> distribute();

    /**
     * Gets the provisioningState property: Provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the provisioningError property: Provisioning error, if any.
     *
     * @return the provisioningError value.
     */
    ProvisioningError provisioningError();

    /**
     * Gets the lastRunStatus property: State of 'run' that is currently executing or was last executed.
     *
     * @return the lastRunStatus value.
     */
    ImageTemplateLastRunStatus lastRunStatus();

    /**
     * Gets the buildTimeoutInMinutes property: Maximum duration to wait while building the image template. Omit or
     * specify 0 to use the default (4 hours).
     *
     * @return the buildTimeoutInMinutes value.
     */
    Integer buildTimeoutInMinutes();

    /**
     * Gets the vmProfile property: Describes how virtual machine is set up to build images.
     *
     * @return the vmProfile value.
     */
    ImageTemplateVmProfile vmProfile();

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
     * Gets the inner com.azure.resourcemanager.imagebuilder.fluent.models.ImageTemplateInner object.
     *
     * @return the inner object.
     */
    ImageTemplateInner innerModel();

    /** The entirety of the ImageTemplate definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithIdentity,
            DefinitionStages.WithCreate {
    }
    /** The ImageTemplate definition stages. */
    interface DefinitionStages {
        /** The first stage of the ImageTemplate definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the ImageTemplate definition allowing to specify location. */
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
        /** The stage of the ImageTemplate definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group.
             * @return the next definition stage.
             */
            WithIdentity withExistingResourceGroup(String resourceGroupName);
        }
        /** The stage of the ImageTemplate definition allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: The identity of the image template, if configured..
             *
             * @param identity The identity of the image template, if configured.
             * @return the next definition stage.
             */
            WithCreate withIdentity(ImageTemplateIdentity identity);
        }
        /**
         * The stage of the ImageTemplate definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithSource,
                DefinitionStages.WithCustomize,
                DefinitionStages.WithDistribute,
                DefinitionStages.WithBuildTimeoutInMinutes,
                DefinitionStages.WithVmProfile {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            ImageTemplate create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ImageTemplate create(Context context);
        }
        /** The stage of the ImageTemplate definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the ImageTemplate definition allowing to specify source. */
        interface WithSource {
            /**
             * Specifies the source property: Specifies the properties used to describe the source image..
             *
             * @param source Specifies the properties used to describe the source image.
             * @return the next definition stage.
             */
            WithCreate withSource(ImageTemplateSource source);
        }
        /** The stage of the ImageTemplate definition allowing to specify customize. */
        interface WithCustomize {
            /**
             * Specifies the customize property: Specifies the properties used to describe the customization steps of
             * the image, like Image source etc.
             *
             * @param customize Specifies the properties used to describe the customization steps of the image, like
             *     Image source etc.
             * @return the next definition stage.
             */
            WithCreate withCustomize(List<ImageTemplateCustomizer> customize);
        }
        /** The stage of the ImageTemplate definition allowing to specify distribute. */
        interface WithDistribute {
            /**
             * Specifies the distribute property: The distribution targets where the image output needs to go to..
             *
             * @param distribute The distribution targets where the image output needs to go to.
             * @return the next definition stage.
             */
            WithCreate withDistribute(List<ImageTemplateDistributor> distribute);
        }
        /** The stage of the ImageTemplate definition allowing to specify buildTimeoutInMinutes. */
        interface WithBuildTimeoutInMinutes {
            /**
             * Specifies the buildTimeoutInMinutes property: Maximum duration to wait while building the image template.
             * Omit or specify 0 to use the default (4 hours)..
             *
             * @param buildTimeoutInMinutes Maximum duration to wait while building the image template. Omit or specify
             *     0 to use the default (4 hours).
             * @return the next definition stage.
             */
            WithCreate withBuildTimeoutInMinutes(Integer buildTimeoutInMinutes);
        }
        /** The stage of the ImageTemplate definition allowing to specify vmProfile. */
        interface WithVmProfile {
            /**
             * Specifies the vmProfile property: Describes how virtual machine is set up to build images.
             *
             * @param vmProfile Describes how virtual machine is set up to build images.
             * @return the next definition stage.
             */
            WithCreate withVmProfile(ImageTemplateVmProfile vmProfile);
        }
    }
    /**
     * Begins update for the ImageTemplate resource.
     *
     * @return the stage of resource update.
     */
    ImageTemplate.Update update();

    /** The template for ImageTemplate update. */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithIdentity {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        ImageTemplate apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ImageTemplate apply(Context context);
    }
    /** The ImageTemplate update stages. */
    interface UpdateStages {
        /** The stage of the ImageTemplate update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: The user-specified tags associated with the image template..
             *
             * @param tags The user-specified tags associated with the image template.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the ImageTemplate update allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: The identity of the image template, if configured..
             *
             * @param identity The identity of the image template, if configured.
             * @return the next definition stage.
             */
            Update withIdentity(ImageTemplateIdentity identity);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    ImageTemplate refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ImageTemplate refresh(Context context);

    /**
     * Create artifacts from a existing image template.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void run();

    /**
     * Create artifacts from a existing image template.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void run(Context context);

    /**
     * Cancel the long running image build based on the image template.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void cancel();

    /**
     * Cancel the long running image build based on the image template.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void cancel(Context context);
}
