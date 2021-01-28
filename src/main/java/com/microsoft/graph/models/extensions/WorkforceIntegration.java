// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.WorkforceIntegrationEncryption;
import com.microsoft.graph.models.generated.WorkforceIntegrationSupportedEntities;
import com.microsoft.graph.models.extensions.ChangeTrackedEntity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workforce Integration.
 */
public class WorkforceIntegration extends ChangeTrackedEntity implements IJsonBackedObject {


    /**
     * The Api Version.
     * API version for the call back URL. Start with 1.
     */
    @SerializedName(value = "apiVersion", alternate = {"ApiVersion"})
    @Expose
    public Integer apiVersion;

    /**
     * The Display Name.
     * Name of the workforce integration.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
    public String displayName;

    /**
     * The Encryption.
     * The workforce integration encryption resource.
     */
    @SerializedName(value = "encryption", alternate = {"Encryption"})
    @Expose
    public WorkforceIntegrationEncryption encryption;

    /**
     * The Is Active.
     * Indicates whether this workforce integration is currently active and available.
     */
    @SerializedName(value = "isActive", alternate = {"IsActive"})
    @Expose
    public Boolean isActive;

    /**
     * The Supported Entities.
     * This property will replace supports in v1.0. We recommend that you use this property instead of supports. The supports property will still be supported in beta for the time being. Possible values are none, shift, swapRequest, openshift, openShiftRequest, userShiftPreferences. If selecting more than one value, all values must start with the first letter in uppercase.
     */
    @SerializedName(value = "supportedEntities", alternate = {"SupportedEntities"})
    @Expose
    public EnumSet<WorkforceIntegrationSupportedEntities> supportedEntities;

    /**
     * The Url.
     * Workforce Integration URL for callbacks from the Shifts service.
     */
    @SerializedName(value = "url", alternate = {"Url"})
    @Expose
    public String url;


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
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}
