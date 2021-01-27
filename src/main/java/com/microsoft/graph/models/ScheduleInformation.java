// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.FreeBusyError;
import com.microsoft.graph.models.ScheduleItem;
import com.microsoft.graph.models.WorkingHours;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Schedule Information.
 */
public class ScheduleInformation implements IJsonBackedObject {

    /** the OData type of the object as returned by the service */
    @SerializedName("@odata.type")
    @Expose
    @Nullable
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    @Nonnull
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Availability View.
     * Represents a merged view of availability of all the items in scheduleItems. The view consists of time slots. Availability during each time slot is indicated with: 0= free, 1= tentative, 2= busy, 3= out of office, 4= working elsewhere.
     */
    @SerializedName(value = "availabilityView", alternate = {"AvailabilityView"})
    @Expose
	@Nullable
    public String availabilityView;

    /**
     * The Error.
     * Error information from attempting to get the availability of the user, distribution list, or resource.
     */
    @SerializedName(value = "error", alternate = {"Error"})
    @Expose
	@Nullable
    public FreeBusyError error;

    /**
     * The Schedule Id.
     * An SMTP address of the user, distribution list, or resource, identifying an instance of scheduleInformation.
     */
    @SerializedName(value = "scheduleId", alternate = {"ScheduleId"})
    @Expose
	@Nullable
    public String scheduleId;

    /**
     * The Schedule Items.
     * Contains the items that describe the availability of the user or resource.
     */
    @SerializedName(value = "scheduleItems", alternate = {"ScheduleItems"})
    @Expose
	@Nullable
    public java.util.List<ScheduleItem> scheduleItems;

    /**
     * The Working Hours.
     * The days of the week and hours in a specific time zone that the user works. These are set as part of the user's mailboxSettings.
     */
    @SerializedName(value = "workingHours", alternate = {"WorkingHours"})
    @Expose
	@Nullable
    public WorkingHours workingHours;


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