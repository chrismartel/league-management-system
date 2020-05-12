package ca.leaguemanagementsystem.model.notifications;

import ca.leaguemanagementsystem.model.leagues.requests.Request;

import javax.persistence.*;

@Entity
@DiscriminatorValue("rn")
@Table(name = "request_notification")
public class RequestNotification extends Notification{

    @OneToOne(optional = false)
    private Request request;

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }
}
