package ca.leaguemanagementsystem.model.leagues.schedules;

import ca.leaguemanagementsystem.model.leagues.schedules.Team;
import ca.leaguemanagementsystem.model.users.Player;


import javax.persistence.*;

import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.sql.Date;


@Entity
@Table(name = "teamAssignment")
public class PlayerTeamAssignment {


    /* associations */


    private Player player;  // assigned player

    @ManyToOne
    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }



    private Team team;  // team assigned to

    @ManyToOne
    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }


    /* attributes */


    private Integer teamAssignmentId;

    @Id
    @GeneratedValue
    public Integer getTeamAssignmentId() {
        return teamAssignmentId;
    }

    public void setTeamAssignmentId(Integer teamAssignmentId) {
        this.teamAssignmentId = teamAssignmentId;
    }


    private Date date;  // date of assignment

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;

    }
}
