package com.gila.notification.persistence.repositories;

import com.gila.notification.persistence.entities.Subscription;
import com.gila.notification.persistence.entities.SubscriptionId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscriptionRepository extends JpaRepository<Subscription, SubscriptionId> {
}