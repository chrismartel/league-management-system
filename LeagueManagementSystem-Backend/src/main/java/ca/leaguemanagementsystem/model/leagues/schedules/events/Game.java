package ca.leaguemanagementsystem.model.leagues.schedules.events;

import ca.leaguemanagementsystem.model.leagues.schedules.GameTeamAssignment;
import ca.leaguemanagementsystem.model.leagues.schedules.events.assignments.GameAssignment;
import ca.leaguemanagementsystem.model.notifications.GameNotification;

import javax.persistence.*;
import java.util.List;

@Entity
@DiscriminatorValue("game")
@Table(name = "game")
public class Game extends Event{


    /* associations */

    private List<PlayerStat> playerStats;   // player stats for players attending the game

    @OneToMany(
            mappedBy = "game",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    public List<PlayerStat> getPlayerStats() {
        return playerStats;
    }

    public void setPlayerStats(List<PlayerStat> playerStats) {
        this.playerStats = playerStats;
    }



    private List<GameNotification> gameNotifications;   // notifications generated for a game

    @OneToMany(mappedBy = "game")
    public List <GameNotification> getGameNotifications(){
        return gameNotifications;
    }

    public void setGameNotifications(List<GameNotification> gameNotifications){
        this.gameNotifications = gameNotifications;
    }



    private List<GameTeamAssignment> gameTeamAssignments;   // teams assigned to the game (must be 2)

    @OneToMany(mappedBy = "game")
    public List<GameTeamAssignment> getGameTeamAssignments() {
        return gameTeamAssignments;
    }

    public void setGameTeamAssignments(List<GameTeamAssignment> gameTeamAssignments) {
        this.gameTeamAssignments = gameTeamAssignments;
    }



    private List<GameAssignment> gameAssignments;   // referee and score keeping assignments for the game

    @OneToMany(
            mappedBy = "game",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    public List<GameAssignment> getGameAssignments() {
        return gameAssignments;
    }

    public void setGameAssignments(List<GameAssignment> gameAssignments) {
        this.gameAssignments = gameAssignments;
    }



    private MVP mvp;    // mvp of the game

    @OneToOne(
            cascade = CascadeType.ALL,
            mappedBy = "game",
            optional = true
    )
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



    private int scoreTeamA; // final score of Team A

    public int getScoreTeamA(){
        return scoreTeamA;
    }

    public void setScoreTeamA(int scoreTeamA){
        this.scoreTeamA = scoreTeamA;
    }



    private int scoreTeamB; // final score of Team B

    public int getScoreTeamB(){
        return scoreTeamB;
    }

    public void setScoreTeamB(int scoreTeamB){
        this.scoreTeamB = scoreTeamB;
    }

}
