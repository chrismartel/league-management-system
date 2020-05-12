package ca.leaguemanagementsystem.model.leagues;

import ca.leaguemanagementsystem.model.leagues.requests.Request;
import ca.leaguemanagementsystem.model.leagues.schedules.Schedule;
import ca.leaguemanagementsystem.model.users.Manager;

import javax.persistence.*;
import java.util.List;

@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@DiscriminatorColumn(name = "league_type")
public class League {

    /* associations */


    private List<Location> locations;   // possible locations for games

    @OneToMany(
            mappedBy = "league",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    public List<Location> getLocations() {
        return locations;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }



    private List<Schedule> schedules;   // seasons history of the league

    @OneToMany(
            mappedBy = "league",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    public List<Schedule> getSchedules() {
        return schedules;
    }

    public void setSchedules(List<Schedule> schedules) {
        this.schedules = schedules;
    }



    private List<Membership> memberships;   // league memberships

    @OneToMany(
            mappedBy = "league"
    )
    public List<Membership> getMemberships() {
        return memberships;
    }

    public void setMemberships(List<Membership> memberships) {
        this.memberships = memberships;
    }



    private RuleBook ruleBook;

    @OneToOne(
            mappedBy = "league",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    public RuleBook getRuleBook() {
        return ruleBook;
    }

    public void setRuleBook(RuleBook ruleBook) {
        this.ruleBook = ruleBook;
    }



    private Manager manager;

    @ManyToOne
    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }



    private List<Request> requests;

    @OneToMany(mappedBy = "league")
    public List<Request> getRequests() {
        return requests;
    }

    public void setRequests(List<Request> requests) {
        this.requests = requests;
    }

    /* attributes */


    private String leagueName;          // Id for database

    @Id
    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }
}
