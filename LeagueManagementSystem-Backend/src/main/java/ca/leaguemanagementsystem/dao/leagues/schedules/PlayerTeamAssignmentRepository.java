package ca.leaguemanagementsystem.dao.leagues.schedules;

import ca.leaguemanagementsystem.model.leagues.schedules.PlayerTeamAssignment;
import ca.leaguemanagementsystem.model.leagues.schedules.Team;
import ca.leaguemanagementsystem.model.users.Player;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PlayerTeamAssignmentRepository extends CrudRepository<PlayerTeamAssignment, Long> {
    PlayerTeamAssignment findByPlayerTeamAssignmentId(Long playerTeamAssignmentId);
    List<PlayerTeamAssignment> findByPlayer(Player player);
    List<PlayerTeamAssignment> findByTeam(Team team);
}
