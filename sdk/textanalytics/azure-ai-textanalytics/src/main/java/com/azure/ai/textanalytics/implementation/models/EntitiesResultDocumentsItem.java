// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The EntitiesResultDocumentsItem model. */
@Fluent
public final class EntitiesResultDocumentsItem extends EntitiesDocumentResult {
    /*
     * If 'language' is set to 'auto' for the document in the request this field will contain a 2 letter ISO 639-1
     * representation of the language detected for this document.
     */
    @JsonProperty(value = "detectedLanguage")
    private DetectedLanguage detectedLanguage;

    /**
     * Get the detectedLanguage property: If 'language' is set to 'auto' for the document in the request this field will
     * contain a 2 letter ISO 639-1 representation of the language detected for this document.
     *
     * @return the detectedLanguage value.
     */
    public DetectedLanguage getDetectedLanguage() {
        return this.detectedLanguage;
    }

    /**
     * Set the detectedLanguage property: If 'language' is set to 'auto' for the document in the request this field will
     * contain a 2 letter ISO 639-1 representation of the language detected for this document.
     *
     * @param detectedLanguage the detectedLanguage value to set.
     * @return the EntitiesResultDocumentsItem object itself.
     */
    public EntitiesResultDocumentsItem setDetectedLanguage(DetectedLanguage detectedLanguage) {
        this.detectedLanguage = detectedLanguage;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public EntitiesResultDocumentsItem setEntities(List<EntityWithResolution> entities) {
        super.setEntities(entities);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public EntitiesResultDocumentsItem setId(String id) {
        super.setId(id);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public EntitiesResultDocumentsItem setWarnings(List<DocumentWarning> warnings) {
        super.setWarnings(warnings);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public EntitiesResultDocumentsItem setStatistics(DocumentStatistics statistics) {
        super.setStatistics(statistics);
        return this;
    }
}
