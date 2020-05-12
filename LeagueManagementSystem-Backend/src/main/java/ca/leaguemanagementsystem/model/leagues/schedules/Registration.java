package ca.leaguemanagementsystem.model.leagues.schedules;

import ca.leaguemanagementsystem.model.leagues.Membership;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "registration")
public class Registration {

    /* associations */

    @ManyToOne
    private Membership membership;  // league membership

    public Membership getMembership() {
        return membership;
    }

    public void setMembership(Membership membership) {
        this.membership = membership;
    }


    @ManyToOne
    private Schedule schedule;    // schedule registered to

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }


    /* attributes */

    @Id
    @GeneratedValue
    private long registrationId;

    public long getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(long registrationId) {
        this.registrationId = registrationId;
    }


    @Temporal(TemporalType.DATE)
    private Date date;  // date of the registration

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    private int playerNumber;   // player number for the season

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }


    private boolean isSuspended;    // is player suspended

    public boolean isSuspended() {
        return isSuspended;
    }

    public void setSuspended(boolean suspended) {
        isSuspended = suspended;
    }


    private int nbTF;   // # of accumulated technical fouls

    public int getNbTF() {
        return nbTF;
    }

    public void setNbTF(int nbTF) {
        this.nbTF = nbTF;
    }
}
