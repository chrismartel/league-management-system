package ca.leaguemanagementsystem.model.notifications;

import ca.leaguemanagementsystem.model.requests.Request;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("rn")
@Table(name = "request_notification")
public class RequestNotification extends Notification{

    @ManyToOne
    private Request request;

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }
}
