
# Datum

## Structure

`Datum`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | The station’s unique site identifier – this must be ignored | String getId() | setId(String id) |
| `Type` | `Integer` | Optional | All fuel stations are of at least one Type, indicating whether it is Shell-branded or not, and if the<br>station can be used by trucks. Note that a station can have more than one Type (e.g. Shell retail<br>sites (Type=0) can also be truck friendly (Type=2)).<br>Type values are as follows:<br><br>* 0 = Shell owned/branded stations that are not also Type=2 or Type=3<br>* 1 = Partner stations accepting Shell Card<br>* 2 = Shell owned/branded stations that are truck friendly but not Type=3<br>* 3 = Shell owned/branded stations that are truck only | Integer getType() | setType(Integer type) |
| `Name` | `String` | Optional | The name of the site | String getName() | setName(String name) |
| `Addr` | `String` | Optional | The side address as a concatenation of address information | String getAddr() | setAddr(String addr) |
| `Lat` | `Double` | Optional | The site’s latitude | Double getLat() | setLat(Double lat) |
| `Lon` | `Double` | Optional | The site’s longitude | Double getLon() | setLon(Double lon) |
| `Amen` | `List<Integer>` | Optional | An array of amenities available at the station (see above for complete list) | List<Integer> getAmen() | setAmen(List<Integer> amen) |
| `Fuel` | `List<Integer>` | Optional | An array of fuels* available at the station.<br>Global Product Group names:<br><br>* 8 = CNG<br>* 10 = Premium Gasoline<br>* 11 = Premium Diesel<br>* 12 = Fuelsave Midgrade Gasoline<br>* 13 = Fuelsave Regular Diesel<br>* 14 = Midgrade Gasoline<br>* 15 = Low Octane gasoline<br>* 16 = Regular Diesel<br>* 17 = Autogas LPG<br>* 18 = Auto/RV Propane<br>* 20 = Hydrogen<br>* 21 = Kerosene<br>* 22 = Super Premium Gasoline<br>* 23 = Unleaded Super<br>* 24 = Truck Diesel<br>* 25 = Super98<br>* 26 = GTL<br>* 27 = Fuelsave 98<br>* 28 = LNG<br>* 29 = DieselFit<br>* 30 = Shell Recharge<br><br>*An external mapping table may need to be maintained if it is required to display true fuel product names (as visible on the site) | List<Integer> getFuel() | setFuel(List<Integer> fuel) |
| `Loc` | [`Loc`](../../doc/models/loc.md) | Optional | Object containing address details/elements | Loc getLoc() | setLoc(Loc loc) |
| `MppStationId` | `String` | Optional | This is the 5-digit Shell Station ID. Leading ‘0’ should be dropped and only last four digits, should be used. E.G. for ‘00123’, only ‘0123’ should be used and for ‘04567’ only ‘4567’ should be used. | String getMppStationId() | setMppStationId(String mppStationId) |
| `DoubleSiteId` | `String` | Optional | The Mobile Payment Platform recognises a user being located at a Shell Station if their GPS is within 300m of a Shell station. Some locations will return multiple Shell Stations within a 300 meter radius. This is an issue for Mobile Payments as it needs  to accurately identify the station the Customer is located at to ensure the correct pump is released<br><br>In Germany such locations have been identified and each Station has been assigned a unique letter (e.g. A, B, C). These letters are clearly visible at the stations. If a Mobile Payments user is located at such a location, they will need to identify the Station by identifying and specifying the Station’s corresponding letter as part of the refuelling journey.<br><br>The double_site_id is used to store the Stations unique letter/ID value. It’s only populated if/when 1 or more stations are within 300m from this station. | String getDoubleSiteId() | setDoubleSiteId(String doubleSiteId) |
| `OpeningHours` | [`List<OpeningHour>`](../../doc/models/opening-hour.md) | Optional | An Array of the station’s opening hours. This may have opening and closing times in hours, minutes and the day of the week. | List<OpeningHour> getOpeningHours() | setOpeningHours(List<OpeningHour> openingHours) |
| `Telephone` | `String` | Optional | Station’s contact telephone number | String getTelephone() | setTelephone(String telephone) |
| `AuthorisationCode` | `String` | Optional | Station’s authorisation code | String getAuthorisationCode() | setAuthorisationCode(String authorisationCode) |
| `MpPreauth` | `Integer` | Optional | Station’s mobile payment preauthorisation value | Integer getMpPreauth() | setMpPreauth(Integer mpPreauth) |

## Example (as JSON)

```json
{
  "id": "12170818",
  "type": 0,
  "name": "Bellandur",
  "addr": "80/2 Outer Ring Road., Bangalore, Karnataka, 560037, India",
  "lat": 12.923333,
  "lon": 77.671389,
  "amen": [
    19,
    9111,
    5,
    922
  ],
  "fuel": [
    11,
    16
  ],
  "mpp_station_id": "0",
  "double_site_id": "null",
  "telephone": "9611199089",
  "authorisation_code": "null",
  "mp_preauth": 0
}
```

