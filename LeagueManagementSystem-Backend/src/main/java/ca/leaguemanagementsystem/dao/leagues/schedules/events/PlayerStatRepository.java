package ca.leaguemanagementsystem.dao.leagues.schedules.events;

import ca.leaguemanagementsystem.model.leagues.schedules.events.Game;
import ca.leaguemanagementsystem.model.leagues.schedules.events.PlayerStat;
import ca.leaguemanagementsystem.model.users.Player;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PlayerStatRepository extends CrudRepository<PlayerStat, Long> {
    PlayerStat findByPlayerStatId(Long playerStatId);
    List<PlayerStat> findByPlayer(Player player);
    List<PlayerStat> findByGame(Game game);
}
