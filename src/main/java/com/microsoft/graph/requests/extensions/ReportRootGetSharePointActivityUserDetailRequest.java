// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Report;
import com.microsoft.graph.requests.extensions.IReportRootGetSharePointActivityUserDetailRequest;
import com.microsoft.graph.requests.extensions.ReportRootGetSharePointActivityUserDetailRequest;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Share Point Activity User Detail Request.
 */
public class ReportRootGetSharePointActivityUserDetailRequest extends BaseRequest implements IReportRootGetSharePointActivityUserDetailRequest {

    /**
     * The request for this ReportRootGetSharePointActivityUserDetail
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ReportRootGetSharePointActivityUserDetailRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Report.class);
    }

    /**
     * Patches the ReportRootGetSharePointActivityUserDetail
     * @param srcReport the Report with which to PATCH
     * @param callback the callback to be called after success or failure
     */
    public void patch(Report srcReport, final ICallback<Report> callback) {
        send(HttpMethod.PATCH, callback, srcReport);
    }

    /**
     * Patches the ReportRootGetSharePointActivityUserDetail
     *
     * @param srcReport the Report with which to PATCH
     * @return the Report
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
     public Report patch(Report srcReport) throws ClientException {
        return this.send(HttpMethod.PATCH, srcReport);
    }

    /**
     * Puts the ReportRootGetSharePointActivityUserDetail
     *
     * @param srcReport the Report to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(Report srcReport, final ICallback<Report> callback) {
        send(HttpMethod.PUT, callback, srcReport);
    }

    /**
     * Puts the ReportRootGetSharePointActivityUserDetail
     *
     * @param srcReport the Report to PUT
     * @return the Report
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
     public Report put(Report srcReport) throws ClientException {
        return this.send(HttpMethod.PUT, srcReport);
    }
    /**
     * Gets the Report
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<Report> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Report
     *
     * @return the Report
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public Report get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IReportRootGetSharePointActivityUserDetailRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ReportRootGetSharePointActivityUserDetailRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IReportRootGetSharePointActivityUserDetailRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ReportRootGetSharePointActivityUserDetailRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IReportRootGetSharePointActivityUserDetailRequest filter(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (ReportRootGetSharePointActivityUserDetailRequest)this;
    }

}
