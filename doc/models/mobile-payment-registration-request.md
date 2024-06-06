
# Mobile Payment Registration Request

## Structure

`MobilePaymentRegistrationRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ReferenceId` | `String` | Required | Unique Reference ID the DPAN is registered to. The Reference ID has been implemented to accept normal alphanumeric characters plus the following ‘special characters’&colon;  dot, underscore and hyphen. The following characters are not acceptable&colon; , / @ !  &num; & * () | String getReferenceId() | setReferenceId(String referenceId) |
| `Pan` | `String` | Required | Original card PAN (generated on creation of Card (see Card Order Service)) | String getPan() | setPan(String pan) |
| `PanExpiry` | `String` | Required | Expiry Date associated with the PAN in format YYMM. | String getPanExpiry() | setPanExpiry(String panExpiry) |
| `Period` | `int` | Required | Specifies how many months the DPAN should be valid for. If not present, the Token Server determines the expiry date using its default algorithm. Note that the Token Server might not respect this value and use configured business rules to override the requested validity period | int getPeriod() | setPeriod(int period) |
| `AccountId` | `String` | Required | In Shell, a Payer can have several accounts (representing company branches, divisions or generally different cost-centers that a customer wants to group cards on). You can specify this property or the AccountNumber. | String getAccountId() | setAccountId(String accountId) |
| `PayerId` | `String` | Required | The Payer Id, or the Customer Id of the Payment Customer. In Shell, a Payer is a customer belonging to a specific market geography. A Payer can have several Accounts; each account can then have different groups of cards. | String getPayerId() | setPayerId(String payerId) |
| `ColCoId` | `String` | Required | The ID of the Collecting Company (in GFN), also known as Shell Code of the selected payer. This property is mandatory if the ColCoCode code is not passed | String getColCoId() | setColCoId(String colCoId) |
| `CollectingCompanies` | [`List<CollectingCompany>`](../../doc/models/collecting-company.md) | Required | Array of Colco Ids | List<CollectingCompany> getCollectingCompanies() | setCollectingCompanies(List<CollectingCompany> collectingCompanies) |

## Example (as JSON)

```json
{
  "referenceId": "caa29807-6fa7-4801-87bb-dd975e2cbf41",
  "pan": "7077141290120180000",
  "panExpiry": "2101",
  "period": 3,
  "AccountId": "8682",
  "PayerId": "8682",
  "ColCoId": "32",
  "CollectingCompanies": [
    {
      "ColCoId": "32"
    }
  ]
}
```

