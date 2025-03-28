
# Prepare Fueling Response

The response of prepare fueling returns

## Structure

`PrepareFuelingResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `MppTransactionId` | `String` | Required | The unique identifier of the Order. NB at this stage the Customer hasn’t actually bought anything so there’s no formal transaction associated with the Order. A transaction is not processed until refuelling has been completed successfully and will be triggered by returning the nozzle to the pump. | String getMppTransactionId() | setMppTransactionId(String mppTransactionId) |
| `Products` | `List<String>` | Optional | An array of Strings that contain the list of products that the user can purchase at the specified Station/Pump. The text is localized based on the country. | List<String> getProducts() | setProducts(List<String> products) |

## Example (as JSON)

```json
{
  "mppTransactionId": "000000001C48",
  "products": [
    "products4",
    "products5"
  ]
}
```

