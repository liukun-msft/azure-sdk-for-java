// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts;

import com.azure.analytics.synapse.artifacts.implementation.TriggerRunsImpl;
import com.azure.analytics.synapse.artifacts.models.CloudErrorAutoGeneratedException;
import com.azure.analytics.synapse.artifacts.models.RunFilterParameters;
import com.azure.analytics.synapse.artifacts.models.TriggerRunsQueryResponse;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Initializes a new instance of the synchronous ArtifactsClient type. */
@ServiceClient(builder = ArtifactsClientBuilder.class)
public final class TriggerRunClient {
    private final TriggerRunsImpl serviceClient;

    /**
     * Initializes an instance of TriggerRuns client.
     *
     * @param serviceClient the service client implementation.
     */
    TriggerRunClient(TriggerRunsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Rerun single trigger instance by runId.
     *
     * @param triggerName The trigger name.
     * @param runId The pipeline run identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void rerunTriggerInstance(String triggerName, String runId) {
        this.serviceClient.rerunTriggerInstance(triggerName, runId);
    }

    /**
     * Rerun single trigger instance by runId.
     *
     * @param triggerName The trigger name.
     * @param runId The pipeline run identifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> rerunTriggerInstanceWithResponse(String triggerName, String runId, Context context) {
        return this.serviceClient.rerunTriggerInstanceWithResponse(triggerName, runId, context);
    }

    /**
     * Cancel single trigger instance by runId.
     *
     * @param triggerName The trigger name.
     * @param runId The pipeline run identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void cancelTriggerInstance(String triggerName, String runId) {
        this.serviceClient.cancelTriggerInstance(triggerName, runId);
    }

    /**
     * Cancel single trigger instance by runId.
     *
     * @param triggerName The trigger name.
     * @param runId The pipeline run identifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> cancelTriggerInstanceWithResponse(String triggerName, String runId, Context context) {
        return this.serviceClient.cancelTriggerInstanceWithResponse(triggerName, runId, context);
    }

    /**
     * Query trigger runs.
     *
     * @param filterParameters Parameters to filter the pipeline run.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of trigger runs.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public TriggerRunsQueryResponse queryTriggerRunsByWorkspace(RunFilterParameters filterParameters) {
        return this.serviceClient.queryTriggerRunsByWorkspace(filterParameters);
    }

    /**
     * Query trigger runs.
     *
     * @param filterParameters Parameters to filter the pipeline run.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of trigger runs.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<TriggerRunsQueryResponse> queryTriggerRunsByWorkspaceWithResponse(
            RunFilterParameters filterParameters, Context context) {
        return this.serviceClient.queryTriggerRunsByWorkspaceWithResponse(filterParameters, context);
    }
}
