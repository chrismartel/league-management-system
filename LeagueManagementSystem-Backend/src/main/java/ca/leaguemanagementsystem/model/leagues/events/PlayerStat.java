package ca.leaguemanagementsystem.model.leagues.events;

import ca.leaguemanagementsystem.model.users.Player;

import javax.persistence.*;

@Entity
@Table(name = "playerStat")
public class PlayerStat {

    /* associations */

    @ManyToOne(optional = false)
    private Player player;  // player of whom the stats are recorded

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }


    @ManyToOne
    private Game game;  // game during which the stats are recorded

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }


    /* attributes */

    private Integer points; // points made during the game

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer value) {
        this.points = value;
    }


    private Integer rebounds;   // rebounds taken during the game

    public Integer getRebounds() {
        return rebounds;
    }

    public void setRebounds(Integer value) {
        this.rebounds = value;
    }


    private Integer assists;    // assists made during the game

    public Integer getAssists() {
        return assists;
    }

    public void setAssists(Integer value) {
        this.assists = value;
    }


    private Integer steals; // steals made during the game

    public Integer getSteals() {
        return steals;
    }

    public void setSteals(Integer value) {
        this.steals = value;
    }


    private Integer blocks; // blocks made during the game

    public Integer getBlocks() {
        return blocks;
    }

    public void setBlocks(Integer value) {
        this.blocks = value;
    }


    private Integer fieldGoalsMade;  // # of field goals made during the game

    public Integer getFieldGoalsAttempted() {
        return fieldGoalsAttempted;
    }

    public void setFieldGoalsAttempted(Integer fieldGoalsAttempted) {
        this.fieldGoalsAttempted = fieldGoalsAttempted;
    }


    private Integer fieldGoalsAttempted;  // # of field goals attempted during the game

    public Integer getFieldGoalsMade() {
        return fieldGoalsMade;
    }

    public void setFieldGoalsMade(Integer fieldGoalsMade) {
        this.fieldGoalsMade = fieldGoalsMade;
    }


    private Integer threePtsMade;  // # of 3 pointers made during the game

    public Integer getThreePtsMade() {
        return threePtsMade;
    }

    public void setThreePtsMade(Integer threePtsMade) {
        this.threePtsMade = threePtsMade;
    }


    private Integer threePtsAttempted;  // # of 3 pointers attempted during the game

    public Integer getThreePtsAttempted() {
        return threePtsAttempted;
    }

    public void setThreePtsAttempted(Integer threePtsAttempted) {
        this.threePtsAttempted = threePtsAttempted;
    }


    private Integer freeThrowsMade; // free throws made during the game

    public Integer getFreeThrowsMade() {
        return freeThrowsMade;
    }

    public void setFreeThrowsMade(Integer freeThrowsMade) {
        this.freeThrowsMade = freeThrowsMade;
    }


    private Integer freeThrowsAttempted; // free throws attempted during the game

    public Integer getFreeThrowsAttempted() {
        return freeThrowsAttempted;
    }

    public void setFreeThrowsAttempted(Integer freeThrowsAttempted) {
        this.freeThrowsAttempted = freeThrowsAttempted;
    }


    private Integer turnovers;  // number of turnovers made during the game

    public Integer getTurnovers() {
        return turnovers;
    }

    public void setTurnovers(Integer turnovers) {
        this.turnovers = turnovers;
    }


    private Integer fouls;  // number of fouls obtained during the game

    public Integer getFouls() {
        return fouls;
    }

    public void setFouls(Integer fouls) {
        this.fouls = fouls;
    }


    private Integer technicalFouls; // number of technical fouls obtained during the game

    public Integer getTechnicalFouls() {
        return technicalFouls;
    }

    public void setTechnicalFouls(Integer technicalFouls) {
        this.technicalFouls = technicalFouls;
    }
}
