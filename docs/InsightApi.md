# InsightApi

All URIs are relative to *https://ntp1node.nebl.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAddress**](InsightApi.md#getAddress) | **GET** /ins/addr/{address} | Returns address object
[**getAddressBalance**](InsightApi.md#getAddressBalance) | **GET** /ins/addr/{address}/balance | Returns address balance in sats
[**getAddressTotalReceived**](InsightApi.md#getAddressTotalReceived) | **GET** /ins/addr/{address}/totalReceived | Returns total received by address in sats
[**getAddressTotalSent**](InsightApi.md#getAddressTotalSent) | **GET** /ins/addr/{address}/totalSent | Returns total sent by address in sats
[**getAddressUnconfirmedBalance**](InsightApi.md#getAddressUnconfirmedBalance) | **GET** /ins/addr/{address}/unconfirmedBalance | Returns address unconfirmed balance in sats
[**getAddressUtxos**](InsightApi.md#getAddressUtxos) | **GET** /ins/addr/{address}/utxo | Returns all UTXOs at a given address
[**getBlock**](InsightApi.md#getBlock) | **GET** /ins/block/{blockhash} | Returns information regarding a Neblio block
[**getBlockIndex**](InsightApi.md#getBlockIndex) | **GET** /ins/block-index/{blockindex} | Returns block hash of block
[**getRawTx**](InsightApi.md#getRawTx) | **GET** /ins/rawtx/{txid} | Returns raw transaction hex
[**getStatus**](InsightApi.md#getStatus) | **GET** /ins/status | Utility API for calling several blockchain node functions
[**getSync**](InsightApi.md#getSync) | **GET** /ins/sync | Get node sync status
[**getTx**](InsightApi.md#getTx) | **GET** /ins/tx/{txid} | Returns transaction object
[**getTxs**](InsightApi.md#getTxs) | **GET** /ins/txs | Get transactions by block or address
[**sendTx**](InsightApi.md#sendTx) | **POST** /ins/tx/send | Broadcasts a signed raw transaction to the network (not NTP1 specific)


<a name="getAddress"></a>
# **getAddress**
> GetAddressResponse getAddress(address)

Returns address object

Returns NEBL address object containing information on a specific address

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InsightApi;


InsightApi apiInstance = new InsightApi();
String address = "address_example"; // String | Address
try {
    GetAddressResponse result = apiInstance.getAddress(address);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InsightApi#getAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**| Address |

### Return type

[**GetAddressResponse**](GetAddressResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAddressBalance"></a>
# **getAddressBalance**
> BigDecimal getAddressBalance(address)

Returns address balance in sats

Returns NEBL address balance in satoshis

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InsightApi;


InsightApi apiInstance = new InsightApi();
String address = "address_example"; // String | Address
try {
    BigDecimal result = apiInstance.getAddressBalance(address);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InsightApi#getAddressBalance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**| Address |

### Return type

[**BigDecimal**](BigDecimal.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAddressTotalReceived"></a>
# **getAddressTotalReceived**
> BigDecimal getAddressTotalReceived(address)

Returns total received by address in sats

Returns total NEBL received by address in satoshis

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InsightApi;


InsightApi apiInstance = new InsightApi();
String address = "address_example"; // String | Address
try {
    BigDecimal result = apiInstance.getAddressTotalReceived(address);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InsightApi#getAddressTotalReceived");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**| Address |

### Return type

[**BigDecimal**](BigDecimal.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAddressTotalSent"></a>
# **getAddressTotalSent**
> BigDecimal getAddressTotalSent(address)

Returns total sent by address in sats

Returns total NEBL sent by address in satoshis

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InsightApi;


InsightApi apiInstance = new InsightApi();
String address = "address_example"; // String | Address
try {
    BigDecimal result = apiInstance.getAddressTotalSent(address);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InsightApi#getAddressTotalSent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**| Address |

### Return type

[**BigDecimal**](BigDecimal.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAddressUnconfirmedBalance"></a>
# **getAddressUnconfirmedBalance**
> BigDecimal getAddressUnconfirmedBalance(address)

Returns address unconfirmed balance in sats

Returns NEBL address unconfirmed balance in satoshis

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InsightApi;


InsightApi apiInstance = new InsightApi();
String address = "address_example"; // String | Address
try {
    BigDecimal result = apiInstance.getAddressUnconfirmedBalance(address);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InsightApi#getAddressUnconfirmedBalance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**| Address |

### Return type

[**BigDecimal**](BigDecimal.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAddressUtxos"></a>
# **getAddressUtxos**
> GetAddressUtxosResponse getAddressUtxos(address)

Returns all UTXOs at a given address

Returns information on each Unspent Transaction Output contained at an address

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InsightApi;


InsightApi apiInstance = new InsightApi();
String address = "address_example"; // String | Address
try {
    GetAddressUtxosResponse result = apiInstance.getAddressUtxos(address);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InsightApi#getAddressUtxos");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**| Address |

### Return type

[**GetAddressUtxosResponse**](GetAddressUtxosResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getBlock"></a>
# **getBlock**
> GetBlockResponse getBlock(blockhash)

Returns information regarding a Neblio block

Returns blockchain data for a given block based upon the block hash

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InsightApi;


InsightApi apiInstance = new InsightApi();
String blockhash = "blockhash_example"; // String | Block Hash
try {
    GetBlockResponse result = apiInstance.getBlock(blockhash);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InsightApi#getBlock");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockhash** | **String**| Block Hash |

### Return type

[**GetBlockResponse**](GetBlockResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getBlockIndex"></a>
# **getBlockIndex**
> GetBlockIndexResponse getBlockIndex(blockindex)

Returns block hash of block

Returns the block hash of a block at a given block index

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InsightApi;


InsightApi apiInstance = new InsightApi();
BigDecimal blockindex = new BigDecimal(); // BigDecimal | Block Index
try {
    GetBlockIndexResponse result = apiInstance.getBlockIndex(blockindex);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InsightApi#getBlockIndex");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockindex** | **BigDecimal**| Block Index |

### Return type

[**GetBlockIndexResponse**](GetBlockIndexResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRawTx"></a>
# **getRawTx**
> GetRawTxResponse getRawTx(txid)

Returns raw transaction hex

Returns raw transaction hex representing a NEBL transaction

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InsightApi;


InsightApi apiInstance = new InsightApi();
String txid = "txid_example"; // String | Transaction ID
try {
    GetRawTxResponse result = apiInstance.getRawTx(txid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InsightApi#getRawTx");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **txid** | **String**| Transaction ID |

### Return type

[**GetRawTxResponse**](GetRawTxResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getStatus"></a>
# **getStatus**
> GetStatusResponse getStatus(q)

Utility API for calling several blockchain node functions

tility API for calling several blockchain node functions - getInfo, getDifficulty, getBestBlockHash, getLastBlockHash

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InsightApi;


InsightApi apiInstance = new InsightApi();
String q = "q_example"; // String | Function to call, getInfo, getDifficulty, getBestBlockHash, or getLastBlockHash
try {
    GetStatusResponse result = apiInstance.getStatus(q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InsightApi#getStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **String**| Function to call, getInfo, getDifficulty, getBestBlockHash, or getLastBlockHash | [optional]

### Return type

[**GetStatusResponse**](GetStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSync"></a>
# **getSync**
> GetSyncResponse getSync()

Get node sync status

Returns information on the node&#39;s sync progress

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InsightApi;


InsightApi apiInstance = new InsightApi();
try {
    GetSyncResponse result = apiInstance.getSync();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InsightApi#getSync");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetSyncResponse**](GetSyncResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTx"></a>
# **getTx**
> GetTxResponse getTx(txid)

Returns transaction object

Returns NEBL transaction object representing a NEBL transaction

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InsightApi;


InsightApi apiInstance = new InsightApi();
String txid = "txid_example"; // String | Transaction ID
try {
    GetTxResponse result = apiInstance.getTx(txid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InsightApi#getTx");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **txid** | **String**| Transaction ID |

### Return type

[**GetTxResponse**](GetTxResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTxs"></a>
# **getTxs**
> GetTxsResponse getTxs(address, block, page)

Get transactions by block or address

Returns all transactions by block or address

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InsightApi;


InsightApi apiInstance = new InsightApi();
String address = "address_example"; // String | Address
String block = "block_example"; // String | Block Hash
BigDecimal page = new BigDecimal(); // BigDecimal | Page number to display
try {
    GetTxsResponse result = apiInstance.getTxs(address, block, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InsightApi#getTxs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**| Address | [optional]
 **block** | **String**| Block Hash | [optional]
 **page** | **BigDecimal**| Page number to display | [optional]

### Return type

[**GetTxsResponse**](GetTxsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sendTx"></a>
# **sendTx**
> BroadcastTxResponse sendTx(body)

Broadcasts a signed raw transaction to the network (not NTP1 specific)

Broadcasts a signed raw transaction to the network. If successful returns the txid of the broadcast trasnaction. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InsightApi;


InsightApi apiInstance = new InsightApi();
SendTxRequest body = new SendTxRequest(); // SendTxRequest | Object representing a transaction to broadcast
try {
    BroadcastTxResponse result = apiInstance.sendTx(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InsightApi#sendTx");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SendTxRequest**](SendTxRequest.md)| Object representing a transaction to broadcast |

### Return type

[**BroadcastTxResponse**](BroadcastTxResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

