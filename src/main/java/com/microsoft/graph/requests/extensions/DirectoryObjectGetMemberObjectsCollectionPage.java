// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;

import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.DirectoryObjectGetMemberObjectsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectGetMemberObjectsCollectionPage;
import com.microsoft.graph.requests.extensions.DirectoryObjectGetMemberObjectsCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Directory Object Get Member Objects Collection Page.
 */
public class DirectoryObjectGetMemberObjectsCollectionPage extends BaseCollectionPage<String, DirectoryObjectGetMemberObjectsCollectionRequestBuilder> {

    /**
     * A collection page for String.
     *
     * @param response The serialized DirectoryObjectGetMemberObjectsCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public DirectoryObjectGetMemberObjectsCollectionPage(final DirectoryObjectGetMemberObjectsCollectionResponse response, final DirectoryObjectGetMemberObjectsCollectionRequestBuilder builder) {
       super(response, builder);
    }

	/**
     * Creates the collection page for DirectoryObjectGetMemberObjects
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public DirectoryObjectGetMemberObjectsCollectionPage(final java.util.List<String> pageContents, final DirectoryObjectGetMemberObjectsCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
