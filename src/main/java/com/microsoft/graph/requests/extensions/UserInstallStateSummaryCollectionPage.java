// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.UserInstallStateSummary;
import com.microsoft.graph.requests.extensions.UserInstallStateSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserInstallStateSummaryCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Install State Summary Collection Page.
 */
public class UserInstallStateSummaryCollectionPage extends BaseCollectionPage<UserInstallStateSummary, UserInstallStateSummaryCollectionRequestBuilder> {

    /**
     * A collection page for UserInstallStateSummary
     *
     * @param response the serialized UserInstallStateSummaryCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public UserInstallStateSummaryCollectionPage(final UserInstallStateSummaryCollectionResponse response, final UserInstallStateSummaryCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for UserInstallStateSummary
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public UserInstallStateSummaryCollectionPage(final java.util.List<UserInstallStateSummary> pageContents, final UserInstallStateSummaryCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
