// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.communication.callingserver;

import com.azure.communication.callingserver.implementation.converters.CallLocatorConverter;
import com.azure.communication.callingserver.models.*;
import com.azure.communication.common.CommunicationUserIdentifier;
import com.azure.communication.common.PhoneNumberIdentifier;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.Response;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.net.URI;
import java.util.Collections;
import java.util.UUID;

public class CallConnectionAsyncLiveTests extends CallingServerTestBase {

    private final String fromUser = getNewUserId();
    private final String toUser = getNewUserId();

    @ParameterizedTest
    @MethodSource("com.azure.core.test.TestBase#getHttpClients")
    @DisabledIfEnvironmentVariable(
        named = "SKIP_LIVE_TEST",
        matches = "(?i)(true)",
        disabledReason = "Requires human intervention")
    public void runCreatePlayCancelHangupScenarioAsync(HttpClient httpClient) {
        CallingServerClientBuilder builder = getCallingServerClientUsingConnectionString(httpClient);
        CallingServerAsyncClient callingServerAsyncClient =
            setupAsyncClient(builder, "runCreatePlayCancelHangupScenarioAsync");

        // Establish a call
        CreateCallOptions options = new CreateCallOptions(
            URI.create(CALLBACK_URI),
            Collections.singletonList(CallMediaType.AUDIO),
            Collections.singletonList(CallingEventSubscriptionType.PARTICIPANTS_UPDATED));

        options.setAlternateCallerId(new PhoneNumberIdentifier(FROM_PHONE_NUMBER));

        CallConnectionAsync callConnectionAsync = callingServerAsyncClient.createCallConnection(
            new CommunicationUserIdentifier(fromUser),
            Collections.singletonList(new PhoneNumberIdentifier(TO_PHONE_NUMBER)),
            options).block();
        sleepIfRunningAgainstService(10000);
        CallingServerTestUtils.validateCallConnectionAsync(callConnectionAsync);
        try {
            // Play Audio
            String operationContext = UUID.randomUUID().toString();
            assert callConnectionAsync != null;
            PlayAudioOptions playAudioOptions = new PlayAudioOptions()
                .setAudioFileId(null)
                .setCallbackUri(URI.create(CALLBACK_URI))
                .setLoop(false)
                .setOperationContext(operationContext);
            PlayAudioResult playAudioResult = callConnectionAsync.playAudio(
                URI.create(AUDIO_FILE_URI),
                playAudioOptions).block();
            CallingServerTestUtils.validatePlayAudioResult(playAudioResult);

            // Cancel All Media Operations
            callConnectionAsync.cancelAllMediaOperations().block();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            throw e;
        } finally {
            // Hang up
            callConnectionAsync.hangup().block();
        }
    }

    @ParameterizedTest
    @MethodSource("com.azure.core.test.TestBase#getHttpClients")
    @DisabledIfEnvironmentVariable(
        named = "SKIP_LIVE_TEST",
        matches = "(?i)(true)",
        disabledReason = "Requires human intervention")
    public void runCreatePlayCancelHangupScenarioWithResponseAsync(HttpClient httpClient) {
        CallingServerClientBuilder builder = getCallingServerClientUsingConnectionString(httpClient);
        CallingServerAsyncClient callingServerAsyncClient =
            setupAsyncClient(builder, "runCreatePlayCancelHangupScenarioWithResponseAsync");

        // Establish a call
        CreateCallOptions options = new CreateCallOptions(
            URI.create(CALLBACK_URI),
            Collections.singletonList(CallMediaType.AUDIO),
            Collections.singletonList(CallingEventSubscriptionType.PARTICIPANTS_UPDATED));

        options.setAlternateCallerId(new PhoneNumberIdentifier(FROM_PHONE_NUMBER));

        Response<CallConnectionAsync> callConnectionAsyncResponse =
            callingServerAsyncClient.createCallConnectionWithResponse(
                new CommunicationUserIdentifier(fromUser),
                Collections.singletonList(new PhoneNumberIdentifier(TO_PHONE_NUMBER)),
                options).block();
        sleepIfRunningAgainstService(10000);
        CallingServerTestUtils.validateCallConnectionAsyncResponse(callConnectionAsyncResponse);
        assert callConnectionAsyncResponse != null;
        CallConnectionAsync callConnectionAsync = callConnectionAsyncResponse.getValue();

        try {
            // Play Audio
            String operationContext = UUID.randomUUID().toString();
            PlayAudioOptions playAudioOptions =
                new PlayAudioOptions()
                    .setLoop(false)
                    .setAudioFileId(UUID.randomUUID().toString())
                    .setCallbackUri(URI.create(CALLBACK_URI))
                    .setOperationContext(operationContext);
            Response<PlayAudioResult> playAudioResponse =
                callConnectionAsync.playAudioWithResponse(URI.create(AUDIO_FILE_URI), playAudioOptions).block();
            CallingServerTestUtils.validatePlayAudioResponse(playAudioResponse);

            // Cancel All Media Operations
            callConnectionAsync.cancelAllMediaOperationsWithResponse().block();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            throw e;
        } finally {
            // Hang up
            Response<Void> hangupResponse = callConnectionAsync.hangupWithResponse().block();
            CallingServerTestUtils.validateResponse(hangupResponse);
        }
    }

    @ParameterizedTest
    @MethodSource("com.azure.core.test.TestBase#getHttpClients")
    @DisabledIfEnvironmentVariable(
        named = "SKIP_LIVE_TEST",
        matches = "(?i)(true)",
        disabledReason = "Requires human intervention")
    public void runCreateAddRemoveHangupScenarioAsync(HttpClient httpClient) {
        CallingServerClientBuilder builder = getCallingServerClientUsingConnectionString(httpClient);
        CallingServerAsyncClient callingServerAsyncClient =
            setupAsyncClient(builder, "runCreateAddRemoveHangupScenarioAsync");

        // Establish a call
        CreateCallOptions options = new CreateCallOptions(
            URI.create(CALLBACK_URI),
            Collections.singletonList(CallMediaType.AUDIO),
            Collections.singletonList(CallingEventSubscriptionType.PARTICIPANTS_UPDATED));

        options.setAlternateCallerId(new PhoneNumberIdentifier(FROM_PHONE_NUMBER));

        CallConnectionAsync callConnectionAsync = callingServerAsyncClient.createCallConnection(
            new CommunicationUserIdentifier(fromUser),
            Collections.singletonList(new PhoneNumberIdentifier(TO_PHONE_NUMBER)),
            options).block();
        sleepIfRunningAgainstService(15000);
        CallingServerTestUtils.validateCallConnectionAsync(callConnectionAsync);

        try {
            // Add User
            String operationContext = UUID.randomUUID().toString();
            assert callConnectionAsync != null;
            CommunicationUserIdentifier addedUser = new CommunicationUserIdentifier("8:acs:" + AZURE_TENANT_ID + "_" + "0000000d-3eb4-b48f-32fb-343a0d000fc1");
            AddParticipantResult addParticipantResult = callConnectionAsync.addParticipant(
                addedUser,
                null,
                operationContext,
                URI.create(CALLBACK_URI)).block();
            sleepIfRunningAgainstService(15000);
            assert addParticipantResult != null;
            // Remove User
            callConnectionAsync.removeParticipant(addedUser).block();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            throw e;
        } finally {
            // Hang up
            callConnectionAsync.hangup().block();
        }
    }

    @ParameterizedTest
    @MethodSource("com.azure.core.test.TestBase#getHttpClients")
    @DisabledIfEnvironmentVariable(
        named = "SKIP_LIVE_TEST",
        matches = "(?i)(true)",
        disabledReason = "Requires human intervention")
    public void runCreateAddRemoveHangupScenarioWithResponseAsync(HttpClient httpClient) {
        CallingServerClientBuilder builder = getCallingServerClientUsingConnectionString(httpClient);
        CallingServerAsyncClient callingServerAsyncClient =
            setupAsyncClient(builder, "runCreateAddRemoveHangupScenarioWithResponseAsync");

        // Establish a call
        CreateCallOptions options = new CreateCallOptions(
            URI.create(CALLBACK_URI),
            Collections.singletonList(CallMediaType.AUDIO),
            Collections.singletonList(CallingEventSubscriptionType.PARTICIPANTS_UPDATED));

        options.setAlternateCallerId(new PhoneNumberIdentifier(FROM_PHONE_NUMBER));

        Response<CallConnectionAsync> callConnectionAsyncResponse =
            callingServerAsyncClient.createCallConnectionWithResponse(
                new CommunicationUserIdentifier(fromUser),
                Collections.singletonList(new PhoneNumberIdentifier(TO_PHONE_NUMBER)),
                options).block();

        CallingServerTestUtils.validateCallConnectionAsyncResponse(callConnectionAsyncResponse);
        sleepIfRunningAgainstService(15000);
        assert callConnectionAsyncResponse != null;
        CallConnectionAsync callConnectionAsync = callConnectionAsyncResponse.getValue();
        try {
            // Add User
            String operationContext = UUID.randomUUID().toString();
            CommunicationUserIdentifier addedUser = new CommunicationUserIdentifier("8:acs:" + AZURE_TENANT_ID + "_" + "0000000d-3eb4-b48f-32fb-343a0d000fc1");
            Response<AddParticipantResult> addParticipantResponse =
                callConnectionAsync.addParticipantWithResponse(
                    addedUser,
                    null,
                    operationContext,
                    URI.create(CALLBACK_URI)).block();
            CallingServerTestUtils.validateAddParticipantResponse(addParticipantResponse);
            sleepIfRunningAgainstService(15000);
            assert addParticipantResponse != null;

            // Remove User
            Response<Void> removeParticipantResponse =
                callConnectionAsync.removeParticipantWithResponse(addedUser).block();
            CallingServerTestUtils.validateResponse(removeParticipantResponse);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            throw e;
        } finally {
            // Hang up
            Response<Void> hangupResponse = callConnectionAsync.hangupWithResponse().block();
            CallingServerTestUtils.validateResponse(hangupResponse);
        }
    }

    @ParameterizedTest
    @MethodSource("com.azure.core.test.TestBase#getHttpClients")
    @DisabledIfEnvironmentVariable(
        named = "SKIP_LIVE_TEST",
        matches = "(?i)(true)",
        disabledReason = "Requires human intervention")
    public void runCreateJoinHangupScenarioWithConnectionStringAsyncClient(HttpClient httpClient) {
        CallingServerClientBuilder builder = getCallingServerClientUsingConnectionString(httpClient);
        CallingServerAsyncClient callingServerAsyncClient =
            setupAsyncClient(builder, "runCreateJoinHangupScenarioWithConnectionStringAsyncClient");
        runCreateJoinHangupScenarioAsync(callingServerAsyncClient);
    }

    @ParameterizedTest
    @MethodSource("com.azure.core.test.TestBase#getHttpClients")
    @DisabledIfEnvironmentVariable(
        named = "SKIP_LIVE_TEST",
        matches = "(?i)(true)",
        disabledReason = "Requires human intervention")
    public void runCreateJoinHangupScenarioWithTokenCredentialAsyncClient(HttpClient httpClient) {
        CallingServerClientBuilder builder = getCallingServerClientUsingTokenCredential(httpClient);
        CallingServerAsyncClient callingServerAsyncClient =
            setupAsyncClient(builder, "runCreateJoinHangupScenarioWithTokenCredentialAsyncClient");
        runCreateJoinHangupScenarioAsync(callingServerAsyncClient);
    }

    private void runCreateJoinHangupScenarioAsync(CallingServerAsyncClient callingServerAsyncClient) {
        try {
            // Establish a call
            CreateCallOptions options = new CreateCallOptions(
                URI.create(CALLBACK_URI),
                Collections.singletonList(CallMediaType.AUDIO),
                Collections.singletonList(CallingEventSubscriptionType.PARTICIPANTS_UPDATED));

            options.setAlternateCallerId(new PhoneNumberIdentifier(FROM_PHONE_NUMBER));

            CallConnectionAsync callConnectionAsync = callingServerAsyncClient.createCallConnection(
                new CommunicationUserIdentifier(fromUser),
                Collections.singletonList(new PhoneNumberIdentifier(TO_PHONE_NUMBER)),
                options).block();

            CallingServerTestUtils.validateCallConnectionAsync(callConnectionAsync);

            // Join
            /*
              Waiting for an update to be able to get this serverCallId when using
              createCallConnection()
             */
            // serverCallId looks like this: "aHR0cHM6Ly94LWNvbnYtdXN3ZS0wMS5jb252LnNreXBlLmNvbS9jb252L3VodHNzZEZ3NFVHX1J4d1lHYWlLRmc_aT0yJmU9NjM3NTg0Mzk2NDM5NzQ5NzY4"
            String serverCallId = CallLocatorConverter.convert(callConnectionAsync.getCall().block().getCallLocator()).getServerCallId();

            JoinCallOptions joinCallOptions = new JoinCallOptions(
                URI.create(CALLBACK_URI),
                Collections.singletonList(CallMediaType.AUDIO),
                Collections.singletonList(CallingEventSubscriptionType.PARTICIPANTS_UPDATED));
            CallConnectionAsync joinedCallConnectionAsync =
                callingServerAsyncClient.joinCall(
                    new ServerCallLocator(serverCallId),
                    new CommunicationUserIdentifier(toUser),
                    joinCallOptions).block();
            CallingServerTestUtils.validateCallConnectionAsync(joinedCallConnectionAsync);

            //Hangup
            assert callConnectionAsync != null;
            callConnectionAsync.hangup().block();
            assert joinedCallConnectionAsync != null;
            joinedCallConnectionAsync.hangup().block();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            throw e;
        }
    }

    @ParameterizedTest
    @MethodSource("com.azure.core.test.TestBase#getHttpClients")
    @DisabledIfEnvironmentVariable(
        named = "SKIP_LIVE_TEST",
        matches = "(?i)(true)",
        disabledReason = "Requires human intervention")
    public void runCreateJoinHangupScenarioWithResponseAsync(HttpClient httpClient) {
        CallingServerClientBuilder builder = getCallingServerClientUsingConnectionString(httpClient);
        CallingServerAsyncClient callingServerAsyncClient =
            setupAsyncClient(builder, "runCreateJoinHangupScenarioWithResponseAsync");

        try {
            // Establish a call
            CreateCallOptions options = new CreateCallOptions(
                URI.create(CALLBACK_URI),
                Collections.singletonList(CallMediaType.AUDIO),
                Collections.singletonList(CallingEventSubscriptionType.PARTICIPANTS_UPDATED));

            options.setAlternateCallerId(new PhoneNumberIdentifier(FROM_PHONE_NUMBER));

            Response<CallConnectionAsync> callConnectionAsyncResponse =
                callingServerAsyncClient.createCallConnectionWithResponse(
                    new CommunicationUserIdentifier(fromUser),
                    Collections.singletonList(new PhoneNumberIdentifier(TO_PHONE_NUMBER)),
                    options).block();

            CallingServerTestUtils.validateCallConnectionAsyncResponse(callConnectionAsyncResponse);
            assert callConnectionAsyncResponse != null;
            CallConnectionAsync callConnectionAsync = callConnectionAsyncResponse.getValue();

            // Join
            /*
              Waiting for an update to be able to get this serverCallId when using
              createCallConnection()
             */
            String serverCallId = "aHR0cHM6Ly94LWNvbnYtdXN3ZS0wMS5jb252LnNreXBlLmNvbS9jb252L3lKQXY0TnVlOEV5bUpYVm1IYklIeUE_aT0wJmU9NjM3NTg0MzkwMjcxMzg0MTc3";
            JoinCallOptions joinCallOptions = new JoinCallOptions(
                URI.create(CALLBACK_URI),
                Collections.singletonList(CallMediaType.AUDIO),
                Collections.singletonList(CallingEventSubscriptionType.PARTICIPANTS_UPDATED));
            Response<CallConnectionAsync> joinedCallConnectionAsyncResponse =
                callingServerAsyncClient.joinCallWithResponse(
                    new ServerCallLocator(serverCallId),
                    new CommunicationUserIdentifier(toUser),
                    joinCallOptions).block();
            CallingServerTestUtils.validateJoinCallConnectionAsyncResponse(joinedCallConnectionAsyncResponse);
            assert joinedCallConnectionAsyncResponse != null;
            CallConnectionAsync joinedCallConnectionAsync = joinedCallConnectionAsyncResponse.getValue();

            //Hangup
            Response<Void> hangupResponse = callConnectionAsync.hangupWithResponse().block();
            CallingServerTestUtils.validateResponse(hangupResponse);
            hangupResponse = joinedCallConnectionAsync.hangupWithResponse().block();
            CallingServerTestUtils.validateResponse(hangupResponse);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            throw e;
        }
    }

    private CallingServerAsyncClient setupAsyncClient(CallingServerClientBuilder builder, String testName) {
        return addLoggingPolicy(builder, testName).buildAsyncClient();
    }

    protected CallingServerClientBuilder addLoggingPolicy(CallingServerClientBuilder builder, String testName) {
        return builder.addPolicy((context, next) -> logHeaders(testName, next));
    }
}

