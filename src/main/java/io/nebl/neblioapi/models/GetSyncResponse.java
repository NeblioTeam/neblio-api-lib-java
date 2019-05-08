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
import java.math.BigDecimal;

/**
 * Object containing node sync status
 */
@ApiModel(description = "Object containing node sync status")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-05-08T22:22:47.924Z[UTC]")
public class GetSyncResponse {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_BLOCK_CHAIN_HEIGHT = "blockChainHeight";
  @SerializedName(SERIALIZED_NAME_BLOCK_CHAIN_HEIGHT)
  private BigDecimal blockChainHeight;

  public static final String SERIALIZED_NAME_SYNC_PERCENTAGE = "syncPercentage";
  @SerializedName(SERIALIZED_NAME_SYNC_PERCENTAGE)
  private BigDecimal syncPercentage;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private BigDecimal height;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private String error;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public GetSyncResponse status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Current sync status
   * @return status
  **/
  @ApiModelProperty(value = "Current sync status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public GetSyncResponse blockChainHeight(BigDecimal blockChainHeight) {
    this.blockChainHeight = blockChainHeight;
    return this;
  }

   /**
   * Current blockchain height
   * @return blockChainHeight
  **/
  @ApiModelProperty(value = "Current blockchain height")
  public BigDecimal getBlockChainHeight() {
    return blockChainHeight;
  }

  public void setBlockChainHeight(BigDecimal blockChainHeight) {
    this.blockChainHeight = blockChainHeight;
  }

  public GetSyncResponse syncPercentage(BigDecimal syncPercentage) {
    this.syncPercentage = syncPercentage;
    return this;
  }

   /**
   * Current sync percentage
   * @return syncPercentage
  **/
  @ApiModelProperty(value = "Current sync percentage")
  public BigDecimal getSyncPercentage() {
    return syncPercentage;
  }

  public void setSyncPercentage(BigDecimal syncPercentage) {
    this.syncPercentage = syncPercentage;
  }

  public GetSyncResponse height(BigDecimal height) {
    this.height = height;
    return this;
  }

   /**
   * Height node is synced to
   * @return height
  **/
  @ApiModelProperty(value = "Height node is synced to")
  public BigDecimal getHeight() {
    return height;
  }

  public void setHeight(BigDecimal height) {
    this.height = height;
  }

  public GetSyncResponse error(String error) {
    this.error = error;
    return this;
  }

   /**
   * Recent sync error messages
   * @return error
  **/
  @ApiModelProperty(value = "Recent sync error messages")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public GetSyncResponse type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Node type
   * @return type
  **/
  @ApiModelProperty(value = "Node type")
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
    GetSyncResponse getSyncResponse = (GetSyncResponse) o;
    return Objects.equals(this.status, getSyncResponse.status) &&
        Objects.equals(this.blockChainHeight, getSyncResponse.blockChainHeight) &&
        Objects.equals(this.syncPercentage, getSyncResponse.syncPercentage) &&
        Objects.equals(this.height, getSyncResponse.height) &&
        Objects.equals(this.error, getSyncResponse.error) &&
        Objects.equals(this.type, getSyncResponse.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, blockChainHeight, syncPercentage, height, error, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSyncResponse {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    blockChainHeight: ").append(toIndentedString(blockChainHeight)).append("\n");
    sb.append("    syncPercentage: ").append(toIndentedString(syncPercentage)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

