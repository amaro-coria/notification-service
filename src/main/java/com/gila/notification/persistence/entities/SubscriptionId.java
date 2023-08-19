package com.gila.notification.persistence.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class SubscriptionId implements Serializable {
    private static final long serialVersionUID = -2374388039742093235L;
    @Column(name = "id_user", nullable = false)
    private Long idUser;

    @Column(name = "id_channel", nullable = false)
    private Integer idChannel;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        SubscriptionId entity = (SubscriptionId) o;
        return Objects.equals(this.idUser, entity.idUser) &&
                Objects.equals(this.idChannel, entity.idChannel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUser, idChannel);
    }

}