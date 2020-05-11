package ca.leaguemanagementsystem.model.leagues;

import ca.leaguemanagementsystem.model.users.Player;


import javax.persistence.*;

import javax.persistence.ManyToOne;
import javax.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "teamAssignment")
public class PlayerTeamAssignment {


    /* associations */

    @ManyToOne
    private Player player;  // assigned player


    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }


    @ManyToOne
    private Team team;  // team assigned to


    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }


    /* attributes */

    @Id
    @GeneratedValue
    private Integer teamAssignmentId;

    public Integer getTeamAssignmentId() {
        return teamAssignmentId;
    }

    public void setTeamAssignmentId(Integer teamAssignmentId) {
        this.teamAssignmentId = teamAssignmentId;
    }


    @Temporal(TemporalType.DATE)
    private Date date;  // date of assignment

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;

    }
}
