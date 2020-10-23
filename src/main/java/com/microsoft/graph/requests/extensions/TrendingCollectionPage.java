// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Trending;
import com.microsoft.graph.requests.extensions.TrendingCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TrendingCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Trending Collection Page.
 */
public class TrendingCollectionPage extends BaseCollectionPage<Trending, TrendingCollectionRequestBuilder> {

    /**
     * A collection page for Trending
     *
     * @param response the serialized TrendingCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public TrendingCollectionPage(final TrendingCollectionResponse response, final TrendingCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for Trending
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public TrendingCollectionPage(final java.util.List<Trending> pageContents, final TrendingCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
