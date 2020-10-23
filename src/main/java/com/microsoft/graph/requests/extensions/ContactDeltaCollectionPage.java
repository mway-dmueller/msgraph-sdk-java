// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Contact;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.DeltaCollectionPage;
import com.microsoft.graph.requests.extensions.ContactDeltaCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ContactDeltaCollectionPage;
import com.microsoft.graph.requests.extensions.ContactDeltaCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Contact Delta Collection Page.
 */
public class ContactDeltaCollectionPage extends DeltaCollectionPage<Contact, ContactDeltaCollectionRequestBuilder> {

    /**
     * A collection page for Contact.
     *
     * @param response The serialized ContactDeltaCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public ContactDeltaCollectionPage(final ContactDeltaCollectionResponse response, final ContactDeltaCollectionRequestBuilder builder) {
       super(response, builder);
    }

	/**
     * Creates the collection page for ContactDelta
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public ContactDeltaCollectionPage(final java.util.List<Contact> pageContents, final ContactDeltaCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
