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
    final List<String> countries,
    final TypeEnum type)
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
| `type` | [`TypeEnum`](../../doc/models/type-enum.md) | Query, Optional | All fuel stations are of at least one Type, indicating whether it is Shell-branded or not, and if the station can be used by trucks. Note that a station can have more than one Type (e.g. Shell retail sites (Type=0) can also be truck friendly (Type=2)).<br><br>Type values are as follows:<br><br>* 0 = Shell owned/branded stations that are not also Type=2 or Type=3<br>* 1 = Partner stations accepting Shell Card<br>* 2 = Shell owned/branded stations that are truck friendly but not Type=3<br>* 3 = Shell owned/branded stations that are truck only<br>  <br/>**When type is not provided, API will return type 0 and 2 only.** |

## Response Type

[`AroundLocationArray`](../../doc/models/around-location-array.md)

## Example Usage

```java
String m = "aroundLocation";
double lon = 77.6730103D;
double lat = 12.9132169D;
double radius = 0.3D;

stationLocatorController.stationlocatorV1StationsGetAroundLocationAsync(m, lon, lat, radius, null, null, null, null, null).thenAccept(result -> {
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

