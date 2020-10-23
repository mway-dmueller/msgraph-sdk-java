// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WindowsInformationProtectionAppLearningSummary;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionAppLearningSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionAppLearningSummaryCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Information Protection App Learning Summary Collection Page.
 */
public class WindowsInformationProtectionAppLearningSummaryCollectionPage extends BaseCollectionPage<WindowsInformationProtectionAppLearningSummary, WindowsInformationProtectionAppLearningSummaryCollectionRequestBuilder> {

    /**
     * A collection page for WindowsInformationProtectionAppLearningSummary
     *
     * @param response the serialized WindowsInformationProtectionAppLearningSummaryCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public WindowsInformationProtectionAppLearningSummaryCollectionPage(final WindowsInformationProtectionAppLearningSummaryCollectionResponse response, final WindowsInformationProtectionAppLearningSummaryCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for WindowsInformationProtectionAppLearningSummary
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public WindowsInformationProtectionAppLearningSummaryCollectionPage(final java.util.List<WindowsInformationProtectionAppLearningSummary> pageContents, final WindowsInformationProtectionAppLearningSummaryCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
