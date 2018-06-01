/*
 * Neblio REST API Suite
 * APIs for Interacting with NTP1 Tokens & The Neblio Blockchain
 *
 * OpenAPI spec version: 1.2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.GetTransactionInfoResponsePreviousOutput;
import io.swagger.client.model.GetTransactionInfoResponseScriptSig;
import io.swagger.client.model.GetTransactionInfoResponseTokens;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * GetTransactionInfoResponseVin
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-01T23:18:44.045Z")
public class GetTransactionInfoResponseVin {
  @SerializedName("txid")
  private String txid = null;

  @SerializedName("vout")
  private BigDecimal vout = null;

  @SerializedName("scriptSig")
  private GetTransactionInfoResponseScriptSig scriptSig = null;

  @SerializedName("sequence")
  private BigDecimal sequence = null;

  @SerializedName("previousOutput")
  private GetTransactionInfoResponsePreviousOutput previousOutput = null;

  @SerializedName("tokens")
  private List<GetTransactionInfoResponseTokens> tokens = null;

  @SerializedName("value")
  private BigDecimal value = null;

  public GetTransactionInfoResponseVin txid(String txid) {
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

  public GetTransactionInfoResponseVin vout(BigDecimal vout) {
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

  public GetTransactionInfoResponseVin scriptSig(GetTransactionInfoResponseScriptSig scriptSig) {
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

  public GetTransactionInfoResponseVin sequence(BigDecimal sequence) {
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

  public GetTransactionInfoResponseVin previousOutput(GetTransactionInfoResponsePreviousOutput previousOutput) {
    this.previousOutput = previousOutput;
    return this;
  }

   /**
   * Get previousOutput
   * @return previousOutput
  **/
  @ApiModelProperty(value = "")
  public GetTransactionInfoResponsePreviousOutput getPreviousOutput() {
    return previousOutput;
  }

  public void setPreviousOutput(GetTransactionInfoResponsePreviousOutput previousOutput) {
    this.previousOutput = previousOutput;
  }

  public GetTransactionInfoResponseVin tokens(List<GetTransactionInfoResponseTokens> tokens) {
    this.tokens = tokens;
    return this;
  }

  public GetTransactionInfoResponseVin addTokensItem(GetTransactionInfoResponseTokens tokensItem) {
    if (this.tokens == null) {
      this.tokens = new ArrayList<GetTransactionInfoResponseTokens>();
    }
    this.tokens.add(tokensItem);
    return this;
  }

   /**
   * Get tokens
   * @return tokens
  **/
  @ApiModelProperty(value = "")
  public List<GetTransactionInfoResponseTokens> getTokens() {
    return tokens;
  }

  public void setTokens(List<GetTransactionInfoResponseTokens> tokens) {
    this.tokens = tokens;
  }

  public GetTransactionInfoResponseVin value(BigDecimal value) {
    this.value = value;
    return this;
  }

   /**
   * Value of input in NEBL satoshi
   * @return value
  **/
  @ApiModelProperty(value = "Value of input in NEBL satoshi")
  public BigDecimal getValue() {
    return value;
  }

  public void setValue(BigDecimal value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTransactionInfoResponseVin getTransactionInfoResponseVin = (GetTransactionInfoResponseVin) o;
    return Objects.equals(this.txid, getTransactionInfoResponseVin.txid) &&
        Objects.equals(this.vout, getTransactionInfoResponseVin.vout) &&
        Objects.equals(this.scriptSig, getTransactionInfoResponseVin.scriptSig) &&
        Objects.equals(this.sequence, getTransactionInfoResponseVin.sequence) &&
        Objects.equals(this.previousOutput, getTransactionInfoResponseVin.previousOutput) &&
        Objects.equals(this.tokens, getTransactionInfoResponseVin.tokens) &&
        Objects.equals(this.value, getTransactionInfoResponseVin.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(txid, vout, scriptSig, sequence, previousOutput, tokens, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTransactionInfoResponseVin {\n");
    
    sb.append("    txid: ").append(toIndentedString(txid)).append("\n");
    sb.append("    vout: ").append(toIndentedString(vout)).append("\n");
    sb.append("    scriptSig: ").append(toIndentedString(scriptSig)).append("\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
    sb.append("    previousOutput: ").append(toIndentedString(previousOutput)).append("\n");
    sb.append("    tokens: ").append(toIndentedString(tokens)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

