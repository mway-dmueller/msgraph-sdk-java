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
import com.microsoft.graph.requests.extensions.DirectoryObjectCheckMemberObjectsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectCheckMemberObjectsCollectionPage;
import com.microsoft.graph.requests.extensions.DirectoryObjectCheckMemberObjectsCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Directory Object Check Member Objects Collection Page.
 */
public class DirectoryObjectCheckMemberObjectsCollectionPage extends BaseCollectionPage<String, DirectoryObjectCheckMemberObjectsCollectionRequestBuilder> {

    /**
     * A collection page for String.
     *
     * @param response The serialized DirectoryObjectCheckMemberObjectsCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public DirectoryObjectCheckMemberObjectsCollectionPage(final DirectoryObjectCheckMemberObjectsCollectionResponse response, final DirectoryObjectCheckMemberObjectsCollectionRequestBuilder builder) {
       super(response, builder);
    }

	/**
     * Creates the collection page for DirectoryObjectCheckMemberObjects
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public DirectoryObjectCheckMemberObjectsCollectionPage(final java.util.List<String> pageContents, final DirectoryObjectCheckMemberObjectsCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
