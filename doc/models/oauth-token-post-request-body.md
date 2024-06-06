
# Oauth Token Post Request Body

## Structure

`OauthTokenPostRequestBody`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `GrantType` | `String` | Required | In OAuth 2.0, the term grant typee refers to the way an application gets an access token. OAuth 2.0 defines several grant types, including the authorization code flow.<br>**Default**: `"client_credentials"` | String getGrantType() | setGrantType(String grantType) |
| `ClientId` | `String` | Required | After registering your app, you will receive a client ID and a client secret. The client ID is considered public information, and is used to build login URLs, or included in Javascript source code on a page.<br>**Default**: `"SOFflRakNlwnWlxfOXQ4GHDVyqGawuKA"` | String getClientId() | setClientId(String clientId) |
| `ClientSecret` | `String` | Required | After registering your app, you will receive a client ID and a client secret. The client ID is considered public information, and is used to build login URLs, or included in Javascript source code on a page. The client secret must be kept confidential.<br>**Default**: `"cRnWgw7gACqM3gVS"` | String getClientSecret() | setClientSecret(String clientSecret) |

## Example (as JSON)

```json
{
  "grant_type": "client_credentials",
  "client_id": "SOFflRakNlwnWlxfOXQ4GHDVyqGawuKA",
  "client_secret": "cRnWgw7gACqM3gVS"
}
```

