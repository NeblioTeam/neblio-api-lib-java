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
import java.util.ArrayList;
import java.util.List;

/**
 * RpcRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-03-04T04:19:08.389Z[UTC]")
public class RpcRequest {
  public static final String SERIALIZED_NAME_JSONRPC = "jsonrpc";
  @SerializedName(SERIALIZED_NAME_JSONRPC)
  private String jsonrpc = "1.0";

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id = "neblio-apis";

  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private String method;

  public static final String SERIALIZED_NAME_PARAMS = "params";
  @SerializedName(SERIALIZED_NAME_PARAMS)
  private List<String> params = new ArrayList<String>();

  public RpcRequest jsonrpc(String jsonrpc) {
    this.jsonrpc = jsonrpc;
    return this;
  }

   /**
   * JSON-RPC version
   * @return jsonrpc
  **/
  @ApiModelProperty(example = "1.0", required = true, value = "JSON-RPC version")
  public String getJsonrpc() {
    return jsonrpc;
  }

  public void setJsonrpc(String jsonrpc) {
    this.jsonrpc = jsonrpc;
  }

  public RpcRequest id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Identifier of RCP caller
   * @return id
  **/
  @ApiModelProperty(example = "neblio-apis", required = true, value = "Identifier of RCP caller")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RpcRequest method(String method) {
    this.method = method;
    return this;
  }

   /**
   * Name of the Neblio RPC method to call
   * @return method
  **/
  @ApiModelProperty(example = "getstakinginfo", required = true, value = "Name of the Neblio RPC method to call")
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public RpcRequest params(List<String> params) {
    this.params = params;
    return this;
  }

  public RpcRequest addParamsItem(String paramsItem) {
    this.params.add(paramsItem);
    return this;
  }

   /**
   * Array of string params that should be passed to the RPC method.
   * @return params
  **/
  @ApiModelProperty(example = "[]", required = true, value = "Array of string params that should be passed to the RPC method.")
  public List<String> getParams() {
    return params;
  }

  public void setParams(List<String> params) {
    this.params = params;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RpcRequest rpcRequest = (RpcRequest) o;
    return Objects.equals(this.jsonrpc, rpcRequest.jsonrpc) &&
        Objects.equals(this.id, rpcRequest.id) &&
        Objects.equals(this.method, rpcRequest.method) &&
        Objects.equals(this.params, rpcRequest.params);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jsonrpc, id, method, params);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RpcRequest {\n");
    sb.append("    jsonrpc: ").append(toIndentedString(jsonrpc)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
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

