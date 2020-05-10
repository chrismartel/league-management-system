package ca.leaguemanagementsystem.model.leagues;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "team")
public class Team {

    @Id
    @GeneratedValue
    private int teamId;

    private String name;        // team name
    private String imageUrl;    // have to figure out how to add images
    private int teamNumber;     // number of the team in the league
    private int wins;           // # of wins in the season
    private int losses;         // # of losses in the season
    private int ties;           // # of ties in the season
    private int pointsAgainst;  // cumulative of points accorded during the season
    private int pointsFor;      // cumulative of points made during the season


}
