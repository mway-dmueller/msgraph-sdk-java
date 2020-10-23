// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ActivityHistoryItem;
import com.microsoft.graph.requests.extensions.ActivityHistoryItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ActivityHistoryItemCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Activity History Item Collection Page.
 */
public class ActivityHistoryItemCollectionPage extends BaseCollectionPage<ActivityHistoryItem, ActivityHistoryItemCollectionRequestBuilder> {

    /**
     * A collection page for ActivityHistoryItem
     *
     * @param response the serialized ActivityHistoryItemCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ActivityHistoryItemCollectionPage(final ActivityHistoryItemCollectionResponse response, final ActivityHistoryItemCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for ActivityHistoryItem
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public ActivityHistoryItemCollectionPage(final java.util.List<ActivityHistoryItem> pageContents, final ActivityHistoryItemCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
