package ca.leaguemanagementsystem.dao.notifications;

import ca.leaguemanagementsystem.model.notifications.Notification;
import org.springframework.data.repository.CrudRepository;

public interface NotificationRepository extends CrudRepository<Notification, Long> {
}
