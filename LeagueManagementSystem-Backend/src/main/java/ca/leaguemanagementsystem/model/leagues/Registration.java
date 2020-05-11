package ca.leaguemanagementsystem.model.leagues;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "registration")
public class Registration {

    /* associations */
    @ManyToOne
    private Membership membership;  // league membership

    @ManyToOne
    private ScheduleType season;    // season registered to

    /* attributes */
    @Id
    @GeneratedValue
    private long registrationId;

    @Temporal(TemporalType.DATE)
    private Date date;  // date of the registration

    private int playerNumber;   // player number for the season

    private boolean isSuspended;    // is player suspended

    private int nbTF;   // # of accumulated technical fouls

    /* getters & setters */
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
