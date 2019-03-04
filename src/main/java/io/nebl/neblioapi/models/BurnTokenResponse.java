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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * BurnTokenResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-03-04T05:08:16.752Z[UTC]")
public class BurnTokenResponse {
  public static final String SERIALIZED_NAME_TX_HEX = "txHex";
  @SerializedName(SERIALIZED_NAME_TX_HEX)
  private String txHex;

  public static final String SERIALIZED_NAME_NTP1_OUTPUT_INDEXES = "ntp1OutputIndexes";
  @SerializedName(SERIALIZED_NAME_NTP1_OUTPUT_INDEXES)
  private List<BigDecimal> ntp1OutputIndexes = new ArrayList<BigDecimal>();

  public static final String SERIALIZED_NAME_MULTISIG_OUTPUTS = "multisigOutputs";
  @SerializedName(SERIALIZED_NAME_MULTISIG_OUTPUTS)
  private List<BigDecimal> multisigOutputs = new ArrayList<BigDecimal>();

  public BurnTokenResponse txHex(String txHex) {
    this.txHex = txHex;
    return this;
  }

   /**
   * Unsigned, raw transaction hex of the transaction to burn the token
   * @return txHex
  **/
  @ApiModelProperty(value = "Unsigned, raw transaction hex of the transaction to burn the token")
  public String getTxHex() {
    return txHex;
  }

  public void setTxHex(String txHex) {
    this.txHex = txHex;
  }

  public BurnTokenResponse ntp1OutputIndexes(List<BigDecimal> ntp1OutputIndexes) {
    this.ntp1OutputIndexes = ntp1OutputIndexes;
    return this;
  }

  public BurnTokenResponse addNtp1OutputIndexesItem(BigDecimal ntp1OutputIndexesItem) {
    if (this.ntp1OutputIndexes == null) {
      this.ntp1OutputIndexes = new ArrayList<BigDecimal>();
    }
    this.ntp1OutputIndexes.add(ntp1OutputIndexesItem);
    return this;
  }

   /**
   * Array of indexes transfering NTP1 tokens
   * @return ntp1OutputIndexes
  **/
  @ApiModelProperty(value = "Array of indexes transfering NTP1 tokens")
  public List<BigDecimal> getNtp1OutputIndexes() {
    return ntp1OutputIndexes;
  }

  public void setNtp1OutputIndexes(List<BigDecimal> ntp1OutputIndexes) {
    this.ntp1OutputIndexes = ntp1OutputIndexes;
  }

  public BurnTokenResponse multisigOutputs(List<BigDecimal> multisigOutputs) {
    this.multisigOutputs = multisigOutputs;
    return this;
  }

  public BurnTokenResponse addMultisigOutputsItem(BigDecimal multisigOutputsItem) {
    if (this.multisigOutputs == null) {
      this.multisigOutputs = new ArrayList<BigDecimal>();
    }
    this.multisigOutputs.add(multisigOutputsItem);
    return this;
  }

   /**
   * Array of indexes of multisig outputs
   * @return multisigOutputs
  **/
  @ApiModelProperty(value = "Array of indexes of multisig outputs")
  public List<BigDecimal> getMultisigOutputs() {
    return multisigOutputs;
  }

  public void setMultisigOutputs(List<BigDecimal> multisigOutputs) {
    this.multisigOutputs = multisigOutputs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BurnTokenResponse burnTokenResponse = (BurnTokenResponse) o;
    return Objects.equals(this.txHex, burnTokenResponse.txHex) &&
        Objects.equals(this.ntp1OutputIndexes, burnTokenResponse.ntp1OutputIndexes) &&
        Objects.equals(this.multisigOutputs, burnTokenResponse.multisigOutputs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(txHex, ntp1OutputIndexes, multisigOutputs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BurnTokenResponse {\n");
    sb.append("    txHex: ").append(toIndentedString(txHex)).append("\n");
    sb.append("    ntp1OutputIndexes: ").append(toIndentedString(ntp1OutputIndexes)).append("\n");
    sb.append("    multisigOutputs: ").append(toIndentedString(multisigOutputs)).append("\n");
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

