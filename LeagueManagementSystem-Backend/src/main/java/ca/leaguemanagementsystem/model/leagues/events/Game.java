package ca.leaguemanagementsystem.model.leagues.events;

import ca.leaguemanagementsystem.model.leagues.GameTeamAssignment;
import ca.leaguemanagementsystem.model.leagues.Team;
import ca.leaguemanagementsystem.model.leagues.events.assignments.GameAssignment;
import ca.leaguemanagementsystem.model.notifications.GameNotification;
import org.springframework.expression.spel.ast.Assign;

import javax.persistence.*;
import java.util.List;

@Entity
@DiscriminatorValue("game")
@Table(name = "game")
public class Game extends Event{


    /* associations */

    @OneToMany(
            mappedBy = "game",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<PlayerStat> playerStats;   // player stats for players attending the game

    public List<PlayerStat> getPlayerStats() {
        return playerStats;
    }

    public void setPlayerStats(List<PlayerStat> playerStats) {
        this.playerStats = playerStats;
    }


    @OneToMany(mappedBy = "game")
    private List<GameNotification> gameNotifications;   // notifications generated for a game

    public List <GameNotification> getGameNotifications(){
        return gameNotifications;
    }

    public void setGameNotifications(List<GameNotification> gameNotifications){
        this.gameNotifications = gameNotifications;
    }


    @OneToMany(mappedBy = "game")
    private List<GameTeamAssignment> gameTeamAssignments;   // teams assigned to the game (must be 2)

    public List<GameTeamAssignment> getGameTeamAssignments() {
        return gameTeamAssignments;
    }

    public void setGameTeamAssignments(List<GameTeamAssignment> gameTeamAssignments) {
        this.gameTeamAssignments = gameTeamAssignments;
    }


    @OneToMany(
            mappedBy = "gameAssignments",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<GameAssignment> gameAssignments;   // referee and score keeping assignments for the game

    public List<GameAssignment> getGameAssignments() {
        return gameAssignments;
    }

    public void setGameAssignments(List<GameAssignment> gameAssignments) {
        this.gameAssignments = gameAssignments;
    }


    @OneToOne(
            cascade = CascadeType.ALL,
            mappedBy = "game",
            optional = true
    )
    private MVP mvp;    // mvp of the game

    public MVP getMvp() {
        return mvp;
    }

    public void setMvp(MVP mvp) {
        this.mvp = mvp;
    }


    /* attributes */

    private GameState gameState;

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }



    private Integer scoreTeamA; // final score of Team A

    public Integer getScoreTeamA(){
        return scoreTeamA;
    }

    public void setScoreTeamA(Integer scoreTeamA){
        this.scoreTeamA = scoreTeamA;
    }



    private Integer scoreTeamB; // final score of Team B

    public Integer getScoreTeamB(){
        return scoreTeamB;
    }

    public void setScoreTeamB(Integer scoreTeamB){
        this.scoreTeamB = scoreTeamB;
    }

}
