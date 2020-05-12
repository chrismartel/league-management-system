package ca.leaguemanagementsystem.model.leagues.schedules.events.assignments;

import ca.leaguemanagementsystem.model.users.Referee;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("ref_assign")
@Table(name = "refereeAssignment")
public class RefereeAssignment extends GameAssignment{

    /* associations */

    private Referee referee;    // referee assigned

    @ManyToOne
    public Referee getReferee() {
        return referee;
    }

    public void setReferee(Referee referee) {
        this.referee = referee;
    }
}
