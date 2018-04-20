/*
 * Neblio REST API Suite
 * APIs for Interacting with NTP1 Tokens & The Neblio Blockchain
 *
 * OpenAPI spec version: 1.1.1
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
import io.swagger.client.model.GetTokenMetadataResponseMetadataOfIssuanceDataUserDataMeta;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Metadata set by user on token
 */
@ApiModel(description = "Metadata set by user on token")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-20T00:20:46.329Z")
public class GetTokenMetadataResponseMetadataOfIssuanceDataUserData {
  @SerializedName("meta")
  private List<GetTokenMetadataResponseMetadataOfIssuanceDataUserDataMeta> meta = null;

  public GetTokenMetadataResponseMetadataOfIssuanceDataUserData meta(List<GetTokenMetadataResponseMetadataOfIssuanceDataUserDataMeta> meta) {
    this.meta = meta;
    return this;
  }

  public GetTokenMetadataResponseMetadataOfIssuanceDataUserData addMetaItem(GetTokenMetadataResponseMetadataOfIssuanceDataUserDataMeta metaItem) {
    if (this.meta == null) {
      this.meta = new ArrayList<GetTokenMetadataResponseMetadataOfIssuanceDataUserDataMeta>();
    }
    this.meta.add(metaItem);
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @ApiModelProperty(value = "")
  public List<GetTokenMetadataResponseMetadataOfIssuanceDataUserDataMeta> getMeta() {
    return meta;
  }

  public void setMeta(List<GetTokenMetadataResponseMetadataOfIssuanceDataUserDataMeta> meta) {
    this.meta = meta;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTokenMetadataResponseMetadataOfIssuanceDataUserData getTokenMetadataResponseMetadataOfIssuanceDataUserData = (GetTokenMetadataResponseMetadataOfIssuanceDataUserData) o;
    return Objects.equals(this.meta, getTokenMetadataResponseMetadataOfIssuanceDataUserData.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTokenMetadataResponseMetadataOfIssuanceDataUserData {\n");
    
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

