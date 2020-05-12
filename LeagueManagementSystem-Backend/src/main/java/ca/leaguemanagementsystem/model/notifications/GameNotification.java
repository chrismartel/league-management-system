package ca.leaguemanagementsystem.model.notifications;

import ca.leaguemanagementsystem.model.leagues.schedules.events.Game;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@DiscriminatorValue("gn")
@Table(name = "game_notification")
public class GameNotification extends Notification{

    /* associations */

    @ManyToOne
    private Game game;  // game of which the player gets notified

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
}
