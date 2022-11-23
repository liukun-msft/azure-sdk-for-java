// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.authorization.fluent.models.DenyAssignmentInner;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsListing;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in DenyAssignmentsClient. */
public interface DenyAssignmentsClient extends InnerSupportsListing<DenyAssignmentInner> {
    /**
     * Gets deny assignments for a resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @param parentResourcePath The parent resource identity.
     * @param resourceType The resource type of the resource.
     * @param resourceName The name of the resource to get deny assignments for.
     * @param filter The filter to apply on the operation. Use $filter=atScope() to return all deny assignments at or
     *     above the scope. Use $filter=denyAssignmentName eq '{name}' to search deny assignments by name at specified
     *     scope. Use $filter=principalId eq '{id}' to return all deny assignments at, above and below the scope for the
     *     specified principal. Use $filter=gdprExportPrincipalId eq '{id}' to return all deny assignments at, above and
     *     below the scope for the specified principal. This filter is different from the principalId filter as it
     *     returns not only those deny assignments that contain the specified principal is the Principals list but also
     *     those deny assignments that contain the specified principal is the ExcludePrincipals list. Additionally, when
     *     gdprExportPrincipalId filter is used, only the deny assignment name and description properties are returned.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return deny assignments for a resource as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<DenyAssignmentInner> listForResourceAsync(
        String resourceGroupName,
        String resourceProviderNamespace,
        String parentResourcePath,
        String resourceType,
        String resourceName,
        String filter);

    /**
     * Gets deny assignments for a resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @param parentResourcePath The parent resource identity.
     * @param resourceType The resource type of the resource.
     * @param resourceName The name of the resource to get deny assignments for.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return deny assignments for a resource as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<DenyAssignmentInner> listForResourceAsync(
        String resourceGroupName,
        String resourceProviderNamespace,
        String parentResourcePath,
        String resourceType,
        String resourceName);

    /**
     * Gets deny assignments for a resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @param parentResourcePath The parent resource identity.
     * @param resourceType The resource type of the resource.
     * @param resourceName The name of the resource to get deny assignments for.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return deny assignments for a resource as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DenyAssignmentInner> listForResource(
        String resourceGroupName,
        String resourceProviderNamespace,
        String parentResourcePath,
        String resourceType,
        String resourceName);

    /**
     * Gets deny assignments for a resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @param parentResourcePath The parent resource identity.
     * @param resourceType The resource type of the resource.
     * @param resourceName The name of the resource to get deny assignments for.
     * @param filter The filter to apply on the operation. Use $filter=atScope() to return all deny assignments at or
     *     above the scope. Use $filter=denyAssignmentName eq '{name}' to search deny assignments by name at specified
     *     scope. Use $filter=principalId eq '{id}' to return all deny assignments at, above and below the scope for the
     *     specified principal. Use $filter=gdprExportPrincipalId eq '{id}' to return all deny assignments at, above and
     *     below the scope for the specified principal. This filter is different from the principalId filter as it
     *     returns not only those deny assignments that contain the specified principal is the Principals list but also
     *     those deny assignments that contain the specified principal is the ExcludePrincipals list. Additionally, when
     *     gdprExportPrincipalId filter is used, only the deny assignment name and description properties are returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return deny assignments for a resource as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DenyAssignmentInner> listForResource(
        String resourceGroupName,
        String resourceProviderNamespace,
        String parentResourcePath,
        String resourceType,
        String resourceName,
        String filter,
        Context context);

    /**
     * Gets deny assignments for a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param filter The filter to apply on the operation. Use $filter=atScope() to return all deny assignments at or
     *     above the scope. Use $filter=denyAssignmentName eq '{name}' to search deny assignments by name at specified
     *     scope. Use $filter=principalId eq '{id}' to return all deny assignments at, above and below the scope for the
     *     specified principal. Use $filter=gdprExportPrincipalId eq '{id}' to return all deny assignments at, above and
     *     below the scope for the specified principal. This filter is different from the principalId filter as it
     *     returns not only those deny assignments that contain the specified principal is the Principals list but also
     *     those deny assignments that contain the specified principal is the ExcludePrincipals list. Additionally, when
     *     gdprExportPrincipalId filter is used, only the deny assignment name and description properties are returned.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return deny assignments for a resource group as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<DenyAssignmentInner> listByResourceGroupAsync(String resourceGroupName, String filter);

    /**
     * Gets deny assignments for a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return deny assignments for a resource group as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<DenyAssignmentInner> listByResourceGroupAsync(String resourceGroupName);

    /**
     * Gets deny assignments for a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return deny assignments for a resource group as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DenyAssignmentInner> listByResourceGroup(String resourceGroupName);

    /**
     * Gets deny assignments for a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param filter The filter to apply on the operation. Use $filter=atScope() to return all deny assignments at or
     *     above the scope. Use $filter=denyAssignmentName eq '{name}' to search deny assignments by name at specified
     *     scope. Use $filter=principalId eq '{id}' to return all deny assignments at, above and below the scope for the
     *     specified principal. Use $filter=gdprExportPrincipalId eq '{id}' to return all deny assignments at, above and
     *     below the scope for the specified principal. This filter is different from the principalId filter as it
     *     returns not only those deny assignments that contain the specified principal is the Principals list but also
     *     those deny assignments that contain the specified principal is the ExcludePrincipals list. Additionally, when
     *     gdprExportPrincipalId filter is used, only the deny assignment name and description properties are returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return deny assignments for a resource group as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DenyAssignmentInner> listByResourceGroup(String resourceGroupName, String filter, Context context);

    /**
     * Gets all deny assignments for the subscription.
     *
     * @param filter The filter to apply on the operation. Use $filter=atScope() to return all deny assignments at or
     *     above the scope. Use $filter=denyAssignmentName eq '{name}' to search deny assignments by name at specified
     *     scope. Use $filter=principalId eq '{id}' to return all deny assignments at, above and below the scope for the
     *     specified principal. Use $filter=gdprExportPrincipalId eq '{id}' to return all deny assignments at, above and
     *     below the scope for the specified principal. This filter is different from the principalId filter as it
     *     returns not only those deny assignments that contain the specified principal is the Principals list but also
     *     those deny assignments that contain the specified principal is the ExcludePrincipals list. Additionally, when
     *     gdprExportPrincipalId filter is used, only the deny assignment name and description properties are returned.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all deny assignments for the subscription as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<DenyAssignmentInner> listAsync(String filter);

    /**
     * Gets all deny assignments for the subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all deny assignments for the subscription as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<DenyAssignmentInner> listAsync();

    /**
     * Gets all deny assignments for the subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all deny assignments for the subscription as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DenyAssignmentInner> list();

    /**
     * Gets all deny assignments for the subscription.
     *
     * @param filter The filter to apply on the operation. Use $filter=atScope() to return all deny assignments at or
     *     above the scope. Use $filter=denyAssignmentName eq '{name}' to search deny assignments by name at specified
     *     scope. Use $filter=principalId eq '{id}' to return all deny assignments at, above and below the scope for the
     *     specified principal. Use $filter=gdprExportPrincipalId eq '{id}' to return all deny assignments at, above and
     *     below the scope for the specified principal. This filter is different from the principalId filter as it
     *     returns not only those deny assignments that contain the specified principal is the Principals list but also
     *     those deny assignments that contain the specified principal is the ExcludePrincipals list. Additionally, when
     *     gdprExportPrincipalId filter is used, only the deny assignment name and description properties are returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all deny assignments for the subscription as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DenyAssignmentInner> list(String filter, Context context);

    /**
     * Get the specified deny assignment.
     *
     * @param scope The scope of the deny assignment.
     * @param denyAssignmentId The ID of the deny assignment to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified deny assignment along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<DenyAssignmentInner>> getWithResponseAsync(String scope, String denyAssignmentId);

    /**
     * Get the specified deny assignment.
     *
     * @param scope The scope of the deny assignment.
     * @param denyAssignmentId The ID of the deny assignment to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified deny assignment on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<DenyAssignmentInner> getAsync(String scope, String denyAssignmentId);

    /**
     * Get the specified deny assignment.
     *
     * @param scope The scope of the deny assignment.
     * @param denyAssignmentId The ID of the deny assignment to get.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified deny assignment along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DenyAssignmentInner> getWithResponse(String scope, String denyAssignmentId, Context context);

    /**
     * Get the specified deny assignment.
     *
     * @param scope The scope of the deny assignment.
     * @param denyAssignmentId The ID of the deny assignment to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified deny assignment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DenyAssignmentInner get(String scope, String denyAssignmentId);

    /**
     * Gets a deny assignment by ID.
     *
     * @param denyAssignmentId The fully qualified deny assignment ID. For example, use the format,
     *     /subscriptions/{guid}/providers/Microsoft.Authorization/denyAssignments/{denyAssignmentId} for subscription
     *     level deny assignments, or /providers/Microsoft.Authorization/denyAssignments/{denyAssignmentId} for tenant
     *     level deny assignments.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a deny assignment by ID along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<DenyAssignmentInner>> getByIdWithResponseAsync(String denyAssignmentId);

    /**
     * Gets a deny assignment by ID.
     *
     * @param denyAssignmentId The fully qualified deny assignment ID. For example, use the format,
     *     /subscriptions/{guid}/providers/Microsoft.Authorization/denyAssignments/{denyAssignmentId} for subscription
     *     level deny assignments, or /providers/Microsoft.Authorization/denyAssignments/{denyAssignmentId} for tenant
     *     level deny assignments.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a deny assignment by ID on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<DenyAssignmentInner> getByIdAsync(String denyAssignmentId);

    /**
     * Gets a deny assignment by ID.
     *
     * @param denyAssignmentId The fully qualified deny assignment ID. For example, use the format,
     *     /subscriptions/{guid}/providers/Microsoft.Authorization/denyAssignments/{denyAssignmentId} for subscription
     *     level deny assignments, or /providers/Microsoft.Authorization/denyAssignments/{denyAssignmentId} for tenant
     *     level deny assignments.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a deny assignment by ID along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DenyAssignmentInner> getByIdWithResponse(String denyAssignmentId, Context context);

    /**
     * Gets a deny assignment by ID.
     *
     * @param denyAssignmentId The fully qualified deny assignment ID. For example, use the format,
     *     /subscriptions/{guid}/providers/Microsoft.Authorization/denyAssignments/{denyAssignmentId} for subscription
     *     level deny assignments, or /providers/Microsoft.Authorization/denyAssignments/{denyAssignmentId} for tenant
     *     level deny assignments.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a deny assignment by ID.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DenyAssignmentInner getById(String denyAssignmentId);

    /**
     * Gets deny assignments for a scope.
     *
     * @param scope The scope of the deny assignments.
     * @param filter The filter to apply on the operation. Use $filter=atScope() to return all deny assignments at or
     *     above the scope. Use $filter=denyAssignmentName eq '{name}' to search deny assignments by name at specified
     *     scope. Use $filter=principalId eq '{id}' to return all deny assignments at, above and below the scope for the
     *     specified principal. Use $filter=gdprExportPrincipalId eq '{id}' to return all deny assignments at, above and
     *     below the scope for the specified principal. This filter is different from the principalId filter as it
     *     returns not only those deny assignments that contain the specified principal is the Principals list but also
     *     those deny assignments that contain the specified principal is the ExcludePrincipals list. Additionally, when
     *     gdprExportPrincipalId filter is used, only the deny assignment name and description properties are returned.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return deny assignments for a scope as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<DenyAssignmentInner> listForScopeAsync(String scope, String filter);

    /**
     * Gets deny assignments for a scope.
     *
     * @param scope The scope of the deny assignments.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return deny assignments for a scope as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<DenyAssignmentInner> listForScopeAsync(String scope);

    /**
     * Gets deny assignments for a scope.
     *
     * @param scope The scope of the deny assignments.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return deny assignments for a scope as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DenyAssignmentInner> listForScope(String scope);

    /**
     * Gets deny assignments for a scope.
     *
     * @param scope The scope of the deny assignments.
     * @param filter The filter to apply on the operation. Use $filter=atScope() to return all deny assignments at or
     *     above the scope. Use $filter=denyAssignmentName eq '{name}' to search deny assignments by name at specified
     *     scope. Use $filter=principalId eq '{id}' to return all deny assignments at, above and below the scope for the
     *     specified principal. Use $filter=gdprExportPrincipalId eq '{id}' to return all deny assignments at, above and
     *     below the scope for the specified principal. This filter is different from the principalId filter as it
     *     returns not only those deny assignments that contain the specified principal is the Principals list but also
     *     those deny assignments that contain the specified principal is the ExcludePrincipals list. Additionally, when
     *     gdprExportPrincipalId filter is used, only the deny assignment name and description properties are returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return deny assignments for a scope as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DenyAssignmentInner> listForScope(String scope, String filter, Context context);
}
