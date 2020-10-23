// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceComplianceActionItem;
import com.microsoft.graph.requests.extensions.DeviceComplianceActionItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceComplianceActionItemCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Compliance Action Item Collection Page.
 */
public class DeviceComplianceActionItemCollectionPage extends BaseCollectionPage<DeviceComplianceActionItem, DeviceComplianceActionItemCollectionRequestBuilder> {

    /**
     * A collection page for DeviceComplianceActionItem
     *
     * @param response the serialized DeviceComplianceActionItemCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DeviceComplianceActionItemCollectionPage(final DeviceComplianceActionItemCollectionResponse response, final DeviceComplianceActionItemCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for DeviceComplianceActionItem
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public DeviceComplianceActionItemCollectionPage(final java.util.List<DeviceComplianceActionItem> pageContents, final DeviceComplianceActionItemCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
