package ca.leaguemanagementsystem.model.leagues.schedules;

import ca.leaguemanagementsystem.model.leagues.schedules.events.Game;

import javax.persistence.*;

@Entity
@Table(name = "game_team_assignment")
public class GameTeamAssignment {

    /* associations */

    @ManyToOne
    private Game game;  // assigned game

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    @ManyToOne
    private Team team;  // assigned team

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }


    /* attributes */

    @Id
    @GeneratedValue
    private Integer gameTeamAssignmentId;

    public Integer getGameTeamAssignmentId() {
        return gameTeamAssignmentId;
    }

    public void setGameTeamAssignmentId(Integer gameTeamAssignmentId) {
        this.gameTeamAssignmentId = gameTeamAssignmentId;
    }
}
