package ca.leaguemanagementsystem.model.leagues.schedules.events;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("pckp")
@Table (name = "pickUp")
public class PickUp extends Event{

}
