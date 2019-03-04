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
import io.nebl.neblioapi.models.IssueTokenRequestFlags;
import io.nebl.neblioapi.models.IssueTokenRequestMetadata;
import io.nebl.neblioapi.models.SendTokenRequestTo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * SendTokenRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-03-04T00:38:31.867Z[UTC]")
public class SendTokenRequest {
  public static final String SERIALIZED_NAME_FEE = "fee";
  @SerializedName(SERIALIZED_NAME_FEE)
  private BigDecimal fee;

  public static final String SERIALIZED_NAME_FROM = "from";
  @SerializedName(SERIALIZED_NAME_FROM)
  private List<String> from = new ArrayList<String>();

  public static final String SERIALIZED_NAME_SENDUTXO = "sendutxo";
  @SerializedName(SERIALIZED_NAME_SENDUTXO)
  private List<String> sendutxo = new ArrayList<String>();

  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  private List<SendTokenRequestTo> to = new ArrayList<SendTokenRequestTo>();

  public static final String SERIALIZED_NAME_FLAGS = "flags";
  @SerializedName(SERIALIZED_NAME_FLAGS)
  private IssueTokenRequestFlags flags = null;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private IssueTokenRequestMetadata metadata = null;

  public SendTokenRequest fee(BigDecimal fee) {
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

  public SendTokenRequest from(List<String> from) {
    this.from = from;
    return this;
  }

  public SendTokenRequest addFromItem(String fromItem) {
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

  public SendTokenRequest sendutxo(List<String> sendutxo) {
    this.sendutxo = sendutxo;
    return this;
  }

  public SendTokenRequest addSendutxoItem(String sendutxoItem) {
    if (this.sendutxo == null) {
      this.sendutxo = new ArrayList<String>();
    }
    this.sendutxo.add(sendutxoItem);
    return this;
  }

   /**
   * Array of UTXOs to send the token from
   * @return sendutxo
  **/
  @ApiModelProperty(value = "Array of UTXOs to send the token from")
  public List<String> getSendutxo() {
    return sendutxo;
  }

  public void setSendutxo(List<String> sendutxo) {
    this.sendutxo = sendutxo;
  }

  public SendTokenRequest to(List<SendTokenRequestTo> to) {
    this.to = to;
    return this;
  }

  public SendTokenRequest addToItem(SendTokenRequestTo toItem) {
    this.to.add(toItem);
    return this;
  }

   /**
   * Get to
   * @return to
  **/
  @ApiModelProperty(required = true, value = "")
  public List<SendTokenRequestTo> getTo() {
    return to;
  }

  public void setTo(List<SendTokenRequestTo> to) {
    this.to = to;
  }

  public SendTokenRequest flags(IssueTokenRequestFlags flags) {
    this.flags = flags;
    return this;
  }

   /**
   * Get flags
   * @return flags
  **/
  @ApiModelProperty(value = "")
  public IssueTokenRequestFlags getFlags() {
    return flags;
  }

  public void setFlags(IssueTokenRequestFlags flags) {
    this.flags = flags;
  }

  public SendTokenRequest metadata(IssueTokenRequestMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "")
  public IssueTokenRequestMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(IssueTokenRequestMetadata metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendTokenRequest sendTokenRequest = (SendTokenRequest) o;
    return Objects.equals(this.fee, sendTokenRequest.fee) &&
        Objects.equals(this.from, sendTokenRequest.from) &&
        Objects.equals(this.sendutxo, sendTokenRequest.sendutxo) &&
        Objects.equals(this.to, sendTokenRequest.to) &&
        Objects.equals(this.flags, sendTokenRequest.flags) &&
        Objects.equals(this.metadata, sendTokenRequest.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fee, from, sendutxo, to, flags, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendTokenRequest {\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    sendutxo: ").append(toIndentedString(sendutxo)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    flags: ").append(toIndentedString(flags)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

