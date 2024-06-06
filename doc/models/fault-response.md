
# Fault Response

An error response.

## Structure

`FaultResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Fault` | [`FaultResponseFault`](../../doc/models/fault-response-fault.md) | Optional | - | FaultResponseFault getFault() | setFault(FaultResponseFault fault) |

## Example (as JSON)

```json
{
  "fault": {
    "faultstring": "faultstring2",
    "detail": {
      "errorcode": "errorcode6"
    }
  }
}
```

