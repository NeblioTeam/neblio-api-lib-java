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

/**
 * IssueTokenRequestMetadataEncryptions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-03-04T02:40:07.902Z[UTC]")
public class IssueTokenRequestMetadataEncryptions {
  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_PUBKEY = "pubkey";
  @SerializedName(SERIALIZED_NAME_PUBKEY)
  private String pubkey;

  public static final String SERIALIZED_NAME_FORMAT = "format";
  @SerializedName(SERIALIZED_NAME_FORMAT)
  private String format;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public IssueTokenRequestMetadataEncryptions key(String key) {
    this.key = key;
    return this;
  }

   /**
   * userData key to encrypt
   * @return key
  **/
  @ApiModelProperty(value = "userData key to encrypt")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public IssueTokenRequestMetadataEncryptions pubkey(String pubkey) {
    this.pubkey = pubkey;
    return this;
  }

   /**
   * RSA public key used for encryption
   * @return pubkey
  **/
  @ApiModelProperty(value = "RSA public key used for encryption")
  public String getPubkey() {
    return pubkey;
  }

  public void setPubkey(String pubkey) {
    this.pubkey = pubkey;
  }

  public IssueTokenRequestMetadataEncryptions format(String format) {
    this.format = format;
    return this;
  }

   /**
   * key format (pem or der)
   * @return format
  **/
  @ApiModelProperty(value = "key format (pem or der)")
  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public IssueTokenRequestMetadataEncryptions type(String type) {
    this.type = type;
    return this;
  }

   /**
   * pkcs1 or pkcs8
   * @return type
  **/
  @ApiModelProperty(value = "pkcs1 or pkcs8")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueTokenRequestMetadataEncryptions issueTokenRequestMetadataEncryptions = (IssueTokenRequestMetadataEncryptions) o;
    return Objects.equals(this.key, issueTokenRequestMetadataEncryptions.key) &&
        Objects.equals(this.pubkey, issueTokenRequestMetadataEncryptions.pubkey) &&
        Objects.equals(this.format, issueTokenRequestMetadataEncryptions.format) &&
        Objects.equals(this.type, issueTokenRequestMetadataEncryptions.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, pubkey, format, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueTokenRequestMetadataEncryptions {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    pubkey: ").append(toIndentedString(pubkey)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

