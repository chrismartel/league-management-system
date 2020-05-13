package ca.leaguemanagementsystem.model.leagues;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ruleBook")
public class RuleBook {

    /* associations */


    private League league;

    @OneToOne
    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }


    private List<Rule> rules;

    @OneToMany(
            mappedBy = "ruleBook",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    public List<Rule> getRules() {
        return rules;
    }

    public void setRules(List<Rule> rules) {
        this.rules = rules;
    }


    /* attributes */


    private Long ruleBookId;

    @Id
    @GeneratedValue
    public Long getRuleBookId() {
        return ruleBookId;
    }

    public void setRuleBookId(Long ruleBookId) {
        this.ruleBookId = ruleBookId;
    }
}
