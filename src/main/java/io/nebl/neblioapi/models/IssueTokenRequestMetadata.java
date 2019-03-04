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
import io.nebl.neblioapi.models.IssueTokenRequestMetadataEncryptions;
import io.nebl.neblioapi.models.IssueTokenRequestMetadataRules;
import io.nebl.neblioapi.models.IssueTokenRequestMetadataUrls;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Object representing all metadata at token issuance
 */
@ApiModel(description = "Object representing all metadata at token issuance")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-03-04T00:38:31.867Z[UTC]")
public class IssueTokenRequestMetadata {
  public static final String SERIALIZED_NAME_TOKEN_NAME = "tokenName";
  @SerializedName(SERIALIZED_NAME_TOKEN_NAME)
  private String tokenName;

  public static final String SERIALIZED_NAME_ISSUER = "issuer";
  @SerializedName(SERIALIZED_NAME_ISSUER)
  private String issuer;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_URLS = "urls";
  @SerializedName(SERIALIZED_NAME_URLS)
  private List<IssueTokenRequestMetadataUrls> urls = new ArrayList<IssueTokenRequestMetadataUrls>();

  public static final String SERIALIZED_NAME_USER_DATA = "userData";
  @SerializedName(SERIALIZED_NAME_USER_DATA)
  private GetTokenMetadataResponseMetadataOfIssuanceDataUserData userData = null;

  public static final String SERIALIZED_NAME_ENCRYPTIONS = "encryptions";
  @SerializedName(SERIALIZED_NAME_ENCRYPTIONS)
  private List<IssueTokenRequestMetadataEncryptions> encryptions = new ArrayList<IssueTokenRequestMetadataEncryptions>();

  public static final String SERIALIZED_NAME_RULES = "rules";
  @SerializedName(SERIALIZED_NAME_RULES)
  private IssueTokenRequestMetadataRules rules = null;

  public IssueTokenRequestMetadata tokenName(String tokenName) {
    this.tokenName = tokenName;
    return this;
  }

   /**
   * Token Symbol it will be identified by (ex. NIBBL)
   * @return tokenName
  **/
  @ApiModelProperty(value = "Token Symbol it will be identified by (ex. NIBBL)")
  public String getTokenName() {
    return tokenName;
  }

  public void setTokenName(String tokenName) {
    this.tokenName = tokenName;
  }

  public IssueTokenRequestMetadata issuer(String issuer) {
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

  public IssueTokenRequestMetadata description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Long name or description of token (ex. Nibble)
   * @return description
  **/
  @ApiModelProperty(value = "Long name or description of token (ex. Nibble)")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public IssueTokenRequestMetadata urls(List<IssueTokenRequestMetadataUrls> urls) {
    this.urls = urls;
    return this;
  }

  public IssueTokenRequestMetadata addUrlsItem(IssueTokenRequestMetadataUrls urlsItem) {
    if (this.urls == null) {
      this.urls = new ArrayList<IssueTokenRequestMetadataUrls>();
    }
    this.urls.add(urlsItem);
    return this;
  }

   /**
   * Get urls
   * @return urls
  **/
  @ApiModelProperty(value = "")
  public List<IssueTokenRequestMetadataUrls> getUrls() {
    return urls;
  }

  public void setUrls(List<IssueTokenRequestMetadataUrls> urls) {
    this.urls = urls;
  }

  public IssueTokenRequestMetadata userData(GetTokenMetadataResponseMetadataOfIssuanceDataUserData userData) {
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

  public IssueTokenRequestMetadata encryptions(List<IssueTokenRequestMetadataEncryptions> encryptions) {
    this.encryptions = encryptions;
    return this;
  }

  public IssueTokenRequestMetadata addEncryptionsItem(IssueTokenRequestMetadataEncryptions encryptionsItem) {
    if (this.encryptions == null) {
      this.encryptions = new ArrayList<IssueTokenRequestMetadataEncryptions>();
    }
    this.encryptions.add(encryptionsItem);
    return this;
  }

   /**
   * Array of encryption instruction objects for encrypting userData
   * @return encryptions
  **/
  @ApiModelProperty(value = "Array of encryption instruction objects for encrypting userData")
  public List<IssueTokenRequestMetadataEncryptions> getEncryptions() {
    return encryptions;
  }

  public void setEncryptions(List<IssueTokenRequestMetadataEncryptions> encryptions) {
    this.encryptions = encryptions;
  }

  public IssueTokenRequestMetadata rules(IssueTokenRequestMetadataRules rules) {
    this.rules = rules;
    return this;
  }

   /**
   * Get rules
   * @return rules
  **/
  @ApiModelProperty(value = "")
  public IssueTokenRequestMetadataRules getRules() {
    return rules;
  }

  public void setRules(IssueTokenRequestMetadataRules rules) {
    this.rules = rules;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueTokenRequestMetadata issueTokenRequestMetadata = (IssueTokenRequestMetadata) o;
    return Objects.equals(this.tokenName, issueTokenRequestMetadata.tokenName) &&
        Objects.equals(this.issuer, issueTokenRequestMetadata.issuer) &&
        Objects.equals(this.description, issueTokenRequestMetadata.description) &&
        Objects.equals(this.urls, issueTokenRequestMetadata.urls) &&
        Objects.equals(this.userData, issueTokenRequestMetadata.userData) &&
        Objects.equals(this.encryptions, issueTokenRequestMetadata.encryptions) &&
        Objects.equals(this.rules, issueTokenRequestMetadata.rules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokenName, issuer, description, urls, userData, encryptions, rules);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueTokenRequestMetadata {\n");
    sb.append("    tokenName: ").append(toIndentedString(tokenName)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
    sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
    sb.append("    encryptions: ").append(toIndentedString(encryptions)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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

