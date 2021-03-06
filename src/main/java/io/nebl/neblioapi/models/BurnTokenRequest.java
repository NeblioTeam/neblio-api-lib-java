/*
 * Neblio REST API Suite
 * APIs for Interacting with NTP1 Tokens & The Neblio Blockchain
 *
 * OpenAPI spec version: 1.3.0
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
import io.nebl.neblioapi.models.BurnTokenRequestBurn;
import io.nebl.neblioapi.models.SendTokenRequestTo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * BurnTokenRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-07T00:42:34.446043Z[UTC]")
public class BurnTokenRequest {
  public static final String SERIALIZED_NAME_FEE = "fee";
  @SerializedName(SERIALIZED_NAME_FEE)
  private BigDecimal fee;

  public static final String SERIALIZED_NAME_FROM = "from";
  @SerializedName(SERIALIZED_NAME_FROM)
  private List<String> from = new ArrayList<String>();

  public static final String SERIALIZED_NAME_TRANSFER = "transfer";
  @SerializedName(SERIALIZED_NAME_TRANSFER)
  private List<SendTokenRequestTo> transfer = new ArrayList<SendTokenRequestTo>();

  public static final String SERIALIZED_NAME_BURN = "burn";
  @SerializedName(SERIALIZED_NAME_BURN)
  private List<BurnTokenRequestBurn> burn = new ArrayList<BurnTokenRequestBurn>();

  public BurnTokenRequest fee(BigDecimal fee) {
    this.fee = fee;
    return this;
  }

   /**
   * Fee in satoshi to include in the issuance transaction min 10000 (0.0001 NEBL)
   * @return fee
  **/
  @ApiModelProperty(required = true, value = "Fee in satoshi to include in the issuance transaction min 10000 (0.0001 NEBL)")
  public BigDecimal getFee() {
    return fee;
  }

  public void setFee(BigDecimal fee) {
    this.fee = fee;
  }

  public BurnTokenRequest from(List<String> from) {
    this.from = from;
    return this;
  }

  public BurnTokenRequest addFromItem(String fromItem) {
    if (this.from == null) {
      this.from = new ArrayList<String>();
    }
    this.from.add(fromItem);
    return this;
  }

   /**
   * Array of addresses to send the token from
   * @return from
  **/
  @ApiModelProperty(value = "Array of addresses to send the token from")
  public List<String> getFrom() {
    return from;
  }

  public void setFrom(List<String> from) {
    this.from = from;
  }

  public BurnTokenRequest transfer(List<SendTokenRequestTo> transfer) {
    this.transfer = transfer;
    return this;
  }

  public BurnTokenRequest addTransferItem(SendTokenRequestTo transferItem) {
    if (this.transfer == null) {
      this.transfer = new ArrayList<SendTokenRequestTo>();
    }
    this.transfer.add(transferItem);
    return this;
  }

   /**
   * Get transfer
   * @return transfer
  **/
  @ApiModelProperty(value = "")
  public List<SendTokenRequestTo> getTransfer() {
    return transfer;
  }

  public void setTransfer(List<SendTokenRequestTo> transfer) {
    this.transfer = transfer;
  }

  public BurnTokenRequest burn(List<BurnTokenRequestBurn> burn) {
    this.burn = burn;
    return this;
  }

  public BurnTokenRequest addBurnItem(BurnTokenRequestBurn burnItem) {
    this.burn.add(burnItem);
    return this;
  }

   /**
   * Array of objects representing tokens to be burned
   * @return burn
  **/
  @ApiModelProperty(required = true, value = "Array of objects representing tokens to be burned")
  public List<BurnTokenRequestBurn> getBurn() {
    return burn;
  }

  public void setBurn(List<BurnTokenRequestBurn> burn) {
    this.burn = burn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BurnTokenRequest burnTokenRequest = (BurnTokenRequest) o;
    return Objects.equals(this.fee, burnTokenRequest.fee) &&
        Objects.equals(this.from, burnTokenRequest.from) &&
        Objects.equals(this.transfer, burnTokenRequest.transfer) &&
        Objects.equals(this.burn, burnTokenRequest.burn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fee, from, transfer, burn);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BurnTokenRequest {\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    transfer: ").append(toIndentedString(transfer)).append("\n");
    sb.append("    burn: ").append(toIndentedString(burn)).append("\n");
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

