package ca.leaguemanagementsystem.model.leagues.schedules;

import ca.leaguemanagementsystem.model.leagues.Membership;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "registration")
public class Registration {

    /* associations */


    private Membership membership;  // league membership

    @ManyToOne
    public Membership getMembership() {
        return membership;
    }

    public void setMembership(Membership membership) {
        this.membership = membership;
    }



    private Schedule schedule;    // schedule registered to

    @ManyToOne
    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }


    /* attributes */


    private Long registrationId;

    @Id
    @GeneratedValue
    public Long getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(Long registrationId) {
        this.registrationId = registrationId;
    }


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
