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
import io.nebl.neblioapi.models.GetTransactionInfoResponseScriptSig;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * GetTxResponseVin
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-03-03T23:42:59.729Z[UTC]")
public class GetTxResponseVin {
  public static final String SERIALIZED_NAME_TXID = "txid";
  @SerializedName(SERIALIZED_NAME_TXID)
  private String txid;

  public static final String SERIALIZED_NAME_VOUT = "vout";
  @SerializedName(SERIALIZED_NAME_VOUT)
  private BigDecimal vout;

  public static final String SERIALIZED_NAME_SCRIPT_SIG = "scriptSig";
  @SerializedName(SERIALIZED_NAME_SCRIPT_SIG)
  private GetTransactionInfoResponseScriptSig scriptSig = null;

  public static final String SERIALIZED_NAME_SEQUENCE = "sequence";
  @SerializedName(SERIALIZED_NAME_SEQUENCE)
  private BigDecimal sequence;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private BigDecimal value;

  public static final String SERIALIZED_NAME_VALUE_SAT = "valueSat";
  @SerializedName(SERIALIZED_NAME_VALUE_SAT)
  private BigDecimal valueSat;

  public static final String SERIALIZED_NAME_N = "n";
  @SerializedName(SERIALIZED_NAME_N)
  private BigDecimal n;

  public GetTxResponseVin txid(String txid) {
    this.txid = txid;
    return this;
  }

   /**
   * TXID of the input
   * @return txid
  **/
  @ApiModelProperty(value = "TXID of the input")
  public String getTxid() {
    return txid;
  }

  public void setTxid(String txid) {
    this.txid = txid;
  }

  public GetTxResponseVin vout(BigDecimal vout) {
    this.vout = vout;
    return this;
  }

   /**
   * output index
   * @return vout
  **/
  @ApiModelProperty(value = "output index")
  public BigDecimal getVout() {
    return vout;
  }

  public void setVout(BigDecimal vout) {
    this.vout = vout;
  }

  public GetTxResponseVin scriptSig(GetTransactionInfoResponseScriptSig scriptSig) {
    this.scriptSig = scriptSig;
    return this;
  }

   /**
   * Get scriptSig
   * @return scriptSig
  **/
  @ApiModelProperty(value = "")
  public GetTransactionInfoResponseScriptSig getScriptSig() {
    return scriptSig;
  }

  public void setScriptSig(GetTransactionInfoResponseScriptSig scriptSig) {
    this.scriptSig = scriptSig;
  }

  public GetTxResponseVin sequence(BigDecimal sequence) {
    this.sequence = sequence;
    return this;
  }

   /**
   * Get sequence
   * @return sequence
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getSequence() {
    return sequence;
  }

  public void setSequence(BigDecimal sequence) {
    this.sequence = sequence;
  }

  public GetTxResponseVin value(BigDecimal value) {
    this.value = value;
    return this;
  }

   /**
   * Value of input in NEBL
   * @return value
  **/
  @ApiModelProperty(value = "Value of input in NEBL")
  public BigDecimal getValue() {
    return value;
  }

  public void setValue(BigDecimal value) {
    this.value = value;
  }

  public GetTxResponseVin valueSat(BigDecimal valueSat) {
    this.valueSat = valueSat;
    return this;
  }

   /**
   * Value of input in NEBL satoshi
   * @return valueSat
  **/
  @ApiModelProperty(value = "Value of input in NEBL satoshi")
  public BigDecimal getValueSat() {
    return valueSat;
  }

  public void setValueSat(BigDecimal valueSat) {
    this.valueSat = valueSat;
  }

  public GetTxResponseVin n(BigDecimal n) {
    this.n = n;
    return this;
  }

   /**
   * input index
   * @return n
  **/
  @ApiModelProperty(value = "input index")
  public BigDecimal getN() {
    return n;
  }

  public void setN(BigDecimal n) {
    this.n = n;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTxResponseVin getTxResponseVin = (GetTxResponseVin) o;
    return Objects.equals(this.txid, getTxResponseVin.txid) &&
        Objects.equals(this.vout, getTxResponseVin.vout) &&
        Objects.equals(this.scriptSig, getTxResponseVin.scriptSig) &&
        Objects.equals(this.sequence, getTxResponseVin.sequence) &&
        Objects.equals(this.value, getTxResponseVin.value) &&
        Objects.equals(this.valueSat, getTxResponseVin.valueSat) &&
        Objects.equals(this.n, getTxResponseVin.n);
  }

  @Override
  public int hashCode() {
    return Objects.hash(txid, vout, scriptSig, sequence, value, valueSat, n);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTxResponseVin {\n");
    sb.append("    txid: ").append(toIndentedString(txid)).append("\n");
    sb.append("    vout: ").append(toIndentedString(vout)).append("\n");
    sb.append("    scriptSig: ").append(toIndentedString(scriptSig)).append("\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    valueSat: ").append(toIndentedString(valueSat)).append("\n");
    sb.append("    n: ").append(toIndentedString(n)).append("\n");
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
