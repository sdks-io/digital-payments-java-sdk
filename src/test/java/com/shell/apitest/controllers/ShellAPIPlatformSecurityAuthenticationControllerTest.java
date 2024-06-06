/*
 * ShellEVLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.shell.apitest.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.shell.apitest.ShellEVClient;
import com.shell.apitest.exceptions.ApiException;
import io.apimatic.core.utilities.TestHelper;
import java.util.LinkedHashMap;
import java.util.Map;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class ShellAPIPlatformSecurityAuthenticationControllerTest extends BaseControllerTest {

    /**
     * Client instance.
     */
    private static ShellEVClient client;
    
    /**
     * Controller instance (for all tests).
     */
    private static ShellAPIPlatformSecurityAuthenticationController controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getShellAPIPlatformSecurityAuthenticationController();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

    /**
     * To obtain APIGEE access token.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestOauthTokenPost() throws Exception {
        // Parameters for the API call
        String grantType = 
                "client_credentials";
        String clientId = 
                "SOFflRakNlwnWlxfOXQ4GHDVyqGawuKA";
        String clientSecret = 
                "cRnWgw7gACqM3gVS";

        // Set callback and perform API call
        try {
            controller.oauthTokenPost(grantType, clientId, clientSecret);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test headers
        Map<String, String> headers = new LinkedHashMap<String, String>();
        headers.put("Content-Type", "application/json");
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders().asSimpleMap(), true));

    }

}
