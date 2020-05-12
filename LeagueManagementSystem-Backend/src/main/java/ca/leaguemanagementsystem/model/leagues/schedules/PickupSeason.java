package ca.leaguemanagementsystem.model.leagues.schedules;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("pcks")
@Table(name = "pickupSeason")
public class PickupSeason extends Schedule {
}
