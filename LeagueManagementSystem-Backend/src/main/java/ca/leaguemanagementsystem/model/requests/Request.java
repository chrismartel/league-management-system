package ca.leaguemanagementsystem.model.requests;

import ca.leaguemanagementsystem.model.leagues.League;
import ca.leaguemanagementsystem.model.users.User;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
import java.util.List;

@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@DiscriminatorColumn(name = "request")
public class Request {

    /* associations */

    @ManyToOne
    private League league;  // league related to the request

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }


    @OneToOne
    private User sender;  // request sent by which user

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }


    /* attributes */

    @Id
    @GeneratedValue
    private Long requestId;         // Id for databse

    public Long getRequestId() {
        return requestId;
    }

    public void setRequestId(Long requestId) {
        this.requestId = requestId;
    }


    @Temporal(TemporalType.DATE)
    private Date date;              // Date of the request

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    @Temporal(TemporalType.TIME)
    private Time time;              // Time of the request

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
