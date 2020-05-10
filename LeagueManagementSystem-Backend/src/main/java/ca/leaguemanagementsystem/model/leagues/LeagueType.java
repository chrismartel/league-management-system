package ca.leaguemanagementsystem.model.leagues;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@DiscriminatorColumn(name = "league_type")
public class LeagueType {
    @Id
    @GeneratedValue
    private String leagueName;

    private Date startDate;
    private Date endDate;

    @OneToMany(
            mappedBy = "leagueRequested",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Award> awards;

    public List<Award> getAwards() {
        return awards;
    }

    public void setAwards(List<Award> awards) {
        this.awards = awards;
    }

    @ManyToMany(
            mappedBy = "leagueLocation",
            cascade = CascadeType.ALL
    )
    private List<Location> locations;

    public List<Location> getLocations() {
        return locations;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    @OneToMany(
            mappedBy = "leagueSchedule",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<ScheduleType> scheduleTypes;

    public List<ScheduleType> getScheduleTypes() {
        return scheduleTypes;
    }

    public void setScheduleTypes(List<ScheduleType> scheduleTypes) {
        this.scheduleTypes = scheduleTypes;
    }

    @OneToMany(
            mappedBy = "memberOf"
    )
    private List<Membership> memberships;

    public List<Membership> getMemberships() {
        return memberships;
    }

    public void setMemberships(List<Membership> memberships) {
        this.memberships = memberships;
    }

    //attributes
    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
