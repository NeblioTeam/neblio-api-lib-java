
# GetAddressInfoResponseUtxos

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | [**BigDecimal**](BigDecimal.md) | Index of the UTXO at this address |  [optional]
**txid** | **String** | Txid of this UTXO |  [optional]
**blockheight** | [**BigDecimal**](BigDecimal.md) | Blockheight of the UTXO |  [optional]
**blocktime** | [**BigDecimal**](BigDecimal.md) | Blocktime of the UTXO |  [optional]
**scriptPubKey** | **Object** | Object representing the scruptPubKey of the UTXO |  [optional]
**used** | **Boolean** | Whether the UTXO has been used |  [optional]
**value** | [**BigDecimal**](BigDecimal.md) | Value of the UTXO in NEBL satoshi |  [optional]
**tokens** | [**List&lt;GetAddressInfoResponseTokens&gt;**](GetAddressInfoResponseTokens.md) | Array of NTP1 tokens in this UTXO. |  [optional]



