package ca.leaguemanagementsystem.dao.leagues;

import ca.leaguemanagementsystem.model.leagues.Membership;
import org.springframework.data.repository.CrudRepository;

public interface MembershipRepository extends CrudRepository<Membership, long> {
}
