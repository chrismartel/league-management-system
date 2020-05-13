package ca.leaguemanagementsystem.model.leagues;

import javax.persistence.*;

@Entity
@DiscriminatorValue("cmpl")
@Table(name = "competitiveLeague")
public class CompetitiveLeague extends League{

    /* attributes */

    private int minNbTeams; // minimum number of teams in the league

    public int getMinNbTeams(){
        return minNbTeams;
    }

    public void setMinNbTeams(int minNbTeams) {
        this.minNbTeams = minNbTeams;
    }


    private int maxNbTeams; // maximum number of teams in the league

    public int getMaxNbTeams() {
        return maxNbTeams;
    }

    public void setMaxNbTeams(int maxNbTeams) {
        this.maxNbTeams = maxNbTeams;
    }


    private int minNbPlayersPerTeam;    // minimum number of players per team

    public int getMinNbPlayersPerTeam() {
        return minNbPlayersPerTeam;
    }

    public void setMinNbPlayersPerTeam(int minNbPlayersPerTeam) {
        this.minNbPlayersPerTeam = minNbPlayersPerTeam;
    }


    private int maxNbPlayersPerTeam;    // maximum number of players per team

    public int getMaxNbPlayersPerTeam() {
        return maxNbPlayersPerTeam;
    }

    public void setMaxNbPlayersPerTeam(int maxNbPlayersPerTeam) {
        this.maxNbPlayersPerTeam = maxNbPlayersPerTeam;
    }


    private int gameLength; // game lengths

    public int getGameLength() {
        return gameLength;
    }

    public void setGameLength(int gameLength) {
        this.gameLength = gameLength;
    }


    private int shotClockLength;    // shot clock length

    public int getShotClockLength() {
        return shotClockLength;
    }

    public void setShotClockLength(int shotClockLength) {
        this.shotClockLength = shotClockLength;
    }


    private int nbScoreKeepersPerGame;  // number of scorekeepers required per game

    public int getNbScoreKeepersPerGame() {
        return nbScoreKeepersPerGame;
    }

    public void setNbScoreKeepersPerGame(int nbScoreKeepersPerGame) {
        this.nbScoreKeepersPerGame = nbScoreKeepersPerGame;
    }


    private int nbRefereesPerGame;  // number of referees required per game

    public int getNbRefereesPerGame() {
        return nbRefereesPerGame;
    }

    public void setNbRefereesPerGame(int nbRefereesPerGame) {
        this.nbRefereesPerGame = nbRefereesPerGame;
    }


    private int nbTeamsPlayoffs;    // number of teams eligible for playoffs

    public int getNbTeamsPlayoffs() {
        return nbTeamsPlayoffs;
    }

    public void setNbTeamsPlayoffs(int nbTeamsPlayoffs) {
        this.nbTeamsPlayoffs = nbTeamsPlayoffs;
    }


    private boolean recordsPoints;  // does the league records points

    public boolean isRecordsPoints() {
        return recordsPoints;
    }

    public void setRecordsPoints(boolean recordsPoints) {
        this.recordsPoints = recordsPoints;
    }


    private boolean recordsAssists;  // does the league records assists

    public boolean isRecordsAssists() {
        return recordsAssists;
    }

    public void setRecordsAssists(boolean recordsAssists) {
        this.recordsAssists = recordsAssists;
    }


    private boolean recordsRebounds;  // does the league records rebounds

    public boolean isRecordsRebounds() {
        return recordsRebounds;
    }

    public void setRecordsRebounds(boolean recordsRebounds) {
        this.recordsRebounds = recordsRebounds;
    }


    private boolean recordsBlocks;  // does the league records blocks

    public boolean isRecordsBlocks() {
        return recordsBlocks;
    }

    public void setRecordsBlocks(boolean recordsBlocks) {
        this.recordsBlocks = recordsBlocks;
    }


    private boolean recordsSteals;  // does the league records steals

    public boolean isRecordsSteals() {
        return recordsSteals;
    }

    public void setRecordsSteals(boolean recordsSteals) {
        this.recordsSteals = recordsSteals;
    }


    private boolean recordsTurnovers;  // does the league records turnovers

    public boolean isRecordsTurnovers() {
        return recordsTurnovers;
    }

    public void setRecordsTurnovers(boolean recordsTurnovers) {
        this.recordsTurnovers = recordsTurnovers;
    }


    private boolean recordsFouls;  // does the league records fouls

    public boolean isRecordsFouls() {
        return recordsFouls;
    }

    public void setRecordsFouls(boolean recordsFouls) {
        this.recordsFouls = recordsFouls;
    }


    private boolean recordsTechFouls;  // does the league records technical fouls

    public boolean isRecordsTechFouls() {
        return recordsTechFouls;
    }

    public void setRecordsTechFouls(boolean recordsTechFouls) {
        this.recordsTechFouls = recordsTechFouls;
    }


    private boolean recordsFieldGoalsMade;  // does the league records # of FG made

    public boolean isRecordsFieldGoalsMade() {
        return recordsFieldGoalsMade;
    }

    public void setRecordsFieldGoalsMade(boolean recordsFieldGoalsMade) {
        this.recordsFieldGoalsMade = recordsFieldGoalsMade;
    }

    private boolean recordsFieldGoalsAttempted;  // does the league records the # of FG attempted

    public boolean isRecordsFieldGoalsAttempted() {
        return recordsFieldGoalsAttempted;
    }

    public void setRecordsFieldGoalsAttempted(boolean recordsFieldGoalsAttempted) {
        this.recordsFieldGoalsAttempted = recordsFieldGoalsAttempted;
    }


    private boolean recordsThreePtsMade;  // does the league records # of 3 pointers made

    public boolean isRecordsThreePtsMade() {
        return recordsThreePtsMade;
    }

    public void setRecordsThreePtsMade(boolean recordsThreePtsMade) {
        this.recordsThreePtsMade = recordsThreePtsMade;
    }

    private boolean recordsThreePtsAttempted;  // does the league records the # of 3 pointers attempted

    public boolean isRecordsThreePtsAttempted() {
        return recordsThreePtsAttempted;
    }

    public void setRecordsThreePtsAttempted(boolean recordsThreePtsAttempted) {
        this.recordsThreePtsAttempted = recordsThreePtsAttempted;
    }


    private boolean recordsFreeThrowsMade;  // does the league records free throws made

    public boolean isRecordsFreeThrowsMade() {
        return recordsFreeThrowsMade;
    }

    public void setRecordsFreeThrowsMade(boolean recordsFreeThrowsMade) {
        this.recordsFreeThrowsMade = recordsFreeThrowsMade;
    }


    private boolean recordsFreeThrowsAttempted;  // does the league records free throws attempted

    public boolean isRecordsFreeThrowsAttempted() {
        return recordsFreeThrowsAttempted;
    }

    public void setRecordsFreeThrowsAttempted(boolean recordsFreeThrowsAttempted) {
        this.recordsFreeThrowsAttempted = recordsFreeThrowsAttempted;
    }


    private boolean gameHaveMVPs;  // does the games have MVPs

    public boolean isGameHaveMVPs() {
        return gameHaveMVPs;
    }

    public void setGameHaveMVPs(boolean gameHaveMVPs) {
        this.gameHaveMVPs = gameHaveMVPs;
    }
}
