// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.UserScopeTeamsAppInstallation;
import com.microsoft.graph.requests.extensions.ChatRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Scope Teams App Installation Request.
 */
public class UserScopeTeamsAppInstallationRequest extends BaseRequest {
	
    /**
     * The request for the UserScopeTeamsAppInstallation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserScopeTeamsAppInstallationRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UserScopeTeamsAppInstallation.class);
    }

    /**
     * Gets the UserScopeTeamsAppInstallation from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super UserScopeTeamsAppInstallation> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the UserScopeTeamsAppInstallation from the service
     *
     * @return the UserScopeTeamsAppInstallation from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UserScopeTeamsAppInstallation get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super UserScopeTeamsAppInstallation> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this UserScopeTeamsAppInstallation with a source
     *
     * @param sourceUserScopeTeamsAppInstallation the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final UserScopeTeamsAppInstallation sourceUserScopeTeamsAppInstallation, @Nonnull final ICallback<? super UserScopeTeamsAppInstallation> callback) {
        send(HttpMethod.PATCH, callback, sourceUserScopeTeamsAppInstallation);
    }

    /**
     * Patches this UserScopeTeamsAppInstallation with a source
     *
     * @param sourceUserScopeTeamsAppInstallation the source object with updates
     * @return the updated UserScopeTeamsAppInstallation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UserScopeTeamsAppInstallation patch(@Nonnull final UserScopeTeamsAppInstallation sourceUserScopeTeamsAppInstallation) throws ClientException {
        return send(HttpMethod.PATCH, sourceUserScopeTeamsAppInstallation);
    }

    /**
     * Creates a UserScopeTeamsAppInstallation with a new object
     *
     * @param newUserScopeTeamsAppInstallation the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final UserScopeTeamsAppInstallation newUserScopeTeamsAppInstallation, @Nonnull final ICallback<? super UserScopeTeamsAppInstallation> callback) {
        send(HttpMethod.POST, callback, newUserScopeTeamsAppInstallation);
    }

    /**
     * Creates a UserScopeTeamsAppInstallation with a new object
     *
     * @param newUserScopeTeamsAppInstallation the new object to create
     * @return the created UserScopeTeamsAppInstallation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UserScopeTeamsAppInstallation post(@Nonnull final UserScopeTeamsAppInstallation newUserScopeTeamsAppInstallation) throws ClientException {
        return send(HttpMethod.POST, newUserScopeTeamsAppInstallation);
    }

    /**
     * Creates a UserScopeTeamsAppInstallation with a new object
     *
     * @param newUserScopeTeamsAppInstallation the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final UserScopeTeamsAppInstallation newUserScopeTeamsAppInstallation, @Nonnull final ICallback<? super UserScopeTeamsAppInstallation> callback) {
        send(HttpMethod.PUT, callback, newUserScopeTeamsAppInstallation);
    }

    /**
     * Creates a UserScopeTeamsAppInstallation with a new object
     *
     * @param newUserScopeTeamsAppInstallation the object to create/update
     * @return the created UserScopeTeamsAppInstallation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UserScopeTeamsAppInstallation put(@Nonnull final UserScopeTeamsAppInstallation newUserScopeTeamsAppInstallation) throws ClientException {
        return send(HttpMethod.PUT, newUserScopeTeamsAppInstallation);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public UserScopeTeamsAppInstallationRequest select(@Nonnull final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (UserScopeTeamsAppInstallationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public UserScopeTeamsAppInstallationRequest expand(@Nonnull final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (UserScopeTeamsAppInstallationRequest)this;
     }

}
