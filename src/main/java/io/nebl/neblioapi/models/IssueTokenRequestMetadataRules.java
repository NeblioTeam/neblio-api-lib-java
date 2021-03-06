/*
 * Neblio REST API Suite
 * APIs for Interacting with NTP1 Tokens & The Neblio Blockchain
 *
 * OpenAPI spec version: 1.3.0
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
import io.nebl.neblioapi.models.IssueTokenRequestMetadataRulesExpiration;
import io.nebl.neblioapi.models.IssueTokenRequestMetadataRulesFees;
import io.nebl.neblioapi.models.IssueTokenRequestMetadataRulesHolders;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Object describing token rules
 */
@ApiModel(description = "Object describing token rules")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-07T00:42:34.446043Z[UTC]")
public class IssueTokenRequestMetadataRules {
  public static final String SERIALIZED_NAME_FEES = "fees";
  @SerializedName(SERIALIZED_NAME_FEES)
  private IssueTokenRequestMetadataRulesFees fees = null;

  public static final String SERIALIZED_NAME_HOLDERS = "holders";
  @SerializedName(SERIALIZED_NAME_HOLDERS)
  private List<IssueTokenRequestMetadataRulesHolders> holders = new ArrayList<IssueTokenRequestMetadataRulesHolders>();

  public static final String SERIALIZED_NAME_EXPIRATION = "expiration";
  @SerializedName(SERIALIZED_NAME_EXPIRATION)
  private IssueTokenRequestMetadataRulesExpiration expiration = null;

  public IssueTokenRequestMetadataRules fees(IssueTokenRequestMetadataRulesFees fees) {
    this.fees = fees;
    return this;
  }

   /**
   * Get fees
   * @return fees
  **/
  @ApiModelProperty(value = "")
  public IssueTokenRequestMetadataRulesFees getFees() {
    return fees;
  }

  public void setFees(IssueTokenRequestMetadataRulesFees fees) {
    this.fees = fees;
  }

  public IssueTokenRequestMetadataRules holders(List<IssueTokenRequestMetadataRulesHolders> holders) {
    this.holders = holders;
    return this;
  }

  public IssueTokenRequestMetadataRules addHoldersItem(IssueTokenRequestMetadataRulesHolders holdersItem) {
    if (this.holders == null) {
      this.holders = new ArrayList<IssueTokenRequestMetadataRulesHolders>();
    }
    this.holders.add(holdersItem);
    return this;
  }

   /**
   * Array of objects describing what addresses can hold the token
   * @return holders
  **/
  @ApiModelProperty(value = "Array of objects describing what addresses can hold the token")
  public List<IssueTokenRequestMetadataRulesHolders> getHolders() {
    return holders;
  }

  public void setHolders(List<IssueTokenRequestMetadataRulesHolders> holders) {
    this.holders = holders;
  }

  public IssueTokenRequestMetadataRules expiration(IssueTokenRequestMetadataRulesExpiration expiration) {
    this.expiration = expiration;
    return this;
  }

   /**
   * Get expiration
   * @return expiration
  **/
  @ApiModelProperty(value = "")
  public IssueTokenRequestMetadataRulesExpiration getExpiration() {
    return expiration;
  }

  public void setExpiration(IssueTokenRequestMetadataRulesExpiration expiration) {
    this.expiration = expiration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueTokenRequestMetadataRules issueTokenRequestMetadataRules = (IssueTokenRequestMetadataRules) o;
    return Objects.equals(this.fees, issueTokenRequestMetadataRules.fees) &&
        Objects.equals(this.holders, issueTokenRequestMetadataRules.holders) &&
        Objects.equals(this.expiration, issueTokenRequestMetadataRules.expiration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fees, holders, expiration);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueTokenRequestMetadataRules {\n");
    sb.append("    fees: ").append(toIndentedString(fees)).append("\n");
    sb.append("    holders: ").append(toIndentedString(holders)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
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

