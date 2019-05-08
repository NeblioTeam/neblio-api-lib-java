# neblioapi

Neblio REST API Suite
- API version: 1.2.3
  - Build date: 2019-05-08T22:14:06.585Z[UTC]

APIs for Interacting with NTP1 Tokens & The Neblio Blockchain


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.nebl</groupId>
  <artifactId>neblioapi</artifactId>
  <version>1.2.1</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.nebl:neblioapi:1.2.1"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/neblioapi-1.2.1.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.nebl.neblioapi.*;
import io.nebl.neblioapi.auth.*;
import io.nebl.neblioapi.models.*;
import io.nebl.neblioapi.api.InsightApi;

import java.io.File;
import java.util.*;

public class InsightApiExample {

    public static void main(String[] args) {
        
        InsightApi apiInstance = new InsightApi();
        String address = "address_example"; // String | Address
        try {
            GetAddressResponse result = apiInstance.getAddress(address);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InsightApi#getAddress");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://ntp1node.nebl.io*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*InsightApi* | [**getAddress**](docs/InsightApi.md#getAddress) | **GET** /ins/addr/{address} | Returns address object
*InsightApi* | [**getAddressBalance**](docs/InsightApi.md#getAddressBalance) | **GET** /ins/addr/{address}/balance | Returns address balance in sats
*InsightApi* | [**getAddressTotalReceived**](docs/InsightApi.md#getAddressTotalReceived) | **GET** /ins/addr/{address}/totalReceived | Returns total received by address in sats
*InsightApi* | [**getAddressTotalSent**](docs/InsightApi.md#getAddressTotalSent) | **GET** /ins/addr/{address}/totalSent | Returns total sent by address in sats
*InsightApi* | [**getAddressUnconfirmedBalance**](docs/InsightApi.md#getAddressUnconfirmedBalance) | **GET** /ins/addr/{address}/unconfirmedBalance | Returns address unconfirmed balance in sats
*InsightApi* | [**getAddressUtxos**](docs/InsightApi.md#getAddressUtxos) | **GET** /ins/addr/{address}/utxo | Returns all UTXOs at a given address
*InsightApi* | [**getBlock**](docs/InsightApi.md#getBlock) | **GET** /ins/block/{blockhash} | Returns information regarding a Neblio block
*InsightApi* | [**getBlockIndex**](docs/InsightApi.md#getBlockIndex) | **GET** /ins/block-index/{blockindex} | Returns block hash of block
*InsightApi* | [**getRawTx**](docs/InsightApi.md#getRawTx) | **GET** /ins/rawtx/{txid} | Returns raw transaction hex
*InsightApi* | [**getStatus**](docs/InsightApi.md#getStatus) | **GET** /ins/status | Utility API for calling several blockchain node functions
*InsightApi* | [**getSync**](docs/InsightApi.md#getSync) | **GET** /ins/sync | Get node sync status
*InsightApi* | [**getTx**](docs/InsightApi.md#getTx) | **GET** /ins/tx/{txid} | Returns transaction object
*InsightApi* | [**getTxs**](docs/InsightApi.md#getTxs) | **GET** /ins/txs | Get transactions by block or address
*InsightApi* | [**sendTx**](docs/InsightApi.md#sendTx) | **POST** /ins/tx/send | Broadcasts a signed raw transaction to the network (not NTP1 specific)
*JsonRpcApi* | [**jsonRpc**](docs/JsonRpcApi.md#jsonRpc) | **POST** / | Send a JSON-RPC call to a localhost neblio-Qt or nebliod node
*Ntp1Api* | [**broadcastTx**](docs/Ntp1Api.md#broadcastTx) | **POST** /ntp1/broadcast | Broadcasts a signed raw transaction to the network
*Ntp1Api* | [**burnToken**](docs/Ntp1Api.md#burnToken) | **POST** /ntp1/burntoken | Builds a transaction that burns an NTP1 Token
*Ntp1Api* | [**getAddressInfo**](docs/Ntp1Api.md#getAddressInfo) | **GET** /ntp1/addressinfo/{address} | Information On a Neblio Address
*Ntp1Api* | [**getTokenHolders**](docs/Ntp1Api.md#getTokenHolders) | **GET** /ntp1/stakeholders/{tokenid} | Get Addresses Holding a Token
*Ntp1Api* | [**getTokenId**](docs/Ntp1Api.md#getTokenId) | **GET** /ntp1/tokenid/{tokensymbol} | Returns the tokenId representing a token
*Ntp1Api* | [**getTokenMetadata**](docs/Ntp1Api.md#getTokenMetadata) | **GET** /ntp1/tokenmetadata/{tokenid} | Get Metadata of Token
*Ntp1Api* | [**getTokenMetadataOfUtxo**](docs/Ntp1Api.md#getTokenMetadataOfUtxo) | **GET** /ntp1/tokenmetadata/{tokenid}/{utxo} | Get UTXO Metadata of Token
*Ntp1Api* | [**getTransactionInfo**](docs/Ntp1Api.md#getTransactionInfo) | **GET** /ntp1/transactioninfo/{txid} | Information On an NTP1 Transaction
*Ntp1Api* | [**issueToken**](docs/Ntp1Api.md#issueToken) | **POST** /ntp1/issue | Builds a transaction that issues a new NTP1 Token
*Ntp1Api* | [**sendToken**](docs/Ntp1Api.md#sendToken) | **POST** /ntp1/sendtoken | Builds a transaction that sends an NTP1 Token
*TestnetFaucetApi* | [**testnetGetFaucet**](docs/TestnetFaucetApi.md#testnetGetFaucet) | **GET** /testnet/faucet | Withdraws testnet NEBL to the specified address
*TestnetInsightApi* | [**testnetGetAddress**](docs/TestnetInsightApi.md#testnetGetAddress) | **GET** /testnet/ins/addr/{address} | Returns address object
*TestnetInsightApi* | [**testnetGetAddressBalance**](docs/TestnetInsightApi.md#testnetGetAddressBalance) | **GET** /testnet/ins/addr/{address}/balance | Returns address balance in sats
*TestnetInsightApi* | [**testnetGetAddressTotalReceived**](docs/TestnetInsightApi.md#testnetGetAddressTotalReceived) | **GET** /testnet/ins/addr/{address}/totalReceived | Returns total received by address in sats
*TestnetInsightApi* | [**testnetGetAddressTotalSent**](docs/TestnetInsightApi.md#testnetGetAddressTotalSent) | **GET** /testnet/ins/addr/{address}/totalSent | Returns total sent by address in sats
*TestnetInsightApi* | [**testnetGetAddressUnconfirmedBalance**](docs/TestnetInsightApi.md#testnetGetAddressUnconfirmedBalance) | **GET** /testnet/ins/addr/{address}/unconfirmedBalance | Returns address unconfirmed balance in sats
*TestnetInsightApi* | [**testnetGetAddressUtxos**](docs/TestnetInsightApi.md#testnetGetAddressUtxos) | **GET** /testnet/ins/addr/{address}/utxo | Returns all UTXOs at a given address
*TestnetInsightApi* | [**testnetGetBlock**](docs/TestnetInsightApi.md#testnetGetBlock) | **GET** /testnet/ins/block/{blockhash} | Returns information regarding a Neblio block
*TestnetInsightApi* | [**testnetGetBlockIndex**](docs/TestnetInsightApi.md#testnetGetBlockIndex) | **GET** /testnet/ins/block-index/{blockindex} | Returns block hash of block
*TestnetInsightApi* | [**testnetGetRawTx**](docs/TestnetInsightApi.md#testnetGetRawTx) | **GET** /testnet/ins/rawtx/{txid} | Returns raw transaction hex
*TestnetInsightApi* | [**testnetGetStatus**](docs/TestnetInsightApi.md#testnetGetStatus) | **GET** /testnet/ins/status | Utility API for calling several blockchain node functions
*TestnetInsightApi* | [**testnetGetSync**](docs/TestnetInsightApi.md#testnetGetSync) | **GET** /testnet/ins/sync | Get node sync status
*TestnetInsightApi* | [**testnetGetTx**](docs/TestnetInsightApi.md#testnetGetTx) | **GET** /testnet/ins/tx/{txid} | Returns transaction object
*TestnetInsightApi* | [**testnetGetTxs**](docs/TestnetInsightApi.md#testnetGetTxs) | **GET** /testnet/ins/txs | Get transactions by block or address
*TestnetInsightApi* | [**testnetSendTx**](docs/TestnetInsightApi.md#testnetSendTx) | **POST** /testnet/ins/tx/send | Broadcasts a signed raw transaction to the network (not NTP1 specific)
*TestnetNtp1Api* | [**testnetBroadcastTx**](docs/TestnetNtp1Api.md#testnetBroadcastTx) | **POST** /testnet/ntp1/broadcast | Broadcasts a signed raw transaction to the network
*TestnetNtp1Api* | [**testnetBurnToken**](docs/TestnetNtp1Api.md#testnetBurnToken) | **POST** /testnet/ntp1/burntoken | Builds a transaction that burns an NTP1 Token
*TestnetNtp1Api* | [**testnetGetAddressInfo**](docs/TestnetNtp1Api.md#testnetGetAddressInfo) | **GET** /testnet/ntp1/addressinfo/{address} | Information On a Neblio Address
*TestnetNtp1Api* | [**testnetGetTokenHolders**](docs/TestnetNtp1Api.md#testnetGetTokenHolders) | **GET** /testnet/ntp1/stakeholders/{tokenid} | Get Addresses Holding a Token
*TestnetNtp1Api* | [**testnetGetTokenId**](docs/TestnetNtp1Api.md#testnetGetTokenId) | **GET** /testnet/ntp1/tokenid/{tokensymbol} | Returns the tokenId representing a token
*TestnetNtp1Api* | [**testnetGetTokenMetadata**](docs/TestnetNtp1Api.md#testnetGetTokenMetadata) | **GET** /testnet/ntp1/tokenmetadata/{tokenid} | Get Metadata of Token
*TestnetNtp1Api* | [**testnetGetTokenMetadataOfUtxo**](docs/TestnetNtp1Api.md#testnetGetTokenMetadataOfUtxo) | **GET** /testnet/ntp1/tokenmetadata/{tokenid}/{utxo} | Get UTXO Metadata of Token
*TestnetNtp1Api* | [**testnetGetTransactionInfo**](docs/TestnetNtp1Api.md#testnetGetTransactionInfo) | **GET** /testnet/ntp1/transactioninfo/{txid} | Information On an NTP1 Transaction
*TestnetNtp1Api* | [**testnetIssueToken**](docs/TestnetNtp1Api.md#testnetIssueToken) | **POST** /testnet/ntp1/issue | Builds a transaction that issues a new NTP1 Token
*TestnetNtp1Api* | [**testnetSendToken**](docs/TestnetNtp1Api.md#testnetSendToken) | **POST** /testnet/ntp1/sendtoken | Builds a transaction that sends an NTP1 Token


## Documentation for Models

 - [BroadcastTxRequest](docs/BroadcastTxRequest.md)
 - [BroadcastTxResponse](docs/BroadcastTxResponse.md)
 - [BurnTokenRequest](docs/BurnTokenRequest.md)
 - [BurnTokenRequestBurn](docs/BurnTokenRequestBurn.md)
 - [BurnTokenResponse](docs/BurnTokenResponse.md)
 - [Error](docs/Error.md)
 - [GetAddressInfoResponse](docs/GetAddressInfoResponse.md)
 - [GetAddressInfoResponseTokens](docs/GetAddressInfoResponseTokens.md)
 - [GetAddressInfoResponseUtxos](docs/GetAddressInfoResponseUtxos.md)
 - [GetAddressResponse](docs/GetAddressResponse.md)
 - [GetBlockIndexResponse](docs/GetBlockIndexResponse.md)
 - [GetBlockResponse](docs/GetBlockResponse.md)
 - [GetFaucetResponse](docs/GetFaucetResponse.md)
 - [GetFaucetResponseData](docs/GetFaucetResponseData.md)
 - [GetRawTxResponse](docs/GetRawTxResponse.md)
 - [GetSyncResponse](docs/GetSyncResponse.md)
 - [GetTokenHoldersResponse](docs/GetTokenHoldersResponse.md)
 - [GetTokenHoldersResponseHolders](docs/GetTokenHoldersResponseHolders.md)
 - [GetTokenIdResponse](docs/GetTokenIdResponse.md)
 - [GetTokenMetadataResponse](docs/GetTokenMetadataResponse.md)
 - [GetTokenMetadataResponseMetadataOfIssuence](docs/GetTokenMetadataResponseMetadataOfIssuence.md)
 - [GetTokenMetadataResponseMetadataOfIssuenceData](docs/GetTokenMetadataResponseMetadataOfIssuenceData.md)
 - [GetTokenMetadataResponseMetadataOfIssuenceDataUserData](docs/GetTokenMetadataResponseMetadataOfIssuenceDataUserData.md)
 - [GetTokenMetadataResponseMetadataOfIssuenceDataUserDataMeta](docs/GetTokenMetadataResponseMetadataOfIssuenceDataUserDataMeta.md)
 - [GetTokenMetadataResponseMetadataOfUtxo](docs/GetTokenMetadataResponseMetadataOfUtxo.md)
 - [GetTokenMetadataResponseMetadataOfUtxoUserData](docs/GetTokenMetadataResponseMetadataOfUtxoUserData.md)
 - [GetTransactionInfoResponse](docs/GetTransactionInfoResponse.md)
 - [GetTransactionInfoResponsePreviousOutput](docs/GetTransactionInfoResponsePreviousOutput.md)
 - [GetTransactionInfoResponseScriptSig](docs/GetTransactionInfoResponseScriptSig.md)
 - [GetTransactionInfoResponseTokens](docs/GetTransactionInfoResponseTokens.md)
 - [GetTransactionInfoResponseVin](docs/GetTransactionInfoResponseVin.md)
 - [GetTransactionInfoResponseVout](docs/GetTransactionInfoResponseVout.md)
 - [GetTxResponse](docs/GetTxResponse.md)
 - [GetTxResponseVin](docs/GetTxResponseVin.md)
 - [GetTxResponseVout](docs/GetTxResponseVout.md)
 - [GetTxsResponse](docs/GetTxsResponse.md)
 - [IssueTokenRequest](docs/IssueTokenRequest.md)
 - [IssueTokenRequestFlags](docs/IssueTokenRequestFlags.md)
 - [IssueTokenRequestMetadata](docs/IssueTokenRequestMetadata.md)
 - [IssueTokenRequestMetadataEncryptions](docs/IssueTokenRequestMetadataEncryptions.md)
 - [IssueTokenRequestMetadataRules](docs/IssueTokenRequestMetadataRules.md)
 - [IssueTokenRequestMetadataRulesExpiration](docs/IssueTokenRequestMetadataRulesExpiration.md)
 - [IssueTokenRequestMetadataRulesFees](docs/IssueTokenRequestMetadataRulesFees.md)
 - [IssueTokenRequestMetadataRulesFeesItems](docs/IssueTokenRequestMetadataRulesFeesItems.md)
 - [IssueTokenRequestMetadataRulesHolders](docs/IssueTokenRequestMetadataRulesHolders.md)
 - [IssueTokenRequestMetadataUrls](docs/IssueTokenRequestMetadataUrls.md)
 - [IssueTokenRequestTransfer](docs/IssueTokenRequestTransfer.md)
 - [IssueTokenResponse](docs/IssueTokenResponse.md)
 - [RpcRequest](docs/RpcRequest.md)
 - [RpcResponse](docs/RpcResponse.md)
 - [SendTokenRequest](docs/SendTokenRequest.md)
 - [SendTokenRequestTo](docs/SendTokenRequestTo.md)
 - [SendTokenResponse](docs/SendTokenResponse.md)
 - [SendTxRequest](docs/SendTxRequest.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### rpcAuth

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



