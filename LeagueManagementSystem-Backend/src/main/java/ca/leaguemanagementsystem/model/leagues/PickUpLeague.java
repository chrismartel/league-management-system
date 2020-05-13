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

    private int minNbPlayers;   // min number of players in a pickup event

    public int getMinNbPlayers() {
        return minNbPlayers;
    }

    public void setMinNbPlayers(int minNbPlayers) {
        this.minNbPlayers = minNbPlayers;
    }


    private int maxNbPlayers;   // max number of player in a pickup event

    public int getMaxNbPlayers() {
        return maxNbPlayers;
    }

    public void setMaxNbPlayers(int maxNbPlayers) {
        this.maxNbPlayers = maxNbPlayers;
    }
}

