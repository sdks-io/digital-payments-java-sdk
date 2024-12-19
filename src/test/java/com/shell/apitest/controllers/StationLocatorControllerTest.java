/*
 * ShellSmartPayAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.shell.apitest.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.shell.apitest.ApiHelper;
import com.shell.apitest.ShellSmartPayAPIClient;
import com.shell.apitest.exceptions.ApiException;
import io.apimatic.core.utilities.TestHelper;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class StationLocatorControllerTest extends BaseControllerTest {

    /**
     * Client instance.
     */
    private static ShellSmartPayAPIClient client;
    
    /**
     * Controller instance (for all tests).
     */
    private static StationLocatorController controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getStationLocatorController();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

    /**
     * Returns all sites within specified radius of specified GPS location. Sites of all Types are
     * returned. This call must be used when attempting to establish the station the user is located
     * at as part of fuelling journey (i.e. user has to be within 300m of station to be considered
     * located at the station). This API could also be used as a general query to find nearby Shell
     * locations.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestStationlocatorV1StationsGetAroundLocation() throws Exception {
        // Parameters for the API call
        String m = 
                "aroundLocation";
        double lon = 77.6730103d;
        double lat = 12.9132169d;
        double radius = 0.3d;
        String offerCode = null;
        Integer n = null;
        List<String> amenities = null;
        List<String> countries = null;

        // Set callback and perform API call
        try {
            controller.stationlocatorV1StationsGetAroundLocation(m, lon, lat, radius, offerCode, n, amenities, countries);
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
