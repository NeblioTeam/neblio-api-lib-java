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
import io.nebl.neblioapi.models.GetTransactionInfoResponseVin;
import io.nebl.neblioapi.models.GetTransactionInfoResponseVout;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * GetTransactionInfoResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-03-04T02:32:31.926Z[UTC]")
public class GetTransactionInfoResponse {
  public static final String SERIALIZED_NAME_HEX = "hex";
  @SerializedName(SERIALIZED_NAME_HEX)
  private String hex;

  public static final String SERIALIZED_NAME_TXID = "txid";
  @SerializedName(SERIALIZED_NAME_TXID)
  private String txid;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private BigDecimal version;

  public static final String SERIALIZED_NAME_LOCKTIME = "locktime";
  @SerializedName(SERIALIZED_NAME_LOCKTIME)
  private BigDecimal locktime;

  public static final String SERIALIZED_NAME_VIN = "vin";
  @SerializedName(SERIALIZED_NAME_VIN)
  private List<GetTransactionInfoResponseVin> vin = new ArrayList<GetTransactionInfoResponseVin>();

  public static final String SERIALIZED_NAME_VOUT = "vout";
  @SerializedName(SERIALIZED_NAME_VOUT)
  private List<GetTransactionInfoResponseVout> vout = new ArrayList<GetTransactionInfoResponseVout>();

  public static final String SERIALIZED_NAME_BLOCKTIME = "blocktime";
  @SerializedName(SERIALIZED_NAME_BLOCKTIME)
  private BigDecimal blocktime;

  public static final String SERIALIZED_NAME_BLOCKHEIGHT = "blockheight";
  @SerializedName(SERIALIZED_NAME_BLOCKHEIGHT)
  private BigDecimal blockheight;

  public static final String SERIALIZED_NAME_TOTALSENT = "totalsent";
  @SerializedName(SERIALIZED_NAME_TOTALSENT)
  private BigDecimal totalsent;

  public static final String SERIALIZED_NAME_FEE = "fee";
  @SerializedName(SERIALIZED_NAME_FEE)
  private BigDecimal fee;

  public static final String SERIALIZED_NAME_BLOCKHASH = "blockhash";
  @SerializedName(SERIALIZED_NAME_BLOCKHASH)
  private String blockhash;

  public static final String SERIALIZED_NAME_TIME = "time";
  @SerializedName(SERIALIZED_NAME_TIME)
  private BigDecimal time;

  public static final String SERIALIZED_NAME_CONFIRMATIONS = "confirmations";
  @SerializedName(SERIALIZED_NAME_CONFIRMATIONS)
  private BigDecimal confirmations;

  public GetTransactionInfoResponse hex(String hex) {
    this.hex = hex;
    return this;
  }

   /**
   * Transaction in raw hex
   * @return hex
  **/
  @ApiModelProperty(value = "Transaction in raw hex")
  public String getHex() {
    return hex;
  }

  public void setHex(String hex) {
    this.hex = hex;
  }

  public GetTransactionInfoResponse txid(String txid) {
    this.txid = txid;
    return this;
  }

   /**
   * TXID of transaction
   * @return txid
  **/
  @ApiModelProperty(value = "TXID of transaction")
  public String getTxid() {
    return txid;
  }

  public void setTxid(String txid) {
    this.txid = txid;
  }

  public GetTransactionInfoResponse version(BigDecimal version) {
    this.version = version;
    return this;
  }

   /**
   * Transaction version
   * @return version
  **/
  @ApiModelProperty(value = "Transaction version")
  public BigDecimal getVersion() {
    return version;
  }

  public void setVersion(BigDecimal version) {
    this.version = version;
  }

  public GetTransactionInfoResponse locktime(BigDecimal locktime) {
    this.locktime = locktime;
    return this;
  }

   /**
   * Transaction locktime
   * @return locktime
  **/
  @ApiModelProperty(value = "Transaction locktime")
  public BigDecimal getLocktime() {
    return locktime;
  }

  public void setLocktime(BigDecimal locktime) {
    this.locktime = locktime;
  }

  public GetTransactionInfoResponse vin(List<GetTransactionInfoResponseVin> vin) {
    this.vin = vin;
    return this;
  }

  public GetTransactionInfoResponse addVinItem(GetTransactionInfoResponseVin vinItem) {
    if (this.vin == null) {
      this.vin = new ArrayList<GetTransactionInfoResponseVin>();
    }
    this.vin.add(vinItem);
    return this;
  }

   /**
   * Array of transaction inputs
   * @return vin
  **/
  @ApiModelProperty(value = "Array of transaction inputs")
  public List<GetTransactionInfoResponseVin> getVin() {
    return vin;
  }

  public void setVin(List<GetTransactionInfoResponseVin> vin) {
    this.vin = vin;
  }

  public GetTransactionInfoResponse vout(List<GetTransactionInfoResponseVout> vout) {
    this.vout = vout;
    return this;
  }

  public GetTransactionInfoResponse addVoutItem(GetTransactionInfoResponseVout voutItem) {
    if (this.vout == null) {
      this.vout = new ArrayList<GetTransactionInfoResponseVout>();
    }
    this.vout.add(voutItem);
    return this;
  }

   /**
   * Array of transaction outputs
   * @return vout
  **/
  @ApiModelProperty(value = "Array of transaction outputs")
  public List<GetTransactionInfoResponseVout> getVout() {
    return vout;
  }

  public void setVout(List<GetTransactionInfoResponseVout> vout) {
    this.vout = vout;
  }

  public GetTransactionInfoResponse blocktime(BigDecimal blocktime) {
    this.blocktime = blocktime;
    return this;
  }

   /**
   * Block time of this transaction
   * @return blocktime
  **/
  @ApiModelProperty(value = "Block time of this transaction")
  public BigDecimal getBlocktime() {
    return blocktime;
  }

  public void setBlocktime(BigDecimal blocktime) {
    this.blocktime = blocktime;
  }

  public GetTransactionInfoResponse blockheight(BigDecimal blockheight) {
    this.blockheight = blockheight;
    return this;
  }

   /**
   * Block height of this transaction
   * @return blockheight
  **/
  @ApiModelProperty(value = "Block height of this transaction")
  public BigDecimal getBlockheight() {
    return blockheight;
  }

  public void setBlockheight(BigDecimal blockheight) {
    this.blockheight = blockheight;
  }

  public GetTransactionInfoResponse totalsent(BigDecimal totalsent) {
    this.totalsent = totalsent;
    return this;
  }

   /**
   * Total NEBL sent in this transaction in satoshis
   * @return totalsent
  **/
  @ApiModelProperty(value = "Total NEBL sent in this transaction in satoshis")
  public BigDecimal getTotalsent() {
    return totalsent;
  }

  public void setTotalsent(BigDecimal totalsent) {
    this.totalsent = totalsent;
  }

  public GetTransactionInfoResponse fee(BigDecimal fee) {
    this.fee = fee;
    return this;
  }

   /**
   * Total NEBL used as fee for this transcation in satoshis
   * @return fee
  **/
  @ApiModelProperty(value = "Total NEBL used as fee for this transcation in satoshis")
  public BigDecimal getFee() {
    return fee;
  }

  public void setFee(BigDecimal fee) {
    this.fee = fee;
  }

  public GetTransactionInfoResponse blockhash(String blockhash) {
    this.blockhash = blockhash;
    return this;
  }

   /**
   * Hash of the block this transaction is in
   * @return blockhash
  **/
  @ApiModelProperty(value = "Hash of the block this transaction is in")
  public String getBlockhash() {
    return blockhash;
  }

  public void setBlockhash(String blockhash) {
    this.blockhash = blockhash;
  }

  public GetTransactionInfoResponse time(BigDecimal time) {
    this.time = time;
    return this;
  }

   /**
   * Transaction time
   * @return time
  **/
  @ApiModelProperty(value = "Transaction time")
  public BigDecimal getTime() {
    return time;
  }

  public void setTime(BigDecimal time) {
    this.time = time;
  }

  public GetTransactionInfoResponse confirmations(BigDecimal confirmations) {
    this.confirmations = confirmations;
    return this;
  }

   /**
   * Number of transaction confirmations
   * @return confirmations
  **/
  @ApiModelProperty(value = "Number of transaction confirmations")
  public BigDecimal getConfirmations() {
    return confirmations;
  }

  public void setConfirmations(BigDecimal confirmations) {
    this.confirmations = confirmations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTransactionInfoResponse getTransactionInfoResponse = (GetTransactionInfoResponse) o;
    return Objects.equals(this.hex, getTransactionInfoResponse.hex) &&
        Objects.equals(this.txid, getTransactionInfoResponse.txid) &&
        Objects.equals(this.version, getTransactionInfoResponse.version) &&
        Objects.equals(this.locktime, getTransactionInfoResponse.locktime) &&
        Objects.equals(this.vin, getTransactionInfoResponse.vin) &&
        Objects.equals(this.vout, getTransactionInfoResponse.vout) &&
        Objects.equals(this.blocktime, getTransactionInfoResponse.blocktime) &&
        Objects.equals(this.blockheight, getTransactionInfoResponse.blockheight) &&
        Objects.equals(this.totalsent, getTransactionInfoResponse.totalsent) &&
        Objects.equals(this.fee, getTransactionInfoResponse.fee) &&
        Objects.equals(this.blockhash, getTransactionInfoResponse.blockhash) &&
        Objects.equals(this.time, getTransactionInfoResponse.time) &&
        Objects.equals(this.confirmations, getTransactionInfoResponse.confirmations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hex, txid, version, locktime, vin, vout, blocktime, blockheight, totalsent, fee, blockhash, time, confirmations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTransactionInfoResponse {\n");
    sb.append("    hex: ").append(toIndentedString(hex)).append("\n");
    sb.append("    txid: ").append(toIndentedString(txid)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    locktime: ").append(toIndentedString(locktime)).append("\n");
    sb.append("    vin: ").append(toIndentedString(vin)).append("\n");
    sb.append("    vout: ").append(toIndentedString(vout)).append("\n");
    sb.append("    blocktime: ").append(toIndentedString(blocktime)).append("\n");
    sb.append("    blockheight: ").append(toIndentedString(blockheight)).append("\n");
    sb.append("    totalsent: ").append(toIndentedString(totalsent)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    blockhash: ").append(toIndentedString(blockhash)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    confirmations: ").append(toIndentedString(confirmations)).append("\n");
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

