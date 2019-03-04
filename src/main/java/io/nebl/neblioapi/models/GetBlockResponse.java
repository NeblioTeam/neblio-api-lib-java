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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * GetBlockResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-03-04T01:54:04.924Z[UTC]")
public class GetBlockResponse {
  public static final String SERIALIZED_NAME_HASH = "hash";
  @SerializedName(SERIALIZED_NAME_HASH)
  private String hash;

  public static final String SERIALIZED_NAME_CONFIRMATIONS = "confirmations";
  @SerializedName(SERIALIZED_NAME_CONFIRMATIONS)
  private BigDecimal confirmations;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private BigDecimal size;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private BigDecimal height;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private BigDecimal version;

  public static final String SERIALIZED_NAME_MERKLEROOT = "merkleroot";
  @SerializedName(SERIALIZED_NAME_MERKLEROOT)
  private String merkleroot;

  public static final String SERIALIZED_NAME_TX = "tx";
  @SerializedName(SERIALIZED_NAME_TX)
  private List<String> tx = new ArrayList<String>();

  public static final String SERIALIZED_NAME_TIME = "time";
  @SerializedName(SERIALIZED_NAME_TIME)
  private BigDecimal time;

  public static final String SERIALIZED_NAME_NONCE = "nonce";
  @SerializedName(SERIALIZED_NAME_NONCE)
  private BigDecimal nonce;

  public static final String SERIALIZED_NAME_BITS = "bits";
  @SerializedName(SERIALIZED_NAME_BITS)
  private String bits;

  public static final String SERIALIZED_NAME_DIFFICULTY = "difficulty";
  @SerializedName(SERIALIZED_NAME_DIFFICULTY)
  private BigDecimal difficulty;

  public static final String SERIALIZED_NAME_PREVIOUSBLOCKHASH = "previousblockhash";
  @SerializedName(SERIALIZED_NAME_PREVIOUSBLOCKHASH)
  private String previousblockhash;

  public static final String SERIALIZED_NAME_NEXTBLOCKHASH = "nextblockhash";
  @SerializedName(SERIALIZED_NAME_NEXTBLOCKHASH)
  private String nextblockhash;

  public static final String SERIALIZED_NAME_REWARD = "reward";
  @SerializedName(SERIALIZED_NAME_REWARD)
  private BigDecimal reward;

  public GetBlockResponse hash(String hash) {
    this.hash = hash;
    return this;
  }

   /**
   * Block hash
   * @return hash
  **/
  @ApiModelProperty(value = "Block hash")
  public String getHash() {
    return hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }

  public GetBlockResponse confirmations(BigDecimal confirmations) {
    this.confirmations = confirmations;
    return this;
  }

   /**
   * Number of confirmations block has
   * @return confirmations
  **/
  @ApiModelProperty(value = "Number of confirmations block has")
  public BigDecimal getConfirmations() {
    return confirmations;
  }

  public void setConfirmations(BigDecimal confirmations) {
    this.confirmations = confirmations;
  }

  public GetBlockResponse size(BigDecimal size) {
    this.size = size;
    return this;
  }

   /**
   * Block size in bytes
   * @return size
  **/
  @ApiModelProperty(value = "Block size in bytes")
  public BigDecimal getSize() {
    return size;
  }

  public void setSize(BigDecimal size) {
    this.size = size;
  }

  public GetBlockResponse height(BigDecimal height) {
    this.height = height;
    return this;
  }

   /**
   * Block height
   * @return height
  **/
  @ApiModelProperty(value = "Block height")
  public BigDecimal getHeight() {
    return height;
  }

  public void setHeight(BigDecimal height) {
    this.height = height;
  }

  public GetBlockResponse version(BigDecimal version) {
    this.version = version;
    return this;
  }

   /**
   * Block version
   * @return version
  **/
  @ApiModelProperty(value = "Block version")
  public BigDecimal getVersion() {
    return version;
  }

  public void setVersion(BigDecimal version) {
    this.version = version;
  }

  public GetBlockResponse merkleroot(String merkleroot) {
    this.merkleroot = merkleroot;
    return this;
  }

   /**
   * Merkleroot of block
   * @return merkleroot
  **/
  @ApiModelProperty(value = "Merkleroot of block")
  public String getMerkleroot() {
    return merkleroot;
  }

  public void setMerkleroot(String merkleroot) {
    this.merkleroot = merkleroot;
  }

  public GetBlockResponse tx(List<String> tx) {
    this.tx = tx;
    return this;
  }

  public GetBlockResponse addTxItem(String txItem) {
    if (this.tx == null) {
      this.tx = new ArrayList<String>();
    }
    this.tx.add(txItem);
    return this;
  }

   /**
   * Array of tx ids in the block
   * @return tx
  **/
  @ApiModelProperty(value = "Array of tx ids in the block")
  public List<String> getTx() {
    return tx;
  }

  public void setTx(List<String> tx) {
    this.tx = tx;
  }

  public GetBlockResponse time(BigDecimal time) {
    this.time = time;
    return this;
  }

   /**
   * Block time relative to epoch
   * @return time
  **/
  @ApiModelProperty(value = "Block time relative to epoch")
  public BigDecimal getTime() {
    return time;
  }

  public void setTime(BigDecimal time) {
    this.time = time;
  }

  public GetBlockResponse nonce(BigDecimal nonce) {
    this.nonce = nonce;
    return this;
  }

   /**
   * Block nonce
   * @return nonce
  **/
  @ApiModelProperty(value = "Block nonce")
  public BigDecimal getNonce() {
    return nonce;
  }

  public void setNonce(BigDecimal nonce) {
    this.nonce = nonce;
  }

  public GetBlockResponse bits(String bits) {
    this.bits = bits;
    return this;
  }

   /**
   * Block bits
   * @return bits
  **/
  @ApiModelProperty(value = "Block bits")
  public String getBits() {
    return bits;
  }

  public void setBits(String bits) {
    this.bits = bits;
  }

  public GetBlockResponse difficulty(BigDecimal difficulty) {
    this.difficulty = difficulty;
    return this;
  }

   /**
   * Block difficulty
   * @return difficulty
  **/
  @ApiModelProperty(value = "Block difficulty")
  public BigDecimal getDifficulty() {
    return difficulty;
  }

  public void setDifficulty(BigDecimal difficulty) {
    this.difficulty = difficulty;
  }

  public GetBlockResponse previousblockhash(String previousblockhash) {
    this.previousblockhash = previousblockhash;
    return this;
  }

   /**
   * Hash of the previous block on the chain
   * @return previousblockhash
  **/
  @ApiModelProperty(value = "Hash of the previous block on the chain")
  public String getPreviousblockhash() {
    return previousblockhash;
  }

  public void setPreviousblockhash(String previousblockhash) {
    this.previousblockhash = previousblockhash;
  }

  public GetBlockResponse nextblockhash(String nextblockhash) {
    this.nextblockhash = nextblockhash;
    return this;
  }

   /**
   * Hash of the next block on the chain
   * @return nextblockhash
  **/
  @ApiModelProperty(value = "Hash of the next block on the chain")
  public String getNextblockhash() {
    return nextblockhash;
  }

  public void setNextblockhash(String nextblockhash) {
    this.nextblockhash = nextblockhash;
  }

  public GetBlockResponse reward(BigDecimal reward) {
    this.reward = reward;
    return this;
  }

   /**
   * Number of NEBL awarded in this block
   * @return reward
  **/
  @ApiModelProperty(value = "Number of NEBL awarded in this block")
  public BigDecimal getReward() {
    return reward;
  }

  public void setReward(BigDecimal reward) {
    this.reward = reward;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetBlockResponse getBlockResponse = (GetBlockResponse) o;
    return Objects.equals(this.hash, getBlockResponse.hash) &&
        Objects.equals(this.confirmations, getBlockResponse.confirmations) &&
        Objects.equals(this.size, getBlockResponse.size) &&
        Objects.equals(this.height, getBlockResponse.height) &&
        Objects.equals(this.version, getBlockResponse.version) &&
        Objects.equals(this.merkleroot, getBlockResponse.merkleroot) &&
        Objects.equals(this.tx, getBlockResponse.tx) &&
        Objects.equals(this.time, getBlockResponse.time) &&
        Objects.equals(this.nonce, getBlockResponse.nonce) &&
        Objects.equals(this.bits, getBlockResponse.bits) &&
        Objects.equals(this.difficulty, getBlockResponse.difficulty) &&
        Objects.equals(this.previousblockhash, getBlockResponse.previousblockhash) &&
        Objects.equals(this.nextblockhash, getBlockResponse.nextblockhash) &&
        Objects.equals(this.reward, getBlockResponse.reward);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hash, confirmations, size, height, version, merkleroot, tx, time, nonce, bits, difficulty, previousblockhash, nextblockhash, reward);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetBlockResponse {\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    confirmations: ").append(toIndentedString(confirmations)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    merkleroot: ").append(toIndentedString(merkleroot)).append("\n");
    sb.append("    tx: ").append(toIndentedString(tx)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    nonce: ").append(toIndentedString(nonce)).append("\n");
    sb.append("    bits: ").append(toIndentedString(bits)).append("\n");
    sb.append("    difficulty: ").append(toIndentedString(difficulty)).append("\n");
    sb.append("    previousblockhash: ").append(toIndentedString(previousblockhash)).append("\n");
    sb.append("    nextblockhash: ").append(toIndentedString(nextblockhash)).append("\n");
    sb.append("    reward: ").append(toIndentedString(reward)).append("\n");
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

