// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.PermissionGrantPolicy;
import com.microsoft.graph.requests.extensions.PermissionGrantPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PermissionGrantPolicyCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Permission Grant Policy Collection Page.
 */
public class PermissionGrantPolicyCollectionPage extends BaseCollectionPage<PermissionGrantPolicy, PermissionGrantPolicyCollectionRequestBuilder> {

    /**
     * A collection page for PermissionGrantPolicy
     *
     * @param response the serialized PermissionGrantPolicyCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public PermissionGrantPolicyCollectionPage(final PermissionGrantPolicyCollectionResponse response, final PermissionGrantPolicyCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for PermissionGrantPolicy
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public PermissionGrantPolicyCollectionPage(final java.util.List<PermissionGrantPolicy> pageContents, final PermissionGrantPolicyCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
