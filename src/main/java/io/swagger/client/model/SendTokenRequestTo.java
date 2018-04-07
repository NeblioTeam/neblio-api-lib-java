/*
 * Neblio REST API Suite
 * APIs for Interacting with NTP1 Tokens & The Neblio Blockchain
 *
 * OpenAPI spec version: 1.0.0
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
import java.io.IOException;
import java.math.BigDecimal;

/**
 * SendTokenRequestTo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-07T03:04:51.900Z")
public class SendTokenRequestTo {
  @SerializedName("address")
  private String address = null;

  @SerializedName("amount")
  private BigDecimal amount = null;

  @SerializedName("tokenId")
  private String tokenId = null;

  public SendTokenRequestTo address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Address to transfer tokens to
   * @return address
  **/
  @ApiModelProperty(value = "Address to transfer tokens to")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public SendTokenRequestTo amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Number of tokens to send
   * @return amount
  **/
  @ApiModelProperty(value = "Number of tokens to send")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public SendTokenRequestTo tokenId(String tokenId) {
    this.tokenId = tokenId;
    return this;
  }

   /**
   * ID of token we are sending
   * @return tokenId
  **/
  @ApiModelProperty(value = "ID of token we are sending")
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
    SendTokenRequestTo sendTokenRequestTo = (SendTokenRequestTo) o;
    return Objects.equals(this.address, sendTokenRequestTo.address) &&
        Objects.equals(this.amount, sendTokenRequestTo.amount) &&
        Objects.equals(this.tokenId, sendTokenRequestTo.tokenId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, amount, tokenId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendTokenRequestTo {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

