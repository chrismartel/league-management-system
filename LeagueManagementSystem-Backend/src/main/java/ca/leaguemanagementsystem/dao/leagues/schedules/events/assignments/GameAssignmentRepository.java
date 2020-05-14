package ca.leaguemanagementsystem.dao.leagues.schedules.events.assignments;

import ca.leaguemanagementsystem.model.leagues.schedules.events.Game;
import ca.leaguemanagementsystem.model.leagues.schedules.events.assignments.GameAssignment;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GameAssignmentRepository extends CrudRepository<GameAssignment, Long> {
    GameAssignment findByGameAssignmentId(Long gameAssignmentId);
    List<GameAssignment> findByGame(Game game);
}
