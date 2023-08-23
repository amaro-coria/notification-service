package com.gila.notification.persistence.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "message_log", schema = "notification")
public class MessageLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "message_content", nullable = false, length = 140)
    private String messageContent;

    @Column(name = "created_time", nullable = false)
    private Instant createdTime;

    @Column(name = "user_author", nullable = false, length = 30)
    private String userAuthor;

}