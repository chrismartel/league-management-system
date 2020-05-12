package ca.leaguemanagementsystem.model.leagues.schedules.events;

import ca.leaguemanagementsystem.model.users.Player;

import javax.persistence.*;

@Entity
@Table(name = "mvp")
public class MVP {

    /* associations */


    private Player player;  // player nominated as mvp

    @ManyToOne
    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }



    private Game game;  // game in which the player was mvp

    @OneToOne(optional = false)
    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }


    /* attributes */

    private Integer mvpId;

    @Id
    @GeneratedValue
    public Integer getMvpId() {
        return mvpId;
    }

    public void setMvpId(Integer mvpId) {
        this.mvpId = mvpId;
    }
}
