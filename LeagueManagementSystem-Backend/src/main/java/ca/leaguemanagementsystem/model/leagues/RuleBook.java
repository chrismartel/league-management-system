package ca.leaguemanagementsystem.model.leagues;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ruleBook")
public class RuleBook {

    /* associations */

    @OneToOne
    private League league;

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }

    @OneToMany(
            mappedBy = "ruleBook",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Rule> rules;

    public List<Rule> getRules() {
        return rules;
    }

    public void setRules(List<Rule> rules) {
        this.rules = rules;
    }
}
