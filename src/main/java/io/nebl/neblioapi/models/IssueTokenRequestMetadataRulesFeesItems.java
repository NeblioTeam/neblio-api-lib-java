/*
 * Neblio REST API Suite
 * APIs for Interacting with NTP1 Tokens & The Neblio Blockchain
 *
 * OpenAPI spec version: 1.2.4
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
 * IssueTokenRequestMetadataRulesFeesItems
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-05-08T22:22:47.924Z[UTC]")
public class IssueTokenRequestMetadataRulesFeesItems {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_TOKEN_ID = "tokenId";
  @SerializedName(SERIALIZED_NAME_TOKEN_ID)
  private String tokenId;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public IssueTokenRequestMetadataRulesFeesItems address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Address fee is auto sent to
   * @return address
  **/
  @ApiModelProperty(value = "Address fee is auto sent to")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public IssueTokenRequestMetadataRulesFeesItems tokenId(String tokenId) {
    this.tokenId = tokenId;
    return this;
  }

   /**
   * How fee should be paid, either with a tokenId, or with NEBL if null
   * @return tokenId
  **/
  @ApiModelProperty(value = "How fee should be paid, either with a tokenId, or with NEBL if null")
  public String getTokenId() {
    return tokenId;
  }

  public void setTokenId(String tokenId) {
    this.tokenId = tokenId;
  }

  public IssueTokenRequestMetadataRulesFeesItems value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Amount of NTP1 token, or NEBL (in satoshi) to pay as fee
   * @return value
  **/
  @ApiModelProperty(value = "Amount of NTP1 token, or NEBL (in satoshi) to pay as fee")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueTokenRequestMetadataRulesFeesItems issueTokenRequestMetadataRulesFeesItems = (IssueTokenRequestMetadataRulesFeesItems) o;
    return Objects.equals(this.address, issueTokenRequestMetadataRulesFeesItems.address) &&
        Objects.equals(this.tokenId, issueTokenRequestMetadataRulesFeesItems.tokenId) &&
        Objects.equals(this.value, issueTokenRequestMetadataRulesFeesItems.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, tokenId, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueTokenRequestMetadataRulesFeesItems {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    tokenId: ").append(toIndentedString(tokenId)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

