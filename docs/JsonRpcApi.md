# JsonRpcApi

All URIs are relative to *https://ntp1node.nebl.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**jsonRpc**](JsonRpcApi.md#jsonRpc) | **POST** / | Send a JSON-RPC call to a localhost neblio-Qt or nebliod node


<a name="jsonRpc"></a>
# **jsonRpc**
> RpcResponse jsonRpc(rpcRequest)

Send a JSON-RPC call to a localhost neblio-Qt or nebliod node

Call any Neblio RPC command from the Neblio API libraries. Useful for signing transactions with a local node and other functions. Will not work from a browser due to CORS restrictions. Requires a node to be running locally at 127.0.0.1

### Example
```java
// Import classes:
//import io.nebl.neblioapi.ApiClient;
//import io.nebl.neblioapi.ApiException;
//import io.nebl.neblioapi.Configuration;
//import io.nebl.neblioapi.auth.*;
//import io.nebl.neblioapi.api.JsonRpcApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: rpcAuth
HttpBasicAuth rpcAuth = (HttpBasicAuth) defaultClient.getAuthentication("rpcAuth");
rpcAuth.setUsername("YOUR USERNAME");
rpcAuth.setPassword("YOUR PASSWORD");

JsonRpcApi apiInstance = new JsonRpcApi();
RpcRequest rpcRequest = new RpcRequest(); // RpcRequest | 
try {
    RpcResponse result = apiInstance.jsonRpc(rpcRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JsonRpcApi#jsonRpc");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rpcRequest** | [**RpcRequest**](RpcRequest.md)|  |

### Return type

[**RpcResponse**](RpcResponse.md)

### Authorization

[rpcAuth](../README.md#rpcAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

