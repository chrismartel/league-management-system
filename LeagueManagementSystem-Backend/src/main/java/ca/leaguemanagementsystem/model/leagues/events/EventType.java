package ca.leaguemanagementsystem.model.leagues.events;

import ca.leaguemanagementsystem.model.leagues.Location;
import ca.leaguemanagementsystem.model.leagues.ScheduleType;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.util.List;

@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@DiscriminatorColumn(name = "event_type")
public class EventType {

    /* Associations */

    @OneToMany(
            mappedBy = "eventType",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<EventType> eventTypes;

    public List<EventType> getEventTypes() {
        return eventTypes;
    }

    public void setEventTypes(List<EventType> eventTypes) {
        this.eventTypes = eventTypes;
    }

    @ManyToOne
    private Location locations;

    public Location getLocations() {
        return locations;
    }

    public void setLocations(Location value) {
        this.locations = value;
    }

    @ManyToOne
    private ScheduleType scheduleType;

    public ScheduleType getScheduleType() {
        return scheduleType;
    }

    public void setScheduleType(ScheduleType scheduleType) {
        this.scheduleType = scheduleType;
    }

    /* attributes */
    @Id
    @GeneratedValue
    private long eventTypeId;               // Id for database

    public long getEventTypeId(){
        return eventTypeId;
    }

    public void setEventTypeId(long eventTypeId){
        this.eventTypeId = eventTypeId;
    }

    @Temporal(TemporalType.TIME)
    private Time startTime;                 // Start time of the event

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    @Temporal(TemporalType.TIME)
    private Time endTime;                   // End time of the event

    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    @Temporal(TemporalType.DATE)
    private Date date;                      // Date of the event

    public Date getDate(){
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
