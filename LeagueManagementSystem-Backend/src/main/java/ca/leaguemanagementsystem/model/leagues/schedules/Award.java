package ca.leaguemanagementsystem.model.leagues.schedules;

import ca.leaguemanagementsystem.model.users.Player;

import javax.persistence.*;

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
    private Season season;  // season in which the award was descerned

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }


    /* attributes */

    @Id
    @GeneratedValue
    private Integer awardID;

    public Integer getAwardID() {
        return awardID;
    }

    public void setAwardID(Integer awardID) {
        this.awardID = awardID;
    }


    private String awardName;

    public String getAwardName() {
        return awardName;
    }

    public void setAwardName(String awardName) {
        this.awardName = awardName;
    }
}
