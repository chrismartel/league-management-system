package ca.leaguemanagementsystem.model.leagues;

import ca.leaguemanagementsystem.model.leagues.schedules.Registration;
import ca.leaguemanagementsystem.model.users.AppUser;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "membership")
public class Membership {

    /* associations */

    private AppUser member;    // owner of the membership

    @ManyToOne
    public AppUser getMember() {
        return member;
    }

    public void setMember(AppUser member) {
        this.member = member;
    }





    private League league;  // membership to which league

    @ManyToOne
    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }



    private List<Registration> registrations;   // season registrations through the league membership

    @OneToMany(mappedBy = "membership")
    public List<Registration> getRegistrations() {
        return registrations;
    }

    public void setRegistrations(List<Registration> registrations) {
        this.registrations = registrations;
    }


    /* attributes */

    private Long membershipId;  // Id for database

    @Id
    @GeneratedValue
    public Long getMembershipId() {
        return membershipId;
    }

    public void setMembershipId(Long membershipId) {
        this.membershipId = membershipId;
    }


    private Date date;          // starting date of the  membership

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
