package ca.leaguemanagementsystem.model.notifications;

import ca.leaguemanagementsystem.model.users.User;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@DiscriminatorColumn(name = "notification")
public class Notification {

    /* associations */

    @ManyToOne
    private User user;  // user to which the notification is sent

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    /* attributes */

    private String message; // message of the notification

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    private Date scheduledDate; // scheduled date for the notification

    public Date getScheduledDate() {
        return scheduledDate;
    }

    public void setScheduledDate(Date scheduledDate) {
        this.scheduledDate = scheduledDate;
    }


    private Time scheduledTime; // scheduled time for the notification

    public Time getScheduledTime() {
        return scheduledTime;
    }

    public void setScheduledTime(Time scheduledTime) {
        this.scheduledTime = scheduledTime;
    }
}
