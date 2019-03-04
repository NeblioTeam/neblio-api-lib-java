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

/**
 * BurnTokenRequestBurn
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-03-04T02:29:08.708Z[UTC]")
public class BurnTokenRequestBurn {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private BigDecimal amount;

  public static final String SERIALIZED_NAME_TOKEN_ID = "tokenId";
  @SerializedName(SERIALIZED_NAME_TOKEN_ID)
  private String tokenId;

  public BurnTokenRequestBurn amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Amount of tokens to burn
   * @return amount
  **/
  @ApiModelProperty(value = "Amount of tokens to burn")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public BurnTokenRequestBurn tokenId(String tokenId) {
    this.tokenId = tokenId;
    return this;
  }

   /**
   * Unique token id we are burning
   * @return tokenId
  **/
  @ApiModelProperty(value = "Unique token id we are burning")
  public String getTokenId() {
    return tokenId;
  }

  public void setTokenId(String tokenId) {
    this.tokenId = tokenId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BurnTokenRequestBurn burnTokenRequestBurn = (BurnTokenRequestBurn) o;
    return Objects.equals(this.amount, burnTokenRequestBurn.amount) &&
        Objects.equals(this.tokenId, burnTokenRequestBurn.tokenId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, tokenId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BurnTokenRequestBurn {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    tokenId: ").append(toIndentedString(tokenId)).append("\n");
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

