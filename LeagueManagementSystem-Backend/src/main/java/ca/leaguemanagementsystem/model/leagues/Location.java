package ca.leaguemanagementsystem.model.leagues;

import ca.leaguemanagementsystem.model.leagues.schedules.events.Event;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "location")
public class Location {

    /* associations */


    private League league;

    @ManyToOne
    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }



    private List<Event> event;

    @OneToMany(mappedBy = "location")
    public List<Event> getEvent() {
        return event;
    }

    public void setEvent(List<Event> event) {
        this.event = event;
    }

    /* attributes */


    private long locationId;            //Id for database

    @Id
    @GeneratedValue
    public long getLocationId() {
        return locationId;
    }

    public void setLocationId(long locationId) {
        this.locationId = locationId;
    }




    private String LocationName;

    public String getLocationName() {
        return LocationName;
    }

    public void setLocationName(String locationName) {
        LocationName = locationName;
    }
}
