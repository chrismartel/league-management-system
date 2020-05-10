package ca.leaguemanagementsystem.model.leagues.events;

import ca.leaguemanagementsystem.model.users.Player;

import javax.persistence.*;

@Entity
@Table(name = "attendance")
public class Attendance {

    @ManyToOne(fetch = FetchType.LAZY)
    private EventType eventType;

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    @ManyToOne(optional = false)
    private Player player;

    public Player getPlayer(){
        return this.player;
    }

    public void setPlayer(){
        this.player = player;
    }

    //attributes
    private boolean isAttending;

    public boolean isAttending() {
        return isAttending;
    }

    public void setAttending(boolean value){
        this.isAttending = value;
    }
}
