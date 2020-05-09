package ca.leaguemanagementsystem.model.users;

import ca.leaguemanagementsystem.model.leagues.events.assignments.ScoreKeeperAssignment;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "scoreKeeper")
public class ScoreKeeper extends UserRole{
    private int nbYearsExperience;

    @OneToMany(mappedBy = "scoreKeeper")
    private List<ScoreKeeperAssignment> scoreKeeperAssignments;

    public int getNbYearsExperience() {
        return nbYearsExperience;
    }

    public void setNbYearsExperience(int nbYearsExperience) {
        this.nbYearsExperience = nbYearsExperience;
    }

    public List<ScoreKeeperAssignment> getScoreKeeperAssignments() {
        return scoreKeeperAssignments;
    }

    public void setScoreKeeperAssignments(List<ScoreKeeperAssignment> scoreKeeperAssignments) {
        this.scoreKeeperAssignments = scoreKeeperAssignments;
    }
}
