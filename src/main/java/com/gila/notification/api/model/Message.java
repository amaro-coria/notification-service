package com.gila.notification.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * Message
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-08-20T00:23:35.182632-06:00[America/Mexico_City]")
public class Message {

  @JsonProperty("id")
  private Long id;

  @JsonProperty("messageContent")
  private String messageContent;

  @JsonProperty("createdTime")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdTime;

  @JsonProperty("userAuthor")
  private String userAuthor;

  public Message id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", example = "1001", required = false)
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Message messageContent(String messageContent) {
    this.messageContent = messageContent;
    return this;
  }

  /**
   * Get messageContent
   * @return messageContent
  */
  @NotNull
  @Schema(name = "messageContent", example = "140 character content", required = true)
  public String getMessageContent() {
    return messageContent;
  }

  public void setMessageContent(String messageContent) {
    this.messageContent = messageContent;
  }

  public Message createdTime(OffsetDateTime createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Get createdTime
   * @return createdTime
  */
  @Valid
  @Schema(name = "createdTime", example = "2021-01-30T08:30Z", required = false)
  public OffsetDateTime getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(OffsetDateTime createdTime) {
    this.createdTime = createdTime;
  }

  public Message userAuthor(String userAuthor) {
    this.userAuthor = userAuthor;
    return this;
  }

  /**
   * Get userAuthor
   * @return userAuthor
  */
  
  @Schema(name = "userAuthor", example = "jhondoe314", required = false)
  public String getUserAuthor() {
    return userAuthor;
  }

  public void setUserAuthor(String userAuthor) {
    this.userAuthor = userAuthor;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Message message = (Message) o;
    return Objects.equals(this.id, message.id) &&
        Objects.equals(this.messageContent, message.messageContent) &&
        Objects.equals(this.createdTime, message.createdTime) &&
        Objects.equals(this.userAuthor, message.userAuthor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, messageContent, createdTime, userAuthor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Message {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    messageContent: ").append(toIndentedString(messageContent)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    userAuthor: ").append(toIndentedString(userAuthor)).append("\n");
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

