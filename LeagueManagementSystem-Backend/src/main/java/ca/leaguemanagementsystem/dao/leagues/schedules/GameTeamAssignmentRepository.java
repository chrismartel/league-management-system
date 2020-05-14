package ca.leaguemanagementsystem.dao.leagues.schedules;

import ca.leaguemanagementsystem.model.leagues.schedules.GameTeamAssignment;
import ca.leaguemanagementsystem.model.leagues.schedules.Team;
import ca.leaguemanagementsystem.model.leagues.schedules.events.Game;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GameTeamAssignmentRepository extends CrudRepository<GameTeamAssignment,Long> {
    GameTeamAssignment findByGameTeamAssignmentId(Long gameTeamAssignmentId);
    List<GameTeamAssignment> findByGame(Game game);
    List<GameTeamAssignment> findByTeam(Team team);
}
