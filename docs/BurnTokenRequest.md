
# BurnTokenRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fee** | [**BigDecimal**](BigDecimal.md) | Fee in satoshi to include in the issuance transaction min 10000 (0.0001 NEBL) | 
**from** | **List&lt;String&gt;** | Array of addresses to send the token from |  [optional]
**transfer** | [**List&lt;SendTokenRequestTo&gt;**](SendTokenRequestTo.md) |  |  [optional]
**burn** | [**List&lt;BurnTokenRequestBurn&gt;**](BurnTokenRequestBurn.md) | Array of objects representing tokens to be burned | 



