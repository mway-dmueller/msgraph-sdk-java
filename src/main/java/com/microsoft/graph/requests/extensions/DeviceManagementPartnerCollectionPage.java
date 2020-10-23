// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceManagementPartner;
import com.microsoft.graph.requests.extensions.DeviceManagementPartnerCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementPartnerCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Partner Collection Page.
 */
public class DeviceManagementPartnerCollectionPage extends BaseCollectionPage<DeviceManagementPartner, DeviceManagementPartnerCollectionRequestBuilder> {

    /**
     * A collection page for DeviceManagementPartner
     *
     * @param response the serialized DeviceManagementPartnerCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DeviceManagementPartnerCollectionPage(final DeviceManagementPartnerCollectionResponse response, final DeviceManagementPartnerCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for DeviceManagementPartner
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public DeviceManagementPartnerCollectionPage(final java.util.List<DeviceManagementPartner> pageContents, final DeviceManagementPartnerCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
