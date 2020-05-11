package ca.leaguemanagementsystem.model.leagues.events;

import ca.leaguemanagementsystem.model.leagues.Team;
import ca.leaguemanagementsystem.model.leagues.events.assignments.Assignment;
import ca.leaguemanagementsystem.model.notifications.GameNotification;
import org.springframework.expression.spel.ast.Assign;

import javax.persistence.*;
import java.util.List;

@Entity
@DiscriminatorValue("game")
@Table(name = "game")
public class Game extends EventType{

    @OneToOne
    @JoinColumn(name = "fk_playerStat")
    private PlayerStat playerStat;

    public PlayerStat getPlayerStat() {
        return playerStat;
    }

    public void setPlayerStat(PlayerStat playerStat) {
        this.playerStat = playerStat;
    }

    @OneToMany(mappedBy = "game")
    private List<GameNotification> gameNotifications;

    public List <GameNotification> getGameNotifications(){
        return gameNotifications;
    }

    public void setGameNotifications(List<GameNotification> gameNotifications){
        this.gameNotifications = gameNotifications;
    }

    @OneToMany(mappedBy = "game")
    private List<Team> teams;

    public List <Team> getTeams(){
        return teams;
    }

    public void setTeams(List<Team> teams){
        this.teams = teams;
    }

    @OneToMany(
            mappedBy = "gameAssignments",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Assignment> assignments;

    public List<Assignment> getAssignments() {
        return assignments;
    }

    public void setAssignments(List<Assignment> assignments) {
        this.assignments = assignments;
    }

    //attributes
    private GameState gameState;

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    private Integer scoreTeamA;

    public Integer getScoreTeamA(){
        return scoreTeamA;
    }

    public void setScoreTeamA(Integer scoreTeamA){
        this.scoreTeamA = scoreTeamA;
    }

    private Integer scoreTeamB;

    public Integer getScoreTeamB(){
        return scoreTeamB;
    }

    public void setScoreTeamB(Integer scoreTeamB){
        this.scoreTeamB = scoreTeamB;
    }

}
