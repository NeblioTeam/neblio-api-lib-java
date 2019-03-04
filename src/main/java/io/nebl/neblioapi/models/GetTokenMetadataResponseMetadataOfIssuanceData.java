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
import io.nebl.neblioapi.models.GetTokenMetadataResponseMetadataOfIssuanceDataUserData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * GetTokenMetadataResponseMetadataOfIssuanceData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-03-04T01:28:12.717Z[UTC]")
public class GetTokenMetadataResponseMetadataOfIssuanceData {
  public static final String SERIALIZED_NAME_TOKEN_NAME = "tokenName";
  @SerializedName(SERIALIZED_NAME_TOKEN_NAME)
  private String tokenName;

  public static final String SERIALIZED_NAME_ISSUER = "issuer";
  @SerializedName(SERIALIZED_NAME_ISSUER)
  private String issuer;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_USER_DATA = "userData";
  @SerializedName(SERIALIZED_NAME_USER_DATA)
  private GetTokenMetadataResponseMetadataOfIssuanceDataUserData userData = null;

  public GetTokenMetadataResponseMetadataOfIssuanceData tokenName(String tokenName) {
    this.tokenName = tokenName;
    return this;
  }

   /**
   * Token symbol
   * @return tokenName
  **/
  @ApiModelProperty(value = "Token symbol")
  public String getTokenName() {
    return tokenName;
  }

  public void setTokenName(String tokenName) {
    this.tokenName = tokenName;
  }

  public GetTokenMetadataResponseMetadataOfIssuanceData issuer(String issuer) {
    this.issuer = issuer;
    return this;
  }

   /**
   * Name of token issuer
   * @return issuer
  **/
  @ApiModelProperty(value = "Name of token issuer")
  public String getIssuer() {
    return issuer;
  }

  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }

  public GetTokenMetadataResponseMetadataOfIssuanceData description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Token description
   * @return description
  **/
  @ApiModelProperty(value = "Token description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public GetTokenMetadataResponseMetadataOfIssuanceData userData(GetTokenMetadataResponseMetadataOfIssuanceDataUserData userData) {
    this.userData = userData;
    return this;
  }

   /**
   * Get userData
   * @return userData
  **/
  @ApiModelProperty(value = "")
  public GetTokenMetadataResponseMetadataOfIssuanceDataUserData getUserData() {
    return userData;
  }

  public void setUserData(GetTokenMetadataResponseMetadataOfIssuanceDataUserData userData) {
    this.userData = userData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTokenMetadataResponseMetadataOfIssuanceData getTokenMetadataResponseMetadataOfIssuanceData = (GetTokenMetadataResponseMetadataOfIssuanceData) o;
    return Objects.equals(this.tokenName, getTokenMetadataResponseMetadataOfIssuanceData.tokenName) &&
        Objects.equals(this.issuer, getTokenMetadataResponseMetadataOfIssuanceData.issuer) &&
        Objects.equals(this.description, getTokenMetadataResponseMetadataOfIssuanceData.description) &&
        Objects.equals(this.userData, getTokenMetadataResponseMetadataOfIssuanceData.userData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokenName, issuer, description, userData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTokenMetadataResponseMetadataOfIssuanceData {\n");
    sb.append("    tokenName: ").append(toIndentedString(tokenName)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
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

