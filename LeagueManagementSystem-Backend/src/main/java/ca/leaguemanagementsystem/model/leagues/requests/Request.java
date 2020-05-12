package ca.leaguemanagementsystem.model.leagues.requests;

import ca.leaguemanagementsystem.model.leagues.League;
import ca.leaguemanagementsystem.model.users.AppUser;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@DiscriminatorColumn(name = "request")
public class Request {

    /* associations */


    private League league;  // league related to the request

    @ManyToOne
    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }



    private AppUser sender;  // request sent by which user

    @OneToOne
    public AppUser getSender() {
        return sender;
    }

    public void setSender(AppUser sender) {
        this.sender = sender;
    }




    /* attributes */


    private Long requestId;         // Id for databse

    @Id
    @GeneratedValue
    public Long getRequestId() {
        return requestId;
    }

    public void setRequestId(Long requestId) {
        this.requestId = requestId;
    }


    private Date date;              // Date of the request

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    private Time time;              // Time of the request

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
