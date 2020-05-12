package ca.leaguemanagementsystem.model.users;

import ca.leaguemanagementsystem.model.leagues.schedules.events.assignments.RefereeAssignment;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@DiscriminatorValue("ref")
@Table(name = "referee")
public class Referee extends UserRole {

    /* associations */

    @OneToMany(mappedBy = "referee")
    private List<RefereeAssignment> refereeAssignments;

    public List<RefereeAssignment> getRefereeAssignments() {
        return refereeAssignments;
    }

    public void setRefereeAssignments(List<RefereeAssignment> refereeAssignments) {
        this.refereeAssignments = refereeAssignments;
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
