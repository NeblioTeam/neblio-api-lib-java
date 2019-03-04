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
 * BroadcastTxResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-03-04T00:35:41.443Z[UTC]")
public class BroadcastTxResponse {
  public static final String SERIALIZED_NAME_TXID = "txid";
  @SerializedName(SERIALIZED_NAME_TXID)
  private String txid;

  public BroadcastTxResponse txid(String txid) {
    this.txid = txid;
    return this;
  }

   /**
   * Txid of successfully broadcasted transaction
   * @return txid
  **/
  @ApiModelProperty(value = "Txid of successfully broadcasted transaction")
  public String getTxid() {
    return txid;
  }

  public void setTxid(String txid) {
    this.txid = txid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BroadcastTxResponse broadcastTxResponse = (BroadcastTxResponse) o;
    return Objects.equals(this.txid, broadcastTxResponse.txid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(txid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BroadcastTxResponse {\n");
    sb.append("    txid: ").append(toIndentedString(txid)).append("\n");
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

