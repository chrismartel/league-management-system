package ca.leaguemanagementsystem.dao.leagues.requests;

import ca.leaguemanagementsystem.model.leagues.requests.Request;
import org.springframework.data.repository.CrudRepository;

public interface RequestRepository extends CrudRepository<Request, long> {
}
