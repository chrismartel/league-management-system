package ca.leaguemanagementsystem.model.leagues.schedules;

import ca.leaguemanagementsystem.model.users.Player;

import javax.persistence.*;

@Entity
@Table(name = "award")
public class Award {

    /* associations */


    private Player player;  // player to which the award is deserved

    @ManyToOne
    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }


    private Season season;  // season in which the award was descerned

    @ManyToOne
    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }


    /* attributes */

    private Long awardId;

    @Id
    @GeneratedValue
    public Long getAwardId() {
        return awardId;
    }

    public void setAwardId(Long awardId) {
        this.awardId = awardId;
    }




    private String awardName;

    public String getAwardName() {
        return awardName;
    }

    public void setAwardName(String awardName) {
        this.awardName = awardName;
    }
}
