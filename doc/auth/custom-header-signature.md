
# Custom Header Signature



Documentation for accessing and setting credentials for MppToken.

## Auth Credentials

| Name | Type | Description | Setter | Getter |
|  --- | --- | --- | --- | --- |
| Authorization | `String` | Digital Payments access token ([How to obtain Digital Payments access token?](page:guided-walkthrough/walkthrough1)) | `authorization` | `getAuthorization()` |



**Note:** Auth credentials can be set using `mppTokenCredentials` in the client builder and accessed through `getMppTokenCredentials` method in the client instance.

## Usage Example

### Client Initialization

You must provide credentials in the client as shown in the following code snippet.

```java
ShellEVClient client = new ShellEVClient.Builder()
    .mppTokenCredentials(new MppTokenModel.Builder(
            "Authorization"
        )
        .build())
    .build();
```


