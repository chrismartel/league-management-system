package ca.leaguemanagementsystem.model.leagues.events;

import ca.leaguemanagementsystem.model.users.Player;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "mvp")
public class MVP {

    /* associations */

    @ManyToOne
    private Player player;  // player nominated as mvp

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }


    @OneToOne(optional = false)
    private Game game;  // game in which the player was mvp

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
}
