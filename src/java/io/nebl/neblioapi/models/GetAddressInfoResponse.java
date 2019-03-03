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
import io.nebl.neblioapi.models.GetAddressInfoResponseUtxos;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * GetAddressInfoResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-03-03T23:42:59.729Z[UTC]")
public class GetAddressInfoResponse {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_UTXOS = "utxos";
  @SerializedName(SERIALIZED_NAME_UTXOS)
  private List<GetAddressInfoResponseUtxos> utxos = new ArrayList<GetAddressInfoResponseUtxos>();

  public GetAddressInfoResponse address(String address) {
    this.address = address;
    return this;
  }

   /**
   * The Neblio Address
   * @return address
  **/
  @ApiModelProperty(value = "The Neblio Address")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public GetAddressInfoResponse utxos(List<GetAddressInfoResponseUtxos> utxos) {
    this.utxos = utxos;
    return this;
  }

  public GetAddressInfoResponse addUtxosItem(GetAddressInfoResponseUtxos utxosItem) {
    if (this.utxos == null) {
      this.utxos = new ArrayList<GetAddressInfoResponseUtxos>();
    }
    this.utxos.add(utxosItem);
    return this;
  }

   /**
   * Array of UTXOs held at this address.
   * @return utxos
  **/
  @ApiModelProperty(value = "Array of UTXOs held at this address.")
  public List<GetAddressInfoResponseUtxos> getUtxos() {
    return utxos;
  }

  public void setUtxos(List<GetAddressInfoResponseUtxos> utxos) {
    this.utxos = utxos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAddressInfoResponse getAddressInfoResponse = (GetAddressInfoResponse) o;
    return Objects.equals(this.address, getAddressInfoResponse.address) &&
        Objects.equals(this.utxos, getAddressInfoResponse.utxos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, utxos);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAddressInfoResponse {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    utxos: ").append(toIndentedString(utxos)).append("\n");
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

