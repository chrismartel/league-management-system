package ca.leaguemanagementsystem.model.leagues;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("pcklgue")
@Table(name = "pickUpLeague")
public class PickUpLeague extends League{

    /* attributes */

    private Integer minNbPlayers;   // min number of players in a pickup event

    public Integer getMinNbPlayers() {
        return minNbPlayers;
    }

    public void setMinNbPlayers(Integer minNbPlayers) {
        this.minNbPlayers = minNbPlayers;
    }


    private Integer maxNbPlayers;   // max number of player in a pickup event

    public Integer getMaxNbPlayers() {
        return maxNbPlayers;
    }

    public void setMaxNbPlayers(Integer maxNbPlayers) {
        this.maxNbPlayers = maxNbPlayers;
    }
}

