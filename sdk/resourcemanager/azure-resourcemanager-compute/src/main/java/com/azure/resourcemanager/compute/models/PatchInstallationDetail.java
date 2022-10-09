// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Information about a specific patch that was encountered during an installation action. */
@Immutable
public final class PatchInstallationDetail {
    /*
     * A unique identifier for the patch.
     */
    @JsonProperty(value = "patchId", access = JsonProperty.Access.WRITE_ONLY)
    private String patchId;

    /*
     * The friendly name of the patch.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The version string of the package. It may conform to Semantic Versioning. Only applies to Linux.
     */
    @JsonProperty(value = "version", access = JsonProperty.Access.WRITE_ONLY)
    private String version;

    /*
     * The KBID of the patch. Only applies to Windows patches.
     */
    @JsonProperty(value = "kbId", access = JsonProperty.Access.WRITE_ONLY)
    private String kbId;

    /*
     * The classification(s) of the patch as provided by the patch publisher.
     */
    @JsonProperty(value = "classifications", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> classifications;

    /*
     * The state of the patch after the installation operation completed.
     */
    @JsonProperty(value = "installationState", access = JsonProperty.Access.WRITE_ONLY)
    private PatchInstallationState installationState;

    /**
     * Get the patchId property: A unique identifier for the patch.
     *
     * @return the patchId value.
     */
    public String patchId() {
        return this.patchId;
    }

    /**
     * Get the name property: The friendly name of the patch.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the version property: The version string of the package. It may conform to Semantic Versioning. Only applies
     * to Linux.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Get the kbId property: The KBID of the patch. Only applies to Windows patches.
     *
     * @return the kbId value.
     */
    public String kbId() {
        return this.kbId;
    }

    /**
     * Get the classifications property: The classification(s) of the patch as provided by the patch publisher.
     *
     * @return the classifications value.
     */
    public List<String> classifications() {
        return this.classifications;
    }

    /**
     * Get the installationState property: The state of the patch after the installation operation completed.
     *
     * @return the installationState value.
     */
    public PatchInstallationState installationState() {
        return this.installationState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
