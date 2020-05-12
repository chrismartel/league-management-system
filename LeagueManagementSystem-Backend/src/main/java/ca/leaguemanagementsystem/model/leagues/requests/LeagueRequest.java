package ca.leaguemanagementsystem.model.leagues.requests;

import ca.leaguemanagementsystem.model.notifications.LeagueRequestNotification;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("lr")
@Table(name = "league_request")
public class LeagueRequest extends Request{

    /* associations */

    @OneToOne(optional = false)
    private LeagueRequestNotification leagueRequestNotification;    // notify the manager of the league when making a request

    public LeagueRequestNotification getLeagueRequestNotification() {
        return leagueRequestNotification;
    }

    public void setLeagueRequestNotification(LeagueRequestNotification leagueRequestNotification) {
        this.leagueRequestNotification = leagueRequestNotification;
    }
}
