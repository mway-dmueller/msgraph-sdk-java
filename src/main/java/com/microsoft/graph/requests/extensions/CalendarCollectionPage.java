// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Calendar;
import com.microsoft.graph.requests.extensions.CalendarCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.CalendarCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Calendar Collection Page.
 */
public class CalendarCollectionPage extends BaseCollectionPage<Calendar, CalendarCollectionRequestBuilder> {

    /**
     * A collection page for Calendar
     *
     * @param response the serialized CalendarCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public CalendarCollectionPage(final CalendarCollectionResponse response, final CalendarCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for Calendar
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public CalendarCollectionPage(final java.util.List<Calendar> pageContents, final CalendarCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
