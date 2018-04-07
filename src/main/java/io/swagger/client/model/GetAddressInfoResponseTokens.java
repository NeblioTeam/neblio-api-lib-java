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
 * GetAddressInfoResponseTokens
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-07T03:04:51.900Z")
public class GetAddressInfoResponseTokens {
  @SerializedName("tokenId")
  private String tokenId = null;

  @SerializedName("amount")
  private BigDecimal amount = null;

  @SerializedName("issueTxid")
  private String issueTxid = null;

  @SerializedName("divisibility")
  private BigDecimal divisibility = null;

  @SerializedName("lockStatus")
  private Boolean lockStatus = null;

  @SerializedName("aggregationPolicy")
  private String aggregationPolicy = null;

  public GetAddressInfoResponseTokens tokenId(String tokenId) {
    this.tokenId = tokenId;
    return this;
  }

   /**
   * Unique NTP1 identifier for this token
   * @return tokenId
  **/
  @ApiModelProperty(value = "Unique NTP1 identifier for this token")
  public String getTokenId() {
    return tokenId;
  }

  public void setTokenId(String tokenId) {
    this.tokenId = tokenId;
  }

  public GetAddressInfoResponseTokens amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Number of Tokens
   * @return amount
  **/
  @ApiModelProperty(value = "Number of Tokens")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public GetAddressInfoResponseTokens issueTxid(String issueTxid) {
    this.issueTxid = issueTxid;
    return this;
  }

   /**
   * TXID the token originally was issued in
   * @return issueTxid
  **/
  @ApiModelProperty(value = "TXID the token originally was issued in")
  public String getIssueTxid() {
    return issueTxid;
  }

  public void setIssueTxid(String issueTxid) {
    this.issueTxid = issueTxid;
  }

  public GetAddressInfoResponseTokens divisibility(BigDecimal divisibility) {
    this.divisibility = divisibility;
    return this;
  }

   /**
   * Decimal places the token is divisible to
   * @return divisibility
  **/
  @ApiModelProperty(value = "Decimal places the token is divisible to")
  public BigDecimal getDivisibility() {
    return divisibility;
  }

  public void setDivisibility(BigDecimal divisibility) {
    this.divisibility = divisibility;
  }

  public GetAddressInfoResponseTokens lockStatus(Boolean lockStatus) {
    this.lockStatus = lockStatus;
    return this;
  }

   /**
   * Whether the token is locked, preventing more from being issued
   * @return lockStatus
  **/
  @ApiModelProperty(value = "Whether the token is locked, preventing more from being issued")
  public Boolean isLockStatus() {
    return lockStatus;
  }

  public void setLockStatus(Boolean lockStatus) {
    this.lockStatus = lockStatus;
  }

  public GetAddressInfoResponseTokens aggregationPolicy(String aggregationPolicy) {
    this.aggregationPolicy = aggregationPolicy;
    return this;
  }

   /**
   * Whether the tokens can be aggregated together
   * @return aggregationPolicy
  **/
  @ApiModelProperty(value = "Whether the tokens can be aggregated together")
  public String getAggregationPolicy() {
    return aggregationPolicy;
  }

  public void setAggregationPolicy(String aggregationPolicy) {
    this.aggregationPolicy = aggregationPolicy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAddressInfoResponseTokens getAddressInfoResponseTokens = (GetAddressInfoResponseTokens) o;
    return Objects.equals(this.tokenId, getAddressInfoResponseTokens.tokenId) &&
        Objects.equals(this.amount, getAddressInfoResponseTokens.amount) &&
        Objects.equals(this.issueTxid, getAddressInfoResponseTokens.issueTxid) &&
        Objects.equals(this.divisibility, getAddressInfoResponseTokens.divisibility) &&
        Objects.equals(this.lockStatus, getAddressInfoResponseTokens.lockStatus) &&
        Objects.equals(this.aggregationPolicy, getAddressInfoResponseTokens.aggregationPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokenId, amount, issueTxid, divisibility, lockStatus, aggregationPolicy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAddressInfoResponseTokens {\n");
    
    sb.append("    tokenId: ").append(toIndentedString(tokenId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    issueTxid: ").append(toIndentedString(issueTxid)).append("\n");
    sb.append("    divisibility: ").append(toIndentedString(divisibility)).append("\n");
    sb.append("    lockStatus: ").append(toIndentedString(lockStatus)).append("\n");
    sb.append("    aggregationPolicy: ").append(toIndentedString(aggregationPolicy)).append("\n");
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

