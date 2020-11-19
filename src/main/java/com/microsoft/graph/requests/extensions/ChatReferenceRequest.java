// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Chat;
import com.microsoft.graph.models.extensions.ChatMessage;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Chat Reference Request.
 */
public class ChatReferenceRequest extends BaseRequest {

    /**
     * The request for the Chat
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ChatReferenceRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Chat.class);
    }

    public void delete(@Nonnull final ICallback<? super Chat> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    @Nullable
    public Chat delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public ChatReferenceRequest select(@Nonnull final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ChatReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public ChatReferenceRequest expand(@Nonnull final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ChatReferenceRequest)this;
    }
    /**
     * Puts the Chat
     *
     * @param srcChat the Chat reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final Chat srcChat, @Nonnull final ICallback<? super Chat> callback) {
        send(HttpMethod.PUT, callback, srcChat);
    }

    /**
     * Puts the Chat
     *
     * @param srcChat the Chat reference to PUT
     * @return the Chat
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    @Nullable
    public Chat put(@Nonnull final Chat srcChat) throws ClientException {
        return send(HttpMethod.PUT, srcChat);
    }
}