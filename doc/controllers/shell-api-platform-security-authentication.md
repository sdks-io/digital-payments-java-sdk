# Shell API Platform Security Authentication

```java
ShellAPIPlatformSecurityAuthenticationController shellAPIPlatformSecurityAuthenticationController = client.getShellAPIPlatformSecurityAuthenticationController();
```

## Class Name

`ShellAPIPlatformSecurityAuthenticationController`


# Oauth Token Post

To obtain APIGEE access token

:information_source: **Note** This endpoint does not require authentication.

```java
CompletableFuture<AccessTokenResponse> oauthTokenPostAsync(
    final String grantType,
    final String clientId,
    final String clientSecret)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `grantType` | `String` | Form, Required | In OAuth 2.0, the term grant typee refers to the way an application gets an access token. OAuth 2.0 defines several grant types, including the authorization code flow. |
| `clientId` | `String` | Form, Required | After registering your app, you will receive a client ID and a client secret. The client ID is considered public information, and is used to build login URLs, or included in Javascript source code on a page. |
| `clientSecret` | `String` | Form, Required | After registering your app, you will receive a client ID and a client secret. The client ID is considered public information, and is used to build login URLs, or included in Javascript source code on a page. The client secret must be kept confidential. |

## Response Type

[`AccessTokenResponse`](../../doc/models/access-token-response.md)

## Example Usage

```java
String grantType = "client_credentials";
String clientId = "SOFflRakNlwnWlxfOXQ4GHDVyqGawuKA";
String clientSecret = "cRnWgw7gACqM3gVS";

shellAPIPlatformSecurityAuthenticationController.oauthTokenPostAsync(grantType, clientId, clientSecret).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Unauthorized | [`AccessTokenErrorException`](../../doc/models/access-token-error-exception.md) |

