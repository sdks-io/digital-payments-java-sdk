
# Prepare Fueling Request Device Details Items

## Structure

`PrepareFuelingRequestDeviceDetailsItems`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DeviceId` | `String` | Optional | This is the mobile device’s unique ID (Vendor ID for iOS vs. Android ID for Android). This is only used for transactions made via the Shell Mobile App and will therefore be mandatory for requests originating from Shell’s mobile app but can be ignored by all other parties. | String getDeviceId() | setDeviceId(String deviceId) |
| `Model` | `String` | Optional | This is the mobile device’s model (machine name/systemInfo for iOS vs. Build.MODEL for Android).  This is only used for transactions made via the Shell Mobile App and will therefore be mandatory for requests originating from Shell’s mobile app but can be ignored by all other parties. | String getModel() | setModel(String model) |
| `OsVersion` | `String` | Optional | This is the mobile device’s OS Version. This is only used for transactions made via the Shell Mobile App and will therefore be mandatory for requests originating from Shell’s mobile app but can be ignored by all other parties. | String getOsVersion() | setOsVersion(String osVersion) |
| `OtherDeviceInformation` | `String` | Optional | This is only used for transactions made via Android versions of the Shell Mobile App and will therefore be mandatory for requests originating from Shell’s Android mobile app but can be ignored by all other devices and/or parties.<br>This field is used to capture the Shell App build that was used to make this call. | String getOtherDeviceInformation() | setOtherDeviceInformation(String otherDeviceInformation) |

## Example (as JSON)

```json
{
  "deviceId": "deviceId2",
  "model": "model0",
  "osVersion": "osVersion2",
  "otherDeviceInformation": "otherDeviceInformation2"
}
```

