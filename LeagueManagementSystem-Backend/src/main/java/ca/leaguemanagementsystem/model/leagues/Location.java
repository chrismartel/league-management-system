package ca.leaguemanagementsystem.model.leagues;

import ca.leaguemanagementsystem.model.leagues.events.EventType;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "location")
public class Location {
    @ManyToMany(mappedBy = "locations")
    private Set<LeagueType> leagueType;

    public Set<LeagueType> getLeagueType() {
        return leagueType;
    }

    public void setLeagueType(Set<LeagueType> leagueType) {
        this.leagueType = leagueType;
    }

    @OneToMany(mappedBy = "location")
    private List<EventType> eventType;

    public List<EventType> getEventType() {
        return eventType;
    }

    public void setEventType(List<EventType> eventType) {
        this.eventType = eventType;
    }

    //attributes
    private String LocationName;

    public String getLocationName() {
        return LocationName;
    }

    public void setLocationName(String locationName) {
        LocationName = locationName;
    }
}
