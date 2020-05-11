package ca.leaguemanagementsystem.model.leagues;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("pcklgue")
@Table(name = "pickUpLeague")
public class PickUpLeague extends League{

    private String scheduleName;
    //attributes
    private Integer minNbPlayers;
    private Integer maxNbPlayers;
    private Schedule schedule;


}

