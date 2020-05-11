package ca.leaguemanagementsystem.model.notifications;

import ca.leaguemanagementsystem.model.requests.LeagueRequest;
import ca.leaguemanagementsystem.model.requests.Request;

import javax.persistence.*;

@Entity
@DiscriminatorValue("rn")
@Table(name = "request_notification")
public class LeagueRequestNotification extends Notification{

    @OneToOne(optional = false)
    private LeagueRequest request;

    public LeagueRequest getRequest() {
        return request;
    }

    public void setRequest(LeagueRequest request) {
        this.request = request;
    }
}