// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securitydevops.implementation;

import com.azure.resourcemanager.securitydevops.fluent.models.GitHubConnectorStatsListResponseInner;
import com.azure.resourcemanager.securitydevops.models.GitHubConnectorStats;
import com.azure.resourcemanager.securitydevops.models.GitHubConnectorStatsListResponse;
import java.util.Collections;
import java.util.List;

public final class GitHubConnectorStatsListResponseImpl implements GitHubConnectorStatsListResponse {
    private GitHubConnectorStatsListResponseInner innerObject;

    private final com.azure.resourcemanager.securitydevops.SecurityDevOpsManager serviceManager;

    GitHubConnectorStatsListResponseImpl(
        GitHubConnectorStatsListResponseInner innerObject,
        com.azure.resourcemanager.securitydevops.SecurityDevOpsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<GitHubConnectorStats> value() {
        List<GitHubConnectorStats> inner = this.innerModel().value();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String nextLink() {
        return this.innerModel().nextLink();
    }

    public GitHubConnectorStatsListResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.securitydevops.SecurityDevOpsManager manager() {
        return this.serviceManager;
    }
}
