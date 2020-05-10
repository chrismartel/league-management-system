package ca.leaguemanagementsystem.model.leagues.events.assignments;

import ca.leaguemanagementsystem.model.users.Referee;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("rfa")
@Table(name = "refereeAssignment")
public class RefereeAssignment {

    @ManyToOne
    private Referee referee;

    public Referee getReferee() {
        return referee;
    }

    public void setReferee(Referee referee) {
        this.referee = referee;
    }
}
