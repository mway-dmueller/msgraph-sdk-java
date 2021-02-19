// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.CountryNamedLocation;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Country Named Location Request.
 */
public interface ICountryNamedLocationRequest extends IHttpRequest {

    /**
     * Gets the CountryNamedLocation from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super CountryNamedLocation> callback);

    /**
     * Gets the CountryNamedLocation from the service
     *
     * @return the CountryNamedLocation from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    CountryNamedLocation get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super CountryNamedLocation> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this CountryNamedLocation with a source
     *
     * @param sourceCountryNamedLocation the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final CountryNamedLocation sourceCountryNamedLocation, final ICallback<? super CountryNamedLocation> callback);

    /**
     * Patches this CountryNamedLocation with a source
     *
     * @param sourceCountryNamedLocation the source object with updates
     * @return the updated CountryNamedLocation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    CountryNamedLocation patch(final CountryNamedLocation sourceCountryNamedLocation) throws ClientException;

    /**
     * Posts a CountryNamedLocation with a new object
     *
     * @param newCountryNamedLocation the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final CountryNamedLocation newCountryNamedLocation, final ICallback<? super CountryNamedLocation> callback);

    /**
     * Posts a CountryNamedLocation with a new object
     *
     * @param newCountryNamedLocation the new object to create
     * @return the created CountryNamedLocation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    CountryNamedLocation post(final CountryNamedLocation newCountryNamedLocation) throws ClientException;

    /**
     * Posts a CountryNamedLocation with a new object
     *
     * @param newCountryNamedLocation the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final CountryNamedLocation newCountryNamedLocation, final ICallback<? super CountryNamedLocation> callback);

    /**
     * Posts a CountryNamedLocation with a new object
     *
     * @param newCountryNamedLocation the object to create/update
     * @return the created CountryNamedLocation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    CountryNamedLocation put(final CountryNamedLocation newCountryNamedLocation) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ICountryNamedLocationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ICountryNamedLocationRequest expand(final String value);

}
