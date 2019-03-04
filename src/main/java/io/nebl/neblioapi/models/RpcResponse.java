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
 * Object containing the JSON response from the Neblio node.
 */
@ApiModel(description = "Object containing the JSON response from the Neblio node.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-03-04T03:35:36.528Z[UTC]")
public class RpcResponse {
  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private Object result = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private Object error = null;

  public RpcResponse result(Object result) {
    this.result = result;
    return this;
  }

   /**
   * Object containing the response output.
   * @return result
  **/
  @ApiModelProperty(value = "Object containing the response output.")
  public Object getResult() {
    return result;
  }

  public void setResult(Object result) {
    this.result = result;
  }

  public RpcResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Identifier of RCP caller
   * @return id
  **/
  @ApiModelProperty(value = "Identifier of RCP caller")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RpcResponse error(Object error) {
    this.error = error;
    return this;
  }

   /**
   * Object containing any error information.
   * @return error
  **/
  @ApiModelProperty(value = "Object containing any error information.")
  public Object getError() {
    return error;
  }

  public void setError(Object error) {
    this.error = error;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RpcResponse rpcResponse = (RpcResponse) o;
    return Objects.equals(this.result, rpcResponse.result) &&
        Objects.equals(this.id, rpcResponse.id) &&
        Objects.equals(this.error, rpcResponse.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, id, error);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RpcResponse {\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

