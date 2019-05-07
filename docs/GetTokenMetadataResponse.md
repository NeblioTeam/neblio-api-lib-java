
# GetTokenMetadataResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tokenId** | **String** | ID of the token |  [optional]
**someUtxo** | **String** | Example UTXO containing this token. |  [optional]
**divisibility** | [**BigDecimal**](BigDecimal.md) | Decimal places the token is divisible to |  [optional]
**lockStatus** | **Boolean** | Whether issuance of more tokens is locked |  [optional]
**aggregationPolicy** | **String** | Whether the tokens are aggregatable |  [optional]
**totalSupply** | [**BigDecimal**](BigDecimal.md) | Total number of tokens in supply |  [optional]
**numOfHolders** | [**BigDecimal**](BigDecimal.md) | Total number of addresses this token is held at |  [optional]
**numOfTransfers** | [**BigDecimal**](BigDecimal.md) | Total number of transactions of this token |  [optional]
**numOfIssuance** | [**BigDecimal**](BigDecimal.md) | Total number of times this token has been issued |  [optional]
**numOfBurns** | [**BigDecimal**](BigDecimal.md) | Number of times tokens have been burned |  [optional]
**firstBlock** | [**BigDecimal**](BigDecimal.md) | Block number token was issued in |  [optional]
**issuanceTxid** | **String** | TXID the token was issued with |  [optional]
**issueAddress** | **String** | Address that issued the tokens |  [optional]
**metadataOfIssuence** | [**GetTokenMetadataResponseMetadataOfIssuence**](GetTokenMetadataResponseMetadataOfIssuence.md) |  |  [optional]
**metadataOfUtxo** | [**GetTokenMetadataResponseMetadataOfIssuence**](GetTokenMetadataResponseMetadataOfIssuence.md) |  |  [optional]



