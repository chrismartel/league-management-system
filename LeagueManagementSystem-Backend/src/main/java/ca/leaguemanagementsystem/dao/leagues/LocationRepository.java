package ca.leaguemanagementsystem.dao.leagues;

import ca.leaguemanagementsystem.model.leagues.Location;
import org.springframework.data.repository.CrudRepository;

public interface LocationRepository extends CrudRepository<Location, Integer> {
}
