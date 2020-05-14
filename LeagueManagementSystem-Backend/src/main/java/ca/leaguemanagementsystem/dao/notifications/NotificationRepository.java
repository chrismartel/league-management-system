package ca.leaguemanagementsystem.dao.notifications;

import ca.leaguemanagementsystem.model.notifications.Notification;
import ca.leaguemanagementsystem.model.users.AppUser;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface NotificationRepository extends CrudRepository<Notification, Long> {
    Notification findByNotificationId(Long notificationId);
    List<Notification> findByReceiver(AppUser receiver);
}
