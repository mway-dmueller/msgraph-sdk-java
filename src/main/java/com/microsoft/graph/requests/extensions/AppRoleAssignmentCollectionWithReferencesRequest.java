// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ServicePrincipal;
import com.microsoft.graph.models.extensions.AppRoleAssignment;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the App Role Assignment Collection With References Request.
 */
public class AppRoleAssignmentCollectionWithReferencesRequest extends BaseCollectionRequest<AppRoleAssignmentCollectionResponse, AppRoleAssignmentCollectionPage> {

    /**
     * The request builder for this collection of AppRoleAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AppRoleAssignmentCollectionWithReferencesRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AppRoleAssignmentCollectionResponse.class, AppRoleAssignmentCollectionPage.class);
    }

    public void get(@Nonnull final ICallback<? super AppRoleAssignmentCollectionWithReferencesPage> callback) {
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

    @Nonnull
    public AppRoleAssignmentCollectionWithReferencesPage get() throws ClientException {
        final AppRoleAssignmentCollectionResponse response = send();
        return buildFromResponse(response);
    }

    @Nonnull
    public AppRoleAssignmentCollectionWithReferencesRequest expand(@Nonnull final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return this;
    }

    @Nonnull
    public AppRoleAssignmentCollectionWithReferencesRequest filter(@Nonnull final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return this;
    }

    @Nonnull
    public AppRoleAssignmentCollectionWithReferencesRequest orderBy(@Nonnull final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return this;
    }

    @Nonnull
    public AppRoleAssignmentCollectionWithReferencesRequest select(@Nonnull final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return this;
    }

    @Nonnull
    public AppRoleAssignmentCollectionWithReferencesRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return this;
    }

    @Nonnull
    public AppRoleAssignmentCollectionWithReferencesPage buildFromResponse(@Nonnull final AppRoleAssignmentCollectionResponse response) {
        final AppRoleAssignmentCollectionWithReferencesRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new AppRoleAssignmentCollectionWithReferencesRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final AppRoleAssignmentCollectionWithReferencesPage page = new AppRoleAssignmentCollectionWithReferencesPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}