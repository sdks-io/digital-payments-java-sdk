
# Around Location Array Data Items Loc

Object containing address details/elements

## Structure

`AroundLocationArrayDataItemsLoc`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Street` | `String` | Optional | The station’s full street address, including building number | String getStreet() | setStreet(String street) |
| `Pc` | `String` | Optional | The station’s postcode | String getPc() | setPc(String pc) |
| `City` | `String` | Optional | The city the station is located within | String getCity() | setCity(String city) |
| `Region` | `String` | Optional | The region the station is located within | String getRegion() | setRegion(String region) |
| `Country` | `String` | Required | The name of the country (in English) the station is located within | String getCountry() | setCountry(String country) |
| `Ccode` | `String` | Required | The two-letter ISO 3166 country code of the country the station is located within | String getCcode() | setCcode(String ccode) |

## Example (as JSON)

```json
{
  "street": "80/2 Outer Ring Road.",
  "pc": "560037",
  "city": "Bangalore",
  "region": "Karnataka",
  "country": "India",
  "ccode": "IN"
}
```

