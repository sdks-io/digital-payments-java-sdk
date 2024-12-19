
# Getting Started with Shell SmartPay API

## Introduction

The APIs detailed within this document will enable Shell's Fleet Solutions Customers to digitalize Shell Card/s and use them to pay to refuel their vehicles at Shell Stations.

## Install the Package

Install the SDK by adding the following dependency in your project's pom.xml file:

```xml
<dependency>
  <groupId>io.sdks</groupId>
  <artifactId>digital-payments-sdk</artifactId>
  <version>1.1.0</version>
</dependency>
```

You can also view the package at:
https://central.sonatype.com/artifact/io.sdks/digital-payments-sdk/1.1.0

## Test the SDK

The generated code and the server can be tested using automatically generated test cases.
JUnit is used as the testing framework and test runner.

In Eclipse, for running the tests do the following:

1. Select the project ShellSmartPayAPILib from the package explorer.
2. Select `Run -> Run as -> JUnit Test` or use `Alt + Shift + X` followed by `T` to run the Tests.

## Initialize the API Client

**_Note:_** Documentation for the client can be found [here.](https://www.github.com/sdks-io/digital-payments-java-sdk/tree/1.1.0/doc/client.md)

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `environment` | `Environment` | The API environment. <br> **Default: `Environment.TEST`** |
| `httpClientConfig` | [`Consumer<HttpClientConfiguration.Builder>`](https://www.github.com/sdks-io/digital-payments-java-sdk/tree/1.1.0/doc/http-client-configuration-builder.md) | Set up Http Client Configuration instance. |
| `mppTokenCredentials` | [`MppTokenCredentials`](https://www.github.com/sdks-io/digital-payments-java-sdk/tree/1.1.0/doc/auth/custom-header-signature.md) | The Credentials Setter for Custom Header Signature |
| `oAuthTokenPostCredentials` | [`OAuthTokenPostCredentials`](https://www.github.com/sdks-io/digital-payments-java-sdk/tree/1.1.0/doc/auth/custom-header-signature-1.md) | The Credentials Setter for Custom Header Signature |

The API client can be initialized as follows:

```java
ShellSmartPayAPIClient client = new ShellSmartPayAPIClient.Builder()
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
    .environment(Environment.TEST)
    .build();
```

## Environments

The SDK can be configured to use a different environment for making API calls. Available environments are:

### Fields

| Name | Description |
|  --- | --- |
| Test | **Default** |
| Production | - |

## Authorization

This API uses the following authentication schemes.

* [`MppToken (Custom Header Signature)`](https://www.github.com/sdks-io/digital-payments-java-sdk/tree/1.1.0/doc/auth/custom-header-signature.md)
* [`oAuthTokenPost (Custom Header Signature)`](https://www.github.com/sdks-io/digital-payments-java-sdk/tree/1.1.0/doc/auth/custom-header-signature-1.md)

## List of APIs

* [Shell API Platform Security Authentication](https://www.github.com/sdks-io/digital-payments-java-sdk/tree/1.1.0/doc/controllers/shell-api-platform-security-authentication.md)
* [Digital Payment Enablement](https://www.github.com/sdks-io/digital-payments-java-sdk/tree/1.1.0/doc/controllers/digital-payment-enablement.md)
* [Station Locator](https://www.github.com/sdks-io/digital-payments-java-sdk/tree/1.1.0/doc/controllers/station-locator.md)
* [Partner Notification](https://www.github.com/sdks-io/digital-payments-java-sdk/tree/1.1.0/doc/controllers/partner-notification.md)
* [Fueling](https://www.github.com/sdks-io/digital-payments-java-sdk/tree/1.1.0/doc/controllers/fueling.md)

## Classes Documentation

* [Utility Classes](https://www.github.com/sdks-io/digital-payments-java-sdk/tree/1.1.0/doc/utility-classes.md)
* [HttpRequest](https://www.github.com/sdks-io/digital-payments-java-sdk/tree/1.1.0/doc/http-request.md)
* [HttpResponse](https://www.github.com/sdks-io/digital-payments-java-sdk/tree/1.1.0/doc/http-response.md)
* [HttpStringResponse](https://www.github.com/sdks-io/digital-payments-java-sdk/tree/1.1.0/doc/http-string-response.md)
* [HttpContext](https://www.github.com/sdks-io/digital-payments-java-sdk/tree/1.1.0/doc/http-context.md)
* [HttpBodyRequest](https://www.github.com/sdks-io/digital-payments-java-sdk/tree/1.1.0/doc/http-body-request.md)
* [HttpCallback Interface](https://www.github.com/sdks-io/digital-payments-java-sdk/tree/1.1.0/doc/http-callback-interface.md)
* [Headers](https://www.github.com/sdks-io/digital-payments-java-sdk/tree/1.1.0/doc/headers.md)
* [ApiException](https://www.github.com/sdks-io/digital-payments-java-sdk/tree/1.1.0/doc/api-exception.md)
* [Configuration Interface](https://www.github.com/sdks-io/digital-payments-java-sdk/tree/1.1.0/doc/configuration-interface.md)
* [HttpClientConfiguration](https://www.github.com/sdks-io/digital-payments-java-sdk/tree/1.1.0/doc/http-client-configuration.md)
* [HttpClientConfiguration.Builder](https://www.github.com/sdks-io/digital-payments-java-sdk/tree/1.1.0/doc/http-client-configuration-builder.md)

