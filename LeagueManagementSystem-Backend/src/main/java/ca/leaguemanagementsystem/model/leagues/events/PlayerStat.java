package ca.leaguemanagementsystem.model.leagues.events;

import ca.leaguemanagementsystem.model.users.Player;

import javax.persistence.*;

@Entity
@Table (name = "playerStat")
public class PlayerStat {

    //unidirectional many to one association with player
    @ManyToOne(optional = false)
    @JoinColumn(name = "fk_player")
    private Player player;

    public Player getPlayer(){
        return this.player;
    }

    public void setPlayer(){
        this.player = player;
    }

    //bidirectional one to one association with game
    @OneToOne(mappedBy = "playerStat")
    private Game game;

    public Game getGame(){
        return game;
    }

    public void setGame(Game game){
        this.game = game;
    }

    //attributes
    private Integer points;

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer value) {
        this.points = value;
    }

    private Integer rebounds;

    public Integer getRebounds() {
        return rebounds;
    }

    public void setRebounds(Integer value) {
        this.rebounds = value;
    }

    private Integer assists;

    public Integer getAssists() {
        return assists;
    }

    public void setAssists(Integer value) {
        this.assists = value;
    }

    private Integer steals;

    public Integer getSteals() {
        return steals;
    }

    public void setSteals(Integer value) {
        this.steals = value;
    }

    private Integer blocks;

    public Integer getBlocks() {
        return blocks;
    }

    public void setBlocks(Integer value) {
        this.blocks = value;
    }

    private Integer numberOfThreePointers;

    public Integer getNumberOfThreePointers() {
        return numberOfThreePointers;
    }

    public void setNumberOfThreePointers(Integer value) {
        this.numberOfThreePointers = value;
    }

    private Integer numberOfFreeThrows;

    public Integer getNumberOfFreeThrows() {
        return numberOfFreeThrows;
    }

    public void setNumberOfFreeThrows(Integer value) {
        this.numberOfFreeThrows = value;
    }

    private Double freeThrowPercentage;

    public Double getFreeThrowPercentage() {
        return freeThrowPercentage;
    }

    public void setFreeThrowPercentage(Double value) {
        this.freeThrowPercentage = value;
    }



}
