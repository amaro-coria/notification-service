package com.gila.notification.persistence.repositories;

import com.gila.notification.persistence.entities.MessageLog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MessageLogRepository extends JpaRepository<MessageLog, Long> {

    List<MessageLog> findAllByOrderByCreatedTimeDesc();
}