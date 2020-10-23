// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceConfigurationAssignment;
import com.microsoft.graph.requests.extensions.DeviceConfigurationAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceConfigurationAssignmentCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Configuration Assignment Collection Page.
 */
public class DeviceConfigurationAssignmentCollectionPage extends BaseCollectionPage<DeviceConfigurationAssignment, DeviceConfigurationAssignmentCollectionRequestBuilder> {

    /**
     * A collection page for DeviceConfigurationAssignment
     *
     * @param response the serialized DeviceConfigurationAssignmentCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DeviceConfigurationAssignmentCollectionPage(final DeviceConfigurationAssignmentCollectionResponse response, final DeviceConfigurationAssignmentCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for DeviceConfigurationAssignment
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public DeviceConfigurationAssignmentCollectionPage(final java.util.List<DeviceConfigurationAssignment> pageContents, final DeviceConfigurationAssignmentCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
