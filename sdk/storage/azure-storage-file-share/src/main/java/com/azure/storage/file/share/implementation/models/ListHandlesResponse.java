// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.share.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.storage.file.share.models.HandleItem;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.util.ArrayList;
import java.util.List;

/** An enumeration of handles. */
@JacksonXmlRootElement(localName = "EnumerationResults")
@Fluent
public final class ListHandlesResponse {
    private static final class EntriesWrapper {
        @JacksonXmlProperty(localName = "Handle")
        private final List<HandleItem> items;

        @JsonCreator
        private EntriesWrapper(@JacksonXmlProperty(localName = "Handle") List<HandleItem> items) {
            this.items = items;
        }
    }

    /*
     * The HandleList property.
     */
    @JsonProperty(value = "Entries")
    private EntriesWrapper handleList;

    /*
     * The NextMarker property.
     */
    @JsonProperty(value = "NextMarker", required = true)
    private String nextMarker;

    /** Creates an instance of ListHandlesResponse class. */
    public ListHandlesResponse() {}

    /**
     * Get the handleList property: The HandleList property.
     *
     * @return the handleList value.
     */
    public List<HandleItem> getHandleList() {
        if (this.handleList == null) {
            this.handleList = new EntriesWrapper(new ArrayList<HandleItem>());
        }
        return this.handleList.items;
    }

    /**
     * Set the handleList property: The HandleList property.
     *
     * @param handleList the handleList value to set.
     * @return the ListHandlesResponse object itself.
     */
    public ListHandlesResponse setHandleList(List<HandleItem> handleList) {
        this.handleList = new EntriesWrapper(handleList);
        return this;
    }

    /**
     * Get the nextMarker property: The NextMarker property.
     *
     * @return the nextMarker value.
     */
    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * Set the nextMarker property: The NextMarker property.
     *
     * @param nextMarker the nextMarker value to set.
     * @return the ListHandlesResponse object itself.
     */
    public ListHandlesResponse setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
}
