package ca.leaguemanagementsystem.model.leagues.events;

import ca.leaguemanagementsystem.model.leagues.Location;
import ca.leaguemanagementsystem.model.leagues.Schedule;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.util.List;

@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@DiscriminatorColumn(name = "event_type")
public class Event {

    /* associations */

    @OneToMany(
            mappedBy = "event",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Attendance> attendances;   // attendances to the event

    public List<Attendance> getAttendances() {
        return attendances;
    }

    public void setAttendances(List<Attendance> attendances) {
        this.attendances = attendances;
    }


    @ManyToOne
    private Location location;  // event location

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }


    @ManyToOne
    private Schedule schedule;  // schedule in which the event is scheduled

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }


    /* attributes */

    @Id
    @GeneratedValue
    private long eventId;               // Id for database

    public long getEventId() {
        return eventId;
    }

    public void setEventId(long eventId) {
        this.eventId = eventId;
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
