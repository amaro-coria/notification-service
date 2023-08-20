package com.gila.notification.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;

import jakarta.validation.Valid;
import org.openapitools.model.Channel;
import org.openapitools.model.Message;

import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * AddMessageRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-08-20T00:23:35.182632-06:00[America/Mexico_City]")
public class AddMessageRequest {

  @JsonProperty("message")
  private Message message;

  @JsonProperty("channels")
  @Valid
  private List<Channel> channels = null;

  public AddMessageRequest message(Message message) {
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

  public AddMessageRequest channels(List<Channel> channels) {
    this.channels = channels;
    return this;
  }

  public AddMessageRequest addChannelsItem(Channel channelsItem) {
    if (this.channels == null) {
      this.channels = new ArrayList<>();
    }
    this.channels.add(channelsItem);
    return this;
  }

  /**
   * Get channels
   * @return channels
  */
  @Valid 
  @Schema(name = "channels", required = false)
  public List<Channel> getChannels() {
    return channels;
  }

  public void setChannels(List<Channel> channels) {
    this.channels = channels;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddMessageRequest addMessageRequest = (AddMessageRequest) o;
    return Objects.equals(this.message, addMessageRequest.message) &&
        Objects.equals(this.channels, addMessageRequest.channels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, channels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddMessageRequest {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
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

