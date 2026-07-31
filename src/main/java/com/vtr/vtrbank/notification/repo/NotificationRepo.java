package com.vtr.vtrbank.notification.repo;

import com.vtr.vtrbank.notification.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepo extends JpaRepository<Notification, Long> {
}
