package ca.leaguemanagementsystem.model.leagues;

import ca.leaguemanagementsystem.model.leagues.events.EventType;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@DiscriminatorColumn(name = "schedule_type")
public class ScheduleType {

    /* associations */
    @ManyToOne
    private LeagueType leagueType;

    public LeagueType getLeagueType() {
        return leagueType;
    }

    public void setLeagueType(LeagueType leagueType) {
        this.leagueType = leagueType;
    }

    @OneToMany(
            mappedBy = "scheduleTypeOfEvent",
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

    @OneToMany(
            mappedBy = "scheduleTypeOfRegistration",
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
    private String scheduleName;            // id for database

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
