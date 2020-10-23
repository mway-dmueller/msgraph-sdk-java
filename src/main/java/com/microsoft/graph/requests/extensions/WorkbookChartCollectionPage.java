// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WorkbookChart;
import com.microsoft.graph.requests.extensions.WorkbookChartCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookChartCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Collection Page.
 */
public class WorkbookChartCollectionPage extends BaseCollectionPage<WorkbookChart, WorkbookChartCollectionRequestBuilder> {

    /**
     * A collection page for WorkbookChart
     *
     * @param response the serialized WorkbookChartCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public WorkbookChartCollectionPage(final WorkbookChartCollectionResponse response, final WorkbookChartCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for WorkbookChart
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public WorkbookChartCollectionPage(final java.util.List<WorkbookChart> pageContents, final WorkbookChartCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
