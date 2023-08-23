package com.gila.notification.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;

import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * AddMessageResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-08-20T00:23:35.182632-06:00[America/Mexico_City]")
public class AddMessageResponse {

  @JsonProperty("message")
  private Message message;

  public AddMessageResponse message(Message message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  */
  @Valid
  @Schema(name = "message", required = false)
  public Message getMessage() {
    return message;
  }

  public void setMessage(Message message) {
    this.message = message;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddMessageResponse addMessageResponse = (AddMessageResponse) o;
    return Objects.equals(this.message, addMessageResponse.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddMessageResponse {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

