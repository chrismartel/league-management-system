package ca.leaguemanagementsystem.dao.leagues.schedules;

import ca.leaguemanagementsystem.model.leagues.League;
import ca.leaguemanagementsystem.model.leagues.schedules.Schedule;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ScheduleRepository extends CrudRepository<Schedule, Long> {
    Schedule findByScheduleId(Long scheduleId);
    List<Schedule> findByLeague(League league);
}
