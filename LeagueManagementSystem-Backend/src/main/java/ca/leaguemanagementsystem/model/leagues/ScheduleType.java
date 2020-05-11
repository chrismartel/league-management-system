package ca.leaguemanagementsystem.model.leagues;

import javax.persistence.*;
import java.util.Date;

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

    @

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
