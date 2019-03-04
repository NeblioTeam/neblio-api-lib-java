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
 * GetAddressResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-03-04T03:23:07.655Z[UTC]")
public class GetAddressResponse {
  public static final String SERIALIZED_NAME_ADDR_STR = "addrStr";
  @SerializedName(SERIALIZED_NAME_ADDR_STR)
  private String addrStr;

  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private BigDecimal balance;

  public static final String SERIALIZED_NAME_BALANCE_SAT = "balanceSat";
  @SerializedName(SERIALIZED_NAME_BALANCE_SAT)
  private BigDecimal balanceSat;

  public static final String SERIALIZED_NAME_TOTAL_RECEIVED = "totalReceived";
  @SerializedName(SERIALIZED_NAME_TOTAL_RECEIVED)
  private BigDecimal totalReceived;

  public static final String SERIALIZED_NAME_TOTAL_RECEIVED_SAT = "totalReceivedSat";
  @SerializedName(SERIALIZED_NAME_TOTAL_RECEIVED_SAT)
  private BigDecimal totalReceivedSat;

  public static final String SERIALIZED_NAME_TOTAL_SENT = "totalSent";
  @SerializedName(SERIALIZED_NAME_TOTAL_SENT)
  private BigDecimal totalSent;

  public static final String SERIALIZED_NAME_TOTAL_SENT_SAT = "totalSentSat";
  @SerializedName(SERIALIZED_NAME_TOTAL_SENT_SAT)
  private BigDecimal totalSentSat;

  public static final String SERIALIZED_NAME_UNCONFIRMED_BALANCE = "unconfirmedBalance";
  @SerializedName(SERIALIZED_NAME_UNCONFIRMED_BALANCE)
  private BigDecimal unconfirmedBalance;

  public static final String SERIALIZED_NAME_UNCONFIRMED_BALANCE_SAT = "unconfirmedBalanceSat";
  @SerializedName(SERIALIZED_NAME_UNCONFIRMED_BALANCE_SAT)
  private BigDecimal unconfirmedBalanceSat;

  public static final String SERIALIZED_NAME_UNCONFIRMED_TX_APPEARANCES = "unconfirmedTxAppearances";
  @SerializedName(SERIALIZED_NAME_UNCONFIRMED_TX_APPEARANCES)
  private BigDecimal unconfirmedTxAppearances;

  public static final String SERIALIZED_NAME_TX_APPEARANCES = "txAppearances";
  @SerializedName(SERIALIZED_NAME_TX_APPEARANCES)
  private BigDecimal txAppearances;

  public static final String SERIALIZED_NAME_TRANSACTIONS = "transactions";
  @SerializedName(SERIALIZED_NAME_TRANSACTIONS)
  private List<String> transactions = new ArrayList<String>();

  public GetAddressResponse addrStr(String addrStr) {
    this.addrStr = addrStr;
    return this;
  }

   /**
   * Address in string form
   * @return addrStr
  **/
  @ApiModelProperty(value = "Address in string form")
  public String getAddrStr() {
    return addrStr;
  }

  public void setAddrStr(String addrStr) {
    this.addrStr = addrStr;
  }

  public GetAddressResponse balance(BigDecimal balance) {
    this.balance = balance;
    return this;
  }

   /**
   * NEBL balance
   * @return balance
  **/
  @ApiModelProperty(value = "NEBL balance")
  public BigDecimal getBalance() {
    return balance;
  }

  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }

  public GetAddressResponse balanceSat(BigDecimal balanceSat) {
    this.balanceSat = balanceSat;
    return this;
  }

   /**
   * NEBL balance in satoshis
   * @return balanceSat
  **/
  @ApiModelProperty(value = "NEBL balance in satoshis")
  public BigDecimal getBalanceSat() {
    return balanceSat;
  }

  public void setBalanceSat(BigDecimal balanceSat) {
    this.balanceSat = balanceSat;
  }

  public GetAddressResponse totalReceived(BigDecimal totalReceived) {
    this.totalReceived = totalReceived;
    return this;
  }

   /**
   * Total NEBL received
   * @return totalReceived
  **/
  @ApiModelProperty(value = "Total NEBL received")
  public BigDecimal getTotalReceived() {
    return totalReceived;
  }

  public void setTotalReceived(BigDecimal totalReceived) {
    this.totalReceived = totalReceived;
  }

  public GetAddressResponse totalReceivedSat(BigDecimal totalReceivedSat) {
    this.totalReceivedSat = totalReceivedSat;
    return this;
  }

   /**
   * Total NEBL received in satoshis
   * @return totalReceivedSat
  **/
  @ApiModelProperty(value = "Total NEBL received in satoshis")
  public BigDecimal getTotalReceivedSat() {
    return totalReceivedSat;
  }

  public void setTotalReceivedSat(BigDecimal totalReceivedSat) {
    this.totalReceivedSat = totalReceivedSat;
  }

  public GetAddressResponse totalSent(BigDecimal totalSent) {
    this.totalSent = totalSent;
    return this;
  }

   /**
   * Total NEBL sent
   * @return totalSent
  **/
  @ApiModelProperty(value = "Total NEBL sent")
  public BigDecimal getTotalSent() {
    return totalSent;
  }

  public void setTotalSent(BigDecimal totalSent) {
    this.totalSent = totalSent;
  }

  public GetAddressResponse totalSentSat(BigDecimal totalSentSat) {
    this.totalSentSat = totalSentSat;
    return this;
  }

   /**
   * Total NEBL sent satoshis
   * @return totalSentSat
  **/
  @ApiModelProperty(value = "Total NEBL sent satoshis")
  public BigDecimal getTotalSentSat() {
    return totalSentSat;
  }

  public void setTotalSentSat(BigDecimal totalSentSat) {
    this.totalSentSat = totalSentSat;
  }

  public GetAddressResponse unconfirmedBalance(BigDecimal unconfirmedBalance) {
    this.unconfirmedBalance = unconfirmedBalance;
    return this;
  }

   /**
   * Unconfirmed NEBL balance
   * @return unconfirmedBalance
  **/
  @ApiModelProperty(value = "Unconfirmed NEBL balance")
  public BigDecimal getUnconfirmedBalance() {
    return unconfirmedBalance;
  }

  public void setUnconfirmedBalance(BigDecimal unconfirmedBalance) {
    this.unconfirmedBalance = unconfirmedBalance;
  }

  public GetAddressResponse unconfirmedBalanceSat(BigDecimal unconfirmedBalanceSat) {
    this.unconfirmedBalanceSat = unconfirmedBalanceSat;
    return this;
  }

   /**
   * Unconfirmed NEBL balance in satoshis
   * @return unconfirmedBalanceSat
  **/
  @ApiModelProperty(value = "Unconfirmed NEBL balance in satoshis")
  public BigDecimal getUnconfirmedBalanceSat() {
    return unconfirmedBalanceSat;
  }

  public void setUnconfirmedBalanceSat(BigDecimal unconfirmedBalanceSat) {
    this.unconfirmedBalanceSat = unconfirmedBalanceSat;
  }

  public GetAddressResponse unconfirmedTxAppearances(BigDecimal unconfirmedTxAppearances) {
    this.unconfirmedTxAppearances = unconfirmedTxAppearances;
    return this;
  }

   /**
   * Number of unconfirmed transactions for this address
   * @return unconfirmedTxAppearances
  **/
  @ApiModelProperty(value = "Number of unconfirmed transactions for this address")
  public BigDecimal getUnconfirmedTxAppearances() {
    return unconfirmedTxAppearances;
  }

  public void setUnconfirmedTxAppearances(BigDecimal unconfirmedTxAppearances) {
    this.unconfirmedTxAppearances = unconfirmedTxAppearances;
  }

  public GetAddressResponse txAppearances(BigDecimal txAppearances) {
    this.txAppearances = txAppearances;
    return this;
  }

   /**
   * Number of transactions for this address
   * @return txAppearances
  **/
  @ApiModelProperty(value = "Number of transactions for this address")
  public BigDecimal getTxAppearances() {
    return txAppearances;
  }

  public void setTxAppearances(BigDecimal txAppearances) {
    this.txAppearances = txAppearances;
  }

  public GetAddressResponse transactions(List<String> transactions) {
    this.transactions = transactions;
    return this;
  }

  public GetAddressResponse addTransactionsItem(String transactionsItem) {
    if (this.transactions == null) {
      this.transactions = new ArrayList<String>();
    }
    this.transactions.add(transactionsItem);
    return this;
  }

   /**
   * Array of transaction ids for this address
   * @return transactions
  **/
  @ApiModelProperty(value = "Array of transaction ids for this address")
  public List<String> getTransactions() {
    return transactions;
  }

  public void setTransactions(List<String> transactions) {
    this.transactions = transactions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAddressResponse getAddressResponse = (GetAddressResponse) o;
    return Objects.equals(this.addrStr, getAddressResponse.addrStr) &&
        Objects.equals(this.balance, getAddressResponse.balance) &&
        Objects.equals(this.balanceSat, getAddressResponse.balanceSat) &&
        Objects.equals(this.totalReceived, getAddressResponse.totalReceived) &&
        Objects.equals(this.totalReceivedSat, getAddressResponse.totalReceivedSat) &&
        Objects.equals(this.totalSent, getAddressResponse.totalSent) &&
        Objects.equals(this.totalSentSat, getAddressResponse.totalSentSat) &&
        Objects.equals(this.unconfirmedBalance, getAddressResponse.unconfirmedBalance) &&
        Objects.equals(this.unconfirmedBalanceSat, getAddressResponse.unconfirmedBalanceSat) &&
        Objects.equals(this.unconfirmedTxAppearances, getAddressResponse.unconfirmedTxAppearances) &&
        Objects.equals(this.txAppearances, getAddressResponse.txAppearances) &&
        Objects.equals(this.transactions, getAddressResponse.transactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addrStr, balance, balanceSat, totalReceived, totalReceivedSat, totalSent, totalSentSat, unconfirmedBalance, unconfirmedBalanceSat, unconfirmedTxAppearances, txAppearances, transactions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAddressResponse {\n");
    sb.append("    addrStr: ").append(toIndentedString(addrStr)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    balanceSat: ").append(toIndentedString(balanceSat)).append("\n");
    sb.append("    totalReceived: ").append(toIndentedString(totalReceived)).append("\n");
    sb.append("    totalReceivedSat: ").append(toIndentedString(totalReceivedSat)).append("\n");
    sb.append("    totalSent: ").append(toIndentedString(totalSent)).append("\n");
    sb.append("    totalSentSat: ").append(toIndentedString(totalSentSat)).append("\n");
    sb.append("    unconfirmedBalance: ").append(toIndentedString(unconfirmedBalance)).append("\n");
    sb.append("    unconfirmedBalanceSat: ").append(toIndentedString(unconfirmedBalanceSat)).append("\n");
    sb.append("    unconfirmedTxAppearances: ").append(toIndentedString(unconfirmedTxAppearances)).append("\n");
    sb.append("    txAppearances: ").append(toIndentedString(txAppearances)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
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

