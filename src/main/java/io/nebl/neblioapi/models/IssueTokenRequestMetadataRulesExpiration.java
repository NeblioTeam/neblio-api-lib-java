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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * Object describing expiration rules of the token
 */
@ApiModel(description = "Object describing expiration rules of the token")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-05-08T22:14:06.585Z[UTC]")
public class IssueTokenRequestMetadataRulesExpiration {
  public static final String SERIALIZED_NAME_VALID_UNTIL = "validUntil";
  @SerializedName(SERIALIZED_NAME_VALID_UNTIL)
  private BigDecimal validUntil;

  public static final String SERIALIZED_NAME_LOCKED = "locked";
  @SerializedName(SERIALIZED_NAME_LOCKED)
  private Boolean locked;

  public IssueTokenRequestMetadataRulesExpiration validUntil(BigDecimal validUntil) {
    this.validUntil = validUntil;
    return this;
  }

   /**
   * Blockheight at wh
   * @return validUntil
  **/
  @ApiModelProperty(value = "Blockheight at wh")
  public BigDecimal getValidUntil() {
    return validUntil;
  }

  public void setValidUntil(BigDecimal validUntil) {
    this.validUntil = validUntil;
  }

  public IssueTokenRequestMetadataRulesExpiration locked(Boolean locked) {
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
    IssueTokenRequestMetadataRulesExpiration issueTokenRequestMetadataRulesExpiration = (IssueTokenRequestMetadataRulesExpiration) o;
    return Objects.equals(this.validUntil, issueTokenRequestMetadataRulesExpiration.validUntil) &&
        Objects.equals(this.locked, issueTokenRequestMetadataRulesExpiration.locked);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validUntil, locked);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueTokenRequestMetadataRulesExpiration {\n");
    sb.append("    validUntil: ").append(toIndentedString(validUntil)).append("\n");
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

