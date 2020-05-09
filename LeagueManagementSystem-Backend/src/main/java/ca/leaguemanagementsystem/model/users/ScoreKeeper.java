package ca.leaguemanagementsystem.model.users;

import ca.leaguemanagementsystem.model.leagues.events.assignments.ScoreKeeperAssignment;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "referee")
public class ScoreKeeper extends UserRole{
    private int nbYearsExperience;

    @OneToMany(mappedBy = "scoreKeeper")
    private List<ScoreKeeperAssignment> scoreKeeperAssignments;

}
