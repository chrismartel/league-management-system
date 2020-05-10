package ca.leaguemanagementsystem.model.leagues;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("pcks")
@Table(name = "pickupSeason")
public class PickupSeason extends ScheduleType{
}
