/*
 * Neblio REST API Suite
 * APIs for Interacting with NTP1 Tokens & The Neblio Blockchain
 *
 * OpenAPI spec version: 1.2.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.nebl.neblioapi.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.nebl.neblioapi.models.GetAddressInfoResponseTokens;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * GetAddressInfoResponseUtxos
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-03-04T04:19:08.389Z[UTC]")
public class GetAddressInfoResponseUtxos {
  public static final String SERIALIZED_NAME_INDEX = "index";
  @SerializedName(SERIALIZED_NAME_INDEX)
  private BigDecimal index;

  public static final String SERIALIZED_NAME_TXID = "txid";
  @SerializedName(SERIALIZED_NAME_TXID)
  private String txid;

  public static final String SERIALIZED_NAME_BLOCKHEIGHT = "blockheight";
  @SerializedName(SERIALIZED_NAME_BLOCKHEIGHT)
  private BigDecimal blockheight;

  public static final String SERIALIZED_NAME_BLOCKTIME = "blocktime";
  @SerializedName(SERIALIZED_NAME_BLOCKTIME)
  private BigDecimal blocktime;

  public static final String SERIALIZED_NAME_SCRIPT_PUB_KEY = "scriptPubKey";
  @SerializedName(SERIALIZED_NAME_SCRIPT_PUB_KEY)
  private Object scriptPubKey = null;

  public static final String SERIALIZED_NAME_USED = "used";
  @SerializedName(SERIALIZED_NAME_USED)
  private Boolean used;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private BigDecimal value;

  public static final String SERIALIZED_NAME_TOKENS = "tokens";
  @SerializedName(SERIALIZED_NAME_TOKENS)
  private List<GetAddressInfoResponseTokens> tokens = new ArrayList<GetAddressInfoResponseTokens>();

  public GetAddressInfoResponseUtxos index(BigDecimal index) {
    this.index = index;
    return this;
  }

   /**
   * Index of the UTXO at this address
   * @return index
  **/
  @ApiModelProperty(value = "Index of the UTXO at this address")
  public BigDecimal getIndex() {
    return index;
  }

  public void setIndex(BigDecimal index) {
    this.index = index;
  }

  public GetAddressInfoResponseUtxos txid(String txid) {
    this.txid = txid;
    return this;
  }

   /**
   * Txid of this UTXO
   * @return txid
  **/
  @ApiModelProperty(value = "Txid of this UTXO")
  public String getTxid() {
    return txid;
  }

  public void setTxid(String txid) {
    this.txid = txid;
  }

  public GetAddressInfoResponseUtxos blockheight(BigDecimal blockheight) {
    this.blockheight = blockheight;
    return this;
  }

   /**
   * Blockheight of the UTXO
   * @return blockheight
  **/
  @ApiModelProperty(value = "Blockheight of the UTXO")
  public BigDecimal getBlockheight() {
    return blockheight;
  }

  public void setBlockheight(BigDecimal blockheight) {
    this.blockheight = blockheight;
  }

  public GetAddressInfoResponseUtxos blocktime(BigDecimal blocktime) {
    this.blocktime = blocktime;
    return this;
  }

   /**
   * Blocktime of the UTXO
   * @return blocktime
  **/
  @ApiModelProperty(value = "Blocktime of the UTXO")
  public BigDecimal getBlocktime() {
    return blocktime;
  }

  public void setBlocktime(BigDecimal blocktime) {
    this.blocktime = blocktime;
  }

  public GetAddressInfoResponseUtxos scriptPubKey(Object scriptPubKey) {
    this.scriptPubKey = scriptPubKey;
    return this;
  }

   /**
   * Object representing the scruptPubKey of the UTXO
   * @return scriptPubKey
  **/
  @ApiModelProperty(value = "Object representing the scruptPubKey of the UTXO")
  public Object getScriptPubKey() {
    return scriptPubKey;
  }

  public void setScriptPubKey(Object scriptPubKey) {
    this.scriptPubKey = scriptPubKey;
  }

  public GetAddressInfoResponseUtxos used(Boolean used) {
    this.used = used;
    return this;
  }

   /**
   * Whether the UTXO has been used
   * @return used
  **/
  @ApiModelProperty(value = "Whether the UTXO has been used")
  public Boolean getUsed() {
    return used;
  }

  public void setUsed(Boolean used) {
    this.used = used;
  }

  public GetAddressInfoResponseUtxos value(BigDecimal value) {
    this.value = value;
    return this;
  }

   /**
   * Value of the UTXO in NEBL satoshi
   * @return value
  **/
  @ApiModelProperty(value = "Value of the UTXO in NEBL satoshi")
  public BigDecimal getValue() {
    return value;
  }

  public void setValue(BigDecimal value) {
    this.value = value;
  }

  public GetAddressInfoResponseUtxos tokens(List<GetAddressInfoResponseTokens> tokens) {
    this.tokens = tokens;
    return this;
  }

  public GetAddressInfoResponseUtxos addTokensItem(GetAddressInfoResponseTokens tokensItem) {
    if (this.tokens == null) {
      this.tokens = new ArrayList<GetAddressInfoResponseTokens>();
    }
    this.tokens.add(tokensItem);
    return this;
  }

   /**
   * Array of NTP1 tokens in this UTXO.
   * @return tokens
  **/
  @ApiModelProperty(value = "Array of NTP1 tokens in this UTXO.")
  public List<GetAddressInfoResponseTokens> getTokens() {
    return tokens;
  }

  public void setTokens(List<GetAddressInfoResponseTokens> tokens) {
    this.tokens = tokens;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAddressInfoResponseUtxos getAddressInfoResponseUtxos = (GetAddressInfoResponseUtxos) o;
    return Objects.equals(this.index, getAddressInfoResponseUtxos.index) &&
        Objects.equals(this.txid, getAddressInfoResponseUtxos.txid) &&
        Objects.equals(this.blockheight, getAddressInfoResponseUtxos.blockheight) &&
        Objects.equals(this.blocktime, getAddressInfoResponseUtxos.blocktime) &&
        Objects.equals(this.scriptPubKey, getAddressInfoResponseUtxos.scriptPubKey) &&
        Objects.equals(this.used, getAddressInfoResponseUtxos.used) &&
        Objects.equals(this.value, getAddressInfoResponseUtxos.value) &&
        Objects.equals(this.tokens, getAddressInfoResponseUtxos.tokens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, txid, blockheight, blocktime, scriptPubKey, used, value, tokens);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAddressInfoResponseUtxos {\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    txid: ").append(toIndentedString(txid)).append("\n");
    sb.append("    blockheight: ").append(toIndentedString(blockheight)).append("\n");
    sb.append("    blocktime: ").append(toIndentedString(blocktime)).append("\n");
    sb.append("    scriptPubKey: ").append(toIndentedString(scriptPubKey)).append("\n");
    sb.append("    used: ").append(toIndentedString(used)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    tokens: ").append(toIndentedString(tokens)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

