package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
/**
 * AdditionalPropertiesBoolean
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")@com.fasterxml.jackson.annotation.JsonFilter(value = "filter-name")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(value = "id")

public class AdditionalPropertiesBoolean   {
  @JsonProperty("name")
  private String name;

  public AdditionalPropertiesBoolean name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

    /**
    * A container for additional, undeclared properties.
    * This is a holder for any undeclared properties as specified with
    * the 'additionalProperties' keyword in the OAS document.
    */
    private Map<String, Boolean> additionalProperties;

    /**
    * Set the additional (undeclared) property with the specified name and value.
    * If the property does not already exist, create it otherwise replace it.
    */
    @JsonAnySetter
    public AdditionalPropertiesBoolean putAdditionalProperty(String key, Boolean value) {
    if (this.additionalProperties == null) {
    this.additionalProperties = new HashMap<String, Boolean>();
    }
    this.additionalProperties.put(key, value);
    return this;
    }

    /**
    * Return the additional (undeclared) property.
    */
    @JsonAnyGetter
    public Map<String, Boolean> getAdditionalProperties() {
    return additionalProperties;
    }

    /**
    * Return the additional (undeclared) property with the specified name.
    */
    public Boolean getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
    return null;
    }
    return this.additionalProperties.get(key);
    }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalPropertiesBoolean additionalPropertiesBoolean = (AdditionalPropertiesBoolean) o;
    return Objects.equals(this.name, additionalPropertiesBoolean.name) &&
    Objects.equals(this.additionalProperties, additionalPropertiesBoolean.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalPropertiesBoolean {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

