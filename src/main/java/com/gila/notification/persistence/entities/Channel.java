package com.gila.notification.persistence.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "channels", schema = "notif")
public class Channel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false, length = 15)
    private String name;

    @Column(name = "enabled", nullable = false)
    private Boolean enabled = false;

    @Column(name = "creation_time", nullable = false)
    private Instant creationTime;

    @Column(name = "updated_time")
    private Instant updatedTime;

}