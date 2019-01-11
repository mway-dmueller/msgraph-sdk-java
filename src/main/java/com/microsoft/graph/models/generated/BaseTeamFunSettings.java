// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;
import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.GiphyRatingType;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Team Fun Settings.
 */
public class BaseTeamFunSettings implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Allow Giphy.
     * If set to true, enables Giphy use.
     */
    @SerializedName("allowGiphy")
    @Expose
    public Boolean allowGiphy;

    /**
     * The Giphy Content Rating.
     * Giphy content rating. Possible values are: moderate, strict.
     */
    @SerializedName("giphyContentRating")
    @Expose
    public GiphyRatingType giphyContentRating;

    /**
     * The Allow Stickers And Memes.
     * If set to true, enables users to include stickers and memes.
     */
    @SerializedName("allowStickersAndMemes")
    @Expose
    public Boolean allowStickersAndMemes;

    /**
     * The Allow Custom Memes.
     * If set to true, enables users to include custom memes.
     */
    @SerializedName("allowCustomMemes")
    @Expose
    public Boolean allowCustomMemes;


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