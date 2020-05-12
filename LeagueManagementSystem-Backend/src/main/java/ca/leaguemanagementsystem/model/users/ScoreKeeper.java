package ca.leaguemanagementsystem.model.users;

import ca.leaguemanagementsystem.model.leagues.schedules.events.assignments.ScoreKeeperAssignment;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@DiscriminatorValue("sk")
@Table(name = "scoreKeeper")
public class ScoreKeeper extends UserRole {

    /* associations */

    @OneToMany(mappedBy = "scoreKeeper")
    private List<ScoreKeeperAssignment> scoreKeeperAssignments;

    public List<ScoreKeeperAssignment> getScoreKeeperAssignments() {
        return scoreKeeperAssignments;
    }

    public void setScoreKeeperAssignments(List<ScoreKeeperAssignment> scoreKeeperAssignments) {
        this.scoreKeeperAssignments = scoreKeeperAssignments;
    }

    /* attributes */

    private int nbYearsExperience;

    public int getNbYearsExperience() {
        return nbYearsExperience;
    }

    public void setNbYearsExperience(int nbYearsExperience) {
        this.nbYearsExperience = nbYearsExperience;
    }
}
