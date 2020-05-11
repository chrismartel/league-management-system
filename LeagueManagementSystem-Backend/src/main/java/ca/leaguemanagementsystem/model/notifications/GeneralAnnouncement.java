package ca.leaguemanagementsystem.model.notifications;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("ga")
@Table(name = "general_announcement")
public class GeneralAnnouncement extends Notification{
}
