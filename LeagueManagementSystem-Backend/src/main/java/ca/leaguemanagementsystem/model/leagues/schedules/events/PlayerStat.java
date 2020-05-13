package ca.leaguemanagementsystem.model.leagues.schedules.events;

import ca.leaguemanagementsystem.model.users.Player;

import javax.persistence.*;

@Entity
@Table(name = "playerStat")
public class PlayerStat {

    /* associations */


    private Player player;  // player of whom the stats are recorded

    @ManyToOne(optional = false)
    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }



    private Game game;  // game during which the stats are recorded

    @ManyToOne
    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }


    /* attributes */

    private int points; // points made during the game

    public int getPoints() {
        return points;
    }

    public void setPoints(int value) {
        this.points = value;
    }


    private int rebounds;   // rebounds taken during the game

    public int getRebounds() {
        return rebounds;
    }

    public void setRebounds(int value) {
        this.rebounds = value;
    }


    private int assists;    // assists made during the game

    public int getAssists() {
        return assists;
    }

    public void setAssists(int value) {
        this.assists = value;
    }


    private int steals; // steals made during the game

    public int getSteals() {
        return steals;
    }

    public void setSteals(int value) {
        this.steals = value;
    }


    private int blocks; // blocks made during the game

    public int getBlocks() {
        return blocks;
    }

    public void setBlocks(int value) {
        this.blocks = value;
    }


    private int fieldGoalsMade;  // # of field goals made during the game

    public int getFieldGoalsAttempted() {
        return fieldGoalsAttempted;
    }

    public void setFieldGoalsAttempted(int fieldGoalsAttempted) {
        this.fieldGoalsAttempted = fieldGoalsAttempted;
    }


    private int fieldGoalsAttempted;  // # of field goals attempted during the game

    public int getFieldGoalsMade() {
        return fieldGoalsMade;
    }

    public void setFieldGoalsMade(int fieldGoalsMade) {
        this.fieldGoalsMade = fieldGoalsMade;
    }


    private int threePtsMade;  // # of 3 pointers made during the game

    public int getThreePtsMade() {
        return threePtsMade;
    }

    public void setThreePtsMade(int threePtsMade) {
        this.threePtsMade = threePtsMade;
    }


    private int threePtsAttempted;  // # of 3 pointers attempted during the game

    public int getThreePtsAttempted() {
        return threePtsAttempted;
    }

    public void setThreePtsAttempted(int threePtsAttempted) {
        this.threePtsAttempted = threePtsAttempted;
    }


    private int freeThrowsMade; // free throws made during the game

    public int getFreeThrowsMade() {
        return freeThrowsMade;
    }

    public void setFreeThrowsMade(int freeThrowsMade) {
        this.freeThrowsMade = freeThrowsMade;
    }


    private int freeThrowsAttempted; // free throws attempted during the game

    public int getFreeThrowsAttempted() {
        return freeThrowsAttempted;
    }

    public void setFreeThrowsAttempted(int freeThrowsAttempted) {
        this.freeThrowsAttempted = freeThrowsAttempted;
    }


    private int turnovers;  // number of turnovers made during the game

    public int getTurnovers() {
        return turnovers;
    }

    public void setTurnovers(int turnovers) {
        this.turnovers = turnovers;
    }


    private int fouls;  // number of fouls obtained during the game

    public int getFouls() {
        return fouls;
    }

    public void setFouls(int fouls) {
        this.fouls = fouls;
    }


    private int technicalFouls; // number of technical fouls obtained during the game

    public int getTechnicalFouls() {
        return technicalFouls;
    }

    public void setTechnicalFouls(int technicalFouls) {
        this.technicalFouls = technicalFouls;
    }



    private long playerStatId;

    @Id
    @GeneratedValue
    public long getPlayerStatId() {
        return playerStatId;
    }

    public void setPlayerStatId(long playerStatId) {
        this.playerStatId = playerStatId;
    }
}
