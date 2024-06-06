
# Finalise Fueling Request

## Structure

`FinaliseFuelingRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SiteName` | `String` | Optional | - | String getSiteName() | setSiteName(String siteName) |
| `Timestamp` | `Long` | Optional | - | Long getTimestamp() | setTimestamp(Long timestamp) |
| `VolumeQuantity` | `Double` | Optional | - | Double getVolumeQuantity() | setVolumeQuantity(Double volumeQuantity) |
| `VolumeUnit` | `String` | Optional | - | String getVolumeUnit() | setVolumeUnit(String volumeUnit) |
| `FinalPrice` | `Double` | Optional | - | Double getFinalPrice() | setFinalPrice(Double finalPrice) |
| `Currency` | `String` | Optional | - | String getCurrency() | setCurrency(String currency) |
| `Status` | `String` | Optional | - | String getStatus() | setStatus(String status) |
| `SiteAddress` | `String` | Optional | - | String getSiteAddress() | setSiteAddress(String siteAddress) |
| `OriginalPrice` | `Double` | Optional | - | Double getOriginalPrice() | setOriginalPrice(Double originalPrice) |
| `Discount` | `Double` | Optional | - | Double getDiscount() | setDiscount(Double discount) |
| `Payment` | [`FinaliseFuelingRequestPayment`](../../doc/models/finalise-fueling-request-payment.md) | Optional | - | FinaliseFuelingRequestPayment getPayment() | setPayment(FinaliseFuelingRequestPayment payment) |
| `Products` | [`List<FinaliseFuelingRequestProductsItems>`](../../doc/models/finalise-fueling-request-products-items.md) | Optional | - | List<FinaliseFuelingRequestProductsItems> getProducts() | setProducts(List<FinaliseFuelingRequestProductsItems> products) |
| `MppTransactionId` | `String` | Optional | - | String getMppTransactionId() | setMppTransactionId(String mppTransactionId) |

## Example (as JSON)

```json
{
  "siteName": "Pentahof Site B 9997",
  "timestamp": 1548429960631,
  "volumeQuantity": 10.4,
  "volumeUnit": "LTR",
  "finalPrice": 23.3,
  "currency": "GBP",
  "status": "FINISHED",
  "siteAddress": "Test Geman Address",
  "originalPrice": 23.3,
  "discount": 0,
  "mppTransactionId": "000000006KCC"
}
```

