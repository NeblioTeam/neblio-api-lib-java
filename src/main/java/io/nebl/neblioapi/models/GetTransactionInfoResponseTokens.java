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
 * GetTransactionInfoResponseTokens
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-03-04T01:54:04.924Z[UTC]")
public class GetTransactionInfoResponseTokens {
  public static final String SERIALIZED_NAME_TOKEN_ID = "tokenId";
  @SerializedName(SERIALIZED_NAME_TOKEN_ID)
  private String tokenId;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private BigDecimal amount;

  public static final String SERIALIZED_NAME_ISSUE_TXID = "issueTxid";
  @SerializedName(SERIALIZED_NAME_ISSUE_TXID)
  private String issueTxid;

  public static final String SERIALIZED_NAME_DIVISIBILITY = "divisibility";
  @SerializedName(SERIALIZED_NAME_DIVISIBILITY)
  private BigDecimal divisibility;

  public static final String SERIALIZED_NAME_LOCK_STATUS = "lockStatus";
  @SerializedName(SERIALIZED_NAME_LOCK_STATUS)
  private Boolean lockStatus;

  public static final String SERIALIZED_NAME_AGGREGATION_POLICY = "aggregationPolicy";
  @SerializedName(SERIALIZED_NAME_AGGREGATION_POLICY)
  private String aggregationPolicy;

  public GetTransactionInfoResponseTokens tokenId(String tokenId) {
    this.tokenId = tokenId;
    return this;
  }

   /**
   * ID of the token
   * @return tokenId
  **/
  @ApiModelProperty(value = "ID of the token")
  public String getTokenId() {
    return tokenId;
  }

  public void setTokenId(String tokenId) {
    this.tokenId = tokenId;
  }

  public GetTransactionInfoResponseTokens amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Number of tokens
   * @return amount
  **/
  @ApiModelProperty(value = "Number of tokens")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public GetTransactionInfoResponseTokens issueTxid(String issueTxid) {
    this.issueTxid = issueTxid;
    return this;
  }

   /**
   * TXID the token was issued in
   * @return issueTxid
  **/
  @ApiModelProperty(value = "TXID the token was issued in")
  public String getIssueTxid() {
    return issueTxid;
  }

  public void setIssueTxid(String issueTxid) {
    this.issueTxid = issueTxid;
  }

  public GetTransactionInfoResponseTokens divisibility(BigDecimal divisibility) {
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

  public GetTransactionInfoResponseTokens lockStatus(Boolean lockStatus) {
    this.lockStatus = lockStatus;
    return this;
  }

   /**
   * Whether issuance of more tokens is locked
   * @return lockStatus
  **/
  @ApiModelProperty(value = "Whether issuance of more tokens is locked")
  public Boolean getLockStatus() {
    return lockStatus;
  }

  public void setLockStatus(Boolean lockStatus) {
    this.lockStatus = lockStatus;
  }

  public GetTransactionInfoResponseTokens aggregationPolicy(String aggregationPolicy) {
    this.aggregationPolicy = aggregationPolicy;
    return this;
  }

   /**
   * Whether the tokens are aggregatable
   * @return aggregationPolicy
  **/
  @ApiModelProperty(value = "Whether the tokens are aggregatable")
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
    GetTransactionInfoResponseTokens getTransactionInfoResponseTokens = (GetTransactionInfoResponseTokens) o;
    return Objects.equals(this.tokenId, getTransactionInfoResponseTokens.tokenId) &&
        Objects.equals(this.amount, getTransactionInfoResponseTokens.amount) &&
        Objects.equals(this.issueTxid, getTransactionInfoResponseTokens.issueTxid) &&
        Objects.equals(this.divisibility, getTransactionInfoResponseTokens.divisibility) &&
        Objects.equals(this.lockStatus, getTransactionInfoResponseTokens.lockStatus) &&
        Objects.equals(this.aggregationPolicy, getTransactionInfoResponseTokens.aggregationPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokenId, amount, issueTxid, divisibility, lockStatus, aggregationPolicy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTransactionInfoResponseTokens {\n");
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

