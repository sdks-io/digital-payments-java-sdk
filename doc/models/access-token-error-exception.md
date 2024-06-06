
# Access Token Error Exception

## Structure

`AccessTokenErrorException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ErrorCode` | `String` | Optional | - | String getErrorCode() | setErrorCode(String errorCode) |
| `Error` | `String` | Optional | - | String getError() | setError(String error) |

## Example (as JSON)

```json
{
  "errorCode": "invalid_client",
  "error": "ClientId is Invalid"
}
```

