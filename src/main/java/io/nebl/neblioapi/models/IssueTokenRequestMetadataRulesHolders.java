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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * IssueTokenRequestMetadataRulesHolders
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-07T00:42:34.446043Z[UTC]")
public class IssueTokenRequestMetadataRulesHolders {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_LOCKED = "locked";
  @SerializedName(SERIALIZED_NAME_LOCKED)
  private Boolean locked;

  public IssueTokenRequestMetadataRulesHolders address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Address that can hold the token
   * @return address
  **/
  @ApiModelProperty(value = "Address that can hold the token")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public IssueTokenRequestMetadataRulesHolders locked(Boolean locked) {
    this.locked = locked;
    return this;
  }

   /**
   * Whether this rule can be modified in future transactions
   * @return locked
  **/
  @ApiModelProperty(value = "Whether this rule can be modified in future transactions")
  public Boolean getLocked() {
    return locked;
  }

  public void setLocked(Boolean locked) {
    this.locked = locked;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueTokenRequestMetadataRulesHolders issueTokenRequestMetadataRulesHolders = (IssueTokenRequestMetadataRulesHolders) o;
    return Objects.equals(this.address, issueTokenRequestMetadataRulesHolders.address) &&
        Objects.equals(this.locked, issueTokenRequestMetadataRulesHolders.locked);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, locked);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueTokenRequestMetadataRulesHolders {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
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

