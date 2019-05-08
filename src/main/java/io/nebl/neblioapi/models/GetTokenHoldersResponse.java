/*
 * Neblio REST API Suite
 * APIs for Interacting with NTP1 Tokens & The Neblio Blockchain
 *
 * OpenAPI spec version: 1.2.3
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
import io.nebl.neblioapi.models.GetTokenHoldersResponseHolders;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * GetTokenHoldersResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-05-08T22:14:06.585Z[UTC]")
public class GetTokenHoldersResponse {
  public static final String SERIALIZED_NAME_TOKEN_ID = "tokenId";
  @SerializedName(SERIALIZED_NAME_TOKEN_ID)
  private String tokenId;

  public static final String SERIALIZED_NAME_HOLDERS = "holders";
  @SerializedName(SERIALIZED_NAME_HOLDERS)
  private List<GetTokenHoldersResponseHolders> holders = new ArrayList<GetTokenHoldersResponseHolders>();

  public static final String SERIALIZED_NAME_DIVIBILITY = "divibility";
  @SerializedName(SERIALIZED_NAME_DIVIBILITY)
  private BigDecimal divibility;

  public static final String SERIALIZED_NAME_LOCK_STATUS = "lockStatus";
  @SerializedName(SERIALIZED_NAME_LOCK_STATUS)
  private Boolean lockStatus;

  public static final String SERIALIZED_NAME_AGGREGATION_POLICY = "aggregationPolicy";
  @SerializedName(SERIALIZED_NAME_AGGREGATION_POLICY)
  private String aggregationPolicy;

  public static final String SERIALIZED_NAME_SOME_UTXO = "someUtxo";
  @SerializedName(SERIALIZED_NAME_SOME_UTXO)
  private String someUtxo;

  public GetTokenHoldersResponse tokenId(String tokenId) {
    this.tokenId = tokenId;
    return this;
  }

   /**
   * TokenId of the token
   * @return tokenId
  **/
  @ApiModelProperty(value = "TokenId of the token")
  public String getTokenId() {
    return tokenId;
  }

  public void setTokenId(String tokenId) {
    this.tokenId = tokenId;
  }

  public GetTokenHoldersResponse holders(List<GetTokenHoldersResponseHolders> holders) {
    this.holders = holders;
    return this;
  }

  public GetTokenHoldersResponse addHoldersItem(GetTokenHoldersResponseHolders holdersItem) {
    if (this.holders == null) {
      this.holders = new ArrayList<GetTokenHoldersResponseHolders>();
    }
    this.holders.add(holdersItem);
    return this;
  }

   /**
   * Get holders
   * @return holders
  **/
  @ApiModelProperty(value = "")
  public List<GetTokenHoldersResponseHolders> getHolders() {
    return holders;
  }

  public void setHolders(List<GetTokenHoldersResponseHolders> holders) {
    this.holders = holders;
  }

  public GetTokenHoldersResponse divibility(BigDecimal divibility) {
    this.divibility = divibility;
    return this;
  }

   /**
   * How many decimal points the token is divisble to
   * @return divibility
  **/
  @ApiModelProperty(value = "How many decimal points the token is divisble to")
  public BigDecimal getDivibility() {
    return divibility;
  }

  public void setDivibility(BigDecimal divibility) {
    this.divibility = divibility;
  }

  public GetTokenHoldersResponse lockStatus(Boolean lockStatus) {
    this.lockStatus = lockStatus;
    return this;
  }

   /**
   * Whether new issuances of this token are locked
   * @return lockStatus
  **/
  @ApiModelProperty(value = "Whether new issuances of this token are locked")
  public Boolean getLockStatus() {
    return lockStatus;
  }

  public void setLockStatus(Boolean lockStatus) {
    this.lockStatus = lockStatus;
  }

  public GetTokenHoldersResponse aggregationPolicy(String aggregationPolicy) {
    this.aggregationPolicy = aggregationPolicy;
    return this;
  }

   /**
   * Whether the tokesn are aggregatable
   * @return aggregationPolicy
  **/
  @ApiModelProperty(value = "Whether the tokesn are aggregatable")
  public String getAggregationPolicy() {
    return aggregationPolicy;
  }

  public void setAggregationPolicy(String aggregationPolicy) {
    this.aggregationPolicy = aggregationPolicy;
  }

  public GetTokenHoldersResponse someUtxo(String someUtxo) {
    this.someUtxo = someUtxo;
    return this;
  }

   /**
   * A UTXO of this token
   * @return someUtxo
  **/
  @ApiModelProperty(value = "A UTXO of this token")
  public String getSomeUtxo() {
    return someUtxo;
  }

  public void setSomeUtxo(String someUtxo) {
    this.someUtxo = someUtxo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTokenHoldersResponse getTokenHoldersResponse = (GetTokenHoldersResponse) o;
    return Objects.equals(this.tokenId, getTokenHoldersResponse.tokenId) &&
        Objects.equals(this.holders, getTokenHoldersResponse.holders) &&
        Objects.equals(this.divibility, getTokenHoldersResponse.divibility) &&
        Objects.equals(this.lockStatus, getTokenHoldersResponse.lockStatus) &&
        Objects.equals(this.aggregationPolicy, getTokenHoldersResponse.aggregationPolicy) &&
        Objects.equals(this.someUtxo, getTokenHoldersResponse.someUtxo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokenId, holders, divibility, lockStatus, aggregationPolicy, someUtxo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTokenHoldersResponse {\n");
    sb.append("    tokenId: ").append(toIndentedString(tokenId)).append("\n");
    sb.append("    holders: ").append(toIndentedString(holders)).append("\n");
    sb.append("    divibility: ").append(toIndentedString(divibility)).append("\n");
    sb.append("    lockStatus: ").append(toIndentedString(lockStatus)).append("\n");
    sb.append("    aggregationPolicy: ").append(toIndentedString(aggregationPolicy)).append("\n");
    sb.append("    someUtxo: ").append(toIndentedString(someUtxo)).append("\n");
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

