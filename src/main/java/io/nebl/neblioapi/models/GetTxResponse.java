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
import io.nebl.neblioapi.models.GetTxResponseVin;
import io.nebl.neblioapi.models.GetTxResponseVout;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * GetTxResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-07T00:42:34.446043Z[UTC]")
public class GetTxResponse {
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
  private List<GetTxResponseVin> vin = new ArrayList<GetTxResponseVin>();

  public static final String SERIALIZED_NAME_VOUT = "vout";
  @SerializedName(SERIALIZED_NAME_VOUT)
  private List<GetTxResponseVout> vout = new ArrayList<GetTxResponseVout>();

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

  public static final String SERIALIZED_NAME_VALUE_OUT = "valueOut";
  @SerializedName(SERIALIZED_NAME_VALUE_OUT)
  private BigDecimal valueOut;

  public static final String SERIALIZED_NAME_VALUE_IN = "valueIn";
  @SerializedName(SERIALIZED_NAME_VALUE_IN)
  private BigDecimal valueIn;

  public static final String SERIALIZED_NAME_FEES = "fees";
  @SerializedName(SERIALIZED_NAME_FEES)
  private BigDecimal fees;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private BigDecimal size;

  public GetTxResponse txid(String txid) {
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

  public GetTxResponse version(BigDecimal version) {
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

  public GetTxResponse locktime(BigDecimal locktime) {
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

  public GetTxResponse vin(List<GetTxResponseVin> vin) {
    this.vin = vin;
    return this;
  }

  public GetTxResponse addVinItem(GetTxResponseVin vinItem) {
    if (this.vin == null) {
      this.vin = new ArrayList<GetTxResponseVin>();
    }
    this.vin.add(vinItem);
    return this;
  }

   /**
   * Array of transaction inputs
   * @return vin
  **/
  @ApiModelProperty(value = "Array of transaction inputs")
  public List<GetTxResponseVin> getVin() {
    return vin;
  }

  public void setVin(List<GetTxResponseVin> vin) {
    this.vin = vin;
  }

  public GetTxResponse vout(List<GetTxResponseVout> vout) {
    this.vout = vout;
    return this;
  }

  public GetTxResponse addVoutItem(GetTxResponseVout voutItem) {
    if (this.vout == null) {
      this.vout = new ArrayList<GetTxResponseVout>();
    }
    this.vout.add(voutItem);
    return this;
  }

   /**
   * Array of transaction outputs
   * @return vout
  **/
  @ApiModelProperty(value = "Array of transaction outputs")
  public List<GetTxResponseVout> getVout() {
    return vout;
  }

  public void setVout(List<GetTxResponseVout> vout) {
    this.vout = vout;
  }

  public GetTxResponse blocktime(BigDecimal blocktime) {
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

  public GetTxResponse blockheight(BigDecimal blockheight) {
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

  public GetTxResponse totalsent(BigDecimal totalsent) {
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

  public GetTxResponse fee(BigDecimal fee) {
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

  public GetTxResponse blockhash(String blockhash) {
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

  public GetTxResponse time(BigDecimal time) {
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

  public GetTxResponse confirmations(BigDecimal confirmations) {
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

  public GetTxResponse valueOut(BigDecimal valueOut) {
    this.valueOut = valueOut;
    return this;
  }

   /**
   * Total NEBL output in this transaction
   * @return valueOut
  **/
  @ApiModelProperty(value = "Total NEBL output in this transaction")
  public BigDecimal getValueOut() {
    return valueOut;
  }

  public void setValueOut(BigDecimal valueOut) {
    this.valueOut = valueOut;
  }

  public GetTxResponse valueIn(BigDecimal valueIn) {
    this.valueIn = valueIn;
    return this;
  }

   /**
   * Total NEBL input in this transaction
   * @return valueIn
  **/
  @ApiModelProperty(value = "Total NEBL input in this transaction")
  public BigDecimal getValueIn() {
    return valueIn;
  }

  public void setValueIn(BigDecimal valueIn) {
    this.valueIn = valueIn;
  }

  public GetTxResponse fees(BigDecimal fees) {
    this.fees = fees;
    return this;
  }

   /**
   * Total NEBL used in fees for this transaction
   * @return fees
  **/
  @ApiModelProperty(value = "Total NEBL used in fees for this transaction")
  public BigDecimal getFees() {
    return fees;
  }

  public void setFees(BigDecimal fees) {
    this.fees = fees;
  }

  public GetTxResponse size(BigDecimal size) {
    this.size = size;
    return this;
  }

   /**
   * Transcation size in bytes
   * @return size
  **/
  @ApiModelProperty(value = "Transcation size in bytes")
  public BigDecimal getSize() {
    return size;
  }

  public void setSize(BigDecimal size) {
    this.size = size;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTxResponse getTxResponse = (GetTxResponse) o;
    return Objects.equals(this.txid, getTxResponse.txid) &&
        Objects.equals(this.version, getTxResponse.version) &&
        Objects.equals(this.locktime, getTxResponse.locktime) &&
        Objects.equals(this.vin, getTxResponse.vin) &&
        Objects.equals(this.vout, getTxResponse.vout) &&
        Objects.equals(this.blocktime, getTxResponse.blocktime) &&
        Objects.equals(this.blockheight, getTxResponse.blockheight) &&
        Objects.equals(this.totalsent, getTxResponse.totalsent) &&
        Objects.equals(this.fee, getTxResponse.fee) &&
        Objects.equals(this.blockhash, getTxResponse.blockhash) &&
        Objects.equals(this.time, getTxResponse.time) &&
        Objects.equals(this.confirmations, getTxResponse.confirmations) &&
        Objects.equals(this.valueOut, getTxResponse.valueOut) &&
        Objects.equals(this.valueIn, getTxResponse.valueIn) &&
        Objects.equals(this.fees, getTxResponse.fees) &&
        Objects.equals(this.size, getTxResponse.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(txid, version, locktime, vin, vout, blocktime, blockheight, totalsent, fee, blockhash, time, confirmations, valueOut, valueIn, fees, size);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTxResponse {\n");
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
    sb.append("    valueOut: ").append(toIndentedString(valueOut)).append("\n");
    sb.append("    valueIn: ").append(toIndentedString(valueIn)).append("\n");
    sb.append("    fees: ").append(toIndentedString(fees)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

