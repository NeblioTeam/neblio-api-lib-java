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
import io.swagger.client.model.GetTokenMetadataResponseMetadataOfIssuance;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * GetTokenMetadataResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-07T03:04:51.900Z")
public class GetTokenMetadataResponse {
  @SerializedName("tokenId")
  private String tokenId = null;

  @SerializedName("divisibility")
  private BigDecimal divisibility = null;

  @SerializedName("lockStatus")
  private Boolean lockStatus = null;

  @SerializedName("aggregationPolicy")
  private String aggregationPolicy = null;

  @SerializedName("totalSupply")
  private BigDecimal totalSupply = null;

  @SerializedName("numOfHolders")
  private BigDecimal numOfHolders = null;

  @SerializedName("numOfTransfers")
  private BigDecimal numOfTransfers = null;

  @SerializedName("numofIssuance")
  private BigDecimal numofIssuance = null;

  @SerializedName("numOfBurns")
  private BigDecimal numOfBurns = null;

  @SerializedName("firstBlock")
  private BigDecimal firstBlock = null;

  @SerializedName("issuanceTxid")
  private String issuanceTxid = null;

  @SerializedName("issueAddress")
  private String issueAddress = null;

  @SerializedName("metadataOfIssuance")
  private GetTokenMetadataResponseMetadataOfIssuance metadataOfIssuance = null;

  @SerializedName("metadataOfUtxo")
  private GetTokenMetadataResponseMetadataOfIssuance metadataOfUtxo = null;

  public GetTokenMetadataResponse tokenId(String tokenId) {
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

  public GetTokenMetadataResponse divisibility(BigDecimal divisibility) {
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

  public GetTokenMetadataResponse lockStatus(Boolean lockStatus) {
    this.lockStatus = lockStatus;
    return this;
  }

   /**
   * Whether issuance of more tokens is locked
   * @return lockStatus
  **/
  @ApiModelProperty(value = "Whether issuance of more tokens is locked")
  public Boolean isLockStatus() {
    return lockStatus;
  }

  public void setLockStatus(Boolean lockStatus) {
    this.lockStatus = lockStatus;
  }

  public GetTokenMetadataResponse aggregationPolicy(String aggregationPolicy) {
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

  public GetTokenMetadataResponse totalSupply(BigDecimal totalSupply) {
    this.totalSupply = totalSupply;
    return this;
  }

   /**
   * Total number of tokens in supply
   * @return totalSupply
  **/
  @ApiModelProperty(value = "Total number of tokens in supply")
  public BigDecimal getTotalSupply() {
    return totalSupply;
  }

  public void setTotalSupply(BigDecimal totalSupply) {
    this.totalSupply = totalSupply;
  }

  public GetTokenMetadataResponse numOfHolders(BigDecimal numOfHolders) {
    this.numOfHolders = numOfHolders;
    return this;
  }

   /**
   * Total number of addresses this token is held at
   * @return numOfHolders
  **/
  @ApiModelProperty(value = "Total number of addresses this token is held at")
  public BigDecimal getNumOfHolders() {
    return numOfHolders;
  }

  public void setNumOfHolders(BigDecimal numOfHolders) {
    this.numOfHolders = numOfHolders;
  }

  public GetTokenMetadataResponse numOfTransfers(BigDecimal numOfTransfers) {
    this.numOfTransfers = numOfTransfers;
    return this;
  }

   /**
   * Total number of transactions of this token
   * @return numOfTransfers
  **/
  @ApiModelProperty(value = "Total number of transactions of this token")
  public BigDecimal getNumOfTransfers() {
    return numOfTransfers;
  }

  public void setNumOfTransfers(BigDecimal numOfTransfers) {
    this.numOfTransfers = numOfTransfers;
  }

  public GetTokenMetadataResponse numofIssuance(BigDecimal numofIssuance) {
    this.numofIssuance = numofIssuance;
    return this;
  }

   /**
   * Total number of times this token has been issued
   * @return numofIssuance
  **/
  @ApiModelProperty(value = "Total number of times this token has been issued")
  public BigDecimal getNumofIssuance() {
    return numofIssuance;
  }

  public void setNumofIssuance(BigDecimal numofIssuance) {
    this.numofIssuance = numofIssuance;
  }

  public GetTokenMetadataResponse numOfBurns(BigDecimal numOfBurns) {
    this.numOfBurns = numOfBurns;
    return this;
  }

   /**
   * Number of times tokens have been burned
   * @return numOfBurns
  **/
  @ApiModelProperty(value = "Number of times tokens have been burned")
  public BigDecimal getNumOfBurns() {
    return numOfBurns;
  }

  public void setNumOfBurns(BigDecimal numOfBurns) {
    this.numOfBurns = numOfBurns;
  }

  public GetTokenMetadataResponse firstBlock(BigDecimal firstBlock) {
    this.firstBlock = firstBlock;
    return this;
  }

   /**
   * Block number token was issued in
   * @return firstBlock
  **/
  @ApiModelProperty(value = "Block number token was issued in")
  public BigDecimal getFirstBlock() {
    return firstBlock;
  }

  public void setFirstBlock(BigDecimal firstBlock) {
    this.firstBlock = firstBlock;
  }

  public GetTokenMetadataResponse issuanceTxid(String issuanceTxid) {
    this.issuanceTxid = issuanceTxid;
    return this;
  }

   /**
   * TXID the token was issued with
   * @return issuanceTxid
  **/
  @ApiModelProperty(value = "TXID the token was issued with")
  public String getIssuanceTxid() {
    return issuanceTxid;
  }

  public void setIssuanceTxid(String issuanceTxid) {
    this.issuanceTxid = issuanceTxid;
  }

  public GetTokenMetadataResponse issueAddress(String issueAddress) {
    this.issueAddress = issueAddress;
    return this;
  }

   /**
   * Address that issued the tokens
   * @return issueAddress
  **/
  @ApiModelProperty(value = "Address that issued the tokens")
  public String getIssueAddress() {
    return issueAddress;
  }

  public void setIssueAddress(String issueAddress) {
    this.issueAddress = issueAddress;
  }

  public GetTokenMetadataResponse metadataOfIssuance(GetTokenMetadataResponseMetadataOfIssuance metadataOfIssuance) {
    this.metadataOfIssuance = metadataOfIssuance;
    return this;
  }

   /**
   * Get metadataOfIssuance
   * @return metadataOfIssuance
  **/
  @ApiModelProperty(value = "")
  public GetTokenMetadataResponseMetadataOfIssuance getMetadataOfIssuance() {
    return metadataOfIssuance;
  }

  public void setMetadataOfIssuance(GetTokenMetadataResponseMetadataOfIssuance metadataOfIssuance) {
    this.metadataOfIssuance = metadataOfIssuance;
  }

  public GetTokenMetadataResponse metadataOfUtxo(GetTokenMetadataResponseMetadataOfIssuance metadataOfUtxo) {
    this.metadataOfUtxo = metadataOfUtxo;
    return this;
  }

   /**
   * Get metadataOfUtxo
   * @return metadataOfUtxo
  **/
  @ApiModelProperty(value = "")
  public GetTokenMetadataResponseMetadataOfIssuance getMetadataOfUtxo() {
    return metadataOfUtxo;
  }

  public void setMetadataOfUtxo(GetTokenMetadataResponseMetadataOfIssuance metadataOfUtxo) {
    this.metadataOfUtxo = metadataOfUtxo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTokenMetadataResponse getTokenMetadataResponse = (GetTokenMetadataResponse) o;
    return Objects.equals(this.tokenId, getTokenMetadataResponse.tokenId) &&
        Objects.equals(this.divisibility, getTokenMetadataResponse.divisibility) &&
        Objects.equals(this.lockStatus, getTokenMetadataResponse.lockStatus) &&
        Objects.equals(this.aggregationPolicy, getTokenMetadataResponse.aggregationPolicy) &&
        Objects.equals(this.totalSupply, getTokenMetadataResponse.totalSupply) &&
        Objects.equals(this.numOfHolders, getTokenMetadataResponse.numOfHolders) &&
        Objects.equals(this.numOfTransfers, getTokenMetadataResponse.numOfTransfers) &&
        Objects.equals(this.numofIssuance, getTokenMetadataResponse.numofIssuance) &&
        Objects.equals(this.numOfBurns, getTokenMetadataResponse.numOfBurns) &&
        Objects.equals(this.firstBlock, getTokenMetadataResponse.firstBlock) &&
        Objects.equals(this.issuanceTxid, getTokenMetadataResponse.issuanceTxid) &&
        Objects.equals(this.issueAddress, getTokenMetadataResponse.issueAddress) &&
        Objects.equals(this.metadataOfIssuance, getTokenMetadataResponse.metadataOfIssuance) &&
        Objects.equals(this.metadataOfUtxo, getTokenMetadataResponse.metadataOfUtxo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokenId, divisibility, lockStatus, aggregationPolicy, totalSupply, numOfHolders, numOfTransfers, numofIssuance, numOfBurns, firstBlock, issuanceTxid, issueAddress, metadataOfIssuance, metadataOfUtxo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTokenMetadataResponse {\n");
    
    sb.append("    tokenId: ").append(toIndentedString(tokenId)).append("\n");
    sb.append("    divisibility: ").append(toIndentedString(divisibility)).append("\n");
    sb.append("    lockStatus: ").append(toIndentedString(lockStatus)).append("\n");
    sb.append("    aggregationPolicy: ").append(toIndentedString(aggregationPolicy)).append("\n");
    sb.append("    totalSupply: ").append(toIndentedString(totalSupply)).append("\n");
    sb.append("    numOfHolders: ").append(toIndentedString(numOfHolders)).append("\n");
    sb.append("    numOfTransfers: ").append(toIndentedString(numOfTransfers)).append("\n");
    sb.append("    numofIssuance: ").append(toIndentedString(numofIssuance)).append("\n");
    sb.append("    numOfBurns: ").append(toIndentedString(numOfBurns)).append("\n");
    sb.append("    firstBlock: ").append(toIndentedString(firstBlock)).append("\n");
    sb.append("    issuanceTxid: ").append(toIndentedString(issuanceTxid)).append("\n");
    sb.append("    issueAddress: ").append(toIndentedString(issueAddress)).append("\n");
    sb.append("    metadataOfIssuance: ").append(toIndentedString(metadataOfIssuance)).append("\n");
    sb.append("    metadataOfUtxo: ").append(toIndentedString(metadataOfUtxo)).append("\n");
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

