package ca.leaguemanagementsystem.model.leagues;

import ca.leaguemanagementsystem.model.leagues.schedules.Schedule;

import javax.persistence.*;
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
    private List<Schedule> schedules;   // seasons history of the league

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


    @OneToOne(
            mappedBy = "league",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private RuleBook ruleBook;

    public RuleBook getRuleBook() {
        return ruleBook;
    }

    public void setRuleBook(RuleBook ruleBook) {
        this.ruleBook = ruleBook;
    }


    /* attributes */

    @Id
    private String leagueName;          // Id for database

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }
}
