// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Represents a path that is recommended to be allowed and its properties. */
@Fluent
public final class PathRecommendation {
    /*
     * The full path of the file, or an identifier of the application
     */
    @JsonProperty(value = "path")
    private String path;

    /*
     * The recommendation action of the machine or rule
     */
    @JsonProperty(value = "action")
    private RecommendationAction action;

    /*
     * The type of IoT Security recommendation.
     */
    @JsonProperty(value = "type")
    private RecommendationType type;

    /*
     * Represents the publisher information of a process/rule
     */
    @JsonProperty(value = "publisherInfo")
    private PublisherInfo publisherInfo;

    /*
     * Whether the application is commonly run on the machine
     */
    @JsonProperty(value = "common")
    private Boolean common;

    /*
     * The userSids property.
     */
    @JsonProperty(value = "userSids")
    private List<String> userSids;

    /*
     * The usernames property.
     */
    @JsonProperty(value = "usernames")
    private List<UserRecommendation> usernames;

    /*
     * The type of the file (for Linux files - Executable is used)
     */
    @JsonProperty(value = "fileType")
    private FileType fileType;

    /*
     * The configuration status of the machines group or machine or rule
     */
    @JsonProperty(value = "configurationStatus")
    private ConfigurationStatus configurationStatus;

    /**
     * Get the path property: The full path of the file, or an identifier of the application.
     *
     * @return the path value.
     */
    public String path() {
        return this.path;
    }

    /**
     * Set the path property: The full path of the file, or an identifier of the application.
     *
     * @param path the path value to set.
     * @return the PathRecommendation object itself.
     */
    public PathRecommendation withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get the action property: The recommendation action of the machine or rule.
     *
     * @return the action value.
     */
    public RecommendationAction action() {
        return this.action;
    }

    /**
     * Set the action property: The recommendation action of the machine or rule.
     *
     * @param action the action value to set.
     * @return the PathRecommendation object itself.
     */
    public PathRecommendation withAction(RecommendationAction action) {
        this.action = action;
        return this;
    }

    /**
     * Get the type property: The type of IoT Security recommendation.
     *
     * @return the type value.
     */
    public RecommendationType type() {
        return this.type;
    }

    /**
     * Set the type property: The type of IoT Security recommendation.
     *
     * @param type the type value to set.
     * @return the PathRecommendation object itself.
     */
    public PathRecommendation withType(RecommendationType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the publisherInfo property: Represents the publisher information of a process/rule.
     *
     * @return the publisherInfo value.
     */
    public PublisherInfo publisherInfo() {
        return this.publisherInfo;
    }

    /**
     * Set the publisherInfo property: Represents the publisher information of a process/rule.
     *
     * @param publisherInfo the publisherInfo value to set.
     * @return the PathRecommendation object itself.
     */
    public PathRecommendation withPublisherInfo(PublisherInfo publisherInfo) {
        this.publisherInfo = publisherInfo;
        return this;
    }

    /**
     * Get the common property: Whether the application is commonly run on the machine.
     *
     * @return the common value.
     */
    public Boolean common() {
        return this.common;
    }

    /**
     * Set the common property: Whether the application is commonly run on the machine.
     *
     * @param common the common value to set.
     * @return the PathRecommendation object itself.
     */
    public PathRecommendation withCommon(Boolean common) {
        this.common = common;
        return this;
    }

    /**
     * Get the userSids property: The userSids property.
     *
     * @return the userSids value.
     */
    public List<String> userSids() {
        return this.userSids;
    }

    /**
     * Set the userSids property: The userSids property.
     *
     * @param userSids the userSids value to set.
     * @return the PathRecommendation object itself.
     */
    public PathRecommendation withUserSids(List<String> userSids) {
        this.userSids = userSids;
        return this;
    }

    /**
     * Get the usernames property: The usernames property.
     *
     * @return the usernames value.
     */
    public List<UserRecommendation> usernames() {
        return this.usernames;
    }

    /**
     * Set the usernames property: The usernames property.
     *
     * @param usernames the usernames value to set.
     * @return the PathRecommendation object itself.
     */
    public PathRecommendation withUsernames(List<UserRecommendation> usernames) {
        this.usernames = usernames;
        return this;
    }

    /**
     * Get the fileType property: The type of the file (for Linux files - Executable is used).
     *
     * @return the fileType value.
     */
    public FileType fileType() {
        return this.fileType;
    }

    /**
     * Set the fileType property: The type of the file (for Linux files - Executable is used).
     *
     * @param fileType the fileType value to set.
     * @return the PathRecommendation object itself.
     */
    public PathRecommendation withFileType(FileType fileType) {
        this.fileType = fileType;
        return this;
    }

    /**
     * Get the configurationStatus property: The configuration status of the machines group or machine or rule.
     *
     * @return the configurationStatus value.
     */
    public ConfigurationStatus configurationStatus() {
        return this.configurationStatus;
    }

    /**
     * Set the configurationStatus property: The configuration status of the machines group or machine or rule.
     *
     * @param configurationStatus the configurationStatus value to set.
     * @return the PathRecommendation object itself.
     */
    public PathRecommendation withConfigurationStatus(ConfigurationStatus configurationStatus) {
        this.configurationStatus = configurationStatus;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (publisherInfo() != null) {
            publisherInfo().validate();
        }
        if (usernames() != null) {
            usernames().forEach(e -> e.validate());
        }
    }
}
