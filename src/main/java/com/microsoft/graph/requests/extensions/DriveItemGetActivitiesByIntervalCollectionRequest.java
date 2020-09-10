// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ItemActivityStat;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IDriveItemGetActivitiesByIntervalCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveItemGetActivitiesByIntervalCollectionPage;
import com.microsoft.graph.requests.extensions.DriveItemGetActivitiesByIntervalCollectionResponse;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Drive Item Get Activities By Interval Collection Request.
 */
public class DriveItemGetActivitiesByIntervalCollectionRequest extends BaseCollectionRequest<DriveItemGetActivitiesByIntervalCollectionResponse, IDriveItemGetActivitiesByIntervalCollectionPage> implements IDriveItemGetActivitiesByIntervalCollectionRequest {


    /**
     * The request for this DriveItemGetActivitiesByInterval
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DriveItemGetActivitiesByIntervalCollectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DriveItemGetActivitiesByIntervalCollectionResponse.class, IDriveItemGetActivitiesByIntervalCollectionPage.class);
    }


    public void get(final ICallback<IDriveItemGetActivitiesByIntervalCollectionPage> callback) {
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

    public IDriveItemGetActivitiesByIntervalCollectionPage get() throws ClientException {
        final DriveItemGetActivitiesByIntervalCollectionResponse response = send();
        return buildFromResponse(response);
    }


    public IDriveItemGetActivitiesByIntervalCollectionPage buildFromResponse(final DriveItemGetActivitiesByIntervalCollectionResponse response) {
        final IDriveItemGetActivitiesByIntervalCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new DriveItemGetActivitiesByIntervalCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final IDriveItemGetActivitiesByIntervalCollectionPage page = new DriveItemGetActivitiesByIntervalCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDriveItemGetActivitiesByIntervalCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IDriveItemGetActivitiesByIntervalCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IDriveItemGetActivitiesByIntervalCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (IDriveItemGetActivitiesByIntervalCollectionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDriveItemGetActivitiesByIntervalCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (IDriveItemGetActivitiesByIntervalCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IDriveItemGetActivitiesByIntervalCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (IDriveItemGetActivitiesByIntervalCollectionRequest)this;
    }

}
