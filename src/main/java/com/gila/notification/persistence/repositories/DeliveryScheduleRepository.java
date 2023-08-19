package com.gila.notification.persistence.repositories;

import com.gila.notification.persistence.entities.DeliverySchedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliveryScheduleRepository extends JpaRepository<DeliverySchedule, Long> {
}