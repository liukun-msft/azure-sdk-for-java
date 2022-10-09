// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.kusto.fluent.models.DatabasePrincipalAssignmentInner;
import com.azure.resourcemanager.kusto.models.DatabasePrincipalAssignment;
import com.azure.resourcemanager.kusto.models.DatabasePrincipalRole;
import com.azure.resourcemanager.kusto.models.PrincipalType;
import com.azure.resourcemanager.kusto.models.ProvisioningState;

public final class DatabasePrincipalAssignmentImpl
    implements DatabasePrincipalAssignment, DatabasePrincipalAssignment.Definition, DatabasePrincipalAssignment.Update {
    private DatabasePrincipalAssignmentInner innerObject;

    private final com.azure.resourcemanager.kusto.KustoManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String principalId() {
        return this.innerModel().principalId();
    }

    public DatabasePrincipalRole role() {
        return this.innerModel().role();
    }

    public String tenantId() {
        return this.innerModel().tenantId();
    }

    public PrincipalType principalType() {
        return this.innerModel().principalType();
    }

    public String tenantName() {
        return this.innerModel().tenantName();
    }

    public String principalName() {
        return this.innerModel().principalName();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String aadObjectId() {
        return this.innerModel().aadObjectId();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public DatabasePrincipalAssignmentInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.kusto.KustoManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String clusterName;

    private String databaseName;

    private String principalAssignmentName;

    public DatabasePrincipalAssignmentImpl withExistingDatabase(
        String resourceGroupName, String clusterName, String databaseName) {
        this.resourceGroupName = resourceGroupName;
        this.clusterName = clusterName;
        this.databaseName = databaseName;
        return this;
    }

    public DatabasePrincipalAssignment create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDatabasePrincipalAssignments()
                .createOrUpdate(
                    resourceGroupName,
                    clusterName,
                    databaseName,
                    principalAssignmentName,
                    this.innerModel(),
                    Context.NONE);
        return this;
    }

    public DatabasePrincipalAssignment create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDatabasePrincipalAssignments()
                .createOrUpdate(
                    resourceGroupName, clusterName, databaseName, principalAssignmentName, this.innerModel(), context);
        return this;
    }

    DatabasePrincipalAssignmentImpl(String name, com.azure.resourcemanager.kusto.KustoManager serviceManager) {
        this.innerObject = new DatabasePrincipalAssignmentInner();
        this.serviceManager = serviceManager;
        this.principalAssignmentName = name;
    }

    public DatabasePrincipalAssignmentImpl update() {
        return this;
    }

    public DatabasePrincipalAssignment apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDatabasePrincipalAssignments()
                .createOrUpdate(
                    resourceGroupName,
                    clusterName,
                    databaseName,
                    principalAssignmentName,
                    this.innerModel(),
                    Context.NONE);
        return this;
    }

    public DatabasePrincipalAssignment apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDatabasePrincipalAssignments()
                .createOrUpdate(
                    resourceGroupName, clusterName, databaseName, principalAssignmentName, this.innerModel(), context);
        return this;
    }

    DatabasePrincipalAssignmentImpl(
        DatabasePrincipalAssignmentInner innerObject, com.azure.resourcemanager.kusto.KustoManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.clusterName = Utils.getValueFromIdByName(innerObject.id(), "clusters");
        this.databaseName = Utils.getValueFromIdByName(innerObject.id(), "databases");
        this.principalAssignmentName = Utils.getValueFromIdByName(innerObject.id(), "principalAssignments");
    }

    public DatabasePrincipalAssignment refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDatabasePrincipalAssignments()
                .getWithResponse(resourceGroupName, clusterName, databaseName, principalAssignmentName, Context.NONE)
                .getValue();
        return this;
    }

    public DatabasePrincipalAssignment refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDatabasePrincipalAssignments()
                .getWithResponse(resourceGroupName, clusterName, databaseName, principalAssignmentName, context)
                .getValue();
        return this;
    }

    public DatabasePrincipalAssignmentImpl withPrincipalId(String principalId) {
        this.innerModel().withPrincipalId(principalId);
        return this;
    }

    public DatabasePrincipalAssignmentImpl withRole(DatabasePrincipalRole role) {
        this.innerModel().withRole(role);
        return this;
    }

    public DatabasePrincipalAssignmentImpl withTenantId(String tenantId) {
        this.innerModel().withTenantId(tenantId);
        return this;
    }

    public DatabasePrincipalAssignmentImpl withPrincipalType(PrincipalType principalType) {
        this.innerModel().withPrincipalType(principalType);
        return this;
    }
}
