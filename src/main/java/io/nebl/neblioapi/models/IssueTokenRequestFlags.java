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
 * Object representing flags that potentialy modify this transaction
 */
@ApiModel(description = "Object representing flags that potentialy modify this transaction")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-03-04T00:43:12.517Z[UTC]")
public class IssueTokenRequestFlags {
  public static final String SERIALIZED_NAME_SPLIT_CHANGE = "splitChange";
  @SerializedName(SERIALIZED_NAME_SPLIT_CHANGE)
  private Boolean splitChange;

  public IssueTokenRequestFlags splitChange(Boolean splitChange) {
    this.splitChange = splitChange;
    return this;
  }

   /**
   * If true change will be split into 2 outputs, one for NEBL change and one for NTP1 change (recommended)
   * @return splitChange
  **/
  @ApiModelProperty(value = "If true change will be split into 2 outputs, one for NEBL change and one for NTP1 change (recommended)")
  public Boolean getSplitChange() {
    return splitChange;
  }

  public void setSplitChange(Boolean splitChange) {
    this.splitChange = splitChange;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueTokenRequestFlags issueTokenRequestFlags = (IssueTokenRequestFlags) o;
    return Objects.equals(this.splitChange, issueTokenRequestFlags.splitChange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(splitChange);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueTokenRequestFlags {\n");
    sb.append("    splitChange: ").append(toIndentedString(splitChange)).append("\n");
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

