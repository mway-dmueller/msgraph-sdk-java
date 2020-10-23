// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.OpenShiftChangeRequest;
import com.microsoft.graph.requests.extensions.OpenShiftChangeRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OpenShiftChangeRequestCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Open Shift Change Request Collection Page.
 */
public class OpenShiftChangeRequestCollectionPage extends BaseCollectionPage<OpenShiftChangeRequest, OpenShiftChangeRequestCollectionRequestBuilder> {

    /**
     * A collection page for OpenShiftChangeRequest
     *
     * @param response the serialized OpenShiftChangeRequestCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public OpenShiftChangeRequestCollectionPage(final OpenShiftChangeRequestCollectionResponse response, final OpenShiftChangeRequestCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for OpenShiftChangeRequest
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public OpenShiftChangeRequestCollectionPage(final java.util.List<OpenShiftChangeRequest> pageContents, final OpenShiftChangeRequestCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
