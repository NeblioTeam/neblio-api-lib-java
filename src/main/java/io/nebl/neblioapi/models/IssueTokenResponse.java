/*
 * Neblio REST API Suite
 * APIs for Interacting with NTP1 Tokens & The Neblio Blockchain
 *
 * OpenAPI spec version: 1.2.2
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
 * IssueTokenResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-05-07T22:19:41.714Z[UTC]")
public class IssueTokenResponse {
  public static final String SERIALIZED_NAME_TOKEN_ID = "tokenId";
  @SerializedName(SERIALIZED_NAME_TOKEN_ID)
  private String tokenId;

  public static final String SERIALIZED_NAME_TX_HEX = "txHex";
  @SerializedName(SERIALIZED_NAME_TX_HEX)
  private String txHex;

  public IssueTokenResponse tokenId(String tokenId) {
    this.tokenId = tokenId;
    return this;
  }

   /**
   * TokenId of the to be issued token
   * @return tokenId
  **/
  @ApiModelProperty(value = "TokenId of the to be issued token")
  public String getTokenId() {
    return tokenId;
  }

  public void setTokenId(String tokenId) {
    this.tokenId = tokenId;
  }

  public IssueTokenResponse txHex(String txHex) {
    this.txHex = txHex;
    return this;
  }

   /**
   * Unsigned, raw transaction hex of the transaction to issue the token
   * @return txHex
  **/
  @ApiModelProperty(value = "Unsigned, raw transaction hex of the transaction to issue the token")
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
    IssueTokenResponse issueTokenResponse = (IssueTokenResponse) o;
    return Objects.equals(this.tokenId, issueTokenResponse.tokenId) &&
        Objects.equals(this.txHex, issueTokenResponse.txHex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokenId, txHex);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueTokenResponse {\n");
    sb.append("    tokenId: ").append(toIndentedString(tokenId)).append("\n");
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

