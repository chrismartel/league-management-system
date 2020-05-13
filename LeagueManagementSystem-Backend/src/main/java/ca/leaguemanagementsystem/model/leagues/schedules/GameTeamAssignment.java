package ca.leaguemanagementsystem.model.leagues.schedules;

import ca.leaguemanagementsystem.model.leagues.schedules.events.Game;

import javax.persistence.*;

@Entity
@Table(name = "game_team_assignment")
public class GameTeamAssignment {

    /* associations */


    private Game game;  // assigned game

    @ManyToOne
    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }


    private Team team;  // assigned team

    @ManyToOne
    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }


    /* attributes */


    private long gameTeamAssignmentId;

    @Id
    @GeneratedValue
    public long getGameTeamAssignmentId() {
        return gameTeamAssignmentId;
    }

    public void setGameTeamAssignmentId(long gameTeamAssignmentId) {
        this.gameTeamAssignmentId = gameTeamAssignmentId;
    }
}
