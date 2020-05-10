package ca.leaguemanagementsystem.model.leagues;

import ca.leaguemanagementsystem.model.users.Player;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "teamAssignment")
public class TeamAssignment {

    @ManyToOne
    private Player player;

    @Temporal(TemporalType.DATE)
    private Date date;


    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }


    @ManyToOne
    private Team team;


    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;

    }
}
