// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.desktopvirtualization.models.HostPoolType;
import com.azure.resourcemanager.desktopvirtualization.models.LoadBalancerType;
import com.azure.resourcemanager.desktopvirtualization.models.MigrationRequestProperties;
import com.azure.resourcemanager.desktopvirtualization.models.PersonalDesktopAssignmentType;
import com.azure.resourcemanager.desktopvirtualization.models.PreferredAppGroupType;
import com.azure.resourcemanager.desktopvirtualization.models.PublicNetworkAccess;
import com.azure.resourcemanager.desktopvirtualization.models.ResourceModelWithAllowedPropertySet;
import com.azure.resourcemanager.desktopvirtualization.models.ResourceModelWithAllowedPropertySetIdentity;
import com.azure.resourcemanager.desktopvirtualization.models.ResourceModelWithAllowedPropertySetPlan;
import com.azure.resourcemanager.desktopvirtualization.models.ResourceModelWithAllowedPropertySetSku;
import com.azure.resourcemanager.desktopvirtualization.models.SsoSecretType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Represents a HostPool definition. */
@Fluent
public final class HostPoolInner extends ResourceModelWithAllowedPropertySet {
    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * Detailed properties for HostPool
     */
    @JsonProperty(value = "properties", required = true)
    private HostPoolPropertiesInner innerProperties = new HostPoolPropertiesInner();

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the innerProperties property: Detailed properties for HostPool.
     *
     * @return the innerProperties value.
     */
    private HostPoolPropertiesInner innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public HostPoolInner withManagedBy(String managedBy) {
        super.withManagedBy(managedBy);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HostPoolInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HostPoolInner withIdentity(ResourceModelWithAllowedPropertySetIdentity identity) {
        super.withIdentity(identity);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HostPoolInner withSku(ResourceModelWithAllowedPropertySetSku sku) {
        super.withSku(sku);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HostPoolInner withPlan(ResourceModelWithAllowedPropertySetPlan plan) {
        super.withPlan(plan);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HostPoolInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HostPoolInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the objectId property: ObjectId of HostPool. (internal use).
     *
     * @return the objectId value.
     */
    public String objectId() {
        return this.innerProperties() == null ? null : this.innerProperties().objectId();
    }

    /**
     * Get the friendlyName property: Friendly name of HostPool.
     *
     * @return the friendlyName value.
     */
    public String friendlyName() {
        return this.innerProperties() == null ? null : this.innerProperties().friendlyName();
    }

    /**
     * Set the friendlyName property: Friendly name of HostPool.
     *
     * @param friendlyName the friendlyName value to set.
     * @return the HostPoolInner object itself.
     */
    public HostPoolInner withFriendlyName(String friendlyName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HostPoolPropertiesInner();
        }
        this.innerProperties().withFriendlyName(friendlyName);
        return this;
    }

    /**
     * Get the description property: Description of HostPool.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: Description of HostPool.
     *
     * @param description the description value to set.
     * @return the HostPoolInner object itself.
     */
    public HostPoolInner withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HostPoolPropertiesInner();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the hostPoolType property: HostPool type for desktop.
     *
     * @return the hostPoolType value.
     */
    public HostPoolType hostPoolType() {
        return this.innerProperties() == null ? null : this.innerProperties().hostPoolType();
    }

    /**
     * Set the hostPoolType property: HostPool type for desktop.
     *
     * @param hostPoolType the hostPoolType value to set.
     * @return the HostPoolInner object itself.
     */
    public HostPoolInner withHostPoolType(HostPoolType hostPoolType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HostPoolPropertiesInner();
        }
        this.innerProperties().withHostPoolType(hostPoolType);
        return this;
    }

    /**
     * Get the personalDesktopAssignmentType property: PersonalDesktopAssignment type for HostPool.
     *
     * @return the personalDesktopAssignmentType value.
     */
    public PersonalDesktopAssignmentType personalDesktopAssignmentType() {
        return this.innerProperties() == null ? null : this.innerProperties().personalDesktopAssignmentType();
    }

    /**
     * Set the personalDesktopAssignmentType property: PersonalDesktopAssignment type for HostPool.
     *
     * @param personalDesktopAssignmentType the personalDesktopAssignmentType value to set.
     * @return the HostPoolInner object itself.
     */
    public HostPoolInner withPersonalDesktopAssignmentType(
        PersonalDesktopAssignmentType personalDesktopAssignmentType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HostPoolPropertiesInner();
        }
        this.innerProperties().withPersonalDesktopAssignmentType(personalDesktopAssignmentType);
        return this;
    }

    /**
     * Get the customRdpProperty property: Custom rdp property of HostPool.
     *
     * @return the customRdpProperty value.
     */
    public String customRdpProperty() {
        return this.innerProperties() == null ? null : this.innerProperties().customRdpProperty();
    }

    /**
     * Set the customRdpProperty property: Custom rdp property of HostPool.
     *
     * @param customRdpProperty the customRdpProperty value to set.
     * @return the HostPoolInner object itself.
     */
    public HostPoolInner withCustomRdpProperty(String customRdpProperty) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HostPoolPropertiesInner();
        }
        this.innerProperties().withCustomRdpProperty(customRdpProperty);
        return this;
    }

    /**
     * Get the maxSessionLimit property: The max session limit of HostPool.
     *
     * @return the maxSessionLimit value.
     */
    public Integer maxSessionLimit() {
        return this.innerProperties() == null ? null : this.innerProperties().maxSessionLimit();
    }

    /**
     * Set the maxSessionLimit property: The max session limit of HostPool.
     *
     * @param maxSessionLimit the maxSessionLimit value to set.
     * @return the HostPoolInner object itself.
     */
    public HostPoolInner withMaxSessionLimit(Integer maxSessionLimit) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HostPoolPropertiesInner();
        }
        this.innerProperties().withMaxSessionLimit(maxSessionLimit);
        return this;
    }

    /**
     * Get the loadBalancerType property: The type of the load balancer.
     *
     * @return the loadBalancerType value.
     */
    public LoadBalancerType loadBalancerType() {
        return this.innerProperties() == null ? null : this.innerProperties().loadBalancerType();
    }

    /**
     * Set the loadBalancerType property: The type of the load balancer.
     *
     * @param loadBalancerType the loadBalancerType value to set.
     * @return the HostPoolInner object itself.
     */
    public HostPoolInner withLoadBalancerType(LoadBalancerType loadBalancerType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HostPoolPropertiesInner();
        }
        this.innerProperties().withLoadBalancerType(loadBalancerType);
        return this;
    }

    /**
     * Get the ring property: The ring number of HostPool.
     *
     * @return the ring value.
     */
    public Integer ring() {
        return this.innerProperties() == null ? null : this.innerProperties().ring();
    }

    /**
     * Set the ring property: The ring number of HostPool.
     *
     * @param ring the ring value to set.
     * @return the HostPoolInner object itself.
     */
    public HostPoolInner withRing(Integer ring) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HostPoolPropertiesInner();
        }
        this.innerProperties().withRing(ring);
        return this;
    }

    /**
     * Get the validationEnvironment property: Is validation environment.
     *
     * @return the validationEnvironment value.
     */
    public Boolean validationEnvironment() {
        return this.innerProperties() == null ? null : this.innerProperties().validationEnvironment();
    }

    /**
     * Set the validationEnvironment property: Is validation environment.
     *
     * @param validationEnvironment the validationEnvironment value to set.
     * @return the HostPoolInner object itself.
     */
    public HostPoolInner withValidationEnvironment(Boolean validationEnvironment) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HostPoolPropertiesInner();
        }
        this.innerProperties().withValidationEnvironment(validationEnvironment);
        return this;
    }

    /**
     * Get the registrationInfo property: The registration info of HostPool.
     *
     * @return the registrationInfo value.
     */
    public RegistrationInfoInner registrationInfo() {
        return this.innerProperties() == null ? null : this.innerProperties().registrationInfo();
    }

    /**
     * Set the registrationInfo property: The registration info of HostPool.
     *
     * @param registrationInfo the registrationInfo value to set.
     * @return the HostPoolInner object itself.
     */
    public HostPoolInner withRegistrationInfo(RegistrationInfoInner registrationInfo) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HostPoolPropertiesInner();
        }
        this.innerProperties().withRegistrationInfo(registrationInfo);
        return this;
    }

    /**
     * Get the vmTemplate property: VM template for sessionhosts configuration within hostpool.
     *
     * @return the vmTemplate value.
     */
    public String vmTemplate() {
        return this.innerProperties() == null ? null : this.innerProperties().vmTemplate();
    }

    /**
     * Set the vmTemplate property: VM template for sessionhosts configuration within hostpool.
     *
     * @param vmTemplate the vmTemplate value to set.
     * @return the HostPoolInner object itself.
     */
    public HostPoolInner withVmTemplate(String vmTemplate) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HostPoolPropertiesInner();
        }
        this.innerProperties().withVmTemplate(vmTemplate);
        return this;
    }

    /**
     * Get the applicationGroupReferences property: List of applicationGroup links.
     *
     * @return the applicationGroupReferences value.
     */
    public List<String> applicationGroupReferences() {
        return this.innerProperties() == null ? null : this.innerProperties().applicationGroupReferences();
    }

    /**
     * Get the ssoadfsAuthority property: URL to customer ADFS server for signing WVD SSO certificates.
     *
     * @return the ssoadfsAuthority value.
     */
    public String ssoadfsAuthority() {
        return this.innerProperties() == null ? null : this.innerProperties().ssoadfsAuthority();
    }

    /**
     * Set the ssoadfsAuthority property: URL to customer ADFS server for signing WVD SSO certificates.
     *
     * @param ssoadfsAuthority the ssoadfsAuthority value to set.
     * @return the HostPoolInner object itself.
     */
    public HostPoolInner withSsoadfsAuthority(String ssoadfsAuthority) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HostPoolPropertiesInner();
        }
        this.innerProperties().withSsoadfsAuthority(ssoadfsAuthority);
        return this;
    }

    /**
     * Get the ssoClientId property: ClientId for the registered Relying Party used to issue WVD SSO certificates.
     *
     * @return the ssoClientId value.
     */
    public String ssoClientId() {
        return this.innerProperties() == null ? null : this.innerProperties().ssoClientId();
    }

    /**
     * Set the ssoClientId property: ClientId for the registered Relying Party used to issue WVD SSO certificates.
     *
     * @param ssoClientId the ssoClientId value to set.
     * @return the HostPoolInner object itself.
     */
    public HostPoolInner withSsoClientId(String ssoClientId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HostPoolPropertiesInner();
        }
        this.innerProperties().withSsoClientId(ssoClientId);
        return this;
    }

    /**
     * Get the ssoClientSecretKeyVaultPath property: Path to Azure KeyVault storing the secret used for communication to
     * ADFS.
     *
     * @return the ssoClientSecretKeyVaultPath value.
     */
    public String ssoClientSecretKeyVaultPath() {
        return this.innerProperties() == null ? null : this.innerProperties().ssoClientSecretKeyVaultPath();
    }

    /**
     * Set the ssoClientSecretKeyVaultPath property: Path to Azure KeyVault storing the secret used for communication to
     * ADFS.
     *
     * @param ssoClientSecretKeyVaultPath the ssoClientSecretKeyVaultPath value to set.
     * @return the HostPoolInner object itself.
     */
    public HostPoolInner withSsoClientSecretKeyVaultPath(String ssoClientSecretKeyVaultPath) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HostPoolPropertiesInner();
        }
        this.innerProperties().withSsoClientSecretKeyVaultPath(ssoClientSecretKeyVaultPath);
        return this;
    }

    /**
     * Get the ssoSecretType property: The type of single sign on Secret Type.
     *
     * @return the ssoSecretType value.
     */
    public SsoSecretType ssoSecretType() {
        return this.innerProperties() == null ? null : this.innerProperties().ssoSecretType();
    }

    /**
     * Set the ssoSecretType property: The type of single sign on Secret Type.
     *
     * @param ssoSecretType the ssoSecretType value to set.
     * @return the HostPoolInner object itself.
     */
    public HostPoolInner withSsoSecretType(SsoSecretType ssoSecretType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HostPoolPropertiesInner();
        }
        this.innerProperties().withSsoSecretType(ssoSecretType);
        return this;
    }

    /**
     * Get the preferredAppGroupType property: The type of preferred application group type, default to Desktop
     * Application Group.
     *
     * @return the preferredAppGroupType value.
     */
    public PreferredAppGroupType preferredAppGroupType() {
        return this.innerProperties() == null ? null : this.innerProperties().preferredAppGroupType();
    }

    /**
     * Set the preferredAppGroupType property: The type of preferred application group type, default to Desktop
     * Application Group.
     *
     * @param preferredAppGroupType the preferredAppGroupType value to set.
     * @return the HostPoolInner object itself.
     */
    public HostPoolInner withPreferredAppGroupType(PreferredAppGroupType preferredAppGroupType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HostPoolPropertiesInner();
        }
        this.innerProperties().withPreferredAppGroupType(preferredAppGroupType);
        return this;
    }

    /**
     * Get the startVMOnConnect property: The flag to turn on/off StartVMOnConnect feature.
     *
     * @return the startVMOnConnect value.
     */
    public Boolean startVMOnConnect() {
        return this.innerProperties() == null ? null : this.innerProperties().startVMOnConnect();
    }

    /**
     * Set the startVMOnConnect property: The flag to turn on/off StartVMOnConnect feature.
     *
     * @param startVMOnConnect the startVMOnConnect value to set.
     * @return the HostPoolInner object itself.
     */
    public HostPoolInner withStartVMOnConnect(Boolean startVMOnConnect) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HostPoolPropertiesInner();
        }
        this.innerProperties().withStartVMOnConnect(startVMOnConnect);
        return this;
    }

    /**
     * Get the migrationRequest property: The registration info of HostPool.
     *
     * @return the migrationRequest value.
     */
    public MigrationRequestProperties migrationRequest() {
        return this.innerProperties() == null ? null : this.innerProperties().migrationRequest();
    }

    /**
     * Set the migrationRequest property: The registration info of HostPool.
     *
     * @param migrationRequest the migrationRequest value to set.
     * @return the HostPoolInner object itself.
     */
    public HostPoolInner withMigrationRequest(MigrationRequestProperties migrationRequest) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HostPoolPropertiesInner();
        }
        this.innerProperties().withMigrationRequest(migrationRequest);
        return this;
    }

    /**
     * Get the cloudPcResource property: Is cloud pc resource.
     *
     * @return the cloudPcResource value.
     */
    public Boolean cloudPcResource() {
        return this.innerProperties() == null ? null : this.innerProperties().cloudPcResource();
    }

    /**
     * Get the publicNetworkAccess property: Enabled allows this resource to be accessed from both public and private
     * networks, Disabled allows this resource to only be accessed via private endpoints.
     *
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.innerProperties() == null ? null : this.innerProperties().publicNetworkAccess();
    }

    /**
     * Set the publicNetworkAccess property: Enabled allows this resource to be accessed from both public and private
     * networks, Disabled allows this resource to only be accessed via private endpoints.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the HostPoolInner object itself.
     */
    public HostPoolInner withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HostPoolPropertiesInner();
        }
        this.innerProperties().withPublicNetworkAccess(publicNetworkAccess);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property innerProperties in model HostPoolInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(HostPoolInner.class);
}
