package ca.leaguemanagementsystem.model.notifications;

import ca.leaguemanagementsystem.model.leagues.requests.LeagueRequest;

import javax.persistence.*;

@Entity
@DiscriminatorValue("rn")
@Table(name = "request_notification")
public class LeagueRequestNotification extends Notification{


    private LeagueRequest request;

    @OneToOne(optional = false)
    public LeagueRequest getRequest() {
        return request;
    }

    public void setRequest(LeagueRequest request) {
        this.request = request;
    }
}
