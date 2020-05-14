package ca.leaguemanagementsystem.dao.leagues.schedules.events;

import ca.leaguemanagementsystem.model.leagues.Location;
import ca.leaguemanagementsystem.model.leagues.schedules.Schedule;
import ca.leaguemanagementsystem.model.leagues.schedules.events.Event;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EventRepository extends CrudRepository<Event,Long> {
    Event findByEventId(Long eventId);
    List<Event> findByLocation(Location location);
    List<Event> findBySchedule(Schedule schedule);

}
