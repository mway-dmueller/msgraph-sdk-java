// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.WorkbookFunctionResult;
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
 * The class for the Workbook Functions Mduration Parameter Set.
 */
public class WorkbookFunctionsMdurationParameterSet {
    /**
     * The settlement.
     * 
     */
    @SerializedName(value = "settlement", alternate = {"Settlement"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement settlement;

    /**
     * The maturity.
     * 
     */
    @SerializedName(value = "maturity", alternate = {"Maturity"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement maturity;

    /**
     * The coupon.
     * 
     */
    @SerializedName(value = "coupon", alternate = {"Coupon"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement coupon;

    /**
     * The yld.
     * 
     */
    @SerializedName(value = "yld", alternate = {"Yld"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement yld;

    /**
     * The frequency.
     * 
     */
    @SerializedName(value = "frequency", alternate = {"Frequency"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement frequency;

    /**
     * The basis.
     * 
     */
    @SerializedName(value = "basis", alternate = {"Basis"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement basis;


    /**
     * Instiaciates a new WorkbookFunctionsMdurationParameterSet
     */
    public WorkbookFunctionsMdurationParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsMdurationParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsMdurationParameterSet(@Nonnull final WorkbookFunctionsMdurationParameterSetBuilder builder) {
        this.settlement = builder.settlement;
        this.maturity = builder.maturity;
        this.coupon = builder.coupon;
        this.yld = builder.yld;
        this.frequency = builder.frequency;
        this.basis = builder.basis;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsMdurationParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsMdurationParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsMdurationParameterSet
     */
    public static final class WorkbookFunctionsMdurationParameterSetBuilder {
        /**
         * The settlement parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement settlement;
        /**
         * Sets the Settlement
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsMdurationParameterSetBuilder withSettlement(@Nullable final com.google.gson.JsonElement val) {
            this.settlement = val;
            return this;
        }
        /**
         * The maturity parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement maturity;
        /**
         * Sets the Maturity
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsMdurationParameterSetBuilder withMaturity(@Nullable final com.google.gson.JsonElement val) {
            this.maturity = val;
            return this;
        }
        /**
         * The coupon parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement coupon;
        /**
         * Sets the Coupon
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsMdurationParameterSetBuilder withCoupon(@Nullable final com.google.gson.JsonElement val) {
            this.coupon = val;
            return this;
        }
        /**
         * The yld parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement yld;
        /**
         * Sets the Yld
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsMdurationParameterSetBuilder withYld(@Nullable final com.google.gson.JsonElement val) {
            this.yld = val;
            return this;
        }
        /**
         * The frequency parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement frequency;
        /**
         * Sets the Frequency
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsMdurationParameterSetBuilder withFrequency(@Nullable final com.google.gson.JsonElement val) {
            this.frequency = val;
            return this;
        }
        /**
         * The basis parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement basis;
        /**
         * Sets the Basis
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsMdurationParameterSetBuilder withBasis(@Nullable final com.google.gson.JsonElement val) {
            this.basis = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFunctionsMdurationParameterSetBuilder
         */
        @Nullable
        protected WorkbookFunctionsMdurationParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsMdurationParameterSet build() {
            return new WorkbookFunctionsMdurationParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.settlement != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("settlement", settlement));
        }
        if(this.maturity != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("maturity", maturity));
        }
        if(this.coupon != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("coupon", coupon));
        }
        if(this.yld != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("yld", yld));
        }
        if(this.frequency != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("frequency", frequency));
        }
        if(this.basis != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("basis", basis));
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