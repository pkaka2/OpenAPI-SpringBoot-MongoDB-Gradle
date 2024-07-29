package com.polakams.foodServices.api.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;

import org.springframework.hateoas.RepresentationModel;

import java.util.*;
import jakarta.annotation.Generated;

/**
 * Order
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Order extends RepresentationModel<Order>  implements Serializable {

  private static final long serialVersionUID = 1L;

  private String orderId;

  private String customerId;

  private String agentId;

  private BigDecimal amount;

  @Valid
  private List<String> items;

  private String updatedBy;

  private String updatedTimestamp;

  private String status;

  private String localityId;

  public Order orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * Get orderId
   * @return orderId
  */
  
  @Schema(name = "orderId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("orderId")
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public Order customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * Get customerId
   * @return customerId
  */
  
  @Schema(name = "customerId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customerId")
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public Order agentId(String agentId) {
    this.agentId = agentId;
    return this;
  }

  /**
   * Get agentId
   * @return agentId
  */
  
  @Schema(name = "agentId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("agentId")
  public String getAgentId() {
    return agentId;
  }

  public void setAgentId(String agentId) {
    this.agentId = agentId;
  }

  public Order amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  */
  @Valid 
  @Schema(name = "amount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("amount")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public Order items(List<String> items) {
    this.items = items;
    return this;
  }

  public Order addItemsItem(String itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Get items
   * @return items
  */
  
  @Schema(name = "items", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("items")
  public List<String> getItems() {
    return items;
  }

  public void setItems(List<String> items) {
    this.items = items;
  }

  public Order updatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

  /**
   * Get updatedBy
   * @return updatedBy
  */
  
  @Schema(name = "updatedBy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updatedBy")
  public String getUpdatedBy() {
    return updatedBy;
  }

  public void setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
  }

  public Order updatedTimestamp(String updatedTimestamp) {
    this.updatedTimestamp = updatedTimestamp;
    return this;
  }

  /**
   * Get updatedTimestamp
   * @return updatedTimestamp
  */
  
  @Schema(name = "updatedTimestamp", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updatedTimestamp")
  public String getUpdatedTimestamp() {
    return updatedTimestamp;
  }

  public void setUpdatedTimestamp(String updatedTimestamp) {
    this.updatedTimestamp = updatedTimestamp;
  }

  public Order status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Order localityId(String localityId) {
    this.localityId = localityId;
    return this;
  }

  /**
   * Get localityId
   * @return localityId
  */
  
  @Schema(name = "localityId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("localityId")
  public String getLocalityId() {
    return localityId;
  }

  public void setLocalityId(String localityId) {
    this.localityId = localityId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Order order = (Order) o;
    return Objects.equals(this.orderId, order.orderId) &&
        Objects.equals(this.customerId, order.customerId) &&
        Objects.equals(this.agentId, order.agentId) &&
        Objects.equals(this.amount, order.amount) &&
        Objects.equals(this.items, order.items) &&
        Objects.equals(this.updatedBy, order.updatedBy) &&
        Objects.equals(this.updatedTimestamp, order.updatedTimestamp) &&
        Objects.equals(this.status, order.status) &&
        Objects.equals(this.localityId, order.localityId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, customerId, agentId, amount, items, updatedBy, updatedTimestamp, status, localityId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
    sb.append("    updatedTimestamp: ").append(toIndentedString(updatedTimestamp)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    localityId: ").append(toIndentedString(localityId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

