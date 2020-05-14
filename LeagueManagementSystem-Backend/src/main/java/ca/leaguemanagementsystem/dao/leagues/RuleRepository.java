package ca.leaguemanagementsystem.dao.leagues;

import ca.leaguemanagementsystem.model.leagues.Rule;
import ca.leaguemanagementsystem.model.leagues.RuleBook;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RuleRepository extends CrudRepository<Rule, Long> {
    Rule findByRuleId(Long ruleId);
    List<Rule> findByRuleBook(RuleBook ruleBook);
}
