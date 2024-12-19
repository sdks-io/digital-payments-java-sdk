/*
 * ShellSmartPayAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.shell.apitest.controllers;

import com.shell.apitest.ApiHelper;
import com.shell.apitest.Server;
import com.shell.apitest.exceptions.AccessTokenErrorException;
import com.shell.apitest.exceptions.ApiException;
import com.shell.apitest.http.request.HttpMethod;
import com.shell.apitest.models.AccessTokenResponse;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class ShellAPIPlatformSecurityAuthenticationController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public ShellAPIPlatformSecurityAuthenticationController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * To obtain APIGEE access token.
     * @param  grantType  Required parameter: In OAuth 2.0, the term grant typee refers to the way
     *         an application gets an access token. OAuth 2.0 defines several grant types, including
     *         the authorization code flow.
     * @param  clientId  Required parameter: After registering your app, you will receive a client
     *         ID and a client secret. The client ID is considered public information, and is used
     *         to build login URLs, or included in Javascript source code on a page.
     * @param  clientSecret  Required parameter: After registering your app, you will receive a
     *         client ID and a client secret. The client ID is considered public information, and is
     *         used to build login URLs, or included in Javascript source code on a page. The client
     *         secret must be kept confidential.
     * @return    Returns the AccessTokenResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public AccessTokenResponse oauthTokenPost(
            final String grantType,
            final String clientId,
            final String clientSecret) throws ApiException, IOException {
        return prepareOauthTokenPostRequest(grantType, clientId, clientSecret).execute();
    }

    /**
     * To obtain APIGEE access token.
     * @param  grantType  Required parameter: In OAuth 2.0, the term grant typee refers to the way
     *         an application gets an access token. OAuth 2.0 defines several grant types, including
     *         the authorization code flow.
     * @param  clientId  Required parameter: After registering your app, you will receive a client
     *         ID and a client secret. The client ID is considered public information, and is used
     *         to build login URLs, or included in Javascript source code on a page.
     * @param  clientSecret  Required parameter: After registering your app, you will receive a
     *         client ID and a client secret. The client ID is considered public information, and is
     *         used to build login URLs, or included in Javascript source code on a page. The client
     *         secret must be kept confidential.
     * @return    Returns the AccessTokenResponse response from the API call
     */
    public CompletableFuture<AccessTokenResponse> oauthTokenPostAsync(
            final String grantType,
            final String clientId,
            final String clientSecret) {
        try { 
            return prepareOauthTokenPostRequest(grantType, clientId, clientSecret).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for oauthTokenPost.
     */
    private ApiCall<AccessTokenResponse, ApiException> prepareOauthTokenPostRequest(
            final String grantType,
            final String clientId,
            final String clientSecret) throws IOException {
        return new ApiCall.Builder<AccessTokenResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.SHELL.value())
                        .path("/oauth/token")
                        .formParam(param -> param.key("grant_type")
                                .value(grantType))
                        .formParam(param -> param.key("client_id")
                                .value(clientId))
                        .formParam(param -> param.key("client_secret")
                                .value(clientSecret))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/x-www-form-urlencoded").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, AccessTokenResponse.class))
                        .nullify404(false)
                        .localErrorCase("401",
                                 ErrorCase.setReason("Unauthorized",
                                (reason, context) -> new AccessTokenErrorException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}