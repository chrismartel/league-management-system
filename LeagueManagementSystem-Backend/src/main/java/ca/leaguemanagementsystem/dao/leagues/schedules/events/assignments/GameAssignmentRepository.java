package ca.leaguemanagementsystem.dao.leagues.schedules.events.assignments;

import ca.leaguemanagementsystem.model.leagues.schedules.events.assignments.GameAssignment;
import org.springframework.data.repository.CrudRepository;

public interface GameAssignmentRepository extends CrudRepository<GameAssignment, Integer> {
}
