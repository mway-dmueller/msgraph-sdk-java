// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.CertificateBasedAuthConfiguration;
import com.microsoft.graph.requests.extensions.CertificateBasedAuthConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.CertificateBasedAuthConfigurationCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Certificate Based Auth Configuration Collection Page.
 */
public class CertificateBasedAuthConfigurationCollectionPage extends BaseCollectionPage<CertificateBasedAuthConfiguration, CertificateBasedAuthConfigurationCollectionRequestBuilder> {

    /**
     * A collection page for CertificateBasedAuthConfiguration
     *
     * @param response the serialized CertificateBasedAuthConfigurationCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public CertificateBasedAuthConfigurationCollectionPage(final CertificateBasedAuthConfigurationCollectionResponse response, final CertificateBasedAuthConfigurationCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for CertificateBasedAuthConfiguration
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public CertificateBasedAuthConfigurationCollectionPage(final java.util.List<CertificateBasedAuthConfiguration> pageContents, final CertificateBasedAuthConfigurationCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
