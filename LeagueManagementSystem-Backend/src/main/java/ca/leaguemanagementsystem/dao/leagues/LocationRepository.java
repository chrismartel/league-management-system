package ca.leaguemanagementsystem.dao.leagues;

import ca.leaguemanagementsystem.model.leagues.League;
import ca.leaguemanagementsystem.model.leagues.Location;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LocationRepository extends CrudRepository<Location, Long> {
    Location findByLocationId(Long locationId);
    List<Location> findByLeague(League league);
}
