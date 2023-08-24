package com.gila.notification.common.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.Instant;

/**
 * DTO for {@link com.gila.notification.persistence.entities.MessageLog}
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MessageLogDto implements Serializable {

    private String messageContent;
    private Instant createdTime;
    private String userAuthor;
}