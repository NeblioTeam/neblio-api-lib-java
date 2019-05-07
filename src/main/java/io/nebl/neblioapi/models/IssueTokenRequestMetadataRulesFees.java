/*
 * Neblio REST API Suite
 * APIs for Interacting with NTP1 Tokens & The Neblio Blockchain
 *
 * OpenAPI spec version: 1.2.2
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
import io.nebl.neblioapi.models.IssueTokenRequestMetadataRulesFeesItems;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * IssueTokenRequestMetadataRulesFees
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-05-07T22:19:41.714Z[UTC]")
public class IssueTokenRequestMetadataRulesFees {
  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<IssueTokenRequestMetadataRulesFeesItems> items = new ArrayList<IssueTokenRequestMetadataRulesFeesItems>();

  public static final String SERIALIZED_NAME_LOCKED = "locked";
  @SerializedName(SERIALIZED_NAME_LOCKED)
  private Boolean locked;

  public IssueTokenRequestMetadataRulesFees items(List<IssueTokenRequestMetadataRulesFeesItems> items) {
    this.items = items;
    return this;
  }

  public IssueTokenRequestMetadataRulesFees addItemsItem(IssueTokenRequestMetadataRulesFeesItems itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<IssueTokenRequestMetadataRulesFeesItems>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Array of objects describing fee rules
   * @return items
  **/
  @ApiModelProperty(value = "Array of objects describing fee rules")
  public List<IssueTokenRequestMetadataRulesFeesItems> getItems() {
    return items;
  }

  public void setItems(List<IssueTokenRequestMetadataRulesFeesItems> items) {
    this.items = items;
  }

  public IssueTokenRequestMetadataRulesFees locked(Boolean locked) {
    this.locked = locked;
    return this;
  }

   /**
   * Whether this rule can be modified in future transactions
   * @return locked
  **/
  @ApiModelProperty(value = "Whether this rule can be modified in future transactions")
  public Boolean getLocked() {
    return locked;
  }

  public void setLocked(Boolean locked) {
    this.locked = locked;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueTokenRequestMetadataRulesFees issueTokenRequestMetadataRulesFees = (IssueTokenRequestMetadataRulesFees) o;
    return Objects.equals(this.items, issueTokenRequestMetadataRulesFees.items) &&
        Objects.equals(this.locked, issueTokenRequestMetadataRulesFees.locked);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, locked);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueTokenRequestMetadataRulesFees {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
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

