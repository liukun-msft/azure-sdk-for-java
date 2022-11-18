// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Input for InstallPatches on a Windows VM, as directly received by the API. */
@Fluent
public final class WindowsParameters {
    /*
     * The update classifications to select when installing patches for Windows.
     */
    @JsonProperty(value = "classificationsToInclude")
    private List<VMGuestPatchClassificationWindows> classificationsToInclude;

    /*
     * Kbs to include in the patch operation
     */
    @JsonProperty(value = "kbNumbersToInclude")
    private List<String> kbNumbersToInclude;

    /*
     * Kbs to exclude in the patch operation
     */
    @JsonProperty(value = "kbNumbersToExclude")
    private List<String> kbNumbersToExclude;

    /*
     * Filters out Kbs that don't have an InstallationRebootBehavior of 'NeverReboots' when this is set to true.
     */
    @JsonProperty(value = "excludeKbsRequiringReboot")
    private Boolean excludeKbsRequiringReboot;

    /*
     * This is used to install patches that were published on or before this given max published date.
     */
    @JsonProperty(value = "maxPatchPublishDate")
    private OffsetDateTime maxPatchPublishDate;

    /** Creates an instance of WindowsParameters class. */
    public WindowsParameters() {
    }

    /**
     * Get the classificationsToInclude property: The update classifications to select when installing patches for
     * Windows.
     *
     * @return the classificationsToInclude value.
     */
    public List<VMGuestPatchClassificationWindows> classificationsToInclude() {
        return this.classificationsToInclude;
    }

    /**
     * Set the classificationsToInclude property: The update classifications to select when installing patches for
     * Windows.
     *
     * @param classificationsToInclude the classificationsToInclude value to set.
     * @return the WindowsParameters object itself.
     */
    public WindowsParameters withClassificationsToInclude(
        List<VMGuestPatchClassificationWindows> classificationsToInclude) {
        this.classificationsToInclude = classificationsToInclude;
        return this;
    }

    /**
     * Get the kbNumbersToInclude property: Kbs to include in the patch operation.
     *
     * @return the kbNumbersToInclude value.
     */
    public List<String> kbNumbersToInclude() {
        return this.kbNumbersToInclude;
    }

    /**
     * Set the kbNumbersToInclude property: Kbs to include in the patch operation.
     *
     * @param kbNumbersToInclude the kbNumbersToInclude value to set.
     * @return the WindowsParameters object itself.
     */
    public WindowsParameters withKbNumbersToInclude(List<String> kbNumbersToInclude) {
        this.kbNumbersToInclude = kbNumbersToInclude;
        return this;
    }

    /**
     * Get the kbNumbersToExclude property: Kbs to exclude in the patch operation.
     *
     * @return the kbNumbersToExclude value.
     */
    public List<String> kbNumbersToExclude() {
        return this.kbNumbersToExclude;
    }

    /**
     * Set the kbNumbersToExclude property: Kbs to exclude in the patch operation.
     *
     * @param kbNumbersToExclude the kbNumbersToExclude value to set.
     * @return the WindowsParameters object itself.
     */
    public WindowsParameters withKbNumbersToExclude(List<String> kbNumbersToExclude) {
        this.kbNumbersToExclude = kbNumbersToExclude;
        return this;
    }

    /**
     * Get the excludeKbsRequiringReboot property: Filters out Kbs that don't have an InstallationRebootBehavior of
     * 'NeverReboots' when this is set to true.
     *
     * @return the excludeKbsRequiringReboot value.
     */
    public Boolean excludeKbsRequiringReboot() {
        return this.excludeKbsRequiringReboot;
    }

    /**
     * Set the excludeKbsRequiringReboot property: Filters out Kbs that don't have an InstallationRebootBehavior of
     * 'NeverReboots' when this is set to true.
     *
     * @param excludeKbsRequiringReboot the excludeKbsRequiringReboot value to set.
     * @return the WindowsParameters object itself.
     */
    public WindowsParameters withExcludeKbsRequiringReboot(Boolean excludeKbsRequiringReboot) {
        this.excludeKbsRequiringReboot = excludeKbsRequiringReboot;
        return this;
    }

    /**
     * Get the maxPatchPublishDate property: This is used to install patches that were published on or before this given
     * max published date.
     *
     * @return the maxPatchPublishDate value.
     */
    public OffsetDateTime maxPatchPublishDate() {
        return this.maxPatchPublishDate;
    }

    /**
     * Set the maxPatchPublishDate property: This is used to install patches that were published on or before this given
     * max published date.
     *
     * @param maxPatchPublishDate the maxPatchPublishDate value to set.
     * @return the WindowsParameters object itself.
     */
    public WindowsParameters withMaxPatchPublishDate(OffsetDateTime maxPatchPublishDate) {
        this.maxPatchPublishDate = maxPatchPublishDate;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
