// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.MultiValueLegacyExtendedProperty;
import com.microsoft.graph.requests.extensions.MultiValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MultiValueLegacyExtendedPropertyCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Multi Value Legacy Extended Property Collection Page.
 */
public class MultiValueLegacyExtendedPropertyCollectionPage extends BaseCollectionPage<MultiValueLegacyExtendedProperty, MultiValueLegacyExtendedPropertyCollectionRequestBuilder> {

    /**
     * A collection page for MultiValueLegacyExtendedProperty
     *
     * @param response the serialized MultiValueLegacyExtendedPropertyCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public MultiValueLegacyExtendedPropertyCollectionPage(final MultiValueLegacyExtendedPropertyCollectionResponse response, final MultiValueLegacyExtendedPropertyCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for MultiValueLegacyExtendedProperty
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public MultiValueLegacyExtendedPropertyCollectionPage(final java.util.List<MultiValueLegacyExtendedProperty> pageContents, final MultiValueLegacyExtendedPropertyCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
