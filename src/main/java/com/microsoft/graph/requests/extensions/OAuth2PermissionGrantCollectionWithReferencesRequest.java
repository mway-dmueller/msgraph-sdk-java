// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ServicePrincipal;
import com.microsoft.graph.models.extensions.OAuth2PermissionGrant;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the OAuth2Permission Grant Collection With References Request.
 */
public class OAuth2PermissionGrantCollectionWithReferencesRequest extends BaseCollectionRequest<OAuth2PermissionGrantCollectionResponse, IOAuth2PermissionGrantCollectionPage> implements IOAuth2PermissionGrantCollectionWithReferencesRequest {

    /**
     * The request builder for this collection of OAuth2PermissionGrant
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OAuth2PermissionGrantCollectionWithReferencesRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, OAuth2PermissionGrantCollectionResponse.class, IOAuth2PermissionGrantCollectionPage.class);
    }

    public void get(final ICallback<IOAuth2PermissionGrantCollectionWithReferencesPage> callback) {
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

    public IOAuth2PermissionGrantCollectionWithReferencesPage get() throws ClientException {
        final OAuth2PermissionGrantCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public IOAuth2PermissionGrantCollectionWithReferencesRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (OAuth2PermissionGrantCollectionWithReferencesRequest)this;
    }

    public IOAuth2PermissionGrantCollectionWithReferencesRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (OAuth2PermissionGrantCollectionWithReferencesRequest)this;
    }

    public IOAuth2PermissionGrantCollectionWithReferencesRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (OAuth2PermissionGrantCollectionWithReferencesRequest)this;
    }

    public IOAuth2PermissionGrantCollectionWithReferencesRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (OAuth2PermissionGrantCollectionWithReferencesRequest)this;
    }

    public IOAuth2PermissionGrantCollectionWithReferencesPage buildFromResponse(final OAuth2PermissionGrantCollectionResponse response) {
        final IOAuth2PermissionGrantCollectionWithReferencesRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new OAuth2PermissionGrantCollectionWithReferencesRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final OAuth2PermissionGrantCollectionWithReferencesPage page = new OAuth2PermissionGrantCollectionWithReferencesPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
