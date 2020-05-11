package ca.leaguemanagementsystem.model.leagues;

import javax.persistence.*;

@Entity
@DiscriminatorValue("cmpl")
@Table(name = "competitiveLeague")
public class CompetitiveLeague extends League{

    private Integer minNbTeams;
    private Integer maxNbTeams;
    private Integer minNbPlayersPerTeam;
    private Integer maxNbPlayersPerTeam;
    private Integer gameLength;
    private Integer shotClockLength;
    private Integer nbScoreKeepersPerGame;
    private Integer nbRefereesPerGame;
    private Integer nbTeamsPlayoffs;

    private boolean recordsPoints;
    private boolean recordsAssists;
    private boolean recordsRebounds;
    private boolean recordsBlocks;
    private boolean recordsSteals;
    private boolean recordsTurnovers;
    private boolean recordsFouls;
    private boolean recordsThreePointers;
    private boolean recordsFreeThrows;
    private boolean recordsFreeThrowPercentage;
    private boolean hasRatings;

    @OneToOne(
            mappedBy = "competitiveLeague",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private RuleBook ruleBook;

    public RuleBook getRuleBook() {
        return ruleBook;
    }

    public void setRuleBook(RuleBook ruleBook) {
        this.ruleBook = ruleBook;
    }

    //attributes

    public Integer getMinNbTeams(){
        return minNbTeams;
    }

    public void setMinNbTeams(Integer minNbTeams) {
        this.minNbTeams = minNbTeams;
    }

    public Integer getMaxNbTeams() {
        return maxNbTeams;
    }

    public void setMaxNbTeams(Integer maxNbTeams) {
        this.maxNbTeams = maxNbTeams;
    }

    public Integer getMinNbPlayersPerTeam() {
        return minNbPlayersPerTeam;
    }

    public void setMinNbPlayersPerTeam(Integer minNbPlayersPerTeam) {
        this.minNbPlayersPerTeam = minNbPlayersPerTeam;
    }

    public Integer getMaxNbPlayersPerTeam() {
        return maxNbPlayersPerTeam;
    }

    public void setMaxNbPlayersPerTeam(Integer maxNbPlayersPerTeam) {
        this.maxNbPlayersPerTeam = maxNbPlayersPerTeam;
    }

    public Integer getGameLength() {
        return gameLength;
    }

    public void setGameLength(Integer gameLength) {
        this.gameLength = gameLength;
    }

    public Integer getShotClockLength() {
        return shotClockLength;
    }

    public void setShotClockLength(Integer shotClockLength) {
        this.shotClockLength = shotClockLength;
    }

    public Integer getNbScoreKeepersPerGame() {
        return nbScoreKeepersPerGame;
    }

    public void setNbScoreKeepersPerGame(Integer nbScoreKeepersPerGame) {
        this.nbScoreKeepersPerGame = nbScoreKeepersPerGame;
    }

    public Integer getNbRefereesPerGame() {
        return nbRefereesPerGame;
    }

    public void setNbRefereesPerGame(Integer nbRefereesPerGame) {
        this.nbRefereesPerGame = nbRefereesPerGame;
    }

    public Integer getNbTeamsPlayoffs() {
        return nbTeamsPlayoffs;
    }

    public void setNbTeamsPlayoffs(Integer nbTeamsPlayoffs) {
        this.nbTeamsPlayoffs = nbTeamsPlayoffs;
    }

    public boolean isRecordsPoints() {
        return recordsPoints;
    }

    public void setRecordsPoints(boolean recordsPoints) {
        this.recordsPoints = recordsPoints;
    }

    public boolean isRecordsAssists() {
        return recordsAssists;
    }

    public void setRecordsAssists(boolean recordsAssists) {
        this.recordsAssists = recordsAssists;
    }

    public boolean isRecordsRebounds() {
        return recordsRebounds;
    }

    public void setRecordsRebounds(boolean recordsRebounds) {
        this.recordsRebounds = recordsRebounds;
    }

    public boolean isRecordsBlocks() {
        return recordsBlocks;
    }

    public void setRecordsBlocks(boolean recordsBlocks) {
        this.recordsBlocks = recordsBlocks;
    }

    public boolean isRecordsSteals() {
        return recordsSteals;
    }

    public void setRecordsSteals(boolean recordsSteals) {
        this.recordsSteals = recordsSteals;
    }

    public boolean isRecordsTurnovers() {
        return recordsTurnovers;
    }

    public void setRecordsTurnovers(boolean recordsTurnovers) {
        this.recordsTurnovers = recordsTurnovers;
    }

    public void setRecordsFouls(boolean recordsFouls) {
        this.recordsFouls = recordsFouls;
    }

    public boolean isRecordsFouls() {
        return recordsFouls;
    }

    public boolean isRecordsThreePointers() {
        return recordsThreePointers;
    }

    public void setRecordsThreePointers(boolean recordsThreePointers) {
        this.recordsThreePointers = recordsThreePointers;
    }

    public boolean isRecordsFreeThrows() {
        return recordsFreeThrows;
    }

    public void setRecordsFreeThrows(boolean recordsFreeThrows) {
        this.recordsFreeThrows = recordsFreeThrows;
    }

    public boolean isRecordsFreeThrowPercentage() {
        return recordsFreeThrowPercentage;
    }

    public void setRecordsFreeThrowPercentage(boolean recordsFreeThrowPercentage) {
        this.recordsFreeThrowPercentage = recordsFreeThrowPercentage;
    }

    public boolean isHasRatings() {
        return hasRatings;
    }

    public void setHasRatings(boolean hasRatings) {
        this.hasRatings = hasRatings;
    }
}
