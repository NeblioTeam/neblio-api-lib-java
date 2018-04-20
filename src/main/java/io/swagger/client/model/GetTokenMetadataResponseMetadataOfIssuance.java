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
import io.swagger.client.model.GetTokenMetadataResponseMetadataOfIssuanceData;
import java.io.IOException;

/**
 * Metadata set at issuance
 */
@ApiModel(description = "Metadata set at issuance")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-20T00:20:46.329Z")
public class GetTokenMetadataResponseMetadataOfIssuance {
  @SerializedName("data")
  private GetTokenMetadataResponseMetadataOfIssuanceData data = null;

  public GetTokenMetadataResponseMetadataOfIssuance data(GetTokenMetadataResponseMetadataOfIssuanceData data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")
  public GetTokenMetadataResponseMetadataOfIssuanceData getData() {
    return data;
  }

  public void setData(GetTokenMetadataResponseMetadataOfIssuanceData data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTokenMetadataResponseMetadataOfIssuance getTokenMetadataResponseMetadataOfIssuance = (GetTokenMetadataResponseMetadataOfIssuance) o;
    return Objects.equals(this.data, getTokenMetadataResponseMetadataOfIssuance.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTokenMetadataResponseMetadataOfIssuance {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

