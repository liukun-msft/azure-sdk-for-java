// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.models;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.mobilenetwork.fluent.models.PacketCoreControlPlaneVersionInner;

/** An immutable client-side representation of PacketCoreControlPlaneVersion. */
public interface PacketCoreControlPlaneVersion {
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
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the provisioningState property: The provisioning state of the packet core control plane version resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the versionState property: The state of this packet core control plane version.
     *
     * @return the versionState value.
     */
    VersionState versionState();

    /**
     * Gets the recommendedVersion property: Indicates whether this is the recommended version to use for new packet
     * core control plane deployments.
     *
     * @return the recommendedVersion value.
     */
    RecommendedVersion recommendedVersion();

    /**
     * Gets the inner com.azure.resourcemanager.mobilenetwork.fluent.models.PacketCoreControlPlaneVersionInner object.
     *
     * @return the inner object.
     */
    PacketCoreControlPlaneVersionInner innerModel();
}
