package ca.leaguemanagementsystem.dao.leagues.requests;

import ca.leaguemanagementsystem.model.leagues.League;
import ca.leaguemanagementsystem.model.leagues.requests.Request;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RequestRepository extends CrudRepository<Request, Long> {
    Request findByRequestId(Long requestId);
    List<Request> findByLeague(League league);
}
