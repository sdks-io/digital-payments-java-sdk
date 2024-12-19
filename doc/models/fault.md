
# Fault

## Structure

`Fault`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Faultstring` | `String` | Optional | The description of the error. | String getFaultstring() | setFaultstring(String faultstring) |
| `Detail` | [`Detail`](../../doc/models/detail.md) | Optional | - | Detail getDetail() | setDetail(Detail detail) |

## Example (as JSON)

```json
{
  "faultstring": "Invalid ApiKey for given resource",
  "detail": {
    "errorcode": "errorcode6"
  }
}
```

