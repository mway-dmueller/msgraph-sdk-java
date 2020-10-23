// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceEnrollmentConfiguration;
import com.microsoft.graph.requests.extensions.DeviceEnrollmentConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceEnrollmentConfigurationCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Enrollment Configuration Collection Page.
 */
public class DeviceEnrollmentConfigurationCollectionPage extends BaseCollectionPage<DeviceEnrollmentConfiguration, DeviceEnrollmentConfigurationCollectionRequestBuilder> {

    /**
     * A collection page for DeviceEnrollmentConfiguration
     *
     * @param response the serialized DeviceEnrollmentConfigurationCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DeviceEnrollmentConfigurationCollectionPage(final DeviceEnrollmentConfigurationCollectionResponse response, final DeviceEnrollmentConfigurationCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for DeviceEnrollmentConfiguration
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public DeviceEnrollmentConfigurationCollectionPage(final java.util.List<DeviceEnrollmentConfiguration> pageContents, final DeviceEnrollmentConfigurationCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
