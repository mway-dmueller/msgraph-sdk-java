// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.IosDeviceType;
import com.microsoft.graph.models.IosMinimumOperatingSystem;
import com.microsoft.graph.models.MobileApp;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Store App.
 */
public class IosStoreApp extends MobileApp implements IJsonBackedObject {


    /**
     * The Applicable Device Type.
     * The iOS architecture for which this app can run on.
     */
    @SerializedName(value = "applicableDeviceType", alternate = {"ApplicableDeviceType"})
    @Expose
	@Nullable
    public IosDeviceType applicableDeviceType;

    /**
     * The App Store Url.
     * The Apple App Store URL
     */
    @SerializedName(value = "appStoreUrl", alternate = {"AppStoreUrl"})
    @Expose
	@Nullable
    public String appStoreUrl;

    /**
     * The Bundle Id.
     * The Identity Name.
     */
    @SerializedName(value = "bundleId", alternate = {"BundleId"})
    @Expose
	@Nullable
    public String bundleId;

    /**
     * The Minimum Supported Operating System.
     * The value for the minimum applicable operating system.
     */
    @SerializedName(value = "minimumSupportedOperatingSystem", alternate = {"MinimumSupportedOperatingSystem"})
    @Expose
	@Nullable
    public IosMinimumOperatingSystem minimumSupportedOperatingSystem;


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
	@Override
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