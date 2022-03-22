// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Rule to place restrictions on portions of the cache namespace being presented to clients. */
@Fluent
public final class NfsAccessRule {
    /*
     * Scope for this rule. The scope and filter determine which clients match
     * the rule.
     */
    @JsonProperty(value = "scope", required = true)
    private NfsAccessRuleScope scope;

    /*
     * Filter applied to the scope for this rule. The filter's format depends
     * on its scope. 'default' scope matches all clients and has no filter
     * value. 'network' scope takes a filter in CIDR format (for example,
     * 10.99.1.0/24). 'host' takes an IP address or fully qualified domain name
     * as filter. If a client does not match any filter rule and there is no
     * default rule, access is denied.
     */
    @JsonProperty(value = "filter")
    private String filter;

    /*
     * Access allowed by this rule.
     */
    @JsonProperty(value = "access", required = true)
    private NfsAccessRuleAccess access;

    /*
     * Allow SUID semantics.
     */
    @JsonProperty(value = "suid")
    private Boolean suid;

    /*
     * For the default policy, allow access to subdirectories under the root
     * export. If this is set to no, clients can only mount the path '/'. If
     * set to yes, clients can mount a deeper path, like '/a/b'.
     */
    @JsonProperty(value = "submountAccess")
    private Boolean submountAccess;

    /*
     * Map root accesses to anonymousUID and anonymousGID.
     */
    @JsonProperty(value = "rootSquash")
    private Boolean rootSquash;

    /*
     * UID value that replaces 0 when rootSquash is true. 65534 will be used if
     * not provided.
     */
    @JsonProperty(value = "anonymousUID")
    private String anonymousUid;

    /*
     * GID value that replaces 0 when rootSquash is true. This will use the
     * value of anonymousUID if not provided.
     */
    @JsonProperty(value = "anonymousGID")
    private String anonymousGid;

    /**
     * Get the scope property: Scope for this rule. The scope and filter determine which clients match the rule.
     *
     * @return the scope value.
     */
    public NfsAccessRuleScope scope() {
        return this.scope;
    }

    /**
     * Set the scope property: Scope for this rule. The scope and filter determine which clients match the rule.
     *
     * @param scope the scope value to set.
     * @return the NfsAccessRule object itself.
     */
    public NfsAccessRule withScope(NfsAccessRuleScope scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Get the filter property: Filter applied to the scope for this rule. The filter's format depends on its scope.
     * 'default' scope matches all clients and has no filter value. 'network' scope takes a filter in CIDR format (for
     * example, 10.99.1.0/24). 'host' takes an IP address or fully qualified domain name as filter. If a client does not
     * match any filter rule and there is no default rule, access is denied.
     *
     * @return the filter value.
     */
    public String filter() {
        return this.filter;
    }

    /**
     * Set the filter property: Filter applied to the scope for this rule. The filter's format depends on its scope.
     * 'default' scope matches all clients and has no filter value. 'network' scope takes a filter in CIDR format (for
     * example, 10.99.1.0/24). 'host' takes an IP address or fully qualified domain name as filter. If a client does not
     * match any filter rule and there is no default rule, access is denied.
     *
     * @param filter the filter value to set.
     * @return the NfsAccessRule object itself.
     */
    public NfsAccessRule withFilter(String filter) {
        this.filter = filter;
        return this;
    }

    /**
     * Get the access property: Access allowed by this rule.
     *
     * @return the access value.
     */
    public NfsAccessRuleAccess access() {
        return this.access;
    }

    /**
     * Set the access property: Access allowed by this rule.
     *
     * @param access the access value to set.
     * @return the NfsAccessRule object itself.
     */
    public NfsAccessRule withAccess(NfsAccessRuleAccess access) {
        this.access = access;
        return this;
    }

    /**
     * Get the suid property: Allow SUID semantics.
     *
     * @return the suid value.
     */
    public Boolean suid() {
        return this.suid;
    }

    /**
     * Set the suid property: Allow SUID semantics.
     *
     * @param suid the suid value to set.
     * @return the NfsAccessRule object itself.
     */
    public NfsAccessRule withSuid(Boolean suid) {
        this.suid = suid;
        return this;
    }

    /**
     * Get the submountAccess property: For the default policy, allow access to subdirectories under the root export. If
     * this is set to no, clients can only mount the path '/'. If set to yes, clients can mount a deeper path, like
     * '/a/b'.
     *
     * @return the submountAccess value.
     */
    public Boolean submountAccess() {
        return this.submountAccess;
    }

    /**
     * Set the submountAccess property: For the default policy, allow access to subdirectories under the root export. If
     * this is set to no, clients can only mount the path '/'. If set to yes, clients can mount a deeper path, like
     * '/a/b'.
     *
     * @param submountAccess the submountAccess value to set.
     * @return the NfsAccessRule object itself.
     */
    public NfsAccessRule withSubmountAccess(Boolean submountAccess) {
        this.submountAccess = submountAccess;
        return this;
    }

    /**
     * Get the rootSquash property: Map root accesses to anonymousUID and anonymousGID.
     *
     * @return the rootSquash value.
     */
    public Boolean rootSquash() {
        return this.rootSquash;
    }

    /**
     * Set the rootSquash property: Map root accesses to anonymousUID and anonymousGID.
     *
     * @param rootSquash the rootSquash value to set.
     * @return the NfsAccessRule object itself.
     */
    public NfsAccessRule withRootSquash(Boolean rootSquash) {
        this.rootSquash = rootSquash;
        return this;
    }

    /**
     * Get the anonymousUid property: UID value that replaces 0 when rootSquash is true. 65534 will be used if not
     * provided.
     *
     * @return the anonymousUid value.
     */
    public String anonymousUid() {
        return this.anonymousUid;
    }

    /**
     * Set the anonymousUid property: UID value that replaces 0 when rootSquash is true. 65534 will be used if not
     * provided.
     *
     * @param anonymousUid the anonymousUid value to set.
     * @return the NfsAccessRule object itself.
     */
    public NfsAccessRule withAnonymousUid(String anonymousUid) {
        this.anonymousUid = anonymousUid;
        return this;
    }

    /**
     * Get the anonymousGid property: GID value that replaces 0 when rootSquash is true. This will use the value of
     * anonymousUID if not provided.
     *
     * @return the anonymousGid value.
     */
    public String anonymousGid() {
        return this.anonymousGid;
    }

    /**
     * Set the anonymousGid property: GID value that replaces 0 when rootSquash is true. This will use the value of
     * anonymousUID if not provided.
     *
     * @param anonymousGid the anonymousGid value to set.
     * @return the NfsAccessRule object itself.
     */
    public NfsAccessRule withAnonymousGid(String anonymousGid) {
        this.anonymousGid = anonymousGid;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (scope() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property scope in model NfsAccessRule"));
        }
        if (access() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property access in model NfsAccessRule"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(NfsAccessRule.class);
}
