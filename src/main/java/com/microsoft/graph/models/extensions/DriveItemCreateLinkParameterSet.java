// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.models.extensions.Permission;
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
 * The class for the Drive Item Create Link Parameter Set.
 */
public class DriveItemCreateLinkParameterSet {
    /**
     * The type.
     * 
     */
    @SerializedName(value = "type", alternate = {"Type"})
    @Expose
	@Nullable
    public String type;

    /**
     * The scope.
     * 
     */
    @SerializedName(value = "scope", alternate = {"Scope"})
    @Expose
	@Nullable
    public String scope;

    /**
     * The expiration Date Time.
     * 
     */
    @SerializedName(value = "expirationDateTime", alternate = {"ExpirationDateTime"})
    @Expose
	@Nullable
    public java.util.Calendar expirationDateTime;

    /**
     * The password.
     * 
     */
    @SerializedName(value = "password", alternate = {"Password"})
    @Expose
	@Nullable
    public String password;

    /**
     * The message.
     * 
     */
    @SerializedName(value = "message", alternate = {"Message"})
    @Expose
	@Nullable
    public String message;


    /**
     * Instiaciates a new DriveItemCreateLinkParameterSet
     */
    public DriveItemCreateLinkParameterSet() {}
    /**
     * Instiaciates a new DriveItemCreateLinkParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected DriveItemCreateLinkParameterSet(@Nonnull final DriveItemCreateLinkParameterSetBuilder builder) {
        this.type = builder.type;
        this.scope = builder.scope;
        this.expirationDateTime = builder.expirationDateTime;
        this.password = builder.password;
        this.message = builder.message;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static DriveItemCreateLinkParameterSetBuilder newBuilder() {
        return new DriveItemCreateLinkParameterSetBuilder();
    }
    /**
     * Fluent builder for the DriveItemCreateLinkParameterSet
     */
    public static final class DriveItemCreateLinkParameterSetBuilder {
        /**
         * The type parameter value
         */
        @Nullable
        protected String type;
        /**
         * Sets the Type
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public DriveItemCreateLinkParameterSetBuilder withType(@Nullable final String val) {
            this.type = val;
            return this;
        }
        /**
         * The scope parameter value
         */
        @Nullable
        protected String scope;
        /**
         * Sets the Scope
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public DriveItemCreateLinkParameterSetBuilder withScope(@Nullable final String val) {
            this.scope = val;
            return this;
        }
        /**
         * The expirationDateTime parameter value
         */
        @Nullable
        protected java.util.Calendar expirationDateTime;
        /**
         * Sets the ExpirationDateTime
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public DriveItemCreateLinkParameterSetBuilder withExpirationDateTime(@Nullable final java.util.Calendar val) {
            this.expirationDateTime = val;
            return this;
        }
        /**
         * The password parameter value
         */
        @Nullable
        protected String password;
        /**
         * Sets the Password
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public DriveItemCreateLinkParameterSetBuilder withPassword(@Nullable final String val) {
            this.password = val;
            return this;
        }
        /**
         * The message parameter value
         */
        @Nullable
        protected String message;
        /**
         * Sets the Message
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public DriveItemCreateLinkParameterSetBuilder withMessage(@Nullable final String val) {
            this.message = val;
            return this;
        }
        /**
         * Instanciates a new DriveItemCreateLinkParameterSetBuilder
         */
        @Nullable
        protected DriveItemCreateLinkParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public DriveItemCreateLinkParameterSet build() {
            return new DriveItemCreateLinkParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.type != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("type", type));
        }
        if(this.scope != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("scope", scope));
        }
        if(this.expirationDateTime != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("expirationDateTime", expirationDateTime));
        }
        if(this.password != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("password", password));
        }
        if(this.message != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("message", message));
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