package ca.leaguemanagementsystem.dao.leagues;

import ca.leaguemanagementsystem.model.leagues.League;
import ca.leaguemanagementsystem.model.users.Manager;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LeagueRepository extends CrudRepository<League, String> {
    League findByLeagueName(String leagueName);
    boolean existsByLeagueName(String leagueName);
    List<League> findByManager(Manager manager);
}
