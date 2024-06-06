
# Client Class Documentation

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `httpClientConfig` | [`Consumer<HttpClientConfiguration.Builder>`](http-client-configuration-builder.md) | Set up Http Client Configuration instance. |
| `mppTokenCredentials` | [`MppTokenCredentials`]($a/custom-header-signature.md) | The Credentials Setter for Custom Header Signature |
| `oAuthTokenPostCredentials` | [`OAuthTokenPostCredentials`]($a/custom-header-signature-1.md) | The Credentials Setter for Custom Header Signature |

The API client can be initialized as follows:

```java
ShellEVClient client = new ShellEVClient.Builder()
    .httpClientConfig(configBuilder -> configBuilder
            .timeout(0))
    .mppTokenCredentials(new MppTokenModel.Builder(
            "Authorization"
        )
        .build())
    .oAuthTokenPostCredentials(new OAuthTokenPostModel.Builder(
            "X-Apigee-Authorization"
        )
        .build())
    .build();
```

## Shell EVClient Class

The gateway for the SDK. This class acts as a factory for the Controllers and also holds the configuration of the SDK.

### Controllers

| Name | Description | Return Type |
|  --- | --- | --- |
| `getShellAPIPlatformSecurityAuthenticationController()` | Provides access to ShellAPIPlatformSecurityAuthentication controller. | `ShellAPIPlatformSecurityAuthenticationController` |
| `getDigitalPaymentEnablementController()` | Provides access to DigitalPaymentEnablement controller. | `DigitalPaymentEnablementController` |
| `getStationLocatorController()` | Provides access to StationLocator controller. | `StationLocatorController` |
| `getFuelingController()` | Provides access to Fueling controller. | `FuelingController` |
| `getPartnerNotificationController()` | Provides access to PartnerNotification controller. | `PartnerNotificationController` |

### Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `shutdown()` | Shutdown the underlying HttpClient instance. | `void` |
| `getEnvironment()` | Current API environment. | `Environment` |
| `getHttpClient()` | The HTTP Client instance to use for making HTTP requests. | `HttpClient` |
| `getHttpClientConfig()` | Http Client Configuration instance. | [`ReadonlyHttpClientConfiguration`](http-client-configuration.md) |
| `getMppTokenCredentials()` | The credentials to use with MppToken. | [`MppTokenCredentials`]($a/custom-header-signature.md) |
| `getOAuthTokenPostCredentials()` | The credentials to use with OAuthTokenPost. | [`OAuthTokenPostCredentials`]($a/custom-header-signature-1.md) |
| `getBaseUri(Server server)` | Get base URI by current environment | `String` |
| `getBaseUri()` | Get base URI by current environment | `String` |

