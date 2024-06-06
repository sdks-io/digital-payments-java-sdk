/*
 * ShellEVLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.shell.apitest.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for OauthTokenPostRequestBody type.
 */
public class OauthTokenPostRequestBody {
    private String grantType;
    private String clientId;
    private String clientSecret;

    /**
     * Default constructor.
     */
    public OauthTokenPostRequestBody() {
        grantType = "client_credentials";
        clientId = "SOFflRakNlwnWlxfOXQ4GHDVyqGawuKA";
        clientSecret = "cRnWgw7gACqM3gVS";
    }

    /**
     * Initialization constructor.
     * @param  grantType  String value for grantType.
     * @param  clientId  String value for clientId.
     * @param  clientSecret  String value for clientSecret.
     */
    public OauthTokenPostRequestBody(
            String grantType,
            String clientId,
            String clientSecret) {
        this.grantType = grantType;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }

    /**
     * Getter for GrantType.
     * In OAuth 2.0, the term grant typee refers to the way an application gets an access token.
     * OAuth 2.0 defines several grant types, including the authorization code flow.
     * @return Returns the String
     */
    @JsonGetter("grant_type")
    public String getGrantType() {
        return grantType;
    }

    /**
     * Setter for GrantType.
     * In OAuth 2.0, the term grant typee refers to the way an application gets an access token.
     * OAuth 2.0 defines several grant types, including the authorization code flow.
     * @param grantType Value for String
     */
    @JsonSetter("grant_type")
    public void setGrantType(String grantType) {
        this.grantType = grantType;
    }

    /**
     * Getter for ClientId.
     * After registering your app, you will receive a client ID and a client secret. The client ID
     * is considered public information, and is used to build login URLs, or included in Javascript
     * source code on a page.
     * @return Returns the String
     */
    @JsonGetter("client_id")
    public String getClientId() {
        return clientId;
    }

    /**
     * Setter for ClientId.
     * After registering your app, you will receive a client ID and a client secret. The client ID
     * is considered public information, and is used to build login URLs, or included in Javascript
     * source code on a page.
     * @param clientId Value for String
     */
    @JsonSetter("client_id")
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * Getter for ClientSecret.
     * After registering your app, you will receive a client ID and a client secret. The client ID
     * is considered public information, and is used to build login URLs, or included in Javascript
     * source code on a page. The client secret must be kept confidential.
     * @return Returns the String
     */
    @JsonGetter("client_secret")
    public String getClientSecret() {
        return clientSecret;
    }

    /**
     * Setter for ClientSecret.
     * After registering your app, you will receive a client ID and a client secret. The client ID
     * is considered public information, and is used to build login URLs, or included in Javascript
     * source code on a page. The client secret must be kept confidential.
     * @param clientSecret Value for String
     */
    @JsonSetter("client_secret")
    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    /**
     * Converts this OauthTokenPostRequestBody into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OauthTokenPostRequestBody [" + "grantType=" + grantType + ", clientId=" + clientId
                + ", clientSecret=" + clientSecret + "]";
    }

    /**
     * Builds a new {@link OauthTokenPostRequestBody.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OauthTokenPostRequestBody.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(grantType, clientId, clientSecret);
        return builder;
    }

    /**
     * Class to build instances of {@link OauthTokenPostRequestBody}.
     */
    public static class Builder {
        private String grantType = "client_credentials";
        private String clientId = "SOFflRakNlwnWlxfOXQ4GHDVyqGawuKA";
        private String clientSecret = "cRnWgw7gACqM3gVS";

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  grantType  String value for grantType.
         * @param  clientId  String value for clientId.
         * @param  clientSecret  String value for clientSecret.
         */
        public Builder(String grantType, String clientId, String clientSecret) {
            this.grantType = grantType;
            this.clientId = clientId;
            this.clientSecret = clientSecret;
        }

        /**
         * Setter for grantType.
         * @param  grantType  String value for grantType.
         * @return Builder
         */
        public Builder grantType(String grantType) {
            this.grantType = grantType;
            return this;
        }

        /**
         * Setter for clientId.
         * @param  clientId  String value for clientId.
         * @return Builder
         */
        public Builder clientId(String clientId) {
            this.clientId = clientId;
            return this;
        }

        /**
         * Setter for clientSecret.
         * @param  clientSecret  String value for clientSecret.
         * @return Builder
         */
        public Builder clientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }

        /**
         * Builds a new {@link OauthTokenPostRequestBody} object using the set fields.
         * @return {@link OauthTokenPostRequestBody}
         */
        public OauthTokenPostRequestBody build() {
            return new OauthTokenPostRequestBody(grantType, clientId, clientSecret);
        }
    }
}
