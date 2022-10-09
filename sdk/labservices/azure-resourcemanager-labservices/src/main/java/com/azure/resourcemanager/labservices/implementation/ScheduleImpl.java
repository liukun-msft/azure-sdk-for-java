// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.labservices.fluent.models.ScheduleInner;
import com.azure.resourcemanager.labservices.models.ProvisioningState;
import com.azure.resourcemanager.labservices.models.RecurrencePattern;
import com.azure.resourcemanager.labservices.models.Schedule;
import com.azure.resourcemanager.labservices.models.ScheduleUpdate;
import java.time.OffsetDateTime;

public final class ScheduleImpl implements Schedule, Schedule.Definition, Schedule.Update {
    private ScheduleInner innerObject;

    private final com.azure.resourcemanager.labservices.LabServicesManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public OffsetDateTime startAt() {
        return this.innerModel().startAt();
    }

    public OffsetDateTime stopAt() {
        return this.innerModel().stopAt();
    }

    public RecurrencePattern recurrencePattern() {
        return this.innerModel().recurrencePattern();
    }

    public String timeZoneId() {
        return this.innerModel().timeZoneId();
    }

    public String notes() {
        return this.innerModel().notes();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public ScheduleInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.labservices.LabServicesManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String labName;

    private String scheduleName;

    private ScheduleUpdate updateBody;

    public ScheduleImpl withExistingLab(String resourceGroupName, String labName) {
        this.resourceGroupName = resourceGroupName;
        this.labName = labName;
        return this;
    }

    public Schedule create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSchedules()
                .createOrUpdateWithResponse(resourceGroupName, labName, scheduleName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public Schedule create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSchedules()
                .createOrUpdateWithResponse(resourceGroupName, labName, scheduleName, this.innerModel(), context)
                .getValue();
        return this;
    }

    ScheduleImpl(String name, com.azure.resourcemanager.labservices.LabServicesManager serviceManager) {
        this.innerObject = new ScheduleInner();
        this.serviceManager = serviceManager;
        this.scheduleName = name;
    }

    public ScheduleImpl update() {
        this.updateBody = new ScheduleUpdate();
        return this;
    }

    public Schedule apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSchedules()
                .updateWithResponse(resourceGroupName, labName, scheduleName, updateBody, Context.NONE)
                .getValue();
        return this;
    }

    public Schedule apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSchedules()
                .updateWithResponse(resourceGroupName, labName, scheduleName, updateBody, context)
                .getValue();
        return this;
    }

    ScheduleImpl(ScheduleInner innerObject, com.azure.resourcemanager.labservices.LabServicesManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.labName = Utils.getValueFromIdByName(innerObject.id(), "labs");
        this.scheduleName = Utils.getValueFromIdByName(innerObject.id(), "schedules");
    }

    public Schedule refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSchedules()
                .getWithResponse(resourceGroupName, labName, scheduleName, Context.NONE)
                .getValue();
        return this;
    }

    public Schedule refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSchedules()
                .getWithResponse(resourceGroupName, labName, scheduleName, context)
                .getValue();
        return this;
    }

    public ScheduleImpl withStartAt(OffsetDateTime startAt) {
        if (isInCreateMode()) {
            this.innerModel().withStartAt(startAt);
            return this;
        } else {
            this.updateBody.withStartAt(startAt);
            return this;
        }
    }

    public ScheduleImpl withStopAt(OffsetDateTime stopAt) {
        if (isInCreateMode()) {
            this.innerModel().withStopAt(stopAt);
            return this;
        } else {
            this.updateBody.withStopAt(stopAt);
            return this;
        }
    }

    public ScheduleImpl withRecurrencePattern(RecurrencePattern recurrencePattern) {
        if (isInCreateMode()) {
            this.innerModel().withRecurrencePattern(recurrencePattern);
            return this;
        } else {
            this.updateBody.withRecurrencePattern(recurrencePattern);
            return this;
        }
    }

    public ScheduleImpl withTimeZoneId(String timeZoneId) {
        if (isInCreateMode()) {
            this.innerModel().withTimeZoneId(timeZoneId);
            return this;
        } else {
            this.updateBody.withTimeZoneId(timeZoneId);
            return this;
        }
    }

    public ScheduleImpl withNotes(String notes) {
        if (isInCreateMode()) {
            this.innerModel().withNotes(notes);
            return this;
        } else {
            this.updateBody.withNotes(notes);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
