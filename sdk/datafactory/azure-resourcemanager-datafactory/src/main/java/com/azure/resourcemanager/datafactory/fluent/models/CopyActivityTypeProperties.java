// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.models.CopySink;
import com.azure.resourcemanager.datafactory.models.CopySource;
import com.azure.resourcemanager.datafactory.models.LogSettings;
import com.azure.resourcemanager.datafactory.models.LogStorageSettings;
import com.azure.resourcemanager.datafactory.models.RedirectIncompatibleRowSettings;
import com.azure.resourcemanager.datafactory.models.SkipErrorFile;
import com.azure.resourcemanager.datafactory.models.StagingSettings;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Copy activity properties. */
@Fluent
public final class CopyActivityTypeProperties {
    /*
     * Copy activity source.
     */
    @JsonProperty(value = "source", required = true)
    private CopySource source;

    /*
     * Copy activity sink.
     */
    @JsonProperty(value = "sink", required = true)
    private CopySink sink;

    /*
     * Copy activity translator. If not specified, tabular translator is used.
     */
    @JsonProperty(value = "translator")
    private Object translator;

    /*
     * Specifies whether to copy data via an interim staging. Default value is false. Type: boolean (or Expression with
     * resultType boolean).
     */
    @JsonProperty(value = "enableStaging")
    private Object enableStaging;

    /*
     * Specifies interim staging settings when EnableStaging is true.
     */
    @JsonProperty(value = "stagingSettings")
    private StagingSettings stagingSettings;

    /*
     * Maximum number of concurrent sessions opened on the source or sink to avoid overloading the data store. Type:
     * integer (or Expression with resultType integer), minimum: 0.
     */
    @JsonProperty(value = "parallelCopies")
    private Object parallelCopies;

    /*
     * Maximum number of data integration units that can be used to perform this data movement. Type: integer (or
     * Expression with resultType integer), minimum: 0.
     */
    @JsonProperty(value = "dataIntegrationUnits")
    private Object dataIntegrationUnits;

    /*
     * Whether to skip incompatible row. Default value is false. Type: boolean (or Expression with resultType boolean).
     */
    @JsonProperty(value = "enableSkipIncompatibleRow")
    private Object enableSkipIncompatibleRow;

    /*
     * Redirect incompatible row settings when EnableSkipIncompatibleRow is true.
     */
    @JsonProperty(value = "redirectIncompatibleRowSettings")
    private RedirectIncompatibleRowSettings redirectIncompatibleRowSettings;

    /*
     * (Deprecated. Please use LogSettings) Log storage settings customer need to provide when enabling session log.
     */
    @JsonProperty(value = "logStorageSettings")
    private LogStorageSettings logStorageSettings;

    /*
     * Log settings customer needs provide when enabling log.
     */
    @JsonProperty(value = "logSettings")
    private LogSettings logSettings;

    /*
     * Preserve Rules.
     */
    @JsonProperty(value = "preserveRules")
    private List<Object> preserveRules;

    /*
     * Preserve rules.
     */
    @JsonProperty(value = "preserve")
    private List<Object> preserve;

    /*
     * Whether to enable Data Consistency validation. Type: boolean (or Expression with resultType boolean).
     */
    @JsonProperty(value = "validateDataConsistency")
    private Object validateDataConsistency;

    /*
     * Specify the fault tolerance for data consistency.
     */
    @JsonProperty(value = "skipErrorFile")
    private SkipErrorFile skipErrorFile;

    /**
     * Get the source property: Copy activity source.
     *
     * @return the source value.
     */
    public CopySource source() {
        return this.source;
    }

    /**
     * Set the source property: Copy activity source.
     *
     * @param source the source value to set.
     * @return the CopyActivityTypeProperties object itself.
     */
    public CopyActivityTypeProperties withSource(CopySource source) {
        this.source = source;
        return this;
    }

    /**
     * Get the sink property: Copy activity sink.
     *
     * @return the sink value.
     */
    public CopySink sink() {
        return this.sink;
    }

    /**
     * Set the sink property: Copy activity sink.
     *
     * @param sink the sink value to set.
     * @return the CopyActivityTypeProperties object itself.
     */
    public CopyActivityTypeProperties withSink(CopySink sink) {
        this.sink = sink;
        return this;
    }

    /**
     * Get the translator property: Copy activity translator. If not specified, tabular translator is used.
     *
     * @return the translator value.
     */
    public Object translator() {
        return this.translator;
    }

    /**
     * Set the translator property: Copy activity translator. If not specified, tabular translator is used.
     *
     * @param translator the translator value to set.
     * @return the CopyActivityTypeProperties object itself.
     */
    public CopyActivityTypeProperties withTranslator(Object translator) {
        this.translator = translator;
        return this;
    }

    /**
     * Get the enableStaging property: Specifies whether to copy data via an interim staging. Default value is false.
     * Type: boolean (or Expression with resultType boolean).
     *
     * @return the enableStaging value.
     */
    public Object enableStaging() {
        return this.enableStaging;
    }

    /**
     * Set the enableStaging property: Specifies whether to copy data via an interim staging. Default value is false.
     * Type: boolean (or Expression with resultType boolean).
     *
     * @param enableStaging the enableStaging value to set.
     * @return the CopyActivityTypeProperties object itself.
     */
    public CopyActivityTypeProperties withEnableStaging(Object enableStaging) {
        this.enableStaging = enableStaging;
        return this;
    }

    /**
     * Get the stagingSettings property: Specifies interim staging settings when EnableStaging is true.
     *
     * @return the stagingSettings value.
     */
    public StagingSettings stagingSettings() {
        return this.stagingSettings;
    }

    /**
     * Set the stagingSettings property: Specifies interim staging settings when EnableStaging is true.
     *
     * @param stagingSettings the stagingSettings value to set.
     * @return the CopyActivityTypeProperties object itself.
     */
    public CopyActivityTypeProperties withStagingSettings(StagingSettings stagingSettings) {
        this.stagingSettings = stagingSettings;
        return this;
    }

    /**
     * Get the parallelCopies property: Maximum number of concurrent sessions opened on the source or sink to avoid
     * overloading the data store. Type: integer (or Expression with resultType integer), minimum: 0.
     *
     * @return the parallelCopies value.
     */
    public Object parallelCopies() {
        return this.parallelCopies;
    }

    /**
     * Set the parallelCopies property: Maximum number of concurrent sessions opened on the source or sink to avoid
     * overloading the data store. Type: integer (or Expression with resultType integer), minimum: 0.
     *
     * @param parallelCopies the parallelCopies value to set.
     * @return the CopyActivityTypeProperties object itself.
     */
    public CopyActivityTypeProperties withParallelCopies(Object parallelCopies) {
        this.parallelCopies = parallelCopies;
        return this;
    }

    /**
     * Get the dataIntegrationUnits property: Maximum number of data integration units that can be used to perform this
     * data movement. Type: integer (or Expression with resultType integer), minimum: 0.
     *
     * @return the dataIntegrationUnits value.
     */
    public Object dataIntegrationUnits() {
        return this.dataIntegrationUnits;
    }

    /**
     * Set the dataIntegrationUnits property: Maximum number of data integration units that can be used to perform this
     * data movement. Type: integer (or Expression with resultType integer), minimum: 0.
     *
     * @param dataIntegrationUnits the dataIntegrationUnits value to set.
     * @return the CopyActivityTypeProperties object itself.
     */
    public CopyActivityTypeProperties withDataIntegrationUnits(Object dataIntegrationUnits) {
        this.dataIntegrationUnits = dataIntegrationUnits;
        return this;
    }

    /**
     * Get the enableSkipIncompatibleRow property: Whether to skip incompatible row. Default value is false. Type:
     * boolean (or Expression with resultType boolean).
     *
     * @return the enableSkipIncompatibleRow value.
     */
    public Object enableSkipIncompatibleRow() {
        return this.enableSkipIncompatibleRow;
    }

    /**
     * Set the enableSkipIncompatibleRow property: Whether to skip incompatible row. Default value is false. Type:
     * boolean (or Expression with resultType boolean).
     *
     * @param enableSkipIncompatibleRow the enableSkipIncompatibleRow value to set.
     * @return the CopyActivityTypeProperties object itself.
     */
    public CopyActivityTypeProperties withEnableSkipIncompatibleRow(Object enableSkipIncompatibleRow) {
        this.enableSkipIncompatibleRow = enableSkipIncompatibleRow;
        return this;
    }

    /**
     * Get the redirectIncompatibleRowSettings property: Redirect incompatible row settings when
     * EnableSkipIncompatibleRow is true.
     *
     * @return the redirectIncompatibleRowSettings value.
     */
    public RedirectIncompatibleRowSettings redirectIncompatibleRowSettings() {
        return this.redirectIncompatibleRowSettings;
    }

    /**
     * Set the redirectIncompatibleRowSettings property: Redirect incompatible row settings when
     * EnableSkipIncompatibleRow is true.
     *
     * @param redirectIncompatibleRowSettings the redirectIncompatibleRowSettings value to set.
     * @return the CopyActivityTypeProperties object itself.
     */
    public CopyActivityTypeProperties withRedirectIncompatibleRowSettings(
        RedirectIncompatibleRowSettings redirectIncompatibleRowSettings) {
        this.redirectIncompatibleRowSettings = redirectIncompatibleRowSettings;
        return this;
    }

    /**
     * Get the logStorageSettings property: (Deprecated. Please use LogSettings) Log storage settings customer need to
     * provide when enabling session log.
     *
     * @return the logStorageSettings value.
     */
    public LogStorageSettings logStorageSettings() {
        return this.logStorageSettings;
    }

    /**
     * Set the logStorageSettings property: (Deprecated. Please use LogSettings) Log storage settings customer need to
     * provide when enabling session log.
     *
     * @param logStorageSettings the logStorageSettings value to set.
     * @return the CopyActivityTypeProperties object itself.
     */
    public CopyActivityTypeProperties withLogStorageSettings(LogStorageSettings logStorageSettings) {
        this.logStorageSettings = logStorageSettings;
        return this;
    }

    /**
     * Get the logSettings property: Log settings customer needs provide when enabling log.
     *
     * @return the logSettings value.
     */
    public LogSettings logSettings() {
        return this.logSettings;
    }

    /**
     * Set the logSettings property: Log settings customer needs provide when enabling log.
     *
     * @param logSettings the logSettings value to set.
     * @return the CopyActivityTypeProperties object itself.
     */
    public CopyActivityTypeProperties withLogSettings(LogSettings logSettings) {
        this.logSettings = logSettings;
        return this;
    }

    /**
     * Get the preserveRules property: Preserve Rules.
     *
     * @return the preserveRules value.
     */
    public List<Object> preserveRules() {
        return this.preserveRules;
    }

    /**
     * Set the preserveRules property: Preserve Rules.
     *
     * @param preserveRules the preserveRules value to set.
     * @return the CopyActivityTypeProperties object itself.
     */
    public CopyActivityTypeProperties withPreserveRules(List<Object> preserveRules) {
        this.preserveRules = preserveRules;
        return this;
    }

    /**
     * Get the preserve property: Preserve rules.
     *
     * @return the preserve value.
     */
    public List<Object> preserve() {
        return this.preserve;
    }

    /**
     * Set the preserve property: Preserve rules.
     *
     * @param preserve the preserve value to set.
     * @return the CopyActivityTypeProperties object itself.
     */
    public CopyActivityTypeProperties withPreserve(List<Object> preserve) {
        this.preserve = preserve;
        return this;
    }

    /**
     * Get the validateDataConsistency property: Whether to enable Data Consistency validation. Type: boolean (or
     * Expression with resultType boolean).
     *
     * @return the validateDataConsistency value.
     */
    public Object validateDataConsistency() {
        return this.validateDataConsistency;
    }

    /**
     * Set the validateDataConsistency property: Whether to enable Data Consistency validation. Type: boolean (or
     * Expression with resultType boolean).
     *
     * @param validateDataConsistency the validateDataConsistency value to set.
     * @return the CopyActivityTypeProperties object itself.
     */
    public CopyActivityTypeProperties withValidateDataConsistency(Object validateDataConsistency) {
        this.validateDataConsistency = validateDataConsistency;
        return this;
    }

    /**
     * Get the skipErrorFile property: Specify the fault tolerance for data consistency.
     *
     * @return the skipErrorFile value.
     */
    public SkipErrorFile skipErrorFile() {
        return this.skipErrorFile;
    }

    /**
     * Set the skipErrorFile property: Specify the fault tolerance for data consistency.
     *
     * @param skipErrorFile the skipErrorFile value to set.
     * @return the CopyActivityTypeProperties object itself.
     */
    public CopyActivityTypeProperties withSkipErrorFile(SkipErrorFile skipErrorFile) {
        this.skipErrorFile = skipErrorFile;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (source() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property source in model CopyActivityTypeProperties"));
        } else {
            source().validate();
        }
        if (sink() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property sink in model CopyActivityTypeProperties"));
        } else {
            sink().validate();
        }
        if (stagingSettings() != null) {
            stagingSettings().validate();
        }
        if (redirectIncompatibleRowSettings() != null) {
            redirectIncompatibleRowSettings().validate();
        }
        if (logStorageSettings() != null) {
            logStorageSettings().validate();
        }
        if (logSettings() != null) {
            logSettings().validate();
        }
        if (skipErrorFile() != null) {
            skipErrorFile().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CopyActivityTypeProperties.class);
}
