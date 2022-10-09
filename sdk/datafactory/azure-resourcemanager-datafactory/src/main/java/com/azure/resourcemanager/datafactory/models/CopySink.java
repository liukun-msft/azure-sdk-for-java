// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.HashMap;
import java.util.Map;

/** A copy activity sink. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type",
    defaultImpl = CopySink.class)
@JsonTypeName("CopySink")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "DelimitedTextSink", value = DelimitedTextSink.class),
    @JsonSubTypes.Type(name = "JsonSink", value = JsonSink.class),
    @JsonSubTypes.Type(name = "OrcSink", value = OrcSink.class),
    @JsonSubTypes.Type(name = "RestSink", value = RestSink.class),
    @JsonSubTypes.Type(name = "AzurePostgreSqlSink", value = AzurePostgreSqlSink.class),
    @JsonSubTypes.Type(name = "AzureMySqlSink", value = AzureMySqlSink.class),
    @JsonSubTypes.Type(name = "AzureDatabricksDeltaLakeSink", value = AzureDatabricksDeltaLakeSink.class),
    @JsonSubTypes.Type(name = "SapCloudForCustomerSink", value = SapCloudForCustomerSink.class),
    @JsonSubTypes.Type(name = "AzureQueueSink", value = AzureQueueSink.class),
    @JsonSubTypes.Type(name = "AzureTableSink", value = AzureTableSink.class),
    @JsonSubTypes.Type(name = "AvroSink", value = AvroSink.class),
    @JsonSubTypes.Type(name = "ParquetSink", value = ParquetSink.class),
    @JsonSubTypes.Type(name = "BinarySink", value = BinarySink.class),
    @JsonSubTypes.Type(name = "BlobSink", value = BlobSink.class),
    @JsonSubTypes.Type(name = "FileSystemSink", value = FileSystemSink.class),
    @JsonSubTypes.Type(name = "DocumentDbCollectionSink", value = DocumentDbCollectionSink.class),
    @JsonSubTypes.Type(name = "CosmosDbSqlApiSink", value = CosmosDbSqlApiSink.class),
    @JsonSubTypes.Type(name = "SqlSink", value = SqlSink.class),
    @JsonSubTypes.Type(name = "SqlServerSink", value = SqlServerSink.class),
    @JsonSubTypes.Type(name = "AzureSqlSink", value = AzureSqlSink.class),
    @JsonSubTypes.Type(name = "SqlMISink", value = SqlMISink.class),
    @JsonSubTypes.Type(name = "SqlDWSink", value = SqlDWSink.class),
    @JsonSubTypes.Type(name = "SnowflakeSink", value = SnowflakeSink.class),
    @JsonSubTypes.Type(name = "OracleSink", value = OracleSink.class),
    @JsonSubTypes.Type(name = "AzureDataLakeStoreSink", value = AzureDataLakeStoreSink.class),
    @JsonSubTypes.Type(name = "AzureBlobFSSink", value = AzureBlobFSSink.class),
    @JsonSubTypes.Type(name = "AzureSearchIndexSink", value = AzureSearchIndexSink.class),
    @JsonSubTypes.Type(name = "OdbcSink", value = OdbcSink.class),
    @JsonSubTypes.Type(name = "InformixSink", value = InformixSink.class),
    @JsonSubTypes.Type(name = "MicrosoftAccessSink", value = MicrosoftAccessSink.class),
    @JsonSubTypes.Type(name = "DynamicsSink", value = DynamicsSink.class),
    @JsonSubTypes.Type(name = "DynamicsCrmSink", value = DynamicsCrmSink.class),
    @JsonSubTypes.Type(name = "CommonDataServiceForAppsSink", value = CommonDataServiceForAppsSink.class),
    @JsonSubTypes.Type(name = "AzureDataExplorerSink", value = AzureDataExplorerSink.class),
    @JsonSubTypes.Type(name = "SalesforceSink", value = SalesforceSink.class),
    @JsonSubTypes.Type(name = "SalesforceServiceCloudSink", value = SalesforceServiceCloudSink.class),
    @JsonSubTypes.Type(name = "MongoDbAtlasSink", value = MongoDbAtlasSink.class),
    @JsonSubTypes.Type(name = "MongoDbV2Sink", value = MongoDbV2Sink.class),
    @JsonSubTypes.Type(name = "CosmosDbMongoDbApiSink", value = CosmosDbMongoDbApiSink.class)
})
@Fluent
public class CopySink {
    /*
     * Write batch size. Type: integer (or Expression with resultType integer), minimum: 0.
     */
    @JsonProperty(value = "writeBatchSize")
    private Object writeBatchSize;

    /*
     * Write batch timeout. Type: string (or Expression with resultType string), pattern:
     * ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     */
    @JsonProperty(value = "writeBatchTimeout")
    private Object writeBatchTimeout;

    /*
     * Sink retry count. Type: integer (or Expression with resultType integer).
     */
    @JsonProperty(value = "sinkRetryCount")
    private Object sinkRetryCount;

    /*
     * Sink retry wait. Type: string (or Expression with resultType string), pattern:
     * ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     */
    @JsonProperty(value = "sinkRetryWait")
    private Object sinkRetryWait;

    /*
     * The maximum concurrent connection count for the sink data store. Type: integer (or Expression with resultType
     * integer).
     */
    @JsonProperty(value = "maxConcurrentConnections")
    private Object maxConcurrentConnections;

    /*
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType
     * boolean).
     */
    @JsonProperty(value = "disableMetricsCollection")
    private Object disableMetricsCollection;

    /*
     * A copy activity sink.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the writeBatchSize property: Write batch size. Type: integer (or Expression with resultType integer),
     * minimum: 0.
     *
     * @return the writeBatchSize value.
     */
    public Object writeBatchSize() {
        return this.writeBatchSize;
    }

    /**
     * Set the writeBatchSize property: Write batch size. Type: integer (or Expression with resultType integer),
     * minimum: 0.
     *
     * @param writeBatchSize the writeBatchSize value to set.
     * @return the CopySink object itself.
     */
    public CopySink withWriteBatchSize(Object writeBatchSize) {
        this.writeBatchSize = writeBatchSize;
        return this;
    }

    /**
     * Get the writeBatchTimeout property: Write batch timeout. Type: string (or Expression with resultType string),
     * pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     *
     * @return the writeBatchTimeout value.
     */
    public Object writeBatchTimeout() {
        return this.writeBatchTimeout;
    }

    /**
     * Set the writeBatchTimeout property: Write batch timeout. Type: string (or Expression with resultType string),
     * pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     *
     * @param writeBatchTimeout the writeBatchTimeout value to set.
     * @return the CopySink object itself.
     */
    public CopySink withWriteBatchTimeout(Object writeBatchTimeout) {
        this.writeBatchTimeout = writeBatchTimeout;
        return this;
    }

    /**
     * Get the sinkRetryCount property: Sink retry count. Type: integer (or Expression with resultType integer).
     *
     * @return the sinkRetryCount value.
     */
    public Object sinkRetryCount() {
        return this.sinkRetryCount;
    }

    /**
     * Set the sinkRetryCount property: Sink retry count. Type: integer (or Expression with resultType integer).
     *
     * @param sinkRetryCount the sinkRetryCount value to set.
     * @return the CopySink object itself.
     */
    public CopySink withSinkRetryCount(Object sinkRetryCount) {
        this.sinkRetryCount = sinkRetryCount;
        return this;
    }

    /**
     * Get the sinkRetryWait property: Sink retry wait. Type: string (or Expression with resultType string), pattern:
     * ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     *
     * @return the sinkRetryWait value.
     */
    public Object sinkRetryWait() {
        return this.sinkRetryWait;
    }

    /**
     * Set the sinkRetryWait property: Sink retry wait. Type: string (or Expression with resultType string), pattern:
     * ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     *
     * @param sinkRetryWait the sinkRetryWait value to set.
     * @return the CopySink object itself.
     */
    public CopySink withSinkRetryWait(Object sinkRetryWait) {
        this.sinkRetryWait = sinkRetryWait;
        return this;
    }

    /**
     * Get the maxConcurrentConnections property: The maximum concurrent connection count for the sink data store. Type:
     * integer (or Expression with resultType integer).
     *
     * @return the maxConcurrentConnections value.
     */
    public Object maxConcurrentConnections() {
        return this.maxConcurrentConnections;
    }

    /**
     * Set the maxConcurrentConnections property: The maximum concurrent connection count for the sink data store. Type:
     * integer (or Expression with resultType integer).
     *
     * @param maxConcurrentConnections the maxConcurrentConnections value to set.
     * @return the CopySink object itself.
     */
    public CopySink withMaxConcurrentConnections(Object maxConcurrentConnections) {
        this.maxConcurrentConnections = maxConcurrentConnections;
        return this;
    }

    /**
     * Get the disableMetricsCollection property: If true, disable data store metrics collection. Default is false.
     * Type: boolean (or Expression with resultType boolean).
     *
     * @return the disableMetricsCollection value.
     */
    public Object disableMetricsCollection() {
        return this.disableMetricsCollection;
    }

    /**
     * Set the disableMetricsCollection property: If true, disable data store metrics collection. Default is false.
     * Type: boolean (or Expression with resultType boolean).
     *
     * @param disableMetricsCollection the disableMetricsCollection value to set.
     * @return the CopySink object itself.
     */
    public CopySink withDisableMetricsCollection(Object disableMetricsCollection) {
        this.disableMetricsCollection = disableMetricsCollection;
        return this;
    }

    /**
     * Get the additionalProperties property: A copy activity sink.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: A copy activity sink.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the CopySink object itself.
     */
    public CopySink withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
