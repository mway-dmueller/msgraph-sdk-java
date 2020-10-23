// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AdministrativeUnit;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.DeltaCollectionPage;
import com.microsoft.graph.requests.extensions.AdministrativeUnitDeltaCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AdministrativeUnitDeltaCollectionPage;
import com.microsoft.graph.requests.extensions.AdministrativeUnitDeltaCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Administrative Unit Delta Collection Page.
 */
public class AdministrativeUnitDeltaCollectionPage extends DeltaCollectionPage<AdministrativeUnit, AdministrativeUnitDeltaCollectionRequestBuilder> {

    /**
     * A collection page for AdministrativeUnit.
     *
     * @param response The serialized AdministrativeUnitDeltaCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public AdministrativeUnitDeltaCollectionPage(final AdministrativeUnitDeltaCollectionResponse response, final AdministrativeUnitDeltaCollectionRequestBuilder builder) {
       super(response, builder);
    }

	/**
     * Creates the collection page for AdministrativeUnitDelta
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public AdministrativeUnitDeltaCollectionPage(final java.util.List<AdministrativeUnit> pageContents, final AdministrativeUnitDeltaCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
