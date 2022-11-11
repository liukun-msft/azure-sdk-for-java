// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.developer.loadtesting;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.azure.core.credential.TokenCredential;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public final class ReadmeSamples {
    public void auth() {
        // BEGIN: java-readme-sample-auth
        // ensure the user, service principal or managed identity used has Loadtesting Contributor role for the resource
        TokenCredential credential = new DefaultAzureCredentialBuilder()
            .build();
        // create client using DefaultAzureCredential
        LoadTestingClient client = new LoadTestingClientBuilder()
            .credential(credential)
            .endpoint("<Enter Azure Load Testing Data-Plane URL>")
            .buildClient();
        LoadTestAdministrationClient adminClient = client.getLoadTestAdministrationClient();
        TestRunClient testRunClient = client.getLoadTestRunClient();
        // END: java-readme-sample-auth
    }

    public void createTest() {
        // BEGIN: java-readme-sample-createTest
        LoadTestingClient client = new LoadTestingClientBuilder()
            .credential(new DefaultAzureCredentialBuilder().build())
            .endpoint("<endpoint>")
            .buildClient();

        // construct Test object using nested String:Object Maps
        Map<String, Object> testMap = new HashMap<String, Object>();
        testMap.put("displayName", "Sample Display Name");
        testMap.put("description", "Sample Description");

        // loadTestConfig describes the number of test engines to generate load
        Map<String, Object> loadTestConfigMap = new HashMap<String, Object>();
        loadTestConfigMap.put("engineInstances", 1);
        testMap.put("loadTestConfig", loadTestConfigMap);

        // environmentVariables are plain-text data passed to test engines
        Map<String, Object> envVarMap = new HashMap<String, Object>();
        envVarMap.put("a", "b");
        envVarMap.put("x", "y");
        testMap.put("environmentVariables", envVarMap);

        // secrets are secure data sent using Azure Key Vault
        Map<String, Object> secretMap = new HashMap<String, Object>();
        Map<String, Object> sampleSecretMap = new HashMap<String, Object>();
        sampleSecretMap.put("value", "https://samplevault.vault.azure.net/secrets/samplesecret/f113f91fd4c44a368049849c164db827");
        sampleSecretMap.put("type", "AKV_SECRET_URI");
        secretMap.put("sampleSecret", sampleSecretMap);
        testMap.put("secrets", secretMap);

        // passFailCriteria define the conditions to conclude the test as success
        Map<String, Object> passFailMap = new HashMap<String, Object>();
        Map<String, Object> passFailMetrics = new HashMap<String, Object>();
        Map<String, Object> samplePassFailMetric = new HashMap<String, Object>();
        samplePassFailMetric.put("clientmetric", "response_time_ms");
        samplePassFailMetric.put("aggregate", "percentage");
        samplePassFailMetric.put("condition", ">");
        samplePassFailMetric.put("value", "20");
        samplePassFailMetric.put("action", "continue");
        passFailMetrics.put("fefd759d-7fe8-4f83-8b6d-aeebe0f491fe", samplePassFailMetric);
        passFailMap.put("passFailMetrics", passFailMetrics);
        testMap.put("passFailCriteria", passFailMap);

        // convert the object Map to JSON BinaryData
        BinaryData test = BinaryData.fromObject(testMap);

        // receive response with BinaryData content
        Response<BinaryData> testOutResponse = client.getLoadTestAdministrationClient().createOrUpdateTestWithResponse("test12345", test, null);
        System.out.println(testOutResponse.getValue().toString());
        // END: java-readme-sample-createTest
    }

    public void uploadTestFile() throws IOException {
        // BEGIN: java-readme-sample-uploadTestFile
        LoadTestingClient client = new LoadTestingClientBuilder()
            .credential(new DefaultAzureCredentialBuilder().build())
            .endpoint("<endpoint>")
            .buildClient();

        // extract file contents to BinaryData
        BinaryData fileData = BinaryData.fromFile(new File("path/to/file").toPath());

        // receive response with BinaryData content
        Response<BinaryData> fileUrlOut = client.getLoadTestAdministrationClient().uploadTestFileWithResponse("test12345", "file12345", "sample-file.jmx", fileData, null);
        System.out.println(fileUrlOut.getValue().toString());
        // END: java-readme-sample-uploadTestFile
    }

    public void runTest() {
        // BEGIN: java-readme-sample-runTest
        LoadTestingClient client = new LoadTestingClientBuilder()
            .credential(new DefaultAzureCredentialBuilder().build())
            .endpoint("<endpoint>")
            .buildClient();

        // construct Test Run object using nested String:Object Maps
        Map<String, Object> testRunMap = new HashMap<String, Object>();
        testRunMap.put("testId", "test12345");
        testRunMap.put("displayName", "SDK-Created-TestRun");

        // convert the object Map to JSON BinaryData
        BinaryData testRun = BinaryData.fromObject(testRunMap);

        // receive response with BinaryData content
        Response<BinaryData> testRunOut = client.getLoadTestRunClient().createOrUpdateTestRunWithResponse("testrun12345", testRun, null);
        System.out.println(testRunOut.getValue().toString());

        // wait for test to reach terminal state
        JsonNode testRunJson = null;
        String testStatus = null, startDateTime = null, endDateTime = null;
        while (testStatus == null || (testStatus != "DONE" && testStatus != "CANCELLED" && testStatus != "FAILED")) {
            testRunOut = client.getLoadTestRunClient().getTestRunWithResponse("testrun12345", null);
            // parse JSON and read status value
            try {
                testRunJson = new ObjectMapper().readTree(testRunOut.getValue().toString());
                testStatus = testRunJson.get("status").asText();
            } catch (JsonProcessingException e) {
                System.out.println("Error processing JSON response");
                // handle error condition
            }

            // wait and check test status every 5 seconds
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                // handle interruption
            }
        }

        startDateTime = testRunJson.get("startDateTime").asText();
        endDateTime = testRunJson.get("endDateTime").asText();

        // construct Test Run Client Metrics object using nested String:Object Maps
        Map<String, Object> clientMetricsMap = new HashMap<String, Object>();
        List<String> requestSamplersList = new ArrayList<String>();
        requestSamplersList.add("Homepage");
        clientMetricsMap.put("requestSamplers", requestSamplersList);

        List<String> errorsList = new ArrayList<String>();
        errorsList.add("500");
        clientMetricsMap.put("errors", errorsList);

        List<String> percentilesList = new ArrayList<String>();
        percentilesList.add("95");
        clientMetricsMap.put("percentiles", percentilesList);

        clientMetricsMap.put("groupByInterval", "10s");
        clientMetricsMap.put("startTime", startDateTime);
        clientMetricsMap.put("endTime", endDateTime);

        // convert the object Map to JSON BinaryData
        BinaryData clientMetrics = BinaryData.fromObject(clientMetricsMap);

        // fetch client metrics
        Response<BinaryData> clientMetricsOut = client.getLoadTestRunClient().getTestRunClientMetricsWithResponse("testrun12345", clientMetrics, null);
        System.out.println(clientMetricsOut.getValue().toString());
        // END: java-readme-sample-runTest
    }
}
