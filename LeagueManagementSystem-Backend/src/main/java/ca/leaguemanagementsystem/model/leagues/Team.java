package ca.leaguemanagementsystem.model.leagues;


import ca.leaguemanagementsystem.model.leagues.events.Game;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "team")
public class Team {

    @Id
    @GeneratedValue
    private int teamId;

    private String teamName;        // team name
    private String imageURL;    // have to figure out how to add images
    private int teamNumber;     // number of the team in the league
    private int wins;           // # of wins in the season
    private int losses;         // # of losses in the season
    private int ties;           // # of ties in the season
    private int pointsAgainst;  // cumulative of points accorded during the season
    private int pointsFor;      // cumulative of points made during the season




    @OneToMany(mappedBy = "myTeams")
    private List<TeamAssignment> teamAssignments;

    public List<TeamAssignment> getTeamAssignments() {
        return teamAssignments;
    }

    public void setTeamAssignments(List<TeamAssignment> teamAssignments) {
        this.teamAssignments = teamAssignments;
    }

    @ManyToOne
    private Season season;

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    @ManyToOne
    private Game game;

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    //attributes
    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public Integer getTeamNumber() {
        return teamNumber;
    }

    public void setTeamNumber(Integer teamNumber) {
        this.teamNumber = teamNumber;
    }

    public Integer getWins() {
        return wins;
    }

    public void setWins(Integer wins) {
        this.wins = wins;
    }

    public Integer getLosses() {
        return losses;
    }

    public void setLosses(Integer losses) {
        this.losses = losses;
    }

    public Integer getTies() {
        return ties;
    }

    public void setTies(Integer ties) {
        this.ties = ties;
    }

    public Integer getPointsAgainst() {
        return pointsAgainst;
    }

    public void setPointsAgainst(Integer pointsAgainst) {
        this.pointsAgainst = pointsAgainst;
    }

    public Integer getPointsFor() {
        return pointsFor;
    }

    public void setPointsFor(Integer pointsFor) {
        this.pointsFor = pointsFor;
    }
}
