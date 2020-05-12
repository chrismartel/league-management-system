package ca.leaguemanagementsystem.model.leagues;

import ca.leaguemanagementsystem.model.leagues.schedules.Registration;
import ca.leaguemanagementsystem.model.users.User;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "membership")
public class Membership {

    /* associations */

    @ManyToOne
    private User member;    // owner of the membership

    public User getMember() {
        return member;
    }

    public void setMember(User member) {
        this.member = member;
    }


    @ManyToOne
    private League league;  // membership to which league

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }

    @OneToMany(mappedBy = "membership")
    private List<Registration> registrations;   // season registrations through the league membership

    public List<Registration> getRegistrations() {
        return registrations;
    }

    public void setRegistrations(List<Registration> registrations) {
        this.registrations = registrations;
    }


    /* attributes */
    @Id
    @GeneratedValue
    private long membershipId;  // Id for database

    public long getMembershipId() {
        return membershipId;
    }

    public void setMembershipId(long membershipId) {
        this.membershipId = membershipId;
    }


    @Temporal(TemporalType.DATE)
    private Date date;          // starting date of the  membership

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
