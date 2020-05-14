package ca.leaguemanagementsystem.dao.leagues.schedules;

import ca.leaguemanagementsystem.model.leagues.schedules.Award;
import ca.leaguemanagementsystem.model.leagues.schedules.Season;
import ca.leaguemanagementsystem.model.users.Player;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AwardRepository extends CrudRepository<Award, Long> {
    Award findByAwardId(Long awardId);
    List<Award> findByPlayer(Player player);
    List<Award> findBySeason(Season season);
}
