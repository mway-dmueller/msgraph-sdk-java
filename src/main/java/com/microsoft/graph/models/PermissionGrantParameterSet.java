// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.DriveRecipient;
import com.microsoft.graph.models.Permission;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import com.microsoft.graph.serializer.ISerializer;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Permission Grant Parameter Set.
 */
public class PermissionGrantParameterSet {
    /**
     * The roles.
     * 
     */
    @SerializedName(value = "roles", alternate = {"Roles"})
    @Expose
	@Nullable
    public java.util.List<String> roles;

    /**
     * The recipients.
     * 
     */
    @SerializedName(value = "recipients", alternate = {"Recipients"})
    @Expose
	@Nullable
    public java.util.List<DriveRecipient> recipients;


    /**
     * Instiaciates a new PermissionGrantParameterSet
     */
    public PermissionGrantParameterSet() {}
    /**
     * Instiaciates a new PermissionGrantParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected PermissionGrantParameterSet(@Nonnull final PermissionGrantParameterSetBuilder builder) {
        this.roles = builder.roles;
        this.recipients = builder.recipients;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static PermissionGrantParameterSetBuilder newBuilder() {
        return new PermissionGrantParameterSetBuilder();
    }
    /**
     * Fluent builder for the PermissionGrantParameterSet
     */
    public static final class PermissionGrantParameterSetBuilder {
        /**
         * The roles parameter value
         */
        @Nullable
        protected java.util.List<String> roles;
        /**
         * Sets the Roles
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public PermissionGrantParameterSetBuilder withRoles(@Nullable final java.util.List<String> val) {
            this.roles = val;
            return this;
        }
        /**
         * The recipients parameter value
         */
        @Nullable
        protected java.util.List<DriveRecipient> recipients;
        /**
         * Sets the Recipients
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public PermissionGrantParameterSetBuilder withRecipients(@Nullable final java.util.List<DriveRecipient> val) {
            this.recipients = val;
            return this;
        }
        /**
         * Instanciates a new PermissionGrantParameterSetBuilder
         */
        @Nullable
        protected PermissionGrantParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public PermissionGrantParameterSet build() {
            return new PermissionGrantParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.roles != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("roles", roles));
        }
        if(this.recipients != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("recipients", recipients));
        }
        return result;
    }
    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    @Nullable
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    @Nullable
    public ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}