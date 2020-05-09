package ca.leaguemanagementsystem.model.leagues;

import ca.leaguemanagementsystem.model.users.User;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "membership")
public class Membership {
    @Id
    @GeneratedValue
    private long membershipId;

    @Temporal(TemporalType.DATE)
    private Date date;

    @ManyToOne
    private User member;

    @ManyToOne
    private LeagueType league;

    @OneToMany(mappedBy = "membership")
    private List<Registration> registrations;

    public long getMembershipId() {
        return membershipId;
    }

    public void setMembershipId(long membershipId) {
        this.membershipId = membershipId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User getMember() {
        return member;
    }

    public void setMember(User member) {
        this.member = member;
    }

    public LeagueType getLeague() {
        return league;
    }

    public void setLeague(LeagueType league) {
        this.league = league;
    }

    public List<Registration> getRegistrations() {
        return registrations;
    }

    public void setRegistrations(List<Registration> registrations) {
        this.registrations = registrations;
    }
}
