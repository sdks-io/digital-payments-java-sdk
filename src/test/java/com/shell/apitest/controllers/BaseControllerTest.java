/*
 * ShellSmartPayAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.shell.apitest.controllers;

import com.shell.apitest.Environment;
import com.shell.apitest.ShellSmartPayAPIClient;
import com.shell.apitest.authentication.MppTokenModel;
import com.shell.apitest.authentication.OAuthTokenPostModel;
import com.shell.apitest.testing.HttpCallbackCatcher;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.rules.Timeout;

/**
 * Base class for all test cases.
 */
public class BaseControllerTest {
    /**
     * Test configuration.
     */
    public static final int REQUEST_TIMEOUT = 30;

    public static final double ASSERT_PRECISION = 0.01;
    
    /**
     * Global rules for tests.
     */
    @Rule
    public Timeout globalTimeout = Timeout.seconds(REQUEST_TIMEOUT);
    
    /**
     * Test fixtures,
     * Used to serve as HttpCallback and to capture request & response.
     */

    protected static HttpCallbackCatcher httpResponse;
    
    /**
     * Setup test.
     */
    @BeforeClass
    public static void setUp() throws Exception {
        httpResponse = new HttpCallbackCatcher(); 
    }

    /**
     * Tear down test.
     */
    @AfterClass
    public static void tearDown() throws Exception {
        httpResponse = null;
    }

    /**
     * Create test configuration from Environment variables.
     */
    protected static ShellSmartPayAPIClient createConfigurationFromEnvironment() {
        ShellSmartPayAPIClient.Builder builder = new ShellSmartPayAPIClient.Builder();

        final String environment = System.getenv("SHELL_SMART_PAY_API_LIB_ENVIRONMENT");
        final String timeout = System.getenv("SHELL_SMART_PAY_API_LIB_TIMEOUT");
        final String authorization = System.getenv("SHELL_SMART_PAY_API_LIB_AUTHORIZATION");
        final String xApigeeAuthorization =
                System.getenv("SHELL_SMART_PAY_API_LIB_X_APIGEE_AUTHORIZATION");

        if (authorization != null) {
            builder.mppTokenCredentials(new MppTokenModel
                    .Builder(authorization)
                    .build());
        }
        if (xApigeeAuthorization != null) {
            builder.oAuthTokenPostCredentials(new OAuthTokenPostModel
                    .Builder(xApigeeAuthorization)
                    .build());
        }
        if (environment != null) {
            builder.environment(Environment.fromString(environment));
        }
        if (timeout != null) {
            builder.httpClientConfig(configBuilder -> configBuilder.timeout(
                    Long.parseLong(timeout)));
        }
        return builder.build();
    }

    
    /**
     * Create test configuration.
     */
    protected static ShellSmartPayAPIClient createConfiguration() {
        // Set Configuration parameters for test execution
        ShellSmartPayAPIClient config = createConfigurationFromEnvironment();
        config = config.newBuilder()
                .httpCallback(httpResponse)
                .build();
        return config;
    }
}
