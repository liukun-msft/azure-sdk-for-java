// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elastic.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.elastic.models.CompanyInfo;
import com.azure.resourcemanager.elastic.models.ElasticCloudDeployment;
import com.azure.resourcemanager.elastic.models.ElasticCloudUser;
import com.azure.resourcemanager.elastic.models.ElasticProperties;
import com.azure.resourcemanager.elastic.models.MonitorProperties;
import com.azure.resourcemanager.elastic.models.MonitoringStatus;
import com.azure.resourcemanager.elastic.models.ProvisioningState;
import com.azure.resourcemanager.elastic.models.UserInfo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class MonitorPropertiesTests {
    @Test
    public void testDeserialize() {
        MonitorProperties model =
            BinaryData
                .fromString(
                    "{\"provisioningState\":\"Canceled\",\"monitoringStatus\":\"Enabled\",\"elasticProperties\":{\"elasticCloudUser\":{\"emailAddress\":\"bkzgcwrwclx\",\"id\":\"rljdouskcqv\",\"elasticCloudSsoDefaultUrl\":\"cr\"},\"elasticCloudDeployment\":{\"name\":\"kwt\",\"deploymentId\":\"xbnjbiksq\",\"azureSubscriptionId\":\"lssai\",\"elasticsearchRegion\":\"p\",\"elasticsearchServiceUrl\":\"nzl\",\"kibanaServiceUrl\":\"fmppe\",\"kibanaSsoUrl\":\"vmgxsab\"}},\"userInfo\":{\"firstName\":\"duuji\",\"lastName\":\"jczdzevndh\",\"companyName\":\"wpdappdsbdkv\",\"emailAddress\":\"wjfeusnhutjel\",\"companyInfo\":{\"domain\":\"ldhugjzzdatqxh\",\"business\":\"dgeablgphu\",\"employeesNumber\":\"cndvkaozwyiftyhx\",\"state\":\"rokft\",\"country\":\"olniwpwcukjf\"}},\"version\":\"iawxklry\",\"liftrResourceCategory\":\"MonitorLogs\",\"liftrResourcePreference\":2080444397}")
                .toObject(MonitorProperties.class);
        Assertions.assertEquals(ProvisioningState.CANCELED, model.provisioningState());
        Assertions.assertEquals(MonitoringStatus.ENABLED, model.monitoringStatus());
        Assertions.assertEquals("duuji", model.userInfo().firstName());
        Assertions.assertEquals("jczdzevndh", model.userInfo().lastName());
        Assertions.assertEquals("wpdappdsbdkv", model.userInfo().companyName());
        Assertions.assertEquals("wjfeusnhutjel", model.userInfo().emailAddress());
        Assertions.assertEquals("ldhugjzzdatqxh", model.userInfo().companyInfo().domain());
        Assertions.assertEquals("dgeablgphu", model.userInfo().companyInfo().business());
        Assertions.assertEquals("cndvkaozwyiftyhx", model.userInfo().companyInfo().employeesNumber());
        Assertions.assertEquals("rokft", model.userInfo().companyInfo().state());
        Assertions.assertEquals("olniwpwcukjf", model.userInfo().companyInfo().country());
        Assertions.assertEquals("iawxklry", model.version());
    }

    @Test
    public void testSerialize() {
        MonitorProperties model =
            new MonitorProperties()
                .withProvisioningState(ProvisioningState.CANCELED)
                .withMonitoringStatus(MonitoringStatus.ENABLED)
                .withElasticProperties(
                    new ElasticProperties()
                        .withElasticCloudUser(new ElasticCloudUser())
                        .withElasticCloudDeployment(new ElasticCloudDeployment()))
                .withUserInfo(
                    new UserInfo()
                        .withFirstName("duuji")
                        .withLastName("jczdzevndh")
                        .withCompanyName("wpdappdsbdkv")
                        .withEmailAddress("wjfeusnhutjel")
                        .withCompanyInfo(
                            new CompanyInfo()
                                .withDomain("ldhugjzzdatqxh")
                                .withBusiness("dgeablgphu")
                                .withEmployeesNumber("cndvkaozwyiftyhx")
                                .withState("rokft")
                                .withCountry("olniwpwcukjf")))
                .withVersion("iawxklry");
        model = BinaryData.fromObject(model).toObject(MonitorProperties.class);
        Assertions.assertEquals(ProvisioningState.CANCELED, model.provisioningState());
        Assertions.assertEquals(MonitoringStatus.ENABLED, model.monitoringStatus());
        Assertions.assertEquals("duuji", model.userInfo().firstName());
        Assertions.assertEquals("jczdzevndh", model.userInfo().lastName());
        Assertions.assertEquals("wpdappdsbdkv", model.userInfo().companyName());
        Assertions.assertEquals("wjfeusnhutjel", model.userInfo().emailAddress());
        Assertions.assertEquals("ldhugjzzdatqxh", model.userInfo().companyInfo().domain());
        Assertions.assertEquals("dgeablgphu", model.userInfo().companyInfo().business());
        Assertions.assertEquals("cndvkaozwyiftyhx", model.userInfo().companyInfo().employeesNumber());
        Assertions.assertEquals("rokft", model.userInfo().companyInfo().state());
        Assertions.assertEquals("olniwpwcukjf", model.userInfo().companyInfo().country());
        Assertions.assertEquals("iawxklry", model.version());
    }
}
