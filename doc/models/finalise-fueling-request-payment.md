
# Finalise Fueling Request Payment

## Structure

`FinaliseFuelingRequestPayment`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Method` | `String` | Optional | - | String getMethod() | setMethod(String method) |
| `CardId` | `String` | Optional | - | String getCardId() | setCardId(String cardId) |
| `CardLastDigits` | `String` | Optional | - | String getCardLastDigits() | setCardLastDigits(String cardLastDigits) |

## Example (as JSON)

```json
{
  "method": "euroShell",
  "cardId": "14661c58-4662-11e9-b210-d663bd873d93",
  "cardLastDigits": "1234"
}
```

