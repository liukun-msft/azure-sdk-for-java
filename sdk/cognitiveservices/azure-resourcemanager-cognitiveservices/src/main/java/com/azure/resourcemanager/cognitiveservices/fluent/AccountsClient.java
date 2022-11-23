// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.cognitiveservices.fluent.models.AccountInner;
import com.azure.resourcemanager.cognitiveservices.fluent.models.AccountModelInner;
import com.azure.resourcemanager.cognitiveservices.fluent.models.AccountSkuListResultInner;
import com.azure.resourcemanager.cognitiveservices.fluent.models.ApiKeysInner;
import com.azure.resourcemanager.cognitiveservices.fluent.models.UsageListResultInner;
import com.azure.resourcemanager.cognitiveservices.models.RegenerateKeyParameters;

/** An instance of this class provides access to all the operations defined in AccountsClient. */
public interface AccountsClient {
    /**
     * Create Cognitive Services Account. Accounts is a resource group wide resource type. It holds the keys for
     * developer to access intelligent APIs. It's also the resource type for billing.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of Cognitive Services account.
     * @param account The parameters to provide for the created account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of cognitive Services account is an Azure resource representing the
     *     provisioned account, it's type, location and SKU.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AccountInner>, AccountInner> beginCreate(
        String resourceGroupName, String accountName, AccountInner account);

    /**
     * Create Cognitive Services Account. Accounts is a resource group wide resource type. It holds the keys for
     * developer to access intelligent APIs. It's also the resource type for billing.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of Cognitive Services account.
     * @param account The parameters to provide for the created account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of cognitive Services account is an Azure resource representing the
     *     provisioned account, it's type, location and SKU.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AccountInner>, AccountInner> beginCreate(
        String resourceGroupName, String accountName, AccountInner account, Context context);

    /**
     * Create Cognitive Services Account. Accounts is a resource group wide resource type. It holds the keys for
     * developer to access intelligent APIs. It's also the resource type for billing.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of Cognitive Services account.
     * @param account The parameters to provide for the created account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cognitive Services account is an Azure resource representing the provisioned account, it's type, location
     *     and SKU.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AccountInner create(String resourceGroupName, String accountName, AccountInner account);

    /**
     * Create Cognitive Services Account. Accounts is a resource group wide resource type. It holds the keys for
     * developer to access intelligent APIs. It's also the resource type for billing.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of Cognitive Services account.
     * @param account The parameters to provide for the created account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cognitive Services account is an Azure resource representing the provisioned account, it's type, location
     *     and SKU.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AccountInner create(String resourceGroupName, String accountName, AccountInner account, Context context);

    /**
     * Updates a Cognitive Services account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of Cognitive Services account.
     * @param account The parameters to provide for the created account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of cognitive Services account is an Azure resource representing the
     *     provisioned account, it's type, location and SKU.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AccountInner>, AccountInner> beginUpdate(
        String resourceGroupName, String accountName, AccountInner account);

    /**
     * Updates a Cognitive Services account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of Cognitive Services account.
     * @param account The parameters to provide for the created account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of cognitive Services account is an Azure resource representing the
     *     provisioned account, it's type, location and SKU.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AccountInner>, AccountInner> beginUpdate(
        String resourceGroupName, String accountName, AccountInner account, Context context);

    /**
     * Updates a Cognitive Services account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of Cognitive Services account.
     * @param account The parameters to provide for the created account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cognitive Services account is an Azure resource representing the provisioned account, it's type, location
     *     and SKU.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AccountInner update(String resourceGroupName, String accountName, AccountInner account);

    /**
     * Updates a Cognitive Services account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of Cognitive Services account.
     * @param account The parameters to provide for the created account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cognitive Services account is an Azure resource representing the provisioned account, it's type, location
     *     and SKU.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AccountInner update(String resourceGroupName, String accountName, AccountInner account, Context context);

    /**
     * Deletes a Cognitive Services account from the resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of Cognitive Services account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String accountName);

    /**
     * Deletes a Cognitive Services account from the resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of Cognitive Services account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String accountName, Context context);

    /**
     * Deletes a Cognitive Services account from the resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of Cognitive Services account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String accountName);

    /**
     * Deletes a Cognitive Services account from the resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of Cognitive Services account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String accountName, Context context);

    /**
     * Returns a Cognitive Services account specified by the parameters.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of Cognitive Services account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cognitive Services account is an Azure resource representing the provisioned account, it's type, location
     *     and SKU along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AccountInner> getByResourceGroupWithResponse(
        String resourceGroupName, String accountName, Context context);

    /**
     * Returns a Cognitive Services account specified by the parameters.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of Cognitive Services account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cognitive Services account is an Azure resource representing the provisioned account, it's type, location
     *     and SKU.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AccountInner getByResourceGroup(String resourceGroupName, String accountName);

    /**
     * Returns all the resources of a particular type belonging to a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of cognitive services accounts operation response as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AccountInner> listByResourceGroup(String resourceGroupName);

    /**
     * Returns all the resources of a particular type belonging to a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of cognitive services accounts operation response as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AccountInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Returns all the resources of a particular type belonging to a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of cognitive services accounts operation response as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AccountInner> list();

    /**
     * Returns all the resources of a particular type belonging to a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of cognitive services accounts operation response as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AccountInner> list(Context context);

    /**
     * Lists the account keys for the specified Cognitive Services account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of Cognitive Services account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the access keys for the cognitive services account along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ApiKeysInner> listKeysWithResponse(String resourceGroupName, String accountName, Context context);

    /**
     * Lists the account keys for the specified Cognitive Services account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of Cognitive Services account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the access keys for the cognitive services account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApiKeysInner listKeys(String resourceGroupName, String accountName);

    /**
     * Regenerates the specified account key for the specified Cognitive Services account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of Cognitive Services account.
     * @param parameters regenerate key parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the access keys for the cognitive services account along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ApiKeysInner> regenerateKeyWithResponse(
        String resourceGroupName, String accountName, RegenerateKeyParameters parameters, Context context);

    /**
     * Regenerates the specified account key for the specified Cognitive Services account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of Cognitive Services account.
     * @param parameters regenerate key parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the access keys for the cognitive services account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApiKeysInner regenerateKey(String resourceGroupName, String accountName, RegenerateKeyParameters parameters);

    /**
     * List available SKUs for the requested Cognitive Services account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of Cognitive Services account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of cognitive services accounts operation response along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AccountSkuListResultInner> listSkusWithResponse(
        String resourceGroupName, String accountName, Context context);

    /**
     * List available SKUs for the requested Cognitive Services account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of Cognitive Services account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of cognitive services accounts operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AccountSkuListResultInner listSkus(String resourceGroupName, String accountName);

    /**
     * Get usages for the requested Cognitive Services account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of Cognitive Services account.
     * @param filter An OData filter expression that describes a subset of usages to return. The supported parameter is
     *     name.value (name of the metric, can have an or of multiple names).
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return usages for the requested Cognitive Services account along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<UsageListResultInner> listUsagesWithResponse(
        String resourceGroupName, String accountName, String filter, Context context);

    /**
     * Get usages for the requested Cognitive Services account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of Cognitive Services account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return usages for the requested Cognitive Services account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    UsageListResultInner listUsages(String resourceGroupName, String accountName);

    /**
     * List available Models for the requested Cognitive Services account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of Cognitive Services account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of cognitive services accounts operation response as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AccountModelInner> listModels(String resourceGroupName, String accountName);

    /**
     * List available Models for the requested Cognitive Services account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of Cognitive Services account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of cognitive services accounts operation response as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AccountModelInner> listModels(String resourceGroupName, String accountName, Context context);
}
