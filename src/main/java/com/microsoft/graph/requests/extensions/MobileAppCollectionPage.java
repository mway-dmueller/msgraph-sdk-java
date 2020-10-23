// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.MobileApp;
import com.microsoft.graph.requests.extensions.MobileAppCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile App Collection Page.
 */
public class MobileAppCollectionPage extends BaseCollectionPage<MobileApp, MobileAppCollectionRequestBuilder> {

    /**
     * A collection page for MobileApp
     *
     * @param response the serialized MobileAppCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public MobileAppCollectionPage(final MobileAppCollectionResponse response, final MobileAppCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for MobileApp
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public MobileAppCollectionPage(final java.util.List<MobileApp> pageContents, final MobileAppCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
