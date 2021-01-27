// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.PlannerChecklistItems;
import com.microsoft.graph.models.PlannerPreviewType;
import com.microsoft.graph.models.PlannerExternalReferences;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Planner Task Details.
 */
public class PlannerTaskDetails extends Entity implements IJsonBackedObject {


    /**
     * The Checklist.
     * The collection of checklist items on the task.
     */
    @SerializedName(value = "checklist", alternate = {"Checklist"})
    @Expose
	@Nullable
    public PlannerChecklistItems checklist;

    /**
     * The Description.
     * Description of the task
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
	@Nullable
    public String description;

    /**
     * The Preview Type.
     * This sets the type of preview that shows up on the task. The possible values are: automatic, noPreview, checklist, description, reference. When set to automatic the displayed preview is chosen by the app viewing the task.
     */
    @SerializedName(value = "previewType", alternate = {"PreviewType"})
    @Expose
	@Nullable
    public PlannerPreviewType previewType;

    /**
     * The References.
     * The collection of references on the task.
     */
    @SerializedName(value = "references", alternate = {"References"})
    @Expose
	@Nullable
    public PlannerExternalReferences references;


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