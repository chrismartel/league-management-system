package ca.leaguemanagementsystem.model.leagues;

import ca.leaguemanagementsystem.model.users.Player;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "award")
public class Award {

    /* associations */

    @ManyToOne
    private Player player;  // player to which the award is deserved

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }


    @ManyToOne
    private League league;  // league in which the award was deserved SHOULD BE SEASON

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }


    /* attributes */

    private String awardName;

    public String getAwardName() {
        return awardName;
    }

    public void setAwardName(String awardName) {
        this.awardName = awardName;
    }
}
