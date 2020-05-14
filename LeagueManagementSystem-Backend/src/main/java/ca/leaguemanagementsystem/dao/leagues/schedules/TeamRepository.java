package ca.leaguemanagementsystem.dao.leagues.schedules;

import ca.leaguemanagementsystem.model.leagues.schedules.Season;
import ca.leaguemanagementsystem.model.leagues.schedules.Team;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TeamRepository extends CrudRepository<Team, Long> {
    Team findByTeamId(Long teamId);
    List<Team> findBySeason(Season season);
}
