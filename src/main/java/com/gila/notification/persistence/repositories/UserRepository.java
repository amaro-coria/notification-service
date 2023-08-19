package com.gila.notification.persistence.repositories;

import com.gila.notification.persistence.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}