package ca.leaguemanagementsystem.model.leagues;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "location")
public class Location {

    /* associations */

    @ManyToOne
    private LeagueType leagueType;

    public LeagueType getLeagueType() {
        return leagueType;
    }

    public void setLeagueType(LeagueType leagueType) {
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

    /* attributes */

    @Id
    private String LocationName;            //Id for database

    public String getLocationName() {
        return LocationName;
    }

    public void setLocationName(String locationName) {
        LocationName = locationName;
    }
}
