package com.polakams.foodServices.api.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.polakams.foodServices.api.model.Contact;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;

import org.springframework.hateoas.RepresentationModel;

import java.util.*;
import jakarta.annotation.Generated;

/**
 * Customer
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Customer extends RepresentationModel<Customer>  implements Serializable {

  private static final long serialVersionUID = 1L;

  private String id;

  private String name;

  private String localityId;

  private String defaultGeoLocationId;

  private Contact contact;

  public Customer id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Customer name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Customer localityId(String localityId) {
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

  public Customer defaultGeoLocationId(String defaultGeoLocationId) {
    this.defaultGeoLocationId = defaultGeoLocationId;
    return this;
  }

  /**
   * Get defaultGeoLocationId
   * @return defaultGeoLocationId
  */
  
  @Schema(name = "defaultGeoLocationId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defaultGeoLocationId")
  public String getDefaultGeoLocationId() {
    return defaultGeoLocationId;
  }

  public void setDefaultGeoLocationId(String defaultGeoLocationId) {
    this.defaultGeoLocationId = defaultGeoLocationId;
  }

  public Customer contact(Contact contact) {
    this.contact = contact;
    return this;
  }

  /**
   * Get contact
   * @return contact
  */
  @Valid 
  @Schema(name = "contact", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contact")
  public Contact getContact() {
    return contact;
  }

  public void setContact(Contact contact) {
    this.contact = contact;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Customer customer = (Customer) o;
    return Objects.equals(this.id, customer.id) &&
        Objects.equals(this.name, customer.name) &&
        Objects.equals(this.localityId, customer.localityId) &&
        Objects.equals(this.defaultGeoLocationId, customer.defaultGeoLocationId) &&
        Objects.equals(this.contact, customer.contact);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, localityId, defaultGeoLocationId, contact);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Customer {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    localityId: ").append(toIndentedString(localityId)).append("\n");
    sb.append("    defaultGeoLocationId: ").append(toIndentedString(defaultGeoLocationId)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
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

