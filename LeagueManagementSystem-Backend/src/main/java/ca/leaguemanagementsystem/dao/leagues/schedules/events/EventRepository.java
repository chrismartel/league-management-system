package ca.leaguemanagementsystem.dao.leagues.schedules.events;

import ca.leaguemanagementsystem.model.leagues.schedules.events.Event;
import org.springframework.data.repository.CrudRepository;

public interface EventRepository extends CrudRepository<Event,long> {
}
