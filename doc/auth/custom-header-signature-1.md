
# Custom Header Signature



Documentation for accessing and setting credentials for oAuthTokenPost.

## Auth Credentials

| Name | Type | Description | Setter | Getter |
|  --- | --- | --- | --- | --- |
| X-Apigee-Authorization | `String` | APIGEE access token ([How to obtain APIGEE access token?](page:guided-walkthrough/walkthrough1)) | `xApigeeAuthorization` | `getXApigeeAuthorization()` |



**Note:** Auth credentials can be set using `oAuthTokenPostCredentials` in the client builder and accessed through `getOAuthTokenPostCredentials` method in the client instance.

## Usage Example

### Client Initialization

You must provide credentials in the client as shown in the following code snippet.

```java
ShellEVClient client = new ShellEVClient.Builder()
    .oAuthTokenPostCredentials(new OAuthTokenPostModel.Builder(
            "X-Apigee-Authorization"
        )
        .build())
    .build();
```


