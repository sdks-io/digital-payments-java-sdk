
# Mpp Acces Token Response

## Structure

`MppAccesTokenResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccessToken` | `String` | Optional | It is the token used in the requests that required to authenticate an user. | String getAccessToken() | setAccessToken(String accessToken) |
| `TokenType` | `String` | Optional | type of token provided<br>**Default**: `"bearer"` | String getTokenType() | setTokenType(String tokenType) |
| `ExpiresIn` | `Long` | Optional | validity of the access token in seconds | Long getExpiresIn() | setExpiresIn(Long expiresIn) |
| `Scope` | `String` | Optional | scope for the authentication protocol<br>**Default**: `"basic openid"` | String getScope() | setScope(String scope) |

## Example (as JSON)

```json
{
  "access_token": "zn2GcAQugJQRJXcGXsmHZ8LMqVde",
  "token_type": "bearer",
  "expires_in": 3599,
  "scope": "basic openid"
}
```

