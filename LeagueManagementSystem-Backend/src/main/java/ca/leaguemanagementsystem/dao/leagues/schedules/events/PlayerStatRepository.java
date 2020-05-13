package ca.leaguemanagementsystem.dao.leagues.schedules.events;

import ca.leaguemanagementsystem.model.leagues.schedules.events.PlayerStat;
import org.springframework.data.repository.CrudRepository;

public interface PlayerStatRepository extends CrudRepository<PlayerStat, Long> {
}
