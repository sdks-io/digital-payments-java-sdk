
# Access Token Response

## Structure

`AccessTokenResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccessToken` | `String` | Optional | It is the token used for the requests that required an authenticated user. This will be used for all the callback URLs. | String getAccessToken() | setAccessToken(String accessToken) |
| `ExpiresIn` | `String` | Optional | validity of the access token in seconds | String getExpiresIn() | setExpiresIn(String expiresIn) |
| `TokenType` | `String` | Optional | Type of token provided<br>**Default**: `"Bearer"` | String getTokenType() | setTokenType(String tokenType) |

## Example (as JSON)

```json
{
  "access_token": "zn2GcAQugJQRJXcGXsmHZ8LMqVde",
  "expires_in": "3599",
  "token_type": "Bearer"
}
```

