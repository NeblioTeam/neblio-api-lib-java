# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.Ntp1Api;

import java.io.File;
import java.util.*;

public class Ntp1ApiExample {

    public static void main(String[] args) {
        
        Ntp1Api apiInstance = new Ntp1Api();
        BroadcastTxRequest body = new BroadcastTxRequest(); // BroadcastTxRequest | Object representing a transaction to broadcast
        try {
            BroadcastTxResponse result = apiInstance.broadcastTx(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling Ntp1Api#broadcastTx");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://ntp1node.nebl.io*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*Ntp1Api* | [**broadcastTx**](docs/Ntp1Api.md#broadcastTx) | **POST** /ntp1/broadcast | Broadcasts a signed raw transaction to the network
*Ntp1Api* | [**burnToken**](docs/Ntp1Api.md#burnToken) | **POST** /ntp1/burntoken | Builds a transaction that burns an NTP1 Token
*Ntp1Api* | [**getAddressInfo**](docs/Ntp1Api.md#getAddressInfo) | **GET** /ntp1/addressinfo/{address} | Information On a Neblio Address
*Ntp1Api* | [**getTokenHolders**](docs/Ntp1Api.md#getTokenHolders) | **GET** /ntp1/stakeholders/{tokenid} | Get Addresses Holding a Token
*Ntp1Api* | [**getTokenId**](docs/Ntp1Api.md#getTokenId) | **GET** /ntp1/tokenid/{tokensymbol} | Returns the tokenId representing a token
*Ntp1Api* | [**getTokenMetadataOfIssuance**](docs/Ntp1Api.md#getTokenMetadataOfIssuance) | **GET** /ntp1/tokenmetadata/{tokenid} | Get Issuance Metadata of Token
*Ntp1Api* | [**getTokenMetadataOfUtxo**](docs/Ntp1Api.md#getTokenMetadataOfUtxo) | **GET** /ntp1/tokenmetadata/{tokenid}/{utxo} | Get UTXO Metadata of Token
*Ntp1Api* | [**getTransactionInfo**](docs/Ntp1Api.md#getTransactionInfo) | **GET** /ntp1/transactioninfo/{txid} | Information On an NTP1 Transaction
*Ntp1Api* | [**issueToken**](docs/Ntp1Api.md#issueToken) | **POST** /ntp1/issue | Builds a transaction that issues a new NTP1 Token
*Ntp1Api* | [**sendToken**](docs/Ntp1Api.md#sendToken) | **POST** /ntp1/sendtoken | Builds a transaction that sends an NTP1 Token
*TestnetFaucetApi* | [**testnetGetFaucet**](docs/TestnetFaucetApi.md#testnetGetFaucet) | **GET** /testnet/faucet | Withdraws testnet NEBL to the specified address
*TestnetNtp1Api* | [**testnetBroadcastTx**](docs/TestnetNtp1Api.md#testnetBroadcastTx) | **POST** /testnet/ntp1/broadcast | Broadcasts a signed raw transaction to the network
*TestnetNtp1Api* | [**testnetBurnToken**](docs/TestnetNtp1Api.md#testnetBurnToken) | **POST** /testnet/ntp1/burntoken | Builds a transaction that burns an NTP1 Token
*TestnetNtp1Api* | [**testnetGetAddressInfo**](docs/TestnetNtp1Api.md#testnetGetAddressInfo) | **GET** /testnet/ntp1/addressinfo/{address} | Information On a Neblio Address
*TestnetNtp1Api* | [**testnetGetTokenHolders**](docs/TestnetNtp1Api.md#testnetGetTokenHolders) | **GET** /testnet/ntp1/stakeholders/{tokenid} | Get Addresses Holding a Token
*TestnetNtp1Api* | [**testnetGetTokenId**](docs/TestnetNtp1Api.md#testnetGetTokenId) | **GET** /testnet/ntp1/tokenid/{tokensymbol} | Returns the tokenId representing a token
*TestnetNtp1Api* | [**testnetGetTokenMetadataOfIssuance**](docs/TestnetNtp1Api.md#testnetGetTokenMetadataOfIssuance) | **GET** /testnet/ntp1/tokenmetadata/{tokenid} | Get Issuance Metadata of Token
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
 - [GetFaucetResponse](docs/GetFaucetResponse.md)
 - [GetFaucetResponseData](docs/GetFaucetResponseData.md)
 - [GetTokenHoldersResponse](docs/GetTokenHoldersResponse.md)
 - [GetTokenHoldersResponseHolders](docs/GetTokenHoldersResponseHolders.md)
 - [GetTokenIdResponse](docs/GetTokenIdResponse.md)
 - [GetTokenMetadataResponse](docs/GetTokenMetadataResponse.md)
 - [GetTokenMetadataResponseMetadataOfIssuance](docs/GetTokenMetadataResponseMetadataOfIssuance.md)
 - [GetTokenMetadataResponseMetadataOfIssuanceData](docs/GetTokenMetadataResponseMetadataOfIssuanceData.md)
 - [GetTokenMetadataResponseMetadataOfIssuanceDataUserData](docs/GetTokenMetadataResponseMetadataOfIssuanceDataUserData.md)
 - [GetTokenMetadataResponseMetadataOfIssuanceDataUserDataMeta](docs/GetTokenMetadataResponseMetadataOfIssuanceDataUserDataMeta.md)
 - [GetTransactionInfoResponse](docs/GetTransactionInfoResponse.md)
 - [GetTransactionInfoResponsePreviousOutput](docs/GetTransactionInfoResponsePreviousOutput.md)
 - [GetTransactionInfoResponseScriptSig](docs/GetTransactionInfoResponseScriptSig.md)
 - [GetTransactionInfoResponseTokens](docs/GetTransactionInfoResponseTokens.md)
 - [GetTransactionInfoResponseVin](docs/GetTransactionInfoResponseVin.md)
 - [GetTransactionInfoResponseVout](docs/GetTransactionInfoResponseVout.md)
 - [IssueTokenRequest](docs/IssueTokenRequest.md)
 - [IssueTokenRequestMetadata](docs/IssueTokenRequestMetadata.md)
 - [IssueTokenRequestMetadataEncryptions](docs/IssueTokenRequestMetadataEncryptions.md)
 - [IssueTokenRequestMetadataRules](docs/IssueTokenRequestMetadataRules.md)
 - [IssueTokenRequestMetadataRulesExpiration](docs/IssueTokenRequestMetadataRulesExpiration.md)
 - [IssueTokenRequestMetadataRulesFees](docs/IssueTokenRequestMetadataRulesFees.md)
 - [IssueTokenRequestMetadataRulesFeesItems](docs/IssueTokenRequestMetadataRulesFeesItems.md)
 - [IssueTokenRequestMetadataRulesHolders](docs/IssueTokenRequestMetadataRulesHolders.md)
 - [IssueTokenRequestMetadataUrls](docs/IssueTokenRequestMetadataUrls.md)
 - [IssueTokenResponse](docs/IssueTokenResponse.md)
 - [SendTokenRequest](docs/SendTokenRequest.md)
 - [SendTokenRequestTo](docs/SendTokenRequestTo.md)
 - [SendTokenResponse](docs/SendTokenResponse.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



