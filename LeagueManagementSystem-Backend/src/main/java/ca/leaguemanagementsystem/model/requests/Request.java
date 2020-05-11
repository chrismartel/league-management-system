package ca.leaguemanagementsystem.model.requests;

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
    private LeagueType leagueType;

    public LeagueType getLeagueType() {
        return leagueType;
    }

    public void setLeagueType(LeagueType leagueType) {
        this.leagueType = leagueType;
    }

    @OneToMany(mappedBy = "request")
    private List<LeagueRequest> leagueRequests;

    public List<LeagueRequest> getLeagueRequests() {
        return leagueRequests;
    }

    public void setLeagueRequests(List<LeagueRequest> leagueRequests) {
        this.leagueRequests = leagueRequests;
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
