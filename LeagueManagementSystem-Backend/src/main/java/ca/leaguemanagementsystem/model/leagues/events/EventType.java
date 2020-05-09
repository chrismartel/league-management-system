package ca.leaguemanagementsystem.model.leagues.events;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Entity
public class EventType {
    @Id
    @GeneratedValue
    private long eventTypeId;

    public long getEventTypeId(){
        return eventTypeId;
    }

    public void setEventTypeId(long eventTypeId){
        this.eventTypeId = eventTypeId;
    }

    //attributes
    private Time startTime;

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    private Time endTime;

    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    private Date date;

    public Date getDate(){
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
