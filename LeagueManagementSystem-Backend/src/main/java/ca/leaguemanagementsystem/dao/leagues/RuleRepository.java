package ca.leaguemanagementsystem.dao.leagues;

import ca.leaguemanagementsystem.model.leagues.Rule;
import org.springframework.data.repository.CrudRepository;

public interface RuleRepository extends CrudRepository<Rule, long> {
}
