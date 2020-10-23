// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceConfigurationUserStatus;
import com.microsoft.graph.requests.extensions.DeviceConfigurationUserStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceConfigurationUserStatusCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Configuration User Status Collection Page.
 */
public class DeviceConfigurationUserStatusCollectionPage extends BaseCollectionPage<DeviceConfigurationUserStatus, DeviceConfigurationUserStatusCollectionRequestBuilder> {

    /**
     * A collection page for DeviceConfigurationUserStatus
     *
     * @param response the serialized DeviceConfigurationUserStatusCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DeviceConfigurationUserStatusCollectionPage(final DeviceConfigurationUserStatusCollectionResponse response, final DeviceConfigurationUserStatusCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for DeviceConfigurationUserStatus
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public DeviceConfigurationUserStatusCollectionPage(final java.util.List<DeviceConfigurationUserStatus> pageContents, final DeviceConfigurationUserStatusCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
