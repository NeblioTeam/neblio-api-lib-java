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
import io.nebl.neblioapi.models.GetTxResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Object containing an array of transaction objects
 */
@ApiModel(description = "Object containing an array of transaction objects")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-03-03T23:42:59.729Z[UTC]")
public class GetTxsResponse {
  public static final String SERIALIZED_NAME_PAGES_TOTAL = "pagesTotal";
  @SerializedName(SERIALIZED_NAME_PAGES_TOTAL)
  private BigDecimal pagesTotal;

  public static final String SERIALIZED_NAME_TXS = "txs";
  @SerializedName(SERIALIZED_NAME_TXS)
  private List<GetTxResponse> txs = new ArrayList<GetTxResponse>();

  public GetTxsResponse pagesTotal(BigDecimal pagesTotal) {
    this.pagesTotal = pagesTotal;
    return this;
  }

   /**
   * Number of pages of transactions
   * @return pagesTotal
  **/
  @ApiModelProperty(value = "Number of pages of transactions")
  public BigDecimal getPagesTotal() {
    return pagesTotal;
  }

  public void setPagesTotal(BigDecimal pagesTotal) {
    this.pagesTotal = pagesTotal;
  }

  public GetTxsResponse txs(List<GetTxResponse> txs) {
    this.txs = txs;
    return this;
  }

  public GetTxsResponse addTxsItem(GetTxResponse txsItem) {
    if (this.txs == null) {
      this.txs = new ArrayList<GetTxResponse>();
    }
    this.txs.add(txsItem);
    return this;
  }

   /**
   * Array of transaction objects
   * @return txs
  **/
  @ApiModelProperty(value = "Array of transaction objects")
  public List<GetTxResponse> getTxs() {
    return txs;
  }

  public void setTxs(List<GetTxResponse> txs) {
    this.txs = txs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTxsResponse getTxsResponse = (GetTxsResponse) o;
    return Objects.equals(this.pagesTotal, getTxsResponse.pagesTotal) &&
        Objects.equals(this.txs, getTxsResponse.txs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pagesTotal, txs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTxsResponse {\n");
    sb.append("    pagesTotal: ").append(toIndentedString(pagesTotal)).append("\n");
    sb.append("    txs: ").append(toIndentedString(txs)).append("\n");
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
