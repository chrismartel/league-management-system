package ca.leaguemanagementsystem.model.leagues;

import javax.persistence.*;

@Entity
@DiscriminatorValue("cmpl")
@Table(name = "competitiveLeague")
public class CompetitiveLeague extends League{

    /* attributes */

    private Integer minNbTeams; // minimum number of teams in the league

    public Integer getMinNbTeams(){
        return minNbTeams;
    }

    public void setMinNbTeams(Integer minNbTeams) {
        this.minNbTeams = minNbTeams;
    }


    private Integer maxNbTeams; // maximum number of teams in the league

    public Integer getMaxNbTeams() {
        return maxNbTeams;
    }

    public void setMaxNbTeams(Integer maxNbTeams) {
        this.maxNbTeams = maxNbTeams;
    }


    private Integer minNbPlayersPerTeam;    // minimum number of players per team

    public Integer getMinNbPlayersPerTeam() {
        return minNbPlayersPerTeam;
    }

    public void setMinNbPlayersPerTeam(Integer minNbPlayersPerTeam) {
        this.minNbPlayersPerTeam = minNbPlayersPerTeam;
    }


    private Integer maxNbPlayersPerTeam;    // maximum number of players per team

    public Integer getMaxNbPlayersPerTeam() {
        return maxNbPlayersPerTeam;
    }

    public void setMaxNbPlayersPerTeam(Integer maxNbPlayersPerTeam) {
        this.maxNbPlayersPerTeam = maxNbPlayersPerTeam;
    }


    private Integer gameLength; // game lengths

    public Integer getGameLength() {
        return gameLength;
    }

    public void setGameLength(Integer gameLength) {
        this.gameLength = gameLength;
    }


    private Integer shotClockLength;    // shot clock length

    public Integer getShotClockLength() {
        return shotClockLength;
    }

    public void setShotClockLength(Integer shotClockLength) {
        this.shotClockLength = shotClockLength;
    }


    private Integer nbScoreKeepersPerGame;  // number of scorekeepers required per game

    public Integer getNbScoreKeepersPerGame() {
        return nbScoreKeepersPerGame;
    }

    public void setNbScoreKeepersPerGame(Integer nbScoreKeepersPerGame) {
        this.nbScoreKeepersPerGame = nbScoreKeepersPerGame;
    }


    private Integer nbRefereesPerGame;  // number of referees required per game

    public Integer getNbRefereesPerGame() {
        return nbRefereesPerGame;
    }

    public void setNbRefereesPerGame(Integer nbRefereesPerGame) {
        this.nbRefereesPerGame = nbRefereesPerGame;
    }


    private Integer nbTeamsPlayoffs;    // number of teams eligible for playoffs

    public Integer getNbTeamsPlayoffs() {
        return nbTeamsPlayoffs;
    }

    public void setNbTeamsPlayoffs(Integer nbTeamsPlayoffs) {
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


    private boolean recordsThreePointers;  // does the league records # of 3 pointers made

    public boolean isRecordsThreePointers() {
        return recordsThreePointers;
    }

    public void setRecordsThreePointers(boolean recordsThreePointers) {
        this.recordsThreePointers = recordsThreePointers;
    }


    private boolean recordsFreeThrows;  // does the league records free throws made

    public boolean isRecordsFreeThrows() {
        return recordsFreeThrows;
    }

    public void setRecordsFreeThrows(boolean recordsFreeThrows) {
        this.recordsFreeThrows = recordsFreeThrows;
    }


    private boolean recordsFreeThrowPercentage;  // does the league records free throw %

    public boolean isRecordsFreeThrowPercentage() {
        return recordsFreeThrowPercentage;
    }

    public void setRecordsFreeThrowPercentage(boolean recordsFreeThrowPercentage) {
        this.recordsFreeThrowPercentage = recordsFreeThrowPercentage;
    }
}
