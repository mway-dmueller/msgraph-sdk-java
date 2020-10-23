// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ColumnDefinition;
import com.microsoft.graph.requests.extensions.ColumnDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ColumnDefinitionCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Column Definition Collection Page.
 */
public class ColumnDefinitionCollectionPage extends BaseCollectionPage<ColumnDefinition, ColumnDefinitionCollectionRequestBuilder> {

    /**
     * A collection page for ColumnDefinition
     *
     * @param response the serialized ColumnDefinitionCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ColumnDefinitionCollectionPage(final ColumnDefinitionCollectionResponse response, final ColumnDefinitionCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for ColumnDefinition
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public ColumnDefinitionCollectionPage(final java.util.List<ColumnDefinition> pageContents, final ColumnDefinitionCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
