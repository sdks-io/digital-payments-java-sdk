# Partner Notification

```java
PartnerNotificationController partnerNotificationController = client.getPartnerNotificationController();
```

## Class Name

`PartnerNotificationController`

## Methods

* [Partner Token](../../doc/controllers/partner-notification.md#partner-token)
* [Finalise Fueling](../../doc/controllers/partner-notification.md#finalise-fueling)
* [Cancel Fueling](../../doc/controllers/partner-notification.md#cancel-fueling)


# Partner Token

To access the Partner’s endpoints, for sending callback messages, Shell will need to connect to the Partner API end points. It is recemmended that the partner offers OAuth 2.0 as a standard for call back APIs and will require the OAuth 2.0 token for authentication. Note this needs to be implemented over HTTPS

:information_source: **Note** This endpoint does not require authentication.

```java
CompletableFuture<AccessTokenResponse> partnerTokenAsync(
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

partnerNotificationController.partnerTokenAsync(grantType, clientId, clientSecret).thenAccept(result -> {
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


# Finalise Fueling

Enables Shell to inform partner of the successful completion of a transaction. Note this needs to be implemented over HTTPS

:information_source: **Note** This endpoint does not require authentication.

```java
CompletableFuture<Void> finaliseFuelingAsync(
    final FinaliseFuelingRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`FinaliseFuelingRequest`](../../doc/models/finalise-fueling-request.md) | Body, Optional | - |

## Response Type

`void`

## Example Usage

```java
FinaliseFuelingRequest body = new FinaliseFuelingRequest.Builder()
    .siteName("Pentahof Site B 9997")
    .timestamp(1548429960631L)
    .volumeQuantity(10.4D)
    .volumeUnit("LTR")
    .finalPrice(23.3D)
    .currency("GBP")
    .status("FINISHED")
    .siteAddress("Test Geman Address")
    .originalPrice(23.3D)
    .discount(0D)
    .mppTransactionId("000000006KCC")
    .build();

partnerNotificationController.finaliseFuelingAsync(body).thenAccept(result -> {
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
| 400 | Bad Request | `ApiException` |
| 401 | Unauthorized | `ApiException` |


# Cancel Fueling

Enables Shell to inform partner that a Mobile Payment transaction has been cancelled by Shell as an error/issue occured. Note this needs to be implemented over HTTPS

:information_source: **Note** This endpoint does not require authentication.

```java
CompletableFuture<Void> cancelFuelingAsync(
    final CancelFuelingRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`CancelFuelingRequest`](../../doc/models/cancel-fueling-request.md) | Body, Optional | - |

## Response Type

`void`

## Example Usage

```java
CancelFuelingRequest body = new CancelFuelingRequest.Builder()
    .mppTransactionId("000000001E5M")
    .reasonCode("CANCELLED")
    .build();

partnerNotificationController.cancelFuelingAsync(body).thenAccept(result -> {
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
| 400 | Bad Request | `ApiException` |
| 401 | Unauthorized | `ApiException` |

