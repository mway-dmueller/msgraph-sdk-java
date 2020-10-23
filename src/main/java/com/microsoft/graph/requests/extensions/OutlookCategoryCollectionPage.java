// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.OutlookCategory;
import com.microsoft.graph.requests.extensions.OutlookCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OutlookCategoryCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Outlook Category Collection Page.
 */
public class OutlookCategoryCollectionPage extends BaseCollectionPage<OutlookCategory, OutlookCategoryCollectionRequestBuilder> {

    /**
     * A collection page for OutlookCategory
     *
     * @param response the serialized OutlookCategoryCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public OutlookCategoryCollectionPage(final OutlookCategoryCollectionResponse response, final OutlookCategoryCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for OutlookCategory
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public OutlookCategoryCollectionPage(final java.util.List<OutlookCategory> pageContents, final OutlookCategoryCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
