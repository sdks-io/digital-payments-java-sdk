
# Fault Response Fault

## Structure

`FaultResponseFault`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Faultstring` | `String` | Optional | The description of the error. | String getFaultstring() | setFaultstring(String faultstring) |
| `Detail` | [`FaultResponseFaultDetail`](../../doc/models/fault-response-fault-detail.md) | Optional | - | FaultResponseFaultDetail getDetail() | setDetail(FaultResponseFaultDetail detail) |

## Example (as JSON)

```json
{
  "faultstring": "Invalid ApiKey for given resource",
  "detail": {
    "errorcode": "errorcode6"
  }
}
```

