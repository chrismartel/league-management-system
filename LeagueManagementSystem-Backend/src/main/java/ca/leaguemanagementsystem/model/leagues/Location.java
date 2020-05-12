package ca.leaguemanagementsystem.model.leagues;

import ca.leaguemanagementsystem.model.leagues.events.Event;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "location")
public class Location {

    /* associations */

    @ManyToOne
    private League league;

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }

    @OneToMany(mappedBy = "location")
    private List<Event> event;

    public List<Event> getEvent() {
        return event;
    }

    public void setEvent(List<Event> event) {
        this.event = event;
    }

    /* attributes */

    @Id
    @GeneratedValue
    private Integer locationId;            //Id for database

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
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
