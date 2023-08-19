package com.gila.notification.persistence.repositories;

import com.gila.notification.persistence.entities.DeliveryLog;
import com.gila.notification.persistence.entities.DeliveryLogId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliveryLogRepository extends JpaRepository<DeliveryLog, DeliveryLogId> {
}