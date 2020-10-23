// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Organization;
import com.microsoft.graph.requests.extensions.OrganizationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OrganizationCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Organization Collection Page.
 */
public class OrganizationCollectionPage extends BaseCollectionPage<Organization, OrganizationCollectionRequestBuilder> {

    /**
     * A collection page for Organization
     *
     * @param response the serialized OrganizationCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public OrganizationCollectionPage(final OrganizationCollectionResponse response, final OrganizationCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for Organization
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public OrganizationCollectionPage(final java.util.List<Organization> pageContents, final OrganizationCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
