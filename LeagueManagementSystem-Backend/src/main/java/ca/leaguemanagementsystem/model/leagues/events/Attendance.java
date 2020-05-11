package ca.leaguemanagementsystem.model.leagues.events;

import ca.leaguemanagementsystem.model.users.Player;

import javax.persistence.*;

@Entity
@Table(name = "attendance")
public class Attendance {

    /* associations */

    @ManyToOne
    private Event event;    // attendance for which event

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }


    @ManyToOne(optional = false)
    private Player player;  // attendance for which player

    public Player getPlayer(){
        return this.player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }


    /* attributes */

    private boolean isAttending;    // is the player attending the game or not

    public boolean isAttending() {
        return isAttending;
    }

    public void setAttending(boolean value){
        this.isAttending = value;
    }
}
