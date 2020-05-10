package ca.leaguemanagementsystem.model.leagues;

import ca.leaguemanagementsystem.model.leagues.Membership;
import ca.leaguemanagementsystem.model.leagues.ScheduleType;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "registration")

public class Registration {

    @Id
    @GeneratedValue
    private long registrationId;

    @Temporal(TemporalType.DATE)
    private Date date;

    @ManyToOne
    private Membership membership;

    @ManyToOne
    private ScheduleType season;

    private int playerNumber;

    private boolean isSuspended;

    private int nbTF;

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    public boolean isSuspended() {
        return isSuspended;
    }

    public void setSuspended(boolean suspended) {
        isSuspended = suspended;
    }

    public int getNbTF() {
        return nbTF;
    }

    public void setNbTF(int nbTF) {
        this.nbTF = nbTF;
    }

    public long getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(long registrationId) {
        this.registrationId = registrationId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Membership getMembership() {
        return membership;
    }

    public void setMembership(Membership membership) {
        this.membership = membership;
    }

    public ScheduleType getSeason() {
        return season;
    }

    public void setSeason(ScheduleType season) {
        this.season = season;
    }
}
