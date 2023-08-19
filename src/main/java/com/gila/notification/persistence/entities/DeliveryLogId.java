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
public class DeliveryLogId implements Serializable {
    private static final long serialVersionUID = -6873950289086639006L;
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "id_schedule", nullable = false)
    private Long idSchedule;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        DeliveryLogId entity = (DeliveryLogId) o;
        return Objects.equals(this.idSchedule, entity.idSchedule) &&
                Objects.equals(this.id, entity.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSchedule, id);
    }

}