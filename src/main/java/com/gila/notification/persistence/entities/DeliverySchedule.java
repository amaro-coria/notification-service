package com.gila.notification.persistence.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "delivery_schedule", schema = "notification")
public class DeliverySchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_message", nullable = false)
    private MessageLog idMessage;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_channel", nullable = false)
    private Channel idChannel;

    @Column(name = "created_time", nullable = false)
    private Instant createdTime;

}