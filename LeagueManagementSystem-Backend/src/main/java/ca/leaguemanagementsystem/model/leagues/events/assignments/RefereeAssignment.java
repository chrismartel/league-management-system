package ca.leaguemanagementsystem.model.leagues.events.assignments;

import ca.leaguemanagementsystem.model.users.Referee;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("ref_assign")
@Table(name = "refereeAssignment")
public class RefereeAssignment {

    /* associations */
    @ManyToOne
    private Referee referee;    // referee assigned

    public Referee getReferee() {
        return referee;
    }

    public void setReferee(Referee referee) {
        this.referee = referee;
    }
}
