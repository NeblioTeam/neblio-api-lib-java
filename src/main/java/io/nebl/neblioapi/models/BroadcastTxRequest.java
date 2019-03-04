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

/**
 * BroadcastTxRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-03-04T00:43:12.517Z[UTC]")
public class BroadcastTxRequest {
  public static final String SERIALIZED_NAME_TX_HEX = "txHex";
  @SerializedName(SERIALIZED_NAME_TX_HEX)
  private String txHex;

  public BroadcastTxRequest txHex(String txHex) {
    this.txHex = txHex;
    return this;
  }

   /**
   * Signed raw tx hex to broadcast
   * @return txHex
  **/
  @ApiModelProperty(required = true, value = "Signed raw tx hex to broadcast")
  public String getTxHex() {
    return txHex;
  }

  public void setTxHex(String txHex) {
    this.txHex = txHex;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BroadcastTxRequest broadcastTxRequest = (BroadcastTxRequest) o;
    return Objects.equals(this.txHex, broadcastTxRequest.txHex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(txHex);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BroadcastTxRequest {\n");
    sb.append("    txHex: ").append(toIndentedString(txHex)).append("\n");
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

