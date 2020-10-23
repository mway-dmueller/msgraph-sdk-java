// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Chat;
import com.microsoft.graph.requests.extensions.ChatCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ChatCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Chat Collection Page.
 */
public class ChatCollectionPage extends BaseCollectionPage<Chat, ChatCollectionRequestBuilder> {

    /**
     * A collection page for Chat
     *
     * @param response the serialized ChatCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ChatCollectionPage(final ChatCollectionResponse response, final ChatCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for Chat
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public ChatCollectionPage(final java.util.List<Chat> pageContents, final ChatCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
