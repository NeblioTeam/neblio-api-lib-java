
# GetTxResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**txid** | **String** | TXID of transaction |  [optional]
**version** | [**BigDecimal**](BigDecimal.md) | Transaction version |  [optional]
**locktime** | [**BigDecimal**](BigDecimal.md) | Transaction locktime |  [optional]
**vin** | [**List&lt;GetTxResponseVin&gt;**](GetTxResponseVin.md) | Array of transaction inputs |  [optional]
**vout** | [**List&lt;GetTxResponseVout&gt;**](GetTxResponseVout.md) | Array of transaction outputs |  [optional]
**blocktime** | [**BigDecimal**](BigDecimal.md) | Block time of this transaction |  [optional]
**blockheight** | [**BigDecimal**](BigDecimal.md) | Block height of this transaction |  [optional]
**totalsent** | [**BigDecimal**](BigDecimal.md) | Total NEBL sent in this transaction in satoshis |  [optional]
**fee** | [**BigDecimal**](BigDecimal.md) | Total NEBL used as fee for this transcation in satoshis |  [optional]
**blockhash** | **String** | Hash of the block this transaction is in |  [optional]
**time** | [**BigDecimal**](BigDecimal.md) | Transaction time |  [optional]
**confirmations** | [**BigDecimal**](BigDecimal.md) | Number of transaction confirmations |  [optional]
**valueOut** | [**BigDecimal**](BigDecimal.md) | Total NEBL output in this transaction |  [optional]
**valueIn** | [**BigDecimal**](BigDecimal.md) | Total NEBL input in this transaction |  [optional]
**fees** | [**BigDecimal**](BigDecimal.md) | Total NEBL used in fees for this transaction |  [optional]
**size** | [**BigDecimal**](BigDecimal.md) | Transcation size in bytes |  [optional]



