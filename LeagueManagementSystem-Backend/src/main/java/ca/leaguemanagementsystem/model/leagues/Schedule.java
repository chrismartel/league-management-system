package ca.leaguemanagementsystem.model.leagues;

import ca.leaguemanagementsystem.model.leagues.events.Event;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@DiscriminatorColumn(name = "schedule_type")
public class Schedule {

    /* associations */

    @ManyToOne
    private League league;

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }


    @OneToMany(
            mappedBy = "schedule",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Event> events;

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }


    @OneToMany(
            mappedBy = "schedule",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Registration> registrations;

    public List<Registration> getRegistrations() {
        return registrations;
    }

    public void setRegistrations(List<Registration> registrations) {
        this.registrations = registrations;
    }


    /* attributes */

    @Id
    @GeneratedValue
    private Integer scheduleId;     // Id for database

    public Integer getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Integer scheduleId) {
        this.scheduleId = scheduleId;
    }


    private String scheduleName;            // name of schedule

    public String getScheduleName() {
        return scheduleName;
    }

    public void setScheduleName(String scheduleName) {
        this.scheduleName = scheduleName;
    }


    @Temporal(TemporalType.DATE)
    private Date startDate;                 // Start date of schedule

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }


    @Temporal(TemporalType.DATE)
    private Date endDate;                   // End date of schedule

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
