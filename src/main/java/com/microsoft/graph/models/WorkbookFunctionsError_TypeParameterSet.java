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
 * The class for the Workbook Functions Error_Type Parameter Set.
 */
public class WorkbookFunctionsError_TypeParameterSet {
    /**
     * The error Val.
     * 
     */
    @SerializedName(value = "errorVal", alternate = {"ErrorVal"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement errorVal;


    /**
     * Instiaciates a new WorkbookFunctionsError_TypeParameterSet
     */
    public WorkbookFunctionsError_TypeParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsError_TypeParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsError_TypeParameterSet(@Nonnull final WorkbookFunctionsError_TypeParameterSetBuilder builder) {
        this.errorVal = builder.errorVal;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsError_TypeParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsError_TypeParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsError_TypeParameterSet
     */
    public static final class WorkbookFunctionsError_TypeParameterSetBuilder {
        /**
         * The errorVal parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement errorVal;
        /**
         * Sets the ErrorVal
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsError_TypeParameterSetBuilder withErrorVal(@Nullable final com.google.gson.JsonElement val) {
            this.errorVal = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFunctionsError_TypeParameterSetBuilder
         */
        @Nullable
        protected WorkbookFunctionsError_TypeParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsError_TypeParameterSet build() {
            return new WorkbookFunctionsError_TypeParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.errorVal != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("errorVal", errorVal));
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