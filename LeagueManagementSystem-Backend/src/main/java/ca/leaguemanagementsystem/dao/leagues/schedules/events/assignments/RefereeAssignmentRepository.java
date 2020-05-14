package ca.leaguemanagementsystem.dao.leagues.schedules.events.assignments;

import ca.leaguemanagementsystem.model.leagues.schedules.events.assignments.RefereeAssignment;
import ca.leaguemanagementsystem.model.users.Referee;

import java.util.List;

public interface RefereeAssignmentRepository extends GameAssignmentRepository{
    List<RefereeAssignment> findByReferee(Referee referee);
}
