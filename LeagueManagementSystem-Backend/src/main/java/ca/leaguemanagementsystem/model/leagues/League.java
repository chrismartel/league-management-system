package ca.leaguemanagementsystem.model.leagues;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@DiscriminatorColumn(name = "league_type")
public class League {

    /* associations */

    @OneToMany(
            mappedBy = "league",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Award> awards; // league awards

    public List<Award> getAwards() {
        return awards;
    }

    public void setAwards(List<Award> awards) {
        this.awards = awards;
    }


    @OneToMany(
            mappedBy = "league",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Location> locations;   // possible locations for games

    public List<Location> getLocations() {
        return locations;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }


    @OneToMany(
            mappedBy = "league",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Schedule> schedules;   // schedules history of league

    public List<Schedule> getSchedules() {
        return schedules;
    }

    public void setSchedules(List<Schedule> schedules) {
        this.schedules = schedules;
    }


    @OneToMany(
            mappedBy = "memberOf"
    )
    private List<Membership> memberships;   // league memberships

    public List<Membership> getMemberships() {
        return memberships;
    }

    public void setMemberships(List<Membership> memberships) {
        this.memberships = memberships;
    }


    /* attributes */

    @Id
    @GeneratedValue
    private String leagueName;          // Id for database

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    @Temporal(TemporalType.DATE)
    private Date startDate;             // Start date of the league

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Temporal(TemporalType.DATE)
    private Date endDate;               // End date of the league

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
