package ca.leaguemanagementsystem.model.leagues.schedules;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "team")
public class Team {

    /* associations */

    @OneToMany(mappedBy = "team")
    private List<PlayerTeamAssignment> playerTeamAssignments;

    public List<PlayerTeamAssignment> getPlayerTeamAssignments() {
        return playerTeamAssignments;
    }

    public void setPlayerTeamAssignments(List<PlayerTeamAssignment> playerTeamAssignments) {
        this.playerTeamAssignments = playerTeamAssignments;
    }

    @ManyToOne
    private Season season;  // season in which the team plays, season is the parent

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }


    @OneToMany(mappedBy = "team")
    private List<GameTeamAssignment> gameTeamAssignments;   // games assignments of the team

    public List<GameTeamAssignment> getGameTeamAssignments() {
        return gameTeamAssignments;
    }

    public void setGameTeamAssignments(List<GameTeamAssignment> gameTeamAssignments) {
        this.gameTeamAssignments = gameTeamAssignments;
    }


    /* attributes */

    @Id
    @GeneratedValue
    private int teamId; // Id for database

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }


    private String teamName;    // name of the team

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }


    private String imageURL;    // have to figure out how to add images

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }


    private int teamNumber;     // number of the team in the league

    public int getTeamNumber() {
        return teamNumber;
    }

    public void setTeamNumber(int teamNumber) {
        this.teamNumber = teamNumber;
    }


    private int wins;           // # of wins in the season

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }


    private int losses;         // # of losses in the season

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }


    private int ties;           // # of ties in the season

    public int getTies() {
        return ties;
    }

    public void setTies(int ties) {
        this.ties = ties;
    }


    private int pointsAgainst;  // cumulative of points accorded during the season

    public int getPointsAgainst() {
        return pointsAgainst;
    }

    public void setPointsAgainst(int pointsAgainst) {
        this.pointsAgainst = pointsAgainst;
    }


    private int pointsFor;      // cumulative of points made during the season

    public int getPointsFor() {
        return pointsFor;
    }

    public void setPointsFor(int pointsFor) {
        this.pointsFor = pointsFor;
    }
}
