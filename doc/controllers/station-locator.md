# Station Locator

```java
StationLocatorController stationLocatorController = client.getStationLocatorController();
```

## Class Name

`StationLocatorController`


# Stationlocator V1 Stations Get Around Location

Returns all sites within specified radius of specified GPS location. Sites of all Types are returned. This call must be used when attempting to establish the station the user is located at as part of fuelling journey (i.e. user has to be within 300m of station to be considered located at the station). This API could also be used as a general query to find nearby Shell locations

```java
CompletableFuture<AroundLocationArray> stationlocatorV1StationsGetAroundLocationAsync(
    final String m,
    final double lon,
    final double lat,
    final double radius,
    final String offerCode,
    final Integer n,
    final List<String> amenities,
    final List<String> countries)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `m` | `String` | Query, Required | API Method to be executed |
| `lon` | `double` | Query, Required | The user’s current longitude |
| `lat` | `double` | Query, Required | The user’s current latitude |
| `radius` | `double` | Query, Required | The search radius in kilometers |
| `offerCode` | `String` | Query, Optional | This enables requestor to specify locations that will honour the specified (advanced) offer code |
| `n` | `Integer` | Query, Optional | This enables requestor to limit the number of locations that are returned and defaulted to a maximum of 250 locations. Locations returned based on distance to User’s location as-the-crow-flies. |
| `amenities` | `List<String>` | Query, Optional | This enables requestor to filter locations based on one or more amenities (e.g. Filter locations so that only those with a Toilet are returned). |
| `countries` | `List<String>` | Query, Optional | This enables requestor to filter locations based on one or more Countries (i.e. by country codes). |

## Response Type

[`AroundLocationArray`](../../doc/models/around-location-array.md)

## Example Usage

```java
String m = "aroundLocation";
double lon = 77.6730103D;
double lat = 12.9132169D;
double radius = 0.3D;
stationLocatorController.stationlocatorV1StationsGetAroundLocationAsync(m, lon, lat, radius, null, null, null, null).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad request | [`StationLocatorBadRequestException`](../../doc/models/station-locator-bad-request-exception.md) |
| 401 | Unauthorized | [`StationLocatorUnauthorizedException`](../../doc/models/station-locator-unauthorized-exception.md) |
| 403 | Forbbiden | [`StationLocatorForbiddenException`](../../doc/models/station-locator-forbidden-exception.md) |
| 404 | Not Found | [`StationLocatorNotFoundException`](../../doc/models/station-locator-not-found-exception.md) |
| 500 | Internal Server Error | [`StationLocatorInternalServerErrorException`](../../doc/models/station-locator-internal-server-error-exception.md) |

