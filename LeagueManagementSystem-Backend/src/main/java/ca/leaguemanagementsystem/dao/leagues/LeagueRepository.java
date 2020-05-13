package ca.leaguemanagementsystem.dao.leagues;

import ca.leaguemanagementsystem.model.leagues.League;
import org.springframework.data.repository.CrudRepository;

public interface LeagueRepository extends CrudRepository<League, String> {
}
