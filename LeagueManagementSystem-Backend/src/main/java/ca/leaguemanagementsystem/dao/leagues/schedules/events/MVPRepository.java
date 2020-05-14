package ca.leaguemanagementsystem.dao.leagues.schedules.events;

import ca.leaguemanagementsystem.model.leagues.schedules.events.MVP;
import ca.leaguemanagementsystem.model.users.Player;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MVPRepository extends CrudRepository<MVP, Long> {
    MVP findByMvpId(Long mvpId);
    List<MVP> findByPlayer(Player player);
}
