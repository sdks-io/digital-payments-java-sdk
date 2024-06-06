
# Cancel Fueling Request

## Structure

`CancelFuelingRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `MppTransactionId` | `String` | Optional | - | String getMppTransactionId() | setMppTransactionId(String mppTransactionId) |
| `ReasonCode` | `String` | Optional | - | String getReasonCode() | setReasonCode(String reasonCode) |

## Example (as JSON)

```json
{
  "mppTransactionId": "000000001E5M",
  "reasonCode": "CANCELLED"
}
```

