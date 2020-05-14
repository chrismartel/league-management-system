package ca.leaguemanagementsystem.dao.leagues.schedules.events;

import ca.leaguemanagementsystem.model.leagues.schedules.events.Attendance;
import ca.leaguemanagementsystem.model.leagues.schedules.events.Event;
import ca.leaguemanagementsystem.model.users.Player;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AttendanceRepository extends CrudRepository<Attendance, Long> {
    Attendance findByAttendanceId(Long attendanceId);
    List<Attendance> findByPlayer(Player player);
    List<Attendance> findByEvent(Event event);
}
