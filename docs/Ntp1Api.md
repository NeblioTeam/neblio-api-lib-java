# Ntp1Api

All URIs are relative to *https://ntp1node.nebl.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**broadcastTx**](Ntp1Api.md#broadcastTx) | **POST** /ntp1/broadcast | Broadcasts a signed raw transaction to the network
[**burnToken**](Ntp1Api.md#burnToken) | **POST** /ntp1/burntoken | Builds a transaction that burns an NTP1 Token
[**getAddressInfo**](Ntp1Api.md#getAddressInfo) | **GET** /ntp1/addressinfo/{address} | Information On a Neblio Address
[**getTokenHolders**](Ntp1Api.md#getTokenHolders) | **GET** /ntp1/stakeholders/{tokenid} | Get Addresses Holding a Token
[**getTokenId**](Ntp1Api.md#getTokenId) | **GET** /ntp1/tokenid/{tokensymbol} | Returns the tokenId representing a token
[**getTokenMetadata**](Ntp1Api.md#getTokenMetadata) | **GET** /ntp1/tokenmetadata/{tokenid} | Get Metadata of Token
[**getTokenMetadataOfUtxo**](Ntp1Api.md#getTokenMetadataOfUtxo) | **GET** /ntp1/tokenmetadata/{tokenid}/{utxo} | Get UTXO Metadata of Token
[**getTransactionInfo**](Ntp1Api.md#getTransactionInfo) | **GET** /ntp1/transactioninfo/{txid} | Information On an NTP1 Transaction
[**issueToken**](Ntp1Api.md#issueToken) | **POST** /ntp1/issue | Builds a transaction that issues a new NTP1 Token
[**sendToken**](Ntp1Api.md#sendToken) | **POST** /ntp1/sendtoken | Builds a transaction that sends an NTP1 Token


<a name="broadcastTx"></a>
# **broadcastTx**
> BroadcastTxResponse broadcastTx(broadcastTxRequest)

Broadcasts a signed raw transaction to the network

Broadcasts a signed raw transaction to the network. If successful returns the txid of the broadcast trasnaction. 

### Example
```java
// Import classes:
//import io.nebl.neblioapi.ApiException;
//import io.nebl.neblioapi.api.Ntp1Api;


Ntp1Api apiInstance = new Ntp1Api();
BroadcastTxRequest broadcastTxRequest = new BroadcastTxRequest(); // BroadcastTxRequest | Object representing a transaction to broadcast
try {
    BroadcastTxResponse result = apiInstance.broadcastTx(broadcastTxRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Ntp1Api#broadcastTx");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **broadcastTxRequest** | [**BroadcastTxRequest**](BroadcastTxRequest.md)| Object representing a transaction to broadcast |

### Return type

[**BroadcastTxResponse**](BroadcastTxResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="burnToken"></a>
# **burnToken**
> BurnTokenResponse burnToken(burnTokenRequest)

Builds a transaction that burns an NTP1 Token

Builds an unsigned raw transaction that burns an NTP1 token on the Neblio blockchain. 

### Example
```java
// Import classes:
//import io.nebl.neblioapi.ApiException;
//import io.nebl.neblioapi.api.Ntp1Api;


Ntp1Api apiInstance = new Ntp1Api();
BurnTokenRequest burnTokenRequest = new BurnTokenRequest(); // BurnTokenRequest | Object representing the token to be burned
try {
    BurnTokenResponse result = apiInstance.burnToken(burnTokenRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Ntp1Api#burnToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **burnTokenRequest** | [**BurnTokenRequest**](BurnTokenRequest.md)| Object representing the token to be burned |

### Return type

[**BurnTokenResponse**](BurnTokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAddressInfo"></a>
# **getAddressInfo**
> GetAddressInfoResponse getAddressInfo(address)

Information On a Neblio Address

Returns both NEBL and NTP1 token UTXOs held at the given address. 

### Example
```java
// Import classes:
//import io.nebl.neblioapi.ApiException;
//import io.nebl.neblioapi.api.Ntp1Api;


Ntp1Api apiInstance = new Ntp1Api();
String address = "address_example"; // String | Neblio Address to get information on.
try {
    GetAddressInfoResponse result = apiInstance.getAddressInfo(address);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Ntp1Api#getAddressInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**| Neblio Address to get information on. |

### Return type

[**GetAddressInfoResponse**](GetAddressInfoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTokenHolders"></a>
# **getTokenHolders**
> GetTokenHoldersResponse getTokenHolders(tokenid)

Get Addresses Holding a Token

Returns the the the addresses holding a token and how many tokens are held 

### Example
```java
// Import classes:
//import io.nebl.neblioapi.ApiException;
//import io.nebl.neblioapi.api.Ntp1Api;


Ntp1Api apiInstance = new Ntp1Api();
String tokenid = "tokenid_example"; // String | TokenId to request metadata for
try {
    GetTokenHoldersResponse result = apiInstance.getTokenHolders(tokenid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Ntp1Api#getTokenHolders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tokenid** | **String**| TokenId to request metadata for |

### Return type

[**GetTokenHoldersResponse**](GetTokenHoldersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTokenId"></a>
# **getTokenId**
> GetTokenIdResponse getTokenId(tokensymbol)

Returns the tokenId representing a token

Translates a token symbol to a tokenId if a token exists with that symbol on the network 

### Example
```java
// Import classes:
//import io.nebl.neblioapi.ApiException;
//import io.nebl.neblioapi.api.Ntp1Api;


Ntp1Api apiInstance = new Ntp1Api();
String tokensymbol = "tokensymbol_example"; // String | Token symbol
try {
    GetTokenIdResponse result = apiInstance.getTokenId(tokensymbol);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Ntp1Api#getTokenId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tokensymbol** | **String**| Token symbol |

### Return type

[**GetTokenIdResponse**](GetTokenIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTokenMetadata"></a>
# **getTokenMetadata**
> GetTokenMetadataResponse getTokenMetadata(tokenid, verbosity)

Get Metadata of Token

Returns the metadata associated with a token. 

### Example
```java
// Import classes:
//import io.nebl.neblioapi.ApiException;
//import io.nebl.neblioapi.api.Ntp1Api;


Ntp1Api apiInstance = new Ntp1Api();
String tokenid = "tokenid_example"; // String | TokenId to request metadata for
BigDecimal verbosity = new BigDecimal(); // BigDecimal | 0 (Default) is fastest, 1 contains token stats, 2 contains token holding addresses
try {
    GetTokenMetadataResponse result = apiInstance.getTokenMetadata(tokenid, verbosity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Ntp1Api#getTokenMetadata");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tokenid** | **String**| TokenId to request metadata for |
 **verbosity** | **BigDecimal**| 0 (Default) is fastest, 1 contains token stats, 2 contains token holding addresses | [optional]

### Return type

[**GetTokenMetadataResponse**](GetTokenMetadataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTokenMetadataOfUtxo"></a>
# **getTokenMetadataOfUtxo**
> GetTokenMetadataResponse getTokenMetadataOfUtxo(tokenid, utxo, verbosity)

Get UTXO Metadata of Token

Returns the metadata associated with a token for that specific utxo instead of the issuance transaction. 

### Example
```java
// Import classes:
//import io.nebl.neblioapi.ApiException;
//import io.nebl.neblioapi.api.Ntp1Api;


Ntp1Api apiInstance = new Ntp1Api();
String tokenid = "tokenid_example"; // String | TokenId to request metadata for
String utxo = "utxo_example"; // String | Specific UTXO to request metadata for
BigDecimal verbosity = new BigDecimal(); // BigDecimal | 0 (Default) is fastest, 1 contains token stats, 2 contains token holding addresses
try {
    GetTokenMetadataResponse result = apiInstance.getTokenMetadataOfUtxo(tokenid, utxo, verbosity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Ntp1Api#getTokenMetadataOfUtxo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tokenid** | **String**| TokenId to request metadata for |
 **utxo** | **String**| Specific UTXO to request metadata for |
 **verbosity** | **BigDecimal**| 0 (Default) is fastest, 1 contains token stats, 2 contains token holding addresses | [optional]

### Return type

[**GetTokenMetadataResponse**](GetTokenMetadataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTransactionInfo"></a>
# **getTransactionInfo**
> GetTransactionInfoResponse getTransactionInfo(txid)

Information On an NTP1 Transaction

Returns detailed information regarding an NTP1 transaction. 

### Example
```java
// Import classes:
//import io.nebl.neblioapi.ApiException;
//import io.nebl.neblioapi.api.Ntp1Api;


Ntp1Api apiInstance = new Ntp1Api();
String txid = "txid_example"; // String | Neblio txid to get information on.
try {
    GetTransactionInfoResponse result = apiInstance.getTransactionInfo(txid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Ntp1Api#getTransactionInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **txid** | **String**| Neblio txid to get information on. |

### Return type

[**GetTransactionInfoResponse**](GetTransactionInfoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="issueToken"></a>
# **issueToken**
> IssueTokenResponse issueToken(issueTokenRequest)

Builds a transaction that issues a new NTP1 Token

Builds an unsigned raw transaction that issues a new NTP1 token on the Neblio blockchain. 

### Example
```java
// Import classes:
//import io.nebl.neblioapi.ApiException;
//import io.nebl.neblioapi.api.Ntp1Api;


Ntp1Api apiInstance = new Ntp1Api();
IssueTokenRequest issueTokenRequest = new IssueTokenRequest(); // IssueTokenRequest | Object representing the token to be created
try {
    IssueTokenResponse result = apiInstance.issueToken(issueTokenRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Ntp1Api#issueToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issueTokenRequest** | [**IssueTokenRequest**](IssueTokenRequest.md)| Object representing the token to be created |

### Return type

[**IssueTokenResponse**](IssueTokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sendToken"></a>
# **sendToken**
> SendTokenResponse sendToken(sendTokenRequest)

Builds a transaction that sends an NTP1 Token

Builds an unsigned raw transaction that sends an NTP1 token on the Neblio blockchain. 

### Example
```java
// Import classes:
//import io.nebl.neblioapi.ApiException;
//import io.nebl.neblioapi.api.Ntp1Api;


Ntp1Api apiInstance = new Ntp1Api();
SendTokenRequest sendTokenRequest = new SendTokenRequest(); // SendTokenRequest | Object representing the token to be sent
try {
    SendTokenResponse result = apiInstance.sendToken(sendTokenRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Ntp1Api#sendToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sendTokenRequest** | [**SendTokenRequest**](SendTokenRequest.md)| Object representing the token to be sent |

### Return type

[**SendTokenResponse**](SendTokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

