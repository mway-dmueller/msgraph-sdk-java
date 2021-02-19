// Template Source: IBaseEntityWithReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AppRoleAssignment;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.AppRoleAssignment;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the App Role Assignment With Reference Request.
 */
public interface IAppRoleAssignmentWithReferenceRequest extends IHttpRequest {

    void post(final AppRoleAssignment newAppRoleAssignment, final IJsonBackedObject payload, final ICallback<? super AppRoleAssignment> callback);

    AppRoleAssignment post(final AppRoleAssignment newAppRoleAssignment, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super AppRoleAssignment> callback);

    AppRoleAssignment get() throws ClientException;

	void delete(final ICallback<? super AppRoleAssignment> callback);

	void delete() throws ClientException;

	void patch(final AppRoleAssignment sourceAppRoleAssignment, final ICallback<? super AppRoleAssignment> callback);

	AppRoleAssignment patch(final AppRoleAssignment sourceAppRoleAssignment) throws ClientException;

    IAppRoleAssignmentWithReferenceRequest select(final String value);

    IAppRoleAssignmentWithReferenceRequest expand(final String value);

}