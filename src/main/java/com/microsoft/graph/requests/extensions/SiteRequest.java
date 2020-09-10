// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Site;
import com.microsoft.graph.models.extensions.ItemActivityStat;
import com.microsoft.graph.requests.extensions.IColumnDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IColumnDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.ColumnDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ColumnDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.IContentTypeCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IContentTypeRequestBuilder;
import com.microsoft.graph.requests.extensions.ContentTypeCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ContentTypeRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveRequestBuilder;
import com.microsoft.graph.requests.extensions.IBaseItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IBaseItemRequestBuilder;
import com.microsoft.graph.requests.extensions.BaseItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.BaseItemRequestBuilder;
import com.microsoft.graph.requests.extensions.IListCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IListRequestBuilder;
import com.microsoft.graph.requests.extensions.ListCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ListRequestBuilder;
import com.microsoft.graph.requests.extensions.ISiteCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISiteRequestBuilder;
import com.microsoft.graph.requests.extensions.SiteCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SiteRequestBuilder;
import com.microsoft.graph.requests.extensions.IItemAnalyticsRequestBuilder;
import com.microsoft.graph.requests.extensions.ItemAnalyticsRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnenoteRequestBuilder;
import com.microsoft.graph.requests.extensions.OnenoteRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Site Request.
 */
public class SiteRequest extends BaseRequest implements ISiteRequest {
	
    /**
     * The request for the Site
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SiteRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Site.class);
    }

    /**
     * Gets the Site from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<Site> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Site from the service
     *
     * @return the Site from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Site get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<Site> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this Site with a source
     *
     * @param sourceSite the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final Site sourceSite, final ICallback<Site> callback) {
        send(HttpMethod.PATCH, callback, sourceSite);
    }

    /**
     * Patches this Site with a source
     *
     * @param sourceSite the source object with updates
     * @return the updated Site
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Site patch(final Site sourceSite) throws ClientException {
        return send(HttpMethod.PATCH, sourceSite);
    }

    /**
     * Creates a Site with a new object
     *
     * @param newSite the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final Site newSite, final ICallback<Site> callback) {
        send(HttpMethod.POST, callback, newSite);
    }

    /**
     * Creates a Site with a new object
     *
     * @param newSite the new object to create
     * @return the created Site
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Site post(final Site newSite) throws ClientException {
        return send(HttpMethod.POST, newSite);
    }

    /**
     * Creates a Site with a new object
     *
     * @param newSite the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final Site newSite, final ICallback<Site> callback) {
        send(HttpMethod.PUT, callback, newSite);
    }

    /**
     * Creates a Site with a new object
     *
     * @param newSite the object to create/update
     * @return the created Site
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Site put(final Site newSite) throws ClientException {
        return send(HttpMethod.PUT, newSite);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ISiteRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (SiteRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ISiteRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (SiteRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public ISiteRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (SiteRequest)this;
     }

}

