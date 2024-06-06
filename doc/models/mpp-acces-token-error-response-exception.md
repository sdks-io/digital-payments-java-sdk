
# Mpp Acces Token Error Response Exception

## Structure

`MppAccesTokenErrorResponseException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Error` | `String` | Required | error code or short description | String getError() | setError(String error) |
| `ErrorCode` | `String` | Required | error code or short description due to invalid request or invalid client ID | String getErrorCode() | setErrorCode(String errorCode) |
| `ErrorDescription` | `String` | Optional | Description of the error | String getErrorDescription() | setErrorDescription(String errorDescription) |

## Example (as JSON)

```json
{
  "error": "invalid_request",
  "error_code": "Invalid_client",
  "error_description": "Missing grant type"
}
```

