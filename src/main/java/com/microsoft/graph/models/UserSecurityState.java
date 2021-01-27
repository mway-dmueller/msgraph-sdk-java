// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.EmailRole;
import com.microsoft.graph.models.LogonType;
import com.microsoft.graph.models.UserAccountSecurityType;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Security State.
 */
public class UserSecurityState implements IJsonBackedObject {

    /** the OData type of the object as returned by the service */
    @SerializedName("@odata.type")
    @Expose
    @Nullable
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    @Nonnull
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Aad User Id.
     * AAD User object identifier (GUID) - represents the physical/multi-account user entity.
     */
    @SerializedName(value = "aadUserId", alternate = {"AadUserId"})
    @Expose
	@Nullable
    public String aadUserId;

    /**
     * The Account Name.
     * Account name of user account (without Active Directory domain or DNS domain) - (also called mailNickName).
     */
    @SerializedName(value = "accountName", alternate = {"AccountName"})
    @Expose
	@Nullable
    public String accountName;

    /**
     * The Domain Name.
     * NetBIOS/Active Directory domain of user account (that is, domain/account format).
     */
    @SerializedName(value = "domainName", alternate = {"DomainName"})
    @Expose
	@Nullable
    public String domainName;

    /**
     * The Email Role.
     * For email-related alerts - user account's email 'role'. Possible values are: unknown, sender, recipient.
     */
    @SerializedName(value = "emailRole", alternate = {"EmailRole"})
    @Expose
	@Nullable
    public EmailRole emailRole;

    /**
     * The Is Vpn.
     * Indicates whether the user logged on through a VPN.
     */
    @SerializedName(value = "isVpn", alternate = {"IsVpn"})
    @Expose
	@Nullable
    public Boolean isVpn;

    /**
     * The Logon Date Time.
     * Time at which the sign-in occurred. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'.
     */
    @SerializedName(value = "logonDateTime", alternate = {"LogonDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime logonDateTime;

    /**
     * The Logon Id.
     * User sign-in ID.
     */
    @SerializedName(value = "logonId", alternate = {"LogonId"})
    @Expose
	@Nullable
    public String logonId;

    /**
     * The Logon Ip.
     * IP Address the sign-in request originated from.
     */
    @SerializedName(value = "logonIp", alternate = {"LogonIp"})
    @Expose
	@Nullable
    public String logonIp;

    /**
     * The Logon Location.
     * Location (by IP address mapping) associated with a user sign-in event by this user.
     */
    @SerializedName(value = "logonLocation", alternate = {"LogonLocation"})
    @Expose
	@Nullable
    public String logonLocation;

    /**
     * The Logon Type.
     * Method of user sign in. Possible values are: unknown, interactive, remoteInteractive, network, batch, service.
     */
    @SerializedName(value = "logonType", alternate = {"LogonType"})
    @Expose
	@Nullable
    public LogonType logonType;

    /**
     * The On Premises Security Identifier.
     * Active Directory (on-premises) Security Identifier (SID) of the user.
     */
    @SerializedName(value = "onPremisesSecurityIdentifier", alternate = {"OnPremisesSecurityIdentifier"})
    @Expose
	@Nullable
    public String onPremisesSecurityIdentifier;

    /**
     * The Risk Score.
     * Provider-generated/calculated risk score of the user account. Recommended value range of 0-1, which equates to a percentage.
     */
    @SerializedName(value = "riskScore", alternate = {"RiskScore"})
    @Expose
	@Nullable
    public String riskScore;

    /**
     * The User Account Type.
     * User account type (group membership), per Windows definition. Possible values are: unknown, standard, power, administrator.
     */
    @SerializedName(value = "userAccountType", alternate = {"UserAccountType"})
    @Expose
	@Nullable
    public UserAccountSecurityType userAccountType;

    /**
     * The User Principal Name.
     * User sign-in name - internet format: (user account name)@(user account DNS domain name).
     */
    @SerializedName(value = "userPrincipalName", alternate = {"UserPrincipalName"})
    @Expose
	@Nullable
    public String userPrincipalName;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    @Nullable
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
	@Override
    @Nullable
    public ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}