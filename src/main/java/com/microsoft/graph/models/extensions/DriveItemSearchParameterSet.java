// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.models.extensions.DriveItem;
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
 * The class for the Drive Item Search Parameter Set.
 */
public class DriveItemSearchParameterSet {
    /**
     * The q.
     * 
     */
    @SerializedName(value = "q", alternate = {"Q"})
    @Expose
	@Nullable
    public String q;


    /**
     * Instiaciates a new DriveItemSearchParameterSet
     */
    public DriveItemSearchParameterSet() {}
    /**
     * Instiaciates a new DriveItemSearchParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected DriveItemSearchParameterSet(@Nonnull final DriveItemSearchParameterSetBuilder builder) {
        this.q = builder.q;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static DriveItemSearchParameterSetBuilder newBuilder() {
        return new DriveItemSearchParameterSetBuilder();
    }
    /**
     * Fluent builder for the DriveItemSearchParameterSet
     */
    public static final class DriveItemSearchParameterSetBuilder {
        /**
         * The q parameter value
         */
        @Nullable
        protected String q;
        /**
         * Sets the Q
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public DriveItemSearchParameterSetBuilder withQ(@Nullable final String val) {
            this.q = val;
            return this;
        }
        /**
         * Instanciates a new DriveItemSearchParameterSetBuilder
         */
        @Nullable
        protected DriveItemSearchParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public DriveItemSearchParameterSet build() {
            return new DriveItemSearchParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.q != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("q", q));
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