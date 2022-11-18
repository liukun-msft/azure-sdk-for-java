// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.devcenter.fluent.models.ScheduleInner;
import com.azure.resourcemanager.devcenter.models.EnableStatus;
import com.azure.resourcemanager.devcenter.models.Schedule;
import com.azure.resourcemanager.devcenter.models.ScheduleUpdate;
import com.azure.resourcemanager.devcenter.models.ScheduledFrequency;
import com.azure.resourcemanager.devcenter.models.ScheduledType;
import java.util.Map;

public final class ScheduleImpl implements Schedule, Schedule.Definition, Schedule.Update {
    private ScheduleInner innerObject;

    private final com.azure.resourcemanager.devcenter.DevCenterManager serviceManager;

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

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public ScheduledType typePropertiesType() {
        return this.innerModel().typePropertiesType();
    }

    public ScheduledFrequency frequency() {
        return this.innerModel().frequency();
    }

    public String time() {
        return this.innerModel().time();
    }

    public String timeZone() {
        return this.innerModel().timeZone();
    }

    public EnableStatus state() {
        return this.innerModel().state();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public ScheduleInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.devcenter.DevCenterManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String projectName;

    private String poolName;

    private String scheduleName;

    private Integer createTop;

    private Integer updateTop;

    private ScheduleUpdate updateBody;

    public ScheduleImpl withExistingPool(String resourceGroupName, String projectName, String poolName) {
        this.resourceGroupName = resourceGroupName;
        this.projectName = projectName;
        this.poolName = poolName;
        return this;
    }

    public Schedule create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSchedules()
                .createOrUpdate(
                    resourceGroupName, projectName, poolName, scheduleName, this.innerModel(), createTop, Context.NONE);
        return this;
    }

    public Schedule create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSchedules()
                .createOrUpdate(
                    resourceGroupName, projectName, poolName, scheduleName, this.innerModel(), createTop, context);
        return this;
    }

    ScheduleImpl(String name, com.azure.resourcemanager.devcenter.DevCenterManager serviceManager) {
        this.innerObject = new ScheduleInner();
        this.serviceManager = serviceManager;
        this.scheduleName = name;
        this.createTop = null;
    }

    public ScheduleImpl update() {
        this.updateTop = null;
        this.updateBody = new ScheduleUpdate();
        return this;
    }

    public Schedule apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSchedules()
                .update(resourceGroupName, projectName, poolName, scheduleName, updateBody, updateTop, Context.NONE);
        return this;
    }

    public Schedule apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSchedules()
                .update(resourceGroupName, projectName, poolName, scheduleName, updateBody, updateTop, context);
        return this;
    }

    ScheduleImpl(ScheduleInner innerObject, com.azure.resourcemanager.devcenter.DevCenterManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.projectName = Utils.getValueFromIdByName(innerObject.id(), "projects");
        this.poolName = Utils.getValueFromIdByName(innerObject.id(), "pools");
        this.scheduleName = Utils.getValueFromIdByName(innerObject.id(), "schedules");
    }

    public Schedule refresh() {
        Integer localTop = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSchedules()
                .getWithResponse(resourceGroupName, projectName, poolName, scheduleName, localTop, Context.NONE)
                .getValue();
        return this;
    }

    public Schedule refresh(Context context) {
        Integer localTop = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSchedules()
                .getWithResponse(resourceGroupName, projectName, poolName, scheduleName, localTop, context)
                .getValue();
        return this;
    }

    public ScheduleImpl withTypePropertiesType(ScheduledType typePropertiesType) {
        this.innerModel().withTypePropertiesType(typePropertiesType);
        return this;
    }

    public ScheduleImpl withFrequency(ScheduledFrequency frequency) {
        if (isInCreateMode()) {
            this.innerModel().withFrequency(frequency);
            return this;
        } else {
            this.updateBody.withFrequency(frequency);
            return this;
        }
    }

    public ScheduleImpl withTime(String time) {
        if (isInCreateMode()) {
            this.innerModel().withTime(time);
            return this;
        } else {
            this.updateBody.withTime(time);
            return this;
        }
    }

    public ScheduleImpl withTimeZone(String timeZone) {
        if (isInCreateMode()) {
            this.innerModel().withTimeZone(timeZone);
            return this;
        } else {
            this.updateBody.withTimeZone(timeZone);
            return this;
        }
    }

    public ScheduleImpl withState(EnableStatus state) {
        if (isInCreateMode()) {
            this.innerModel().withState(state);
            return this;
        } else {
            this.updateBody.withState(state);
            return this;
        }
    }

    public ScheduleImpl withTop(Integer top) {
        if (isInCreateMode()) {
            this.createTop = top;
            return this;
        } else {
            this.updateTop = top;
            return this;
        }
    }

    public ScheduleImpl withTags(Map<String, String> tags) {
        this.updateBody.withTags(tags);
        return this;
    }

    public ScheduleImpl withType(ScheduledType type) {
        this.updateBody.withType(type);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
