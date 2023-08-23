package com.gila.notification.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;

import jakarta.validation.Valid;

import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * LogMessageResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-08-20T00:23:35.182632-06:00[America/Mexico_City]")
public class LogMessageResponse {

  @JsonProperty("messages")
  @Valid
  private List<Message> messages = null;

  public LogMessageResponse messages(List<Message> messages) {
    this.messages = messages;
    return this;
  }

  public LogMessageResponse addMessagesItem(Message messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<>();
    }
    this.messages.add(messagesItem);
    return this;
  }

  /**
   * Get messages
   * @return messages
  */
  @Valid 
  @Schema(name = "messages", required = false)
  public List<Message> getMessages() {
    return messages;
  }

  public void setMessages(List<Message> messages) {
    this.messages = messages;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogMessageResponse logMessageResponse = (LogMessageResponse) o;
    return Objects.equals(this.messages, logMessageResponse.messages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogMessageResponse {\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
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

