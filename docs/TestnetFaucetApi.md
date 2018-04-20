# TestnetFaucetApi

All URIs are relative to *https://ntp1node.nebl.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**testnetGetFaucet**](TestnetFaucetApi.md#testnetGetFaucet) | **GET** /testnet/faucet | Withdraws testnet NEBL to the specified address


<a name="testnetGetFaucet"></a>
# **testnetGetFaucet**
> GetFaucetResponse testnetGetFaucet(address, amount)

Withdraws testnet NEBL to the specified address

Withdraw testnet NEBL to your Neblio Testnet address. By default amount is 1500000000 or 15 NEBL and has a max of 50 NEBL. Only 2 withdrawals allowed per 24 hour period. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TestnetFaucetApi;


TestnetFaucetApi apiInstance = new TestnetFaucetApi();
String address = "address_example"; // String | Your Neblio Testnet Address
BigDecimal amount = new BigDecimal(); // BigDecimal | Amount of NEBL to withdrawal in satoshis
try {
    GetFaucetResponse result = apiInstance.testnetGetFaucet(address, amount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestnetFaucetApi#testnetGetFaucet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**| Your Neblio Testnet Address |
 **amount** | **BigDecimal**| Amount of NEBL to withdrawal in satoshis | [optional]

### Return type

[**GetFaucetResponse**](GetFaucetResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

