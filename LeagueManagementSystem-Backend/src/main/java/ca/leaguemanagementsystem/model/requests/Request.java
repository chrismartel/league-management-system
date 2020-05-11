package ca.leaguemanagementsystem.model.requests;

import ca.leaguemanagementsystem.model.leagues.League;

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
    private League league;

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }


    /* attributes */

    @Id
    @GeneratedValue
    private Long requestId;         // Id for databse


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
