package ca.leaguemanagementsystem.model.leagues.schedules.events.assignments;

import ca.leaguemanagementsystem.model.users.ScoreKeeper;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("sk_assign")
@Table(name = "scoreKeeperAssignment")
public class ScoreKeeperAssignment extends GameAssignment{

    /* associations */

    private ScoreKeeper scoreKeeper;    // score keeper assigned

    @ManyToOne
    public ScoreKeeper getScoreKeeper() {
        return scoreKeeper;
    }

    public void setScoreKeeper(ScoreKeeper scoreKeeper) {
        this.scoreKeeper = scoreKeeper;
    }
}
