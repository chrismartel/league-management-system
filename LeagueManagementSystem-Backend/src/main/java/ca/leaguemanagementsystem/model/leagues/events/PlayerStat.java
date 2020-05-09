package ca.leaguemanagementsystem.model.leagues.events;

import ca.leaguemanagementsystem.model.users.Player;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class PlayerStat {

    //unidirectional many to one association with player
    @ManyToOne
    @JoinColumn(name = "fk_player")
    private Player player;

    public Player getPlayer(){
        return this.player;
    }

    public void setPlayer(){
        this.player = player;
    }

    private Game game;

    //bidirectional one to one association with game
    @OneToOne(optional = true)
    public Game getGame(){
        return this.game;
    }

    public void setGame(Game game){
        this.game = game;
    }

    //attributes
    private Integer points;

    public Integer getPoints() {
        return this.points;
    }

    public void setPoints(Integer value) {
        this.points = value;
    }

    private Integer rebounds;

    public Integer getRebounds() {
        return this.rebounds;
    }

    public void setRebounds(Integer value) {
        this.rebounds = value;
    }

    private Integer assists;

    public Integer getAssists() {
        return this.assists;
    }

    public void setAssists(Integer value) {
        this.assists = value;
    }

    private Integer steals;

    public Integer getSteals() {
        return this.steals;
    }

    public void setSteals(Integer value) {
        this.steals = value;
    }

    private Integer blocks;

    public Integer getBlocks() {
        return this.blocks;
    }

    public void setBlocks(Integer value) {
        this.blocks = value;
    }

    private Integer numberOfThreePointers;

    public Integer getNumberOfThreePointers() {
        return this.numberOfThreePointers;
    }

    public void setNumberOfThreePointers(Integer value) {
        this.numberOfThreePointers = value;
    }

    private Integer numberOfFreeThrows;

    public Integer getNumberOfFreeThrows() {
        return this.numberOfFreeThrows;
    }

    public void setNumberOfFreeThrows(Integer value) {
        this.numberOfFreeThrows = value;
    }

    private Double freeThrowPercentage;

    public Double getFreeThrowPercentage() {
        return this.freeThrowPercentage;
    }

    public void setFreeThrowPercentage(Double value) {
        this.freeThrowPercentage = value;
    }



}
