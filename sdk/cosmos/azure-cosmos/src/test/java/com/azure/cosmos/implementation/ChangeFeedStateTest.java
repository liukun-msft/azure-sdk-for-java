// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.cosmos.implementation;

import com.azure.cosmos.implementation.changefeed.common.ChangeFeedMode;
import com.azure.cosmos.implementation.changefeed.common.ChangeFeedStartFromInternal;
import com.azure.cosmos.implementation.changefeed.common.ChangeFeedStartFromTypes;
import com.azure.cosmos.implementation.changefeed.common.ChangeFeedState;
import com.azure.cosmos.implementation.changefeed.common.ChangeFeedStateV1;
import com.azure.cosmos.implementation.feedranges.FeedRangeContinuation;
import com.azure.cosmos.implementation.feedranges.FeedRangePartitionKeyRangeImpl;
import com.azure.cosmos.implementation.query.CompositeContinuationToken;
import com.azure.cosmos.implementation.routing.Range;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import static com.azure.cosmos.implementation.TestUtils.mockDiagnosticsClientContext;
import static org.assertj.core.api.Assertions.assertThat;

public class ChangeFeedStateTest {
    @DataProvider(name = "populateRequestArgProvider")
    public Object[][] populateRequestArgProvider() {
        return new Object[][] {
            // changeFeed mode, changeFeed startFrom type, use continuation
            { ChangeFeedMode.INCREMENTAL, ChangeFeedStartFromTypes.BEGINNING, true },
            { ChangeFeedMode.INCREMENTAL, ChangeFeedStartFromTypes.NOW, true },
            { ChangeFeedMode.INCREMENTAL, ChangeFeedStartFromTypes.POINT_IN_TIME, true },
            { ChangeFeedMode.INCREMENTAL, ChangeFeedStartFromTypes.BEGINNING, false },
            { ChangeFeedMode.INCREMENTAL, ChangeFeedStartFromTypes.NOW, false },
            { ChangeFeedMode.INCREMENTAL, ChangeFeedStartFromTypes.POINT_IN_TIME, false },
            { ChangeFeedMode.FULL_FIDELITY, ChangeFeedStartFromTypes.NOW, true },
            { ChangeFeedMode.FULL_FIDELITY, ChangeFeedStartFromTypes.NOW, false }
        };
    }

    @Test(groups = "unit")
    public void changeFeedState_incrementalMode_startFromNow_PKRangeId_toJsonFromJson() {
        String containerRid = "/cols/" + UUID.randomUUID().toString();
        String pkRangeId = UUID.randomUUID().toString();
        FeedRangePartitionKeyRangeImpl feedRange = new FeedRangePartitionKeyRangeImpl(pkRangeId);
        ChangeFeedStartFromInternal startFromSettings = ChangeFeedStartFromInternal.createFromNow();
        ChangeFeedState stateWithoutContinuation = new ChangeFeedStateV1(
            containerRid,
            feedRange,
            ChangeFeedMode.INCREMENTAL,
            startFromSettings,
            null);

        String base64EncodedJsonRepresentation = stateWithoutContinuation.toString();
        String jsonRepresentation = new String(
            Base64.getUrlDecoder().decode(base64EncodedJsonRepresentation),
            StandardCharsets.UTF_8);
        assertThat(jsonRepresentation)
            .isEqualTo(
                String.format(
                    "{\"V\":1," +
                        "\"Rid\":\"%s\"," +
                        "\"Mode\":\"INCREMENTAL\"," +
                        "\"StartFrom\":{\"Type\":\"NOW\"}," +
                        "\"PKRangeId\":\"%s\"}",
                    containerRid,
                    pkRangeId));

        assertThat(ChangeFeedState.fromString(base64EncodedJsonRepresentation))
            .isNotNull()
            .isInstanceOf(ChangeFeedStateV1.class);

        ChangeFeedStateV1 stateWithoutContinuationDeserialized =
            (ChangeFeedStateV1)ChangeFeedState.fromString(base64EncodedJsonRepresentation);

        String representationAfterDeserialization = stateWithoutContinuationDeserialized.toString();
        assertThat(representationAfterDeserialization).isEqualTo(base64EncodedJsonRepresentation);

        String continuationDummy = UUID.randomUUID().toString();
        String continuationJson = String.format(
            "{\"V\":1," +
                "\"Rid\":\"%s\"," +
                "\"Continuation\":[" +
                "{\"token\":\"%s\",\"range\":{\"min\":\"AA\",\"max\":\"BB\"}}," +
                "{\"token\":\"%s\",\"range\":{\"min\":\"CC\",\"max\":\"DD\"}}" +
                "]," +
                "\"PKRangeId\":\"%s\"}",
            containerRid,
            continuationDummy,
            continuationDummy,
            pkRangeId);

        FeedRangeContinuation continuation = FeedRangeContinuation.convert(continuationJson);

        ChangeFeedState stateWithContinuation =
            stateWithoutContinuation.setContinuation(continuation);
        base64EncodedJsonRepresentation = stateWithContinuation.toString();
        jsonRepresentation = new String(
            Base64.getUrlDecoder().decode(base64EncodedJsonRepresentation),
            StandardCharsets.UTF_8);

        assertThat(jsonRepresentation)
            .isEqualTo(
                String.format(
                    "{\"V\":1," +
                        "\"Rid\":\"%s\"," +
                        "\"Mode\":\"INCREMENTAL\"," +
                        "\"StartFrom\":{\"Type\":\"NOW\"}," +
                        "\"Continuation\":%s}",
                    containerRid,
                    continuationJson));

        assertThat(ChangeFeedState.fromString(base64EncodedJsonRepresentation))
            .isNotNull()
            .isInstanceOf(ChangeFeedStateV1.class);

        ChangeFeedStateV1 stateWithContinuationDeserialized =
            (ChangeFeedStateV1)ChangeFeedState.fromString(base64EncodedJsonRepresentation);

        representationAfterDeserialization = stateWithContinuationDeserialized.toString();
        assertThat(representationAfterDeserialization).isEqualTo(base64EncodedJsonRepresentation);
    }

    @Test(groups = "unit")
    public void changeFeedState_fullFidelityMode_startFromNow_PKRangeId_toJsonFromJson() {
        String containerRid = "/cols/" + UUID.randomUUID().toString();
        String pkRangeId = UUID.randomUUID().toString();
        FeedRangePartitionKeyRangeImpl feedRange = new FeedRangePartitionKeyRangeImpl(pkRangeId);
        ChangeFeedStartFromInternal startFromSettings = ChangeFeedStartFromInternal.createFromNow();
        ChangeFeedState stateWithoutContinuation = new ChangeFeedStateV1(
            containerRid,
            feedRange,
            ChangeFeedMode.FULL_FIDELITY,
            startFromSettings,
            null);

        String base64EncodedJsonRepresentation = stateWithoutContinuation.toString();
        String jsonRepresentation = new String(
            Base64.getUrlDecoder().decode(base64EncodedJsonRepresentation),
            StandardCharsets.UTF_8);
        assertThat(jsonRepresentation)
            .isEqualTo(
                String.format(
                    "{\"V\":1," +
                        "\"Rid\":\"%s\"," +
                        "\"Mode\":\"FULL_FIDELITY\"," +
                        "\"StartFrom\":{\"Type\":\"NOW\"}," +
                        "\"PKRangeId\":\"%s\"}",
                    containerRid,
                    pkRangeId));

        assertThat(ChangeFeedState.fromString(base64EncodedJsonRepresentation))
            .isNotNull()
            .isInstanceOf(ChangeFeedStateV1.class);

        ChangeFeedStateV1 stateWithoutContinuationDeserialized =
            (ChangeFeedStateV1)ChangeFeedState.fromString(base64EncodedJsonRepresentation);

        String representationAfterDeserialization = stateWithoutContinuationDeserialized.toString();
        assertThat(representationAfterDeserialization).isEqualTo(base64EncodedJsonRepresentation);

        String continuationDummy = UUID.randomUUID().toString();
        String continuationJson = String.format(
            "{\"V\":1," +
                "\"Rid\":\"%s\"," +
                "\"Continuation\":[" +
                "{\"token\":\"%s\",\"range\":{\"min\":\"AA\",\"max\":\"BB\"}}," +
                "{\"token\":\"%s\",\"range\":{\"min\":\"CC\",\"max\":\"DD\"}}" +
                "]," +
                "\"PKRangeId\":\"%s\"}",
            containerRid,
            continuationDummy,
            continuationDummy,
            pkRangeId);

        FeedRangeContinuation continuation = FeedRangeContinuation.convert(continuationJson);

        ChangeFeedState stateWithContinuation =
            stateWithoutContinuation.setContinuation(continuation);
        base64EncodedJsonRepresentation = stateWithContinuation.toString();
        jsonRepresentation = new String(
            Base64.getUrlDecoder().decode(base64EncodedJsonRepresentation),
            StandardCharsets.UTF_8);

        assertThat(jsonRepresentation)
            .isEqualTo(
                String.format(
                    "{\"V\":1," +
                        "\"Rid\":\"%s\"," +
                        "\"Mode\":\"FULL_FIDELITY\"," +
                        "\"StartFrom\":{\"Type\":\"NOW\"}," +
                        "\"Continuation\":%s}",
                    containerRid,
                    continuationJson));

        assertThat(ChangeFeedState.fromString(base64EncodedJsonRepresentation))
            .isNotNull()
            .isInstanceOf(ChangeFeedStateV1.class);

        ChangeFeedStateV1 stateWithContinuationDeserialized =
            (ChangeFeedStateV1)ChangeFeedState.fromString(base64EncodedJsonRepresentation);

        representationAfterDeserialization = stateWithContinuationDeserialized.toString();
        assertThat(representationAfterDeserialization).isEqualTo(base64EncodedJsonRepresentation);
    }

    private ChangeFeedState createDefaultStateWithContinuation(String continuationAAToCC, String continuationCCToEE)
    {
        String containerRid = "/cols/" + UUID.randomUUID();
        String pkRangeId = UUID.randomUUID().toString();
        FeedRangePartitionKeyRangeImpl feedRange = new FeedRangePartitionKeyRangeImpl(pkRangeId);

        return this.createStateWithContinuation(
            containerRid,
            feedRange,
            continuationAAToCC,
            continuationCCToEE,
            ChangeFeedMode.INCREMENTAL,
            ChangeFeedStartFromInternal.createFromNow());
    }

    private ChangeFeedState createStateWithContinuation(
        String containerRid,
        FeedRangePartitionKeyRangeImpl feedRange,
        String continuationAAToCC,
        String continuationCCToEE,
        ChangeFeedMode changeFeedMode,
        ChangeFeedStartFromInternal startFromSettings)
    {
        String continuationJson = String.format(
            "{\"V\":1," +
                "\"Rid\":\"%s\"," +
                "\"Continuation\":[" +
                "{\"token\":\"%s\",\"range\":{\"min\":\"AA\",\"max\":\"CC\"}}," +
                "{\"token\":\"%s\",\"range\":{\"min\":\"CC\",\"max\":\"EE\"}}" +
                "]," +
                "\"PKRangeId\":\"%s\"}",
            containerRid,
            continuationAAToCC,
            continuationCCToEE,
            feedRange.getPartitionKeyRangeId());

        FeedRangeContinuation continuation = FeedRangeContinuation.convert(continuationJson);
        return new ChangeFeedStateV1(
            containerRid,
            feedRange,
            changeFeedMode,
            startFromSettings,
            continuation);
    }

    @Test(groups = "unit")
    public void changeFeedState_extractContinuationTokens() {
        String continuationAAToCC = UUID.randomUUID().toString();
        String continuationCCToEE = UUID.randomUUID().toString();
        List<CompositeContinuationToken> tokens =
            this
            .createDefaultStateWithContinuation(continuationAAToCC, continuationCCToEE)
            .extractForEffectiveRange(new Range<>("AA", "CC", true, false))
            .extractContinuationTokens();

        assertThat(tokens)
            .isNotNull()
            .hasSize(1);
        assertThat(tokens.get(0))
            .isNotNull();
        assertThat(tokens.get(0).getRange())
            .isNotNull()
            .isEqualTo(new Range<>("AA", "CC", true, false));
        assertThat(tokens.get(0).getToken())
            .isNotNull()
            .isEqualTo(continuationAAToCC);

        tokens =
            this
                .createDefaultStateWithContinuation(continuationAAToCC, continuationCCToEE)
                .extractForEffectiveRange(new Range<>("BB", "DD", true, false))
                .extractContinuationTokens();

        assertThat(tokens)
            .isNotNull()
            .hasSize(2);
        assertThat(tokens.get(0))
            .isNotNull();
        assertThat(tokens.get(0).getRange())
            .isNotNull()
            .isEqualTo(new Range<>("BB", "CC", true, false));
        assertThat(tokens.get(0).getToken())
            .isNotNull()
            .isEqualTo(continuationAAToCC);
        assertThat(tokens.get(1))
            .isNotNull();
        assertThat(tokens.get(1).getRange())
            .isNotNull()
            .isEqualTo(new Range<>("CC", "DD", true, false));
        assertThat(tokens.get(1).getToken())
            .isNotNull()
            .isEqualTo(continuationCCToEE);
    }

    @Test(groups = "unit")
    public void changeFeedState_merge() {
        String continuationAAToCC = UUID.randomUUID().toString();
        String continuationCCToEE = UUID.randomUUID().toString();
        ChangeFeedState original = this
            .createDefaultStateWithContinuation(continuationAAToCC, continuationCCToEE);
        ChangeFeedState stateAAToBB = original.extractForEffectiveRange(
            new Range<>("AA", "BB", true, false));
        ChangeFeedState stateBBToDD = original.extractForEffectiveRange(
            new Range<>("BB", "DD", true, false));
        ChangeFeedState stateDDToEE = original.extractForEffectiveRange(
            new Range<>("DD", "EE", true, false));

        ChangeFeedState merged = ChangeFeedState.merge(
            new ChangeFeedState[] { stateAAToBB, stateBBToDD, stateDDToEE}
        );

        assertThat(merged)
            .isNotNull();

        List<CompositeContinuationToken> tokens = merged.extractContinuationTokens();

        assertThat(tokens)
            .isNotNull()
            .hasSize(4);
        assertThat(tokens.get(0))
            .isNotNull();
        assertThat(tokens.get(0).getRange())
            .isNotNull()
            .isEqualTo(new Range<>("AA", "BB", true, false));
        assertThat(tokens.get(0).getToken())
            .isNotNull()
            .isEqualTo(continuationAAToCC);

        assertThat(tokens.get(1))
            .isNotNull();
        assertThat(tokens.get(1).getRange())
            .isNotNull()
            .isEqualTo(new Range<>("BB", "CC", true, false));
        assertThat(tokens.get(1).getToken())
            .isNotNull()
            .isEqualTo(continuationAAToCC);

        assertThat(tokens.get(2))
            .isNotNull();
        assertThat(tokens.get(2).getRange())
            .isNotNull()
            .isEqualTo(new Range<>("CC", "DD", true, false));
        assertThat(tokens.get(2).getToken())
            .isNotNull()
            .isEqualTo(continuationCCToEE);

        assertThat(tokens.get(3))
            .isNotNull();
        assertThat(tokens.get(3).getRange())
            .isNotNull()
            .isEqualTo(new Range<>("DD", "EE", true, false));
        assertThat(tokens.get(3).getToken())
            .isNotNull()
            .isEqualTo(continuationCCToEE);
    }

    @Test(dataProvider = "populateRequestArgProvider", groups = "unit")
    public void changeFeedState_populateRequest(
        ChangeFeedMode changeFeedMode,
        ChangeFeedStartFromTypes initialChangeFeedStartFromTypes,
        boolean useContinuationToken) {

        String containerRid = "/cols/" + UUID.randomUUID();
        String pkRangeId = UUID.randomUUID().toString();
        FeedRangePartitionKeyRangeImpl feedRange = new FeedRangePartitionKeyRangeImpl(pkRangeId);
        ChangeFeedStartFromInternal changeFeedStartFromInternal;
        Map<String, String> expectedHeaders = new HashMap<>();

        switch (initialChangeFeedStartFromTypes) {
            case BEGINNING:
                changeFeedStartFromInternal = ChangeFeedStartFromInternal.createFromBeginning();
                break;
            case NOW:
                changeFeedStartFromInternal = ChangeFeedStartFromInternal.createFromNow();
                expectedHeaders.put(HttpConstants.HttpHeaders.IF_NONE_MATCH, HttpConstants.HeaderValues.IF_NONE_MATCH_ALL);
                break;
            case POINT_IN_TIME:
                Instant startTime = Instant.now();
                changeFeedStartFromInternal = ChangeFeedStartFromInternal.createFromPointInTime(startTime);
                expectedHeaders.put(HttpConstants.HttpHeaders.IF_MODIFIED_SINCE, Utils.instantAsUTCRFC1123(startTime));
                break;
            default:
                throw new IllegalStateException("Invalid initialChangeFeedStartFromTypes " + initialChangeFeedStartFromTypes);
        }

        ChangeFeedState changeFeedState;
        if (useContinuationToken) {
            String continuationAAToCC = UUID.randomUUID().toString();
            String continuationCCToEE = UUID.randomUUID().toString();
            changeFeedState = this.createStateWithContinuation(
                containerRid,
                feedRange,
                continuationAAToCC,
                continuationCCToEE,
                changeFeedMode,
                changeFeedStartFromInternal);

            expectedHeaders.put(
                HttpConstants.HttpHeaders.IF_NONE_MATCH,
                changeFeedState.getContinuation().getCurrentContinuationToken().getToken());
        } else {
            changeFeedState = new ChangeFeedStateV1(
                containerRid,
                feedRange,
                changeFeedMode,
                changeFeedStartFromInternal,
                null);
        }

        int maxItemCount = 1;
        expectedHeaders.put(HttpConstants.HttpHeaders.PAGE_SIZE, String.valueOf(maxItemCount));
        expectedHeaders.put(HttpConstants.HttpHeaders.POPULATE_QUERY_METRICS, "true");
        if (changeFeedMode == ChangeFeedMode.INCREMENTAL) {
            expectedHeaders.put(HttpConstants.HttpHeaders.A_IM, HttpConstants.A_IMHeaderValues.INCREMENTAL_FEED);
        } else {
            expectedHeaders.put(HttpConstants.HttpHeaders.A_IM, HttpConstants.A_IMHeaderValues.FULL_FIDELITY_FEED);
            expectedHeaders.put(
                HttpConstants.HttpHeaders.CHANGE_FEED_WIRE_FORMAT_VERSION,
                HttpConstants.ChangeFeedWireFormatVersions.SEPARATE_METADATA_WITH_CRTS);
        }

        RxDocumentServiceRequest serviceRequest =
            RxDocumentServiceRequest.create(
                mockDiagnosticsClientContext(),
                OperationType.Read,
                ResourceType.Document);
        changeFeedState.populateRequest(serviceRequest, maxItemCount);
        Map<String, String> headers = serviceRequest.getHeaders();

        for (String key : expectedHeaders.keySet()) {
            assertThat(headers.containsKey(key)).isTrue();
            assertThat(headers.get(key)).isEqualTo(expectedHeaders.get(key));
        }
    }
}
