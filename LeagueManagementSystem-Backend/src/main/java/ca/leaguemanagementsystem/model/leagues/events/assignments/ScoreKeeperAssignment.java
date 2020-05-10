package ca.leaguemanagementsystem.model.leagues.events.assignments;

import ca.leaguemanagementsystem.model.users.Referee;
import ca.leaguemanagementsystem.model.users.ScoreKeeper;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("ska")
@Table(name = "scoreKeeperAssignment")
public class ScoreKeeperAssignment {

    @ManyToOne
    private ScoreKeeper scoreKeeper;

    public ScoreKeeper getScoreKeeper() {
        return scoreKeeper;
    }

    public void setScoreKeeper(ScoreKeeper scoreKeeper) {
        this.scoreKeeper = scoreKeeper;
    }
}
