// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.User;
import com.microsoft.graph.models.extensions.UserActivity;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IUserActivityCollectionPage;
import com.microsoft.graph.requests.extensions.UserActivityCollectionResponse;
import com.microsoft.graph.requests.extensions.IUserActivityCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserActivityCollectionRequest;
import com.microsoft.graph.requests.extensions.UserActivityCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Activity Collection Request.
 */
public class UserActivityCollectionRequest extends BaseCollectionRequest<UserActivityCollectionResponse, IUserActivityCollectionPage> implements IUserActivityCollectionRequest {

    /**
     * The request builder for this collection of UserActivity
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserActivityCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UserActivityCollectionResponse.class, IUserActivityCollectionPage.class);
    }

    public void get(final ICallback<IUserActivityCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IUserActivityCollectionPage get() throws ClientException {
        final UserActivityCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final UserActivity newUserActivity, final ICallback<UserActivity> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new UserActivityRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newUserActivity, callback);
    }

    public UserActivity post(final UserActivity newUserActivity) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new UserActivityRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newUserActivity);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IUserActivityCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (UserActivityCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IUserActivityCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (UserActivityCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IUserActivityCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (UserActivityCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IUserActivityCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (UserActivityCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IUserActivityCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IUserActivityCollectionRequest)this;
    }
    public IUserActivityCollectionPage buildFromResponse(final UserActivityCollectionResponse response) {
        final IUserActivityCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new UserActivityCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final UserActivityCollectionPage page = new UserActivityCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
