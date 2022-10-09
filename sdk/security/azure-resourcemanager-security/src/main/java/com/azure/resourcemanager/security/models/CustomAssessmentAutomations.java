// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of CustomAssessmentAutomations. */
public interface CustomAssessmentAutomations {
    /**
     * Gets a custom assessment automation
     *
     * <p>Gets a single custom assessment automation by name for the provided subscription and resource group.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param customAssessmentAutomationName Name of the Custom Assessment Automation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a single custom assessment automation by name for the provided subscription and resource group.
     */
    CustomAssessmentAutomation getByResourceGroup(String resourceGroupName, String customAssessmentAutomationName);

    /**
     * Gets a custom assessment automation
     *
     * <p>Gets a single custom assessment automation by name for the provided subscription and resource group.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param customAssessmentAutomationName Name of the Custom Assessment Automation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a single custom assessment automation by name for the provided subscription and resource group along with
     *     {@link Response}.
     */
    Response<CustomAssessmentAutomation> getByResourceGroupWithResponse(
        String resourceGroupName, String customAssessmentAutomationName, Context context);

    /**
     * Deletes a custom assessment automation
     *
     * <p>Deletes a custom assessment automation by name for a provided subscription.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param customAssessmentAutomationName Name of the Custom Assessment Automation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String customAssessmentAutomationName);

    /**
     * Deletes a custom assessment automation
     *
     * <p>Deletes a custom assessment automation by name for a provided subscription.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param customAssessmentAutomationName Name of the Custom Assessment Automation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteWithResponse(String resourceGroupName, String customAssessmentAutomationName, Context context);

    /**
     * List custom assessment automations in a subscription and a resource group
     *
     * <p>List custom assessment automations by provided subscription and resource group.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Custom Assessment Automations as paginated response with {@link PagedIterable}.
     */
    PagedIterable<CustomAssessmentAutomation> listByResourceGroup(String resourceGroupName);

    /**
     * List custom assessment automations in a subscription and a resource group
     *
     * <p>List custom assessment automations by provided subscription and resource group.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Custom Assessment Automations as paginated response with {@link PagedIterable}.
     */
    PagedIterable<CustomAssessmentAutomation> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * List custom assessment automations in a subscription
     *
     * <p>List custom assessment automations by provided subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Custom Assessment Automations as paginated response with {@link PagedIterable}.
     */
    PagedIterable<CustomAssessmentAutomation> list();

    /**
     * List custom assessment automations in a subscription
     *
     * <p>List custom assessment automations by provided subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Custom Assessment Automations as paginated response with {@link PagedIterable}.
     */
    PagedIterable<CustomAssessmentAutomation> list(Context context);

    /**
     * Gets a custom assessment automation
     *
     * <p>Gets a single custom assessment automation by name for the provided subscription and resource group.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a single custom assessment automation by name for the provided subscription and resource group along with
     *     {@link Response}.
     */
    CustomAssessmentAutomation getById(String id);

    /**
     * Gets a custom assessment automation
     *
     * <p>Gets a single custom assessment automation by name for the provided subscription and resource group.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a single custom assessment automation by name for the provided subscription and resource group along with
     *     {@link Response}.
     */
    Response<CustomAssessmentAutomation> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a custom assessment automation
     *
     * <p>Deletes a custom assessment automation by name for a provided subscription.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a custom assessment automation
     *
     * <p>Deletes a custom assessment automation by name for a provided subscription.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new CustomAssessmentAutomation resource.
     *
     * @param name resource name.
     * @return the first stage of the new CustomAssessmentAutomation definition.
     */
    CustomAssessmentAutomation.DefinitionStages.Blank define(String name);
}
