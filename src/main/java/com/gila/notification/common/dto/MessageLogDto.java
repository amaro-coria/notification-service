package com.gila.notification.common.dto;

import java.io.Serializable;
import java.time.Instant;

/**
 * DTO for {@link com.gila.notification.persistence.entities.MessageLog}
 */
public record MessageLogDto(String message, Instant createdTime, String userAuthor) implements Serializable {
}