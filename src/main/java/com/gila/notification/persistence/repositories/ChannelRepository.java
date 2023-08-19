package com.gila.notification.persistence.repositories;

import com.gila.notification.persistence.entities.Channel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChannelRepository extends JpaRepository<Channel, Integer> {
}