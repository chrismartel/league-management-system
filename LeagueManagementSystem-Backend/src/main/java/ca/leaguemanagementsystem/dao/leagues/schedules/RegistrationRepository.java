package ca.leaguemanagementsystem.dao.leagues.schedules;

import ca.leaguemanagementsystem.model.leagues.Membership;
import ca.leaguemanagementsystem.model.leagues.schedules.Registration;
import ca.leaguemanagementsystem.model.leagues.schedules.Schedule;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RegistrationRepository extends CrudRepository<Registration, Long> {
    Registration findByRegistrationId(Long registrationId);
    List<Registration> findBySchedule(Schedule schedule);
    List<Registration> findByMembership(Membership membership);
}
