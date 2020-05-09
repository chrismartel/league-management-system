package ca.leaguemanagementsystem.model.users;

import ca.leaguemanagementsystem.model.leagues.events.assignments.RefereeAssignment;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "referee")
public class Referee extends UserRole{
    private int nbYearsExperience;

    @OneToMany(mappedBy = "referee")
    private List<RefereeAssignment> refereeAssignments;

}
