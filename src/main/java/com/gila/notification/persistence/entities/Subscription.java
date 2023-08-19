package com.gila.notification.persistence.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "subscriptions", schema = "notif")
public class Subscription {
    @EmbeddedId
    private SubscriptionId id;

    @MapsId("idUser")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_user", nullable = false)
    private User idUser;

    @MapsId("idChannel")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_channel", nullable = false)
    private Channel idChannel;

    @Column(name = "enabled")
    private Boolean enabled;

    @Column(name = "creation_time", nullable = false)
    private Instant creationTime;

    @Column(name = "updated_time")
    private Instant updatedTime;

}