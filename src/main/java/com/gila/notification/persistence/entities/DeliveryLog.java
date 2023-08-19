package com.gila.notification.persistence.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "delivery_log", schema = "notif")
public class DeliveryLog {
    @EmbeddedId
    private DeliveryLogId id;

    @Column(name = "no_try", nullable = false)
    private Short noTry;

    @Column(name = "created_time", nullable = false)
    private Instant createdTime;

    @Column(name = "log_message", length = 140)
    private String logMessage;

    @Column(name = "status", length = 15)
    private String status;

}