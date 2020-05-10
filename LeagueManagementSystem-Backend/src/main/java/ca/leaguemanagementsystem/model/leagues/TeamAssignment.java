package ca.leaguemanagementsystem.model.leagues;

import ca.leaguemanagementsystem.model.users.Player;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "team_assignment")
public class TeamAssignment {
    @ManyToOne
    private Player player;
    @ManyToOne
    private Team team;

    @Temporal(TemporalType.DATE)
    private Date date;

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

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
