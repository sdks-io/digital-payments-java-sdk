/*
 * ShellSmartPayAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.shell.apitest.controllers;

import com.shell.apitest.ApiHelper;
import com.shell.apitest.Server;
import com.shell.apitest.exceptions.ApiException;
import com.shell.apitest.exceptions.StationLocatorBadRequestException;
import com.shell.apitest.exceptions.StationLocatorForbiddenException;
import com.shell.apitest.exceptions.StationLocatorInternalServerErrorException;
import com.shell.apitest.exceptions.StationLocatorNotFoundException;
import com.shell.apitest.exceptions.StationLocatorUnauthorizedException;
import com.shell.apitest.http.request.HttpMethod;
import com.shell.apitest.models.AroundLocationArray;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class StationLocatorController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public StationLocatorController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Returns all sites within specified radius of specified GPS location. Sites of all Types are
     * returned. This call must be used when attempting to establish the station the user is located
     * at as part of fuelling journey (i.e. user has to be within 300m of station to be considered
     * located at the station). This API could also be used as a general query to find nearby Shell
     * locations.
     * @param  m  Required parameter: API Method to be executed
     * @param  lon  Required parameter: The user’s current longitude
     * @param  lat  Required parameter: The user’s current latitude
     * @param  radius  Required parameter: The search radius in kilometers
     * @param  offerCode  Optional parameter: This enables requestor to specify locations that will
     *         honour the specified (advanced) offer code
     * @param  n  Optional parameter: This enables requestor to limit the number of locations that
     *         are returned and defaulted to a maximum of 250 locations. Locations returned based on
     *         distance to User’s location as-the-crow-flies.
     * @param  amenities  Optional parameter: This enables requestor to filter locations based on
     *         one or more amenities (e.g. Filter locations so that only those with a Toilet are
     *         returned).
     * @param  countries  Optional parameter: This enables requestor to filter locations based on
     *         one or more Countries (i.e. by country codes).
     * @return    Returns the AroundLocationArray response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public AroundLocationArray stationlocatorV1StationsGetAroundLocation(
            final String m,
            final double lon,
            final double lat,
            final double radius,
            final String offerCode,
            final Integer n,
            final List<String> amenities,
            final List<String> countries) throws ApiException, IOException {
        return prepareStationlocatorV1StationsGetAroundLocationRequest(m, lon, lat, radius,
                offerCode, n, amenities, countries).execute();
    }

    /**
     * Returns all sites within specified radius of specified GPS location. Sites of all Types are
     * returned. This call must be used when attempting to establish the station the user is located
     * at as part of fuelling journey (i.e. user has to be within 300m of station to be considered
     * located at the station). This API could also be used as a general query to find nearby Shell
     * locations.
     * @param  m  Required parameter: API Method to be executed
     * @param  lon  Required parameter: The user’s current longitude
     * @param  lat  Required parameter: The user’s current latitude
     * @param  radius  Required parameter: The search radius in kilometers
     * @param  offerCode  Optional parameter: This enables requestor to specify locations that will
     *         honour the specified (advanced) offer code
     * @param  n  Optional parameter: This enables requestor to limit the number of locations that
     *         are returned and defaulted to a maximum of 250 locations. Locations returned based on
     *         distance to User’s location as-the-crow-flies.
     * @param  amenities  Optional parameter: This enables requestor to filter locations based on
     *         one or more amenities (e.g. Filter locations so that only those with a Toilet are
     *         returned).
     * @param  countries  Optional parameter: This enables requestor to filter locations based on
     *         one or more Countries (i.e. by country codes).
     * @return    Returns the AroundLocationArray response from the API call
     */
    public CompletableFuture<AroundLocationArray> stationlocatorV1StationsGetAroundLocationAsync(
            final String m,
            final double lon,
            final double lat,
            final double radius,
            final String offerCode,
            final Integer n,
            final List<String> amenities,
            final List<String> countries) {
        try { 
            return prepareStationlocatorV1StationsGetAroundLocationRequest(m, lon, lat, radius, offerCode,
            n, amenities, countries).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for stationlocatorV1StationsGetAroundLocation.
     */
    private ApiCall<AroundLocationArray, ApiException> prepareStationlocatorV1StationsGetAroundLocationRequest(
            final String m,
            final double lon,
            final double lat,
            final double radius,
            final String offerCode,
            final Integer n,
            final List<String> amenities,
            final List<String> countries) throws IOException {
        return new ApiCall.Builder<AroundLocationArray, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.SHELL.value())
                        .path("/SiteData/v1/stations")
                        .queryParam(param -> param.key("m")
                                .value(m))
                        .queryParam(param -> param.key("lon")
                                .value(lon).isRequired(false))
                        .queryParam(param -> param.key("lat")
                                .value(lat).isRequired(false))
                        .queryParam(param -> param.key("radius")
                                .value(radius).isRequired(false))
                        .queryParam(param -> param.key("offer_code")
                                .value(offerCode).isRequired(false))
                        .queryParam(param -> param.key("n")
                                .value(n).isRequired(false))
                        .queryParam(param -> param.key("amenities")
                                .value(amenities).isRequired(false))
                        .queryParam(param -> param.key("countries")
                                .value(countries).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("oAuthTokenPost"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, AroundLocationArray.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Bad request",
                                (reason, context) -> new StationLocatorBadRequestException(reason, context)))
                        .localErrorCase("401",
                                 ErrorCase.setReason("Unauthorized",
                                (reason, context) -> new StationLocatorUnauthorizedException(reason, context)))
                        .localErrorCase("403",
                                 ErrorCase.setReason("Forbbiden",
                                (reason, context) -> new StationLocatorForbiddenException(reason, context)))
                        .localErrorCase("404",
                                 ErrorCase.setReason("Not Found",
                                (reason, context) -> new StationLocatorNotFoundException(reason, context)))
                        .localErrorCase("500",
                                 ErrorCase.setReason("Internal Server Error",
                                (reason, context) -> new StationLocatorInternalServerErrorException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}